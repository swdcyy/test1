package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$y;
import erd.a;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.n2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w46.a;
import w46.a$a;
import com.kwai.feature.post.log.PostCommonBiz;
import oa9.b;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import o69.c;

public final class VideoTemplateProject$y implements a	// class@00199f
{
    public final VideoTemplateProject b;
    public final n2 c;

    public void VideoTemplateProject$y(VideoTemplateProject p0,n2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VideoTemplateProject$y.class, "1")) {
          return;
       }
       a.f.a().g(PostCommonBiz.KUAISHAN, "VideoTemplateProject", "start\(\) on dispose");
       this.b.d0(this.c, 9, AICutErrorCode.NO_ERROR);
       return;
    }
}
