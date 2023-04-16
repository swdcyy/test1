package com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter$a;
import mq5.h;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveHourlyRankListDialogPresenter$a implements h	// class@000c22
{
    public final LiveHourlyRankListDialogPresenter b;

    public void LiveHourlyRankListDialogPresenter$a(LiveHourlyRankListDialogPresenter p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankListDialogPresenter$a.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
}
