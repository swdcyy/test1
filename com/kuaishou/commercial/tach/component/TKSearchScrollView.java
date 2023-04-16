package com.kuaishou.commercial.tach.component.TKSearchScrollView;
import com.tachikoma.core.component.e;
import gx4.f;
import java.util.ArrayList;
import android.view.View;
import com.tkruntime.v8.V8Object;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gx4.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.util.List;
import tkd.b;
import tkd.d;
import vx4.o;
import java.lang.Integer;
import android.content.Context;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.kuaishou.commercial.tach.component.TKSearchScrollView$a;
import java.lang.Runnable;
import iq8.x;
import java.lang.Float;
import iq8.p;
import com.tkruntime.v8.V8Function;

public class TKSearchScrollView extends e	// class@001667
{
    public boolean enabledMore;
    public V8Function onElementShow;
    public JsValueRef onElementShowRef;
    public V8Function onMoreJump;
    public JsValueRef onMoreJumpRef;
    public V8Function onScroll;
    public JsValueRef onScrollRef;
    public boolean scrollEnabled;
    public List v;

    public void TKSearchScrollView(f p0){
       super(p0);
       this.v = new ArrayList();
       this.getView();
    }
    public void add(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollView.class, "5")) {
          return;
       }
       e nativeModule = this.getNativeModule(p0);
       if (nativeModule == null) {
          return;
       }
       nativeModule.retainJsObj();
       this.v.add(nativeModule);
       d.a(-1052561880).Fs(this.getView(), nativeModule.getView());
       return;
    }
    public void continueLoopAnimation(int p0){
       TKSearchScrollView tKSearchScro = TKSearchScrollView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKSearchScro, "11")) {
          return;
       }
       d.a(-1052561880).B40(this.getView(), p0);
       return;
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public ViewGroup createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKSearchScrollView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-1052561880).b(p0);
    }
    public void endLoopAnimation(){
       if (PatchProxy.applyVoid(null, this, TKSearchScrollView.class, "10")) {
          return;
       }
       d.a(-1052561880).Ul(this.getView());
       return;
    }
    public int getContentOffsetX(){
       Object obj = PatchProxy.apply(null, this, TKSearchScrollView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return d.a(-1052561880).g8(this.getView());
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKSearchScrollView tKSearchScro = TKSearchScrollView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKSearchScro, "17")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          d.a(-1052561880).i(this.getView());
       }else {
          x.f(new TKSearchScrollView$a(this));
       }
       return;
    }
    public void scrollElementToCenter(float p0){
       TKSearchScrollView tKSearchScro = TKSearchScrollView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKSearchScro, "6")) {
          return;
       }
       d.a(-1052561880).k40(this.getView(), p0);
       return;
    }
    public void setAndroidMargin(float p0,float p1){
       TKSearchScrollView tKSearchScro = TKSearchScrollView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, tKSearchScro, "7")) {
          return;
       }
       d.a(-1052561880).lN(this.getView(), p0, p1);
       return;
    }
    public void setEnableMore(boolean p0){
       TKSearchScrollView tKSearchScro = TKSearchScrollView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKSearchScro, "2")) {
          return;
       }
       d.a(-1052561880).l40(this.getView(), p0);
       return;
    }
    public void setMoreTextColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollView.class, "8")) {
          return;
       }
       d.a(-1052561880).V9(p.b(p0));
       return;
    }
    public void setOnElementShow(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollView.class, "3")) {
          return;
       }
       d.a(-1052561880).Bu(this.getView(), p0);
       return;
    }
    public void setOnMoreJump(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollView.class, "4")) {
          return;
       }
       d.a(-1052561880).Kj(this.getView(), p0);
       return;
    }
    public void setOnScroll(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollView.class, "15")) {
          return;
       }
       d.a(-1052561880).wU(this.getView(), p0);
       return;
    }
    public void setScrollEnabled(boolean p0){
       TKSearchScrollView tKSearchScro = TKSearchScrollView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKSearchScro, "13")) {
          return;
       }
       d.a(-1052561880).setScrollEnabled(this.getView(), p0);
       return;
    }
    public void startLoopAnimation(int p0,int p1){
       TKSearchScrollView tKSearchScro = TKSearchScrollView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, tKSearchScro, "9")) {
          return;
       }
       d.a(-1052561880).De(this.getView(), p0, p1);
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKSearchScrollView.class, "16")) {
          return;
       }
       if (this.v != null) {
          int i = 0;
          while (i < this.v.size()) {
             e uoe = this.v.get(i);
             if (uoe != null) {
                uoe.unRetainJsObj();
             }
             i = i + 1;
          }
       }
       d.a(-1052561880).RV(this.getView());
       return;
    }
    public void updateResetOffset(int p0){
       TKSearchScrollView tKSearchScro = TKSearchScrollView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKSearchScro, "14")) {
          return;
       }
       d.a(-1052561880).A20(this.getView(), p0);
       return;
    }
}
