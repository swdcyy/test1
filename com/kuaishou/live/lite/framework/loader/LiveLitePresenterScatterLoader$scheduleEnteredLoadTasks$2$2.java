package com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$2$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$2;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import kotlin.jvm.internal.Ref$LongRef;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;

public final class LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$2$2 extends Lambda implements a	// class@000939
{
    public final LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$2 this$0;

    public void LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$2$2(LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$2$2.class, "1")) {
          return;
       }
       this.this$0.this$0.f = SystemClock.elapsedRealtime() - this.this$0.$componentDidAppearLoadStartTimeMs.element;
       return;
    }
}
