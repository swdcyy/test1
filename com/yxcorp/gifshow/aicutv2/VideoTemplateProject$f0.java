package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$f0;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.n2;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;
import o69.c;

public final class VideoTemplateProject$f0 implements o	// class@001983
{
    public final VideoTemplateProject b;
    public final n2 c;

    public void VideoTemplateProject$f0(VideoTemplateProject p0,n2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$f0.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = this.b.j0(this.c);
       }
       return ot;
    }
}