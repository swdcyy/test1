package c.t.m.g.cb$1;
import java.lang.Runnable;
import java.lang.Object;
import android.content.SharedPreferences;
import c.t.m.g.ca;
import android.content.Context;
import c.t.m.g.be;
import java.lang.System;
import java.lang.Long;
import java.lang.String;
import c.t.m.g.cb;
import android.content.ContentResolver;
import android.provider.Settings$System;
import android.os.Build;
import android.os.Build$VERSION;
import c.t.m.g.by;

public final class cb$1 implements Runnable	// class@000c02
{

    public void cb$1(){
       super();
    }
    public void run(){
       SharedPreferences sharedPrefer = ca.a();
       long l = System.currentTimeMillis();
       ca.a(sharedPrefer, "loc_id_update_time", Long.valueOf(l));
       cb.a(l);
       String str = Settings$System.getString(be.a().getContentResolver(), "android_id");
       ca.a(sharedPrefer, "loc_id_androidId", str);
       cb.c(str);
       str = Build.MODEL;
       ca.a(sharedPrefer, "loc_build_model", str);
       cb.d(str);
       str = "";
       if (cb.k()) {
       }else if(Build$VERSION.SDK_INT >= 26){
          str = Build.getSerial();
       }else {
          str = Build.SERIAL;
       }
       if (!by.a(str)) {
          ca.a(sharedPrefer, "loc_id_sn", str);
          cb.e(str);
       }
       return;
    }
}
