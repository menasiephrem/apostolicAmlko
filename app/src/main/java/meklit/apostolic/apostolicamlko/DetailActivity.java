package meklit.apostolic.apostolicamlko;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    public Worship worship;
    public ArrayList<Worship> worships;
    String [] strArr;
    DbHandler helper;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_actvity);

        Intent intent = getIntent();
        helper = new DbHandler(this);
        int WorshipID = intent.getIntExtra(Intent.EXTRA_TEXT, 0);


        TextView major = (TextView) findViewById(R.id.major);
        TextView bit = (TextView) findViewById(R.id.style);
        TextView tempo = (TextView) findViewById(R.id.tempo);
        TextView end = (TextView) findViewById(R.id.end);

        listView = (ListView) findViewById(R.id.suggestSame);

        worship = helper.getWorship(WorshipID);

        major.setText(worship.getWORSHIP_TRANSPOSE()+"");
        bit.setText(worship.getWORSHIP_STYLE());
        tempo.setText(worship.getWORSHIP_TEMPO()+"");
        end.setText(worship.getWORSHIP_KEY());

        getSupportActionBar().setTitle(worship.getWORSHIP_TITLE());
        getSupportActionBar().setSubtitle(worship.getWORSHIP_SCALE());

        updateListView();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(DetailActivity.this);
                dialog.setTitle(worships.get(position).getWORSHIP_TITLE());
                dialog.setMessage(
                        "\t"+"Transpose: "+ worships.get(position).getWORSHIP_TRANSPOSE()+"\n"+
                                "\t"+"Key: "+ worships.get(position).getWORSHIP_KEY()+"\n"+
                                "\t"+"Tempo: "+ worships.get(position).getWORSHIP_TEMPO()+"\n"+
                                "\t"+"Scale: "+ worships.get(position).getWORSHIP_SCALE()+"\n"+
                                "\t"+"Style: "+ worships.get(position).getWORSHIP_STYLE()
                );
                dialog.setPositiveButton("OK",null);

                dialog.create();
                dialog.show();

            }
        });
    }

    void updateListView(){

        ArrayList<Worship> validWorships = new ArrayList<>();
        worships = helper.GetAllWorship(worship.getWORSHIP_SCALE(),worship.getWORSHIP_STYLE());
        for (int i = 0; i<worships.size(); i++)
        {

            boolean transNotRange = !(Math.abs(worship.getWORSHIP_TRANSPOSE()-worships.get(i).getWORSHIP_TRANSPOSE())<3);
            boolean keyNotSame = !(worship.getWORSHIP_KEY().equalsIgnoreCase(worships.get(i).getWORSHIP_KEY()));
            boolean samId = (worship.getWORSHIP_ID()==worships.get(i).getWORSHIP_ID());
            if (!(transNotRange || keyNotSame || samId))
            {
                validWorships.add(worships.get(i));
            }
        }

        strArr = new String[validWorships.size()];
        for (int i = 0; i<strArr.length; i++)
        {
            strArr[i]=validWorships.get(i).getWORSHIP_TITLE();
        }
        worships = validWorships;
        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,
                strArr));
    }
}
