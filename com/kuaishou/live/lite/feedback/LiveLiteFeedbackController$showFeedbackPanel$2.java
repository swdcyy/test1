package com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$showFeedbackPanel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xp5.i;

public final class LiveLiteFeedbackController$showFeedbackPanel$2 extends Lambda implements a	// class@0008f9
{
    public final LiveLiteFeedbackController this$0;

    public void LiveLiteFeedbackController$showFeedbackPanel$2(LiveLiteFeedbackController p0){
       this.this$0 = p0;
       super(0);
    }
    public final ClientContent$LiveStreamPackage invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFeedbackController$showFeedbackPanel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.u.a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
