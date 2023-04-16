package com.yxcorp.gifshow.ad.detail.presenter.player.VideoPlayerPlayStatePresenter$mLifecycleObserver$1;
import com.yxcorp.gifshow.osbug.FixedLifecycleObserver;
import com.yxcorp.gifshow.ad.detail.presenter.player.VideoPlayerPlayStatePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import xs3.f;
import f4a.r;
import wkd.b;
import gi0.a;
import c59.j;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import androidx.lifecycle.LifecycleOwner;

public final class VideoPlayerPlayStatePresenter$mLifecycleObserver$1 extends FixedLifecycleObserver	// class@00166d
{
    public boolean f;
    public final VideoPlayerPlayStatePresenter g;

    public void VideoPlayerPlayStatePresenter$mLifecycleObserver$1(VideoPlayerPlayStatePresenter p0){
       this.g = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoPlayerPlayStatePresenter$mLifecycleObserver$1.class, "1")) {
          return;
       }
       boolean b = false;
       this.f = b;
       VideoPlayerPlayStatePresenter$mLifecycleObserver$1 tg = this.g;
       if (tg.s != null) {
          Objects.requireNonNull(tg);
          b obj = PatchProxy.apply(objArray, tg, VideoPlayerPlayStatePresenter.class, "2");
          boolean b1 = true;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(tg.R8()){
             obj = d.a(0x56c46a3d);
             a.o(obj, "PluginManager.get\(Transa¡­DetailPlugin::class.java\)");
             if (!obj.OT()) {
                r or = r.a();
                String str = "MerchantPlayStatusHelper.getInstance\(\)";
                a.o(or, str);
                if (or.b()) {
                   or = r.a();
                   a.o(or, str);
                   or.c(b);
                }else {
                   int i = 0x1959122;
                   if (b.a(i).n3()) {
                      b.a(i).o3(b);
                   }else {
                      j b2 = j.b;
                      if (b2.a()) {
                         b2.b(b);
                      }else {
                         b = true;
                      }
                   }
                }
             }
          }
          if (b) {
             this.f = b1;
             a.d().k(new PlayEvent(VideoPlayerPlayStatePresenter.P8(this.g), PlayEvent$Status.PAUSE, 5));
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerPlayStatePresenter$mLifecycleObserver$1.class, "2")) {
          return;
       }
       if (this.g.s != null) {
          a.d().k(new PlayEvent(VideoPlayerPlayStatePresenter.P8(this.g), PlayEvent$Status.RESUME, 5));
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoPlayerPlayStatePresenter$mLifecycleObserver$1.class, "3")) {
          return;
       }
       a.p(p0, "owner");
       super.onStart(p0);
       if (this.g.s != null && this.f == null) {
          a.d().k(new PlayEvent(VideoPlayerPlayStatePresenter.P8(this.g), PlayEvent$Status.RESUME, 34));
       }
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoPlayerPlayStatePresenter$mLifecycleObserver$1.class, "4")) {
          return;
       }
       a.p(p0, "owner");
       super.onStop(p0);
       VideoPlayerPlayStatePresenter$mLifecycleObserver$1 tg = this.g;
       if (tg.s != null && (this.f == null && !tg.R8())) {
          a.d().k(new PlayEvent(VideoPlayerPlayStatePresenter.P8(this.g), PlayEvent$Status.PAUSE, 34));
       }
    label_0039 :
       return;
    }
}
