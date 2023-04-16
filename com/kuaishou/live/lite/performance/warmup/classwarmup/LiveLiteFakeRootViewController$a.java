package com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeRootViewController$a;
import java.lang.Runnable;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeRootViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq3.a;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import d93.c;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController;
import java.util.Objects;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import hc3.a;
import java.lang.Iterable;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$a;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import msd.a;
import java.lang.StringBuilder;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$$inlined$forEach$lambda$1;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2;
import androidx.lifecycle.LifecycleOwner;
import en8.c;

public final class LiveLiteFakeRootViewController$a implements Runnable	// class@000a58
{
    public final LiveLiteFakeRootViewController b;

    public void LiveLiteFakeRootViewController$a(LiveLiteFakeRootViewController p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFakeRootViewController$a.class, "1")) {
          return;
       }
       a uoa = new a();
       LiveLiteFakeRootViewController$a tb = this.b;
       LiveLiteFakeRootViewController e = tb.E;
       Activity uActivity = tb.B2();
       c uoc = this.b.Z2();
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidThreeRefs(uActivity, uoa, uoc, e, FakeBizPresenterScatterLoader.class, "3")) {
          a.p(uActivity, "activity");
          a.p(uoa, "parentLifecycle");
          a.p(uoc, "serviceManager");
          b.P(e.B, "startLoad");
          if (!PatchProxy.applyVoidThreeRefs(uActivity, uoa, uoc, e, FakeBizPresenterScatterLoader.class, "2")) {
             b.P(e.B, "scheduleLoadTasksForWarmup");
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = CollectionsKt___CollectionsKt.f5(e.a(uActivity), new a()).iterator();
             while (iterator.hasNext()) {
                LiveLiteAdapterPlugin$a uoa1 = iterator.next();
                String str = uoa1.a();
                LiveLiteAdapterPlugin$ScatterPriority scatterPrior = uoa1.b();
                StringBuilder str1 = str;
                e.n(str1+"::Init", new FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$$inlined$forEach$lambda$1(scatterPrior, uoa1.c(), e, uArrayList));
             }
             FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2 oscheduleLoa = new FakeBizPresenterScatterLoader$scheduleLoadTasksForWarmup$2(e, uArrayList, uoa, uActivity, uoc);
             e.n("InitStep", v10);
          }
          e.p().flush();
       }
       return;
    }
}
