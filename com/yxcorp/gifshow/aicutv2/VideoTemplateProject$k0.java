package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$k0;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.n2;
import java.lang.Object;
import o69.g1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.kwai.kve.AlbumType;
import o69.c;
import brd.t;
import com.yxcorp.gifshow.aicutv2.r;
import com.yxcorp.gifshow.aicutv2.s;

public final class VideoTemplateProject$k0 implements o	// class@00198d
{
    public final VideoTemplateProject b;
    public final n2 c;

    public void VideoTemplateProject$k0(VideoTemplateProject p0,n2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$k0.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "task");
          p0 = (this.b.J() == AlbumType.MEMORY)? this.b.y0(p0, this.c).flatMap(new r(this)).map(new s(p0)): t.just(p0);
          ot = p0;
       }
       return ot;
    }
}
