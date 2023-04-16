package ab4.f;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import com.kuaishou.merchant.router.RouterConfig;
import us3.i;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import android.app.Activity;
import ab4.g;
import com.kuaishou.merchant.router.annotation.RouteType;
import bb4.a;
import java.util.Map;
import android.net.Uri;
import ekd.x0;
import bb4.b;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.StringBuilder;
import android.os.Bundle;
import ab4.e;
import java.lang.Enum;
import java.lang.reflect.Constructor;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.router.b;
import lb4.c;
import com.kuaishou.merchant.api.router.FragmentConfig;
import java.lang.Throwable;
import android.content.Intent;
import us3.a;
import n3d.a$a;
import n3d.a;
import androidx.core.content.ContextCompat;
import bb4.c;
import androidx.fragment.app.c;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.e;
import java.lang.Number;
import z1.a;

public final class f	// class@00005f
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public static i c(f p0,Context p1,String p2,RouterConfig p3,boolean p4,int p5,int p6,Object p7){
       i oi;
       String obj2;
       int i6;
       String str1;
       String str2;
       Object obj3;
       String str4;
       i obj = p0;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       int i = (p6 & 0x10)? 1: p5;
       try{
          Objects.requireNonNull(p0);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          f uof = f.class;
          boolean i1 = 4;
          int i2 = 3;
          int i3 = 5;
          int i4 = 2;
          int i5 = 0;
          if (PatchProxy.isSupport(uof)) {
             Object[] objArray = new Object[i3];
             objArray[i5] = oobject;
             objArray[1] = oobject1;
             objArray[i4] = oobject2;
             objArray[i2] = Boolean.valueOf(p4);
             objArray[i1] = Integer.valueOf(i);
             oi = PatchProxy.apply(objArray, obj, uof, "7");
             if (oi != patchProxyRe) {
             }else {
             label_0043 :
                a.p(oobject, "context");
                a.p(oobject2, "config");
                v6 = oobject instanceof Activity;
                String str = "MerchantRouterHandler";
                String obj1 = null;
                if (v6 && oobject.isFinishing()) {
                   g.b(str, "route\(\): 页面finishing");
                   obj = new i(obj1, obj1, i3);
                }else {
                   a uoa = a.b();
                   a.o(uoa, "MerchantRouterMap.getInstance\(\)");
                   Objects.requireNonNull(uoa);
                   obj2 = PatchProxy.apply(obj1, uoa, a.class, "3");
                   i1 = (obj2 != patchProxyRe)? obj2.booleanValue(): a.a.isEmpty();
                   if (i1) {
                      g.b(str, "route\(\): 注册表为空");
                      obj = new i(obj1, obj1, 1);
                   }else {
                      obj2 = "router\(\) 非法url: ";
                      if (oobject1 != null) {
                         Uri uri = (!p2.length())? 1: null;
                         if (!uri) {
                            uri = x0.f(p2);
                            String host = (uri != null)? uri.getHost(): obj1;
                            if (uri != null) {
                               i6 = v6;
                               str1 = uri.getScheme();
                            }else {
                               i6 = v6;
                               str1 = obj1;
                            }
                            if (str1 != null) {
                               int i7 = (str1.length() > 0)? 1: 0;
                               if (i7 == 1 && host != null) {
                                  oi = (host.length() > 0)? 1: null;
                                  if (oi == 1) {
                                     obj1 = (obj.b(str1))? "/merchant_yoda": uri.getPath();
                                     b uob = a.b().a(obj1);
                                     if (uob == null) {
                                        String str3 = PatchProxy.applyOneRefs(oobject1, obj, uof, "11");
                                        if (str3 != patchProxyRe) {
                                           obj2 = str;
                                           str4 = str1;
                                           i2 = i6;
                                           obj3 = null;
                                        }else {
                                           Object obj5 = null;
                                           if (StringsKt__StringsKt.O2(oobject1, "?", i5, i4, obj5) == true) {
                                              obj3 = obj5;
                                              obj2 = str;
                                              str4 = str1;
                                              i2 = i6;
                                              i3 = 0;
                                              str3 = oobject1.substring(i3, StringsKt__StringsKt.i3(p2, "?", null, 0, 6, 0));
                                              a.o(str3, "\(this as java.lang.Strin…ing\(startIndex, endIndex\)");
                                           }else {
                                              obj3 = obj5;
                                              obj2 = str;
                                              str4 = str1;
                                              i2 = i6;
                                              i3 = 0;
                                              str3 = oobject1;
                                           }
                                        }
                                        uob = a.b().a(str3);
                                        if (uob == null) {
                                           g.b(obj2, "route\(\) : 请确认当前url是否已注册，"+oobject1);
                                           oi = new i(obj3, obj3, 3);
                                        }
                                     }else {
                                        str4 = str1;
                                        i2 = i6;
                                        i3 = 0;
                                        obj3 = null;
                                     }
                                     p3.d().putString("KEY_MERCHANT_ROUTER_URL", oobject1);
                                     b b = uob.b;
                                     if (b != null) {
                                        int i8 = e.a[b.ordinal()];
                                        int i9 = -1;
                                        if (i8 != 1) {
                                           if (i8 == 2) {
                                              Class uClass = uob.a();
                                              Class[] uClassArray = new Class[0];
                                              Object[] objArray1 = new Object[0];
                                              Object obj4 = uClass.getConstructor(uClassArray).newInstance(objArray1);
                                              if (obj4 instanceof Fragment) {
                                                 b = b.f().c;
                                                 if (b != null) {
                                                    Bundle uBundle = b.a(oobject1);
                                                    if (uBundle != null) {
                                                       p3.d().putAll(uBundle);
                                                    }
                                                 }
                                                 if (obj.b(str4)) {
                                                    p3.d().putBoolean("MERCHANT_ROUTER_TAG", 1);
                                                    p3.d().putBoolean("BACK_STACK", 1);
                                                 }
                                                 obj4.setArguments(p3.d());
                                                 obj.a(obj4, p3.c());
                                                 if (p4) {
                                                    if (obj.d(obj4, p3.b())) {
                                                       obj = new i(obj4, RouteType.FRAGMENT, i9);
                                                    }else {
                                                       obj = new i(obj4, RouteType.FRAGMENT, 5);
                                                    }
                                                 }else {
                                                    oi = new i(obj4, RouteType.FRAGMENT, i9);
                                                 }
                                              }
                                           }
                                        }else {
                                           Intent intent = new Intent(oobject, uob.a());
                                           intent.putExtras(p3.d());
                                           intent.setFlags(p3.a().a);
                                           if (!i2) {
                                              intent.addFlags(0x10000000);
                                           }
                                           a b1 = p3.a().b;
                                           if (b1 != null) {
                                              intent.setAction(b1);
                                           }
                                           if (p4) {
                                              if (oobject instanceof a$a && p3.a().a() != null) {
                                                 oobject.t1(intent, i, p3.a().a());
                                              }else {
                                                 ContextCompat.startActivity(oobject, intent, obj3);
                                              }
                                              if (p3.a().b() != i9 && (p3.a().c() != i9 && i2)) {
                                                 oobject.overridePendingTransition(p3.a().b(), p3.a().c());
                                              }
                                           }
                                        label_02ab :
                                           oi = new i(intent, RouteType.ACTIVITY, i9);
                                        }
                                     }
                                     oi = new i(obj3, obj3, 6);
                                  }
                               }
                            label_02b3 :
                               str2 = str;
                               obj3 = null;
                            }else {
                               obj3 = obj1;
                               str2 = str;
                            }
                            g.b(str2, obj2+oobject1);
                            oi = new i(obj3, obj3, 2);
                         }
                      }
                      g.b(str, obj2+oobject1);
                      oi = new i(obj1, obj1, 2);
                   }
                }
                oi = obj;
             }
          }else {
             goto label_0043 ;
          }
       }catch(java.lang.Exception e0){
          g.a(obj2, "route\(\): url: "+oobject1, e0);
          oi = new i(obj3, RouteType.FRAGMENT, 4);
       }
       return oi;
    }
    public final void a(Object p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "9")) {
          return;
       }
       if (p1.isEmpty() ^ 0x01) {
          if (!p0 instanceof c) {
             g.b("MerchantRouterHandler", p0.getClass()+" should be impl RouterInject interface #########");
          }else {
             p0.W3(p1);
          }
       }
       return;
    }
    public final boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.g("http", p0) || a.g("https", p0))? true: false;
       return b;
    }
    public final boolean d(Fragment p0,FragmentConfig p1){
       FragmentConfig uFragmentCon = FragmentConfig.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = p1.d();
       String str = "MerchantRouterHandler";
       int b = false;
       if (obj != null) {
          String str1 = p1.a();
          if (str1 != null) {
             Class uClass = (!str1.length())? 1: null;
             if (!uClass) {
                str1 = p1.a();
             label_003e :
                if (p0 instanceof DialogFragment) {
                   p0.show(obj, str1);
                   return true;
                }else if(p1.c() <= 0){
                   g.b(str, "showFragment\(\): FragmentConfig.containerId should be set a valid value #########");
                   return b;
                }else {
                   e uoe = obj.beginTransaction();
                   Object obj1 = PatchProxy.apply(null, p1, uFragmentCon, "3");
                   b = (obj1 != patchProxyRe)? obj1.intValue(): p1.b().getInt("animEnter");
                   Object obj2 = PatchProxy.apply(null, p1, uFragmentCon, "5");
                   int i = (obj2 != patchProxyRe)? obj2.intValue(): p1.b().getInt("animExit");
                   Object obj3 = PatchProxy.apply(null, p1, uFragmentCon, "7");
                   int i1 = (obj3 != patchProxyRe)? obj3.intValue(): p1.b().getInt("animPopEnter");
                   Object obj4 = PatchProxy.apply(null, p1, uFragmentCon, "9");
                   int i2 = (obj4 != patchProxyRe)? obj4.intValue(): p1.b().getInt("animPopExit");
                   uoe.z(b, i, i1, i2);
                   a.o(uoe, "fragmentManager.beginTra…      config.animPopExit\)");
                   obj1 = PatchProxy.apply(null, p1, uFragmentCon, "15");
                   b = (obj1 != patchProxyRe)? obj1.booleanValue(): p1.b().getBoolean("backStack");
                   if (b) {
                      uoe.j(str1);
                   }
                   if (!p0.isAdded()) {
                      Object obj5 = PatchProxy.apply(null, p1, uFragmentCon, "17");
                      boolean b1 = (obj5 != patchProxyRe)? obj5.booleanValue(): p1.b().getBoolean("forceReplace");
                      if (!b1) {
                         uoe.f(p1.c(), p0);
                      label_0113 :
                         uoe.m();
                         return true;
                      }
                   }
                   uoe.v(p1.c(), p0);
                   goto label_0113 ;
                }
             }
          }
          str1 = p0.getClass().getSimpleName();
          goto label_003e ;
       }else {
          g.b(str, "showFragment\(\): fragmentManager should be configured #########");
          return b;
       }
    }
    public final RouterConfig e(a p0){
       RouterConfig obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "consumer");
       obj = new RouterConfig();
       obj.g(p0);
       return obj;
    }
    public final RouterConfig f(a p0){
       RouterConfig obj = PatchProxy.applyOneRefs(p0, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "consumer");
       obj = new RouterConfig();
       obj.h(p0);
       return obj;
    }
}
