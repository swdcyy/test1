package com.yxcorp.gifshow.init.InitManagerImpl$onHomeActivityCreate$f$1;
import msd.q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.framework.init.HomeCreateInitModule;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class InitManagerImpl$onHomeActivityCreate$f$1 extends FunctionReferenceImpl implements q	// class@00195a
{
    public static final InitManagerImpl$onHomeActivityCreate$f$1 INSTANCE;

    static {
       InitManagerImpl$onHomeActivityCreate$f$1.INSTANCE = new InitManagerImpl$onHomeActivityCreate$f$1();
    }
    public void InitManagerImpl$onHomeActivityCreate$f$1(){
       super(3, HomeCreateInitModule.class, "onHomeActivityCreate", "onHomeActivityCreate\(Landroid/app/Activity;Landroid/os/Bundle;\)V", 0);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2);
       return l1.a;
    }
    public final void invoke(HomeCreateInitModule p0,Activity p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, InitManagerImpl$onHomeActivityCreate$f$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       p0.l0(p1, p2);
       PatchProxy.onMethodExit(InitManagerImpl$onHomeActivityCreate$f$1.class, "1");
       return;
    }
}
