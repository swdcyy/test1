package com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeRootViewController$fakeLoader$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeRootViewController;
import b93.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ma3.b;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController;

public final class LiveLiteFakeRootViewController$fakeLoader$1 extends Lambda implements a	// class@000a59
{
    public final LiveLiteFakeRootViewController this$0;

    public void LiveLiteFakeRootViewController$fakeLoader$1(LiveLiteFakeRootViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final e invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFakeRootViewController$fakeLoader$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.X2();
    }
    public Object invoke(){
       return this.invoke();
    }
}
