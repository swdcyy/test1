package xpa.e;
import rkd.a;
import xpa.e$a;
import nsd.u;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.Object;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels;
import java.util.Set;
import trd.d1;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import com.kwai.sdk.switchconfig.a;
import xpa.e$b;
import java.lang.reflect.Type;
import el.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.NullPointerException;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import xpa.e$c;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xpa.c;
import java.lang.Float;
import java.util.Objects;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Boolean;
import com.yxcorp.utility.RomUtils;
import com.yxcorp.gifshow.growth.pad.PadPluginImpl$checkPadFeature$1;
import java.lang.reflect.Method;
import java.lang.ClassNotFoundException;
import msd.l;
import com.yxcorp.gifshow.growth.pad.PadPluginImpl$checkPadFeature$2;
import com.yxcorp.gifshow.growth.pad.PadPluginImpl$checkPadFeature$3;
import com.yxcorp.gifshow.growth.pad.PadPluginImpl$checkPadFeature$4;
import android.os.Build;
import cra.y;
import cra.d;
import android.view.View;
import rkd.b;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import android.os.Build$VERSION;
import xf6.l;

public class e implements a	// class@002816
{
    public static final HashSet b;
    public static final ArrayList c;
    public static boolean d;
    public static boolean e;
    public static Boolean f;
    public static boolean g;
    public static final e$a h;

    static {
       e.h = new e$a(null);
       e.b = new HashSet();
       e.c = new ArrayList();
    }
    public void e(){
       super();
       PadRawDeviceModels[] padRawDevice = new PadRawDeviceModels[11];
       padRawDevice[0] = PadRawDeviceModels.HUAWEI;
       int i = 1;
       padRawDevice[i] = PadRawDeviceModels.HONOR;
       padRawDevice[2] = PadRawDeviceModels.XIAOMI;
       padRawDevice[3] = PadRawDeviceModels.LENOVO;
       padRawDevice[4] = PadRawDeviceModels.BAIDU;
       padRawDevice[5] = PadRawDeviceModels.OPPO;
       padRawDevice[6] = PadRawDeviceModels.VIVO;
       padRawDevice[7] = PadRawDeviceModels.SAMSUNG;
       padRawDevice[8] = PadRawDeviceModels.READBOY;
       padRawDevice[9] = PadRawDeviceModels.YOUXUEPAI;
       padRawDevice[10] = PadRawDeviceModels.XIAOBAWANG;
       Iterator iterator = d1.u(padRawDevice).iterator();
       while (iterator.hasNext()) {
          e.b.addAll(iterator.next().getDeviceModels());
       }
       try{
          ArrayList value = a.t().getValue("newPadRawDeviceModels", new e$b().getType(), new ArrayList());
          if (value != null && (value.isEmpty() ^ i)) {
             Iterator iterator1 = value.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   String str = iterator1.next();
                   ArrayList c = e.c;
                   if (str != null) {
                      str = str.toUpperCase();
                      a.o(str, "\(this as java.lang.String\).toUpperCase\(\)");
                      c.add(str);
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                   }
                }
             }
          }
          Object[] objArray1 = new Object[0];
          w.C().w("PadPluginImpl", "remoteModels: "+value, objArray1);
       }catch(java.lang.Exception e1){
          Object[] objArray = new Object[0];
          w.C().t("PadPluginImpl", "e: "+e1.getMessage(), objArray);
       }
       return;
    }
    public final void F(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "11")) {
          return;
       }
       e.g(new e$c(this, p0), "PadTrace");
       Result.constructor-impl(l1.a);
       return;
    }
    public int I40(int p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoe, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return c.c.b(p0, p1);
    }
    public Integer[] LT(int[] p0,int p1,Float[] p2,int[] p3){
       Integer[] obj3;
       c uoc1;
       int[] ointArray;
       int uApplication1;
       Float[] uApplication1;
       float f;
       float f1;
       int i2;
       float f3;
       object obj = p0;
       Object obj1 = p2;
       Object obj2 = p3;
       if (PatchProxy.isSupport(e.class)) {
          obj3 = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, e.class, "5");
          if (obj3 != PatchProxyResult.class) {
             return obj3;
          }
       }
       a.p(obj, "imageSize");
       a.p(obj1, "scaleRatios");
       a.p(obj2, "outerSize");
       c c = c.c;
       Objects.requireNonNull(c);
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          uoc1 = uoc;
          obj3 = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, c, c.class, "4");
          if (obj3 != PatchProxyResult.class) {
          label_0185 :
             return obj3;
          }
       }else {
          uoc1 = uoc;
       }
       a.p(obj, "imageSize");
       a.p(obj1, "scaleRatios");
       a.p(obj2, "outerSize");
       int i = 2;
       if (obj.length < i) {
          ointArray = new int[i];
          ointArray[1] = n.v(a.b());
          Application uApplication = (!obj.length)? 1: null;
          uApplication1 = (uApplication)? n.z(a.b()): obj[0];
          ointArray[0] = uApplication1;
       }else {
          ointArray = obj;
       }
       c.a();
       uApplication1 = PatchProxy.applyOneRefs(obj1, c, uoc1, "5");
       if (uApplication1 != PatchProxyResult.class) {
       }else {
          uApplication1 = new Float[i];
          f = 0x3f800000;
          uApplication1[0] = Float.valueOf(f);
          uApplication1[1] = Float.valueOf(f);
          f1 = (!obj1.length)? Float.MIN_VALUE: 0;
          if (!f1) {
             i2 = 0;
             while (i2 < i) {
                if (i2 < obj1.length) {
                   f3 = obj1[i2].floatValue();
                   if (f3 > 0 && f3 - f <= 0) {
                      uApplication1[i2] = Float.valueOf(f3);
                   }
                }
                i2 = i2 + 1;
             }
          }
       }
       f = (float)ointArray[0] / (float)ointArray[1];
       boolean i1 = p1;
       f1 = (i1 != i)? (float)1 / f: f;
       obj = 0x3fe38e39;
       if (f1 - obj > 0) {
          f = (i1 == i)? 0x3fe38e39: (float)1 / obj;
       }
    label_00f9 :
       i2 = (!obj2.length)? 1: 0;
       if (i2 ^ 1) {
          i2 = obj2[0];
       }else if(i1 == i){
          i2 = c.b;
       }else {
          i2 = c.a;
       }
       i2 = (int)((float)i2 * uApplication1[0].floatValue());
       int i3 = (!obj2.length)? 1: 0;
       if (i3 ^ 1) {
          i3 = obj2[1];
       }else if(i1 == i){
          i3 = c.a;
       }else {
          i3 = c.b;
       }
       uApplication1 = (int)((float)i3 * uApplication1[1].floatValue());
       w ow = w.C();
       StringBuilder str = "screenWidth = "+i2+"; screenHeight = "+uApplication1+';'+" isLandScape = ";
       i1 = (i1 == i)? true: false;
       Object[] objArray = new Object[0];
       ow.w("PadAdaptationUtil", str+i1, objArray);
       float f2 = (float)i2;
       f3 = (float)uApplication1;
       if (f - (f2 / f3) >= 0) {
          uApplication1 = (int)(f2 / f);
       }else {
          i2 = (int)(f3 * f);
       }
       obj3 = new Integer[i];
       obj3[0] = Integer.valueOf(i2);
       obj3[1] = Integer.valueOf(uApplication1);
       goto label_0185 ;
    }
    public boolean g1(){
       boolean b1;
       Object[] objArray4;
       Object obj5;
       Object[] objArray5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, uoe, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (e.d) {
          return e.e;
       }
       obj = String.class;
       PadPluginImpl$checkPadFeature$3 obj1 = PatchProxy.apply(objArray, this, uoe, "10");
       String str = "";
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          boolean b2 = a.t().d("enableSPTabletCheck", true);
          Object[] objArray1 = new Object[b];
          w.C().w("PadPluginImpl", "checkPadFeature enableSPTablet = "+b2, objArray1);
          if (b2) {
             String str1 = "tablet";
             if (RomUtils.n()) {
                Class obj2 = PatchProxy.applyOneRefs(new PadPluginImpl$checkPadFeature$1(this), this, uoe, "6");
                if (obj2 != patchProxyRe) {
                   b2 = obj2.booleanValue();
                }else {
                   obj2 = Class.forName("com.huawei.android.os.SystemPropertiesEx");
                   Class[] uClassArray2 = new Class[]{obj,obj};
                   Method method = obj2.getMethod("get", uClassArray2);
                   a.o(method, "clazz.getMethod\(\"get\", S¡­java, String::class.java\)");
                   objArray4 = new Object[]{"ro.build.characteristics",str};
                   obj5 = method.invoke(obj2.newInstance(), objArray4);
                   objArray5 = new Object[b];
                   w.C().w("PadPluginImpl", "isHuaweiTablet result = "+obj5, objArray5);
                   b2 = a.g(str1, obj5);
                }
                if (b2) {
                   this.F(str);
                }else if(RomUtils.w()){
                   obj2 = PatchProxy.applyOneRefs(new PadPluginImpl$checkPadFeature$2(this), this, uoe, "7");
                   if (obj2 != patchProxyRe) {
                      b2 = obj2.booleanValue();
                   }else {
                      obj2 = Class.forName("android.util.FtDeviceInfo");
                      Class[] uClassArray1 = new Class[b];
                      objArray4 = new Object[b];
                      obj5 = obj2.getMethod("getDeviceType", uClassArray1).invoke(obj2, objArray4);
                      if (obj5 != null) {
                         objArray5 = new Object[b];
                         w.C().w("PadPluginImpl", "isVivoTablet result = "+obj5, objArray5);
                         b2 = a.g(str1, obj5);
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                      }
                   }
                   if (b2) {
                      this.F(str);
                   }
                }
                if (RomUtils.s()) {
                   obj1 = new PadPluginImpl$checkPadFeature$3(this);
                   Object obj3 = PatchProxy.applyOneRefs(obj1, this, uoe, "8");
                   if (obj3 != patchProxyRe) {
                      b1 = obj3.booleanValue();
                   }else {
                      Class uClass = Class.forName("com.oplus.content.OplusFeatureConfigManager");
                      Class[] uClassArray = new Class[b];
                      Object[] objArray2 = new Object[b];
                      uClassArray = new Class[true];
                      uClassArray[b] = obj;
                      objArray = new Object[true];
                      objArray[b] = "oplus.hardware.type.tablet";
                      Throwable obj4 = uClass.getDeclaredMethod("hasFeature", uClassArray).invoke(uClass.getMethod("getInstance", uClassArray).invoke(objArray, objArray2), objArray);
                      Object[] objArray3 = new Object[b];
                      w.C().w("PadPluginImpl", "isOppoTablet result = "+obj4, objArray3);
                      if (obj4 instanceof Boolean) {
                         b1 = obj4.booleanValue();
                      }else {
                         obj4 = Result.constructor-impl(l1.a);
                         obj4 = Result.exceptionOrNull-impl(obj4);
                         if (obj4 != null) {
                            if (obj4 instanceof ClassNotFoundException) {
                               b1 = this.n(obj1);
                            }else {
                               objArray = new Object[b];
                               w.C().w("PadPluginImpl", "isOppoTablet onFailure", objArray);
                               obj1.invoke(obj4);
                            }
                         }
                         b1 = false;
                      }
                   }
                   if (b1) {
                      this.F(str);
                   }
                }
                if (this.n(new PadPluginImpl$checkPadFeature$4(this))) {
                   this.F(str);
                }
             }else {
                goto label_00f1 ;
             }
             b1 = true;
          }
          b1 = false;
       }
       e.e = b1;
       if (!b1) {
          String mODEL = Build.MODEL;
          if (mODEL != null) {
             mODEL = mODEL.toUpperCase();
             a.o(mODEL, "\(this as java.lang.String\).toUpperCase\(\)");
             if (mODEL != null) {
                str = mODEL;
             }
          }
          if (e.b.contains(str) || e.c.contains(str)) {
             b = true;
          }
          e.e = b;
          y oy = new y(b1);
       }else {
          d uod = new d(b1);
       }
       e.d = true;
       return e.e;
    }
    public void h7(View p0,int p1,int p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, e.class, "4")) {
          return;
       }
       String str = "view";
       a.p(p0, str);
       c c = c.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), c, c.class, "3")) {
          a.p(p0, str);
          if (b.g()) {
             c.a();
             if (p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                layoutParams.width = c.b(((layoutParams.leftMargin + layoutParams.rightMargin) + p1), p2);
             }
          }
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public final boolean n(l p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Class uClass = Class.forName("android.os.SystemProperties");
       Class[] uClassArray = new Class[]{String.class};
       Method method = uClass.getMethod("get", uClassArray);
       a.o(method, "clazz.getMethod\(\"get\",String::class.java\)");
       Object[] objArray = new Object[]{"ro.build.characteristics"};
       Object obj1 = method.invoke(uClass, objArray);
       if (obj1 == null) {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
       }
       Object[] objArray1 = new Object[0];
       w.C().w("PadPluginImpl", "isTargetTablet result = "+obj1, objArray1);
       return StringsKt__StringsKt.O2(obj1, "tablet", 0, 2, null);
    }
    public boolean tS(){
       Boolean obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = e.f;
       if (obj != null) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT == 26) {
          obj = Boolean.FALSE;
          e.f = obj;
          a.m(obj);
          return obj.booleanValue();
       }else {
          int i = l.e("KEY_PAD_ADAPTER", 0);
          if (i) {
             obj = (i != 1)? Boolean.FALSE: Boolean.TRUE;
             e.f = obj;
             a.m(obj);
             return obj.booleanValue();
          }else {
             obj = Boolean.valueOf(this.g1());
             e.f = obj;
             a.m(obj);
             return obj.booleanValue();
          }
       }
    }
}
