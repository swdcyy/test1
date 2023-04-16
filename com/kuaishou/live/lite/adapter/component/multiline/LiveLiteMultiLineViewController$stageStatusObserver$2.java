package com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineViewController$stageStatusObserver$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineViewController;
import ee3.d0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineViewController$stageStatusObserver$2$a;

public final class LiveLiteMultiLineViewController$stageStatusObserver$2 extends Lambda implements a	// class@001e0c
{
    public final LiveLiteMultiLineViewController this$0;

    public void LiveLiteMultiLineViewController$stageStatusObserver$2(LiveLiteMultiLineViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final d0 invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteMultiLineViewController$stageStatusObserver$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteMultiLineViewController$stageStatusObserver$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
