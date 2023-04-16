package com.yxcorp.gifshow.init.InitManagerImpl$onLaunchFinish$f$1;
import msd.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.framework.init.a;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import b76.a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class InitManagerImpl$onLaunchFinish$f$1 extends FunctionReferenceImpl implements p	// class@00195e
{
    public static final InitManagerImpl$onLaunchFinish$f$1 INSTANCE;

    static {
       InitManagerImpl$onLaunchFinish$f$1.INSTANCE = new InitManagerImpl$onLaunchFinish$f$1();
    }
    public void InitManagerImpl$onLaunchFinish$f$1(){
       super(2, a.class, "onLaunchFinish", "onLaunchFinish\(Lcom/kwai/framework/init/launchevent/LaunchFinishEvent;\)V", 0);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, InitManagerImpl$onLaunchFinish$f$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       p0.k0(p1);
       PatchProxy.onMethodExit(InitManagerImpl$onLaunchFinish$f$1.class, "1");
       return;
    }
}
