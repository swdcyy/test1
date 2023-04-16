package com.yxcorp.gifshow.init.InitManagerImpl$onBackgroundEventMainThread$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.framework.init.a;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class InitManagerImpl$onBackgroundEventMainThread$1 extends FunctionReferenceImpl implements l	// class@001957
{
    public static final InitManagerImpl$onBackgroundEventMainThread$1 INSTANCE;

    static {
       InitManagerImpl$onBackgroundEventMainThread$1.INSTANCE = new InitManagerImpl$onBackgroundEventMainThread$1();
    }
    public void InitManagerImpl$onBackgroundEventMainThread$1(){
       super(1, a.class, "onBackground", "onBackground\(\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InitManagerImpl$onBackgroundEventMainThread$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       p0.h0();
       PatchProxy.onMethodExit(InitManagerImpl$onBackgroundEventMainThread$1.class, "1");
       return;
    }
}
