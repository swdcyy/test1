package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$x;
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
import com.kwai.kve.AlbumType;
import o69.c;
import brd.t;

public final class VideoTemplateProject$x implements o	// class@00199e
{
    public final VideoTemplateProject b;

    public void VideoTemplateProject$x(VideoTemplateProject p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$x.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "originTask");
          p0 = (this.b.J() == AlbumType.MEMORY)? this.b.z0(p0): t.just(p0);
          ot = p0;
       }
       return ot;
    }
}
