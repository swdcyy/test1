package com.kuaishou.android.vader.persistent.a$a;
import java.lang.Runnable;
import com.kuaishou.android.vader.persistent.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import br.b;
import com.kuaishou.android.vader.persistent.LogRecordDatabase;
import java.lang.StringBuilder;
import tq.d;
import java.lang.Exception;
import android.database.sqlite.SQLiteException;
import fr.a;

public class a$a implements Runnable	// class@00071f
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       int i;
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       try{
          long l = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(15);
          a d = this.b.d;
          if (d != null) {
             i = d.E().h(l);
          label_0029 :
             if (i > 0) {
                this.b.c.b("evict_logs", "Evicting total : "+i+" logs.");
             }
          }else {
             i = 0;
             goto label_0029 ;
          }
       }catch(android.database.sqlite.SQLiteException e0){
          this.b.c.a(e0);
          String str = a.i(e0);
          this.b.c.logCustomEvent("V2_VADER_DB_ERROR", a.b(String.valueOf(3), str, e0.getMessage(), ""));
       }
       return;
    }
}
