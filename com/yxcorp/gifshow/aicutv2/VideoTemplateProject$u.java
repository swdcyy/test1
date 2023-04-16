package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$u;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.n2;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.kwai.kve.AlbumType;
import o69.c;
import brd.t;
import com.yxcorp.gifshow.aicutv2.m;

public final class VideoTemplateProject$u implements o	// class@00199b
{
    public final VideoTemplateProject b;
    public final n2 c;

    public void VideoTemplateProject$u(VideoTemplateProject p0,n2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$u.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "template");
          p0 = (this.b.J() == AlbumType.AICUT)? this.b.i0(this.c).map(new m(this, p0)): t.just(p0);
          ot = p0;
       }
       return ot;
    }
}
