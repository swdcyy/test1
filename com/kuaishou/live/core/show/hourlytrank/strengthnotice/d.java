package com.kuaishou.live.core.show.hourlytrank.strengthnotice.d;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeNarrowItemView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeNarrowItemView$a;

public class d extends m	// class@000c46
{
    public final LiveHourlyRankStrengthNoticeNarrowItemView c;

    public void d(LiveHourlyRankStrengthNoticeNarrowItemView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       d tc = this.c;
       LiveHourlyRankStrengthNoticeNarrowItemView f = tc.f;
       if (f != null) {
          f.a(tc.g);
       }
       return;
    }
}
