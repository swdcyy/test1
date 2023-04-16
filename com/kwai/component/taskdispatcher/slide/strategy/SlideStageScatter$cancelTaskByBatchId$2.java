package com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$cancelTaskByBatchId$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter;
import java.lang.Object;
import eh5.q;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.os.Handler;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter;
import android.os.Message;

public final class SlideStageScatter$cancelTaskByBatchId$2 extends Lambda implements l	// class@000ba0
{
    public final SlideStageScatter this$0;

    public void SlideStageScatter$cancelTaskByBatchId$2(SlideStageScatter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(q p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideStageScatter$cancelTaskByBatchId$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return this.this$0.n().sendMessageAtFrontOfQueue(this.this$0.q(p0));
    }
}
