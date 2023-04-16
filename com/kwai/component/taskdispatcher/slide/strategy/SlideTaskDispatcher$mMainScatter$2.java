package com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher$mMainScatter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ih5.z;
import kh5.b;
import lh5.a;
import jh5.b;

public final class SlideTaskDispatcher$mMainScatter$2 extends Lambda implements a	// class@000ba6
{
    public final SlideTaskDispatcher this$0;

    public void SlideTaskDispatcher$mMainScatter$2(SlideTaskDispatcher p0){
       this.this$0 = p0;
       super(0);
    }
    public final Object invoke(){
       SlideTaskDispatcher obj = PatchProxy.apply(null, this, SlideTaskDispatcher$mMainScatter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.f;
       if (obj != null && obj.a()) {
          return new b(this.this$0.e, obj);
       }
       return new b(this.this$0.e);
    }
}
