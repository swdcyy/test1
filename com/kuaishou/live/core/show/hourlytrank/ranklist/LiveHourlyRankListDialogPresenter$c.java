package com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter$c;
import xq5.c;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class LiveHourlyRankListDialogPresenter$c implements c	// class@000c24
{
    public final LiveHourlyRankListDialogPresenter b;

    public void LiveHourlyRankListDialogPresenter$c(LiveHourlyRankListDialogPresenter p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankListDialogPresenter$c.class, "1")) {
          return;
       }
       x.E(this.b.H);
       this.b.P8();
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       b.b(this);
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
