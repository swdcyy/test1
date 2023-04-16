package com.yxcorp.utility.h;
import skd.b;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;

public final class h implements b	// class@00140f
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final SharedPreferences a(Context p0,String p1,int p2){
       return p0.getSharedPreferences(p1, p2);
    }
}
