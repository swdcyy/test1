package com.kuaishou.android.security.base.logsender.db.a$a;
import android.database.sqlite.SQLiteOpenHelper;
import com.kuaishou.android.security.base.logsender.db.a;
import android.content.Context;
import java.lang.String;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Throwable;
import com.kuaishou.android.security.base.log.d;

public class a$a extends SQLiteOpenHelper	// class@000ee1
{
    public final a a;

    public void a$a(a p0,Context p1){
       this.a = p0;
       super(p1, "kwserp", null, 2);
    }
    public void onCreate(SQLiteDatabase p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       p0.execSQL("create table if not exists r\(a integer primary key autoincrement, b text, c integer, e integer,f integer,h text, g integer, i integer, j text, d long\);");
       return;
    }
    public void onUpgrade(SQLiteDatabase p0,int p1,int p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a$a.class, "2")) {
          return;
       }
       if (p1 == 1) {
          p0.execSQL("delete from r");
       }
       return;
    }
}
