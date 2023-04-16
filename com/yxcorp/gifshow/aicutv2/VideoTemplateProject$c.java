package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$c;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import brd.t;
import o69.c;

public final class VideoTemplateProject$c implements o	// class@00197e
{
    public final VideoTemplateProject b;
    public final KwaiAICutStyle c;

    public void VideoTemplateProject$c(VideoTemplateProject p0,KwaiAICutStyle p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "music");
          ot = this.b.F(p0, this.c);
       }
       return ot;
    }
}
