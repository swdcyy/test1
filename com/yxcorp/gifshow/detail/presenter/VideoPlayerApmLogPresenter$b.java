package com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter$b;
import com.kwai.video.player.IMediaPlayer$OnDecodeFirstFrameListener;
import com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import wkd.b;
import com.yxcorp.gifshow.w;
import java.util.Objects;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.Log;

public final class VideoPlayerApmLogPresenter$b implements IMediaPlayer$OnDecodeFirstFrameListener	// class@0016c7
{
    public final VideoPlayerApmLogPresenter a;

    public void VideoPlayerApmLogPresenter$b(VideoPlayerApmLogPresenter p0){
       this.a = p0;
       super();
    }
    public final void onDecodeFirstFrame(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(VideoPlayerApmLogPresenter$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VideoPlayerApmLogPresenter$b.class, "1")) {
          return;
       }
       if (p1 == 0x277f) {
          b.a(-1343064608).S();
          VideoPlayerApmLogPresenter$b ta = this.a;
          String str = "decode success";
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(str, ta, VideoPlayerApmLogPresenter.class, "7")) {
             StringBuilder str1 = "";
             VideoPlayerApmLogPresenter p = ta.p;
             if (p == null) {
                a.S("mPhoto");
             }
             Log.g("PlayerApm", str1+p.getUserName()+' '+str);
          }
       }
       return;
    }
}
