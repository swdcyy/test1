package com.kwai.sdk.switchconfig.v1.internal.c;
import lo7.e;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;

public final class c implements e	// class@000f31
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final SharedPreferences a(Context p0,String p1,int p2){
       return p0.getSharedPreferences(p1, p2);
    }
}
