package meklit.apostolic.apostolicamlko;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Menasi on 9/29/2017.
 */

public class DbHandler extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "amlko.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_WORSHIP = "worship";

    private static final String WORSHIP_ID = "_id";
    private static final String WORSHIP_TITLE = "worship_title";
    private static final String WORSHIP_TRANSPOSE = "worship_transpose";
    private static final String WORSHIP_KEY = "worship_key";
    private static final String WORSHIP_TEMPO = "worship_tempo";
    private static final String WORSHIP_SCALE = "worship_scale";
    private static final String WORSHIP_STYLE = "worship_style";


    public DbHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query_worship = "CREATE TABLE " + TABLE_WORSHIP + "(" +

                WORSHIP_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
                +WORSHIP_TITLE+ " TEXT NOT NULL, "
                + WORSHIP_TRANSPOSE + " INTEGER NOT NULL ,"
                + WORSHIP_KEY + " TEXT NOT NULL ,"
                + WORSHIP_TEMPO + " INTEGER  NOT NULL ,"
                + WORSHIP_SCALE + " TEXT NOT NULL ,"
                + WORSHIP_STYLE + " TEXT NOT NULL "
                + ");";
        db.execSQL(query_worship);

        ContentValues ALL_Worship = new ContentValues();
        for (int i = 0; i < Worship.worships.length; i++) {
            ALL_Worship.put(WORSHIP_KEY, Worship.worships[i].getWORSHIP_KEY());
            ALL_Worship.put(WORSHIP_SCALE, Worship.worships[i].getWORSHIP_SCALE());
            ALL_Worship.put(WORSHIP_STYLE, Worship.worships[i].getWORSHIP_STYLE());
            ALL_Worship.put(WORSHIP_TEMPO, Worship.worships[i].getWORSHIP_TEMPO());
            ALL_Worship.put(WORSHIP_TITLE, Worship.worships[i].getWORSHIP_TITLE());
            ALL_Worship.put(WORSHIP_TRANSPOSE, Worship.worships[i].getWORSHIP_TRANSPOSE());
            db.insert(TABLE_WORSHIP, null, ALL_Worship);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public ArrayList<Worship> GetAllWorship(String Scale,String Style)
    {
        ArrayList<Worship> ret = new ArrayList();
        SQLiteDatabase db = getWritableDatabase();

        int WORSHIP_ID;
        String WORSHIP_TITLE;
        int WORSHIP_TRANSPOSE;
        String WORSHIP_KEY;
        int WORSHIP_TEMPO;
        String WORSHIP_SCALE;
        String WORSHIP_STYLE;

        String[] col = {DbHandler.WORSHIP_ID,DbHandler.WORSHIP_TITLE,DbHandler.WORSHIP_TRANSPOSE,DbHandler.WORSHIP_KEY
                        ,DbHandler.WORSHIP_TEMPO,DbHandler.WORSHIP_SCALE,DbHandler.WORSHIP_STYLE};
        Cursor cur = db.query(true, DbHandler.TABLE_WORSHIP, col, DbHandler.WORSHIP_SCALE + "= '" +
                Scale + "' AND "+DbHandler.WORSHIP_STYLE + "= '" + Style + "'",
                null, null, null, null, null);
        while (cur.moveToNext()) {
            WORSHIP_ID = cur.getInt(cur.getColumnIndex(DbHandler.WORSHIP_ID));
            WORSHIP_TITLE = cur.getString(cur.getColumnIndex(DbHandler.WORSHIP_TITLE));
            WORSHIP_TRANSPOSE = cur.getInt(cur.getColumnIndex(DbHandler.WORSHIP_TRANSPOSE));
            WORSHIP_KEY = cur.getString(cur.getColumnIndex(DbHandler.WORSHIP_KEY));
            WORSHIP_TEMPO = cur.getInt(cur.getColumnIndex(DbHandler.WORSHIP_TEMPO));
            WORSHIP_SCALE = cur.getString(cur.getColumnIndex(DbHandler.WORSHIP_SCALE));
            WORSHIP_STYLE = cur.getString(cur.getColumnIndex(DbHandler.WORSHIP_STYLE));
            ret.add(new Worship(WORSHIP_ID,WORSHIP_TITLE,WORSHIP_TRANSPOSE,WORSHIP_KEY,WORSHIP_TEMPO
                            ,WORSHIP_SCALE,WORSHIP_STYLE));
        }
        cur.close();
        return ret;
    }

    public Worship getWorship(int id){
        Worship ret = null ;
        SQLiteDatabase db = getWritableDatabase();

        int WORSHIP_ID;
        String WORSHIP_TITLE;
        int WORSHIP_TRANSPOSE;
        String WORSHIP_KEY;
        int WORSHIP_TEMPO;
        String WORSHIP_SCALE;
        String WORSHIP_STYLE;

        String[] col = {DbHandler.WORSHIP_ID,DbHandler.WORSHIP_TITLE,DbHandler.WORSHIP_TRANSPOSE,DbHandler.WORSHIP_KEY
                ,DbHandler.WORSHIP_TEMPO,DbHandler.WORSHIP_SCALE,DbHandler.WORSHIP_STYLE};
        Cursor cur = db.query(true, DbHandler.TABLE_WORSHIP, col, DbHandler.WORSHIP_ID + "= " +
                        id,
                null, null, null, null, null);
        while (cur.moveToNext()) {
            WORSHIP_ID = cur.getInt(cur.getColumnIndex(DbHandler.WORSHIP_ID));
            WORSHIP_TITLE = cur.getString(cur.getColumnIndex(DbHandler.WORSHIP_TITLE));
            WORSHIP_TRANSPOSE = cur.getInt(cur.getColumnIndex(DbHandler.WORSHIP_TRANSPOSE));
            WORSHIP_KEY = cur.getString(cur.getColumnIndex(DbHandler.WORSHIP_KEY));
            WORSHIP_TEMPO = cur.getInt(cur.getColumnIndex(DbHandler.WORSHIP_TEMPO));
            WORSHIP_SCALE = cur.getString(cur.getColumnIndex(DbHandler.WORSHIP_SCALE));
            WORSHIP_STYLE = cur.getString(cur.getColumnIndex(DbHandler.WORSHIP_STYLE));
            ret =new Worship(WORSHIP_ID,WORSHIP_TITLE,WORSHIP_TRANSPOSE,WORSHIP_KEY,WORSHIP_TEMPO
                    ,WORSHIP_SCALE,WORSHIP_STYLE);
        }
        cur.close();
        return ret;
    }
}
