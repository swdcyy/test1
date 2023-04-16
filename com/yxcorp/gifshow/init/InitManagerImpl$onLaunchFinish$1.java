package com.yxcorp.gifshow.init.InitManagerImpl$onLaunchFinish$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import vsd.i;
import b76.a;
import java.lang.Object;
import com.kwai.framework.init.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.p;

public final class InitManagerImpl$onLaunchFinish$1 extends Lambda implements l	// class@00195d
{
    public final a $e;
    public final i $f;

    public void InitManagerImpl$onLaunchFinish$1(i p0,a p1){
       this.$f = p0;
       this.$e = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InitManagerImpl$onLaunchFinish$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       this.$f.invoke(p0, this.$e);
       PatchProxy.onMethodExit(InitManagerImpl$onLaunchFinish$1.class, "1");
       return;
    }
}
