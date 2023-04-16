package com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$d;
import java.lang.Runnable;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import java.util.concurrent.atomic.AtomicInteger;
import eh5.o;
import android.os.Handler;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter;
import android.os.Looper;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$b;
import trd.j;
import java.lang.IllegalStateException;

public final class SlideStageScatter$d implements Runnable	// class@000ba1
{
    public final SlideStageScatter b;
    public final boolean c;

    public void SlideStageScatter$d(SlideStageScatter p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SlideStageScatter$d.class, "1")) {
          return;
       }
       SlideStageScatter$d tb = this.b;
       SlideStageScatter$d tc = this.c;
       Objects.requireNonNull(tb);
       SlideStageScatter slideStageSc = SlideStageScatter.class;
       if (!PatchProxy.isSupport(slideStageSc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tc), tb, slideStageSc, "3")) {
          tb.b().set(-2);
          if (tc != null) {
             tb.n().getLooper().quitSafely();
          }else {
             tb.n().getLooper().quit();
          }
          Iterator iterator = tb.s().entrySet().iterator();
          while (iterator.hasNext()) {
             if (iterator.next().getValue().a().isEmpty()) {
             }else {
                throw new IllegalStateException("quit stageScatter failed: still remain task in cache stack!");
             }
          }
       }
       return;
    }
}
