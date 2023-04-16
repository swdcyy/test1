package com.loc.au;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import java.lang.String;
import com.loc.aq;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteDatabase;

public final class au extends SQLiteOpenHelper	// class@001379
{
    public aq a;
    public static boolean b = true;
    public static boolean c;

    public void au(Context p0,String p1,aq p2){
       this.a = p2;
    }
    public final void onCreate(SQLiteDatabase p0){
       this.a.a(p0);
    }
    public final void onUpgrade(SQLiteDatabase p0,int p1,int p2){
    }
}
