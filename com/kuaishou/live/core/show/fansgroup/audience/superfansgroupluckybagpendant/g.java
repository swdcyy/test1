package com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.g;
import com.yxcorp.gifshow.widget.m;
import i82.t;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.LiveAudienceSuperFansGroupLuckyBagPendantViewModel;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent;
import java.util.Objects;
import java.lang.Enum;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import i82.b;
import i82.u;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import i82.y;
import g82.r0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import java.lang.Runnable;
import d61.y;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;

public class g extends m	// class@000b36
{
    public final LiveAudienceSuperFansGroupLuckyBagPendantViewModel c;
    public final t d;

    public void g(t p0,LiveAudienceSuperFansGroupLuckyBagPendantViewModel p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, str)) {
          return;
       }
       g tc = this.c;
       LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent iNTENT_OPEN_ = LiveAudienceSuperFansGroupLuckyBagPendantViewModel$LuckyBagPendantItemIntent.INTENT_OPEN_LUCKY_BAG_DETAIL_PAGE;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(iNTENT_OPEN_, tc, LiveAudienceSuperFansGroupLuckyBagPendantViewModel.class, "2") && TextUtils.n(iNTENT_OPEN_.getIntent(), iNTENT_OPEN_.name())) {
          LiveAudienceSuperFansGroupLuckyBagPendantViewModel a = tc.a;
          Objects.requireNonNull(a);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, a, m.class, str)) {
             ClientContent$LiveStreamPackage liveStreamPa = a.f.a();
             if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, u.class, "2")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "LIVE_LUCKY_BAG_PENDANT";
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                u1.u(1, uElementPack, uContentPack);
             }
             y oy = new y(a);
             if (r0.a()) {
                y.a(a.f.c(), oy, a, 400);
             }else {
                oy.run();
             }
             b.c0(LiveLogTag.LIVE_SUPER_FANS_GROUP_PENDANT, "opeLuckyBagDetailPage", "watchSecond", Integer.valueOf(a.c()));
          }
       }
       return;
    }
}
