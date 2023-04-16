package com.yxcorp.gifshow.lelink.ScreencastFloatButtonHelper$checkCanDrawOverlays$1;
import u07.u;
import msd.a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.lelink.ScreencastFloatButtonHelper;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.lelink.ScreencastFloatButtonHelper$checkCanDrawOverlays$1$1;

public final class ScreencastFloatButtonHelper$checkCanDrawOverlays$1 implements u	// class@001a27
{
    public final a b;

    public void ScreencastFloatButtonHelper$checkCanDrawOverlays$1(a p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ScreencastFloatButtonHelper$checkCanDrawOverlays$1.class, "1")) {
          return;
       }
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       ScreencastFloatButtonHelper.b.d(uActivity, new ScreencastFloatButtonHelper$checkCanDrawOverlays$1$1(this));
       return;
    }
}
