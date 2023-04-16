package com.yxcorp.gifshow.v3.editor.cover.v0;
import java.lang.Object;
import n65.k;
import android.graphics.Rect;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Math;
import android.graphics.Canvas;
import com.kuaishou.edit.draft.AssetSegment;
import sxb.a;
import wba.z;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import vba.d;
import kotlin.Pair;
import java.lang.Float;
import java.lang.Boolean;
import o56.c;
import o56.a;
import android.app.Application;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.graphics.Bitmap;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import w46.b;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.OutOfMemoryError;
import com.yxcorp.gifshow.util.PictureMemoryUtils;
import android.graphics.Paint;
import android.graphics.BitmapRegionDecoder;
import android.graphics.BitmapFactory$Options;
import pwc.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import x59.g;
import com.yxcorp.gifshow.v3.editor.cover.v0$a;
import java.util.List;
import java.lang.System;
import java.util.ArrayList;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.yxcorp.gifshow.edit.previewer.utils.d;
import ekd.j;
import ppc.h0;
import vba.g;
import java.util.Objects;
import sxb.a$a;
import kotlin.jvm.internal.a;
import nsd.u;
import java.util.concurrent.Semaphore;
import android.util.Pair;
import lnc.a1;

public class v0	// class@000ee2
{

    public void v0(){
       super();
    }
    public static int a(k p0,Rect p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, v0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 1;
       int i1 = p0.d();
       int i2 = p0.c();
       int i3 = i * 2;
       int i4 = i1 / i3;
       while (i4 > p1.width()) {
          i4 = i2 / i3;
          if (i4 > p1.height()) {
             i = i3;
          }else {
             break ;
          }
       }
       return i;
    }
    public static Rect b(k p0,Rect p1){
       Rect rect;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       v0 ov0 = v0.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, ov0, "9");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p0 == null || p1 == null) {
          return obj;
       }
       int i = p0.d();
       int i1 = p0.c();
       int i2 = p1.width();
       int i3 = p1.height();
       if (PatchProxy.isSupport(ov0)) {
          rect = PatchProxy.applyFourRefs(Integer.valueOf(i), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), null, v0.class, "10");
          if (rect != patchProxyRe) {
          }else {
          label_0049 :
             float f = (float)i3;
             float f1 = (float)i2;
             float f2 = Math.max(((f * 0x3f800000) / (float)i1), ((0x3f800000 * f1) / (float)i));
             int i4 = (int)(f1 / f2);
             i3 = (int)(f / f2);
             if (i3 == i1) {
                i = (i - i4) / 2;
                rect = new Rect(i, 0, (i4 + i), i1);
             }else {
                i1 = (i1 - i3) / 2;
                rect = new Rect(0, i1, i4, (i3 + i1));
             }
          }
       }else {
          goto label_0049 ;
       }
       return rect;
    }
    public static void c(Canvas p0,AssetSegment p1,Rect p2,a p3){
       boolean b;
       object oobject = p0;
       v0 ov0 = p1;
       Object obj = p2;
       object oobject1 = p3;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, v0.class, "2")) {
          return;
       }
       k ok = ov0.f(p1.getFile());
       k ok1 = ov0.f(z.f(p1));
       Size size = z.m(ov0, new Size(ok.d(), ok.c()));
       if (oobject1) {
          p3.h().q(size);
          p3.h().o(z.l(ov0, new Size(ok.d(), ok.c())).getSecond().floatValue());
       }
       ActivityManager$MemoryInfo obj1 = PatchProxy.applyTwoRefs(ok, obj, null, v0.class, "11");
       String str = "PhotosCoverUtil";
       int i = 0;
       int i1 = 1;
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          obj1 = PatchProxy.applyOneRefs(ok, null, v0.class, "12");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if((long)(ok.d() * ok.c()) - 0x384000 > 0){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             ActivityManager obj2 = PatchProxy.apply(null, null, v0.class, "13");
             if (obj2 != PatchProxyResult.class) {
                b = obj2.booleanValue();
             }else if(a.a().a() != null){
                obj2 = a.a().a().getSystemService("activity");
                if (obj2 != null) {
                   obj1 = new ActivityManager$MemoryInfo();
                   obj2.getMemoryInfo(obj1);
                   Object[] objArray3 = new Object[i];
                   a.D().s(str, "isMemoryLow: mi.totalMem:"+obj1.totalMem+", mi.availMem:"+obj1.availMem, objArray3);
                   if (obj1.totalMem - 0x80000000 <= 0 || obj1.availMem - 0x19000000 < 0) {
                      b = true;
                   }
                }
             }
             b = false;
             if (!b) {
                b = false;
             }
          }
          b = true;
       }
       String str1 = z.f(p1);
       int i2 = 2;
       int i3 = 3;
       if (PatchProxy.isSupport(v0.class)) {
          Object[] objArray = new Object[]{oobject,str1,ok1,obj,Boolean.valueOf(b),oobject1};
          if (!PatchProxy.applyVoid(objArray, null, v0.class, "3")) {
          label_0149 :
             if (PatchProxy.isSupport(v0.class)) {
                objArray = new Object[]{str1,ok1,obj,Boolean.valueOf(b),oobject1};
                Bitmap uBitmap = PatchProxy.apply(objArray, null, v0.class, "4");
                if (uBitmap != PatchProxyResult.class) {
                }else {
                label_016e :
                   a uoa = a.D();
                   Object[] objArray1 = new Object[i];
                   uoa.s(str, "decodeCover picture:["+ok1.d()+"x"+ok1.c()+"] useDecodeRegion:"+b, objArray1);
                   if (b && oobject1 == null) {
                      try{
                         uBitmap = uoa.e(str1, ok1, obj);
                      label_01c4 :
                         if (uBitmap == null) {
                            Object[] objArray2 = new Object[i];
                            a.D().t(str, "decodeCover. will use decodeFileAndCrop.", objArray2);
                            uBitmap = PatchProxy.applyThreeRefs(str1, p2, p3, null, v0.class, "6");
                            if (uBitmap != PatchProxyResult.class) {
                            }else {
                               try{
                                  uBitmap = uBitmap.d(str1, obj, oobject1);
                               }catch(java.lang.OutOfMemoryError e0){
                                  b0 uob0 = BitmapUtil.E(str1);
                                  PictureMemoryUtils.i(e0, uob0);
                                  PictureMemoryUtils.b();
                                  uBitmap = uob0.d(str1, obj, oobject1);
                               }
                            }
                         }
                      }catch(java.io.IOException e0){
                         "decodeCover region file:"+str1.h("decodeCover region file:"+str1, e0);
                      }catch(java.lang.Exception e0){
                         PostUtils.D(str, "decodeCover region file:", e0);
                      }
                   }
                }
             }else {
                goto label_016e ;
             }
          }
       }else {
          goto label_0149 ;
       }
       return;
    }
    public static Bitmap d(String p0,Rect p1,a p2){
       Bitmap obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, v0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().s("PhotosCoverUtil", "decodeFileAndCrop ....", objArray);
       obj = BitmapUtil.A(p0, p1.width(), p1.height());
       if (p2 != null) {
          obj = p2.m(obj);
          p2.d(obj);
       }
       Bitmap uBitmap = null;
       if (obj != null) {
          uBitmap = BitmapUtil.o(obj, p1.width(), p1.height());
       }else {
          String str = "decodeCover file:";
          str.h(str+p0, uBitmap);
       }
       if (uBitmap != null) {
          Object[] objArray1 = new Object[0];
          a.D().s("PhotosCoverUtil", "decodeFileAndCrop: decoded bitmap size:"+uBitmap.getAllocationByteCount(), objArray1);
       }
       return uBitmap;
    }
    public static Bitmap e(String p0,k p1,Rect p2){
       Rect obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, v0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = obj.b(p1, p2);
       if (obj == null) {
          return null;
       }
       Object[] objArray = new Object[0];
       a.D().s("PhotosCoverUtil", "decodeRegion: srcRec:"+obj.toShortString(), objArray);
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inSampleSize = obj.a(p1, p2);
       Object[] objArray1 = new Object[0];
       a.D().s("PhotosCoverUtil", "decodeRegion: sample:"+options.inSampleSize, objArray1);
       Bitmap uBitmap = BitmapRegionDecoder.newInstance(p0, 0).decodeRegion(obj, options);
       if (uBitmap != null) {
          Object[] objArray2 = new Object[0];
          a.D().s("PhotosCoverUtil", "decodeRegion: decoded bitmap size:"+uBitmap.getAllocationByteCount(), objArray2);
       }
       return uBitmap;
    }
    public static k f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, v0.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Size size = a.a(p0);
       return new k(size.b, size.c);
    }
    public static List g(c p0,int p1,int p2,g p3,v0$a p4){
       String obj1;
       Object obj3;
       int i5;
       List list1;
       ArrayList uArrayList1;
       Object obj4;
       long l1;
       Object obj5;
       EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub2;
       d uod;
       object oobject = p0;
       int i = p1;
       int i1 = p2;
       object oobject1 = p3;
       v0 ov0 = v0.class;
       String obj = null;
       int i2 = 0;
       if (PatchProxy.isSupport(ov0)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),oobject1,p4};
          obj1 = PatchProxy.apply(objArray, obj, ov0, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       long l = System.currentTimeMillis();
       ArrayList uArrayList = new ArrayList();
       List list = z.x(p0.a1(), oobject);
       int i3 = 0;
       while (i3 < i1) {
          int i4 = i3 + i;
          Object obj2 = list.get(i4);
          EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = d.e(d.l(oobject, obj2, i2));
          if (!j.h(uAnimatedSub)) {
             obj1 = "mBitmapFilterRendererManager";
             obj = "animatedSubAssetArray";
             if (p4 != null) {
                g og = p4.a(obj2);
                String str = z.f(obj2);
                String str1 = obj1;
                EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub1 = uAnimatedSub;
                obj3 = obj2;
                i1 = i4;
                i5 = i3;
                list1 = list;
                uArrayList1 = uArrayList;
                obj4 = PatchProxy.applyFourRefs(og, uAnimatedSub, p3, str, 0, a.class, "16");
                if (obj4 != PatchProxyResult.class) {
                }else {
                   a$a k = a.k;
                   Objects.requireNonNull(k);
                   obj4 = PatchProxy.applyFourRefs(og, uAnimatedSub1, p3, str, k, a$a.class, "6");
                   if (obj4 != PatchProxyResult.class) {
                   }else {
                      a.p(og, "prettifyInfo");
                      uAnimatedSub2 = uAnimatedSub1;
                      a.p(uAnimatedSub2, obj);
                      a.p(oobject1, str1);
                      uod = new d(og, uAnimatedSub2, new Size(-1, -1), 0, 0, 0, 56, null);
                      if (i4.m()) {
                         obj4 = new a(p3, null, i4, null, str);
                      }else {
                         l1 = l;
                      label_0171 :
                         obj4 = null;
                      }
                   }
                }
                l1 = l;
             }else {
                obj3 = obj2;
                i1 = i4;
                i5 = i3;
                list1 = list;
                uArrayList1 = uArrayList;
                uAnimatedSub2 = uAnimatedSub;
                String str2 = z.f(obj3);
                l1 = l;
                String str3 = obj1;
                obj4 = PatchProxy.applyThreeRefs(uAnimatedSub2, p3, str2, null, a.class, "15");
                if (obj4 != PatchProxyResult.class) {
                }else {
                   a$a k1 = a.k;
                   Objects.requireNonNull(k1);
                   obj4 = PatchProxy.applyThreeRefs(uAnimatedSub2, p3, str2, k1, a$a.class, "5");
                   if (obj4 != PatchProxyResult.class) {
                   }else {
                      a.p(uAnimatedSub2, obj);
                      a.p(oobject1, str3);
                      uod = new d(new g(), uAnimatedSub2, new Size(-1, -1), 0, 0, 0, 56, null);
                      if (k1.m()) {
                         obj4 = new a(p3, null, k1, null, str2);
                      }else {
                         goto label_0171 ;
                      }
                   }
                }
             }
             obj5 = obj3;
          }else {
             obj3 = obj2;
             i1 = i4;
             i5 = i3;
             list1 = list;
             uArrayList1 = uArrayList;
             l1 = l;
             if (p4 != null) {
                obj5 = obj3;
                obj4 = a.g(p4.a(obj5), oobject1, z.f(obj5));
             }else {
                obj5 = obj3;
                obj4 = null;
             }
          }
          uArrayList1.add(new Pair(obj5, obj4));
          if (obj4 != null) {
             obj4.h().u(z.n(i1, oobject), i1);
          }
          i3 = i5 + 1;
          i1 = p2;
          uArrayList = uArrayList1;
          l = l1;
          list = list1;
          i2 = false;
          i = p1;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("PhotosCoverUtil", "buildSdkProcessorFromDraft cost:"+a1.o(l)+",startPos:"+p1+",size:"+p2, objArray1);
       return uArrayList;
    }
    public static void h(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, v0.class, "15")) {
          return;
       }
       String str = "error when ";
       if (p1 == null) {
          Object[] objArray = new Object[0];
          a.D().t("PhotosCoverUtil", str+p0, objArray);
       }else {
          a.D().e("PhotosCoverUtil", str+p0, p1);
       }
       return;
    }
}
