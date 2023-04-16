package com.kuaishou.live.ad.fanstop.LiveAudienceAdAutoOpenShopCartPresenter$a;
import ks3.r$b;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdAutoOpenShopCartPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;

public final class LiveAudienceAdAutoOpenShopCartPresenter$a implements r$b	// class@000950
{
    public final LiveAudienceAdAutoOpenShopCartPresenter a;

    public void LiveAudienceAdAutoOpenShopCartPresenter$a(LiveAudienceAdAutoOpenShopCartPresenter p0){
       this.a = p0;
       super();
    }
    public final void a(int p0){
       LiveAudienceAdAutoOpenShopCartPresenter$a uoa = LiveAudienceAdAutoOpenShopCartPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (!p0 && this.a.P8()) {
          this.a.R8(true);
          LiveAudienceAdAutoOpenShopCartPresenter p = this.a.p;
          if (p != null) {
             p.mOpenPanelType = 0;
          }
       }
       return;
    }
}
