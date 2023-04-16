package com.yxcorp.gifshow.camera.record.assistant.viewmodel.StartDiscernDelegate$run$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import cc9.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lnc.a1;

public final class StartDiscernDelegate$run$1$1 extends Lambda implements l	// class@001d27
{
    public static final StartDiscernDelegate$run$1$1 INSTANCE;

    static {
       StartDiscernDelegate$run$1$1.INSTANCE = new StartDiscernDelegate$run$1$1();
    }
    public void StartDiscernDelegate$run$1$1(){
       super(1);
    }
    public final g invoke(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StartDiscernDelegate$run$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "oldDiscernState");
       return p0.a("", "", a1.p(0x7f1041ea), false, "");
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
