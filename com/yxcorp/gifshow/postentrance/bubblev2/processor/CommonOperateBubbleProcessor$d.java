package com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$d;
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

public final class CommonOperateBubbleProcessor$d implements x	// class@001035
{
    public final CommonOperateBubbleProcessor b;

    public void CommonOperateBubbleProcessor$d(CommonOperateBubbleProcessor p0){
       this.b = p0;
       super();
    }
    public final w apply(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonOperateBubbleProcessor$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return this.b.b(p0);
    }
}
