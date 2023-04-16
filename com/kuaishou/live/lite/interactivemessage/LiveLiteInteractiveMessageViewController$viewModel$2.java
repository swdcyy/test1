package com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import hf3.a;
import td3.o;
import x83.a;
import hx1.a;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$viewModel$2$1;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$viewModel$2$a;

public final class LiveLiteInteractiveMessageViewController$viewModel$2 extends Lambda implements a	// class@0009cc
{
    public final a $anonymityManager;
    public final o $liteUserStatusManager;
    public final a $longConnection;
    public final a $roleInfoManager;

    public void LiveLiteInteractiveMessageViewController$viewModel$2(a p0,o p1,a p2,a p3){
       this.$longConnection = p0;
       this.$liteUserStatusManager = p1;
       this.$anonymityManager = p2;
       this.$roleInfoManager = p3;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteInteractiveMessageViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteInteractiveMessageViewController$viewModel$2$a(new LiveLiteInteractiveMessageViewController$viewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
