package com.yxcorp.gifshow.lelink.ScreencastFloatButtonHelper$addFloatingVideoWindow$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.entity.QPhoto;
import yza.f;
import java.lang.Object;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.lelink.ScreencastFloatButtonHelper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager$a;
import java.util.Objects;
import com.yxcorp.gifshow.lelink.floatbutton.FloatWindowView;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import lnc.a1;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.d2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter;
import lnc.i9;
import android.view.View;
import yza.a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import java.lang.Exception;

public final class ScreencastFloatButtonHelper$addFloatingVideoWindow$1 extends Lambda implements a	// class@001a25
{
    public final f $listener;
    public final QPhoto $photo;

    public void ScreencastFloatButtonHelper$addFloatingVideoWindow$1(QPhoto p0,f p1){
       this.$photo = p0;
       this.$listener = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       ActivityContext obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ScreencastFloatButtonHelper screencastFl = ScreencastFloatButtonHelper.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, ScreencastFloatButtonHelper$addFloatingVideoWindow$1.class, "1")) {
          return;
       }
       FloatButtonManager$a i = FloatButtonManager.i;
       FloatButtonManager uFloatButton = i.a();
       ScreencastFloatButtonHelper$addFloatingVideoWindow$1 $photo = obj.$photo;
       ScreencastFloatButtonHelper b = ScreencastFloatButtonHelper.b;
       Objects.requireNonNull(b);
       FloatWindowView uFloatWindow = PatchProxy.apply(objArray, b, screencastFl, "2");
       if (uFloatWindow != patchProxyRe) {
       }else {
          c uoc1 = a.a();
          a.o(uoc1, "AppEnv.get\(\)");
          Application uApplication = uoc1.a();
          uoc1 = a.a();
          a.o(uoc1, "AppEnv.get\(\)");
          FloatWindowView uFloatWindow1 = new FloatWindowView(uApplication, 0x7f0d08df, a1.e(0x42fc0000), a1.e(56.00f), 0, ((d2.e() - a1.e(160.00f)) - n.A(uoc1.a())));
       }
       Object obj1 = uFloatWindow;
       Objects.requireNonNull(b);
       String str = "3";
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, b, screencastFl, str);
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new FloatButtonPresenter());
          PatchProxy.onMethodExit(screencastFl, str);
       }
       ScreencastFloatButtonHelper$addFloatingVideoWindow$1 $listener = obj.$listener;
       Objects.requireNonNull(uFloatButton);
       obj = obj1;
       if (!PatchProxy.applyVoidFourRefsWithListener($photo, obj1, presenterV2, $listener, uFloatButton, FloatButtonManager.class, "1")) {
          a.p($photo, "photo");
          a.p(obj, "floatView");
          a.p(presenterV2, "presenter");
          a.p($listener, "floatButtonListener");
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (i9.a(uoc.a())) {
             if (uFloatButton.b != null) {
                uFloatButton.a();
             }
             boolean b1 = true;
             uFloatButton.b = b1;
             uFloatButton.a = $photo;
             uFloatButton.f = obj;
             uFloatButton.g = presenterV2;
             if (presenterV2 != null) {
                presenterV2.f(obj);
             }
             FloatButtonManager g = uFloatButton.g;
             if (g != null) {
                objArray = new Object[b1];
                objArray[0] = new a($photo, $listener);
                g.i(objArray);
             }
             ActivityContext.i(uFloatButton.d);
             PatchProxy.onMethodExit(FloatButtonManager.class, "1");
          }else {
             PatchProxy.onMethodExit(FloatButtonManager.class, "1");
             throw new Exception("don\'t have floatwindow permission!!!");
          }
       }
       obj = ActivityContext.g();
       a.o(obj, "ActivityContext.getInstance\(\)");
       if (obj.h()) {
          i.a().show();
       }else {
          i.a().hide();
       }
       return;
    }
}
