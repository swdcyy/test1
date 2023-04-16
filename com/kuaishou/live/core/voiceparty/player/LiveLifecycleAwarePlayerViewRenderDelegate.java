package com.kuaishou.live.core.voiceparty.player.LiveLifecycleAwarePlayerViewRenderDelegate;
import fu2.f;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.autoplay.live.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.video.waynelive.LivePlayerController;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.player.LiveLifecycleAwarePlayerViewRenderDelegate$storePendingSetter$1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import fu2.c;
import java.lang.Enum;
import msd.a;
import qrd.l1;

public final class LiveLifecycleAwarePlayerViewRenderDelegate implements f, LifecycleEventObserver	// class@001811
{
    public boolean b;
    public a c;
    public final Lifecycle d;
    public final g e;

    public void LiveLifecycleAwarePlayerViewRenderDelegate(Lifecycle p0,g p1){
       a.p(p0, "lifecycle");
       a.p(p1, "livePlayModule");
       super();
       this.d = p0;
       this.e = p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveLifecycleAwarePlayerViewRenderDelegate.class, "1")) {
          return;
       }
       this.d.addObserver(this);
       return;
    }
    public void b(LivePlayerController p0,LivePlayTextureView p1,boolean p2){
       LiveLifecycleAwarePlayerViewRenderDelegate liveLifecycl = LiveLifecycleAwarePlayerViewRenderDelegate.class;
       if (PatchProxy.isSupport(liveLifecycl) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, LiveLifecycleAwarePlayerViewRenderDelegate.class, "3")) {
          return;
       }
       a.p(p0, "controller");
       if (this.b != null) {
          p0.setTextureView(p1, p2);
          p0.setEnableAutoUpdateViewSize(true);
       }else if(PatchProxy.isSupport(liveLifecycl) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, LiveLifecycleAwarePlayerViewRenderDelegate.class, "5")){
          this.c = new LiveLifecycleAwarePlayerViewRenderDelegate$storePendingSetter$1(this, p0, p1, p2);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveLifecycleAwarePlayerViewRenderDelegate.class, "4")) {
          return;
       }
       this.e.a0();
       return;
    }
    public void onRelease(){
       if (PatchProxy.applyVoid(null, this, LiveLifecycleAwarePlayerViewRenderDelegate.class, "2")) {
          return;
       }
       this.d.removeObserver(this);
       this.c = null;
       return;
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLifecycleAwarePlayerViewRenderDelegate.class, "6")) {
          return;
       }
       a.p(p0, "owner");
       a.p(p1, "event");
       int i = c.a[p1.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i == 2) {
             this.b = false;
          }
       }else {
          this.b = b;
          LiveLifecycleAwarePlayerViewRenderDelegate tc = this.c;
          if (tc != null) {
             l1 ol1 = tc.invoke();
          }
          this.c = null;
       }
       return;
    }
}
