package com.yxcorp.experiment.b;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.experiment.ABConfigUpdateReceiver;
import com.yxcorp.experiment.c;
import android.content.SharedPreferences;
import wu8.v;
import java.lang.String;

public final class b implements Runnable	// class@0011df
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void run(){
       c uoc = c.h();
       if (!uoc.b()) {
       }else {
          uoc.j(uoc.h.b().getString("key_user_id", ""));
       }
       return;
    }
}
