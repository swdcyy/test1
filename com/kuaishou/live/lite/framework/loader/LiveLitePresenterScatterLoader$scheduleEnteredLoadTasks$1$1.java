package com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import kotlin.jvm.internal.Ref$LongRef;

public final class LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$1$1 extends Lambda implements a	// class@000936
{
    public final LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$1 this$0;

    public void LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$1$1(LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$1$1.class, "1")) {
          return;
       }
       this.this$0.$componentDidAppearLoadStartTimeMs.element = SystemClock.elapsedRealtime();
       return;
    }
}
