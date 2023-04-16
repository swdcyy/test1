package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$h;
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
import h69.g;
import q87.c;
import java.util.List;
import o69.c;
import brd.t;
import h69.j;
import com.yxcorp.gifshow.aicutv2.c;

public final class VideoTemplateProject$h implements o	// class@001988
{
    public final VideoTemplateProject b;

    public void VideoTemplateProject$h(VideoTemplateProject p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$h.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "task");
          if (p0.c() && this.b.F0()) {
             Object[] objArray = new Object[0];
             g.D().w("VideoTemplateProject", "changeStyle: do rxGetFrames ", objArray);
             p0 = j.q(this.b.M(), this.b.E0()).map(new c(p0));
          }else {
             p0 = t.just(p0);
          }
          ot = p0;
       }
       return ot;
    }
}
