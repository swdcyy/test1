package com.yxcorp.gifshow.init.InitManagerImpl$onForegroundEventMainThread$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.framework.init.a;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class InitManagerImpl$onForegroundEventMainThread$1 extends FunctionReferenceImpl implements l	// class@001958
{
    public static final InitManagerImpl$onForegroundEventMainThread$1 INSTANCE;

    static {
       InitManagerImpl$onForegroundEventMainThread$1.INSTANCE = new InitManagerImpl$onForegroundEventMainThread$1();
    }
    public void InitManagerImpl$onForegroundEventMainThread$1(){
       super(1, a.class, "onForeground", "onForeground\(\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InitManagerImpl$onForegroundEventMainThread$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       p0.i0();
       PatchProxy.onMethodExit(InitManagerImpl$onForegroundEventMainThread$1.class, "1");
       return;
    }
}
