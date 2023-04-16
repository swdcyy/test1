package com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.MemoryStatsProvider;
import com.facebook.react.bridge.BaseJavaModule;
import ze.n0;
import android.view.View;
import ze.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.RuntimeException;
import com.facebook.react.bridge.ReactApplicationContext;
import we.a;
import ze.z;
import ze.m0;
import we.d;
import we.b;
import java.util.Map;
import ze.c1;
import com.facebook.react.bridge.MemoryStatsCallback;
import java.util.HashMap;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.k$e;
import com.facebook.react.uimanager.k$c;
import com.facebook.react.uimanager.k$d;
import android.content.Context;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Boolean;
import yd.e;
import java.util.Iterator;
import java.util.Map$Entry;

public abstract class ViewManager extends BaseJavaModule implements MemoryStatsProvider	// class@001335
{

    public void ViewManager(){
       super();
    }
    public void addEventEmitters(n0 p0,View p1){
    }
    public x createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, ViewManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance\(\)");
    }
    public x createShadowNodeInstance(ReactApplicationContext p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ViewManager.class, "6");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.createShadowNodeInstance();
    }
    public final View createView(n0 p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ViewManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createView(p0, null, null, p1);
    }
    public View createView(n0 p0,z p1,m0 p2,a p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, ViewManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = this.createViewInstance(p0, p1, p2);
       if (view instanceof d) {
          view.setOnInterceptTouchEventListener(p3);
       }
       return view;
    }
    public abstract View createViewInstance(n0 p0);
    public View createViewInstance(n0 p0,z p1,m0 p2){
       View obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ViewManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.createViewInstance(p0);
       this.addEventEmitters(p0, obj);
       if (p1 != null) {
          this.updateProperties(obj, p1);
       }
       if (p2 != null) {
          p0 = this.updateState(obj, p1, p2);
          if (p0 != null) {
             this.updateExtraData(obj, p0);
          }
       }
       return obj;
    }
    public void dispatchMissingCommand(View p0,int p1){
    }
    public Map getCommandsMap(){
       return null;
    }
    public c1 getDelegate(){
       return null;
    }
    public Map getExportedCustomBubblingEventTypeConstants(){
       return null;
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       return null;
    }
    public Map getExportedViewConstants(){
       return null;
    }
    public void getMemoryStats(MemoryStatsCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewManager.class, "9")) {
          return;
       }
       p0.onMemoryStatsCollected(new HashMap());
       return;
    }
    public abstract String getName();
    public Map getNativeProps(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Class obj = PatchProxy.apply(objArray, this, ViewManager.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getClass();
       Class shadowNodeCl = this.getShadowNodeClass();
       HashMap hashMap = PatchProxy.applyTwoRefs(obj, shadowNodeCl, objArray, k.class, "5");
       if (hashMap != patchProxyRe) {
       }else {
          hashMap = new HashMap();
          k.c(obj).getProperties(hashMap);
          k.d(shadowNodeCl).getProperties(hashMap);
       }
       return hashMap;
    }
    public abstract Class getShadowNodeClass();
    public void getUIMemoryStats(MemoryStatsCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewManager.class, "10")) {
          return;
       }
       p0.onMemoryStatsCollected(new HashMap());
       return;
    }
    public long measure(Context p0,ReadableMap p1,ReadableMap p2,ReadableMap p3,float p4,YogaMeasureMode p5,float p6,YogaMeasureMode p7){
       return 0;
    }
    public void onAfterUpdateTransaction(View p0){
    }
    public void onDropViewInstance(View p0){
    }
    public void receiveCommand(View p0,int p1,ReadableArray p2){
    }
    public void receiveCommand(View p0,String p1,ReadableArray p2){
    }
    public void receiveCommandButViewNotExist(int p0,int p1,ReadableArray p2){
    }
    public void receiveCommandButViewNotExist(int p0,String p1,ReadableArray p2){
    }
    public void setPadding(View p0,int p1,int p2,int p3,int p4){
    }
    public abstract void updateExtraData(View p0,Object p1);
    public Object updateLocalData(View p0,z p1,z p2){
       return null;
    }
    public void updateProperties(View p0,z p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewManager.class, "1")) {
          return;
       }
       this.updateProperties(p0, p1, false);
       return;
    }
    public void updateProperties(View p0,z p1,boolean p2){
       Iterator entryIterato;
       Map$Entry uEntry;
       String key;
       if (PatchProxy.isSupport(ViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, ViewManager.class, "2")) {
          return;
       }
       if (e.H) {
          c1 delegate = this.getDelegate();
          if (delegate != null) {
             if (!PatchProxy.applyVoidThreeRefs(delegate, p0, p1, null, k.class, "2")) {
                entryIterato = p1.a.getEntryIterator();
                while (entryIterato.hasNext()) {
                   uEntry = entryIterato.next();
                   key = uEntry.getKey();
                   delegate.a(p0, key, uEntry.getValue());
                }
             }
          }else if(p2){
             this.updateReuseViewPropsStart(p0);
          }
          if (!PatchProxy.applyVoidThreeRefs(this, p0, p1, null, k.class, "3")) {
             k$e uoe = k.c(this.getClass());
             entryIterato = p1.a.getEntryIterator();
             while (entryIterato.hasNext()) {
                uEntry = entryIterato.next();
                key = uEntry.getKey();
                uoe.setProperty(this, p0, key, uEntry.getValue());
             }
          }
       }else {
          goto label_0055 ;
       }
       this.onAfterUpdateTransaction(p0);
       if (p2) {
          this.updateReuseViewPropsEnd(p0);
       }
       return;
    }
    public void updateReuseViewPropsEnd(View p0){
    }
    public void updateReuseViewPropsStart(View p0){
    }
    public Object updateState(View p0,z p1,m0 p2){
       return null;
    }
}
