package com.yxcorp.gifshow.init.module.k;
import zf6.k$a;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.init.module.DayNightInitModule;
import km8.b;

public final class k implements k$a	// class@0019c9
{
    public static final k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public final SharedPreferences a(String p0){
       SharedPreferences sharedPrefer = (("DefaultPreferenceHelper").equals(p0))? b.b(p0): b.c(p0, 0);
       return sharedPrefer;
    }
}
