package com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$cancelTask$1;
import java.lang.Runnable;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import trd.j;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$cancelTask$1$1;
import java.util.List;
import msd.l;
import trd.y;

public final class SlideStageScatter$cancelTask$1 implements Runnable	// class@000b9e
{
    public final SlideStageScatter b;
    public final long[] c;

    public void SlideStageScatter$cancelTask$1(SlideStageScatter p0,long[] p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SlideStageScatter$cancelTask$1.class, "1")) {
          return;
       }
       y.K0(this.b.o(), new SlideStageScatter$cancelTask$1$1(this));
       return;
    }
}
