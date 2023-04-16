package com.kuaishou.live.audience.component.push.LiveAudienceBottomBarPushPresenter$a;
import aq5.b;
import com.kuaishou.live.audience.component.push.LiveAudienceBottomBarPushPresenter;
import java.lang.Object;
import aq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;

public class LiveAudienceBottomBarPushPresenter$a implements b	// class@000bc2
{
    public final LiveAudienceBottomBarPushPresenter b;

    public void LiveAudienceBottomBarPushPresenter$a(LiveAudienceBottomBarPushPresenter p0){
       this.b = p0;
       super();
    }
    public void e6(a p0,boolean p1){
       LiveAudienceBottomBarPushPresenter$a uoa = LiveAudienceBottomBarPushPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       AudienceBizRelation vOICE_PARTY = AudienceBizRelation.VOICE_PARTY;
       if (p0 == vOICE_PARTY && !p1) {
          LiveAudienceBottomBarPushPresenter$a tb = this.b;
          tb.p = null;
          tb.S8();
          return;
       }else if(p1){
          p1.p = p0;
       }else {
          p0.p = vOICE_PARTY;
       }
       this.b.S8();
       return;
    }
}
