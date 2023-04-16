package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$a0;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;
import o69.c;

public final class VideoTemplateProject$a0 implements o	// class@001979
{
    public final VideoTemplateProject b;

    public void VideoTemplateProject$a0(VideoTemplateProject p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$a0.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = this.b.A(p0, true);
       }
       return ot;
    }
}
