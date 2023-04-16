package com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeRootViewController$fakeLoader$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeRootViewController;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController;

public final class LiveLiteFakeRootViewController$fakeLoader$2 extends Lambda implements a	// class@000a5a
{
    public final LiveLiteFakeRootViewController this$0;

    public void LiveLiteFakeRootViewController$fakeLoader$2(LiveLiteFakeRootViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveLiteModelManager invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFakeRootViewController$fakeLoader$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.Y2();
    }
    public Object invoke(){
       return this.invoke();
    }
}
