package com.tachikoma.component.canvas.TKCanvas2DView;
import com.tachikoma.component.canvas.widget.TKAndroidCanvasView$a;
import com.tachikoma.core.component.e;
import gx4.f;
import android.view.View;
import android.content.Context;
import com.tachikoma.component.canvas.widget.TKAndroidCanvasView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8ObjectProxy;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tkruntime.v8.V8;
import com.tachikoma.component.canvas.TKCanvas2D;
import gx4.f$a;
import gx4.e;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.tachikoma.component.canvas.TKCanvas2DView$a;
import java.lang.Runnable;
import iq8.x;
import android.graphics.Canvas;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;
import java.lang.Integer;
import iq8.n;
import java.util.Objects;
import android.graphics.Paint;

public class TKCanvas2DView extends e implements TKAndroidCanvasView$a	// class@000cdb
{
    public JsValueRef A;
    public JsValueRef B;
    public boolean checkVisiblePreDraw;
    public int layerType;
    public V8Function onDrawFun;
    public V8Function onSizeChanged;
    public JsValueRef v;
    public TKCanvas2D w;
    public boolean x;
    public int y;
    public int z;

    public void TKCanvas2DView(f p0){
       super(p0);
       this.layerType = 0;
       this.checkVisiblePreDraw = true;
       this.getView();
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public TKAndroidCanvasView createViewInstance(Context p0){
       TKAndroidCanvasView obj = PatchProxy.applyOneRefs(p0, this, TKCanvas2DView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TKAndroidCanvasView(p0);
       V8ObjectProxy v8ObjectProx = new V8ObjectProxy(this.getJSContext().g(), "Canvas2D");
       TKCanvas2D tKCanvas2D = new TKCanvas2D(new f$a(this.getTKContext(), v8ObjectProx).a());
       this.w = tKCanvas2D;
       v8ObjectProx.setNativeObject(tKCanvas2D);
       this.v = y.b(v8ObjectProx, this);
       obj.setCallback(this);
       return obj;
    }
    public void destroyOnMainThread(TKBaseNativeModule$DestroyReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKCanvas2DView.class, "11")) {
          return;
       }
       if (this.isTargetViewExist()) {
          this.getView().c = null;
       }
       TKCanvas2DView tw = this.w;
       if (tw != null) {
          tw.onDestroy(p0, true);
       }
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKCanvas2DView tKCanvas2DVi = TKCanvas2DView.class;
       if (PatchProxy.isSupport(tKCanvas2DVi) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKCanvas2DVi, "10")) {
          return;
       }
       super.onDestroy(p0, p1);
       this.x = true;
       tKCanvas2DVi = this.w;
       if (tKCanvas2DVi != null) {
          tKCanvas2DVi.setHasDestroyed();
       }
       if (p1) {
          this.destroyOnMainThread(p0);
       }else {
          x.f(new TKCanvas2DView$a(this, p0));
       }
       return;
    }
    public void onViewDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKCanvas2DView.class, "8")) {
          return;
       }
       if (this.x != null) {
          return;
       }
       if (!y.a(this.onDrawFun)) {
          return;
       }
       this.w.setCanvas(p0);
       Object[] objArray = new Object[]{this.w.getJsObj()};
       this.onDrawFun.call(null, objArray);
       return;
    }
    public void onViewSizeChanged(int p0,int p1){
       TKCanvas2DView tKCanvas2DVi = TKCanvas2DView.class;
       if (PatchProxy.isSupport(tKCanvas2DVi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, tKCanvas2DVi, "7")) {
          return;
       }
       if (this.x != null) {
          return;
       }
       if (!y.a(this.onSizeChanged)) {
          return;
       }
       if (this.y == p0 && this.z == p1) {
          return;
       }
       this.y = p0;
       this.z = p1;
       Object[] objArray = new Object[]{Integer.valueOf(n.f(p0)),Integer.valueOf(n.f(p1))};
       this.onSizeChanged.call(null, objArray);
       return;
    }
    public void requestDraw(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKCanvas2DView.class, "6")) {
          return;
       }
       if (this.x != null) {
          return;
       }
       TKAndroidCanvasView view = this.getView();
       Objects.requireNonNull(view);
       if (!PatchProxy.applyVoid(objArray, view, TKAndroidCanvasView.class, "5")) {
          view.b = true;
          view.invalidate();
       }
       return;
    }
    public void setCheckVisiblePreDraw(boolean p0){
       TKCanvas2DView tKCanvas2DVi = TKCanvas2DView.class;
       if (PatchProxy.isSupport(tKCanvas2DVi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKCanvas2DVi, "5")) {
          return;
       }
       this.checkVisiblePreDraw = p0;
       this.getView().setCheckVisiblePreDraw(p0);
       return;
    }
    public void setLayerType(int p0){
       TKCanvas2DView tKCanvas2DVi = TKCanvas2DView.class;
       if (PatchProxy.isSupport(tKCanvas2DVi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKCanvas2DVi, "4")) {
          return;
       }
       this.layerType = p0;
       TKAndroidCanvasView view = this.getView();
       int i = 2;
       if (p0 != 1) {
          if (p0 != i) {
             i = 0;
          }
       }else {
          i = 1;
       }
       view.setLayerType(i, null);
       return;
    }
    public void setOnDraw(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKCanvas2DView.class, "3")) {
          return;
       }
       y.c(this.B);
       JsValueRef jsValueRef = y.b(p0, this);
       this.B = jsValueRef;
       this.onDrawFun = jsValueRef.get();
       return;
    }
    public void setOnSizeChanged(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKCanvas2DView.class, "2")) {
          return;
       }
       y.c(this.A);
       JsValueRef jsValueRef = y.b(p0, this);
       this.A = jsValueRef;
       this.onSizeChanged = jsValueRef.get();
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKCanvas2DView.class, "9")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.v);
       y.c(this.B);
       y.c(this.A);
       return;
    }
}
