package com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer;
import java.io.Serializable;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer$a;
import nsd.u;
import ha6.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n06.a;
import ekd.e0;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import java.util.Objects;
import java.lang.Boolean;
import ha6.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import n06.b;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtLogManager;
import com.kwai.framework.model.decompose.metaext.a;
import java.util.HashMap;
import com.google.gson.JsonObject;
import java.lang.Throwable;
import java.io.ObjectInputStream;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import java.util.Map;
import ha6.a;
import com.kwai.framework.model.decompose.internal.a;
import trd.s0;
import nsd.s0;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer$KSModelMetaExtItem;
import qrd.l1;
import zk.h;
import com.kwai.framework.model.decompose.metaext.c;
import java.lang.ThreadLocal;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer$b;
import ha6.e;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import ftd.r1;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer$setJsonObjectAndModel$2;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import java.lang.System;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer$unsafeRunDiffInCurrentThread$onComplete$1;
import msd.l;
import java.io.ObjectOutputStream;

public final class KSModelMetaExtContainer implements Serializable	// class@0016a9
{
    public Map _cachedJsonMap;
    public JsonObject _cachedJsonObject;
    public boolean _isDiffRunning;
    public KSModelMetaExtContainer$b b;
    public Map c;
    public boolean isDiffStillRunning;
    public static final KSModelMetaExtContainer$a Companion;
    public static final long serialVersionUID;

    static {
       g a;
       a b;
       u ou = null;
       KSModelMetaExtContainer.Companion = new KSModelMetaExtContainer$a(ou);
       g og = g.class;
       if (PatchProxy.applyVoid(ou, ou, og, "1")) {
       }else if(PatchProxy.applyVoid(ou, ou, a.class, "1")){
          String str = "KSMetaExtensionSwitch";
          int i = 0;
          String str1 = 1;
          if (e0.a) {
             int i1 = l.e("KSMetaExtensionEnabledStatus", i);
             if (i1 != str1) {
                if (i1 != 2) {
                   i = a.t().d(str, i);
                }
             }else {
                i = true;
             }
          }else {
             i = a.t().d(str, i);
          }
          g a1 = g.a;
          Objects.requireNonNull(a1);
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), a1, og, "2")) {
             Objects.requireNonNull(b.b);
             b.a = i;
          }
          StringBuilder str2 = "kswitch config \'KSMetaExtensionSwitch\' ";
          str = (i)? "启用": "禁用";
          Log.g("MetaExt_Registry", str2+str);
       }
       if (!PatchProxy.applyVoid(ou, ou, b.class, "1")) {
          a = g.a;
          b uob = new b();
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(uob, a, og, "3")) {
             a.p(uob, "logger");
             KSModelMetaExtLogManager c = KSModelMetaExtLogManager.c;
             Objects.requireNonNull(c);
             KSModelMetaExtLogManager kSModelMetaE = KSModelMetaExtLogManager.class;
             if (!PatchProxy.applyVoidOneRefs(uob, c, kSModelMetaE, "1")) {
                a.p(uob, "logger");
                _monitor_enter(c);
                if (PatchProxy.applyVoidOneRefs(uob, c, kSModelMetaE, "2")) {
                   _monitor_exit(c);
                }else {
                   b = KSModelMetaExtLogManager.b;
                   if (b == null) {
                      KSModelMetaExtLogManager.b = uob;
                   }else {
                      c.c(b, uob);
                   }
                   _monitor_exit(c);
                }
             }
          }
       }
    }
    public void KSModelMetaExtContainer(){
       super();
       this.c = new HashMap();
    }
    public static void reportDeserializationError$default(KSModelMetaExtContainer p0,String p1,Class p2,JsonObject p3,String p4,Throwable p5,int p6,Object p7){
       if (p6 & 0x10) {
          p5 = null;
       }
       p0.b(p1, p2, p3, p4, p5);
       return;
    }
    public static void reportSerializationError$default(KSModelMetaExtContainer p0,String p1,JsonObject p2,Throwable p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = null;
       }
       p0.c(p1, p2, p3);
       return;
    }
    public final HashMap a(int p0,ObjectInputStream p1){
       HashMap obj;
       if (PatchProxy.isSupport(KSModelMetaExtContainer.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, KSModelMetaExtContainer.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (p0 <= 0) {
          return obj;
       }else {
          HashMap hashMap = new HashMap();
          int i = 0;
          while (true) {
             if (i < p0) {
                HashMap hashMap1 = p1.readObject();
                if (!hashMap1 instanceof String) {
                   hashMap1 = obj;
                }
                if (hashMap1 != null) {
                   HashMap hashMap2 = p1.readObject();
                   if (!hashMap2 instanceof String) {
                      hashMap2 = obj;
                   }
                   if (hashMap2 != null) {
                      Class uClass = Class.forName(hashMap2);
                      HashMap hashMap3 = p1.readObject();
                      if (!hashMap3 instanceof String) {
                         hashMap3 = obj;
                      }
                      if (hashMap3 != null) {
                         hashMap2 = a.a.h(hashMap3, uClass);
                         if (!hashMap2 instanceof JsonElement) {
                            hashMap2 = obj;
                         }
                         if (hashMap2 != null) {
                            hashMap.put(hashMap1, hashMap2);
                            i = i + 1;
                         }
                      }
                   }
                }
                break ;
             }else if(hashMap.isEmpty()){
                obj = hashMap;
             }
             return obj;
          }
          return obj;
       }
    }
    public final void b(String p0,Class p1,JsonObject p2,String p3,Throwable p4){
       int i = 1;
       int i1 = 0;
       int i2 = 3;
       if (PatchProxy.isSupport(KSModelMetaExtContainer.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, KSModelMetaExtContainer.class, "14")) {
             return;
          }
       }
       Pair[] pairArray = new Pair[i2];
       pairArray[i1] = r0.a("metaExtClass", p1.getName());
       pairArray[i] = r0.a("jsonObject", p2);
       pairArray[2] = r0.a("jsonPath", p3);
       KSModelMetaExtLogManager.e(KSModelMetaExtLogManager.c, "MetaExt_Deserialize", p0, t0.M(pairArray), p4, null, 16, null);
       return;
    }
    public final void c(String p0,JsonObject p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSModelMetaExtContainer.class, "15")) {
          return;
       }
       Pair[] pairArray = new Pair[]{r0.a("jsonObject", p1)};
       KSModelMetaExtLogManager.e(KSModelMetaExtLogManager.c, "MetaExt_Serialize", p0, t0.M(pairArray), p2, null, 16, null);
       return;
    }
    public final a d(String p0,Class p1){
       a uoa1;
       JsonElement obj5;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KSModelMetaExtContainer obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, KSModelMetaExtContainer.class, "11");
       if (obj3 != patchProxyRe) {
          return obj3;
       }
       obj3 = PatchProxy.applyOneRefs(obj1, obj, KSModelMetaExtContainer.class, "9");
       a uoa = null;
       int i = 0;
       if (obj3 != patchProxyRe) {
       }else if(!p0.length()){
          obj3 = 1;
       }else {
          obj3 = null;
       }
       if (obj3) {
          uoa1 = obj._cachedJsonObject;
       }else {
          obj3 = obj._cachedJsonMap;
          if (obj3 != null) {
             a.m(obj3);
             obj5 = obj3.get(obj1);
          }else {
             uoa1 = uoa;
          }
       }
       if (obj3 == null) {
          uoa1 = PatchProxy.applyOneRefs(obj1, obj, KSModelMetaExtContainer.class, "10");
          if (uoa1 != patchProxyRe) {
          }else if(p0.length() > 0){
             uoa1 = 1;
          }else {
             uoa1 = null;
          }
          if (uoa1) {
             KSModelMetaExtContainer _cachedJsonO = obj._cachedJsonObject;
             a.m(_cachedJsonO);
             obj5 = a.a.a(_cachedJsonO, obj1);
          }else {
             uoa1 = obj._cachedJsonObject;
          }
       }
       Object obj4 = uoa1;
       if (obj4 == null) {
          KSModelMetaExtContainer.reportDeserializationError$default(this, "deserialize错误: MetaExt指定的jsonPath \'"+obj1+"\' 无效!", p1, obj._cachedJsonObject, p0, null, 16, 0);
       }else {
          obj5 = PatchProxy.applyThreeRefs(obj4, p1, p0, this, KSModelMetaExtContainer.class, "12");
          if (obj5 != patchProxyRe) {
          }else {
             obj5 = a.a.c(obj4, obj2);
             String str = "metaExtClass";
             if (!obj5 instanceof a) {
                KSModelMetaExtLogManager.e(KSModelMetaExtLogManager.c, "MetaExt_Deserialize", "MetaExt does NOT implements KSModelMetaExt!", s0.k(r0.a(str, p1.getName())), null, null, 16, null);
             label_0100 :
                if (uoa != null) {
                   obj3 = obj.c;
                   Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer.KSModelMetaExtItem>");
                   s0.k(obj3).put(obj1, new KSModelMetaExtContainer$KSModelMetaExtItem(obj1, uoa));
                }
             }else {
                Pair[] pairArray = new Pair[]{r0.a(str, p1.getName())};
                KSModelMetaExtLogManager.c.b("MetaExt_Deserialize", "deserialize jsonPath = "+obj1, t0.M(pairArray));
             }
          }
          uoa = obj5;
          goto label_0100 ;
       }
       return uoa;
    }
    public final a e(String p0,Class p1){
       KSModelMetaExtContainer$KSModelMetaExtItem obj = PatchProxy.applyTwoRefs(p0, p1, this, KSModelMetaExtContainer.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.get(p0);
       if (obj != null) {
          if (a.g(obj.getMetaExt().getClass(), p1)) {
             return obj.getMetaExt();
          }else {
             String str = "getMetaExt错误: 重复注册\'"+p0+"\', oldClass: \'"+obj.getMetaExt()+"\', newClass: \'"+p1+"\'!";
             Class class = obj.getMetaExt().getClass();
             if (!PatchProxy.applyVoidFourRefs(str, p1, class, p0, this, KSModelMetaExtContainer.class, "13")) {
                Pair[] pairArray = new Pair[]{r0.a("metaExtClass", p1.getName()),r0.a("cachedMetaExtClass", class.getName()),r0.a("jsonPath", p0)};
                KSModelMetaExtLogManager.e(KSModelMetaExtLogManager.c, "MetaExt_GetMetaExt", str, t0.M(pairArray), null, null, 16, null);
             }
          }
       }
       return null;
    }
    public final Map getCachedJsonMap(){
       Object[] objArray = null;
       KSModelMetaExtContainer obj = PatchProxy.apply(objArray, this, KSModelMetaExtContainer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       _monitor_enter(this);
       obj = this._cachedJsonMap;
       if (obj != null) {
          objArray = t0.D0(obj);
       }
       _monitor_exit(this);
       return objArray;
    }
    public final JsonObject getCachedJsonObject(){
       _monitor_enter(this);
       _monitor_exit(this);
       return this._cachedJsonObject;
    }
    public final a getMetaExt(String p0,Class p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KSModelMetaExtContainer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "classOfMetaExt");
       a uoa = null;
       if (!b.b.a()) {
          return uoa;
       }
       if (p0 == null) {
          p0 = "";
       }
       String str = p0;
       _monitor_enter(this);
       if (this._cachedJsonObject == null) {
          _monitor_exit(this);
          return uoa;
       }else {
          uoa = this.e(str, p1);
          if (uoa == null) {
             uoa = this.d(str, p1);
          }
          _monitor_exit(this);
          return uoa;
       }
    }
    public final boolean isDiffStillRunning(){
       _monitor_enter(this);
       _monitor_exit(this);
       return this._isDiffRunning;
    }
    public final void jsonSerializeAllMetaExt(JsonObject p0,h p1){
       KSModelMetaExtContainer tb;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSModelMetaExtContainer.class, "3")) {
          return;
       }
       a.p(p0, "mainJsonObject");
       a.p(p1, "context");
       if (!b.b.a()) {
          return;
       }
       if (a.g(c.a.get(), Boolean.TRUE)) {
          return;
       }
       _monitor_enter(this);
       if (this._isDiffRunning != null) {
          tb = this.b;
          e uoe = null;
          JsonObject jsonObject = (tb != null)? tb.b(): uoe;
          KSModelMetaExtContainer tb1 = this.b;
          if (tb1 != null) {
             uoe = tb1.a();
          }
          this.unsafeRunDiffInCurrentThread(jsonObject, uoe, false);
       }
       if (this._cachedJsonMap != null) {
          tb = this._cachedJsonObject;
          if (tb != null) {
             a.m(tb);
             c.f(p0, tb);
             Iterator iterator = this.c.entrySet().iterator();
             while (iterator.hasNext()) {
                KSModelMetaExtContainer$KSModelMetaExtItem value = iterator.next().getValue();
                JsonElement jsonElement = p1.a(value.getMetaExt());
                if (jsonElement != null && jsonElement.E()) {
                   c.e(p0, value.getJsonPath(), jsonElement);
                }
             }
          }
       }
       _monitor_exit(this);
       return;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSModelMetaExtContainer.class, "17")) {
          return;
       }
       if (!b.b.a()) {
          return;
       }
       p0.defaultReadObject();
       Object obj = p0.readObject();
       if (!obj instanceof String) {
          obj = null;
       }
       Gson obj1 = PatchProxy.applyOneRefs(obj, this, KSModelMetaExtContainer.class, "18");
       int i = 0;
       if (obj1 != PatchProxyResult.class) {
       }else if(obj == null || !obj.length()){
          obj1 = 1;
       }else {
          obj1 = null;
       }
       if (obj1) {
          obj1 = null;
       }else {
          obj1 = a.a.h(obj, JsonObject.class);
       }
       HashMap hashMap = this.a(p0.readInt(), p0);
       if (obj1 != null) {
          if (hashMap == null || hashMap.isEmpty()) {
             i = 1;
          }
          if (!i) {
             this.set_cachedJsonObject(obj1);
             this._cachedJsonMap = hashMap;
          }
       }
    label_0070 :
       return;
    }
    public final void runDiffIfNeededInCurrentThread(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSModelMetaExtContainer.class, "6")) {
          return;
       }
       _monitor_enter(this);
       if (this._isDiffRunning != null) {
          KSModelMetaExtContainer tb = this.b;
          JsonObject jsonObject = (tb != null)? tb.b(): objArray;
          KSModelMetaExtContainer tb1 = this.b;
          if (tb1 != null) {
             objArray = tb1.a();
          }
          this.unsafeRunDiffInCurrentThread(jsonObject, objArray, false);
       }
       _monitor_exit(this);
       return;
    }
    public final void setCachedJsonMap(Map p0){
       _monitor_enter(this);
       this._cachedJsonMap = p0;
       _monitor_exit(this);
    }
    public final void setCachedJsonObject(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSModelMetaExtContainer.class, "4")) {
          return;
       }
       _monitor_enter(this);
       this.set_cachedJsonObject(p0);
       _monitor_exit(this);
       return;
    }
    public final void setJsonObjectAndModel(JsonObject p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSModelMetaExtContainer.class, "2")) {
          return;
       }
       a.p(p0, "jsonObject");
       a.p(p1, "host");
       KSModelMetaExtContainer$b uob = new KSModelMetaExtContainer$b(p0, p1);
       _monitor_enter(this);
       this.set_cachedJsonObject(p0);
       this._cachedJsonMap = null;
       this._isDiffRunning = true;
       this.b = uob;
       _monitor_exit(this);
       a.f(r1.b, null, null, new KSModelMetaExtContainer$setJsonObjectAndModel$2(this, uob, null), 3, null);
       return;
    }
    public final void set_cachedJsonObject(JsonObject p0){
       if (this._cachedJsonObject == null && p0 instanceof JsonObject) {
          this._cachedJsonObject = p0;
       }
       return;
    }
    public final void unsafeRunDiffInCurrentThread(JsonObject p0,e p1,boolean p2){
       if (PatchProxy.isSupport(KSModelMetaExtContainer.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, KSModelMetaExtContainer.class, "7")) {
          return;
       }
       if (p0 != null && p1 != null) {
          long l = System.nanoTime();
          Map map = c.a(p0, p1);
          JsonObject jsonObject = null;
          JsonElement jsonElement = (map != null)? map.get("__ROOT__"): jsonObject;
          if (jsonElement instanceof JsonObject) {
             jsonObject = jsonElement;
          }
          KSModelMetaExtContainer$unsafeRunDiffInCurrentThread$onComplete$1 ounsafeRunDi = new KSModelMetaExtContainer$unsafeRunDiffInCurrentThread$onComplete$1(this, jsonObject, map);
          if (p2) {
             _monitor_enter(this);
             ounsafeRunDi.invoke(jsonObject);
             _monitor_exit(this);
          }else {
             ounsafeRunDi.invoke(jsonObject);
          }
          a.m(map);
          KSModelMetaExtLogManager.c.b("MetaExt_DiffObjects", "diff耗时: "+((double)(System.nanoTime() - l) / 1000000.00f)+" ms", s0.k(r0.a("mapSize", String.valueOf(map.size()))));
       }
    label_00aa :
       return;
    }
    public final void writeObject(ObjectOutputStream p0){
       KSModelMetaExtContainer tb;
       KSModelMetaExtContainer tb1;
       JsonElement value;
       if (PatchProxy.applyVoidOneRefs(p0, this, KSModelMetaExtContainer.class, "16")) {
          return;
       }
       if (!b.b.a()) {
          return;
       }
       if (a.g(c.a.get(), Boolean.TRUE)) {
          return;
       }
       _monitor_enter(this);
       if (this._isDiffRunning != null) {
          tb = this.b;
          e uoe = null;
          JsonObject jsonObject = (tb != null)? tb.b(): uoe;
          tb1 = this.b;
          if (tb1 != null) {
             uoe = tb1.a();
          }
          this.unsafeRunDiffInCurrentThread(jsonObject, uoe, false);
       }
       tb = this._cachedJsonObject;
       String str = (tb != null)? a.a.p(tb): "";
       HashMap hashMap = new HashMap();
       tb1 = this._cachedJsonMap;
       if (tb1 != null) {
          a.m(tb1);
          Iterator iterator = tb1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             value = uEntry.getValue();
             String str1 = a.a.p(value);
             hashMap.put(uEntry.getKey(), new Pair(value.getClass().getName(), str1));
          }
       }
       p0.defaultWriteObject();
       p0.writeObject(str);
       p0.writeInt(hashMap.size());
       Iterator iterator1 = hashMap.entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry1 = iterator1.next();
          p0.writeObject(uEntry1.getKey());
          Object value1 = uEntry1.getValue();
          a.o(value1, "entry.value");
          p0.writeObject(value1.getFirst());
          p0.writeObject(value1.getSecond());
       }
       _monitor_exit(this);
       return;
    }
}
