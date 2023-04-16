package com.kwai.slide.play.detail.utils.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import android.animation.Animator$AnimatorListener;
import java.lang.Integer;
import java.lang.Long;
import android.animation.ObjectAnimator;
import com.kwai.slide.play.detail.utils.c$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import as7.a;
import java.lang.Throwable;
import android.util.Log;
import q87.c;
import bt7.k;
import java.lang.Boolean;
import com.kwai.slide.play.detail.utils.c$a;

public final class c	// class@001887
{

    public void c(){
       super();
    }
    public static void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Object tag = p0.getTag(R.id.slide_play_screen_clear_animation_tag);
       if (tag instanceof ValueAnimator && tag.isRunning()) {
          tag.cancel();
          p0.setTag(R.id.slide_play_screen_clear_animation_tag, null);
       }
       return;
    }
    public static void b(View p0,int p1,long p2,Animator$AnimatorListener p3){
       float[] uofloatArray;
       ValueAnimator valueAnimato;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Long.valueOf(p2), p3, null, c.class, "2")) {
          return;
       }
       if (p0 != null && p0.getVisibility() != p1) {
          c.a(p0);
          if (p2 > 0) {
             int i = 1;
             int i1 = 0;
             int i2 = 2;
             if (!p1) {
                uofloatArray = new float[i2];
                uofloatArray[0] = i1;
                uofloatArray[i] = 0x3f800000;
                valueAnimato = ObjectAnimator.ofFloat(uofloatArray);
             }else {
                uofloatArray = new float[i2];
                uofloatArray[0] = 0x3f800000;
                uofloatArray[i] = i1;
                valueAnimato = ObjectAnimator.ofFloat(uofloatArray);
             }
             valueAnimato.addUpdateListener(new c$b(p0));
             if (p3 != null) {
                valueAnimato.addListener(p3);
             }
             valueAnimato.setDuration(p2);
             valueAnimato.start();
             p0.setTag(R.id.slide_play_screen_clear_animation_tag, valueAnimato);
          }
          if (p3 == null) {
             try{
                p0.setVisibility(p1);
             }catch(java.lang.Exception e8){
                Object[] objArray = new Object[0];
                a.C().t("SlideV2Utils", Log.getStackTraceString(e8), objArray);
             }
          }
       }
    }
    public static void c(View p0,int p1,long p2){
       float[] uofloatArray;
       ValueAnimator valueAnimato;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Long.valueOf(p2), null, c.class, "3")) {
          return;
       }
       if (p0 != null && p2 > 0) {
          c.a(p0);
          int i = 1;
          if (!p1) {
             uofloatArray = new float[]{0,0x3f800000};
             valueAnimato = ObjectAnimator.ofFloat(uofloatArray);
          }else {
             uofloatArray = new float[]{0x3f800000,0};
             valueAnimato = ObjectAnimator.ofFloat(uofloatArray);
          }
          valueAnimato.addUpdateListener(new k(p0));
          valueAnimato.setDuration(p2);
          valueAnimato.start();
       }
    label_0064 :
       return;
    }
    public static void d(View p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, c.class, "1")) {
          return;
       }
       if (p0 != null && p0.getVisibility() != 8) {
          if (p1) {
             if (p2) {
                c.b(p0, 0, 200, null);
             }else {
                p0.setAlpha(0x3f800000);
                p0.setVisibility(0);
             }
             return;
          }else if(p2){
             c.b(p0, 4, 200, new c$a(p0));
          }else {
             p0.setVisibility(4);
          }
       }
       return;
    }
}
