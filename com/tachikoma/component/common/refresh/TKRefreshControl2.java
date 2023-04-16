package com.tachikoma.component.common.refresh.TKRefreshControl2;
import o17.j;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import com.tachikoma.component.common.refresh.RefreshControlState;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.tachikoma.component.common.refresh.TKRefreshControl2$a;
import java.lang.Runnable;
import iq8.x;
import java.lang.Float;
import java.lang.Math;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Value;
import com.tachikoma.component.common.refresh.TKRefreshLayout;
import com.kwai.library.widget.refresh.CustomRefreshLayout;
import android.view.View;
import com.tachikoma.core.component.e;
import gx4.c;
import com.tachikoma.core.component.view.TKView;

public class TKRefreshControl2 extends TKBaseNativeModule implements j	// class@000ce5
{
    public TKRefreshLayout f;
    public boolean g;
    public TKView h;
    public JsValueRef i;
    public JsValueRef j;
    public JsValueRef k;
    public V8Function onPullPercentChanged;
    public V8Function onRefreshBegin;
    public V8Function onStateChanged;

    public void TKRefreshControl2(f p0){
       super(p0);
    }
    public final void d(RefreshControlState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKRefreshControl2.class, "15")) {
          return;
       }
       if (!y.a(this.onStateChanged)) {
          return;
       }
       Object[] objArray = new Object[]{p0.state};
       this.onStateChanged.call(null, objArray);
       return;
    }
    public void destroyOnMainThread(){
       if (this.f != null) {
          this.f = null;
       }
       if (this.h != null) {
          this.h = null;
       }
       return;
    }
    public void endRefresh(){
       if (PatchProxy.applyVoid(null, this, TKRefreshControl2.class, "7")) {
          return;
       }
       TKRefreshControl2 tf = this.f;
       if (tf != null) {
          tf.setRefreshing(false);
       }
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKRefreshControl2 tKRefreshCon = TKRefreshControl2.class;
       if (PatchProxy.isSupport(tKRefreshCon) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKRefreshCon, "9")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (this.f != null || this.h != null) {
          if (p1) {
             this.destroyOnMainThread();
          }else {
             x.f(new TKRefreshControl2$a(this));
          }
       }
       return;
    }
    public void pullProgress(float p0,float p1){
       TKRefreshControl2 tKRefreshCon = TKRefreshControl2.class;
       if (PatchProxy.isSupport(tKRefreshCon) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, tKRefreshCon, "12")) {
          return;
       }
       if (y.a(this.onPullPercentChanged)) {
          Object[] objArray = new Object[]{Float.valueOf(Math.min(0x3f800000, p1))};
          this.onPullPercentChanged.call(null, objArray);
       }
       return;
    }
    public void pullToRefresh(){
       if (PatchProxy.applyVoid(null, this, TKRefreshControl2.class, "10")) {
          return;
       }
       this.d(RefreshControlState.WILL_REFRESH);
       this.g = true;
       return;
    }
    public void refreshComplete(){
       if (PatchProxy.applyVoid(null, this, TKRefreshControl2.class, "14")) {
          return;
       }
       this.d(RefreshControlState.IDLE);
       this.g = false;
       return;
    }
    public int refreshedAnimatorDuration(){
       return 400;
    }
    public void refreshing(){
       if (PatchProxy.applyVoid(null, this, TKRefreshControl2.class, "13")) {
          return;
       }
       this.d(RefreshControlState.REFRESHING);
       if (y.a(this.onRefreshBegin)) {
          Object[] objArray = new Object[0];
          this.onPullPercentChanged.call(null, objArray);
       }
       return;
    }
    public void releaseToRefresh(){
       if (PatchProxy.applyVoid(null, this, TKRefreshControl2.class, "11")) {
          return;
       }
       if (this.g != null) {
          this.g = false;
          this.d(RefreshControlState.IDLE);
       }
       return;
    }
    public void reset(){
    }
    public void setOnPullPercentChanged(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKRefreshControl2.class, "5")) {
          return;
       }
       y.c(this.k);
       JsValueRef jsValueRef = y.b(p0, this);
       this.k = jsValueRef;
       this.onPullPercentChanged = jsValueRef.get();
       return;
    }
    public void setOnRefreshBegin(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKRefreshControl2.class, "3")) {
          return;
       }
       y.c(this.i);
       JsValueRef jsValueRef = y.b(p0, this);
       this.i = jsValueRef;
       this.onRefreshBegin = jsValueRef.get();
       return;
    }
    public void setOnStateChanged(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKRefreshControl2.class, "4")) {
          return;
       }
       y.c(this.j);
       JsValueRef jsValueRef = y.b(p0, this);
       this.j = jsValueRef;
       this.onStateChanged = jsValueRef.get();
       return;
    }
    public void setRefreshLayout(TKRefreshLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKRefreshControl2.class, "1")) {
          return;
       }
       this.f = p0;
       p0.setRefreshStatus(this);
       TKRefreshControl2 th = this.h;
       if (th != null) {
          this.f.setRefreshView(th.getView());
       }
       return;
    }
    public void setRefreshView(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKRefreshControl2.class, "2")) {
          return;
       }
       TKRefreshControl2 th = this.h;
       if (th != null) {
          th.unRetainJsObj();
       }
       TKView nativeModule = this.getNativeModule(p0);
       this.h = nativeModule;
       if (nativeModule == null) {
          return;
       }else {
          nativeModule.retainJsObj();
          TKRefreshControl2 tf = this.f;
          if (tf != null) {
             tf.setRefreshView(this.h.getView());
          }
          return;
       }
    }
    public void startRefresh(){
       if (PatchProxy.applyVoid(null, this, TKRefreshControl2.class, "6")) {
          return;
       }
       TKRefreshControl2 tf = this.f;
       if (tf != null) {
          tf.setRefreshing(true);
       }
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKRefreshControl2.class, "8")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.i);
       y.c(this.j);
       y.c(this.k);
       return;
    }
}
