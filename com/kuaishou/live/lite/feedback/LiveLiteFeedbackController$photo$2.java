package com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$photo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kwai.framework.model.feed.BaseFeed;

public final class LiveLiteFeedbackController$photo$2 extends Lambda implements a	// class@0008f7
{
    public final LiveLiteFeedbackController this$0;

    public void LiveLiteFeedbackController$photo$2(LiveLiteFeedbackController p0){
       this.this$0 = p0;
       super(0);
    }
    public final QPhoto invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFeedbackController$photo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new QPhoto(this.this$0.q.j0());
    }
    public Object invoke(){
       return this.invoke();
    }
}
