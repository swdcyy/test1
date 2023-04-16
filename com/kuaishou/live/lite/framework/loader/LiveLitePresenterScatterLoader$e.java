package com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$e;
import java.lang.Runnable;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import qrd.l1;
import io.reactivex.subjects.PublishSubject;

public final class LiveLitePresenterScatterLoader$e implements Runnable	// class@000930
{
    public final LiveLitePresenterScatterLoader b;

    public void LiveLitePresenterScatterLoader$e(LiveLitePresenterScatterLoader p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveLitePresenterScatterLoader$e.class, "1")) {
          return;
       }
       b.Z(LiveLiteLogTag.LITE_FRAMEWORK_LOADER, this.b.h+" render time out");
       this.b.i.onNext(l1.a);
       return;
    }
}
