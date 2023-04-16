package com.kuaishou.kds.animate.KdsAnimatedModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.kds.animate.core.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.Map;
import yh0.b;
import yh0.a;
import vh0.a;
import com.kuaishou.kds.animate.core.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.robust.PatchProxyResult;
import vh0.k;
import vh0.l;
import java.util.List;
import android.animation.Animator;
import android.view.View;
import vh0.h;
import android.view.View$OnAttachStateChangeListener;
import vh0.i;
import android.animation.Animator$AnimatorListener;
import vh0.j;
import android.animation.Animator$AnimatorPauseListener;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import vh0.c;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import vh0.d;
import com.facebook.react.bridge.BaseJavaModule;
import vh0.e;
import uh0.a;

public class KdsAnimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener	// class@000799
{
    public a mKdsAnimatedManager;

    public void KdsAnimatedModule(ReactApplicationContext p0){
       super(p0);
       p0.addLifecycleEventListener(this);
    }
    public static void a(KdsAnimatedModule p0,ReadableMap p1){
       p0.lambda$startAnimation$0(p1);
    }
    private void lambda$startAnimation$0(ReadableMap p0){
       KdsAnimatedModule tmKdsAnimate = this.mKdsAnimatedManager;
       if (tmKdsAnimate != null) {
          Objects.requireNonNull(tmKdsAnimate);
          a uoa = a.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tmKdsAnimate, uoa, "2")) {
             a.a("传入的动画参数是："+b.c(p0));
             a uoa1 = new a();
             uoa1.d = tmKdsAnimate.b;
             uoa1.e = p0;
             uoa1.b = p0.getInt("viewTag");
             uoa1.a = p0.getInt("type");
             String str = p0.getString("animationId");
             b uob = tmKdsAnimate.d.get(str);
             if (uob != null) {
                if (uob.d()) {
                   tmKdsAnimate.b(str);
                }else if(uob.e()){
                }
             }else if(!TextUtils.isEmpty(str)){
                uoa1.c = str;
                String str1 = "1";
                k ok = PatchProxy.applyOneRefs(uoa1, tmKdsAnimate, uoa, str1);
                if (ok != PatchProxyResult.class) {
                }else if(uoa1.a == null){
                   ok = new k(uoa1);
                }else {
                   ok = new l(uoa1);
                }
                if (ok == null) {
                   a.a("KdsAnimator is null");
                }else {
                   tmKdsAnimate.d.put(str, ok);
                   if (!PatchProxy.applyVoidOneRefs(tmKdsAnimate, ok, b.class, str1)) {
                      Animator uAnimator = ok.b(ok.a, ok.d, ok.c);
                      ok.b = uAnimator;
                      if (uAnimator != null) {
                         View view = ok.a.a();
                         if (view != null) {
                            view.addOnAttachStateChangeListener(new h(ok));
                         }
                         ok.b.addListener(new i(ok, tmKdsAnimate));
                         ok.b.addPauseListener(new j(ok));
                         ok.b.start();
                      }
                   }
                }
             }else {
                throw new JSApplicationIllegalArgumentException("animationId is null : "+str);
             }
          }
       }
    label_00f2 :
       return;
    }
    public void cancelAnimation(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsAnimatedModule.class, "3")) {
          return;
       }
       KdsAnimatedModule tmKdsAnimate = this.mKdsAnimatedManager;
       if (tmKdsAnimate != null) {
          Objects.requireNonNull(tmKdsAnimate);
          if (!PatchProxy.applyVoidOneRefs(p0, tmKdsAnimate, a.class, "5")) {
             b uob = tmKdsAnimate.d.get(p0);
             if (uob != null) {
                UiThreadUtil.runOnUiThread(new c(tmKdsAnimate, uob, p0));
             }
          }
       }
       return;
    }
    public void finishAnimation(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsAnimatedModule.class, "6")) {
          return;
       }
       KdsAnimatedModule tmKdsAnimate = this.mKdsAnimatedManager;
       if (tmKdsAnimate != null) {
          Objects.requireNonNull(tmKdsAnimate);
          if (!PatchProxy.applyVoidOneRefs(p0, tmKdsAnimate, a.class, "8")) {
             b uob = tmKdsAnimate.d.get(p0);
             if (uob != null) {
                UiThreadUtil.runOnUiThread(new d(uob));
             }
          }
       }
       return;
    }
    public String getName(){
       return "KdsAnimatedModule";
    }
    public final void initKdsAnimatedManager(){
       if (PatchProxy.applyVoid(null, this, KdsAnimatedModule.class, "7")) {
          return;
       }
       if (this.mKdsAnimatedManager == null) {
          this.mKdsAnimatedManager = new a(this.getReactApplicationContext());
       }
       return;
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, KdsAnimatedModule.class, "1")) {
          return;
       }
       super.initialize();
       a.a("重新初始化了");
       this.mKdsAnimatedManager = null;
       return;
    }
    public void onHostDestroy(){
       if (PatchProxy.applyVoid(null, this, KdsAnimatedModule.class, "10")) {
          return;
       }
       KdsAnimatedModule tmKdsAnimate = this.mKdsAnimatedManager;
       if (tmKdsAnimate != null) {
          tmKdsAnimate.onHostDestroy();
       }
       return;
    }
    public void onHostPause(){
       if (PatchProxy.applyVoid(null, this, KdsAnimatedModule.class, "9")) {
          return;
       }
       KdsAnimatedModule tmKdsAnimate = this.mKdsAnimatedManager;
       if (tmKdsAnimate != null) {
          Objects.requireNonNull(tmKdsAnimate);
       }
       return;
    }
    public void onHostResume(){
       if (PatchProxy.applyVoid(null, this, KdsAnimatedModule.class, "8")) {
          return;
       }
       KdsAnimatedModule tmKdsAnimate = this.mKdsAnimatedManager;
       if (tmKdsAnimate != null) {
          Objects.requireNonNull(tmKdsAnimate);
       }
       return;
    }
    public void pauseAnimation(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsAnimatedModule.class, "4")) {
          return;
       }
       KdsAnimatedModule tmKdsAnimate = this.mKdsAnimatedManager;
       if (tmKdsAnimate != null) {
          Objects.requireNonNull(tmKdsAnimate);
          if (!PatchProxy.applyVoidOneRefs(p0, tmKdsAnimate, a.class, "6")) {
             b uob = tmKdsAnimate.d.get(p0);
             if (uob != null && uob.e()) {
                UiThreadUtil.runOnUiThread(new e(uob));
             }
          }
       }
       return;
    }
    public void resumeAnimation(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsAnimatedModule.class, "5")) {
          return;
       }
       KdsAnimatedModule tmKdsAnimate = this.mKdsAnimatedManager;
       if (tmKdsAnimate != null) {
          tmKdsAnimate.b(p0);
       }
       return;
    }
    public void startAnimation(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsAnimatedModule.class, "2")) {
          return;
       }
       if (p0 == null) {
          a.a("animate params is null");
          return;
       }else {
          this.initKdsAnimatedManager();
          UiThreadUtil.runOnUiThread(new a(this, p0), 100);
          return;
       }
    }
}
