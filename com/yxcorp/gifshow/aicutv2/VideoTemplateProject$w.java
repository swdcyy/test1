package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$w;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.n2;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import o69.c;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import brd.t;
import java.util.Objects;
import java.lang.System;
import com.kwai.feature.post.api.feature.memory.MemorySceneType;
import t45.d;
import brd.z;
import t69.f;
import erd.g;
import t69.g;
import t69.h;
import t69.i;

public final class VideoTemplateProject$w implements o	// class@00199d
{
    public final VideoTemplateProject b;
    public final n2 c;

    public void VideoTemplateProject$w(VideoTemplateProject p0,n2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       z a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$w.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "it");
          this.b.p0(p0.getId());
          if (!p0.getType()) {
             p0 = this.b.O0(p0.getAiCutStyle(), this.c);
          }else {
             VideoTemplateProject$w tb = this.b;
             VideoTemplateProject$w tc = this.c;
             Objects.requireNonNull(tb);
             Object obj = PatchProxy.applyTwoRefs(p0, tc, tb, VideoTemplateProject.class, "9");
             if (obj != patchProxyRe) {
                ot = obj;
             }else {
                long l = System.currentTimeMillis();
                a = d.a;
                p0 = tb.C0(p0, false, null).observeOn(a).doOnNext(new f(tb, tc)).takeLast(1).observeOn(d.c).flatMap(new g(tb, l, p0)).observeOn(a).map(new h(tb, l, p0)).onErrorReturn(new i(tb));
                a.o(p0, "downloadKuaiShanTemplate¡­\n          task\n        }");
             }
          }
          ot = p0;
       }
       return ot;
    }
}
