package com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.LifecycleEventListener;
import ze.w0;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.animated.NativeAnimatedModule$k;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.animated.NativeAnimatedModule$l;
import java.lang.Object;
import od.a;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.ArrayDeque;
import cb.a;
import com.facebook.react.modules.core.a$a;
import com.facebook.react.animated.NativeAnimatedModule$h;
import com.facebook.react.animated.NativeAnimatedModule$f;
import com.facebook.react.animated.NativeAnimatedModule$p;
import com.facebook.react.animated.NativeAnimatedModule$i;
import com.facebook.react.animated.NativeAnimatedModule$g;
import com.facebook.react.animated.NativeAnimatedModule$t;
import com.facebook.react.animated.NativeAnimatedModule$c;
import com.facebook.react.animated.NativeAnimatedModule$b;
import sd.l;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.animated.NativeAnimatedModule$m;
import com.facebook.react.animated.NativeAnimatedModule$j;
import com.facebook.react.animated.NativeAnimatedModule$a;
import com.facebook.react.animated.NativeAnimatedModule$u;
import com.facebook.react.bridge.Callback;
import com.facebook.react.animated.NativeAnimatedModule$d;
import com.facebook.react.animated.NativeAnimatedModule$q;
import com.facebook.react.animated.NativeAnimatedModule$r;
import sd.c;
import com.facebook.react.animated.NativeAnimatedModule$e;
import com.facebook.react.animated.NativeAnimatedModule$s;
import com.facebook.react.animated.NativeAnimatedModule$n;
import ze.q0;
import com.facebook.react.animated.NativeAnimatedModule$o;

public class NativeAnimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, w0	// class@001196
{
    public final e mAnimatedFrameCallback;
    public boolean mIsFinished;
    public l mNodesManager;
    public ArrayList mOperations;
    public ArrayList mPreOperations;
    public final ReactChoreographer mReactChoreographer;

    public void NativeAnimatedModule(ReactApplicationContext p0){
       super(p0);
       this.mOperations = new ArrayList();
       this.mPreOperations = new ArrayList();
       this.mIsFinished = false;
       this.mReactChoreographer = ReactChoreographer.a();
       this.mAnimatedFrameCallback = new NativeAnimatedModule$k(this, p0);
    }
    public void addAnimatedEventToView(int p0,String p1,ReadableMap p2){
       this.mOperations.add(new NativeAnimatedModule$l(this, p0, p1, p2));
    }
    public final void clearAllFrameCallback(){
       NativeAnimatedModule tmReactChore = this.mReactChoreographer;
       a.c(tmReactChore);
       ReactChoreographer$CallbackType nATIVE_ANIMA = ReactChoreographer$CallbackType.NATIVE_ANIMATED_MODULE;
       NativeAnimatedModule tmAnimatedFr = this.mAnimatedFrameCallback;
       if (PatchProxy.applyVoidTwoRefs(nATIVE_ANIMA, tmAnimatedFr, tmReactChore, ReactChoreographer.class, "7")) {
       }else {
          ReactChoreographer c = tmReactChore.c;
          _monitor_enter(c);
          if (!tmReactChore.d[nATIVE_ANIMA.getOrder()].contains(tmAnimatedFr)) {
             a.g("ReactNative", "Tried to remove all non-existent frame callback");
             _monitor_exit(c);
          }else {
             while (tmReactChore.d[nATIVE_ANIMA.getOrder()].remove(tmAnimatedFr)) {
                int i = tmReactChore.e - 1;
                tmReactChore.e = i;
             }
             tmReactChore.c();
             _monitor_exit(c);
          }
       }
       return;
    }
    public final void clearFrameCallback(){
       NativeAnimatedModule tmReactChore = this.mReactChoreographer;
       a.c(tmReactChore);
       tmReactChore.f(ReactChoreographer$CallbackType.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }
    public void connectAnimatedNodeToView(int p0,int p1){
       this.mOperations.add(new NativeAnimatedModule$h(this, p0, p1));
    }
    public void connectAnimatedNodes(int p0,int p1){
       this.mOperations.add(new NativeAnimatedModule$f(this, p0, p1));
    }
    public void createAnimatedNode(int p0,ReadableMap p1){
       this.mOperations.add(new NativeAnimatedModule$p(this, p0, p1));
    }
    public void disconnectAnimatedNodeFromView(int p0,int p1){
       this.mOperations.add(new NativeAnimatedModule$i(this, p0, p1));
    }
    public void disconnectAnimatedNodes(int p0,int p1){
       this.mOperations.add(new NativeAnimatedModule$g(this, p0, p1));
    }
    public void dropAnimatedNode(int p0){
       this.mOperations.add(new NativeAnimatedModule$t(this, p0));
    }
    public final void enqueueFrameCallback(){
       if (this.mIsFinished != null) {
          return;
       }
       NativeAnimatedModule tmReactChore = this.mReactChoreographer;
       a.c(tmReactChore);
       tmReactChore.d(ReactChoreographer$CallbackType.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
       return;
    }
    public void extractAnimatedNodeOffset(int p0){
       this.mOperations.add(new NativeAnimatedModule$c(this, p0));
    }
    public void flattenAnimatedNodeOffset(int p0){
       this.mOperations.add(new NativeAnimatedModule$b(this, p0));
    }
    public String getName(){
       return "NativeAnimatedModule";
    }
    public l getNodesManager(){
       if (this.mNodesManager == null) {
          ReactApplicationContext reactApplica = this.getReactApplicationContextIfActiveOrWarn();
          if (reactApplica != null) {
             this.mNodesManager = new l(reactApplica.getNativeModule(UIManagerModule.class));
          }
       }
       return this.mNodesManager;
    }
    public void initialize(){
       ReactApplicationContext reactApplica = this.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          reactApplica.addLifecycleEventListener(this);
          reactApplica.getNativeModule(UIManagerModule.class).addUIManagerListener(this);
       }
       return;
    }
    public void onCatalystInstanceDestroy(){
       this.mIsFinished = true;
       this.clearAllFrameCallback();
    }
    public void onHostDestroy(){
       this.clearFrameCallback();
    }
    public void onHostPause(){
       this.clearFrameCallback();
    }
    public void onHostResume(){
       this.enqueueFrameCallback();
    }
    public void removeAnimatedEventFromView(int p0,String p1,int p2){
       this.mOperations.add(new NativeAnimatedModule$m(this, p0, p1, p2));
    }
    public void restoreDefaultValues(int p0){
       this.mPreOperations.add(new NativeAnimatedModule$j(this, p0));
    }
    public void setAnimatedNodeOffset(int p0,double p1){
       this.mOperations.add(new NativeAnimatedModule$a(this, p0, p1));
    }
    public void setAnimatedNodeValue(int p0,double p1){
       this.mOperations.add(new NativeAnimatedModule$u(this, p0, p1));
    }
    public void setNodesManager(l p0){
       this.mNodesManager = p0;
    }
    public void startAnimatingNode(int p0,int p1,ReadableMap p2,Callback p3){
       NativeAnimatedModule$d uod = new NativeAnimatedModule$d(this, p0, p1, p2, p3);
       this.mOperations.add(v7);
    }
    public void startListeningToAnimatedNodeValue(int p0){
       this.mOperations.add(new NativeAnimatedModule$r(this, p0, new NativeAnimatedModule$q(this, p0)));
    }
    public void stopAnimation(int p0){
       this.mOperations.add(new NativeAnimatedModule$e(this, p0));
    }
    public void stopListeningToAnimatedNodeValue(int p0){
       this.mOperations.add(new NativeAnimatedModule$s(this, p0));
    }
    public void willDispatchViewUpdates(UIManagerModule p0){
       if (this.mOperations.isEmpty() && this.mPreOperations.isEmpty()) {
          return;
       }
       NativeAnimatedModule tmPreOperati = this.mPreOperations;
       NativeAnimatedModule tmOperations = this.mOperations;
       this.mPreOperations = new ArrayList();
       this.mOperations = new ArrayList();
       p0.prependUIBlock(new NativeAnimatedModule$n(this, tmPreOperati));
       p0.addUIBlock(new NativeAnimatedModule$o(this, tmOperations));
       return;
    }
}
