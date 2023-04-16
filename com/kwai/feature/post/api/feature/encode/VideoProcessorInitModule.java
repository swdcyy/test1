package com.kwai.feature.post.api.feature.encode.VideoProcessorInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.feature.encode.VideoProcessorInitModule$a;
import q6b.d;

public class VideoProcessorInitModule extends a	// class@001396
{

    public void VideoProcessorInitModule(){
       super();
    }
    public int f0(){
       return 2;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, VideoProcessorInitModule.class, "1")) {
          return;
       }
       d.a = new VideoProcessorInitModule$a(this);
       return;
    }
}
