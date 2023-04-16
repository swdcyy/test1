package com.kuaishou.live.core.show.comments.config.LiveCommentConfigUpdateController$scMessageListener$2$a;
import lf3.g;
import com.kuaishou.live.core.show.comments.config.LiveCommentConfigUpdateController$scMessageListener$2;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveCustomizationConfigWorkTimelySignal;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveCustomizationCommentConfig;
import com.kuaishou.live.common.core.component.comments.display.config.LiveCommentsDisplayParams;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveCustomizationCommentSpeedConfig;
import com.kuaishou.live.core.show.comments.config.LiveCommentConfigUpdateController;
import ne1.h;
import com.kuaishou.live.core.show.comments.config.a;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import lf3.f;

public final class LiveCommentConfigUpdateController$scMessageListener$2$a implements g	// class@000a59
{
    public final LiveCommentConfigUpdateController$scMessageListener$2 b;

    public void LiveCommentConfigUpdateController$scMessageListener$2$a(LiveCommentConfigUpdateController$scMessageListener$2 p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentConfigUpdateController$scMessageListener$2$a.class, "1")) {
       }else {
          SCLiveCustomizationConfigWorkTimelySignal comment = p0.comment;
          if (comment != null) {
             LiveCustomizationCommentConfig audienceSpee = comment.audienceSpeed;
             if (audienceSpee != null) {
                LiveCommentsDisplayParams liveComments = LiveCommentsDisplayParams.createDefaultParams();
                a.o(liveComments, "LiveCommentsDisplayParams.createDefaultParams\(\)");
                LiveCommentsDisplayParams liveComments1 = new LiveCommentsDisplayParams();
                liveComments1.mScene = "default";
                liveComments1.mAutoScrollToBottomDelayTimeMs = (int)audienceSpee.autoScrollToBottomDelayTimeMs;
                liveComments1.mCachedCommonMaxNum = (int)audienceSpee.cachedCommonMaxNum;
                liveComments1.mChangeScrollSpeedLimitNum = (int)audienceSpee.changeScrollSpeedLimitNum;
                liveComments1.mFoldContinueMaxNum = (int)audienceSpee.foldContinueMaxNum;
                liveComments1.mShowFoldBatchNum = (int)audienceSpee.showFoldBatchNum;
                liveComments1.mUpdateFoldIntervalMs = (int)audienceSpee.updateFoldIntervalMs;
                liveComments1.mFastScrollSpeedDelayMs = this.b.this$0.a((int)audienceSpee.fastScrollSpeedDelayMs, liveComments.mFastScrollSpeedDelayMs);
                liveComments1.mFastScrollSpeedDp = this.b.this$0.a((int)audienceSpee.fastScrollSpeedDp, liveComments.mFastScrollSpeedDp);
                liveComments1.mFastScrollSpeedNum = this.b.this$0.a((int)audienceSpee.fastScrollSpeedNum, liveComments.mFastScrollSpeedNum);
                liveComments1.mSlowScrollSpeedDelayMs = this.b.this$0.a((int)audienceSpee.slowScrollSpeedDelayMs, liveComments.mSlowScrollSpeedDelayMs);
                liveComments1.mSlowScrollSpeedDp = this.b.this$0.a((int)audienceSpee.slowScrollSpeedDp, liveComments.mSlowScrollSpeedDp);
                liveComments1.mSlowScrollSpeedNum = this.b.this$0.a((int)audienceSpee.slowScrollSpeedNum, liveComments.mSlowScrollSpeedNum);
                this.b.this$0.c.M3(liveComments1);
                b.Z(a.b, "update comment config: "+liveComments1);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
