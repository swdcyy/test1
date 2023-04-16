package com.kuaishou.live.widget.LiveLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import android.content.Context;
import android.util.AttributeSet;
import qq3.c;
import android.os.Build$VERSION;
import com.airbnb.lottie.RenderMode;
import android.view.View;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewParent;
import com.kuaishou.live.widget.LiveLottieAnimationView$LottieSetImageFolderException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import w4.j;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import android.graphics.Canvas;
import android.widget.ImageView;
import java.lang.Boolean;

public class LiveLottieAnimationView extends LottieAnimationView	// class@00101b
{
    public boolean r;
    public final j s;
    public static final int t;

    public void LiveLottieAnimationView(Context p0){
       super(p0, null);
    }
    public void LiveLottieAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLottieAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.r = true;
       this.s = new c(this);
       if (Build$VERSION.SDK_INT <= 22) {
          this.setRenderMode(RenderMode.SOFTWARE);
       }
       this.D();
       return;
    }
    public static void E(View p0,Exception p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveLottieAnimationView.class, "2")) {
          return;
       }
       int id = p0.getId();
       if (id == -1) {
          ViewParent parent = p0.getParent();
          if (parent instanceof View) {
             id = parent.getId();
          }
       }
       LiveLottieAnimationView$LottieSetImageFolderException lottieSetIma = new LiveLottieAnimationView$LottieSetImageFolderException("view id: "+id, p1);
       if (!PatchProxy.applyVoidOneRefs(lottieSetIma, null, LiveLottieAnimationView.class, "3")) {
          ExceptionHandler.handleCaughtException(lottieSetIma);
       }
       return;
    }
    public final void D(){
       if (PatchProxy.applyVoid(null, this, LiveLottieAnimationView.class, "9")) {
          return;
       }
       this.setFailureListener(this.s);
       return;
    }
    public final void F(Object p0,Object p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveLottieAnimationView.class, "6")) {
          return;
       }
       Field declaredFiel = Class.forName(p3).getDeclaredField(p2);
       declaredFiel.setAccessible(true);
       declaredFiel.set(p0, p1);
       return;
    }
    public void onDetachedFromWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLottieAnimationView.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       if (this.r != null && !PatchProxy.applyVoid(objArray, this, LiveLottieAnimationView.class, "8")) {
          try{
             Class[] uClassArray = new Class[0];
             Method declaredMeth = LottieAnimationView.class.getDeclaredMethod("i", uClassArray);
             declaredMeth.setAccessible(true);
             objArray = new Object[0];
             declaredMeth.invoke(this, objArray);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLottieAnimationView.class, "1")) {
          return;
       }
       try{
          super.onDraw(p0);
       }catch(java.lang.Exception e3){
          LiveLottieAnimationView.E(this, e3);
       }
       return;
    }
    public void setAutoPlay(boolean p0){
       if (PatchProxy.isSupport(LiveLottieAnimationView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveLottieAnimationView.class, "5")) {
          return;
       }
       if (p0) {
          try{
             this.F(this, Boolean.valueOf(p0), "autoPlay", LottieAnimationView.class.getName());
             this.F(this, Boolean.valueOf(p0), "wasAnimatingWhenDetached", LottieAnimationView.class.getName());
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public void setCancelTaskOnDetachedFromWindow(boolean p0){
       this.r = p0;
    }
    public void setRenderMode(RenderMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLottieAnimationView.class, "4")) {
          return;
       }
       if (Build$VERSION.SDK_INT <= 22) {
          super.setRenderMode(RenderMode.SOFTWARE);
       }
       return;
    }
}
