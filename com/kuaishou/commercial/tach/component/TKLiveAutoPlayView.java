package com.kuaishou.commercial.tach.component.TKLiveAutoPlayView;
import com.tachikoma.core.component.e;
import gx4.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yr3.k;
import yr3.a;
import yr3.f;
import com.tkruntime.v8.V8Function;
import java.lang.Integer;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;

public final class TKLiveAutoPlayView extends e	// class@00165c
{
    public V8Function v;
    public JsValueRef w;
    public final f x;

    public void TKLiveAutoPlayView(f p0){
       a.p(p0, "initParams");
       super(p0);
       this.x = p0;
    }
    public View createViewInstance(Context p0){
       a obj = PatchProxy.applyOneRefs(p0, this, TKLiveAutoPlayView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       obj = f.r(k.class);
       a.m(obj);
       return obj.b(p0);
    }
    public final V8Function getAutoPlayCallback(){
       return this.v;
    }
    public final f getInitParams(){
       return this.x;
    }
    public final void jumpToLiveSlidePlay(int p0){
       TKLiveAutoPlayView tKLiveAutoPl = TKLiveAutoPlayView.class;
       if (PatchProxy.isSupport(tKLiveAutoPl) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKLiveAutoPl, "4")) {
          return;
       }
       k ok = f.r(k.class);
       if (ok != null) {
          View view = this.getView();
          a.o(view, "view");
          ok.q3(view, p0);
       }
       return;
    }
    public final void jumpToLiveSlidePlayWithJumpUrl(int p0,String p1){
       TKLiveAutoPlayView tKLiveAutoPl = TKLiveAutoPlayView.class;
       if (PatchProxy.isSupport(tKLiveAutoPl) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, tKLiveAutoPl, "5")) {
          return;
       }
       a.p(p1, "jumpUrl");
       k ok = f.r(k.class);
       if (ok != null) {
          View view = this.getView();
          a.o(view, "view");
          ok.ft(view, p0, p1);
       }
       return;
    }
    public final void reportAdClickMeta(){
       if (PatchProxy.applyVoid(null, this, TKLiveAutoPlayView.class, "3")) {
          return;
       }
       k ok = f.r(k.class);
       if (ok != null) {
          View view = this.getView();
          a.o(view, "view");
          ok.Z40(view);
       }
       return;
    }
    public final void reportAdShowMeta(){
       if (PatchProxy.applyVoid(null, this, TKLiveAutoPlayView.class, "2")) {
          return;
       }
       k ok = f.r(k.class);
       if (ok != null) {
          View view = this.getView();
          a.o(view, "view");
          ok.Bq(view);
       }
       return;
    }
    public final void setAutoPlayCallback(V8Function p0){
       this.v = p0;
    }
    public final void setLiveAutoPlayCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLiveAutoPlayView.class, "6")) {
          return;
       }
       a.p(p0, "callback");
       y.c(this.w);
       this.w = y.b(p0, this.getView());
       k ok = f.r(k.class);
       if (ok != null) {
          TKLiveAutoPlayView tw = this.w;
          a.m(tw);
          View view = this.getView();
          a.o(view, "view");
          ok.Jz(tw, view);
       }
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKLiveAutoPlayView.class, "7")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.w);
       return;
    }
}
