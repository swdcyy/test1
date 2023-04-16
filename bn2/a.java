package bn2.a;
import erd.g;
import bn2.b;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kwai.feature.api.live.base.model.LiveActivityTaskInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import cn2.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import java.util.Map;
import va1.s0;
import java.lang.System;
import pm8.a;
import com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter$b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class a implements g	// class@000418
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       p0 = String.valueOf(tb.L.mLiveActivityTaskInfo.mTaskToken);
       LiveActivityTaskInfo mTaskBackUrl = tb.L.mLiveActivityTaskInfo.mTaskBackUrl;
       if (PatchProxy.applyVoidTwoRefs(p0, mTaskBackUrl, tb, b.class, "5")) {
       }else {
          String str = i.d(tb.K.c.mEntity);
          if (!TextUtils.x(str)) {
             HashMap hashMap = new HashMap();
             hashMap.put("taskcode", p0);
             hashMap.put("taskbackurl", mTaskBackUrl);
             hashMap.put("wishhallfrom", "10");
             p0 = i.b();
             if (!TextUtils.x(p0)) {
                hashMap.put("location", p0);
             }
             a.J1(System.currentTimeMillis());
             tb.M.a(s0.a(str, hashMap), false);
             b.P(LiveLogTag.LIVE_WISH_ROOM.appendTag("LiveAudienceWishRoomTaskPresenter"), "ShowWishHallWithTask");
          }
       }
       return;
    }
}
