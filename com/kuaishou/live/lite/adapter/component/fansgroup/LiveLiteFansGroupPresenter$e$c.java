package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$e$c;
import z1.a;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$e;
import java.lang.String;
import erd.g;
import java.lang.Object;
import com.kuaishou.live.lite.adapter.component.fansgroup.http.LiveLiteFansGroupJoinResponse;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import java.lang.Integer;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.util.Objects;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import l95.c;
import xp5.i;
import k2b.e0;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.System;
import e93.a;
import xp5.g;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMGroupSessionPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import q2b.h$b;
import k2b.u1;

public final class LiveLiteFansGroupPresenter$e$c implements a	// class@001d97
{
    public final LiveLiteFansGroupPresenter$e a;
    public final String b;
    public final long c;
    public final g d;

    public void LiveLiteFansGroupPresenter$e$c(LiveLiteFansGroupPresenter$e p0,String p1,long p2,g p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void accept(Object p0){
       Integer integer;
       Integer integer1;
       Object obj = this;
       LiveLiteFansGroupJoinResponse obj1 = p0;
       LiveLiteFansGroupPresenter liveLiteFans = LiveLiteFansGroupPresenter.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveLiteFansGroupPresenter$e$c.class, "1")) {
       }else {
          LiveLiteFansGroupPresenter k = obj.a.a.K;
          if (obj1 != null) {
             LiveLiteFansGroupJoinResponse mIntimacyInf = obj1.mIntimacyInfo;
             if (mIntimacyInf != null) {
                integer = Integer.valueOf(mIntimacyInf.mLevel);
             label_0029 :
                if (obj1 != null) {
                   LiveLiteFansGroupJoinResponse mIntimacyInf1 = obj1.mIntimacyInfo;
                   if (mIntimacyInf1 != null) {
                      integer1 = Integer.valueOf(mIntimacyInf1.mStatus);
                   label_0037 :
                      k.s(integer, integer1);
                      LiveLiteFansGroupPresenter$e a = obj.a.a;
                      LiveLiteFansGroupPresenter$e$c b = obj.b;
                      Objects.requireNonNull(a);
                      int i = 1;
                      if (!PatchProxy.applyVoidOneRefs(b, a, liveLiteFans, "16") && FansGroupKswitchUtil.b()) {
                         b uob1 = new b(i, "QuickJoin", "REQUEST_JOIN");
                         uob1.g(b);
                         uob1.f(200);
                         c.a(uob1);
                      }
                      a = obj.a.a;
                      e0 page = LiveLiteFansGroupPresenter.d9(a).getPage();
                      a.o(page, "liveLogPackageProvider.page");
                      ClientContent$LiveStreamPackage liveStreamPa = LiveLiteFansGroupPresenter.d9(obj.a.a).a();
                      a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
                      long l = System.currentTimeMillis() - obj.c;
                      LiveLiteFansGroupPresenter$e$c b1 = obj.b;
                      String str = LiveLiteFansGroupPresenter.c9(obj.a.a).d();
                      if (str == null) {
                         str = "";
                      }
                      a.o(str, "liveLiteAudienceInfoMana\x20\x02r.getAnchorUserId\(\) ?: \"\"\x00");
                      obj1 = obj1.mCsLogCorrelateInfo;
                      FeedLogCtx uFeedLogCtx = LiveLiteFansGroupPresenter.d9(obj.a.a).c0();
                      if (PatchProxy.isSupport(liveLiteFans)) {
                         Object[] objArray = new Object[9];
                         objArray[0] = page;
                         objArray[i] = liveStreamPa;
                         objArray[2] = Integer.valueOf(7);
                         objArray[3] = Long.valueOf(l);
                         objArray[4] = b1;
                         objArray[5] = str;
                         objArray[6] = Boolean.TRUE;
                         objArray[7] = obj1;
                         objArray[8] = uFeedLogCtx;
                         if (PatchProxy.applyVoid(objArray, a, liveLiteFans, "14")) {
                         label_0150 :
                            LiveLiteFansGroupPresenter$e$c d = obj.d;
                            if (d != null) {
                               d.accept(null);
                            }
                         }
                      }
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = liveStreamPa;
                      ClientContent$IMGroupSessionPackage iMGroupSessi = new ClientContent$IMGroupSessionPackage();
                      uContentPack.imGroupSessionPackage = iMGroupSessi;
                      iMGroupSessi.ownerId = str;
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      i3 oi3 = i3.f();
                      oi3.d("source", b1);
                      Boolean tRUE = Boolean.TRUE;
                      oi3.a("is_slide", tRUE);
                      oi3.a("is_normal_live", tRUE);
                      oi3.d("red_pack_fans_group_source", "GIFT_PANEL");
                      uElementPack.params = oi3.e();
                      CommonParams uCommonParam = new CommonParams();
                      uCommonParam.mCsLogCorrelateInfo = obj1;
                      ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
                      resultPackag.timeCost = l;
                      uElementPack.action2 = "JOIN_FANS_GROUP";
                      h$b uob = h$b.e(7, "JOIN_FANS_GROUP");
                      uob.k(uElementPack);
                      uob.g(uCommonParam);
                      uob.q(resultPackag);
                      uob.h(uContentPack);
                      uob.l(uFeedLogCtx);
                      u1.p0("2627284", page, uob);
                      goto label_0150 ;
                   }
                }
                integer1 = null;
                goto label_0037 ;
             }
          }
          integer = null;
          goto label_0029 ;
       }
       return;
    }
}
