package com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$startScatterLoad$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import io.reactivex.subjects.PublishSubject;

public final class LiveLitePresenterScatterLoader$startScatterLoad$3 extends Lambda implements a	// class@000947
{
    public final LiveLitePresenterScatterLoader this$0;

    public void LiveLitePresenterScatterLoader$startScatterLoad$3(LiveLitePresenterScatterLoader p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLitePresenterScatterLoader$startScatterLoad$3.class, "1")) {
          return;
       }
       b.Z(LiveLiteLogTag.LITE_FRAMEWORK_LOADER, this.this$0.h+" resume");
       this.this$0.j.onNext(l1.a);
       return;
    }
}
