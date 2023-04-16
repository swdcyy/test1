package com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$e;
import brd.x;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor;
import java.lang.Object;
import brd.t;
import brd.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class CommonOperateBubbleProcessor$e implements x	// class@001036
{
    public final CommonOperateBubbleProcessor b;

    public void CommonOperateBubbleProcessor$e(CommonOperateBubbleProcessor p0){
       this.b = p0;
       super();
    }
    public final w apply(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonOperateBubbleProcessor$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return this.b.a(p0);
    }
}
