package com.kuaishou.commercial.tach.component.TKAdVideo;
import com.tachikoma.core.component.e;
import gx4.f;
import android.content.Context;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import vx4.d;
import pz.m;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import pz.n;
import java.lang.Runnable;
import iq8.x;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import com.tkruntime.v8.V8Value;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class TKAdVideo extends e	// class@001655
{
    public boolean autoPlay;
    public JsValueRef mOnCompletionRef;
    public boolean muted;
    public V8Function onend;
    public String poster;
    public String src;

    public void TKAdVideo(f p0){
       super(p0);
    }
    public View createViewInstance(Context p0){
       TKAdVideo tKAdVideo = TKAdVideo.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, tKAdVideo, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = -550182800;
       View view = d.a(i).b(p0);
       if (!PatchProxy.applyVoidOneRefs(view, this, tKAdVideo, "2")) {
          d.a(i).eq(view, new m(this));
       }
       return view;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKAdVideo tKAdVideo = TKAdVideo.class;
       if (PatchProxy.isSupport(tKAdVideo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKAdVideo, "9")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.release();
       }else {
          x.f(new n(this));
       }
       return;
    }
    public final void release(){
       if (PatchProxy.applyVoid(null, this, TKAdVideo.class, "10")) {
          return;
       }
       d.a(-550182800).oc(this.getView());
       return;
    }
    public void setAutoPlay(boolean p0){
       TKAdVideo tKAdVideo = TKAdVideo.class;
       if (PatchProxy.isSupport(tKAdVideo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKAdVideo, "5")) {
          return;
       }
       this.autoPlay = p0;
       d.a(-550182800).d30(this.getView(), this.autoPlay);
       return;
    }
    public void setMuted(boolean p0){
       TKAdVideo tKAdVideo = TKAdVideo.class;
       if (PatchProxy.isSupport(tKAdVideo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKAdVideo, "4")) {
          return;
       }
       this.muted = p0;
       d.a(-550182800).wN(this.getView(), p0);
       return;
    }
    public void setOnend(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAdVideo.class, "6")) {
          return;
       }
       y.c(this.mOnCompletionRef);
       this.mOnCompletionRef = y.b(p0, this);
       this.onend = p0;
       return;
    }
    public void setPoster(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAdVideo.class, "7")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       d.a(-550182800).kB(this.getView(), p0);
       return;
    }
    public void setSrc(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAdVideo.class, "3")) {
          return;
       }
       this.src = p0;
       if (p0 != null && p0.startsWith("http")) {
          d.a(-550182800).Kc(this.getView(), p0);
       }
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKAdVideo.class, "8")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.mOnCompletionRef);
       return;
    }
}
