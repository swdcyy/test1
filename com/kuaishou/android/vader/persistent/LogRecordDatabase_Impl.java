package com.kuaishou.android.vader.persistent.LogRecordDatabase_Impl;
import com.kuaishou.android.vader.persistent.LogRecordDatabase;
import br.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import br.c;
import androidx.room.RoomDatabase;
import a3.c;
import a3.b;
import android.database.Cursor;
import androidx.room.w;
import androidx.room.t;
import androidx.room.d0;
import com.kuaishou.android.vader.persistent.LogRecordDatabase_Impl$a;
import androidx.room.d0$a;
import android.content.Context;
import a3.c$b$a;
import a3.c$b;
import a3.c$a;
import a3.c$c;

public class LogRecordDatabase_Impl extends LogRecordDatabase	// class@00071e
{
    public b o;

    public void LogRecordDatabase_Impl(){
       super();
    }
    public b E(){
       Object obj = PatchProxy.apply(null, this, LogRecordDatabase_Impl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.o != null) {
          return this.o;
       }
       _monitor_enter(this);
       if (this.o == null) {
          this.o = new c(this);
       }
       _monitor_exit(this);
       return this.o;
    }
    public void f(){
       String str = "PRAGMA wal_checkpoint\(FULL\)";
       if (PatchProxy.applyVoid(null, this, LogRecordDatabase_Impl.class, "3")) {
          return;
       }
       this.c();
       b uob = this.n().e0();
       this.e();
       uob.execSQL("DELETE FROM `LogRecord`");
       this.C();
       this.k();
       uob.G(str).close();
       if (!uob.inTransaction()) {
          uob.execSQL("VACUUM");
       }
       return;
    }
    public w i(){
       Object obj = PatchProxy.apply(null, this, LogRecordDatabase_Impl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String[] stringArray = new String[]{"LogRecord"};
       return new w(this, stringArray);
    }
    public c j(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LogRecordDatabase_Impl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c$b$a uob$a = c$b.a(p0.b);
       uob$a.c(p0.c);
       uob$a.b(new d0(p0, new LogRecordDatabase_Impl$a(this, 2), "4c09005c4b7b5d256c98a4fefa210334", "ab5474acd7f7f823222d16619d5fab2c"));
       return p0.a.a(uob$a.a());
    }
}
