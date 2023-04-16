package com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter$c;
import com.kuaishou.live.audience.gzone.v2.pendant.b$c;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import m91.b;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import aq5.d;
import fq5.b;
import p91.m;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import rq5.a;
import pq5.c;

public class LiveGzonePendantViewPagerPresenter$c implements b$c	// class@000c38
{
    public final boolean a;
    public final LiveGzonePendantViewPagerPresenter b;

    public void LiveGzonePendantViewPagerPresenter$c(LiveGzonePendantViewPagerPresenter p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       LiveGzonePendantViewPagerPresenter obj = PatchProxy.apply(null, this, LiveGzonePendantViewPagerPresenter$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.z;
       boolean b = true;
       obj = (obj != null && (this.a != null && obj.N().r2(AudienceBizRelation.PK)))? 1: 0;
       d uod = this.b.y.A0();
       AnchorBizRelation vIEW_PAGER_P = (this.b.y.e())? AnchorBizRelation.VIEW_PAGER_PENDANT: AudienceBizRelation.VIEW_PAGER_PENDANT;
       if (!uod.ck(vIEW_PAGER_P) || obj) {
          b = false;
       }
       return b;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveGzonePendantViewPagerPresenter$c.class, "1")) {
          return;
       }
       if (this.b.y.e()) {
          this.b.y.A0().Pj(AnchorBizRelation.VIEW_PAGER_PENDANT);
       }else {
          this.b.y.A0().Pj(AudienceBizRelation.VIEW_PAGER_PENDANT);
       }
       LiveGzonePendantViewPagerPresenter$c tb = this.b;
       if (tb.z != null && this.a != null) {
          tb.A.eo(tb.F);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveGzonePendantViewPagerPresenter$c.class, "2")) {
          return;
       }
       if (this.b.y.e()) {
          this.b.y.A0().yj(AnchorBizRelation.VIEW_PAGER_PENDANT);
       }else {
          this.b.y.A0().yj(AudienceBizRelation.VIEW_PAGER_PENDANT);
       }
       LiveGzonePendantViewPagerPresenter$c tb = this.b;
       if (tb.z != null && this.a != null) {
          tb.A.g9(tb.F);
       }
       return;
    }
}
