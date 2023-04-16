package com.kwai.feature.post.api.feature.encode.VideoProcessorInitModule$a;
import q6b.d$b;
import com.kwai.feature.post.api.feature.encode.VideoProcessorInitModule;
import java.lang.Object;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.media.model.PhotoMovieEncodeConfig;
import q46.l;
import java.lang.Boolean;
import lnc.qa;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a;
import lnc.t;
import java.lang.Throwable;

public class VideoProcessorInitModule$a implements d$b	// class@001395
{
    public final VideoProcessorInitModule a;

    public void VideoProcessorInitModule$a(VideoProcessorInitModule p0){
       this.a = p0;
       super();
    }
    public EncodeConfig a(){
       Object obj = PatchProxy.apply(null, this, VideoProcessorInitModule$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.e();
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, VideoProcessorInitModule$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (qa.e.h(LoadPolicy.SILENT_IMMEDIATE).f() == null)? true: false;
       return b;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, VideoProcessorInitModule$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return qa.e.j();
    }
}
