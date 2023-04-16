package com.xiaomi.push.service.u$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.xiaomi.push.service.u;
import android.content.Context;
import ws8.k0;
import java.lang.System;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import ws8.h;
import android.content.SharedPreferences$Editor;
import ws8.d7;

public abstract class u$a implements Runnable	// class@001194
{
    public String b;
    public long c;

    public void u$a(String p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public abstract void a(u p0);
    public void run(){
       if (u.b() != null) {
          u e = u.b().e;
          if (!k0.r(e)) {
             return;
          }else if((System.currentTimeMillis() - u.a(u.b()).getLong(":ts-"+this.b, 0)) - this.c > 0 || h.b(e)){
             d7.a(u.a(u.b()).edit().putLong(":ts-"+this.b, System.currentTimeMillis()));
             this.a(u.b());
          }
       }
       return;
    }
}
