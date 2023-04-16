package com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter$mOnPlayerCreateListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter$mPreparedListener$2;
import com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import de5.b;
import de5.a;
import p5a.e;
import com.kwai.video.player.IMediaPlayer$OnDecodeFirstFrameListener;
import com.kwai.framework.player.core.b;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.d;
import com.yxcorp.gifshow.entity.QPhoto;

public final class VideoPlayerApmLogPresenter extends PresenterV2	// class@0016cc
{
    public QPhoto p;
    public a q;
    public final p r;
    public final p s;
    public final IMediaPlayer$OnDecodeFirstFrameListener t;
    public static final VideoPlayerApmLogPresenter$a u;

    static {
       VideoPlayerApmLogPresenter.u = new VideoPlayerApmLogPresenter$a(null);
    }
    public void VideoPlayerApmLogPresenter(){
       super();
       this.r = s.c(new VideoPlayerApmLogPresenter$mOnPlayerCreateListener$2(this));
       this.s = s.c(new VideoPlayerApmLogPresenter$mPreparedListener$2(this));
       this.t = new VideoPlayerApmLogPresenter$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerApmLogPresenter.class, "4")) {
          return;
       }
       if (!this.S8()) {
          return;
       }
       VideoPlayerApmLogPresenter tq = this.q;
       String str = "mPlayModule";
       if (tq == null) {
          a.S(str);
       }
       tq.s(this.P8());
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.getPlayer().addOnDecodeFirstFrameListener(this.t);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       e player = tq.getPlayer();
       a.o(player, "mPlayModule.player");
       if (!player.isPrepared()) {
          tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          tq.getPlayer().addOnPreparedListener(this.R8());
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerApmLogPresenter.class, "5")) {
          return;
       }
       VideoPlayerApmLogPresenter tq = this.q;
       String str = "mPlayModule";
       if (tq == null) {
          a.S(str);
       }
       tq.h(this.P8());
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.getPlayer().removeOnPreparedListener(this.R8());
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.getPlayer().removeOnDecodeFirstFrameListener(this.t);
       return;
    }
    public final b P8(){
       Object obj = PatchProxy.apply(null, this, VideoPlayerApmLogPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.getValue();
    }
    public final IMediaPlayer$OnPreparedListener R8(){
       Object obj = PatchProxy.apply(null, this, VideoPlayerApmLogPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public final boolean S8(){
       boolean b;
       VideoPlayerApmLogPresenter obj = PatchProxy.apply(null, this, VideoPlayerApmLogPresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!d.a) {
          obj = this.p;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (!obj.isImageType()) {
             b = true;
          label_002a :
             return b;
          }
       }
       b = false;
       goto label_002a ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, VideoPlayerApmLogPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.q = obj;
       return;
    }
}
