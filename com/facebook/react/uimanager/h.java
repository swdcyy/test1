package com.facebook.react.uimanager.h;
import com.facebook.react.bridge.LifecycleEventListener;
import mb.b;
import mb.c;
import nb.a;
import lb.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule$b;
import com.facebook.react.uimanager.g;
import java.lang.Object;
import ze.l;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.Context;
import ze.c;
import df.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;
import hg.b$b;
import hg.b;
import java.lang.Boolean;
import com.facebook.react.uimanager.i;
import ze.v0;
import yd.e;
import java.util.List;
import hg.a;
import com.facebook.react.uimanager.l;
import com.facebook.react.uimanager.f;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.CatalystInstance;
import java.util.ArrayList;
import java.util.Iterator;
import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;
import vd.d;
import ze.m;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.j;
import java.util.Objects;
import java.lang.Long;
import ze.x;
import java.lang.Integer;
import com.facebook.react.bridge.MemoryStatsCallback;
import java.util.Set;
import ze.u0;
import android.content.ComponentCallbacks;
import android.content.ContextWrapper;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import java.lang.StringBuilder;
import cb.a;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Enum;
import com.facebook.react.bridge.Callback;
import com.facebook.react.uimanager.j$p;
import com.facebook.react.uimanager.j$o;
import ze.p;
import java.lang.Float;
import java.lang.RuntimeException;
import ze.w0;
import com.facebook.react.uimanager.UIManagerModule;
import df.d;
import java.lang.Runnable;
import java.util.concurrent.CopyOnWriteArraySet;
import vd.a;
import ze.e1;
import com.facebook.react.uimanager.k;
import android.media.AudioManager;
import androidx.collection.ArrayMap;
import java.util.Collections;
import ze.q0;
import com.facebook.react.uimanager.j$v;
import com.facebook.react.bridge.JavaOnlyArray;
import ze.j0;
import com.facebook.react.bridge.WritableArray;
import java.lang.IllegalStateException;
import com.facebook.react.uimanager.IllegalViewOperationException;
import android.view.View;
import java.lang.Number;
import ze.w;
import ze.n0;
import ze.v;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import pe.a;
import com.facebook.yoga.YogaDirection;
import ze.r0;
import ze.f;
import bf.a;
import com.facebook.react.bridge.UIManager;
import ze.t0;
import com.facebook.react.uimanager.j$r;
import com.facebook.react.uimanager.j$a;
import com.facebook.react.uimanager.NativeKind;
import com.facebook.react.uimanager.j$c;
import com.facebook.react.uimanager.j$t;
import com.facebook.react.bridge.WritableNativeMap;
import cf.a;
import com.facebook.react.uimanager.j$d;
import com.facebook.react.uimanager.h$b;
import com.facebook.react.uimanager.j$u;
import ze.z;
import java.lang.Double;
import com.facebook.react.uimanager.h$d;
import com.facebook.react.uimanager.j$g;
import com.facebook.react.uimanager.h$c;
import ze.n;
import com.facebook.react.uimanager.j$h;
import com.facebook.react.uimanager.j$i;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import com.facebook.react.modules.core.a$a;
import java.lang.Math;
import com.facebook.react.uimanager.j$k;
import com.facebook.react.uimanager.UIManagerModule$a;
import com.facebook.react.uimanager.h$a;

public abstract class h implements LifecycleEventListener	// class@00134f
{
    public final c b;
    public final Map c;
    public final Map d;
    public final l e;
    public final f f;
    public final l g;
    public final List h;
    public Map i;
    public int j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public boolean p;
    public int q;
    public int r;
    public static final boolean s;

    static {
       h.s = c.a().a(a.f);
    }
    public void h(ReactApplicationContext p0,UIManagerModule$b p1,int p2,int p3){
       Map map;
       g og = new g();
       super();
       this.g = new l();
       this.h = new CopyOnWriteArrayList();
       this.k = "id";
       this.l = "pId";
       this.m = "index";
       this.n = "name";
       this.o = "props";
       this.p = false;
       this.q = 0;
       c.g(p0);
       this.r = p3;
       c uoc = new c(p0);
       this.b = uoc;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p1, null, h.class, "5");
       if (obj != patchProxyRe) {
       }else {
          ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
          long l = 0;
          Boolean tRUE = Boolean.TRUE;
          b.a(l, "CreateUIManagerConstants").d("Lazy", tRUE).e();
          Object obj1 = PatchProxy.applyOneRefs(p1, null, i.class, "1");
          if (obj1 != patchProxyRe) {
             map = obj1;
          }else {
             map = og.b();
             if (!e.A) {
                map.put("ViewManagerNames", p1.b());
             }
             map.put("LazyViewManagersEnabled", tRUE);
          }
          a.c(l, "CreateUIManagerConstants");
          ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
          obj = map;
       }
       this.c = obj;
       this.d = og.c();
       l ol = new l(p1);
       this.e = ol;
       this.f = og.a(p0, ol, uoc, p2);
       p0.addLifecycleEventListener(this);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "56")) {
          CatalystInstance catalystInst = (p0.hasActiveCatalystInstance())? p0.getCatalystInstance(): null;
          if (catalystInst != null && catalystInst.useDeveloperSupport()) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = p1.b().iterator();
             while (iterator.hasNext()) {
                uArrayList.add(p1.a(iterator.next()));
             }
             this.c.putAll(h.i(uArrayList, null, this.d));
          }
       }
    label_00f1 :
       return;
    }
    public void h(ReactApplicationContext p0,List p1,UIManagerModule$b p2,g p3,int p4,int p5){
       super();
       this.g = new l();
       this.h = new CopyOnWriteArrayList();
       this.k = "id";
       this.l = "pId";
       this.m = "index";
       this.n = "name";
       this.o = "props";
       this.p = false;
       this.q = 0;
       c.g(p0);
       this.r = p5;
       c uoc = new c(p0);
       this.b = uoc;
       HashMap hashMap = d.b();
       this.d = hashMap;
       this.c = h.i(p1, null, hashMap);
       l ol = new l(p1, p2);
       this.e = ol;
       this.f = p3.a(p0, ol, uoc, p4);
       p0.addLifecycleEventListener(this);
    }
    public static Map i(List p0,Map p1,Map p2){
       p1 = PatchProxy.applyThreeRefs(p0, null, p2, null, h.class, "6");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
       b.a(0, "CreateUIManagerConstants").d("Lazy", Boolean.FALSE).e();
       a.c(0, "CreateUIManagerConstants");
       ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
       return i.a(p0, null, p2);
    }
    public m A(){
       Object obj = PatchProxy.apply(null, this, h.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       UiThreadUtil.assertOnUiThread();
       return this.f.k().m();
    }
    public Map B(){
       f f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, h.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.f;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, f.class, "13");
       if (obj1 != patchProxyRe) {
       }else {
          f = obj.f;
          Objects.requireNonNull(f);
          Object obj2 = PatchProxy.apply(objArray, f, j.class, "9");
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else {
             HashMap hashMap = new HashMap();
             hashMap.put("CommitStartTime", Long.valueOf(f.o));
             hashMap.put("CommitEndTime", Long.valueOf(f.p));
             hashMap.put("LayoutTime", Long.valueOf(f.q));
             hashMap.put("DispatchViewUpdatesTime", Long.valueOf(f.r));
             hashMap.put("RunStartTime", Long.valueOf(f.s));
             hashMap.put("RunEndTime", Long.valueOf(f.t));
             hashMap.put("BatchedExecutionTime", Long.valueOf(f.u));
             hashMap.put("NonBatchedExecutionTime", Long.valueOf(f.v));
             hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(f.w));
             hashMap.put("CreateViewCount", Long.valueOf(f.x));
             hashMap.put("UpdatePropsCount", Long.valueOf(f.y));
             obj1 = hashMap;
          }
       }
       return obj1;
    }
    public abstract ReactApplicationContext C();
    public x D(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "57");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.f.i(p0);
    }
    public f E(){
       return this.f;
    }
    public void F(MemoryStatsCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "55")) {
          return;
       }
       HashMap hashMap = new HashMap();
       h te = this.e;
       Objects.requireNonNull(te);
       Set set = PatchProxy.apply(null, te, l.class, "5");
       if (set != PatchProxyResult.class) {
       }else {
          set = te.a.keySet();
       }
       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
          ViewManager viewManager = this.f.y(iterator.next());
          if (viewManager != null) {
             viewManager.getMemoryStats(new u0(hashMap));
          }
       }
       p0.onMemoryStatsCollected(hashMap);
       return;
    }
    public l G(){
       return this.e;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.C().registerComponentCallbacks(this.g);
       this.b.g(1, this.C().getJSModule(RCTEventEmitter.class));
       return;
    }
    public void I(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "52")) {
          return;
       }
       x ox = this.f.x(p0);
       if (ox == null) {
          a.x("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag="+p0);
          return;
       }else {
          ox.dirty();
          this.f.g(-1);
          return;
       }
    }
    public WritableMap J(String p0){
       WritableMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Arguments.createMap();
       obj.putMap("viewConfig", this.g(p0));
       return obj;
    }
    public void K(int p0,ReadableArray p1,ReadableArray p2,ReadableArray p3,ReadableArray p4,ReadableArray p5){
       h oh = this;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       h oh1 = h.class;
       if (PatchProxy.isSupport(oh1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, this, oh1, "27")) {
             return;
          }
       }
       if (h.s) {
          String str = "\(UIManager.manageChildren\) tag: "+p0+", moveFrom: "+p1+", moveTo: "+p2+", addTags: "+p3+", atIndices: "+p4+", removeFrom: "+oobject4;
          a.a("ReactNative", str);
          c.a().b(a.f, str);
       }else {
          int i = p0;
       }
       oh.f.n(p0, p1, p2, p3, p4, p5);
       if (this.s()) {
          ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.MANAGE_CHILDREN_END.name(), "", oh.r);
       }
       return;
    }
    public void L(int p0,Callback p1){
       f f;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "29")) {
          return;
       }
       oh = this.f;
       Objects.requireNonNull(oh);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, oh, uof, "25")) {
          f = oh.f;
          Objects.requireNonNull(f);
          j oj = j.class;
          if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, f, oj, "30")) {
             f.g.add(new j$p(f, p0, p1));
          }
       }
       return;
    }
    public void M(int p0,Callback p1){
       f f;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "30")) {
          return;
       }
       oh = this.f;
       Objects.requireNonNull(oh);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, oh, uof, "26")) {
          f = oh.f;
          Objects.requireNonNull(f);
          j oj = j.class;
          if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, f, oj, "31")) {
             f.g.add(new j$o(f, p0, p1));
          }
       }
       return;
    }
    public void N(int p0,int p1,Callback p2,Callback p3){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, h.class, "31")) {
          return;
       }
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, tf, f.class, "27")) {
          int i = 1;
          try{
             tf.o(p0, p1, tf.h);
             Object[] objArray = new Object[]{Float.valueOf(p.a((float)tf.h[0])),Float.valueOf(p.a((float)tf.h[i])),Float.valueOf(p.a((float)tf.h[2])),Float.valueOf(p.a((float)tf.h[3]))};
             p3.invoke(objArray);
          }catch(com.facebook.react.uimanager.IllegalViewOperationException e9){
             Object[] objArray1 = new Object[i];
             objArray1[0] = e9.getMessage();
             p2.invoke(objArray1);
          }
       }
    }
    public void O(int p0,Callback p1,Callback p2){
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, tf, f.class, "28")) {
          int i = 1;
          try{
             tf.p(p0, tf.h);
             Object[] objArray = new Object[]{Float.valueOf(p.a((float)tf.h[0])),Float.valueOf(p.a((float)tf.h[i])),Float.valueOf(p.a((float)tf.h[2])),Float.valueOf(p.a((float)tf.h[3]))};
             p2.invoke(objArray);
          }catch(com.facebook.react.uimanager.IllegalViewOperationException e9){
             Object[] objArray1 = new Object[i];
             objArray1[0] = e9.getMessage();
             p1.invoke(objArray1);
          }
       }
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, h.class, "44")) {
          return;
       }
       if (this.p != null) {
          return;
       }
       h tq = this.q;
       this.q = tq + 1;
       if (h.s) {
          String str = "\(UIManager.onBatchComplete\)";
          a.a("ReactNative", str);
          c.a().b(a.f, str);
       }
       b.a(0, "onBatchCompleteUI").b("BatchId", tq).e();
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          iterator.next().willDispatchViewUpdates(this.e());
       }
       this.f.g(tq);
       if (this.s()) {
          ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.BATCH_COMPLETE_END.name(), "", this.r);
       }
       a.c(0, "onBatchCompleteUI");
       return;
    }
    public void Q(){
       f k;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "4")) {
          return;
       }
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, c.class, "11")) {
          UiThreadUtil.runOnUiThread(new d(tb));
       }
       tb = this.f;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, f.class, "42")) {
          k = tb.k;
          if (k != null) {
             k.clear();
          }
          if (tb.k() != null) {
             j oj = tb.k();
             Objects.requireNonNull(oj);
             if (!PatchProxy.applyVoid(objArray, oj, j.class, "4")) {
                oj = oj.z;
                if (oj != null) {
                   oj.clear();
                }
             }
          }
       }
    label_0058 :
       ReactApplicationContext reactApplica = this.C();
       if (e.m) {
          reactApplica.removeLifecycleEventListener(this);
       }
       reactApplica.unregisterComponentCallbacks(this.g);
       e1.a().b();
       k.a();
       return;
    }
    public void R(){
       AudioManager systemServic = this.C().getSystemService("audio");
       if (systemServic != null) {
          systemServic.playSoundEffect(0);
       }
       return;
    }
    public void S(List p0){
       ArrayMap uArrayMap = new ArrayMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          WritableMap writableMap = this.g(str);
          if (writableMap != null) {
             uArrayMap.put(str, writableMap);
          }
       }
       this.j = p0.size();
       this.i = Collections.unmodifiableMap(uArrayMap);
       return;
    }
    public void T(q0 p0){
       f f;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "48")) {
          return;
       }
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidOneRefs(p0, tf, f.class, "55")) {
          f = tf.f;
          Objects.requireNonNull(f);
          if (!PatchProxy.applyVoidOneRefs(p0, f, j.class, "36")) {
             f.g.add(0, new j$v(f, p0));
          }
       }
       return;
    }
    public void U(){
       f f;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "11")) {
          return;
       }
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, f.class, "12")) {
          f = tf.f;
          f.m = true;
          f.o = 0;
          f.x = 0;
          f.y = 0;
       }
       return;
    }
    public void V(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "16")) {
          return;
       }
       a.x("ReactNativeDestroy", "UIManager::removeRootView "+p0);
       this.f.u(p0);
       return;
    }
    public void W(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "17")) {
          return;
       }
       x ox = this.f.x(p0);
       if (ox != null && ox.getChildCount() > 0) {
          JavaOnlyArray javaOnlyArra = new JavaOnlyArray();
          javaOnlyArra.pushInt(0);
          this.K(p0, null, null, null, null, javaOnlyArra);
       }
       this.f.u(p0);
       this.P();
       return;
    }
    public void X(int p0){
       h tf = this.f;
       Objects.requireNonNull(tf);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tf, uof, "23")) {
          x ox = tf.d.a(p0);
          if (ox == null) {
             a.g("ReactNative", "Trying to remove subviews of an unknown view tag: "+p0);
          }else {
             WritableArray writableArra = Arguments.createArray();
             for (int i = 0; i < ox.getChildCount(); i = i + 1) {
                writableArra.pushInt(i);
             }
             tf.n(p0, null, null, null, null, writableArra);
          }
       }
       return;
    }
    public void Y(w0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "50")) {
          return;
       }
       this.h.remove(p0);
       return;
    }
    public void Z(int p0,int p1){
       h tf = this.f;
       Objects.requireNonNull(tf);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tf, uof, "22")) {
          if (!tf.d.b(p0) && !tf.d.b(p1)) {
             x ox = tf.d.a(p0);
             if (ox != null) {
                x parent = ox.getParent();
                if (parent != null) {
                   p0 = parent.indexOf(ox);
                   if (p0 >= 0) {
                      WritableArray writableArra = Arguments.createArray();
                      writableArra.pushInt(p1);
                      WritableArray writableArra1 = Arguments.createArray();
                      writableArra1.pushInt(p0);
                      WritableArray writableArra2 = Arguments.createArray();
                      writableArra2.pushInt(p0);
                      tf.n(parent.getReactTag(), null, null, writableArra, writableArra1, writableArra2);
                   }else {
                      throw new IllegalStateException("Didn\'t find child tag in parent");
                   }
                }else {
                   throw new IllegalViewOperationException("Node is not attached to a parent: "+p0);
                }
             }else {
                throw new IllegalViewOperationException("Trying to replace unknown view tag: "+p0);
             }
          }else {
             throw new IllegalViewOperationException("Trying to add or replace a root tag!");
          }
       }
       return;
    }
    public int a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b(p0, null, null);
    }
    public int a0(int p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "51");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       f uof = 1;
       int i = 0;
       if ((p0 % 10) != uof) {
          uof = null;
       }
       if (!uof) {
          oh = this.f;
          Objects.requireNonNull(oh);
          uof = f.class;
          if (PatchProxy.isSupport(uof)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), oh, uof, "56");
             if (obj1 != patchProxyRe) {
                p0 = obj1.intValue();
             }
          }
          a.x("ReactNative", "resolveRootTagFromReactTag  reactTag:"+p0);
          if (!oh.d.b(p0)) {
             x ox = oh.x(p0);
             if (ox != null) {
                i = ox.getRootTag();
             }else {
                a.x("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag="+p0);
             }
             p0 = i;
          }
       }
       return p0;
    }
    public int b(View p0,WritableMap p1,String p2){
       f a;
       f f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, h.class, "15");
       if (p1 != patchProxyRe) {
          return p1.intValue();
       }
       a.a(0, "UIManagerModule.addRootView");
       int i = w.a();
       n0 on0 = new n0(this.C(), p0.getContext(), p0.getSurfaceID());
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i), on0, tf, f.class, "7")) {
          a = tf.a;
          _monitor_enter(a);
          ReactShadowNodeImpl reactShadowN = PatchProxy.apply(null, tf, f.class, "1");
          if (reactShadowN != patchProxyRe) {
          }else {
             reactShadowN = new ReactShadowNodeImpl();
             if (a.b().d(tf.c)) {
                reactShadowN.setLayoutDirection(YogaDirection.RTL);
             }
             reactShadowN.setViewClassName("Root");
          }
          reactShadowN.setReactTag(i);
          reactShadowN.setThemedContext(on0);
          on0.runOnNativeModulesQueueThread(new r0(tf, reactShadowN));
          f = tf.f;
          Objects.requireNonNull(f);
          j oj = j.class;
          if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), p0, f, oj, "11")) {
             f.b.v(i, p0);
          }
          _monitor_exit(a);
       }
       a.c(0, "UIManagerModule.addRootView");
       return i;
    }
    public View b0(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "54");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       UiThreadUtil.assertOnUiThread();
       return this.f.k().m().p(p0);
    }
    public void c(q0 p0){
       f f;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "47")) {
          return;
       }
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidOneRefs(p0, tf, f.class, "54")) {
          f = tf.f;
          Objects.requireNonNull(f);
          if (!PatchProxy.applyVoidOneRefs(p0, f, j.class, "35")) {
             f.g.add(new j$v(f, p0));
          }
       }
       return;
    }
    public void c0(int p0,int p1){
       f f;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oh, "46")) {
          return;
       }
       int i = a.a(p0);
       if (i == 2) {
          UIManager uIManager = t0.a(this.C(), i);
          if (uIManager != null) {
             uIManager.sendAccessibilityEvent(p0, p1);
          }
       }else {
          oh = this.f;
          Objects.requireNonNull(oh);
          f uof = f.class;
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), oh, uof, "39")) {
             f = oh.f;
             Objects.requireNonNull(f);
             j oj = j.class;
             if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), f, oj, "33")) {
                f.g.add(new j$r(f, p0, p1, null));
             }
          }
       }
       return;
    }
    public void d(w0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "49")) {
          return;
       }
       this.h.add(p0);
       return;
    }
    public void d0(int p0,ReadableArray p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "28")) {
          return;
       }
       if (h.s) {
          String str = "\(UIManager.setChildren\) tag: "+p0+", children: "+p1;
          a.a("ReactNative", str);
          c.a().b(a.f, str);
       }
       this.f.z(p0, p1);
       if (this.s()) {
          ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.SET_CHILDREN_END.name(), "", this.r);
       }
       return;
    }
    public abstract UIManagerModule e();
    public void e0(int p0,boolean p1){
       f f;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, oh, "33")) {
          return;
       }
       oh = this.f;
       Objects.requireNonNull(oh);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), oh, uof, "34")) {
          x ox = oh.d.a(p0);
          if (ox != null) {
             while (ox.getNativeKind() == NativeKind.NONE) {
                ox = ox.getParent();
             }
             f = oh.f;
             int reactTag = ox.getReactTag();
             Objects.requireNonNull(f);
             if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(reactTag), Integer.valueOf(p0), Boolean.valueOf(p1), f, j.class, "14")) {
                j$c uoc = new j$c(f, reactTag, p0, false, p1);
                f.g.add(v9);
             }
          }
       }
       return;
    }
    public void f(){
       f f;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "34")) {
          return;
       }
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, f.class, "35")) {
          f = tf.f;
          Objects.requireNonNull(f);
          if (!PatchProxy.applyVoid(objArray, f, j.class, "15")) {
             j$c uoc = new j$c(f, 0, 0, true, false);
             f.g.add(objArray);
          }
       }
       return;
    }
    public void f0(boolean p0){
       f f;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "42")) {
          return;
       }
       oh = this.f;
       Objects.requireNonNull(oh);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), oh, uof, "32")) {
          f = oh.f;
          Objects.requireNonNull(f);
          j oj = j.class;
          if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), f, oj, "28")) {
             f.g.add(new j$t(f, p0, null));
          }
       }
       return;
    }
    public final WritableMap g(String p0){
       WritableMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       ViewManager viewManager = (p0 != null)? this.f.y(p0): obj;
       if (viewManager == null) {
          return obj;
       }else {
          b.a(0, "UIManagerModule.getConstantsForViewManager").d("ViewManager", viewManager.getName()).d("Lazy", Boolean.TRUE).e();
          Map map = i.b(viewManager, obj, obj, obj, this.d);
          if (map != null) {
             b.b(0, "UIManagerModule.getConstantsForViewManager").e();
             return Arguments.makeNativeMap(map);
          }else {
             b.b(0, "UIManagerModule.getConstantsForViewManager").e();
             return obj;
          }
       }
    }
    public void g0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "45")) {
          return;
       }
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidOneRefs(p0, tf, f.class, "43")) {
          tf.f.j = p0;
       }
       return;
    }
    public void h(ReadableMap p0,Callback p1,Callback p2){
       f f;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "43")) {
          return;
       }
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, tf, f.class, "33")) {
          f = tf.f;
          Objects.requireNonNull(f);
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, f, j.class, "29")) {
             f.g.add(new j$d(f, p0, p1, null));
          }
       }
       return;
    }
    public void h0(int p0,Object p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "19")) {
          return;
       }
       ReactApplicationContext reactApplica = this.C();
       reactApplica.assertOnUiQueueThread();
       reactApplica.runOnNativeModulesQueueThread(new h$b(this, reactApplica, p0, p1));
       return;
    }
    public void i0(int p0,ReadableArray p1,Callback p2,Callback p3){
       f f;
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, h.class, "40")) {
          return;
       }
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, tf, f.class, "37")) {
          tf.d(p0, "showPopupMenu");
          f = tf.f;
          Objects.requireNonNull(f);
          if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, f, j.class, "18")) {
             j$u ou = new j$u(f, p0, p1, p2, p3);
             f.g.add(v8);
          }
       }
       return;
    }
    public void j(int p0,String p1,int p2,ReadableMap p3){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), p3, this, h.class, "21")) {
          return;
       }
       if (h.s) {
          String str = "\(UIManager.createView\) tag: "+p0+", class: "+p1+", props: "+p3;
          a.a("ReactNative", str);
          c.a().b(a.f, str);
       }
       this.f.f(p0, p1, p2, p3);
       if (this.s()) {
          ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.CREATE_VIEW_END.name(), p1, this.r);
       }
       return;
    }
    public void j0(int p0,ReadableMap p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "14")) {
          return;
       }
       int i = a.a(p0);
       if (i == 2) {
          UIManager uIManager = t0.a(this.C(), i);
          if (uIManager != null) {
             uIManager.synchronouslyUpdateViewOnUIThread(p0, p1);
          }
       }else {
          this.f.B(p0, new z(p1));
       }
       return;
    }
    public void k(int p0,ReadableArray p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "23")) {
          return;
       }
       if (h.s) {
          a.a("ReactNative", "\(UIManager.createViewBatch\) rootTag: "+p0+", array: "+p1);
       }
       x ox = this.f.x(p0);
       if (p1 != null && ox != null) {
          this.p = true;
          int i = 0;
          while (i < p1.size()) {
             ReadableMap map = p1.getMap(i);
             int i1 = Double.valueOf(map.getDouble("id")).intValue();
             String str = map.getString("name");
             this.j(i1, str, p0, map.getMap("props"));
             int i2 = Double.valueOf(map.getDouble("pId")).intValue();
             int i3 = Double.valueOf(map.getDouble("index")).intValue();
             if (this.f.x(i2) == null) {
                a.g("UIManagerImpl", "createViewBatch error pNode is null! pTag:"+i2+" tag:"+i1+" className:"+str);
             }else {
                JavaOnlyArray javaOnlyArra = new JavaOnlyArray();
                JavaOnlyArray javaOnlyArra1 = new JavaOnlyArray();
                javaOnlyArra.pushInt(i1);
                javaOnlyArra1.pushInt(i3);
                this.K(i2, null, null, javaOnlyArra, javaOnlyArra1, null);
             }
             i = i + 1;
          }
       }
       return;
    }
    public void k0(int p0,int p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, h.class, "18")) {
          return;
       }
       this.C().assertOnNativeModulesQueueThread();
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), tf, f.class, "10")) {
          x ox = tf.d.a(p0);
          if (ox == null) {
             a.x("ReactNative", "Tried to update size of non-existent tag: "+p0);
          }else {
             ox.setStyleWidth((float)p1);
             ox.setStyleHeight((float)p2);
             tf.h();
          }
       }
       return;
    }
    public void l(int p0,ReadableArray p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "25")) {
          return;
       }
       if (h.s) {
          a.a("ReactNative", "\(UIManager.deleteViewBatch\) rootTag: "+p0+", array: "+p1);
       }
       x ox = this.f.x(p0);
       if (p1 != null && ox != null) {
          this.p = true;
          ox = 0;
          while (ox < p1.size()) {
             ReadableMap map = p1.getMap(ox);
             int i = Double.valueOf(map.getDouble("pId")).intValue();
             int i1 = Double.valueOf(map.getDouble("id")).intValue();
             String str = " tag:";
             String str1 = "UIManagerImpl";
             if (this.f.x(i) == null) {
                a.g(str1, "deleteViewBatch error pNode is null! pTag:"+i+str+i1);
             }else if(this.f.x(i1) == null){
                a.g(str1, "deleteViewBatch error node is null! pTag:"+i+str+i1);
             }else {
                JavaOnlyArray javaOnlyArra = new JavaOnlyArray();
                javaOnlyArra.pushInt(Double.valueOf(map.getDouble("index")).intValue());
                this.K(i, null, null, null, null, javaOnlyArra);
             }
             ox++;
          }
       }
       return;
    }
    public void l0(int p0,int p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, h.class, "53")) {
          return;
       }
       ReactApplicationContext reactApplica = this.C();
       h$d uod = new h$d(this, reactApplica, p0, p1, p2);
       reactApplica.runOnNativeModulesQueueThread(v7);
       return;
    }
    public void m(){
       f f;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "41")) {
          return;
       }
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, f.class, "38")) {
          f = tf.f;
          Objects.requireNonNull(f);
          if (!PatchProxy.applyVoid(objArray, f, j.class, "19")) {
             f.g.add(new j$g(f));
          }
       }
       return;
    }
    public void m0(int p0,String p1,ReadableMap p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, h.class, "22")) {
          return;
       }
       String str = "ReactNative";
       if (h.s) {
          String str1 = "\(UIManager.updateView\) tag: "+p0+", class: "+p1+", props: "+p2;
          a.a(str, str1);
          c.a().b(a.f, str1);
       }
       boolean i = a.a(p0);
       if (i == 2) {
          ReactApplicationContext reactApplica = this.C();
          if (reactApplica.hasActiveCatalystInstance()) {
             UIManager uIManager = t0.a(reactApplica, i);
             if (uIManager != null) {
                reactApplica.runOnUiQueueThread(new h$c(this, uIManager, p0, p2));
             }
          }
       }else {
          h tf = this.f;
          Objects.requireNonNull(tf);
          if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, tf, f.class, "16")) {
             if (tf.e.a(p1) != null) {
                x ox = tf.d.a(p0);
                if (ox == null) {
                   a.g(str, "Trying to update non-existent view with tag "+p0);
                }else if(p2 != null){
                   z oz = new z(p2);
                   ox.updateProperties(oz);
                   if (!PatchProxy.applyVoidThreeRefs(ox, p1, oz, tf, f.class, "18") && !ox.isVirtual()) {
                      f g = tf.g;
                      Objects.requireNonNull(g);
                      if (!PatchProxy.applyVoidThreeRefs(ox, p1, oz, g, n.class, "4")) {
                         i = (ox.isLayoutOnly() && !n.j(oz))? true: false;
                         if (i) {
                            g.l(ox, oz);
                         }else if(!ox.isLayoutOnly()){
                            g.a.j(ox.getReactTag(), p1, oz);
                         }
                      }
                   }
                }
             }else {
                throw new IllegalViewOperationException("Got unknown view type: "+p1);
             }
          }
       }
       if (this.s()) {
          ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.UPDATE_VIEW_END.name(), p1, this.r);
       }
       return;
    }
    public void n(int p0,int p1,ReadableArray p2){
       h tf = this.f;
       tf.d(p0, "dispatchViewManagerCommand");
       x ox = tf.d.a(p0);
       if (ox == null) {
       }else {
          f f = tf.f;
          j$h oh = new j$h(f, p0, p1, ox.getViewClass(), p2);
          f.g.add(ox);
       }
       return;
    }
    public void n0(int p0,ReadableArray p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "24")) {
          return;
       }
       if (h.s) {
          a.a("ReactNative", "\(UIManager.updateViewBatch\) rootTag: "+p0+", array: "+p1);
       }
       x ox = this.f.x(p0);
       if (p1 != null && ox != null) {
          this.p = true;
          ox = 0;
          while (ox < p1.size()) {
             ReadableMap map = p1.getMap(ox);
             int i = Double.valueOf(map.getDouble("id")).intValue();
             String str = map.getString("name");
             map = map.getMap("props");
             if (this.f.x(i) == null) {
                a.g("UIManagerImpl", "updateViewBatch error Node is null! tag:"+i+" className:"+str);
             }else {
                this.m0(i, str, map);
             }
             ox++;
          }
       }
       return;
    }
    public void o(int p0,String p1,ReadableArray p2){
       f f;
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, h.class, "37")) {
          return;
       }
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, tf, f.class, "36")) {
          tf.d(p0, "dispatchViewManagerCommand");
          x ox = tf.d.a(p0);
          if (ox != null) {
             f = tf.f;
             String viewClass = ox.getViewClass();
             Objects.requireNonNull(f);
             if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, viewClass, p2, f, j.class, "16")) {
                j$i oi = new j$i(f, p0, p1, viewClass, p2);
                f.g.add(v9);
             }
          }
       }
       return;
    }
    public void o0(int p0,int p1,Callback p2){
       h tf = this.f;
       x ox = tf.d.a(p0);
       x ox1 = tf.d.a(p1);
       int i = 1;
       if (ox == null || ox1 == null) {
          Object[] objArray = new Object[i];
          objArray[0] = Boolean.FALSE;
          p2.invoke(objArray);
       }else {
          Object[] objArray1 = new Object[i];
          objArray1[0] = Boolean.valueOf(ox.isDescendantOf(ox1));
          p2.invoke(objArray1);
       }
       return;
    }
    public void onHostDestroy(){
    }
    public void onHostPause(){
       f f;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "3")) {
          return;
       }
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, f.class, "41")) {
          f = tf.f;
          Objects.requireNonNull(f);
          if (!PatchProxy.applyVoid(objArray, f, j.class, "46")) {
             f.k = false;
             ReactChoreographer.a().f(ReactChoreographer$CallbackType.DISPATCH_UI, f.e);
             f.k();
          }
       }
       return;
    }
    public void onHostResume(){
       f f;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "2")) {
          return;
       }
       h tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, f.class, "40")) {
          f = tf.f;
          Objects.requireNonNull(f);
          if (!PatchProxy.applyVoid(objArray, f, j.class, "45")) {
             f.k = true;
             ReactChoreographer.a().d(ReactChoreographer$CallbackType.DISPATCH_UI, f.e);
          }
       }
       return;
    }
    public void p(int p0,int p1,ReadableArray p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, h.class, "35")) {
          return;
       }
       UIManager uIManager = t0.a(this.C(), a.a(p0));
       if (uIManager != null) {
          uIManager.dispatchCommand(p0, p1, p2);
       }
       return;
    }
    public void q(Double p0,String p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "39")) {
          return;
       }
       this.o(p0.intValue(), p1, p2);
       return;
    }
    public void r(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "58")) {
          return;
       }
       oh = this.f;
       Objects.requireNonNull(oh);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), oh, uof, "64")) {
          oh.f.e(p0);
       }
       return;
    }
    public final boolean s(){
       ReactApplicationContext obj = PatchProxy.apply(null, this, h.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.C();
       if (obj.hasActiveCatalystInstance()) {
          return obj.getCatalystInstance().enableReportLoadMonitor();
       }
       return false;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, h.class, "26")) {
          return;
       }
       this.p = false;
       this.P();
       return;
    }
    public void u(int p0,ReadableArray p1,Callback p2){
       ReadableArray readableArra = p1;
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, h.class, "32")) {
          return;
       }
       h f = this.f;
       float f1 = (float)Math.round(p.b(readableArra.getDouble(0)));
       float f2 = (float)Math.round(p.b(readableArra.getDouble(1)));
       Objects.requireNonNull(f);
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Float.valueOf(f1), Float.valueOf(f2), p2, f, f.class, "24")) {
          f f3 = f.f;
          Objects.requireNonNull(f3);
          if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Float.valueOf(f1), Float.valueOf(f2), p2, f3, j.class, "32")) {
             j$k ok = new j$k(f3, p0, f1, f2, p2, null);
             f3.g.add(v2);
          }
       }
       return;
    }
    public Map v(){
       return this.c;
    }
    public WritableMap w(String p0){
       h obj = PatchProxy.applyOneRefs(p0, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null || !obj.containsKey(p0)) {
          return this.g(p0);
       }
       WritableMap writableMap = this.i.get(p0);
       int i = this.j - 1;
       this.j = i;
       if (i <= 0) {
          this.i = null;
       }
       return writableMap;
    }
    public WritableMap x(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Map obj = PatchProxy.apply(objArray, this, h.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, objArray, i.class, "2");
       if (obj != patchProxyRe) {
       }else {
          Map map = patchProxyRe.a();
          obj = d.e("bubblingEventTypes", map, "directEventTypes", map.c());
       }
       return Arguments.makeNativeMap(obj);
    }
    public UIManagerModule$a y(){
       Object obj = PatchProxy.apply(null, this, h.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h$a(this);
    }
    public c z(){
       return this.b;
    }
}
