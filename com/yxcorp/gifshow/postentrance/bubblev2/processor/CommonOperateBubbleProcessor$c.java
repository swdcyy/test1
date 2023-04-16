package com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$c;
import brd.x;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor;
import java.lang.Object;
import brd.t;
import brd.w;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import pzb.d;
import erd.o;

public final class CommonOperateBubbleProcessor$c implements x	// class@001034
{
    public final CommonOperateBubbleProcessor b;

    public void CommonOperateBubbleProcessor$c(CommonOperateBubbleProcessor p0){
       this.b = p0;
       super();
    }
    public final w apply(t p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CommonOperateBubbleProcessor$c obj = PatchProxy.applyOneRefs(p0, this, CommonOperateBubbleProcessor$c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = this.b;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyOneRefs(p0, obj, CommonOperateBubbleProcessor.class, "2");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "upstream");
          ot = p0.flatMap(d.b);
          a.o(ot, "upstream.flatMap {\n     ¡­le.just\(it\)\n      }\n    }");
       }
       return ot;
    }
}
