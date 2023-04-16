package com.yxcorp.gifshow.camera.record.assistant.viewmodel.CloseDiscernDelegate$run$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import cc9.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class CloseDiscernDelegate$run$1$1 extends Lambda implements l	// class@001d26
{
    public static final CloseDiscernDelegate$run$1$1 INSTANCE;

    static {
       CloseDiscernDelegate$run$1$1.INSTANCE = new CloseDiscernDelegate$run$1$1();
    }
    public void CloseDiscernDelegate$run$1$1(){
       super(1);
    }
    public final g invoke(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CloseDiscernDelegate$run$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "oldDiscernState");
       return p0.a("", "", null, false, p0.e);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
