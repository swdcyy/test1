package com.yxcorp.gifshow.init.module.DensityInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.ABTestInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import xf6.l;
import com.yxcorp.utility.Log;
import cw9.b;
import android.app.Application;
import lnc.d2;
import rkd.b;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import java.lang.StringBuilder;
import java.lang.Float;
import java.lang.Number;
import java.lang.Math;
import cw9.a;
import android.content.ComponentCallbacks;
import android.content.Context;
import com.yxcorp.utility.n;

public class DensityInitModule extends a	// class@001974
{

    public void DensityInitModule(){
       super();
    }
    public int f0(){
       return 23;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, DensityInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{ABTestInitModule.class};
       PatchProxy.onMethodExit(DensityInitModule.class, "3");
       return Lists.e(obj);
    }
    public void n(){
       boolean b1;
       boolean b2;
       String a;
       Object obj4;
       float f4;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidWithListener(null, obj, DensityInitModule.class, "1")) {
          return;
       }
       String str = "2";
       Application obj1 = PatchProxy.applyWithListener(null, obj, DensityInitModule.class, str);
       float f = 0.00f;
       String str1 = null;
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          b1 = a.t().d("AndroidSensoryOptimization", str1);
          if (a.d() && SystemUtil.K()) {
             int i = l.e("KEY_GLOBAL_ADAPT_DPI", str1);
             if (i != b) {
                if (i == f) {
                   b1 = false;
                }
             }else {
                b1 = true;
             }
          }
          PatchProxy.onMethodExit(DensityInitModule.class, str);
       }
       if (!b1) {
          Log.g("DensityInitModule", "density ab not enable");
          PatchProxy.onMethodExit(DensityInitModule.class, "1");
          return;
       }else {
          float f1 = 0x3f89999a;
          if (a.d() && SystemUtil.K()) {
             b.b = l.d("KEY_DPI_SCALE_LIMIT", f1);
             b.c = l.d("KEY_NORMAL_DPI", 144.00f);
          }
          obj1 = a.b();
          if (!PatchProxy.applyVoidOneRefs(obj1, null, b.class, "1")) {
             Configuration obj2 = PatchProxy.apply(null, null, b.class, str);
             if (obj2 != patchProxyRe) {
                b2 = obj2.booleanValue();
             }else if(d2.g()){
                if (!b.g()) {
                   obj4 = ((a.b().getResources().getConfiguration().screenLayout & 0x0f) >= 3)? 1: 0;
                   if (!obj4) {
                   label_00c2 :
                      b2 = true;
                   }
                }
             }
             b2 = false;
             if (!b2) {
                Log.g(b.a, "ignore fold and tablet device");
             }else if(obj1.getResources() == null){
                obj2 = obj1.getResources().getConfiguration();
                if (!PatchProxy.applyVoidOneRefs(obj2, null, b.class, "3")) {
                   Resources resources = a.b().getResources();
                   if (resources != null) {
                      DisplayMetrics displayMetri = resources.getDisplayMetrics();
                      if (displayMetri != null) {
                         float f2 = ((float)obj2.densityDpi * 0x3f800000) / 160.00f;
                         if (f2 - b.f) {
                            b.f = f2;
                            b.h = displayMetri.widthPixels;
                            b.i = displayMetri.heightPixels;
                            a = b.a;
                            Log.g(a, "sOriginalDensity="+b.f);
                            f1 = (float)displayMetri.widthPixels;
                            DisplayMetrics xdpi = displayMetri.xdpi;
                            if (obj2.orientation == f) {
                               f1 = (float)displayMetri.heightPixels;
                               xdpi = displayMetri.ydpi;
                            }
                            float f3 = b.f;
                            f = f1 / f3;
                            if (f - 0x43a00000 < 0 || f - 0x43cf0000 > 0) {
                               b.h();
                               Log.g(a, "originWidthInDp is not in [320, 414]:"+f);
                            }else {
                               f3 = xdpi / f3;
                               if (PatchProxy.isSupport(b.class)) {
                                  Object obj3 = PatchProxy.applyTwoRefs(Float.valueOf(f1), Float.valueOf(xdpi), null, b.class, "7");
                                  if (obj3 != patchProxyRe) {
                                     f = obj3.floatValue();
                                  }else {
                                  label_016f :
                                     f1 = f1 / xdpi;
                                     f = 0x43c0f5c3 / f1;
                                     if (a.d() && SystemUtil.K()) {
                                        f = (b.c * 0x402b851f) / f1;
                                     }
                                  }
                               }else {
                                  goto label_016f ;
                               }
                               if (f3 - f >= 0) {
                                  b.h();
                                  Log.g(a, "originalDpi is larger than targetDpi:"+f3);
                               }else {
                                  b.d = b;
                                  if (PatchProxy.isSupport(b.class)) {
                                     obj4 = PatchProxy.applyTwoRefs(Float.valueOf(xdpi), Float.valueOf(f), null, b.class, "5");
                                     if (obj4 != patchProxyRe) {
                                        f4 = obj4.floatValue();
                                     label_01f4 :
                                        b.g = f4;
                                        Log.g(a, "sTargetDensity="+b.g);
                                        b.e = b.f(b.g);
                                        Log.g(a, "sHookBitmapSucceed="+b.e);
                                     }
                                  }
                                  obj4 = PatchProxy.apply(null, null, b.class, "6");
                                  if (obj4 != patchProxyRe) {
                                     f1 = obj4.floatValue();
                                  }else if(a.d() && SystemUtil.K()){
                                     f1 = b.b;
                                  }else {
                                     f1 = 0x3f89999a;
                                  }
                                  f4 = ((float)(int)(Math.max((xdpi / f), (b.f / f1)) * 160.00f) * 0x3f800000) / 160.00f;
                                  goto label_01f4 ;
                               }
                            }
                         }
                      }
                   }
                }
                obj1.registerComponentCallbacks(new a());
                if (!PatchProxy.applyVoidOneRefs(obj1, null, b.class, "8") && b.g()) {
                   n.A(obj1);
                }
                b.j(a.b().getResources(), false);
             }
          }
          PatchProxy.onMethodExit(DensityInitModule.class, "1");
          return;
       }
    }
}
