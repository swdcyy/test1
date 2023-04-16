package com.yxcorp.gifshow.push.b;
import erd.g;
import java.lang.Object;
import njd.a;
import i6c.k;
import i6c.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;

public final class b implements g	// class@001619
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       p0 = a.a.edit();
       p0.putBoolean("local_push_first_play", true);
       g.a(p0);
    }
}
