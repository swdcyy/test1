package com.yxcorp.gifshow.relation.intimate.rn.motion.IntMotionManager;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.uimanager.ViewGroupManager;
import ze.n0;
import android.view.View;
import com.yxcorp.gifshow.relation.intimate.rn.motion.IntMotionView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ebc.a;
import com.facebook.react.bridge.ReactContext;
import java.util.Objects;
import java.util.WeakHashMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableArray;

public class IntMotionManager extends ViewGroupManager implements LifecycleEventListener	// class@001923
{
    public a mDriver;

    public void IntMotionManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public IntMotionView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IntMotionManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDriver == null) {
          this.mDriver = new a();
       }
       p0.addLifecycleEventListener(this);
       return new IntMotionView(p0, this, this.mDriver);
    }
    public String getName(){
       return "INTMotion";
    }
    public void onHostDestroy(){
       if (PatchProxy.applyVoid(null, this, IntMotionManager.class, "6")) {
          return;
       }
       IntMotionManager tmDriver = this.mDriver;
       if (tmDriver != null) {
          Objects.requireNonNull(tmDriver);
          if (!PatchProxy.applyVoid(null, tmDriver, a.class, "9")) {
             tmDriver.g.clear();
          }
       }
       this.mDriver = null;
       return;
    }
    public void onHostPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, IntMotionManager.class, "5")) {
          return;
       }
       IntMotionManager tmDriver = this.mDriver;
       if (tmDriver != null) {
          Objects.requireNonNull(tmDriver);
          if (!PatchProxy.applyVoid(objArray, tmDriver, a.class, "8")) {
             tmDriver.e = true;
             tmDriver.c();
          }
       }
       return;
    }
    public void onHostResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, IntMotionManager.class, "4")) {
          return;
       }
       IntMotionManager tmDriver = this.mDriver;
       if (tmDriver != null) {
          Objects.requireNonNull(tmDriver);
          if (!PatchProxy.applyVoid(objArray, tmDriver, a.class, "3")) {
             tmDriver.e = false;
             tmDriver.b();
          }
       }
       return;
    }
    public void setInterval(IntMotionView p0,ReadableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntMotionManager.class, "3")) {
          return;
       }
       p0.setInterval(p1);
       return;
    }
    public void setOptions(IntMotionView p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntMotionManager.class, "2")) {
          return;
       }
       p0.setOptions(p1);
       return;
    }
}
