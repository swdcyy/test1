package com.yxcorp.gifshow.util.cdnresource.e;
import java.lang.String;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import w4.j;
import com.yxcorp.gifshow.util.cdnresource.CdnResource;
import com.airbnb.lottie.LottieTask;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.airbnb.lottie.a;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Runnable;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import android.widget.ImageView;
import com.yxcorp.gifshow.util.cdnresource.e$a;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.util.cdnresource.d;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;
import android.content.res.Resources;
import lnc.a1;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.BitmapFactory;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$a;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$b;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$c;
import com.yxcorp.gifshow.util.cdnresource.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import wkd.b;
import pnc.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import java.util.List;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Enum;
import k2b.u1;

public class e	// class@001f6c
{

    public static String a(String p0,CdnResource$ResourceKey p1,int p2,j p3){
       return e.b(p0, p1, p2, p3, false);
    }
    public static String b(String p0,CdnResource$ResourceKey p1,int p2,j p3,boolean p4){
       LottieTask lottieTask;
       CdnResource uCdnResource = e.j(p4, p0);
       if (p1 != null && uCdnResource != null) {
          try{
             lottieTask = uCdnResource.c(p1);
          label_0013 :
             if (lottieTask != null) {
                lottieTask.addListener(p3);
                return uCdnResource.e();
             }else {
                a.h(a.b(), p2).addListener(p3);
                return null;
             }
          }catch(java.io.IOException e1){
             Log.k(e1);
          }
       label_0012 :
          lottieTask = null;
          goto label_0013 ;
       }else {
          goto label_0012 ;
       }
    }
    public static void c(String p0,LottieAnimationView p1,CdnResource$ResourceKey p2,int p3,Runnable p4,ClientContent$ContentPackage p5,boolean p6){
       e.d(p0, p1, p2, p3, p4, p5, p6, false);
    }
    public static void d(String p0,LottieAnimationView p1,CdnResource$ResourceKey p2,int p3,Runnable p4,ClientContent$ContentPackage p5,boolean p6,boolean p7){
       LottieTask tag = p1.getTag(R.id.tag_lottie_task_listener);
       if (tag instanceof e$a) {
          e$a c = tag.c;
          if (c != null) {
             c.removeListener(tag);
          }
       }
       CdnResource uCdnResource = e.j(p7, p0);
       if (p2 != null && uCdnResource != null) {
          try{
             tag = uCdnResource.c(p2);
          label_0027 :
             if (tag != null) {
                e$a uoa = new e$a(p1, p4);
                p1.setTag(R.id.tag_lottie_task_listener, uoa);
                uoa.c = tag;
                tag.addListener(uoa);
                uCdnResource = uCdnResource.e();
                Animator$AnimatorListener tag1 = p1.getTag(R.id.lottie_animation_view_log_listener);
                if (tag1 != null) {
                   p1.v(tag1);
                }
                if (p6 && p2 != null) {
                   d uod = new d(uCdnResource, p5, p2);
                   p1.a(uod);
                   p1.setTag(R.id.lottie_animation_view_log_listener, uod);
                }
             }else {
                p1.setTag(R.id.tag_lottie_task_listener, null);
                p1.setAnimation(p3);
                p4.run();
             }
             return;
          }catch(java.io.IOException e1){
             Log.k(e1);
          }
       label_0026 :
          tag = null;
          goto label_0027 ;
       }else {
          goto label_0026 ;
       }
    }
    public static Bitmap e(int p0){
       int i;
       BitmapFactory$Options options = new BitmapFactory$Options();
       DisplayMetrics uDisplayMetr = c.c(a1.m());
       uDisplayMetr = (uDisplayMetr != null)? uDisplayMetr.densityDpi: 1;
       options.inDensity = uDisplayMetr;
       options.inTargetDensity = uDisplayMetr;
       return BitmapFactory.decodeResource(a1.m(), p0, options);
    }
    public static Bitmap f(String p0,CdnResource$ResourceKey p1){
       return e.g(p0, p1, false);
    }
    public static Bitmap g(String p0,CdnResource$ResourceKey p1,boolean p2){
       CdnResource uCdnResource = e.j(p2, p0);
       if (p1 == null || uCdnResource == null) {
          return null;
       }
       return uCdnResource.a(p1);
    }
    public static CdnResource$a h(String p0,CdnResource$ResourceKey p1,int[] p2,boolean p3){
       CdnResource$a uoa;
       if (p1 != null) {
          CdnResource uCdnResource = e.j(p3, p0);
          if (uCdnResource != null) {
             uoa = uCdnResource.b(p1);
          label_000e :
             if (uoa == null || !uoa.size()) {
                uoa = new CdnResource$c(p2);
             }
             return uoa;
          }
       }
       uoa = null;
       goto label_000e ;
    }
    public static String i(String p0,boolean p1){
       CdnResource uCdnResource = e.j(p1, p0);
       if (uCdnResource == null) {
          return null;
       }
       return uCdnResource.e();
    }
    public static CdnResource j(boolean p0,String p1){
       if (!p0) {
          return b.a(0x44c00a7).g(p1);
       }
       Map a = a.a;
       CdnResource uCdnResource = (a != null && !TextUtils.isEmpty(p1))? a.get(p1): null;
       return uCdnResource;
    }
    public static void k(String p0,ClientContent$ContentPackage p1,CdnResource$ResourceKey p2){
       String str = "COMMENT";
       String str1 = (p1 != null && p1.commentPackage != null)? str: "PHOTO";
       if (p1 == null) {
          p1 = new ClientContent$ContentPackage();
       }
       p1.ksOrderInfoPackage = l0.a(p0);
       p0 = (CdnResource.f.contains(p2))? "FALSE": "TRUE";
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIKE_SPECIAL";
       str = (str.equals(str1))? "comment_like": "photo_like";
       uElementPack.name = str;
       i3 oi3 = i3.f();
       oi3.d("category", str1);
       oi3.d("is_like", p0);
       oi3.d("resource_key", p2.name());
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, p1);
       return;
    }
}
