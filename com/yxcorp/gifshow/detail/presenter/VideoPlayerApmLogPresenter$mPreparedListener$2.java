package com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter$mPreparedListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.presenter.VideoPlayerApmLogPresenter$mPreparedListener$2$a;

public final class VideoPlayerApmLogPresenter$mPreparedListener$2 extends Lambda implements a	// class@0016cb
{
    public final VideoPlayerApmLogPresenter this$0;

    public void VideoPlayerApmLogPresenter$mPreparedListener$2(VideoPlayerApmLogPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final IMediaPlayer$OnPreparedListener invoke(){
       Object obj = PatchProxy.apply(null, this, VideoPlayerApmLogPresenter$mPreparedListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VideoPlayerApmLogPresenter$mPreparedListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
