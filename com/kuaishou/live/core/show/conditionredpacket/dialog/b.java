package com.kuaishou.live.core.show.conditionredpacket.dialog.b;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.dialog.c;
import com.kwai.framework.model.user.User;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import wkd.b;
import ad5.a;
import w91.a;
import lp3.c;
import lp3.i;
import java.util.Map;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p91.m;
import t02.a0;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.common.core.component.recharge.d;
import lnc.a1;
import java.lang.CharSequence;
import z12.x;
import java.lang.Long;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import java.util.HashMap;
import l95.c;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig;
import x52.g;
import com.google.gson.JsonElement;
import com.kuaishou.live.core.show.conditionredpacket.dialog.a;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig;
import brd.t;
import kg1.e;
import x52.e;
import crd.b;

public final class b implements g	// class@000a70
{
    public final c b;
    public final User c;
    public final String d;
    public final long e;

    public void b(c p0,User p1,String p2,long p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       g og;
       b uob = this;
       b b = uob.b;
       b d = uob.d;
       b e = uob.e;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       f.m(uob.c, User$FollowStatus.FOLLOWING);
       c obj = PatchProxy.applyOneRefs(d, b, uoc, "5");
       boolean b1 = false;
       int i = 1;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          int i1 = 0x4c90014d;
          long l = b.a(i1).q();
          if (l - (long)b.R < 0) {
             d.e("LIVE_ROOM_JOIN_FANS_GROUP", b.getActivity(), b.L.getLiveStreamId(), b.L.d(), ((long)b.R - b.a(i1).q()), b.K.p, b.L.i(), b.M.a(a.class).d6());
             x.H(a1.p(R.string.arg_RES_7f101c45));
             if (PatchProxy.isSupport(uoc) && (!PatchProxy.applyVoidTwoRefs(Long.valueOf(l), d, b, uoc, "20") && FansGroupKswitchUtil.b())) {
                b uob1 = new b(b1, "JoinDialog", "REQUEST_JOIN");
                uob1.g(d);
                uob1.f(404);
                uob1.c("lack coin");
                HashMap hashMap = new HashMap();
                hashMap.put("need", String.valueOf(b.R));
                hashMap.put("currKcoin", String.valueOf(l));
                uob1.d(hashMap);
                c.a(uob1);
             }
             b1 = true;
          }
       }
       if (b1) {
          b.a9();
       }else if(PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Long.valueOf(e), d, b, uoc, "6")){
          obj = b.S;
          JsonElement jsonElement = null;
          LiveConfigStartupResponse$LiveFansGroupConfig mLiveFansGro = (obj != null)? obj.mLiveFansGroupFlashJoinConfig: jsonElement;
          if (PatchProxy.isSupport(uoc)) {
             og = PatchProxy.applyTwoRefs(Long.valueOf(e), d, b, uoc, "9");
             if (og != patchProxyRe) {
             label_0113 :
                b.c9(i, 0, jsonElement);
                b.X7(b.K.r1.kj(b.U, mLiveFansGro, k0.a(b.S, a.a).or(Integer.valueOf(i)).intValue()).subscribe(new e(b, e, d), og));
             }
          }
          og = new g(b, e, d);
          goto label_0113 ;
       }
       return;
    }
}
