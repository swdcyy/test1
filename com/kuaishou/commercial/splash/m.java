package com.kuaishou.commercial.splash.m;
import ok.x;
import java.lang.Object;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class m implements x	// class@0015b4
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enableSplashV3", false));
    }
}
