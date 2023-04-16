package com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$cancelTask$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$cancelTask$1;
import java.lang.Object;
import eh5.q;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.collections.ArraysKt___ArraysKt;

public final class SlideStageScatter$cancelTask$1$1 extends Lambda implements l	// class@000b9d
{
    public final SlideStageScatter$cancelTask$1 this$0;

    public void SlideStageScatter$cancelTask$1$1(SlideStageScatter$cancelTask$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(q p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideStageScatter$cancelTask$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return ArraysKt___ArraysKt.O7(this.this$0.c, p0.d());
    }
}
