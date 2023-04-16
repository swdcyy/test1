package com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter$mOnPlayerCreateListener$2$a;
import de5.b;
import com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter$mOnPlayerCreateListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter;
import com.yxcorp.gifshow.detail.playmodule.precreate.LaunchPlayerLogger;
import java.util.Objects;
import s3a.a;
import s3a.b;
import com.yxcorp.gifshow.w;
import kotlin.jvm.internal.a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import wkd.b;

public final class VideoPlayerApmLogPresenter$mOnPlayerCreateListener$2$a implements b	// class@0016c8
{
    public final VideoPlayerApmLogPresenter$mOnPlayerCreateListener$2 a;

    public void VideoPlayerApmLogPresenter$mOnPlayerCreateListener$2$a(VideoPlayerApmLogPresenter$mOnPlayerCreateListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoPlayerApmLogPresenter$mOnPlayerCreateListener$2$a.class, "1")) {
          return;
       }
       if (this.a.this$0.S8()) {
          LaunchPlayerLogger b = LaunchPlayerLogger.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, LaunchPlayerLogger.class, "4")) {
             a.e.a().a();
             b.a().Y();
          }
       }
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoPlayerApmLogPresenter$mOnPlayerCreateListener$2$a.class, "2")) {
          return;
       }
       if (this.a.this$0.S8()) {
          LaunchPlayerLogger b = LaunchPlayerLogger.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, LaunchPlayerLogger.class, "5")) {
             a e = a.e;
             e.a().b();
             b.a().c();
             e.d();
          }
          VideoPlayerApmLogPresenter q = this.a.this$0.q;
          if (q == null) {
             a.S("mPlayModule");
          }
          e player = q.getPlayer();
          a.o(player, "mPlayModule.player");
          if (!player.isPrepared()) {
             b.a(-1343064608).T();
          }
       }
       return;
    }
}
