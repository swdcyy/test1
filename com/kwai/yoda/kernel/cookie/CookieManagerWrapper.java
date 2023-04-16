package com.kwai.yoda.kernel.cookie.CookieManagerWrapper;
import com.kwai.yoda.kernel.cookie.CookieManagerWrapper$a;
import nsd.u;
import java.lang.Object;
import com.kwai.yoda.kernel.cookie.CookieManagerWrapper$mHostCookieSetHash$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.webkit.CookieManager;
import sy7.b;
import java.lang.Throwable;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.CharSequence;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import android.os.Build$VERSION;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import com.kuaishou.webkit.CookieSyncManager;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.yoda.kernel.cookie.CookieModel;
import vy7.a;
import java.util.Objects;
import vy7.a$a;
import o97.a;
import o97.a$a;
import trd.t0;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.TypeCastException;

public final class CookieManagerWrapper	// class@001292
{
    public final p a;
    public CookieManager b;
    public static final CookieManagerWrapper$a c;

    static {
       CookieManagerWrapper.c = new CookieManagerWrapper$a(null);
    }
    public void CookieManagerWrapper(){
       super();
       this.a = s.c(CookieManagerWrapper$mHostCookieSetHash$2.INSTANCE);
       CookieManagerWrapper uCookieManag = CookieManagerWrapper.class;
       if (!PatchProxy.isSupport(uCookieManag) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, this, uCookieManag, "3")) {
          try{
             CookieManager uCookieManag1 = this.c();
             if (uCookieManag1 != null) {
                uCookieManag1.setAcceptCookie(true);
             }
          }catch(java.lang.Exception e0){
             b.b.f(e0);
          }
       }
    }
    public final Map a(String p0){
       LinkedHashMap obj = PatchProxy.applyOneRefs(p0, this, CookieManagerWrapper.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedHashMap();
       Map map = this.d().get(p0);
       if (map != null) {
          a.h(map, "it");
          obj.putAll(map);
       }
       return obj;
    }
    public final List b(String p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, CookieManagerWrapper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = 0;
       CookieManager uCookieManag = (p0 == null || !p0.length())? 1: null;
       if (uCookieManag) {
          return CollectionsKt__CollectionsKt.E();
       }else {
          uCookieManag = this.c();
          p0 = (uCookieManag != null)? uCookieManag.getCookie(p0): 0;
          String str = p0;
          if (str == null || !str.length()) {
             obj = 1;
          }
          if (obj) {
             return CollectionsKt__CollectionsKt.E();
          }else {
             String[] stringArray = new String[]{"; "};
             return StringsKt__StringsKt.H4(str, stringArray, false, 0, 6, null);
          }
       }
    }
    public final CookieManager c(){
       Object obj = PatchProxy.apply(null, this, CookieManagerWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          if (Build$VERSION.SDK_INT < 23) {
             CookieSyncManager.createInstance(Azeroth2.B.d());
          }
          try{
             this.b = CookieManager.getInstance();
          }catch(java.lang.Exception e0){
             b.b.h("CookieManagerWrapper", "--- init CookieManager fail, e:"+e0.getMessage());
          }
       }
    }
    public final ConcurrentHashMap d(){
       Object obj = PatchProxy.apply(null, this, CookieManagerWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void e(String p0,String p1,List p2){
       boolean b;
       String str3;
       Object obj = this;
       Object obj1 = p0;
       CookieManagerWrapper uCookieManag = CookieManagerWrapper.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CookieManagerWrapper.class, "11")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       ArrayList uArrayList2 = new ArrayList();
       ArrayList uArrayList3 = new ArrayList();
       Iterator iterator = p2.iterator();
       StringBuilder str = 1;
       String str1 = null;
       while (iterator.hasNext()) {
          CookieModel uCookieModel = iterator.next();
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          String obj2 = PatchProxy.applyTwoRefs(obj1, uCookieModel, obj, uCookieManag, "13");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else {
             a$a a = a.a;
             Objects.requireNonNull(a);
             Map obj3 = PatchProxy.apply(null, a, a$a.class, "2");
             if (obj3 != patchProxyRe) {
                b = obj3.booleanValue();
             }else {
                a uoa = Azeroth2.B.q();
                b = (uoa != null)? a$a.b(uoa, null, "cookie_hash_enable", true, 1, null): true;
             }
             if (b) {
                str3 = uCookieModel.b();
                int i1 = (!p0.length())? 1: 0;
                if (!i1) {
                   obj3 = (!str3.length())? 1: null;
                   if (!obj3) {
                      b = a.g(this.a(p0).get(str3), uCookieModel);
                   }
                }
             }
          label_00aa :
             b = false;
          }
          char c = ']';
          String str2 = ":[";
          if (b) {
             uArrayList.add(uCookieModel.b()+str2+uCookieModel.c()+c);
          }else if(!(uCookieModel.c()).length()){
             str3 = 1;
          }else {
             str3 = null;
          }
          if (str3) {
             uArrayList2.add(uCookieModel.b()+str2+uCookieModel.c()+c);
          }else {
             uArrayList1.add(uCookieModel.b()+str2+uCookieModel.c()+c);
          }
          uArrayList3.add(uCookieModel.a(p1));
          if (PatchProxy.applyVoidTwoRefs(obj1, uCookieModel, obj, uCookieManag, "14")) {
             continue ;
          }else {
             obj2 = uCookieModel.b();
             int i = (!p0.length())? 1: 0;
             if (!i) {
                if (obj2.length()) {
                   str = null;
                }
                if (str != null) {
                   continue ;
                }else {
                   Map map = t0.J0(this.a(p0));
                   map.put(obj2, uCookieModel);
                   this.d().put(obj1, map);
                }
             }
          }
       }
       String str4 = CollectionsKt___CollectionsKt.V2(uArrayList1, ", ", null, null, 0, null, null, 62, null);
       String str5 = CollectionsKt___CollectionsKt.V2(uArrayList, ", ", null, 0, 0, null, null, 62, null);
       String str6 = CollectionsKt___CollectionsKt.V2(uArrayList2, ", ", null, null, 0, null, 0, 62, null);
       if (!PatchProxy.applyVoidTwoRefs(obj1, uArrayList3, obj, uCookieManag, "12")) {
          CookieManager uCookieManag1 = this.c();
          if (uCookieManag1 != null) {
             String[] stringArray = new String[str1];
             Object[] objArray = uArrayList3.toArray(stringArray);
             if (objArray != null) {
                uCookieManag1.setCookies(obj1, objArray);
                b.b.g("kswebview set cookies success");
             }else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
             }
          }else {
             Iterator iterator1 = uArrayList3.iterator();
             while (iterator1.hasNext()) {
                Object obj4 = iterator1.next();
                b uob = (obj4.length() > 0)? 1: null;
                if (uob) {
                   try{
                      if (uCookieManag1 != null) {
                         uCookieManag1.setCookie(obj1, obj4);
                      }
                      b.b.g("webview set cookie success cookie="+obj4);
                   }catch(java.lang.Exception e0){
                      b.b.g("webview set cookie crash: url="+obj1+", cookie="+obj4+", msg:"+e0.getMessage());
                      goto label_01f4 ;
                   }
                }
             }
          }
       }
       b.b.g("Set cookie for host: "+obj1+" :: "+"updated key:[value]: "+str4+":: "+"skipped key:[value]: "+str5+":: "+"update as empty value: "+str6);
       return;
    }
}
