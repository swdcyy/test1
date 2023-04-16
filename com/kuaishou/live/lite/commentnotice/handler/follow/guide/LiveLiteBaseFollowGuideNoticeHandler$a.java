package com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler$a;
import erd.g;
import com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler;
import java.lang.String;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import java.util.ArrayList;

public final class LiveLiteBaseFollowGuideNoticeHandler$a implements g	// class@000868
{
    public final LiveLiteBaseFollowGuideNoticeHandler b;
    public final String c;

    public void LiveLiteBaseFollowGuideNoticeHandler$a(LiveLiteBaseFollowGuideNoticeHandler p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       String id;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBaseFollowGuideNoticeHandler$a.class, "1")) {
       }else {
          LiveLiteBaseFollowGuideNoticeHandler$a tc = this.c;
          if (p0 != null) {
             n a = p0.a;
             if (a != null) {
                id = a.getId();
             label_001b :
                if (a.g(tc, id) && p0.c != null) {
                   p0 = this.b.b.iterator();
                   while (p0.hasNext()) {
                      this.b.e(p0.next());
                   }
                   this.b.b.clear();
                }
             }
          }
          id = null;
          goto label_001b ;
       }
       return;
    }
}
