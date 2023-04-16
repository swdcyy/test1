package com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$$inlined$forEach$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader;
import java.util.List;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$b;
import b93.d;

public final class FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$$inlined$forEach$lambda$1 extends Lambda implements a	// class@000a48
{
    public final a $presenterFactory;
    public final List $presenterList$inlined;
    public final LiveLiteAdapterPlugin$ScatterPriority $priority;
    public final FakeBizPresenterScatterLoader this$0;

    public void FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$$inlined$forEach$lambda$1(LiveLiteAdapterPlugin$ScatterPriority p0,a p1,FakeBizPresenterScatterLoader p2,List p3){
       this.$priority = p0;
       this.$presenterFactory = p1;
       this.this$0 = p2;
       this.$presenterList$inlined = p3;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$$inlined$forEach$lambda$1.class, "1")) {
          return;
       }
       this.$presenterList$inlined.add(new LiveLitePresenterLoaderBase$b(this.$priority, this.$presenterFactory.invoke()));
       PatchProxy.onMethodExit(FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$$inlined$forEach$lambda$1.class, "1");
       return;
    }
}
