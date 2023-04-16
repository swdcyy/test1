package com.kuaishou.live.core.show.hourlytrank.d;
import com.kuaishou.live.core.show.hourlytrank.LiveNormalRankNoticeViewV2$a;
import com.kuaishou.live.core.show.hourlytrank.c;
import com.kuaishou.livestream.message.nano.TopDistrictRank;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ba2.i;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import k2b.u1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.live.service.show.hourlytrank.ranklist.LiveHourlyRankType;
import ba2.v;
import jt5.b;
import java.lang.Integer;
import xp5.g;

public class d implements LiveNormalRankNoticeViewV2$a	// class@000c02
{
    public final TopDistrictRank a;
    public final c b;

    public void d(c p0,TopDistrictRank p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       e0 page = this.b.z.getPage();
       ClientContent$LiveStreamPackage liveStreamPa = this.b.z.a();
       TopDistrictRank descriptionV = this.a.descriptionV2;
       if (!PatchProxy.applyVoidThreeRefs(page, liveStreamPa, descriptionV, null, i.class, "14")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          i3 oi3 = i3.f();
          oi3.d("notification_name", descriptionV);
          uElementPack.params = oi3.e();
          uElementPack.action2 = "LIVE_COMMON_NOTIFICATION_SHOW";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
          ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
          moreInfoPack.name = "hour_rank_pk_notice";
          uContentWrap.moreInfoPackage = moreInfoPack;
          u1.D0("", page, 9, uElementPack, uContentPack, uContentWrap);
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          e0 page = this.b.z.getPage();
          ClientContent$LiveStreamPackage liveStreamPa = this.b.z.a();
          if (!PatchProxy.applyVoidThreeRefs(page, liveStreamPa, p0, null, i.class, "15")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             i3 oi3 = i3.f();
             oi3.d("notification_name", p0);
             uElementPack.params = oi3.e();
             uElementPack.action2 = "LIVE_COMMON_NOTIFICATION_CLICK";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
             ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
             moreInfoPack.name = "hour_rank_pk_notice";
             uContentWrap.moreInfoPackage = moreInfoPack;
             u1.M("", page, 1, uElementPack, uContentPack, uContentWrap);
          }
       }
       c s = this.b.s;
       if (s != null) {
          s.a(v.d(this.a.jumpToTab), "PK_INVITE_NOTICE");
       }
       return;
    }
    public void c(int p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), p3, this, d.class, "3")) {
          return;
       }
       i.f(this.b.A.d(), this.b.A.getLiveStreamId(), p0, p1, p2, p3);
       return;
    }
}
