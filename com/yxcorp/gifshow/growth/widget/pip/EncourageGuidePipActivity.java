package com.yxcorp.gifshow.growth.widget.pip.EncourageGuidePipActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.growth.widget.pip.EncourageGuidePipActivity$a;
import nsd.u;
import jra.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.res.Configuration;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.growth.widget.pip.EncourageGuidePipActivity$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Bundle;
import tkd.b;
import tkd.d;
import fp5.a;
import cra.w;
import q87.c;
import android.app.PictureInPictureParams$Builder;
import android.util.Rational;
import android.app.PictureInPictureParams;
import ekd.i;
import android.view.Window;
import jra.b;
import android.view.View$OnSystemUiVisibilityChangeListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Intent;
import jra.d;
import lnc.u1;
import m56.e;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import java.lang.StringBuilder;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle$State;
import rd5.a;
import rd5.a$a;
import io.reactivex.subjects.PublishSubject;
import qka.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.yxcorp.utility.RomUtils;
import qka.a;

public final class EncourageGuidePipActivity extends GifshowActivity	// class@0015f6
{
    public final f y;
    public PresenterV2 z;
    public static final EncourageGuidePipActivity$a A;

    static {
       EncourageGuidePipActivity.A = new EncourageGuidePipActivity$a(null);
    }
    public void EncourageGuidePipActivity(){
       super();
       this.y = new f();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, EncourageGuidePipActivity.class, "9")) {
          return;
       }
       this.u3();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, EncourageGuidePipActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onConfigurationChanged(Configuration p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, EncourageGuidePipActivity.class, "5")) {
          return;
       }
       a.p(p0, "newConfig");
       super.onConfigurationChanged(p0);
       if (p0.orientation == 2 && (Build$VERSION.SDK_INT >= 24 && !this.isInPictureInPictureMode())) {
          view = this.findViewById(R.id.kwai_player_kit_view);
          if (view != null) {
             view.getViewTreeObserver().addOnGlobalLayoutListener(new EncourageGuidePipActivity$b(view, n.t(this), this));
          }
       }else {
          view = this.findViewById(R.id.pip_close_img);
          if (view != null) {
             view.setVisibility(8);
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       Object[] objArray;
       EncourageGuidePipActivity uEncourageGu = EncourageGuidePipActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uEncourageGu, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.isFinishing()) {
          return;
       }
       int i = 0;
       if (d.a(0x31a55ac8).s0(this)) {
          objArray = new Object[i];
          w.C().t("EncourageGuidePipActivity", "onCreate isSmallWindowMode ", objArray);
          this.u3();
          return;
       }else {
          PictureInPictureParams pictureInPic = new PictureInPictureParams$Builder().setAspectRatio(new Rational(1920, 1080)).build();
          this.setPictureInPictureParams(pictureInPic);
          this.enterPictureInPictureMode(pictureInPic);
          i.h(this, i, i);
          int i1 = 2;
          if (!PatchProxy.applyVoid(null, this, uEncourageGu, "3")) {
             Window window = this.getWindow();
             a.o(window, "window");
             View decorView = window.getDecorView();
             a.o(decorView, "window.decorView");
             decorView.setSystemUiVisibility(i1);
             window = this.getWindow();
             a.o(window, "window");
             window.getDecorView().setOnSystemUiVisibilityChangeListener(new b(this));
          }
          this.setContentView(R.layout.arg_RES_7f0d002c);
          PresenterV2 presenterV2 = new PresenterV2();
          this.z = presenterV2;
          Intent intent = this.getIntent();
          if (intent != null) {
             String stringExtra = intent.getStringExtra("");
             if (stringExtra != null) {
                a.o(stringExtra, "it");
                presenterV2.U7(new d(stringExtra));
             }
          }
          presenterV2.f(this.findViewById(R.id.texture_view_frame));
          objArray = new Object[i1];
          objArray[i] = presenterV2;
          objArray[1] = this.y;
          presenterV2.i(objArray);
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, EncourageGuidePipActivity.class, "12")) {
          return;
       }
       super.onDestroy();
       EncourageGuidePipActivity tz = this.z;
       if (tz != null) {
          tz.destroy();
       }
       u1.b(this);
       return;
    }
    public final void onMainThreadEvent(e p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, EncourageGuidePipActivity.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       w.C().s("EncourageGuidePipActivity", "OnActivityResumeEvent  mHasEnterPipMode=", objArray);
       p0 = (p0 != null)? p0.a: 0;
       if (!p0 instanceof EncourageGuidePipActivity) {
          this.u3();
       }
       return;
    }
    public void onPictureInPictureModeChanged(boolean p0){
       EncourageGuidePipActivity uEncourageGu = EncourageGuidePipActivity.class;
       if (PatchProxy.isSupport(uEncourageGu) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uEncourageGu, "4")) {
          return;
       }
       super.onPictureInPictureModeChanged(p0);
       Lifecycle lifecycle = this.getLifecycle();
       a.o(lifecycle, "lifecycle");
       Object[] objArray = new Object[0];
       w.C().s("EncourageGuidePipActivity", "onPictureInPictureModeChanged: "+p0+", state "+lifecycle.getCurrentState(), objArray);
       a.c.d(this, p0);
       this.y.a().onNext(Boolean.valueOf(p0));
       if (p0) {
          Lifecycle lifecycle1 = this.getLifecycle();
          a.o(lifecycle1, "lifecycle");
          if (lifecycle1.getCurrentState().isAtLeast(Lifecycle$State.CREATED)) {
             u1.a(this);
             Intent intent = new Intent("android.intent.action.MAIN");
             intent.addCategory("android.intent.category.HOME");
             this.startActivity(intent);
             this.getWindow().setBackgroundDrawableResource(R.color.arg_RES_7f0600a6);
          }
       }
       if (!p0) {
          Lifecycle lifecycle2 = this.getLifecycle();
          a.o(lifecycle2, "lifecycle");
          if (lifecycle2.getCurrentState().isAtLeast(Lifecycle$State.CREATED)) {
             this.setRequestedOrientation(0);
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, EncourageGuidePipActivity.class, "2")) {
          return;
       }
       super.onResume();
       b.a(this.getWindow());
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, EncourageGuidePipActivity.class, "6")) {
          return;
       }
       super.onStop();
       if (Build$VERSION.SDK_INT >= 24) {
          this.u3();
       }
       return;
    }
    public void onUserLeaveHint(){
       if (PatchProxy.applyVoid(null, this, EncourageGuidePipActivity.class, "10")) {
          return;
       }
       super.onUserLeaveHint();
       Object[] objArray = new Object[0];
       w.C().s("EncourageGuidePipActivity", "onUserLeaveHint mHasEnterPipMode", objArray);
       this.u3();
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       EncourageGuidePipActivity uEncourageGu = EncourageGuidePipActivity.class;
       if (PatchProxy.isSupport(uEncourageGu) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uEncourageGu, "8")) {
          return;
       }
       super.onWindowFocusChanged(p0);
       if (p0) {
          b.a(this.getWindow());
       }
       return;
    }
    public final void u3(){
       if (PatchProxy.applyVoid(null, this, EncourageGuidePipActivity.class, "7")) {
          return;
       }
       if (this.isFinishing()) {
          return;
       }
       this.finishAndRemoveTask();
       this.finishAffinity();
       this.overridePendingTransition(0, 0);
       if (RomUtils.n() && (a.a() && Build$VERSION.SDK_INT < 28)) {
          b.b(this.getWindow());
       }
    label_0036 :
       return;
    }
}
