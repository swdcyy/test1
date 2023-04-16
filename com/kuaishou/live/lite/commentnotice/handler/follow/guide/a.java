package com.kuaishou.live.lite.commentnotice.handler.follow.guide.a;
import java.lang.Runnable;
import com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;

public final class a implements Runnable	// class@00086e
{
    public final LiveLiteBaseFollowGuideNoticeHandler$c b;
    public final boolean c;

    public void a(LiveLiteBaseFollowGuideNoticeHandler$c p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Iterator iterator;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       if (this.c != null) {
          LiveLiteBaseFollowGuideNoticeHandler$c b = this.b.b;
          LiveLiteBaseFollowGuideNoticeHandler c = b.c;
          if (c != null) {
             b.e(c);
             this.b.b.c = objArray;
          }
          iterator = this.b.b.b.iterator();
          while (iterator.hasNext()) {
             LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage iLiveLiteGui = iterator.next();
             a.o(iLiveLiteGui, "message");
             this.b.b.e(iLiveLiteGui);
          }
       }else {
          iterator = this.b.b.b.iterator();
          while (iterator.hasNext()) {
             this.b.b.g.d(iterator.next());
          }
       }
       return;
    }
}
