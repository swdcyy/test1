package com.kwai.framework.network.p;
import java.lang.Runnable;
import java.lang.Object;
import ta6.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class p implements Runnable	// class@001809
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, null, p.class, "1")) {
       }else {
          Boolean fALSE = Boolean.FALSE;
          p.a("enableNewCommonParams", fALSE);
          p.a("enableInterceptorUpgrade", fALSE);
       }
       return;
    }
}
