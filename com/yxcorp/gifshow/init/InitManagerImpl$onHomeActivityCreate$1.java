package com.yxcorp.gifshow.init.InitManagerImpl$onHomeActivityCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import vsd.i;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Object;
import com.kwai.framework.init.HomeCreateInitModule;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.q;

public final class InitManagerImpl$onHomeActivityCreate$1 extends Lambda implements l	// class@001959
{
    public final Activity $activity;
    public final i $f;
    public final Bundle $savedInstanceState;

    public void InitManagerImpl$onHomeActivityCreate$1(i p0,Activity p1,Bundle p2){
       this.$f = p0;
       this.$activity = p1;
       this.$savedInstanceState = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(HomeCreateInitModule p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InitManagerImpl$onHomeActivityCreate$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       this.$f.invoke(p0, this.$activity, this.$savedInstanceState);
       PatchProxy.onMethodExit(InitManagerImpl$onHomeActivityCreate$1.class, "1");
       return;
    }
}
