package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$e;
import erd.o;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import brd.t;
import o69.w0;

public final class VideoTemplateProject$e implements o	// class@001982
{
    public final KwaiAICutStyle b;

    public void VideoTemplateProject$e(KwaiAICutStyle p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$e.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = w0.d(this.b, p0);
       }
       return ot;
    }
}
