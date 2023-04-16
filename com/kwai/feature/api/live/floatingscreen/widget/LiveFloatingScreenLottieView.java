package com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenLottieView;
import zq5.a;
import com.airbnb.lottie.LottieAnimationView;
import android.content.Context;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import com.airbnb.lottie.RenderMode;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.reflect.Field;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import java.lang.Boolean;
import java.lang.Exception;

public final class LiveFloatingScreenLottieView extends LottieAnimationView implements a	// class@000fcc
{

    public void LiveFloatingScreenLottieView(Context p0){
       super(p0, null);
    }
    public void LiveFloatingScreenLottieView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveFloatingScreenLottieView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (Build$VERSION.SDK_INT <= 22) {
          this.setRenderMode(RenderMode.SOFTWARE);
       }
       return;
    }
    public final void D(Object p0,Object p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveFloatingScreenLottieView.class, "3")) {
          return;
       }
       Field declaredFiel = Class.forName(p3).getDeclaredField(p2);
       a.o(declaredFiel, "f");
       declaredFiel.setAccessible(true);
       declaredFiel.set(p0, p1);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingScreenLottieView.class, "5")) {
          return;
       }
       this.s();
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingScreenLottieView.class, "6")) {
          return;
       }
       this.setVisibility(8);
       this.f();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingScreenLottieView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       return;
    }
    public void setAutoPlay(boolean p0){
       if (PatchProxy.isSupport(LiveFloatingScreenLottieView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveFloatingScreenLottieView.class, "2")) {
          return;
       }
       if (p0) {
          try{
             String name = LottieAnimationView.class.getName();
             a.o(name, "LottieAnimationView::class.java.name");
             this.D(this, Boolean.valueOf(p0), "autoPlay", name);
             String name1 = LottieAnimationView.class.getName();
             a.o(name1, "LottieAnimationView::class.java.name");
             this.D(this, Boolean.valueOf(p0), "wasAnimatingWhenDetached", name1);
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
       }
    }
    public void setRenderMode(RenderMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenLottieView.class, "1")) {
          return;
       }
       if (Build$VERSION.SDK_INT <= 22) {
          super.setRenderMode(RenderMode.SOFTWARE);
       }
       return;
    }
}
