package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$g0;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.n2;
import java.lang.Object;
import i69.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;
import o69.c;

public final class VideoTemplateProject$g0 implements o	// class@001985
{
    public final VideoTemplateProject b;
    public final n2 c;

    public void VideoTemplateProject$g0(VideoTemplateProject p0,n2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$g0.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = this.b.f0(this.c);
       }
       return ot;
    }
}
