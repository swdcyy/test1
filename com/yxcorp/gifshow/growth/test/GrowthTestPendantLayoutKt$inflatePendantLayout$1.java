package com.yxcorp.gifshow.growth.test.GrowthTestPendantLayoutKt$inflatePendantLayout$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.core.config.PendantCoreConfig;
import java.util.Objects;
import le0.a;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;

public final class GrowthTestPendantLayoutKt$inflatePendantLayout$1 extends Lambda implements a	// class@00153f
{
    public static final GrowthTestPendantLayoutKt$inflatePendantLayout$1 INSTANCE;

    static {
       GrowthTestPendantLayoutKt$inflatePendantLayout$1.INSTANCE = new GrowthTestPendantLayoutKt$inflatePendantLayout$1();
    }
    public void GrowthTestPendantLayoutKt$inflatePendantLayout$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthTestPendantLayoutKt$inflatePendantLayout$1.class, "1")) {
          return;
       }
       PendantCoreConfig i = PendantCoreConfig.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoid(objArray, i, PendantCoreConfig.class, "2")) {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          a.o(uActivity, "ActivityContext.getInstance\(\).currentActivity");
          a.b.a(uActivity);
       }
       return;
    }
}
