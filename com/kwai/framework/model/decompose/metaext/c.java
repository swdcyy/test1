package com.kwai.framework.model.decompose.metaext.c;
import java.lang.ThreadLocal;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.util.HashMap;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtLogManager;
import com.kwai.framework.model.decompose.metaext.a;
import kotlin.Pair;
import com.kwai.framework.model.decompose.metaext.a$a;
import java.lang.Throwable;
import com.google.gson.JsonArray;
import java.lang.Math;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.utility.Log;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtPathUtils;
import java.util.Objects;
import java.util.List;
import kotlin.jvm.internal.a;
import ha6.h;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtPathUtils$State;
import ha6.f;
import java.lang.Enum;
import java.lang.Integer;
import qrd.r0;
import trd.t0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import java.lang.Number;
import ekd.e0;
import java.lang.Long;
import com.kwai.framework.model.decompose.metaext.b;

public class c	// class@0016b2
{
    public static final ThreadLocal a;

    static {
       c.a = new ThreadLocal();
    }
    public void c(){
       super();
    }
    public static Map a(JsonObject p0,Object p1){
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof JsonObject) {
       }else {
          c.a.set(Boolean.TRUE);
          p1 = a.a.x(p1);
          c.a.set(null);
       }
       if (p1 == null) {
          return null;
       }else {
          obj = new HashMap();
          c.c(p0, p1, null, obj);
          return obj;
       }
    }
    public static JsonArray b(JsonArray p0,JsonArray p1,String p2,Map p3){
       JsonObject jsonObject1;
       JsonArray obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonArray();
       int i = Math.min(p0.size(), p1.size());
       int i1 = 0;
       JsonObject jsonObject = null;
       while (i1 < i) {
          String str = p2+"["+i1+"]";
          JsonElement jsonElement = p0.e0(i1);
          JsonElement jsonElement1 = p1.e0(i1);
          if (jsonElement.E() && jsonElement1.E()) {
             jsonObject = c.c(jsonElement.r(), jsonElement1.r(), str, p3);
          }else if(jsonElement.B() && jsonElement1.B()){
             jsonObject = c.b(jsonElement.q(), jsonElement1.q(), str, p3);
          }
          if (jsonObject != null) {
             obj.G(jsonObject);
          }
          i1 = i1 + 1;
       }
       if (!obj.size()) {
          jsonObject1 = jsonObject;
       }
       return jsonObject1;
    }
    public static JsonObject c(JsonObject p0,JsonObject p1,String p2,Map p3){
       JsonObject obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.entrySet().iterator();
       StringBuilder str = null;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          String str1 = (p2 != null)? p2+"."+key: key;
          JsonElement value = uEntry.getValue();
          if (!value.D() && !p1.s0(key)) {
             Log.g("MetaExt_Utils", "ÈßÓà×Ö¶Î "+str1);
             obj.G(key, value);
             uArrayList.add(key);
          }else {
             JsonElement jsonElement = p1.e0(key);
             if (value.E() && jsonElement.E()) {
                str = c.c(value.r(), jsonElement.r(), str1, p3);
             }else if(value.B() && jsonElement.B()){
                str = c.b(value.q(), jsonElement.q(), str1, p3);
             }
             if (str != null) {
                obj.G(key, str);
             }
          }
       }
       if (!obj.size()) {
          return str;
       }
       if (p2 == null) {
          p3.put("__ROOT__", obj);
       }else if(uArrayList.size() > 0){
          p3.put(p2, obj);
       }
       return obj;
    }
    public static void d(JsonArray p0,JsonArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "6")) {
          return;
       }
       int i = Math.min(p1.size(), p0.size());
       int i1 = 0;
       while (i1 < i) {
          JsonElement jsonElement = p0.e0(i1);
          JsonElement jsonElement1 = p1.e0(i1);
          if (jsonElement.E() && jsonElement1.E()) {
             c.f(jsonElement.r(), jsonElement1.r());
          }else if(jsonElement.B() && jsonElement1.B()){
             c.d(jsonElement.q(), jsonElement1.q());
          }
          i1 = i1 + 1;
       }
       return;
    }
    public static void e(JsonObject p0,String p1,JsonObject p2){
       h oh;
       String obj2;
       JsonObject jsonObject;
       int i2;
       JsonElement jsonElement1;
       char c;
       h oh2;
       String str3;
       JsonElement jsonElement = p0;
       Object obj = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "4")) {
          return;
       }
       if (p1.isEmpty()) {
          return;
       }
       KSModelMetaExtPathUtils b = KSModelMetaExtPathUtils.b;
       Objects.requireNonNull(b);
       ArrayList uArrayList = PatchProxy.applyOneRefs(obj, b, KSModelMetaExtPathUtils.class, "3");
       boolean b1 = 2;
       int i = 1;
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(obj, "path");
          ArrayList uArrayList1 = new ArrayList();
          String str = "";
          int i3 = -1;
          if (a.g(obj, str)) {
             uArrayList1.add(new h(i, str, i3));
          }else {
             int i4 = p1.length();
             StringBuilder str1 = "";
             KSModelMetaExtPathUtils$State init = KSModelMetaExtPathUtils$State.Init;
             int i5 = 0;
             h oh1 = null;
             while (true) {
                obj2 = "buffer.toString\(\)";
                if (i5 < i4) {
                   c = obj.charAt(i5);
                   init = b.b(init, c);
                   i3 = f.b[init.ordinal()];
                   if (i3 != i) {
                      if (i3 != b1) {
                         if (i3 != 3) {
                            if (i3 != 4) {
                               str1 = str1+c;
                            }else {
                            label_0108 :
                               KSModelMetaExtPathUtils$State state = init;
                               Throwable throwable = null;
                               if (state == KSModelMetaExtPathUtils$State.Error || !b.a(state, KSModelMetaExtPathUtils$State.End)) {
                                  Pair[] pairArray = new Pair[]{r0.a("jsonPath", obj)};
                                  KSModelMetaExtLogManager.e(KSModelMetaExtLogManager.c, "MetaExt_ParseJsonPath", "parseJsonPath´íÎó: ½âÎö \'"+obj+"\' Ê±³öÏÖ´íÎó", t0.M(pairArray), throwable, null, 16, null);
                                  uArrayList = CollectionsKt__CollectionsKt.E();
                                  break ;
                               }else if(str1.length() > 0){
                                  oh2 = 1;
                               }else {
                                  oh2 = null;
                               }
                               if (oh2) {
                                  String str2 = str1;
                                  a.o(str2, obj2);
                                  uArrayList1.add(new h(1, str2, -1));
                               }
                               KSModelMetaExtLogManager.c.b("MetaExt_ParseJsonPath", "parseJsonPath: ½âÎö "+obj+" -> "+uArrayList1, new HashMap());
                            }
                         }else if(!str1.length()){
                            i2 = 1;
                         }else {
                            i2 = 0;
                         }
                         if (i2) {
                            if (oh1 != null && oh1.c() != b1) {
                               init = KSModelMetaExtPathUtils$State.Error;
                               goto label_0108 ;
                            }
                         }else {
                            str3 = str1;
                            a.o(str3, obj2);
                            oh1 = new h(1, str3, -1);
                            uArrayList1.add(oh1);
                            str1.delete(0, str1.length());
                         }
                      }else if(oh1 == null || oh1.c() != b1){
                         init = KSModelMetaExtPathUtils$State.Error;
                         goto label_0108 ;
                      }else {
                         str3 = str1;
                         a.o(str3, obj2);
                         oh1.c = Integer.parseInt(str3);
                         str1.delete(0, str1.length());
                      }
                   }else if(!str1.length()){
                      str3 = 1;
                   }else {
                      str3 = null;
                   }
                   if (str3) {
                      str1 = str1+"?";
                   }
                   str3 = str1;
                   a.o(str3, obj2);
                   oh1 = new h(b1, str3, -1);
                   uArrayList1.add(oh1);
                   str1.delete(0, str1.length());
                   i5 = i5 + 1;
                   i = 1;
                   i3 = -1;
                }else {
                   goto label_0108 ;
                }
             }
             if (uArrayList.isEmpty()) {
                return;
             }else {
                b = KSModelMetaExtPathUtils.b;
                Objects.requireNonNull(b);
                Iterator obj1 = PatchProxy.applyTwoRefs(jsonElement, uArrayList, b, KSModelMetaExtPathUtils.class, "4");
                if (obj1 != PatchProxyResult.class) {
                   obj2 = obj1;
                }else {
                   a.p(jsonElement, "jsonObject");
                   a.p(uArrayList, "pathItems");
                   int i1 = uArrayList.size();
                   i2 = 0;
                   while (true) {
                      if (i2 < i1) {
                         oh = uArrayList.get(i2);
                         i = oh.c();
                         if (i != 1) {
                            if (i != b1) {
                               jsonElement = null;
                            label_01fd :
                               if (jsonElement != null) {
                                  i2 = i2 + 1;
                               }
                            }else {
                               JsonArray jsonArray = jsonElement.q();
                               if (oh.a() < jsonArray.size()) {
                                  jsonElement1 = jsonArray.e0(oh.a());
                               label_01fc :
                                  jsonElement = jsonElement1;
                                  goto label_01fd ;
                               }
                            }
                         }else {
                            JsonObject jsonObject1 = jsonElement.r();
                            if (jsonObject1.s0(oh.b())) {
                               jsonElement1 = jsonObject1.e0(oh.b());
                               goto label_01fc ;
                            }
                         }
                         obj2 = null;
                      }else {
                         obj2 = jsonElement;
                      }
                   }
                }
                if (obj2 != null && obj2.E()) {
                   jsonObject = obj2.r();
                   obj1 = p2.entrySet().iterator();
                   while (obj1.hasNext()) {
                      Map$Entry uEntry = obj1.next();
                      obj2 = uEntry.getKey();
                      jsonObject.G(obj2, uEntry.getValue());
                   }
                }
                return;
             }
          }
          uArrayList = uArrayList1;
       }
       oh = null;
       goto label_0193 ;
    }
    public static void f(JsonObject p0,JsonObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "5")) {
          return;
       }
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          JsonElement jsonElement = p0.e0(key);
          JsonElement value = uEntry.getValue();
          if (!p0.s0(key)) {
             p0.G(key, value.b());
          }else if(jsonElement.E() && value.E()){
             c.f(jsonElement.r(), value.r());
          }else if(jsonElement.B() && value.B()){
             c.d(jsonElement.q(), value.q());
          }
       }
       return;
    }
    public static JsonObject g(Map p0){
       JsonObject obj = PatchProxy.applyOneRefs(p0, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          Object value = uEntry.getValue();
          if (value instanceof String) {
             obj.c0(key, value);
          }else if(value instanceof Number){
             obj.a0(key, value);
          }else if(value instanceof Boolean){
             obj.H(key, value);
          }else if(value instanceof JsonElement){
             obj.c0(key, a.a.q(value));
          }else if(value != null){
             obj.c0(key, value.toString());
          }
       }
       return obj;
    }
    public static boolean h(long p0,long p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), null, uoc, "8");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       int i = 0;
       if (p1 - i > 0 && (p0 - i < 0 || p0 - p1 > 0)) {
          return b;
       }else {
          b a = b.a;
          if (PatchProxy.isSupport(uoc)) {
             Object obj1 = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), a, null, c.class, "9");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             label_0062 :
                return b1;
             }
          }
          if ((a.a(p1) + 1) - p0 <= 0) {
             b = 1;
          }
          b1 = b;
          goto label_0062 ;
       }
    }
}
