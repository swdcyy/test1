package com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$b;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$scheduleLoadTasks$2;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$InitStep;
import b93.d;
import android.app.Activity;
import b93.e;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import d93.c;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;

public final class LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$3 extends Lambda implements a	// class@000927
{
    public final LiveLitePresenterLoaderBase$b $presenterPriority;
    public final LiveLitePresenterLoaderBase$scheduleLoadTasks$2 this$0;

    public void LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$3(LiveLitePresenterLoaderBase$b p0,LiveLitePresenterLoaderBase$scheduleLoadTasks$2 p1){
       this.$presenterPriority = p0;
       this.this$0 = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$3.class, "1")) {
          return;
       }
       LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$3 tthis$0 = this.this$0;
       tthis$0.this$0.l(LiveLitePresenterLoaderBase$InitStep.Register, tthis$0.$activity, tthis$0.$presenterRegistry, tthis$0.$modelManager, tthis$0.$serviceManager, this.$presenterPriority.a());
       PatchProxy.onMethodExit(LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$3.class, "1");
       return;
    }
}
