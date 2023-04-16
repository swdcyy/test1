package com.kuaishou.live.core.show.hourlytrank.strengthnotice.c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeBaseFlipperItemView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.f;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandItemView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView$b;

public class c extends m	// class@000c45
{
    public final LiveHourlyRankStrengthNoticeExpandView c;

    public void c(LiveHourlyRankStrengthNoticeExpandView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c tc = this.c;
       if (tc.L != null && (tc.K.a() instanceof LiveHourlyRankStrengthNoticeExpandItemView && !this.c.F.getVisibility())) {
          tc = this.c;
          tc.L.a(tc.K.a().getExtraInfo());
       }
    label_0038 :
       return;
    }
}
