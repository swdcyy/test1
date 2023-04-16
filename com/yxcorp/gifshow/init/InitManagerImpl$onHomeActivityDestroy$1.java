package com.yxcorp.gifshow.init.InitManagerImpl$onHomeActivityDestroy$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import vsd.i;
import android.app.Activity;
import java.lang.Object;
import com.kwai.framework.init.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.p;

public final class InitManagerImpl$onHomeActivityDestroy$1 extends Lambda implements l	// class@00195b
{
    public final Activity $activity;
    public final i $f;

    public void InitManagerImpl$onHomeActivityDestroy$1(i p0,Activity p1){
       this.$f = p0;
       this.$activity = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InitManagerImpl$onHomeActivityDestroy$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       this.$f.invoke(p0, this.$activity);
       PatchProxy.onMethodExit(InitManagerImpl$onHomeActivityDestroy$1.class, "1");
       return;
    }
}
