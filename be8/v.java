package be8.v;
import java.lang.Object;
import android.app.Activity;
import com.mini.js.jsapi.base.bean.SystemSafeAreaBean;
import bj8.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import zi8.p;
import android.content.Context;
import zi8.w0;
import zi8.m1;
import java.lang.ClassLoader;
import java.lang.reflect.Method;
import java.lang.Number;
import android.content.res.Resources;
import cw9.c;
import zi8.c;
import com.mini.d;
import android.view.Window;
import android.view.View;
import android.view.WindowInsets;
import android.view.DisplayCutout;
import java.util.List;
import android.os.Build$VERSION;
import java.lang.Integer;
import zi8.u0;
import android.content.res.Configuration;

public class v	// class@000343
{

    public void v(){
       super();
    }
    public static SystemSafeAreaBean a(Activity p0){
       SystemSafeAreaBean systemSafeAr;
       int i;
       f uof = f.class;
       Application obj = PatchProxy.applyOneRefs(p0, null, v.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!f.a(p.a())) {
          return v.c(p0);
       }
       if (w0.f() && f.c(p.a())) {
          systemSafeAr = PatchProxy.applyOneRefs(p0, null, v.class, "5");
          if (systemSafeAr != PatchProxyResult.class) {
          }else {
             systemSafeAr = v.f(p0, 0, 0, m1.u((float)m1.o(p.a())), 0);
          }
       }else if(w0.g() && (f.d(p.a()) || f.e(p0))){
          systemSafeAr = PatchProxy.applyOneRefs(p0, null, v.class, "4");
          if (systemSafeAr != PatchProxyResult.class) {
          }else {
             systemSafeAr = v.f(p0, 0, 0, m1.u(32.00f), 0);
          }
       }else if(w0.c() && f.b(p.a())){
          obj = PatchProxy.applyOneRefs(p0, null, v.class, "6");
          if (obj != PatchProxyResult.class) {
          label_0099 :
             systemSafeAr = obj;
          }else {
             obj = p.a();
             int[] ointArray = PatchProxy.applyOneRefs(obj, null, uof, "9");
             if (ointArray != PatchProxyResult.class) {
             }else {
                try{
                   Class uClass = obj.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                   Class[] uClassArray = new Class[0];
                   Object[] objArray = new Object[0];
                   ointArray = uClass.getMethod("getNotchSize", uClassArray).invoke(uClass, objArray);
                }catch(java.lang.ClassNotFoundException e0){
                }catch(java.lang.NoSuchMethodException e0){
                }catch(java.lang.Exception e0){
                }
             }
          }
       }else if(w0.e() && f.f(p.a())){
          Object obj1 = PatchProxy.applyOneRefs(p0, null, v.class, "7");
          if (obj1 != PatchProxyResult.class) {
             goto label_0099 ;
          }else {
             obj = p.a();
             Object obj2 = PatchProxy.applyOneRefs(obj, null, uof, "10");
             if (obj2 != PatchProxyResult.class) {
                i = obj2.intValue();
             }else {
                i = obj.getResources().getIdentifier("notch_height", "dimen", "android");
                i = (i > 0)? c.b(obj.getResources(), i): m1.u((float)m1.o(obj));
             }
             systemSafeAr = v.f(p0, 0, 0, i, 0);
          }
       }
       systemSafeAr = null;
       if (systemSafeAr == null) {
          systemSafeAr = PatchProxy.applyOneRefs(p0, null, v.class, "8");
          if (systemSafeAr != PatchProxyResult.class) {
          }else {
             systemSafeAr = v.f(p0, 0, 0, m1.u((float)m1.o(p.a())), 0);
          }
       }
       return systemSafeAr;
    }
    public static SystemSafeAreaBean b(Activity p0){
       List obj = null;
       View obj1 = PatchProxy.applyOneRefs(p0, obj, v.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       String str = "#MiniSystemInfo#";
       if (!c.b(p0)) {
          d.c(str, "activity is not available");
          return obj;
       }else if(p0.getWindow() != null){
          obj1 = p0.getWindow().peekDecorView();
          if (obj1 != null) {
             WindowInsets rootWindowIn = obj1.getRootWindowInsets();
             if (rootWindowIn != null) {
                DisplayCutout displayCutou = rootWindowIn.getDisplayCutout();
                if (displayCutou != null) {
                   obj = displayCutou.getBoundingRects();
                   if (obj != null && obj.size()) {
                      return v.e(p0, m1.u((float)displayCutou.getSafeInsetLeft()), m1.u((float)displayCutou.getSafeInsetRight()), m1.u((float)displayCutou.getSafeInsetTop()), m1.u((float)displayCutou.getSafeInsetBottom()));
                   }
                }
                return v.c(p0);
             }
          }
       }
       d.c(str, "页面元素未准备好！！！");
       return obj;
    }
    public static SystemSafeAreaBean c(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, v.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return v.f(p0, 0, 0, 0, 0);
    }
    public static SystemSafeAreaBean d(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Build$VERSION.SDK_INT >= 28) {
          return v.b(p0);
       }
       return v.a(p0);
    }
    public static SystemSafeAreaBean e(Activity p0,int p1,int p2,int p3,int p4){
       SystemSafeAreaBean obj;
       int i1;
       v ov = v.class;
       int i = 0;
       if (PatchProxy.isSupport(ov)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, ov, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (c.b(p0) && !u0.f()) {
          i = m1.l(p0);
          i1 = m1.n(p0);
       }else {
          i1 = 0;
       }
       if (!i || !i1) {
          i = m1.u((float)m1.k(p.a())) + m1.u((float)m1.o(p.a()));
          i1 = m1.u((float)m1.m(p.a()));
       }
       obj = new SystemSafeAreaBean();
       obj.left = p1;
       obj.right = i1 - p2;
       obj.top = p3;
       obj.bottom = i - p4;
       obj.width = (i1 - p1) - p2;
       obj.height = (i - p3) - p4;
       return obj;
    }
    public static SystemSafeAreaBean f(Activity p0,int p1,int p2,int p3,int p4){
       v ov = v.class;
       int i = 1;
       if (PatchProxy.isSupport(ov)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, ov, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p.a().getResources().getConfiguration().orientation == 2) {
          i = 0;
       }
       int i1 = (i)? p1: p3;
       int i2 = (i)? p2: p4;
       if (i) {
          p1 = p3;
       }
       if (i) {
          p2 = p4;
       }
       return v.e(p0, i1, i2, p1, p2);
    }
}
