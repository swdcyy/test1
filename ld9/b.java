package ld9.b;
import java.lang.Object;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.View;
import android.app.Activity;
import java.lang.Boolean;
import com.kwai.feature.post.api.util.g;
import oa0.a;
import android.content.SharedPreferences;
import com.yxcorp.utility.n;
import android.content.Context;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Number;
import lnc.z6;
import java.lang.reflect.Type;
import java.util.HashMap;
import android.content.Intent;
import ekd.j0;
import h80.h;
import h80.k;
import sm6.b;
import oe6.e;
import android.content.SharedPreferences$Editor;
import km8.b;
import oe6.g;

public final class b	// class@002db6
{

    public void b(){
       super();
    }
    public static int[] a(CameraPageConfig p0,int p1){
       CameraPageConfig obj;
       float f;
       float f1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uob, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = p0.mPreviewWidth;
       p0 = p0.mPreviewHeight;
       if (p1 != 1) {
          if (p1 != 2) {
             if (p1 != 3) {
                if (p1 == 4 || p1 == 5) {
                label_0034 :
                   f = (float)obj;
                   f1 = 0x3f100000;
                label_0037 :
                   int i = (int)(f / f1);
                }
             }else {
                p0 = obj;
             }
          }else {
             f = (float)obj;
             f1 = 0x3f400000;
             goto label_0037 ;
          }
       }else {
          goto label_0034 ;
       }
       Object[] objArray = new Object[0];
       a.D().w("FrameModeUtils", "calculatePreviewSize...mode: "+p1+" , previewWidth: "+obj+" , previewHeight: "+p0, objArray);
       int[] ointArray = new int[]{obj,p0};
       return ointArray;
    }
    public static boolean b(View p0,Activity p1,boolean p2,int p3,boolean p4){
       Object[] objArray;
       Object[] obj;
       Object[] objArray2;
       int i1;
       int i2;
       object oobject = p0;
       object oobject1 = p1;
       boolean b = p4;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, uob, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = b.g(oobject1, 0, p3);
       float f = g.d(i, oobject1, b);
       float f1 = 0;
       if (!f - f1 && i == 5) {
          f = a.a.getFloat("camera_view_all_screen_frame_ratio", f1);
          Object[] objArray1 = new Object[0];
          a.D().w("FrameModeUtils", "getCameraViewAllScreenFrameRatio from sp, ratio: "+f, objArray1);
       }
       if (b && (!f - f1 && i == 1)) {
          f = a.a.getFloat("camera_view_9_16_frame_ratio", f1);
          objArray2 = new Object[0];
          a.D().w("FrameModeUtils", "getCameraView916FrameRatio from sp, ratio: "+f, objArray2);
       }
    label_009d :
       objArray2 = new Object[0];
       a.D().w("FrameModeUtils", "changeCameraViewRatio...ratio: "+f, objArray2);
       if (f - f1 > 0) {
          float f2 = 0x3f000000;
          if (p2) {
             i1 = n.k(p1);
             if (i1 <= 0) {
                i1 = n.z(p1);
             }
             i2 = (int)(((float)i1 / f) + f2);
             if (i != 5) {
                i = n.j(p1);
                if (i <= 0) {
                   i = n.t(p1);
                }
                i2 = Math.min(i, i2);
                i1 = (int)(((float)i2 * f) + f2);
             }
          }else {
             i1 = p0.getWidth();
             i2 = (int)(((float)i1 / f) + f2);
          }
          if (i2 > 0 && i1 > 0) {
             ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
             if (layoutParams != null) {
                if (i2 != layoutParams.height || i1 != layoutParams.width) {
                   obj = new Object[]{Integer.valueOf(layoutParams.width),Integer.valueOf(layoutParams.height),Integer.valueOf(i1),Integer.valueOf(i2)};
                   objArray = new Object[0];
                   a.D().w("FrameModeUtils", String.format("changeCameraView w%d h%d-> w%d h%d", obj), objArray);
                   layoutParams.height = i2;
                   layoutParams.width = i1;
                   oobject.setLayoutParams(layoutParams);
                   return 1;
                }else {
                   Object[] objArray3 = new Object[]{Integer.valueOf(layoutParams.width),Integer.valueOf(layoutParams.height)};
                   objArray3 = new Object[0];
                   a.D().w("FrameModeUtils", String.format("no need changeCameraView w%d h%d", objArray3), objArray3);
                }
             }
          }
       }
    label_0155 :
       return 0;
    }
    public static boolean c(View p0,Activity p1,boolean p2,boolean p3,CameraPageType p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, null, uob, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       try{
          return b.b(p0, p1, p2, b.f(p1, p4), p3);
       }catch(java.lang.Exception e0){
          return v2;
       }
    }
    public static void d(View p0,Activity p1,CameraPageType p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "6")) {
          return;
       }
       if (p0 != null && p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          b = false;
          int i = b.g(p1, b, b.f(p1, p2));
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             uob = PatchProxy.applyOneRefs(Integer.valueOf(i), null, uob, "7");
             if (uob != PatchProxyResult.class) {
                b = uob.intValue();
             }else if(!i){
                HashMap hashMap = a.f(z6.H3);
                if (hashMap != null) {
                   Integer integer = hashMap.get(Integer.valueOf(i));
                   if (integer != null) {
                      b = integer.intValue();
                   }
                }
             }
          }else {
             goto label_0041 ;
          }
          ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
          if (b != layoutParams.topMargin) {
             layoutParams.topMargin = b;
             p0.setLayoutParams(layoutParams);
          }
       }
    label_006d :
       return;
    }
    public static int e(Activity p0,CameraPageType p1){
       h obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 2;
       if (p1 != CameraPageType.WHATS_UP && p1 != CameraPageType.TIE_TIE) {
          int i1 = 0;
          if (p0 != null) {
             int i2 = j0.b(p0.getIntent(), "camera_page_source", i1);
             if (i2 == 21 || i2 == 22) {
                return i;
             }
          }
          obj = k.c();
          i = 1;
          if (obj != null && obj.h()) {
             i1 = 1;
          }
          if (i1 && !b.i(p0)) {
             if (b.t(p0)) {
                return 5;
             }else {
                return 4;
             }
          }else if(b.k(p0)){
             i = 5;
          }
       }
    label_005b :
       return i;
    }
    public static int f(Activity p0,CameraPageType p1){
       int i;
       int i1;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p1 == CameraPageType.WHATS_UP || p1 == CameraPageType.TIE_TIE) {
          return 2;
       }
       if (p0 != null) {
          i = j0.b(p0.getIntent(), "camera_page_source", 0);
          if (i == 21 || i == 22) {
             return 2;
          }
       }
       i = e.J();
       if (i) {
          return i;
       }else if(b.k(p0)){
          i1 = 5;
       }else {
          i1 = 1;
       }
       return i1;
    }
    public static int g(Activity p0,boolean p1,int p2){
       boolean b;
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), null, b.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       b = b.i(p0);
       b = (b.t(p0) && !b)? true: false;
       return b.h(b, p1, p2);
    }
    public static int h(boolean p0,boolean p1,int p2){
       if (p0) {
          if (!p1 && p2 == 4) {
             return 5;
          }
       }else if(p2 == 5){
          return 1;
       }
       return p2;
    }
    public static boolean i(Activity p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (g.f(p0) != 1) {
          if (b.t(p0)) {
             int i = (g.k(p0))? n.j(p0): 0;
             if (b.u(p0, i)) {
             label_0034 :
                b = true;
             }
          }
       }else {
          goto label_0034 ;
       }
       return b;
    }
    public static void j(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uob, "3")) {
          return;
       }
       if (!p0) {
          return;
       }
       HashMap hashMap = a.f(z6.H3);
       if (hashMap == null) {
          hashMap = new HashMap();
       }
       hashMap.put(Integer.valueOf(p0), Integer.valueOf(p1));
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("camera_view_default_top", b.e(hashMap));
       g.a(uEditor);
       return;
    }
    public static boolean k(Activity p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (!b.i(p0) && b.t(p0))? true: false;
       return b;
    }
}
