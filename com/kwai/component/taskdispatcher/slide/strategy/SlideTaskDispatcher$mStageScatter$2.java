package com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher$mStageScatter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SlideTaskDispatcher$mStageScatter$2 extends Lambda implements a	// class@000ba7
{
    public static final SlideTaskDispatcher$mStageScatter$2 INSTANCE;

    static {
       SlideTaskDispatcher$mStageScatter$2.INSTANCE = new SlideTaskDispatcher$mStageScatter$2();
    }
    public void SlideTaskDispatcher$mStageScatter$2(){
       super(0);
    }
    public final SlideStageScatter invoke(){
       Object obj = PatchProxy.apply(null, this, SlideTaskDispatcher$mStageScatter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SlideStageScatter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
