package com.yxcorp.gifshow.aicutv2.g;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$l;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import brd.t;
import o69.w0;

public final class g implements o	// class@0019a8
{
    public final VideoTemplateProject$l b;
    public final AICutMusicInfo c;

    public void g(VideoTemplateProject$l p0,AICutMusicInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          g tc = this.c;
          a.o(tc, "music");
          ot = w0.d(this.b.c, tc);
       }
       return ot;
    }
}
