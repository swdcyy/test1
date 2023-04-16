package com.kuaishou.commercial.tach.component.TKMeasuredView;
import com.tachikoma.core.component.view.TKView;
import gx4.f;
import com.kuaishou.commercial.tach.component.TKMeasuredView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.tachikoma.core.component.e;
import com.tachikoma.core.component.TKYogaLayout;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import iq8.n;
import com.tkruntime.v8.V8Function;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import yp8.a;
import jq8.a;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.kuaishou.commercial.tach.component.TKMeasuredView$b;
import java.lang.Runnable;
import iq8.x;

public class TKMeasuredView extends TKView	// class@00165f
{
    public boolean mDestroyed;
    public JsValueRef w;
    public int x;
    public int y;
    public final ViewTreeObserver$OnGlobalLayoutListener z;

    public void TKMeasuredView(f p0){
       super(p0);
       this.mDestroyed = false;
       this.x = 0;
       this.y = 0;
       TKMeasuredView$a uoa = new TKMeasuredView$a(this);
       this.z = uoa;
       if (PatchProxy.applyVoid(null, this, TKMeasuredView.class, "3")) {
       }else {
          this.getView().getViewTreeObserver().addOnGlobalLayoutListener(uoa);
       }
       return;
    }
    public void callbackSizeChange(){
       if (PatchProxy.applyVoid(null, this, TKMeasuredView.class, "2")) {
          return;
       }
       try{
          TKMeasuredView tw = this.w;
          if (tw != null && y.a(tw.get())) {
             V8Object v8Object = this.getJSContext().l();
             TKYogaLayout view = this.getView();
             if (view != null) {
                int i = n.f(view.getWidth());
                int i1 = n.f(view.getHeight());
                if (this.x != i || this.y != i1) {
                   this.x = i;
                   this.y = i1;
                   v8Object.add("width", n.f(view.getWidth()));
                   v8Object.add("height", n.f(view.getHeight()));
                   Object[] objArray = new Object[]{v8Object};
                   this.w.get().call(null, objArray);
                }
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public TKYogaLayout createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKMeasuredView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.createViewInstance(p0);
    }
    public void destroyOnUIThread(){
       if (PatchProxy.applyVoid(null, this, TKMeasuredView.class, "6")) {
          return;
       }
       if (this.isTargetViewExist()) {
          this.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this.z);
       }
       return;
    }
    public V8Object getMeasureSize(){
       V8Object obj = PatchProxy.apply(null, this, TKMeasuredView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getJSContext().l();
       try{
          obj.add("width", n.e(this.getDomNode().c().h()));
          obj.add("height", n.e(this.getDomNode().c().e()));
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKMeasuredView tKMeasuredVi = TKMeasuredView.class;
       if (PatchProxy.isSupport(tKMeasuredVi) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKMeasuredVi, "5")) {
          return;
       }
       super.onDestroy(p0, p1);
       this.mDestroyed = true;
       if (p1) {
          this.destroyOnUIThread();
       }else {
          x.f(new TKMeasuredView$b(this));
       }
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKMeasuredView.class, "7")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.w);
       return;
    }
}
