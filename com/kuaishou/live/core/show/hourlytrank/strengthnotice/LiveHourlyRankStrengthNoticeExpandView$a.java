package com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView$a;
import ekd.f$j;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ga2.a;

public class LiveHourlyRankStrengthNoticeExpandView$a extends f$j	// class@000c30
{
    public final LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank a;
    public final LiveHourlyRankStrengthNoticeExpandView b;

    public void LiveHourlyRankStrengthNoticeExpandView$a(LiveHourlyRankStrengthNoticeExpandView p0,LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankStrengthNoticeExpandView$a.class, "1")) {
          return;
       }
       this.b.O.a(2, this.a);
       return;
    }
}
