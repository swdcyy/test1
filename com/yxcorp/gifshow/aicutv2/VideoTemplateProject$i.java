package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$i;
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
import kotlin.Pair;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import brd.t;
import o69.c;
import com.yxcorp.gifshow.aicutv2.d;
import java.lang.Integer;

public final class VideoTemplateProject$i implements o	// class@00198a
{
    public final VideoTemplateProject b;

    public void VideoTemplateProject$i(VideoTemplateProject p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$i.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "task");
          p0 = (p0.c())? this.b.A(new Pair(AICutErrorCode.NO_ERROR, p0), false).map(new d(p0)): t.just(Integer.valueOf(p0.p()));
          ot = p0;
       }
       return ot;
    }
}
