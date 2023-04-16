package com.kuaishou.live.lite.framework.root.LiveLiteRootViewController$bizPresenterLoader$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteRootViewController$bizPresenterLoader$2 extends Lambda implements a	// class@000970
{
    public final LiveLiteRootViewController this$0;

    public void LiveLiteRootViewController$bizPresenterLoader$2(LiveLiteRootViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveLiteModelManager invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRootViewController$bizPresenterLoader$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.Y2();
    }
    public Object invoke(){
       return this.invoke();
    }
}
