package com.kuaishou.live.common.core.component.bottombubble.notices.common.service.b;
import erd.r;
import java.lang.Object;
import com.kwai.feature.api.live.base.event.LiveLifecycleEvent;

public final class b implements r	// class@000f9a
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == LiveLifecycleEvent.PRESENTERS_BIND_FINISHED)? true: false;
       return b;
    }
}
