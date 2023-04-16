package com.tachikoma.component.common.rebound.TKReboundView;
import com.tachikoma.component.common.rebound.OverScrollViewGroup$a;
import com.tachikoma.core.component.e;
import gx4.f;
import android.view.View;
import android.content.Context;
import com.tachikoma.component.common.rebound.OverScrollViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Boolean;
import com.tkruntime.v8.V8ObjectProxy;
import com.tachikoma.core.bridge.c;
import com.tkruntime.v8.V8;
import com.tachikoma.core.component.view.TKView;
import gx4.f$a;
import gx4.e;
import com.tkruntime.v8.V8Object;
import android.widget.FrameLayout;
import java.util.List;
import java.util.ArrayList;
import yp8.a;
import jq8.a;
import java.lang.Integer;
import iq8.n;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import com.tkruntime.v8.V8Value;
import java.util.HashMap;
import on8.c;

public class TKReboundView extends e implements OverScrollViewGroup$a	// class@000ce2
{
    public V8Function onOffsetChanged;
    public JsValueRef onOffsetChangedRef;
    public TKView v;
    public V8Object w;
    public Boolean x;

    public void TKReboundView(f p0){
       super(p0);
       this.getView();
    }
    public void attachToRoot(){
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public OverScrollViewGroup createViewInstance(Context p0){
       f obj = PatchProxy.applyOneRefs(p0, this, TKReboundView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mInitParams.b;
       if (obj != null && obj.length > 0) {
          int i = 0;
          if (obj[i] instanceof Boolean) {
             this.x = obj[i];
          }
       }
       V8ObjectProxy v8ObjectProx = new V8ObjectProxy(this.getJSContext().g(), "ReboundView-container");
       this.v = new TKView(new f$a(this.getTKContext(), v8ObjectProx).a());
       this.w = v8ObjectProx;
       OverScrollViewGroup overScrollVi = new OverScrollViewGroup(p0);
       overScrollVi.addView(this.v.getView());
       overScrollVi.setIsHorizontal(this.x.booleanValue());
       overScrollVi.setOnTargetViewOffsetListener(this);
       return overScrollVi;
    }
    public void detachToRoot(){
       if (PatchProxy.applyVoid(null, this, TKReboundView.class, "7")) {
          return;
       }
       TKReboundView tv = this.v;
       if (tv != null) {
          tv.mAttachToRoot = false;
       }
       super.detachToRoot();
       return;
    }
    public List getChildren(){
       TKReboundView obj = PatchProxy.apply(null, this, TKReboundView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj != null) {
          return obj.getChildren();
       }
       return new ArrayList();
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, TKReboundView.class, "6")) {
          return;
       }
       if (this.x.booleanValue()) {
          this.v.getDomNode().c().E();
       }else {
          this.v.getDomNode().c().t();
       }
       return;
    }
    public void onOffsetChanged(int p0){
       TKReboundView tKReboundVie = TKReboundView.class;
       if (PatchProxy.isSupport(tKReboundVie) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKReboundVie, "8")) {
          return;
       }
       tKReboundVie = this.onOffsetChanged;
       if (tKReboundVie == null) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(n.f(p0))};
       tKReboundVie.call(null, objArray);
       return;
    }
    public void setListView(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKReboundView.class, "5")) {
          return;
       }
       this.v.add(p0);
       this.m();
       return;
    }
    public void setOnOffsetChange(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKReboundView.class, "3")) {
          return;
       }
       y.c(this.onOffsetChangedRef);
       JsValueRef jsValueRef = y.b(p0, this);
       this.onOffsetChangedRef = jsValueRef;
       if (jsValueRef == null) {
          return;
       }
       this.onOffsetChanged = jsValueRef.get();
       return;
    }
    public void setStyle(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKReboundView.class, "2")) {
          return;
       }
       HashMap hashMap = new HashMap();
       String[] a = c.a;
       int len = a.length;
       int i = 0;
       while (i < len) {
          object oobject = a[i];
          if (p0.containsKey(oobject)) {
             hashMap.put(oobject, p0.get(oobject));
             p0.remove(oobject);
          }
          i = i + 1;
       }
       super.setStyle(p0);
       this.v.setStyle(hashMap);
       if (!hashMap.isEmpty()) {
          this.m();
       }
       return;
    }
    public boolean supportAsyncPrepareView(){
       return false;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKReboundView.class, "9")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.onOffsetChangedRef);
       TKReboundView tw = this.w;
       if (tw != null && !tw.isReleased()) {
          this.w.setWeak();
       }
    label_002c :
       return;
    }
}
