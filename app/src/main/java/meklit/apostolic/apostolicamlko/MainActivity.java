package meklit.apostolic.apostolicamlko;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String style,scale;
    RadioButton aSwitch;
    ArrayList<Worship> worships;
    DbHandler helper;
    String [] strArr;

    private static final String DISCO = "Disco";
    private static final String WALTZ = "Waltz";
    private static final String WELLO = "Welo";
    private static final String SLOWROCK = "Slow Rock";
    private static final String REGGAE = "Reggae";
    private static final String MAJOR = "major";
    private static final String MINOR = "minor";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new DbHandler(getApplicationContext());
        helper.getReadableDatabase();

        listView = (ListView) findViewById(R.id.MainList);
        aSwitch = (RadioButton)findViewById(R.id.scale);


        style = SLOWROCK;
        scale = MAJOR;
        updateListView();
        aSwitch.setChecked(false);

        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (scale.equalsIgnoreCase(MINOR))
                {
                    scale = MAJOR;
                    aSwitch.setChecked(false);
                    updateListView();

                }
                else {
                    scale = MINOR;
                    aSwitch.setChecked(true);
                    updateListView();

                }
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle(worships.get(position).getWORSHIP_TITLE());
                dialog.setMessage(
                                "\t"+"Transpose: "+ worships.get(position).getWORSHIP_TRANSPOSE()+"\n"+
                                "\t"+"Key: "+ worships.get(position).getWORSHIP_KEY()+"\n"+
                                "\t"+"Tempo: "+ worships.get(position).getWORSHIP_TEMPO()+"\n"+
                                "\t"+"Scale: "+ worships.get(position).getWORSHIP_SCALE()+"\n"+
                                "\t"+"Style: "+ worships.get(position).getWORSHIP_STYLE()
                        );
                dialog.setPositiveButton("OK",null);
                dialog.setNegativeButton("More", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent detailActivity = new Intent(MainActivity.this,DetailActivity.class);
                        detailActivity.putExtra(Intent.EXTRA_TEXT,worships.get(position).getWORSHIP_ID());
                        startActivity(detailActivity);
                    }
                });
                dialog.create();
                dialog.show();


            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.Disco)
        {
            style = DISCO;
            updateListView();
            return true;
        }
        else if (id==R.id.Waltz)
        {
            style = WALTZ;
            updateListView();
            return true;
        } else if (id==R.id.SlowRock)
        {
            style = SLOWROCK;
            updateListView();
            return true;
        }
        else if (id==R.id.Wello)
        {
            style = WELLO;
            updateListView();
            return true;
        } else if (id==R.id.Reggae)
        {
            style = REGGAE;
            updateListView();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    void updateListView(){


        worships = helper.GetAllWorship(scale,style);
        strArr = new String[worships.size()];
        for (int i = 0; i<strArr.length; i++)
        {
            strArr[i]=worships.get(i).getWORSHIP_TITLE();
        }

        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,
                strArr));
        getSupportActionBar().setTitle(style+" "+scale);
    }
}
