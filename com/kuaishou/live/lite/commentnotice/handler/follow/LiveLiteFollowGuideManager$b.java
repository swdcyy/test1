package com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideManager$b;
import qa3.a;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideManager;
import java.lang.Object;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse$LiveLiteFollowGuideConfig;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler;

public final class LiveLiteFollowGuideManager$b implements a	// class@000864
{
    public final LiveLiteFollowGuideManager a;

    public void LiveLiteFollowGuideManager$b(LiveLiteFollowGuideManager p0){
       this.a = p0;
       super();
    }
    public final void a(LiveLiteDelayInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFollowGuideManager$b.class, "1")) {
          return;
       }
       a.p(p0, "liveLiteDelayInfoResponse");
       LiveLiteDelayInfoResponse mLiveLiteFol = p0.mLiveLiteFollowGuideConfig;
       if (mLiveLiteFol != null) {
          Iterator iterator = mLiveLiteFol.iterator();
          while (iterator.hasNext()) {
             LiveLiteDelayInfoResponse$LiveLiteFollowGuideConfig liveLiteFoll = iterator.next();
             LiveLiteLogTag lIVE_FOLLOW_ = LiveLiteLogTag.LIVE_FOLLOW_GUIDE;
             lIVE_FOLLOW_.appendTag("LiveLiteFollowGuideManager");
             LiveLiteLogTag liveLiteLogT = lIVE_FOLLOW_;
             b.T(liveLiteLogT, "delayInfoListener", "commonGuideSubBizType", liveLiteFoll.mCommonGuideSubBizType, "bizId", Integer.valueOf(liveLiteFoll.mBizId));
             LiveLiteBaseFollowGuideNoticeHandler liveLiteBase = this.a.c().get(Integer.valueOf(liveLiteFoll.mBizId));
             if (liveLiteBase != null) {
                a.o(liveLiteFoll, "it");
                liveLiteBase.d(liveLiteFoll, p0.mFrequencyConfigs);
             }
          }
       }
       return;
    }
}
