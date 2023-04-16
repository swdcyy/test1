package com.kwai.performance.fluency.page.monitor.tracker.AutoTracker$startTimeoutCheck$1$$special$$inlined$let$lambda$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import gf7.a;
import java.util.LinkedList;
import com.kwai.performance.fluency.page.monitor.model.PageStageEvent;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker$startTimeoutCheck$1;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class AutoTracker$startTimeoutCheck$1$$special$$inlined$let$lambda$3 extends Lambda implements a	// class@0010c7
{
    public final a $event;
    public final LinkedList $eventList$inlined;
    public final PageStageEvent $it$inlined;
    public final long $onRequestEndTs$inlined;
    public final AutoTracker$startTimeoutCheck$1 this$0;

    public void AutoTracker$startTimeoutCheck$1$$special$$inlined$let$lambda$3(a p0,long p1,LinkedList p2,PageStageEvent p3,AutoTracker$startTimeoutCheck$1 p4){
       this.$event = p0;
       this.$onRequestEndTs$inlined = p1;
       this.$eventList$inlined = p2;
       this.$it$inlined = p3;
       this.this$0 = p4;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       return "page not match fully draw rule, current projection "+"X = "+this.$event.b()+", Y= "+this.$event.c()+", "+"count = "+this.$event.d()+"} index is "+this.$eventList$inlined.indexOf(this.$event);
    }
}
