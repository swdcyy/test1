package com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.f$a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import java.lang.Object;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeBaseFlipperItemView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeNarrowItemView;
import android.content.Context;
import android.widget.RelativeLayout;
import fa2.t;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeNarrowItemView$a;

public class LiveHourlyRankStrengthNoticeView$a implements f$a	// class@000c35
{
    public final LiveHourlyRankStrengthNoticeView a;

    public void LiveHourlyRankStrengthNoticeView$a(LiveHourlyRankStrengthNoticeView p0){
       this.a = p0;
       super();
    }
    public LiveHourlyRankStrengthNoticeBaseFlipperItemView a(){
       LiveHourlyRankStrengthNoticeNarrowItemView obj = PatchProxy.apply(null, this, LiveHourlyRankStrengthNoticeView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveHourlyRankStrengthNoticeNarrowItemView(this.a.getContext());
       obj.setClickListener(new t(this));
       return obj;
    }
}
