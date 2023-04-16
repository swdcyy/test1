package com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor;
import brd.x;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$a;
import nsd.u;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$Companion$INSTANCE$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$g;
import erd.o;
import brd.w;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$b;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$c;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$d;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$e;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$f;
import erd.g;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$h;

public class CommonOperateBubbleProcessor implements x	// class@00103a
{
    public static final p b;
    public static final CommonOperateBubbleProcessor$a c;

    static {
       CommonOperateBubbleProcessor.c = new CommonOperateBubbleProcessor$a(null);
       CommonOperateBubbleProcessor.b = s.c(CommonOperateBubbleProcessor$Companion$INSTANCE$2.INSTANCE);
    }
    public void CommonOperateBubbleProcessor(){
       super();
    }
    public t a(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonOperateBubbleProcessor.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "upstream");
       p0 = p0.observeOn(d.c).flatMap(new CommonOperateBubbleProcessor$g(this));
       a.o(p0, "upstream.observeOn\(KwaiS¡­\(guideInfo\)\n      }\n    }");
       return p0;
    }
    public w apply(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonOperateBubbleProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "upstream");
       p0 = p0.compose(new CommonOperateBubbleProcessor$b(this)).compose(new CommonOperateBubbleProcessor$c(this)).compose(new CommonOperateBubbleProcessor$d(this)).compose(new CommonOperateBubbleProcessor$e(this)).doOnError(CommonOperateBubbleProcessor$f.b);
       a.o(p0, "upstream\n        .compos¡­Id\)\n          }\n        }");
       return p0;
    }
    public t b(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonOperateBubbleProcessor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "upstream");
       p0 = p0.flatMap(new CommonOperateBubbleProcessor$h(this));
       a.o(p0, "upstream.flatMap { bubbl¡­}\n        }\n      }\n    }");
       return p0;
    }
    public t c(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonOperateBubbleProcessor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "upstream");
       return p0;
    }
}
