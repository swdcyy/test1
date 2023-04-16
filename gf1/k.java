package gf1.k;
import d61.k0$a;
import com.kuaishou.live.common.core.component.comments.fluency.quick.j;
import java.lang.Object;
import com.kuaishou.live.core.show.delayinfo.LiveQuickCommentConfig;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened;

public final class k implements k0$a	// class@0024c4
{
    public final j a;

    public void k(j p0){
       this.a = p0;
    }
    public final Object get(Object p0){
       k ta = this.a;
       Objects.requireNonNull(ta);
       LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened sCLiveQuickC = PatchProxy.applyOneRefs(p0, ta, j.class, "7");
       if (sCLiveQuickC != PatchProxyResult.class) {
       }else {
          sCLiveQuickC = new LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened();
          sCLiveQuickC.bizId = p0.mBizId;
          sCLiveQuickC.comment = p0.mComments;
          sCLiveQuickC.clickDisappear = p0.mClickDisappear;
          sCLiveQuickC.delayDisplayMs = p0.mDelayDisplayMs;
          sCLiveQuickC.priority = (long)p0.mPriority;
          sCLiveQuickC.displayExpireTimestamp = p0.mDisPlayExpireMs;
          sCLiveQuickC.slideInternalMs = p0.mSlideInternalMs;
       }
       return sCLiveQuickC;
    }
}
