package com.yxcorp.gifshow.model.VideoQualityObserveHandler$c$c;
import erd.g;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler$c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler;
import gq.a;
import w46.b;

public final class VideoQualityObserveHandler$c$c implements g	// class@001ea0
{
    public final VideoQualityObserveHandler$c b;

    public void VideoQualityObserveHandler$c$c(VideoQualityObserveHandler$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoQualityObserveHandler$c$c.class, "1")) {
       }else {
          ClipVideoQualityEvaluateTaskHandler uClipVideoQu = this.b.a.g();
          if (uClipVideoQu != null) {
             uClipVideoQu.setTaskRequestResult(0);
          }
          a.D().e("VideoQualityObserveHandler", "clipVideoQualityTask failed", p0);
       }
       return;
    }
}
