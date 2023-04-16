package com.kwai.framework.network.m;
import ok.x;
import java.lang.Object;
import ta6.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.SharedPreferences;

public final class m implements x	// class@0017f6
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final Object get(){
       Object obj = PatchProxy.apply(null, null, p.class, "3");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): p.b().getBoolean("enableInterceptorUpgrade", false);
       return Boolean.valueOf(b);
    }
}
