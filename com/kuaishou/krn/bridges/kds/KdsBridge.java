package com.kuaishou.krn.bridges.kds.KdsBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.kuaishou.krn.bridges.kds.KdsBridge$a;
import nsd.u;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.bridges.kds.KdsBridge$mDefaultBridgeContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import f55.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.bridges.kds.KdsBridge$b;
import com.facebook.react.bridge.Promise;
import com.kuaishou.krn.bridges.kds.KdsBridge$c;
import java.util.Map;
import kotlin.Pair;
import com.kuaishou.krn.c;
import kj0.l;
import kj0.j;
import qrd.r0;
import trd.t0;
import ik0.m;
import wi0.e;
import com.kuaishou.krn.delegate.KrnDelegate;
import java.lang.StringBuilder;
import java.lang.Throwable;
import ek0.d;
import wi0.b;
import ik0.g;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import java.lang.Number;
import java.lang.CharSequence;
import org.json.JSONObject;
import com.facebook.react.bridge.CatalystInstance;
import java.lang.Integer;
import lj0.c;
import lj0.d;
import aj0.a;
import aj0.c;
import java.lang.IllegalArgumentException;
import com.kuaishou.krn.experiment.ExpConfigKt;
import java.lang.Boolean;
import wi0.d;
import com.kuaishou.krn.bridges.kds.GlobalKdsBridgeContextProvider;
import kj0.f;
import p55.a;
import java.util.HashMap;
import com.google.gson.Gson;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Iterable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableArray;
import com.kuaishou.krn.bridges.kds.KdsBridge$d;
import com.kwai.bridge.a;
import java.util.Objects;
import com.facebook.react.util.RCTLog;
import com.facebook.react.bridge.JavaScriptModule;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kuaishou.krn.bridges.kds.KdsBridge$e;
import com.kuaishou.krn.bridges.kds.KdsBridge$f;

public final class KdsBridge extends KrnBridge	// class@00081a
{
    public final p mDefaultBridgeContext$delegate;
    public static final KdsBridge$a Companion;

    static {
       KdsBridge.Companion = new KdsBridge$a(null);
    }
    public void KdsBridge(ReactApplicationContext p0){
       a.p(p0, "reactContext");
       super(p0);
       this.mDefaultBridgeContext$delegate = s.c(new KdsBridge$mDefaultBridgeContext$2(p0));
    }
    public final g buildCallbackWithCallbackId(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KdsBridge.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KdsBridge$b(this, p0, p1);
    }
    public final g buildPromiseCallback(Promise p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KdsBridge.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KdsBridge$c(p0);
    }
    public Map getConstants(){
       j commonParams;
       Pair[] obj = PatchProxy.apply(null, this, KdsBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Pair[]{r0.a("userAgent", commonParams.getUserAgent())};
       c uoc = c.b();
       a.o(uoc, "KrnManager.get\(\)");
       l ol = uoc.g();
       a.o(ol, "KrnManager.get\(\).krnInitParams");
       commonParams = ol.getCommonParams();
       a.o(commonParams, "KrnManager.get\(\).krnInitParams.commonParams");
       return t0.j0(obj);
    }
    public final e getCurrentBridgeContext(m p0){
       e uoe;
       b mDefaultBrid;
       Throwable obj = PatchProxy.applyOneRefs(p0, this, KdsBridge.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          KrnDelegate krnDelegate = p0.getKrnDelegate();
          if (krnDelegate != null) {
             uoe = krnDelegate.h("KDS_BRIDGE_CONTEXT");
          label_0022 :
             if (!uoe instanceof e) {
                uoe = obj;
             }
             String str = "KdsBridge";
             if (uoe != null) {
                d.f(str, "find custom BridgeContext: "+uoe.getClass(), obj);
                return uoe;
             }else if(a.g(this.getMDefaultBridgeContext().i(), p0)){
                d.f(str, "useDefaultBridgeContext", obj);
                mDefaultBrid = this.getMDefaultBridgeContext();
             }else {
                d.f(str, "createNewBridgeContext", obj);
                ReactApplicationContext reactApplica = this.getReactApplicationContext();
                a.o(reactApplica, "reactApplicationContext");
                mDefaultBrid = new b(p0, reactApplica);
             }
             return mDefaultBrid;
          }
       }
       uoe = obj;
       goto label_0022 ;
    }
    public final b getMDefaultBridgeContext(){
       Object obj = PatchProxy.apply(null, this, KdsBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDefaultBridgeContext$delegate.getValue();
    }
    public String getName(){
       return "Kds";
    }
    public final int getViewTagFromParams(String p0){
       String str = "rootTag";
       JSONObject obj = PatchProxy.applyOneRefs(p0, this, KdsBridge.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = (p0 == null || !p0.length())? 1: null;
       if (obj) {
          return -1;
       }else {
          try{
             obj = new JSONObject(p0);
             if (obj.has(str)) {
                return obj.optInt(str);
             }
          }catch(java.lang.Exception e4){
             d.j("KdsBridge", "params to JSON error", e4);
          }
          return -1;
       }
    }
    public final void invoke(String p0,String p1,String p2,Promise p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, KdsBridge.class, "8")) {
          return;
       }
       a.p(p3, "promise");
       this.invokeInternal(this.getViewTagFromParams(p2), p0, p1, p2, null, this.buildPromiseCallback(p3), p3);
       return;
    }
    public final void invokeCallback(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KdsBridge.class, "7")) {
          return;
       }
       if (!this.getReactApplicationContext().hasActiveCatalystInstance()) {
          return;
       }
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       a.o(reactApplica, "reactApplicationContext");
       KdsBridge.Companion.a(reactApplica.getCatalystInstance(), p0, p1);
       return;
    }
    public final void invokeInternal(int p0,String p1,String p2,String p3,String p4,g p5,Promise p6){
       m om;
       int i = p0;
       object oobject = p1;
       object oobject1 = p2;
       KdsBridge kdsBridge = KdsBridge.class;
       if (PatchProxy.isSupport(kdsBridge)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,oobject1,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, this, kdsBridge, "11")) {
             return;
          }
       }
       Throwable throwable = null;
       if (i == -1) {
          this.sendJsWarnLog("Please set rootTag when use bridge: "+p1+'.'+p2);
          c uoc = d.a(this.getReactApplicationContext());
          om = (uoc != null)? uoc.l(): throwable;
       }else {
          om = this.getRNView(p0);
       }
       if (om == null) {
          d.f("KdsBridge", "getKrnView NULL with rootTag: "+p0, throwable);
       }
       this.invokeInternal(om, p1, p2, p3, p4, p5, p6);
       return;
    }
    public final void invokeInternal(m p0,String p1,String p2,String p3,String p4,g p5,Promise p6){
       d uod;
       String str;
       c uoc3;
       WritableMap obj2;
       e uoe;
       object obj = this;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       object oobject5 = p6;
       a uoa = a.class;
       c uoc = c.class;
       KdsBridge kdsBridge = KdsBridge.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(kdsBridge)) {
          Object[] objArray = new Object[]{p0,oobject,oobject1,oobject2,oobject3,oobject4,oobject5};
          if (PatchProxy.applyVoid(objArray, obj, kdsBridge, "12")) {
             return;
          }
       }
       int i2 = (oobject == null || !p1.length())? 1: 0;
       if (i2) {
          if (oobject5 != null) {
             oobject5.reject(new IllegalArgumentException("invalid namespace="+oobject));
          }
          return;
       }else if(oobject1 == null || !p2.length()){
          i = 1;
       }
       if (i) {
          if (oobject5 != null) {
             oobject5.reject(new IllegalArgumentException("invalid method="+oobject1));
          }
          return;
       }else {
          Object[] objArray1 = null;
          if (p0 != null) {
             Boolean uBoolean = PatchProxy.apply(objArray1, objArray1, ExpConfigKt.class, "39");
             if (uBoolean == patchProxyRe) {
                uBoolean = ExpConfigKt.L.getValue();
             }
             if (uBoolean.booleanValue()) {
                uod = new d(this.getCurrentBridgeContext(p0), GlobalKdsBridgeContextProvider.b.a());
             label_00de :
                c uoc1 = c.b();
                a.o(uoc1, "KrnManager.get\(\)");
                if (uoc1.f().k == null || (a.g(oobject, "tool") && oobject1 != null)) {
                   int i3 = p2.hashCode();
                   String str1 = "str";
                   str = "result";
                   c uoc2 = uoc;
                   String str2 = "bridgeContext";
                   String str3 = "4";
                   if (i3 != 0xe143da2) {
                      if (i3 == 0x20bf944e && oobject1.equals("canIUse")) {
                         if (a.g(oobject3, str1)) {
                            str1 = PatchProxy.applyTwoRefs(uod, oobject2, null, uoa, "2");
                            if (str1 != patchProxyRe) {
                            }else {
                               a.p(uod, str2);
                               boolean b = a.a(uod, oobject2);
                               HashMap hashMap = new HashMap();
                               hashMap.put(str, Integer.valueOf(b));
                               hashMap.put("canUse", Boolean.valueOf(b));
                               uoc3 = c.b();
                               a.o(uoc3, "KrnManager.get\(\)");
                               str1 = uoc3.e().q(hashMap);
                               a.o(str1, "KrnManager.get\(\).gson.toJson\(result\)");
                            }
                            oobject4.onSuccess(str1);
                            return;
                         }else {
                            WritableMap obj1 = null;
                            obj2 = PatchProxy.applyTwoRefs(uod, oobject2, obj1, uoa, "1");
                            if (obj2 != patchProxyRe) {
                            }else {
                               a.p(uod, str2);
                               boolean b1 = a.a(uod, oobject2);
                               if (PatchProxy.isSupport(uoa)) {
                                  obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(b1), obj1, uoa, str3);
                                  if (obj1 != patchProxyRe) {
                                  label_019c :
                                     obj2 = obj1;
                                  }
                               }
                               obj1 = Arguments.createMap();
                               obj1.putInt(str, b1);
                               obj1.putBoolean("canUse", b1);
                               a.o(obj1, "Arguments.createMap\(\).ap¡­ean\(\"canUse\", canUse\)\n  }");
                               goto label_019c ;
                            }
                            oobject4.onSuccess(obj2);
                            return;
                         }
                      }
                   }else {
                      String str4 = str3;
                      if (oobject1.equals("getApiList")) {
                         if (a.g(oobject3, str1)) {
                            str1 = PatchProxy.applyOneRefs(uod, null, uoc2, "2");
                            if (str1 != patchProxyRe) {
                            }else {
                               a.p(uod, str2);
                               HashMap hashMap1 = new HashMap();
                               hashMap1.put(str, Integer.valueOf(1));
                               hashMap1.put("apiList", c.a(uod));
                               uoc3 = c.b();
                               a.o(uoc3, "KrnManager.get\(\)");
                               str1 = uoc3.e().q(hashMap1);
                               a.o(str1, "KrnManager.get\(\).gson.toJson\(result\)");
                            }
                            oobject4.onSuccess(str1);
                            return;
                         }else {
                            c uoc4 = uoc2;
                            Iterator obj3 = null;
                            obj2 = PatchProxy.applyOneRefs(uod, obj3, uoc4, "1");
                            if (obj2 != patchProxyRe) {
                            }else {
                               a.p(uod, str2);
                               obj2 = Arguments.createMap();
                               obj2.putInt(str, 1);
                               Map map = c.a(uod);
                               WritableArray writableArra = PatchProxy.applyOneRefs(map, obj3, uoc4, str4);
                               if (writableArra != patchProxyRe) {
                               }else {
                                  writableArra = Arguments.createArray();
                                  obj3 = map.entrySet().iterator();
                                  while (obj3.hasNext()) {
                                     Map$Entry uEntry = obj3.next();
                                     Iterator iterator = uEntry.getValue().iterator();
                                     while (iterator.hasNext()) {
                                        WritableMap writableMap = Arguments.createMap();
                                        writableMap.putString("namespace", uEntry.getKey());
                                        writableMap.putString("name", iterator.next());
                                        writableArra.pushMap(writableMap);
                                     }
                                  }
                                  a.o(writableArra, str);
                               }
                               obj2.putArray("apiList", writableArra);
                               a.o(obj2, "Arguments.createMap\(\).ap¡­rnal\(bridgeContext\)\)\)\n  }");
                            }
                            oobject4.onSuccess(obj2);
                            return;
                         }
                      }
                   }
                }
                obj = (oobject2 != null)? oobject2: "";
                a.f(uod, p1, oobject1, obj, new KdsBridge$d(this, oobject4, oobject3));
                return;
             }
          }
          if (p0 != null) {
             KrnDelegate krnDelegate = p0.getKrnDelegate();
             if (krnDelegate != null) {
                uoe = krnDelegate.h("KDS_BRIDGE_CONTEXT");
                if (uoe != null) {
                label_00d5 :
                   uod = new d(uoe, GlobalKdsBridgeContextProvider.b.a());
                   goto label_00de ;
                }
             }
          }
          uoe = this.getMDefaultBridgeContext();
          goto label_00d5 ;
       }
    }
    public final void invokeWithArgs(ReadableMap p0,Promise p1){
       Object obj1;
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KdsBridge.class, "6")) {
          return;
       }
       String str = "params";
       a.p(p0, str);
       a.p(p1, "promise");
       Map map = this.toHashMap(p0);
       g obj = map.get("multiCallback");
       if (!obj instanceof Boolean) {
          obj = null;
       }
       boolean b = (obj != null)? obj.booleanValue(): false;
       if (b) {
          obj = map.get("callbackId");
          Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
          obj = this.buildCallbackWithCallbackId(obj, map.get("callbackType"));
       }else {
          obj = this.buildPromiseCallback(p1);
       }
       g og = obj;
       String str1 = "rootTag";
       if (map.containsKey(str1)) {
          obj1 = map.get(str1);
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Number");
          i = obj1.intValue();
       }else {
          i = -1;
       }
       obj1 = map.get("nameSpace");
       Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.String");
       Object obj2 = obj1;
       obj1 = map.get("method");
       Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.String");
       this.invokeInternal(i, obj2, obj1, map.get(str), map.get("callbackType"), og, p1);
       return;
    }
    public final void invokeWithMultiCallback(String p0,String p1,String p2,String p3,Promise p4){
       KdsBridge kdsBridge = KdsBridge.class;
       if (PatchProxy.isSupport(kdsBridge)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, kdsBridge, "5")) {
             return;
          }
       }
       a.p(p3, "callbackId");
       a.p(p4, "promise");
       this.invokeInternal(this.getViewTagFromParams(p2), p0, p1, p2, null, this.buildCallbackWithCallbackId(p3, null), p4);
       return;
    }
    public final String makeStrCallback(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KdsBridge.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
       }else {
          p0 = this.convertBeanToJson(p0);
          a.o(p0, "convertBeanToJson\(result\)");
       }
       return p0;
    }
    public final void sendJsWarnLog(String p0){
       RCTLog jSModule;
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsBridge.class, "16")) {
          return;
       }
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       if (reactApplica != null) {
          CatalystInstance catalystInst = reactApplica.getCatalystInstance();
          if (catalystInst != null) {
             jSModule = catalystInst.getJSModule(RCTLog.class);
          label_0021 :
             if (jSModule != null) {
                jSModule.logIfNoNativeHook("warn", p0);
             }
             return;
          }
       }
       jSModule = null;
       goto label_0021 ;
    }
    public final WritableMap syncInvoke(ReadableMap p0){
       Ref$ObjectRef obj1;
       int i;
       String obj = PatchProxy.applyOneRefs(p0, this, KdsBridge.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "params";
       a.p(p0, obj);
       Map map = this.toHashMap(p0);
       String str = "rootTag";
       Ref$ObjectRef objectRef = null;
       if (map.containsKey(str)) {
          obj1 = map.get(str);
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Number");
          i = obj1.intValue();
       }else {
          Object obj4 = map.get(obj);
          if (!obj4 instanceof String) {
             obj4 = objectRef;
          }
          i = this.getViewTagFromParams(obj4);
       }
       obj1 = new Ref$ObjectRef();
       obj1.element = objectRef;
       Object obj2 = map.get("nameSpace");
       Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
       Object obj3 = obj2;
       obj2 = map.get("method");
       Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
       this.invokeInternal(i, obj3, obj2, map.get(obj), null, new KdsBridge$e(obj1), null);
       Ref$ObjectRef element = obj1.element;
       if (element instanceof WritableMap) {
          objectRef = element;
       }
       return objectRef;
    }
    public final String syncInvokeWithReturnStr(ReadableMap p0){
       Ref$ObjectRef obj1;
       int i;
       String obj = PatchProxy.applyOneRefs(p0, this, KdsBridge.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "params";
       a.p(p0, obj);
       Map map = this.toHashMap(p0);
       String str = "rootTag";
       Ref$ObjectRef objectRef = null;
       if (map.containsKey(str)) {
          obj1 = map.get(str);
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Number");
          i = obj1.intValue();
       }else {
          Object obj4 = map.get(obj);
          if (!obj4 instanceof String) {
             obj4 = objectRef;
          }
          i = this.getViewTagFromParams(obj4);
       }
       obj1 = new Ref$ObjectRef();
       obj1.element = objectRef;
       Object obj2 = map.get("nameSpace");
       Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
       Object obj3 = obj2;
       obj2 = map.get("method");
       Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
       this.invokeInternal(i, obj3, obj2, map.get(obj), "str", new KdsBridge$f(this, obj1), null);
       Ref$ObjectRef element = obj1.element;
       if (element instanceof String) {
          objectRef = element;
       }
       return objectRef;
    }
}
