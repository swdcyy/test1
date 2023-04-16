package com.tachikoma.plugin.TKLottieImageView;
import com.tachikoma.core.component.e;
import gx4.f;
import java.util.LinkedList;
import com.tachikoma.plugin.TKLottieImageView$a;
import com.tachikoma.plugin.TKLottieImageView$b;
import com.tachikoma.plugin.TKLottieImageView$c;
import com.tachikoma.plugin.TKLottieImageView$d;
import android.content.Context;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import w4.k;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import w4.j;
import com.airbnb.lottie.LottieTask;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tachikoma.core.bridge.c;
import tx4.x;
import w4.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import iq8.d;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import com.tachikoma.plugin.TKLottieImageView$e;
import java.lang.Runnable;
import iq8.x;
import com.airbnb.lottie.a;
import lq8.c;
import lq8.d;
import w4.c;
import mq8.a;
import java.lang.Float;
import java.lang.Exception;

public class TKLottieImageView extends e	// class@000de6
{
    public final k A;
    public final j B;
    public boolean isAnimationPlaying;
    public boolean isRunning;
    public String lottiePath;
    public String lottieRes;
    public JsValueRef mAnimationCancelCallbackRef;
    public JsValueRef mAnimationEndCallbackRef;
    public JsValueRef mAnimationLoadedCallbackRef;
    public JsValueRef mAnimationRepeatCallbackRef;
    public JsValueRef mAnimationStartCallbackRef;
    public JsValueRef mAnimationUpdateCallbackRef;
    public float mProgress;
    public String uri;
    public final LinkedList v;
    public JsValueRef w;
    public LottieTask x;
    public AnimatorListenerAdapter y;
    public final ValueAnimator$AnimatorUpdateListener z;

    public void TKLottieImageView(f p0){
       super(p0);
       this.v = new LinkedList();
       this.y = new TKLottieImageView$a(this);
       this.z = new TKLottieImageView$b(this);
       this.A = new TKLottieImageView$c(this);
       this.B = new TKLottieImageView$d(this);
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public LottieAnimationView createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKLottieImageView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LottieAnimationView(p0);
    }
    public void destroyOnUIThread(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKLottieImageView.class, "29")) {
          return;
       }
       if (this.isTargetViewExist()) {
          this.getView().w(this.A);
          this.getView().x(this.z);
          this.getView().v(this.y);
          this.getView().setFailureListener(objArray);
          this.getView().j(true);
       }
       TKLottieImageView tx = this.x;
       if (tx != null) {
          tx.removeAllListeners();
          this.x.cancel(false);
       }
       return;
    }
    public void executeCallback(JsValueRef p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKLottieImageView.class, "27")) {
          return;
       }
       if (p0 != null && (p0.get() == null || (!p0.get().isReleased() && y.a(p0.get())))) {
          try{
             Object[] objArray = new Object[]{p1};
             p0.get().call(null, objArray);
          }catch(java.lang.Exception e4){
             a.d(this.getTKJSContext(), e4);
          }
       }
    }
    public boolean isAnimationPlaying(){
       Object obj = PatchProxy.apply(null, this, TKLottieImageView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getView().p();
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, TKLottieImageView.class, "7")) {
          return;
       }
       this.getView().d(this.A);
       this.getView().setFailureListener(this.B);
       this.getView().a(this.y);
       this.getView().c(this.z);
       if (TextUtils.isEmpty(this.uri)) {
          if (!TextUtils.isEmpty(this.lottieRes)) {
             this.n(this.lottieRes);
          }
          if (!TextUtils.isEmpty(this.lottiePath)) {
             if ((this.lottiePath).startsWith("https://") || (this.lottiePath).startsWith("http://")) {
                this.q(this.lottiePath);
             }else {
                this.p(this.lottiePath);
             }
          }
       }else if((this.uri).startsWith("asset://")){
          this.n(this.uri);
       }else if((this.uri).startsWith("bundle://")){
          this.o(this.uri);
       }else if((this.uri).startsWith("file://")){
          this.p(this.uri);
       }else if((this.uri).startsWith("https://") || (this.uri).startsWith("http://")){
          this.q(this.uri);
       }else {
          this.o(this.uri);
       }
       return;
    }
    public void maybePlayLottieAnimation(){
       if (PatchProxy.applyVoid(null, this, TKLottieImageView.class, "2")) {
          return;
       }
       this.m();
       return;
    }
    public final void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView.class, "8")) {
          return;
       }
       p0 = x.a(p0, "asset://");
       if (-1 == p0.lastIndexOf(".")) {
          p0 = p0.concat(".json");
       }
       this.getView().setAnimation(p0);
       return;
    }
    public void notifyExecCommands(){
       if (PatchProxy.applyVoid(null, this, TKLottieImageView.class, "12")) {
          return;
       }
       if (this.getView().getComposition() == null) {
          return;
       }
       Iterator iterator = new ArrayList(this.v).iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Objects.requireNonNull(str);
          int i = -1;
          switch (str.hashCode()){
              case 0xc84dc82d:
                if (str.equals("resume")) {
                   i = 0;
                }
                break;
              case 0x348b34:
                if (str.equals("play")) {
                   i = 1;
                }
                break;
              case 0x360802:
                if (str.equals("stop")) {
                   i = 2;
                }
                break;
              case 0x65825f6:
                if (str.equals("pause")) {
                   i = 3;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                this.resume();
                break;
              case 1:
                this.play();
                break;
              case 2:
                this.stop();
                break;
              case 3:
                this.pause();
                break;
              default:
          }
       }
       this.v.clear();
       return;
    }
    public final void o(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView.class, "9")) {
          return;
       }
       p0 = x.a(p0, "bundle://");
       if (!TextUtils.isEmpty(this.getRootDir())) {
          p0 = (this.getRootDir()).concat(p0);
       }
       if (d.a(p0)) {
          this.getView().setAnimationFromFile(p0);
       }else {
          this.executeCallback(this.mAnimationLoadedCallbackRef, Boolean.FALSE);
       }
       return;
    }
    public void onAnimationCancel(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView.class, "25")) {
          return;
       }
       y.c(this.mAnimationCancelCallbackRef);
       this.mAnimationCancelCallbackRef = y.b(p0, this);
       return;
    }
    public void onAnimationEnd(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView.class, "22")) {
          return;
       }
       y.c(this.mAnimationEndCallbackRef);
       this.mAnimationEndCallbackRef = y.b(p0, this);
       return;
    }
    public void onAnimationLoaded(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView.class, "23")) {
          return;
       }
       y.c(this.mAnimationLoadedCallbackRef);
       this.mAnimationLoadedCallbackRef = y.b(p0, this);
       return;
    }
    public void onAnimationRepeat(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView.class, "26")) {
          return;
       }
       y.c(this.mAnimationRepeatCallbackRef);
       this.mAnimationRepeatCallbackRef = y.b(p0, this);
       return;
    }
    public void onAnimationStart(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView.class, "21")) {
          return;
       }
       y.c(this.mAnimationStartCallbackRef);
       this.mAnimationStartCallbackRef = y.b(p0, this);
       return;
    }
    public void onAnimationUpdate(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView.class, "24")) {
          return;
       }
       y.c(this.mAnimationUpdateCallbackRef);
       this.mAnimationUpdateCallbackRef = y.b(p0, this);
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKLottieImageView tKLottieImag = TKLottieImageView.class;
       if (PatchProxy.isSupport(tKLottieImag) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKLottieImag, "28")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.destroyOnUIThread();
       }else {
          x.f(new TKLottieImageView$e(this));
       }
       return;
    }
    public final void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView.class, "10")) {
          return;
       }
       p0 = x.a(p0, "file://");
       if (d.a(p0)) {
          this.getView().setAnimationFromFile(p0);
       }else {
          this.executeCallback(this.mAnimationLoadedCallbackRef, Boolean.FALSE);
       }
       return;
    }
    public void pause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKLottieImageView.class, "16")) {
          return;
       }
       if (this.getView().getComposition() != null) {
          if (this.getView().p()) {
             this.executeCallback(this.mAnimationCancelCallbackRef, objArray);
          }
          this.isRunning = false;
          this.getView().r();
       }else {
          this.v.add("pause");
       }
       return;
    }
    public void play(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKLottieImageView.class, "15")) {
          return;
       }
       if (this.getView().getComposition() != null) {
          if (!this.mProgress) {
             this.getView().s();
          }else {
             this.getView().y();
             this.executeCallback(this.mAnimationStartCallbackRef, objArray);
          }
          if (this.isRunning != null) {
             this.executeCallback(this.mAnimationCancelCallbackRef, Boolean.FALSE);
          }
          this.mProgress = 0;
          this.isRunning = true;
       }else {
          this.v.add("play");
       }
       return;
    }
    public void prefetch(String p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKLottieImageView.class, "6")) {
          return;
       }
       if (p1 != null) {
          y.c(this.w);
          this.w = y.b(p1, this);
       }
       this.x = a.i(this.getContext(), p0).addListener(new c(this)).addFailureListener(new d(this));
       return;
    }
    public final void q(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView.class, "11")) {
          return;
       }
       this.getView().setAnimationFromUrl(p0);
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, TKLottieImageView.class, "18")) {
          return;
       }
       if (this.getView().getComposition() != null) {
          this.getView().y();
          this.isRunning = true;
       }else {
          this.v.add("resume");
       }
       return;
    }
    public void setAutoPlay(boolean p0){
       TKLottieImageView tKLottieImag = TKLottieImageView.class;
       if (PatchProxy.isSupport(tKLottieImag) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKLottieImag, "14")) {
          return;
       }
       this.getView().setAutoPlay(p0);
       return;
    }
    public void setImageFolder(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView.class, "5")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       String str = "asset://";
       if (p0.startsWith(str)) {
          this.getView().setImageAssetsFolder(x.a(p0, str));
          this.getView().setImageAssetDelegate(null);
       }else {
          LottieAnimationView view = this.getView();
          p0 = (TextUtils.isEmpty(this.getRootDir()))? x.a(p0, "bundle://"): (this.getRootDir()).concat(x.a(p0, "bundle://"));
          view.setImageAssetDelegate(new a(p0));
       }
       return;
    }
    public void setLoop(boolean p0){
       TKLottieImageView tKLottieImag = TKLottieImageView.class;
       if (PatchProxy.isSupport(tKLottieImag) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKLottieImag, "13")) {
          return;
       }
       if (p0) {
          this.getView().setRepeatCount(-1);
       }else {
          this.getView().setRepeatCount(0);
       }
       return;
    }
    public void setLottiePath(String p0){
       this.lottiePath = p0;
       this.m();
    }
    public void setLottieRes(String p0){
       this.lottieRes = p0;
       this.m();
    }
    public void setProgress(float p0){
       TKLottieImageView tKLottieImag = TKLottieImageView.class;
       if (PatchProxy.isSupport(tKLottieImag) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKLottieImag, "19")) {
          return;
       }
       String str = null;
       if (p0 - str < 0 || p0 - 0x3f800000 > 0) {
          a.b(new Exception("progress is unavailable"), this.getJSContext().i());
          return;
       }else {
          this.mProgress = p0;
          this.getView().setProgress(this.mProgress);
          if (this.isAnimationPlaying()) {
             this.executeCallback(this.mAnimationStartCallbackRef, null);
             this.mProgress = str;
          }
          return;
       }
    }
    public void setUri(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView.class, "4")) {
          return;
       }
       this.uri = p0;
       this.m();
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, TKLottieImageView.class, "17")) {
          return;
       }
       if (this.getView().getComposition() != null) {
          if (this.isRunning != null) {
             this.getView().f();
             this.getView().setFrame(0);
             this.isRunning = false;
          }
       }else {
          this.v.add("stop");
       }
       return;
    }
    public boolean supportAsyncPrepareView(){
       return true;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKLottieImageView.class, "20")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.mAnimationStartCallbackRef);
       y.c(this.mAnimationEndCallbackRef);
       y.c(this.mAnimationLoadedCallbackRef);
       y.c(this.mAnimationUpdateCallbackRef);
       y.c(this.mAnimationCancelCallbackRef);
       y.c(this.mAnimationRepeatCallbackRef);
       return;
    }
}
