package com.swmansion.reanimated.ReanimatedModule;
import com.facebook.react.bridge.LifecycleEventListener;
import ze.w0;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import com.facebook.react.bridge.ReadableMap;
import jn8.d;
import jn8.c;
import ze.q0;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.String;
import com.swmansion.reanimated.ReanimatedModule$k;
import java.lang.Object;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashSet;
import com.swmansion.reanimated.ReanimatedModule$a;
import java.util.Set;
import com.swmansion.reanimated.ReanimatedModule$i;
import com.swmansion.reanimated.ReanimatedModule$g;
import com.swmansion.reanimated.ReanimatedModule$e;
import com.swmansion.reanimated.ReanimatedModule$l;
import com.swmansion.reanimated.ReanimatedModule$j;
import com.swmansion.reanimated.ReanimatedModule$h;
import com.swmansion.reanimated.ReanimatedModule$f;
import hn8.b;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.Callback;
import com.swmansion.reanimated.ReanimatedModule$b;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import java.util.concurrent.atomic.AtomicBoolean;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import com.facebook.react.modules.core.a$a;
import com.facebook.react.modules.core.ReactChoreographer;
import java.lang.Double;
import com.swmansion.reanimated.ReanimatedModule$c;
import com.swmansion.reanimated.ReanimatedModule$d;

public class ReanimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, w0	// class@000c9d
{
    public b mNodesManager;
    public ArrayList mOperations;
    public d mTransitionManager;

    public void ReanimatedModule(ReactApplicationContext p0){
       super(p0);
       this.mOperations = new ArrayList();
    }
    public void animateNextTransition(int p0,ReadableMap p1){
       ReanimatedModule tmTransition = this.mTransitionManager;
       tmTransition.a.prependUIBlock(new c(tmTransition, p0, p1));
    }
    public void attachEvent(int p0,String p1,int p2){
       this.mOperations.add(new ReanimatedModule$k(this, p0, p1, p2));
    }
    public void configureProps(ReadableArray p0,ReadableArray p1){
       int i = p0.size();
       HashSet hashSet = new HashSet(i);
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          hashSet.add(p0.getString(i2));
       }
       int i3 = p1.size();
       HashSet hashSet1 = new HashSet(i3);
       for (; i1 < i3; i1 = i1 + 1) {
          hashSet1.add(p1.getString(i1));
       }
       this.mOperations.add(new ReanimatedModule$a(this, hashSet, hashSet1));
       return;
    }
    public void connectNodeToView(int p0,int p1){
       this.mOperations.add(new ReanimatedModule$i(this, p0, p1));
    }
    public void connectNodes(int p0,int p1){
       this.mOperations.add(new ReanimatedModule$g(this, p0, p1));
    }
    public void createNode(int p0,ReadableMap p1){
       this.mOperations.add(new ReanimatedModule$e(this, p0, p1));
    }
    public void detachEvent(int p0,String p1,int p2){
       this.mOperations.add(new ReanimatedModule$l(this, p0, p1, p2));
    }
    public void disconnectNodeFromView(int p0,int p1){
       this.mOperations.add(new ReanimatedModule$j(this, p0, p1));
    }
    public void disconnectNodes(int p0,int p1){
       this.mOperations.add(new ReanimatedModule$h(this, p0, p1));
    }
    public void dropNode(int p0){
       this.mOperations.add(new ReanimatedModule$f(this, p0));
    }
    public String getName(){
       return "ReanimatedModule";
    }
    public b getNodesManager(){
       if (this.mNodesManager == null) {
          this.mNodesManager = new b(this.getReactApplicationContext());
       }
       return this.mNodesManager;
    }
    public void getValue(int p0,Callback p1){
       this.mOperations.add(new ReanimatedModule$b(this, p0, p1));
    }
    public void initialize(){
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       UIManagerModule nativeModule = reactApplica.getNativeModule(UIManagerModule.class);
       reactApplica.addLifecycleEventListener(this);
       nativeModule.addUIManagerListener(this);
       this.mTransitionManager = new d(nativeModule);
    }
    public void onHostDestroy(){
    }
    public void onHostPause(){
       ReanimatedModule tmNodesManag = this.mNodesManager;
       if (tmNodesManag != null && tmNodesManag.h.get()) {
          if (tmNodesManag.h.getAndSet(false)) {
             tmNodesManag.e.f(ReactChoreographer$CallbackType.NATIVE_ANIMATED_MODULE, tmNodesManag.f);
          }
          tmNodesManag.h.set(true);
       }
       return;
    }
    public void onHostResume(){
       ReanimatedModule tmNodesManag = this.mNodesManager;
       if (tmNodesManag != null && tmNodesManag.h.getAndSet(false)) {
          tmNodesManag.f();
       }
       return;
    }
    public void setValue(int p0,Double p1){
       this.mOperations.add(new ReanimatedModule$c(this, p0, p1));
    }
    public void willDispatchViewUpdates(UIManagerModule p0){
       if (this.mOperations.isEmpty()) {
          return;
       }
       ReanimatedModule tmOperations = this.mOperations;
       this.mOperations = new ArrayList();
       p0.addUIBlock(new ReanimatedModule$d(this, tmOperations));
       return;
    }
}
