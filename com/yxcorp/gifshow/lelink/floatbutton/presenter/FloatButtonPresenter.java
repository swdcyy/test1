package com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter$c;
import com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter$a;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter$mRunnable$1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager$a;
import com.yxcorp.gifshow.lelink.floatbutton.FloatWindowView;
import com.yxcorp.gifshow.lelink.floatbutton.FloatWindowView$a;
import com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter$b;
import java.util.Objects;
import o56.c;
import o56.a;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import com.yxcorp.gifshow.lelink.ScreencastManager$a;
import cgc.d;
import a0b.c;
import msd.a;
import java.lang.Runnable;
import zza.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import android.os.SystemClock;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import yza.f;

public final class FloatButtonPresenter extends PresenterV2	// class@001a48
{
    public FloatButtonPresenter$c A;
    public FloatButtonPresenter$a B;
    public AnimatorSet C;
    public long D;
    public Handler E;
    public final a F;
    public final String p;
    public final long q;
    public QPhoto r;
    public f s;
    public View t;
    public View u;
    public View v;
    public View w;
    public ImageView x;
    public TextView y;
    public boolean z;

    public void FloatButtonPresenter(){
       super();
       this.p = "FloatButton";
       this.q = 3000;
       this.A = new FloatButtonPresenter$c(this);
       this.B = new FloatButtonPresenter$a(this);
       this.E = new Handler(Looper.getMainLooper());
       this.F = new FloatButtonPresenter$mRunnable$1(this);
    }
    public static final QPhoto P8(FloatButtonPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       a a;
       if (PatchProxy.applyVoid(null, this, FloatButtonPresenter.class, "3")) {
          return;
       }
       FloatButtonManager$a i = FloatButtonManager.i;
       FloatWindowView uFloatWindow = i.a().c();
       if (uFloatWindow != null) {
          uFloatWindow.setFloatingWindowListener(this.A);
       }
       FloatButtonManager uFloatButton = i.a();
       FloatButtonPresenter$b uob = new FloatButtonPresenter$b(this);
       Objects.requireNonNull(uFloatButton);
       String str = "2";
       if (!PatchProxy.applyVoidOneRefs(uob, uFloatButton, FloatButtonManager.class, str)) {
          a.p(uob, "adapter");
          uFloatButton.e = uob;
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          uoc.a().registerActivityLifecycleCallbacks(uFloatButton.e);
       }
       ScreencastManager.A.a().v(this.B);
       FloatButtonPresenter tE = this.E;
       FloatButtonPresenter tF = this.F;
       if (tF != null) {
          tF = new c(tF);
       }
       tE.postDelayed(tF, this.q);
       a = a.a;
       tF = this.r;
       if (tF == null) {
          a.S("mPhoto");
       }
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(tF, a, a.class, str)) {
          a.p(tF, "photo");
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SCREEN_PROJECTION_FLOAT_BTN";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(tF.getEntity());
          showEvent.elementPackage = uElementPack;
          showEvent.contentPackage = uContentPack;
          u1.z0(a.a(tF), showEvent);
       }
       this.D = SystemClock.elapsedRealtime();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FloatButtonPresenter.class, "6")) {
          return;
       }
       FloatWindowView uFloatWindow = FloatButtonManager.i.a().c();
       if (uFloatWindow != null) {
          uFloatWindow.p = null;
       }
       this.E.removeCallbacksAndMessages(null);
       FloatButtonPresenter tC = this.C;
       if (tC != null) {
          tC.removeAllListeners();
       }
       tC = this.C;
       if (tC != null) {
          tC.cancel();
       }
       this.C = null;
       return;
    }
    public void doBindView(View p0){
       TextView textView1;
       if (PatchProxy.applyVoidOneRefs(p0, this, FloatButtonPresenter.class, "2")) {
          return;
       }
       TextView textView = null;
       View view = (p0 != null)? p0.findViewById(R.id.float_button_layout): textView;
       this.t = view;
       view = (p0 != null)? p0.findViewById(R.id.bg_left): textView;
       this.u = view;
       view = (p0 != null)? p0.findViewById(R.id.bg_center): textView;
       this.v = view;
       view = (p0 != null)? p0.findViewById(R.id.bg_right): textView;
       this.w = view;
       ImageView imageView = (p0 != null)? p0.findViewById(R.id.float_button_image): textView;
       this.x = imageView;
       if (p0 != null) {
          textView = p0.findViewById(0x7f0a0f17);
       }
       this.y = textView;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FloatButtonPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("FloatWindowPHOTO");
       a.o(obj, "inject\(FloatButtonAccessIds.PHOTO\)");
       this.r = obj;
       obj = this.r8("FloatWindowFLOAT_BUTTON_LISTENER");
       a.o(obj, "inject\(FloatButtonAccessIds.FLOAT_BUTTON_LISTENER\)");
       this.s = obj;
       return;
    }
}
