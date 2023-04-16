package com.kuaishou.live.core.basic.dynamicdeploy.SlidePlayLifecycleWrapper$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.basic.dynamicdeploy.SlidePlayLifecycleWrapper;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import androidx.lifecycle.LifecycleRegistry;
import gq3.a;
import androidx.lifecycle.Lifecycle$State;

public final class SlidePlayLifecycleWrapper$1 extends Lambda implements a	// class@000834
{
    public final SlidePlayLifecycleWrapper this$0;

    public void SlidePlayLifecycleWrapper$1(SlidePlayLifecycleWrapper p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, SlidePlayLifecycleWrapper$1.class, "1")) {
          return;
       }
       SlidePlayLifecycleWrapper$1 tthis$0 = this.this$0;
       tthis$0.e.d5(tthis$0.c);
       this.this$0.b.getLifecycle().setCurrentState(Lifecycle$State.DESTROYED);
       return;
    }
}
