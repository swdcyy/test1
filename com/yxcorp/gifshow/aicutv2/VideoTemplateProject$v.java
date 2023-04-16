package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$v;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.List;
import o69.c;
import brd.t;
import h69.j;
import com.yxcorp.gifshow.aicutv2.n;

public final class VideoTemplateProject$v implements o	// class@00199c
{
    public final VideoTemplateProject b;

    public void VideoTemplateProject$v(VideoTemplateProject p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$v.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "template");
          p0 = (this.b.F0() && !p0.getType())? j.q(this.b.M(), this.b.E0()).map(new n(p0)): t.just(p0);
          ot = p0;
       }
       return ot;
    }
}
