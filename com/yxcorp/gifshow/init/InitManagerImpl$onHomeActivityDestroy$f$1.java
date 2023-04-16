package com.yxcorp.gifshow.init.InitManagerImpl$onHomeActivityDestroy$f$1;
import msd.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.framework.init.a;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import android.app.Activity;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class InitManagerImpl$onHomeActivityDestroy$f$1 extends FunctionReferenceImpl implements p	// class@00195c
{
    public static final InitManagerImpl$onHomeActivityDestroy$f$1 INSTANCE;

    static {
       InitManagerImpl$onHomeActivityDestroy$f$1.INSTANCE = new InitManagerImpl$onHomeActivityDestroy$f$1();
    }
    public void InitManagerImpl$onHomeActivityDestroy$f$1(){
       super(2, a.class, "onHomeActivityDestroy", "onHomeActivityDestroy\(Landroid/app/Activity;\)V", 0);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(a p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, InitManagerImpl$onHomeActivityDestroy$f$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       p0.j0(p1);
       PatchProxy.onMethodExit(InitManagerImpl$onHomeActivityDestroy$f$1.class, "1");
       return;
    }
}
