package com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import android.content.Context;
import android.util.AttributeSet;
import d22.h;
import android.os.Build$VERSION;
import com.airbnb.lottie.RenderMode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w4.j;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.Exception;
import android.graphics.Canvas;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewParent;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView$LottieSetImageFolderException;
import java.lang.StringBuilder;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import k2b.u1;
import java.lang.Boolean;

public class LiveKidLottieAnimationView extends KwaiLottieAnimationView	// class@000906
{
    public final j v;
    public static final int w;

    public void LiveKidLottieAnimationView(Context p0){
       super(p0, null);
    }
    public void LiveKidLottieAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveKidLottieAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.v = new h(this);
       if (Build$VERSION.SDK_INT <= 22) {
          this.setRenderMode(RenderMode.SOFTWARE);
       }
       this.I();
       return;
    }
    public final void I(){
       if (PatchProxy.applyVoid(null, this, LiveKidLottieAnimationView.class, "9")) {
          return;
       }
       this.setFailureListener(this.v);
       return;
    }
    public final void J(Object p0,Object p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveKidLottieAnimationView.class, "6")) {
          return;
       }
       Field declaredFiel = Class.forName(p3).getDeclaredField(p2);
       declaredFiel.setAccessible(true);
       declaredFiel.set(p0, p1);
       return;
    }
    public void onDetachedFromWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveKidLottieAnimationView.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       if (!PatchProxy.applyVoid(objArray, this, LiveKidLottieAnimationView.class, "8")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKidLottieAnimationView.class, "1")) {
          return;
       }
       try{
          super.onDraw(p0);
       }catch(java.lang.Exception e6){
          if (PatchProxy.applyVoidTwoRefs(this, e6, null, LiveKidLottieAnimationView.class, "2")) {
          }else {
             int id = this.getId();
             if (id == -1) {
                ViewParent parent = this.getParent();
                if (parent instanceof View) {
                   id = parent.getId();
                }
             }
             LiveKidLottieAnimationView$LottieSetImageFolderException lottieSetIma = new LiveKidLottieAnimationView$LottieSetImageFolderException("view id: "+id, e6);
             if (PatchProxy.applyVoidOneRefs(lottieSetIma, null, LiveKidLottieAnimationView.class, "3")) {
             }else {
                ClientEvent$ExceptionEvent uExceptionEv = new ClientEvent$ExceptionEvent();
                uExceptionEv.message = lottieSetIma.toString();
                uExceptionEv.type = 2;
                u1.d0(uExceptionEv);
             }
          }
       }
       return;
    }
    public void setAutoPlay(boolean p0){
       if (PatchProxy.isSupport(LiveKidLottieAnimationView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveKidLottieAnimationView.class, "5")) {
          return;
       }
       if (p0) {
          try{
             this.J(this, Boolean.valueOf(p0), "autoPlay", LottieAnimationView.class.getName());
             this.J(this, Boolean.valueOf(p0), "wasAnimatingWhenDetached", LottieAnimationView.class.getName());
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public void setRenderMode(RenderMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKidLottieAnimationView.class, "4")) {
          return;
       }
       if (Build$VERSION.SDK_INT <= 22) {
          super.setRenderMode(RenderMode.SOFTWARE);
       }
       return;
    }
}
