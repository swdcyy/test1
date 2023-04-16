package com.kuaishou.live.core.basic.dynamicdeploy.SlidePlayLifecycleWrapper;
import androidx.lifecycle.LifecycleOwner;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gq3.a;
import com.kuaishou.live.core.basic.dynamicdeploy.SlidePlayLifecycleWrapper$a;
import xq5.c;
import com.kuaishou.live.core.basic.dynamicdeploy.SlidePlayLifecycleWrapper$1;
import msd.a;
import u63.a;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.Lifecycle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SlidePlayLifecycleWrapper implements LifecycleOwner	// class@000836
{
    public final a b;
    public final SlidePlayLifecycleWrapper$a c;
    public final LifecycleOwner d;
    public final LiveSlidePlayService e;

    public void SlidePlayLifecycleWrapper(LifecycleOwner p0,LiveSlidePlayService p1){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "liveSlidePlayService");
       super();
       this.d = p0;
       this.e = p1;
       a uoa = new a();
       this.b = uoa;
       SlidePlayLifecycleWrapper$a uoa1 = new SlidePlayLifecycleWrapper$a(this);
       this.c = uoa1;
       p1.P4(uoa1);
       a.a(p0, new SlidePlayLifecycleWrapper$1(this));
       uoa.getLifecycle().setCurrentState(Lifecycle$State.CREATED);
    }
    public Lifecycle getLifecycle(){
       Object obj = PatchProxy.apply(null, this, SlidePlayLifecycleWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getLifecycle();
    }
}
