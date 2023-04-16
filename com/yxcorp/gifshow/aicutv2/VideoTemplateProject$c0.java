package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$c0;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import w46.a;
import w46.a$a;
import com.kwai.feature.post.log.PostCommonBiz;
import oa9.b;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import i69.d;
import j69.a;
import j69.c;
import brd.t;
import com.yxcorp.gifshow.aicutv2.p;

public final class VideoTemplateProject$c0 implements o	// class@00197d
{
    public static final VideoTemplateProject$c0 b;

    static {
       VideoTemplateProject$c0.b = new VideoTemplateProject$c0();
    }
    public void VideoTemplateProject$c0(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$c0.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "downloadResultCode");
          a.f.a().g(PostCommonBiz.KUAISHAN, "VideoTemplateProject", "start\(\) rxStartDownload:  onApplyStyle\(\)");
          ot = d.d.a().c().d2().map(new p(p0));
       }
       return ot;
    }
}
