package com.kuaishou.live.common.core.basic.resource.c;
import java.lang.Object;
import com.airbnb.lottie.LottieAnimationView;
import ia1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.resource.c$b;
import java.lang.Boolean;
import android.widget.ImageView;
import java.lang.StringBuilder;
import java.io.File;
import java.io.FileInputStream;
import qkd.b;
import java.io.InputStream;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import com.kuaishou.live.common.core.basic.resource.a;
import w4.j;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.image.KwaiImageView;
import hc.b;
import java.lang.Integer;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import android.net.Uri;
import ekd.w0;
import com.kuaishou.live.common.core.basic.resource.c$a;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.view.DraweeView;
import android.graphics.drawable.Animatable;

public final class c	// class@000ec1
{

    public void c(){
       super();
    }
    public static void a(LottieAnimationView p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "1")) {
          return;
       }
       c.c(p0, p1, null, true);
       return;
    }
    public static void b(LottieAnimationView p0,b p1,c$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "2")) {
          return;
       }
       c.c(p0, p1, p2, true);
       return;
    }
    public static void c(LottieAnimationView p0,b p1,c$b p2,boolean p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, c.class, "3")) {
          return;
       }
       if (p0 != null && p1 != null) {
          if (!p1.isValid()) {
             p1.c(p0);
             return;
          }else {
             try{
                String str = p1.f()+File.separator+p1.a();
                FileInputStream uFileInputSt = b.b0(new File(str));
                a uoa = new a(uFileInputSt, p0, p1, p2, p3);
                a.d(uFileInputSt, str).addListener(v1);
             }catch(java.io.IOException e8){
                ExceptionHandler.handleCaughtException(e8);
             }
          }
       }
    }
    public static void d(KwaiImageView p0,b p1,int p2,b p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, c.class, "5")) {
          return;
       }
       if (p0 != null && p1 != null) {
          if (!p1.isValid()) {
             p1.c(p0);
             return;
          }else {
             d uod = Fresco.newDraweeControllerBuilder();
             uod.q(true);
             d uod1 = uod.D(w0.f("file://"+p1.f()+File.separator+p1.g()));
             uod1.s(new c$a(p2, p3));
             p0.setController(uod1.e());
          }
       }
       return;
    }
    public static void e(LottieAnimationView p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "4")) {
          return;
       }
       if (p0 != null && p0.p()) {
          p0.f();
          p0.setImageDrawable(null);
       }
       return;
    }
    public static void f(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       a controller = p0.getController();
       if (controller == null) {
          return;
       }
       Animatable animatable = controller.getAnimatable();
       if (animatable != null && animatable.isRunning()) {
          animatable.stop();
       }
       p0.setController(null);
       return;
    }
}
