package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$b0;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;
import i69.d;
import j69.a;
import j69.c;
import com.yxcorp.gifshow.aicutv2.o;

public final class VideoTemplateProject$b0 implements o	// class@00197b
{
    public final VideoTemplateProject b;

    public void VideoTemplateProject$b0(VideoTemplateProject p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$b0.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "downloadResultCode");
          p0 = (!this.b.N0())? t.just(p0): d.d.a().c().x2().map(new o(p0));
          ot = p0;
       }
       return ot;
    }
}
