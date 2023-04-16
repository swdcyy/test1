package com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter$mPreparedListener$2$a;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter$mPreparedListener$2;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter;
import wkd.b;
import com.yxcorp.gifshow.w;

public final class VideoPlayerApmLogPresenter$mPreparedListener$2$a implements IMediaPlayer$OnPreparedListener	// class@0016ca
{
    public final VideoPlayerApmLogPresenter$mPreparedListener$2 b;

    public void VideoPlayerApmLogPresenter$mPreparedListener$2$a(VideoPlayerApmLogPresenter$mPreparedListener$2 p0){
       this.b = p0;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoPlayerApmLogPresenter$mPreparedListener$2$a.class, "1")) {
          return;
       }
       if (this.b.this$0.S8()) {
          b.a(-1343064608).e();
       }
       return;
    }
}
