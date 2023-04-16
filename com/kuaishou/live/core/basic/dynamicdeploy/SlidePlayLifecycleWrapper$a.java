package com.kuaishou.live.core.basic.dynamicdeploy.SlidePlayLifecycleWrapper$a;
import xq5.c;
import com.kuaishou.live.core.basic.dynamicdeploy.SlidePlayLifecycleWrapper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleRegistry;
import gq3.a;
import androidx.lifecycle.Lifecycle$State;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public final class SlidePlayLifecycleWrapper$a implements c	// class@000835
{
    public final SlidePlayLifecycleWrapper b;

    public void SlidePlayLifecycleWrapper$a(SlidePlayLifecycleWrapper p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, SlidePlayLifecycleWrapper$a.class, "2")) {
          return;
       }
       this.b.b.getLifecycle().setCurrentState(Lifecycle$State.CREATED);
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, SlidePlayLifecycleWrapper$a.class, "1")) {
          return;
       }
       this.b.b.getLifecycle().setCurrentState(Lifecycle$State.RESUMED);
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
