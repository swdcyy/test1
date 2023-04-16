package com.kuaishou.weapon.ks.ah$a;
import android.database.sqlite.SQLiteOpenHelper;
import com.kuaishou.weapon.ks.ah;
import android.content.Context;
import java.lang.String;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteDatabase;

public class ah$a extends SQLiteOpenHelper	// class@0011c3
{
    public final ah a;

    public void ah$a(ah p0,Context p1){
       this.a = p0;
       super(p1, "w.db", null, ah.a(p0));
    }
    public void onCreate(SQLiteDatabase p0){
       p0.execSQL(ah.b(this.a));
       p0.execSQL(ah.c(this.a));
    }
    public void onUpgrade(SQLiteDatabase p0,int p1,int p2){
       int i = 2;
       if (p1 < i && p2 >= i) {
          p0.execSQL(ah.c(this.a));
       }
    label_0010 :
       if (p1 < 3 && p2 >= 3) {
          p0.beginTransaction();
          p0.execSQL("ALTER TABLE wp ADD COLUMN pc INTEGER  DEFAULT -1");
          p0.setTransactionSuccessful();
          p0.endTransaction();
       }
       return;
    }
}
