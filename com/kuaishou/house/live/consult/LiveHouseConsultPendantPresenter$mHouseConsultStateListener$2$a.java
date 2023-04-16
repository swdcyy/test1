package com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2$a;
import sg0.b$a;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter;
import com.kuaishou.house.live.consult.HouseConsultPendantMessage;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import xx5.d;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import fq5.b;
import com.kwai.framework.model.feed.BaseFeed;
import og0.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import sr5.a;
import ah0.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import java.util.HashMap;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;
import oy.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sg0.c;
import android.content.Context;
import n3d.a;
import android.view.View;
import rq5.a;
import pq5.c;

public final class LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2$a implements b$a	// class@000775
{
    public final LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2 a;

    public void LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2$a(LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2$a.class, "3")) {
          return;
       }
       LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(objArray, this$0, LiveHouseConsultPendantPresenter.class, "17")) {
          this$0.Y8();
       }
       return;
    }
    public void b(HouseConsultPendantMessage p0){
       LiveHouseConsultPendantPresenter s;
       LiveHouseConsultPendantPresenter s1;
       LiveStreamFeed mTypeViewLis;
       String liveStreamId;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2$a.class, "2")) {
          return;
       }
       a.p(p0, "houseConsultPendantMessage");
       LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       LiveHouseConsultPendantPresenter liveHouseCon = LiveHouseConsultPendantPresenter.class;
       if (!PatchProxy.applyVoidOneRefs(p0, this$0, liveHouseCon, "8")) {
          String str = PatchProxy.applyOneRefs(p0, this$0, liveHouseCon, "13");
          FeedLogCtx uFeedLogCtx = null;
          if (str != PatchProxyResult.class) {
          }else {
             str = p0.getMOpenH5Url();
             d uod = d.a(-734569516);
             s1 = this$0.s;
             if (s1 != null) {
                LiveStreamFeedWrapper liveStreamFe1 = s1.r5();
                if (liveStreamFe1 != null) {
                   liveStreamFe1 = liveStreamFe1.mEntity;
                label_004c :
                   str = uod.tY(str, liveStreamFe1);
                   a.o(str, "routeUrlWithTunaParam");
                   s = this$0.s;
                   if (s != null) {
                      LiveStreamFeedWrapper liveStreamFe2 = s.r5();
                      if (liveStreamFe2 != null) {
                         liveStreamFe2 = liveStreamFe2.mEntity;
                      label_0063 :
                         s1 = this$0.s;
                         String liveStreamId1 = (s1 != null)? s1.getLiveStreamId(): uFeedLogCtx;
                         str = b.a(str, liveStreamFe2, liveStreamId1);
                      }
                   }
                   FeedLogCtx uFeedLogCtx1 = uFeedLogCtx;
                   goto label_0063 ;
                }
             }
             FeedLogCtx uFeedLogCtx2 = uFeedLogCtx;
             goto label_004c ;
          }
          s = this$0.s;
          ClientContent$LiveStreamPackage liveStreamPa = (s != null)? s.a(): uFeedLogCtx;
          s1 = this$0.s;
          BaseFragment uBaseFragmen = (s1 != null)? s1.b(): uFeedLogCtx;
          if (uBaseFragmen != null && liveStreamPa != null) {
             s1 = this$0.w;
             if (s1 != null) {
                uFeedLogCtx = s1.c0();
             }
             if (!PatchProxy.applyVoidFourRefs(p0, liveStreamPa, uBaseFragmen, uFeedLogCtx, null, c.class, "8")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "AUTHOR_CONSULT_PENDANT";
                uElementPack.params = a.a.q(c.a(p0));
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                u1.B(new ClickMetaData().setType(1).setLogPage(uBaseFragmen).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(uFeedLogCtx));
             }
          }
       label_00db :
          a uoa = a.d();
          uoa.c0("audience");
          LiveHouseConsultPendantPresenter s2 = this$0.s;
          if (s2 != null) {
             LiveStreamFeedWrapper liveStreamFe = s2.r5();
             if (liveStreamFe != null) {
                liveStreamFe = liveStreamFe.mEntity;
                if (liveStreamFe != null) {
                   mTypeViewLis = liveStreamFe.mTypeViewList;
                   if (mTypeViewLis != null) {
                   label_00fa :
                      uoa.S(mTypeViewLis);
                      uoa.T("consult");
                      s2 = this$0.s;
                      if (s2 != null) {
                         liveStreamId = s2.getLiveStreamId();
                         if (liveStreamId != null) {
                         label_010f :
                            uoa.R(liveStreamId);
                            uoa.B(c.a(p0));
                            uoa.M(str);
                            uoa.r();
                            QCurrentUser mE = QCurrentUser.ME;
                            a.o(mE, "QCurrentUser.ME");
                            if (!mE.isLogined()) {
                               LoginParams$a uoa1 = new LoginParams$a();
                               uoa1.d(a1.p(R.string.arg_RES_7f103078));
                               d.a(-1712118428).x00(this$0.getActivity(), 0, uoa1.a(), new c(this$0, str));
                            }else {
                               this$0.W8(str);
                            }
                         }
                      }
                      liveStreamId = "";
                      goto label_010f ;
                   }
                }
             }
          }
          mTypeViewLis = new Integer[0];
          goto label_00fa ;
       }
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2$a.class, "1")) {
          return;
       }
       LiveHouseConsultPendantPresenter$mHouseConsultStateListener$2 this$0 = this.a.this$0;
       if (this$0.L == null) {
          LiveHouseConsultPendantPresenter k = this$0.K;
          if (k != null) {
             k.eo(this$0.R);
          }
       }
       return;
    }
}
