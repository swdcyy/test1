package com.yxcorp.gifshow.model.VideoQualityObserveHandler$c$b;
import erd.g;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler$c;
import java.lang.Object;
import hlb.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler;

public final class VideoQualityObserveHandler$c$b implements g	// class@001e9f
{
    public final VideoQualityObserveHandler$c b;

    public void VideoQualityObserveHandler$c$b(VideoQualityObserveHandler$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoQualityObserveHandler$c$b.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("VideoQualityObserveHandler", "clipVideoQualityTask result: "+p0.mResult, objArray);
          ClipVideoQualityEvaluateTaskHandler uClipVideoQu = this.b.a.g();
          if (uClipVideoQu != null) {
             uClipVideoQu.setTaskRequestResult(p0.mResult);
          }
       }
       return;
    }
}
