package com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$c;
import erd.g;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;
import msd.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import b93.e;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;

public final class LiveLitePresenterScatterLoader$c implements g	// class@00092e
{
    public final LiveLitePresenterScatterLoader b;
    public final a c;
    public final a d;

    public void LiveLitePresenterScatterLoader$c(LiveLitePresenterScatterLoader p0,a p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePresenterScatterLoader$c.class, "1")) {
       }else {
          b.Z(LiveLiteLogTag.LITE_FRAMEWORK_LOADER, this.b.h+" scheduleDeferredLoadTasks: render&resume");
          this.b.u(this.c.invoke(), this.d.invoke());
       }
       return;
    }
}
