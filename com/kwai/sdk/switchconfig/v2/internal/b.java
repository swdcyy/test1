package com.kwai.sdk.switchconfig.v2.internal.b;
import oo7.e;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;

public final class b implements e	// class@001681
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final SharedPreferences a(Context p0,String p1,int p2){
       return p0.getSharedPreferences(p1, p2);
    }
}
