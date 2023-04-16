package com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader;
import java.util.List;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import d93.c;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$b;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2$$special$$inlined$forEach$lambda$1;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2$$special$$inlined$forEach$lambda$2;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2$$special$$inlined$forEach$lambda$3;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2$$special$$inlined$forEach$lambda$4;

public final class FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2 extends Lambda implements a	// class@000a4d
{
    public final Activity $activity;
    public final LifecycleOwner $parentLifecycle;
    public final List $presenterList;
    public final c $serviceManager;
    public final FakeBizPresenterScatterLoader this$0;

    public void FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2(FakeBizPresenterScatterLoader p0,List p1,LifecycleOwner p2,Activity p3,c p4){
       this.this$0 = p0;
       this.$presenterList = p1;
       this.$parentLifecycle = p2;
       this.$activity = p3;
       this.$serviceManager = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2.class, "1")) {
          return;
       }
       Iterator iterator = this.$presenterList.iterator();
       while (iterator.hasNext()) {
          this.this$0.n("::Init", new FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2$$special$$inlined$forEach$lambda$1(iterator.next(), this));
       }
       iterator = this.$presenterList.iterator();
       while (iterator.hasNext()) {
          this.this$0.n("::InjectModel", new FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2$$special$$inlined$forEach$lambda$2(iterator.next(), this));
       }
       iterator = this.$presenterList.iterator();
       while (iterator.hasNext()) {
          this.this$0.n("::Register", new FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2$$special$$inlined$forEach$lambda$3(iterator.next(), this));
       }
       iterator = this.$presenterList.iterator();
       while (iterator.hasNext()) {
          this.this$0.n("::InjectService", new FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2$$special$$inlined$forEach$lambda$4(iterator.next(), this));
       }
       return;
    }
}
