package com.yxcorp.gifshow.lelink.ScreencastFloatButtonHelper;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import yza.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.lelink.ScreencastFloatButtonHelper$addFloatingVideoWindow$1;
import java.util.Objects;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import lnc.i9;
import msd.a;
import u07.t$a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.lelink.ScreencastFloatButtonHelper$checkCanDrawOverlays$1;
import u07.u;
import u07.t;
import u07.j;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager$a;
import java.util.List;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Build$VERSION;
import android.content.Intent;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.w0;
import com.yxcorp.gifshow.lelink.ScreencastFloatButtonHelper$a;
import n3d.a;

public final class ScreencastFloatButtonHelper	// class@001a28
{
    public static List a;
    public static final ScreencastFloatButtonHelper b;

    static {
       ScreencastFloatButtonHelper.b = new ScreencastFloatButtonHelper();
    }
    public void ScreencastFloatButtonHelper(){
       super();
    }
    public static final void a(QPhoto p0,f p1){
       ScreencastFloatButtonHelper screencastFl = ScreencastFloatButtonHelper.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, screencastFl, "1")) {
          return;
       }
       a.p(p0, "photo");
       a.p(p1, "listener");
       ScreencastFloatButtonHelper b = ScreencastFloatButtonHelper.b;
       ScreencastFloatButtonHelper$addFloatingVideoWindow$1 uoaddFloatin = new ScreencastFloatButtonHelper$addFloatingVideoWindow$1(p0, p1);
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(uoaddFloatin, b, screencastFl, "4")) {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (i9.a(uoc.a())) {
             uoaddFloatin.invoke();
          }else {
             ActivityContext uActivityCon = ActivityContext.g();
             a.o(uActivityCon, "ActivityContext.getInstance\(\)");
             t$a uoa = new t$a(uActivityCon.e());
             uoa.W0(R.string.arg_RES_7f104e6b);
             uoa.y0(R.string.arg_RES_7f104e6c);
             uoa.S0(R.string.arg_RES_7f103ada);
             uoa.Q0(R.string.arg_RES_7f1039c4);
             uoa.u0(new ScreencastFloatButtonHelper$checkCanDrawOverlays$1(uoaddFloatin));
             j.d(uoa);
          }
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, ScreencastFloatButtonHelper.class, "6")) {
          return;
       }
       FloatButtonManager.i.a().a();
       return;
    }
    public final List c(){
       return ScreencastFloatButtonHelper.a;
    }
    public final void d(GifshowActivity p0,a p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, ScreencastFloatButtonHelper.class, "5")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          i9.d(uActivityCon.e());
          PatchProxy.onMethodExit(ScreencastFloatButtonHelper.class, "5");
          return;
       }else {
          Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
          intent.setData(w0.f("package:"+p0.getPackageName()));
          p0.t1(intent, 1025, new ScreencastFloatButtonHelper$a(p1));
          PatchProxy.onMethodExit(ScreencastFloatButtonHelper.class, "5");
          return;
       }
    }
    public final void e(List p0){
       ScreencastFloatButtonHelper.a = p0;
    }
}
