package be.c;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.JSIModule;
import yd.e;
import mb.b;
import mb.c;
import nb.a;
import lb.a;
import be.b;
import android.os.SystemClock;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.lang.StringBuilder;
import java.lang.String;
import hg.a;
import java.lang.Object;
import de.f;
import ce.b;
import java.util.Iterator;
import cb.a;
import android.view.View;
import com.facebook.react.bridge.WritableMap;
import ze.w;
import ze.v;
import ze.n0;
import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Objects;
import java.lang.Integer;
import ce.b$a;
import com.facebook.react.uimanager.ViewManager;
import java.util.concurrent.ConcurrentHashMap;
import cb.c;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.fabric.Binding;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.lang.System;
import be.c$b;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.bridge.ReadableMap;
import be.a;
import de.a;
import ze.m0;
import java.lang.IllegalArgumentException;
import de.b;
import com.facebook.react.bridge.ReadableArray;
import de.c;
import de.d;
import java.util.Map;
import java.util.HashMap;
import java.lang.Long;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import df.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import de.e;
import ce.a;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.facebook.react.bridge.ReactSoftException;
import be.c$c;
import com.facebook.react.uimanager.events.ReactEventEmitter;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.k;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import com.facebook.react.modules.core.a$a;
import de.g;
import de.h;
import de.i;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;
import de.j;
import be.c$a;
import de.k;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import de.l;
import de.m;
import de.n;
import de.o;
import de.p;

public class c implements UIManager, LifecycleEventListener, JSIModule	// class@000b21
{
    public Binding b;
    public final ReactApplicationContext c;
    public final b d;
    public final c e;
    public final ConcurrentHashMap f;
    public final EventBeatManager g;
    public final Object h;
    public final Object i;
    public List j;
    public ArrayDeque k;
    public final c$c l;
    public boolean m;
    public boolean n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public static final boolean w;

    static {
       boolean b = (e.G || c.a().a(a.g))? true: false;
       c.w = b;
       b.a();
    }
    public void a(){
       this.o = SystemClock.uptimeMillis();
       c th = this.h;
       _monitor_enter(th);
       if (this.j.isEmpty()) {
          _monitor_exit(th);
          return;
       }else {
          c tj = this.j;
          this.j = new ArrayList();
          _monitor_exit(th);
          th = null;
          c ti = this.i;
          _monitor_enter(ti);
          if (!this.k.isEmpty()) {
             th = this.k;
             this.k = new ArrayDeque(250);
          }
          _monitor_exit(ti);
          if (th != null) {
             a.a(0, "FabricUIManager::mountViews preMountItems to execute: "+th.size());
             while (!th.isEmpty()) {
                th.pollFirst().a(this.d);
             }
             a.c(0, "FabricUIManager::mountViews preMountItems to execute: ");
          }
          a.a(0, "FabricUIManager::mountViews mountItems to execute: "+tj.size());
          long l = SystemClock.uptimeMillis();
          Iterator iterator = tj.iterator();
          while (iterator.hasNext()) {
             f uof = iterator.next();
             if (c.w) {
                String[] stringArray = (uof.toString()).split("\n");
                int len = stringArray.length;
                for (int i = 0; i < len; i = i + 1) {
                   a.a("FabricUIManager", "dispatchMountItems: Executing mountItem: "+stringArray[i]);
                }
             }
             uof.a(this.d);
          }
          this.p = SystemClock.uptimeMillis() - l;
          a.c(0, "FabricUIManager::mountViews mountItems to execute: ");
          return;
       }
    }
    public int addRootView(View p0,WritableMap p1,String p2){
       int i = w.a();
       v ov = p0;
       n0 on0 = new n0(this.c, p0.getContext(), ov.getSurfaceID());
       c td = this.d;
       Objects.requireNonNull(td);
       if (p0.getId() != -1) {
          throw new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
       }
       td.a.put(Integer.valueOf(i), new b$a(i, p0, td.d, true));
       p0.setId(i);
       String jSModuleName = ov.getJSModuleName();
       this.f.put(Integer.valueOf(i), on0);
       if (c.w) {
          Integer integer = Integer.valueOf(i);
          if (a.a.d(3)) {
             Object[] objArray = new Object[]{jSModuleName,integer};
             a.a.d("FabricUIManager", a.i("Starting surface for module: %s and reactTag: %d", objArray));
          }
       }
       this.b.startSurface(i, jSModuleName, p1);
       if (p2 != null) {
          this.b.renderTemplateToSurface(i, p2);
       }
       return i;
    }
    public void b(long p0){
       a.a(0, "FabricUIManager::premountViews");
       long l = System.nanoTime() - p0;
       l = l / 0xf4240;
       long l1 = 16 - l;
       while (l1 - 8 >= 0) {
          c ti = this.i;
          _monitor_enter(ti);
          if (this.k.isEmpty()) {
             _monitor_exit(ti);
             break ;
          }else {
             _monitor_exit(ti);
             this.k.pollFirst().a(this.d);
          }
       }
       a.c(0, "FabricUIManager::premountViews");
       return;
    }
    public void clearJSResponder(){
       c th = this.h;
       _monitor_enter(th);
       this.j.add(new c$b(this));
       _monitor_exit(th);
    }
    public final f createBatchMountItem(f[] p0,int p1,int p2){
       return new BatchMountItem(p0, p1, p2);
    }
    public final f createMountItem(String p0,ReadableMap p1,Object p2,int p3,int p4,boolean p5){
       String str = a.a(p0);
       Object obj = this.f.get(Integer.valueOf(p3));
       if (obj == null) {
          throw new IllegalArgumentException("Unable to find ReactContext for root: "+p3);
       }
       a uoa = new a(obj, p3, p4, str, p1, p2, p5);
       return this.f.get(Integer.valueOf(p3));
    }
    public final f deleteMountItem(int p0){
       return new b(p0);
    }
    public void dispatchCommand(int p0,int p1,ReadableArray p2){
       c th = this.h;
       _monitor_enter(th);
       this.j.add(new c(p0, p1, p2));
       _monitor_exit(th);
    }
    public void dispatchCommand(int p0,String p1,ReadableArray p2){
       c th = this.h;
       _monitor_enter(th);
       this.j.add(new d(p0, p1, p2));
       _monitor_exit(th);
    }
    public Map getPerformanceCounters(){
       HashMap hashMap = new HashMap();
       hashMap.put("CommitStartTime", Long.valueOf(this.r));
       hashMap.put("LayoutTime", Long.valueOf(this.s));
       hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.q));
       hashMap.put("RunStartTime", Long.valueOf(this.o));
       hashMap.put("BatchedExecutionTime", Long.valueOf(this.p));
       hashMap.put("FinishFabricTransactionTime", Long.valueOf(this.t));
       hashMap.put("FinishFabricTransactionCPPTime", Long.valueOf(this.u));
       return hashMap;
    }
    public void initialize(){
       this.e.g(2, new FabricEventEmitter(this));
       c te = this.e;
       c tg = this.g;
       Objects.requireNonNull(te);
       if (PatchProxy.applyVoidOneRefs(tg, te, c.class, "6")) {
       }else {
          te.j.add(tg);
       }
       return;
    }
    public final f insertMountItem(int p0,int p1,int p2){
       return new e(p0, p1, p2);
    }
    public final long measure(int p0,String p1,ReadableMap p2,ReadableMap p3,ReadableMap p4,float p5,float p6,float p7,float p8){
       c uoc = this;
       return uoc.d.g(uoc.f.get(Integer.valueOf(p0)), p1, p2, p3, p4, a.d(p5, p6), a.c(p5, p6), a.d(p7, p8), a.c(p7, p8));
    }
    public final long measure(String p0,ReadableMap p1,ReadableMap p2,ReadableMap p3,float p4,float p5,float p6,float p7){
       c uoc = this;
       return uoc.d.g(uoc.c, p0, p1, p2, p3, a.d(p4, p5), a.c(p4, p5), a.d(p6, p7), a.c(p6, p7));
    }
    public void onCatalystInstanceDestroy(){
       c uoc = c.class;
       String str = "FabricUIManager";
       a.k(str, "FabricUIManager.onCatalystInstanceDestroy");
       if (this.n != null) {
          ReactSoftException.logSoftException(str, new IllegalStateException("Cannot double-destroy FabricUIManager"));
          return;
       }else {
          this.n = true;
          this.l.d();
          c te = this.e;
          c tg = this.g;
          Objects.requireNonNull(te);
          if (!PatchProxy.applyVoidOneRefs(tg, te, uoc, "7")) {
             te.j.remove(tg);
          }
          te = this.e;
          Objects.requireNonNull(te);
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(2), te, uoc, "16")) {
             te.o.unregister(2);
          }
          this.c.removeLifecycleEventListener(this);
          this.onHostPause();
          this.l.d();
          this.b.uninstallFabricUIManager();
          this.b = null;
          k.a();
          return;
       }
    }
    public void onHostDestroy(){
    }
    public void onHostPause(){
       ReactChoreographer.a().f(ReactChoreographer$CallbackType.DISPATCH_UI, this.l);
    }
    public void onHostResume(){
       ReactChoreographer.a().d(ReactChoreographer$CallbackType.DISPATCH_UI, this.l);
    }
    public void onRequestEventBeat(){
       c te = this.e;
       Objects.requireNonNull(te);
       if (PatchProxy.applyVoid(null, te, c.class, "2")) {
       }else {
          te.e();
       }
       return;
    }
    public final void preallocateView(int p0,int p1,String p2,ReadableMap p3,Object p4,boolean p5){
       c uoc = this;
       c i = uoc.i;
       _monitor_enter(i);
       g og = new g(uoc.f.get(Integer.valueOf(p0)), p0, p1, a.a(p2), p3, p4, p5);
       uoc.k.add(v11);
       _monitor_exit(i);
    }
    public void profileNextBatch(){
    }
    public final f removeDeleteMultiMountItem(int[] p0){
       return new h(p0);
    }
    public final f removeMountItem(int p0,int p1,int p2){
       return new i(p0, p1, p2);
    }
    public final void scheduleMountItem(f p0,int p1,long p2,long p3,long p4,long p5,long p6,long p7,long p8){
       c uoc = this;
       ReactMarkerConstants obj = p0;
       int i = p1;
       long l = p2;
       long l1 = p5;
       long l2 = p6;
       long l3 = p7;
       long l4 = p8;
       if (v13 = obj instanceof BatchMountItem) {
          uoc.r = l;
          uoc.s = l2 - l1;
          uoc.u = l4 - l3;
          uoc.t = SystemClock.uptimeMillis() - l3;
          uoc.q = SystemClock.uptimeMillis();
       }
       c h = uoc.h;
       _monitor_enter(h);
       uoc.j.add(obj);
       _monitor_exit(h);
       if (UiThreadUtil.isOnUiThread()) {
          obj = (!e.K || uoc.m != null)? 1: null;
          if (obj) {
             this.a();
          }
       }
       if (v13) {
          ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i, l);
          ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i, l3);
          ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i, l4);
          ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i, p3);
          ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i, p4);
          ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i, l1);
          ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i, l2);
          ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i);
       }
       return;
    }
    public void sendAccessibilityEvent(int p0,int p1){
       c th = this.h;
       _monitor_enter(th);
       this.j.add(new j(p0, p1));
       _monitor_exit(th);
    }
    public void setAllowImmediateUIOperationExecution(boolean p0){
       this.m = p0;
    }
    public void setJSResponder(int p0,int p1,boolean p2){
       c th = this.h;
       _monitor_enter(th);
       this.j.add(new c$a(this, p0, p1, p2));
       _monitor_exit(th);
    }
    public void synchronouslyUpdateViewOnUIThread(int p0,ReadableMap p1){
       int i;
       String str;
       int i1;
       ReactMarkerConstants fABRIC_UPDAT;
       c uoc = this;
       UiThreadUtil.assertOnUiThread();
       long l = SystemClock.uptimeMillis();
       c v = uoc.v;
       uoc.v = v + 1;
       try{
          i = 0;
          ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, i, v);
          if (c.w) {
             a.b("FabricUIManager", "SynchronouslyUpdateViewOnUIThread for tag %d", Integer.valueOf(p0));
          }
          f uof = this.updatePropsMountItem(p0, p1);
          c uoc1 = this;
          c uoc2 = v;
          c uoc3 = v;
          try{
             long l1 = l;
             uoc1.scheduleMountItem(uof, uoc2, l1, 0, 0, 0, 0, 0, 0);
             fABRIC_UPDAT = ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END;
             uoc1 = uoc3;
             str = null;
          label_005a :
             ReactMarker.logFabricMarker(fABRIC_UPDAT, str, i1);
             return;
          }catch(java.lang.Exception e0){
             i1 = uoc3;
             str = null;
          }
          fABRIC_UPDAT = ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END;
          goto label_005a ;
       }catch(java.lang.Exception e0){
          str = i;
          i1 = v;
          goto label_0058 ;
       }
    }
    public final f updateEventEmitterMountItem(int p0,Object p1){
       return new k(p0, p1);
    }
    public final f updateLayoutMountItem(int p0,int p1,int p2,int p3,int p4,int p5){
       l ol = new l(p0, p1, p2, p3, p4, p5);
       return v7;
    }
    public final f updateLocalDataMountItem(int p0,ReadableMap p1){
       return new m(p0, p1);
    }
    public final f updatePaddingMountItem(int p0,int p1,int p2,int p3,int p4){
       n on = new n(p0, p1, p2, p3, p4);
       return v6;
    }
    public final f updatePropsMountItem(int p0,ReadableMap p1){
       return new o(p0, p1);
    }
    public void updateRootLayoutSpecs(int p0,int p1,int p2){
       if (c.w) {
          a.a("FabricUIManager", "Updating Root Layout Specs");
       }
       this.b.setConstraints(p0, a.b(p1), a.a(p1), a.b(p2), a.a(p2));
       return;
    }
    public final f updateStateMountItem(int p0,Object p1){
       return new p(p0, p1);
    }
}
