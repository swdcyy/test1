package com.kwai.component.taskdispatcher.slide.strategy.SlideVsyncMainScatterStrategy$put$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.taskdispatcher.slide.strategy.SlideVsyncMainScatterStrategy;
import java.lang.Object;
import eh5.q;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import java.util.Queue;

public final class SlideVsyncMainScatterStrategy$put$2 extends Lambda implements l	// class@000baa
{
    public final SlideVsyncMainScatterStrategy this$0;

    public void SlideVsyncMainScatterStrategy$put$2(SlideVsyncMainScatterStrategy p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(q p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideVsyncMainScatterStrategy$put$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       DispatchLogger.d.E("slideVsyncMainScatter", "添加上下滑打散任务:"+p0.f()+", 当前队列size："+(this.this$0.i.size() + 1));
       return this.this$0.i.add(p0);
    }
}
