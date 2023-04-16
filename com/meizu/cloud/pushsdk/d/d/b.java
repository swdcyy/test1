package com.meizu.cloud.pushsdk.d.d.b;
import android.database.sqlite.SQLiteOpenHelper;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import java.lang.StringBuilder;
import java.lang.Object;
import com.meizu.cloud.pushsdk.d.f.c;

public class b extends SQLiteOpenHelper	// class@00151a
{
    public static final String a;
    public static b b;

    static {
       b.a = b.class.getName();
    }
    public void b(Context p0,String p1){
       super(p0, p1, null, 1);
    }
    public static b a(Context p0,String p1){
       if (b.b == null) {
          b.b = new b(p0.getApplicationContext(), p1);
       }
       return b.b;
    }
    public void onCreate(SQLiteDatabase p0){
       p0.execSQL("CREATE TABLE IF NOT EXISTS \'events\' \(id INTEGER PRIMARY KEY, eventData BLOB, dateCreated TIMESTAMP DEFAULT CURRENT_TIMESTAMP\)");
    }
    public void onUpgrade(SQLiteDatabase p0,int p1,int p2){
       Object[] objArray = new Object[0];
       c.b(b.a, "Upgrading database from version "+p1+" to "+p2+". Destroying old data now..", objArray);
       p0.execSQL("DROP TABLE IF EXISTS \'events\'");
       this.onCreate(p0);
    }
}
