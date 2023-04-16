package com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$viewModel$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$viewModel$2;
import java.lang.Object;
import rb3.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hf3.a;
import td3.o;
import x83.a;
import hx1.a;

public final class LiveLiteInteractiveMessageViewController$viewModel$2$1 extends Lambda implements a	// class@0009ca
{
    public final LiveLiteInteractiveMessageViewController$viewModel$2 this$0;

    public void LiveLiteInteractiveMessageViewController$viewModel$2$1(LiveLiteInteractiveMessageViewController$viewModel$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final f invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteInteractiveMessageViewController$viewModel$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveLiteInteractiveMessageViewController$viewModel$2$1 tthis$0 = this.this$0;
       return new f(tthis$0.$longConnection, tthis$0.$liteUserStatusManager, tthis$0.$anonymityManager, tthis$0.$roleInfoManager);
    }
}
