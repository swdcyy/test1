package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$z;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import java.lang.Object;
import o69.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import o69.c;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import o69.o2;
import java.util.Map;
import kotlin.Pair;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import brd.t;

public final class VideoTemplateProject$z implements o	// class@0019a0
{
    public final VideoTemplateProject b;

    public void VideoTemplateProject$z(VideoTemplateProject p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$z.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "downloadTask");
          this.b.p0(p0.e());
          VideoTemplateProject$z tb = this.b;
          tb.v0(tb.L());
          this.b.o0(p0.a());
          o2 oo2 = new o2(this.b.K());
          oo2.e(this.b.K());
          this.b.Y().put(this.b.X(), oo2);
          ot = t.just(new Pair(p0.b(), p0));
       }
       return ot;
    }
}
