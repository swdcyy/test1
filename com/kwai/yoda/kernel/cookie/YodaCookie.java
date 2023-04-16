package com.kwai.yoda.kernel.cookie.YodaCookie;
import com.kwai.yoda.kernel.cookie.YodaCookie$mCookieManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import am8.a;
import am8.d;
import ry7.d;
import com.kwai.yoda.kernel.cookie.YodaCookie$mCookieEnableHosts$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.List;
import trd.t;
import ry7.h;
import java.util.Collection;
import java.lang.Runnable;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import ry7.e;
import ry7.i;
import trd.t0;
import java.lang.CharSequence;
import tb7.g;
import java.util.concurrent.CopyOnWriteArrayList;
import oy7.b;
import java.util.ArrayList;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.yoda.kernel.cookie.CookieManagerWrapper;
import java.util.Objects;
import java.util.Iterator;
import kotlin.text.StringsKt__StringsKt;
import kotlin.Pair;
import zsd.u;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.yoda.kernel.cookie.CookieModel;
import tb7.j;
import ub7.f;
import tb7.a;
import sy7.b;
import java.lang.StringBuilder;
import kotlin.text.Regex;
import vy7.a;
import vy7.a$a;
import com.kwai.middleware.azeroth.Azeroth2;
import o97.a;
import o97.a$a;
import qrd.l1;
import kotlin.TypeCastException;
import com.kwai.yoda.kernel.cookie.YodaCookie$a;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.CookieManager;
import com.kwai.yoda.kernel.cookie.YodaCookie$b;

public final class YodaCookie	// class@00129b
{
    public static b a;
    public static final p b;
    public static a c;
    public static d d;
    public static final p e;
    public static final YodaCookie f;

    static {
       YodaCookie.f = new YodaCookie();
       YodaCookie.b = s.c(YodaCookie$mCookieManager$2.INSTANCE);
       YodaCookie.c = d.b("yoda_cookie", 0);
       YodaCookie.d = new d();
       YodaCookie.e = s.c(YodaCookie$mCookieEnableHosts$2.INSTANCE);
    }
    public void YodaCookie(){
       super();
    }
    public final void a(String p0,boolean p1){
       YodaCookie yodaCookie = YodaCookie.class;
       if (PatchProxy.isSupport(yodaCookie) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, yodaCookie, "21")) {
          return;
       }
       a.q(p0, "host");
       List list = t.k(p0);
       if (!PatchProxy.isSupport(yodaCookie) || !PatchProxy.applyVoidTwoRefs(list, Boolean.valueOf(p1), this, yodaCookie, "22")) {
          a.q(list, "hosts");
          if (p1) {
             YodaCookie.c.execute(new h(list));
          }else {
             this.j(list);
          }
       }
       return;
    }
    public final Map b(){
       Object obj = PatchProxy.apply(null, this, YodaCookie.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaCookie.d.a();
    }
    public final e c(String p0,boolean p1){
       e uoe;
       e uoe1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       YodaCookie yodaCookie = YodaCookie.class;
       if (PatchProxy.isSupport(yodaCookie)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, yodaCookie, "18");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       List list = t.k(p0);
       if (PatchProxy.isSupport(yodaCookie)) {
          uoe = PatchProxy.applyTwoRefs(list, Boolean.valueOf(p1), this, yodaCookie, "19");
          if (uoe != patchProxyRe) {
          label_0056 :
             return uoe;
          }
       }
       a.q(list, "host");
       if (p1) {
          YodaCookie.c.execute(new i(list));
          uoe1 = new e(t0.z(), t0.z());
       }else {
          uoe1 = this.k(list);
       }
       uoe = uoe1;
       goto label_0056 ;
    }
    public final e d(String p0,boolean p1){
       Map obj;
       YodaCookie yodaCookie = YodaCookie.class;
       if (PatchProxy.isSupport(yodaCookie)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, yodaCookie, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = this.e(p0);
       obj = (p0 == null || !p0.length())? 1: null;
       if (obj) {
          return new e(t0.z(), t0.z());
       }else {
          return this.c(p0, p1);
       }
    }
    public final String e(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       YodaCookie yodaCookie = YodaCookie.class;
       String obj = PatchProxy.applyOneRefs(p0, this, yodaCookie, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       int i = (p0 == null || !p0.length())? 1: 0;
       if (i) {
          return null;
       }else {
          p0 = g.a(p0);
          if (!p0.length()) {
             obj = 1;
          }
          if (obj) {
             return null;
          }else {
             b uob = PatchProxy.apply(null, this, yodaCookie, "10");
             if (uob != patchProxyRe) {
             }else if(this.h().isEmpty()){
                b a = YodaCookie.a;
                if (a != null) {
                   a = a.b;
                   if (a != null) {
                   label_0052 :
                      uob = a;
                   }
                }
                ArrayList uArrayList = new ArrayList();
                goto label_0052 ;
             }else {
                uob = CollectionsKt___CollectionsKt.G5(this.h());
             }
             return g.c(p0, uob);
          }
       }
    }
    public final List f(String p0){
       int i1;
       int i4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaCookie.class, "29");
       if (obj != patchProxyRe) {
          return obj;
       }
       CookieManagerWrapper uCookieManag = (p0 == null || !p0.length())? 1: null;
       if (uCookieManag) {
          return CollectionsKt__CollectionsKt.E();
       }else {
          uCookieManag = this.i();
          Objects.requireNonNull(uCookieManag);
          List list = PatchProxy.applyOneRefs(p0, uCookieManag, CookieManagerWrapper.class, "7");
          if (list != patchProxyRe) {
          }else {
             List list1 = uCookieManag.b(p0);
             if (list1.isEmpty()) {
                list = CollectionsKt__CollectionsKt.E();
             }else {
                list = new ArrayList();
                Iterator iterator = list1.iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   String str1 = "=";
                   String[] stringArray = new String[]{str1};
                   List list2 = StringsKt__StringsKt.H4(str, stringArray, false, 0, 6, null);
                   int i = 2;
                   if (list2.size() == i) {
                      str = list2.get(0);
                      i1 = str.length() - 1;
                      int i2 = 0;
                      i = 0;
                      while (true) {
                         if (i2 <= i1) {
                            int i3 = (!i)? i2: i1;
                            i3 = (str.charAt(i3) <= ' ')? 1: 0;
                            if (!i) {
                               if (!i3) {
                                  i = 1;
                               }else {
                                  i2 = i2 + 1;
                                  continue ;
                               }
                            }else if(!i3){
                            label_00a2 :
                               i1 = i1 + 1;
                               str = str.subSequence(i2, i1).toString();
                               str1 = list2.get(1);
                               i4 = str1.length() - 1;
                               i2 = 0;
                               i = false;
                               while (true) {
                                  if (i2 <= i4) {
                                     i3 = (!i)? i2: i4;
                                     i3 = (str1.charAt(i3) <= ' ')? 1: 0;
                                     if (!i) {
                                        if (!i3) {
                                           i = true;
                                        }else {
                                           i2 = i2 + 1;
                                           continue ;
                                        }
                                     }else if(!i3){
                                     label_00d8 :
                                        i4 = i4 + 1;
                                        list.add(new Pair(str, str1.subSequence(i2, i4).toString()));
                                     }else {
                                        i4 = i4 - 1;
                                        continue ;
                                     }
                                  }else {
                                     goto label_00d8 ;
                                  }
                               }
                            }else {
                               i1 = i1 - 1;
                               continue ;
                            }
                         }else {
                            goto label_00a2 ;
                         }
                      }
                   }else if(list2.size() == 1 && u.H1(str, str1, 0, i, null)){
                      str = list2.get(0);
                      i1 = str.length() - 1;
                      i4 = 0;
                      stringArray = null;
                      while (true) {
                         if (i4 <= i1) {
                            i = (!stringArray)? i4: i1;
                            i = (str.charAt(i) <= ' ')? 1: 0;
                            if (!stringArray) {
                               if (!i) {
                                  stringArray = 1;
                               }else {
                                  i4 = i4 + 1;
                                  continue ;
                               }
                            }else if(!i){
                            label_0125 :
                               i1 = i1 + 1;
                               list.add(new Pair(str.subSequence(i4, i1).toString(), ""));
                            }else {
                               i1 = i1 - 1;
                               continue ;
                            }
                         }else {
                            goto label_0125 ;
                         }
                      }
                   }
                }
             }
          }
          return list;
       }
    }
    public final List g(Map p0,boolean p1,boolean p2){
       ArrayList obj;
       boolean this;
       if (PatchProxy.isSupport(YodaCookie.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, YodaCookie.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.q(p0, "cookieMap");
       obj = new ArrayList();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          String value = uEntry.getValue();
          this = true;
          int i = (!key.length())? 1: 0;
          if (i) {
             continue ;
          }else if(value != null){
             value = "";
          }
          YodaCookie f = YodaCookie.f;
          Objects.requireNonNull(f);
          if (PatchProxy.isSupport(YodaCookie.class)) {
             b obj1 = PatchProxy.applyTwoRefs(key, Boolean.valueOf(p2), f, YodaCookie.class, "35");
             if (obj1 != PatchProxyResult.class) {
                this = obj1.booleanValue();
             }else if(p2){
                Boolean uBoolean = null;
                if (j.a(key, "lat") || j.a(key, "lon")) {
                   obj1 = YodaCookie.a;
                   if (obj1 != null) {
                      obj1 = obj1.c;
                      if (obj1 != null) {
                         uBoolean = obj1.get();
                      }
                   }
                   if (a.c(uBoolean)) {
                   label_00c7 :
                      this = false;
                   }
                }else if(j.a(key, "ll")){
                   obj1 = YodaCookie.a;
                   if (obj1 != null) {
                      obj1 = obj1.d;
                      if (obj1 != null) {
                         uBoolean = obj1.get();
                      }
                   }
                   if (a.c(uBoolean)) {
                   }
                }else {
                   goto label_00c7 ;
                }
             }
          }else {
             goto label_007e ;
          }
          CookieModel uCookieModel = new CookieModel(key, value, p1, this);
          b.b.g("Create cookie param ["+uCookieModel+']');
          obj.add(uCookieModel);
       }
       return obj;
    }
    public final CopyOnWriteArrayList h(){
       Object obj = PatchProxy.apply(null, this, YodaCookie.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaCookie.e.getValue();
    }
    public final CookieManagerWrapper i(){
       Object obj = PatchProxy.apply(null, this, YodaCookie.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaCookie.b.getValue();
    }
    public final void j(Collection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaCookie.class, "23")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(this.g(YodaCookie.d.a(), false, true));
       uArrayList.addAll(this.g(YodaCookie.d.b(), true, true));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          YodaCookie yodaCookie = (str.length() > 0)? 1: null;
          if (yodaCookie) {
             YodaCookie.f.l(str, uArrayList);
          }
       }
       return;
    }
    public final e k(Collection p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, YodaCookie.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = YodaCookie.d.a();
       Map map = YodaCookie.d.b();
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(this.g(obj, false, false));
       uArrayList.addAll(this.g(map, true, false));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          YodaCookie yodaCookie = (str == null || !str.length())? 1: null;
          if (!yodaCookie) {
             YodaCookie.f.l(str, uArrayList);
          }
       }
       return new e(obj, map);
    }
    public final void l(String p0,List p1){
       a$a a;
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaCookie.class, "34")) {
          return;
       }
       if (p1.isEmpty()) {
          return;
       }
       CookieManagerWrapper uCookieManag = this.i();
       Objects.requireNonNull(uCookieManag);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CookieManagerWrapper uCookieManag1 = CookieManagerWrapper.class;
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, uCookieManag, uCookieManag1, "9")) {
          a.q(p0, "host");
          a.q(p1, "cookieParams");
          String str = PatchProxy.applyOneRefs(p0, uCookieManag, uCookieManag1, "10");
          Object[] objArray = null;
          if (str != patchProxyRe) {
          }else if(!StringsKt__StringsKt.O2(new Regex("\\.\(?:com\\.cn|cn|com|net|edu\\..*|org\)").replace(p0, ""), ".", false, 2, objArray)){
             p0 = "www."+p0;
          }
          str = p0;
          a = a.a;
          Objects.requireNonNull(a);
          a = PatchProxy.apply(objArray, a, a$a.class, "1");
          if (a != patchProxyRe) {
             b = a.booleanValue();
          }else {
             a uoa = Azeroth2.B.q();
             b = (uoa != null)? a$a.b(uoa, null, "set_cookie_need_protocol", true, 1, null): true;
          }
          b = (b)? "https://"+str: "http://"+str;
          if (str != null) {
             String str1 = str.intern();
             a.h(str1, "\(this as java.lang.String\).intern\(\)");
             _monitor_enter(str1);
             uCookieManag.e(b, str, p1);
             _monitor_exit(str1);
          }else {
             throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
          }
       }
       return;
    }
    public final boolean m(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaCookie.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = this.e(p0);
       int i = (p0 == null || !p0.length())? 1: 0;
       return (i ^ 1);
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, YodaCookie.class, "4")) {
          return;
       }
       this.i();
       return;
    }
    public final void o(String p0,Map p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(YodaCookie.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, YodaCookie.class, "26")) {
          return;
       }
       a.q(p0, "host");
       a.q(p1, "cookieMap");
       if (p3) {
          YodaCookie.c.execute(new YodaCookie$a(p0, p1, p2));
          e uoe = new e(t0.z(), t0.z());
       }else {
          this.l(p0, this.g(p1, p2, true));
       }
       return;
    }
    public final void p(WebView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaCookie.class, "15")) {
          return;
       }
       String str = "webView";
       a.q(p0, str);
       CookieManagerWrapper uCookieManag = this.i();
       Objects.requireNonNull(uCookieManag);
       CookieManagerWrapper uCookieManag1 = CookieManagerWrapper.class;
       if (!PatchProxy.isSupport(uCookieManag1) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.TRUE, uCookieManag, uCookieManag1, "4")) {
          a.q(p0, str);
          CookieManager uCookieManag2 = uCookieManag.c();
          if (uCookieManag2 != null) {
             uCookieManag2.setAcceptThirdPartyCookies(p0, true);
          }
       }
       return;
    }
    public final void q(String p0,Map p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(YodaCookie.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, YodaCookie.class, "24")) {
          return;
       }
       a.q(p0, "host");
       a.q(p1, "cookieMap");
       if (p3) {
          YodaCookie.c.execute(new YodaCookie$b(p0, p1, p2));
          e uoe = new e(t0.z(), t0.z());
       }else {
          this.l(p0, this.g(p1, p2, false));
       }
       return;
    }
}
