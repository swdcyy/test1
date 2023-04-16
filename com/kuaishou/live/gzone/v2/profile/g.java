package com.kuaishou.live.gzone.v2.profile.g;
import android.content.DialogInterface$OnClickListener;
import com.kuaishou.live.gzone.v2.profile.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kwai.component.misc.report.ReportInfo;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import wj2.n0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import brd.t;
import cg5.c;
import cjd.e;
import erd.o;
import com.kuaishou.live.gzone.v2.profile.i;
import sfc.a;
import erd.g;
import crd.b;
import wkd.b;
import rfc.a;
import e63.g0;

public class g implements DialogInterface$OnClickListener	// class@001cea
{
    public final GifshowActivity b;
    public final e c;

    public void g(e p0,GifshowActivity p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(DialogInterface p0,int p1){
       g tc;
       e p;
       e p1;
       g tb;
       String str2;
       e uoe = e.class;
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, g.class, "1")) {
          return;
       }
       Object[] objArray = null;
       if (p1 == 0x7f10169b) {
          tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, uoe, "60")) {
             p = tc.p;
             if (tc.v != null) {
                ReportInfo reportInfo = new ReportInfo();
                reportInfo.mRefer = p.getUrl();
                reportInfo.mPreRefer = p.U2();
                reportInfo.mSourceType = "live";
                reportInfo.mLiveId = tc.r.getLiveStreamId();
                reportInfo.mVoicePartyId = tc.r.getVoicePartyId();
                reportInfo.mReportedUserId = tc.r.getUserProfile().mProfile.mId;
                reportInfo.mEntrySource = "live_anchor_profile";
                tc.v.a(reportInfo);
                p = tc.y;
                if (p != null) {
                   p.onInformAtMoreDialog(tc.r.getBaseFeed(), tc.r.getUserProfile().mProfile.mId);
                }
             }
          }
       }else {
          int i = 0x7f103078;
          if (p1 == 0x7f104f68) {
             if (!QCurrentUser.me().isLogined()) {
                p1 = this.c.p;
                y.a(p1, p1.getUrl(), "live_profile_feedback_negative", 47, a.a().a().getString(i), this.c.r.getBaseFeed(), null, null, null);
                return;
             }else {
                tc = this.c;
                p = tc.y;
                if (p != null) {
                   p.onFeedbackLiveNegativeAtMoreDialog(tc.r.getBaseFeed(), this.c.r.getUserProfile().mProfile.mId);
                }
                tc = this.c;
                tb = this.b;
                Objects.requireNonNull(tc);
                if (!PatchProxy.applyVoidOneRefs(tb, tc, uoe, "28")) {
                   String str = "feedback_live_negative";
                   int i1 = 1;
                   if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(str, Integer.valueOf(i1), tc, uoe, "31")) {
                      BaseFeed baseFeed = tc.r.getBaseFeed();
                      ClientContent$PhotoPackage photoPackage = w1.g(baseFeed, r1.y1(baseFeed));
                      photoPackage.type = 2;
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.name = str;
                      uElementPack.type = 5;
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.photoPackage = photoPackage;
                      u1.u(i1, uElementPack, uContentPack);
                   }
                   String str1 = (tc.r.getBaseFeed() != null)? r1.M0(tc.r.getBaseFeed()): objArray;
                   if (tc.r.getBaseFeed() != null) {
                      objArray = r1.I1(tc.r.getBaseFeed());
                   }
                   c.f(tc.r.getLiveStreamId(), 1, 1, tb.getUrl(), str1, objArray, null, null, r1.O0(tc.r.getBaseFeed())).map(new e()).subscribe(new i(tc), new a());
                }
             }
          }else if(p1 == 0x7f100103){
             if (!QCurrentUser.me().isLogined()) {
                p1 = this.c.p;
                y.a(p1, p1.getUrl(), "live_profile_blacklist", 46, a.a().a().getString(i), this.c.r.getBaseFeed(), null, null, null);
                return;
             }else {
                tc = this.c;
                p = tc.y;
                if (p != null) {
                   p.onPullToBlacklist(tc.r.getBaseFeed(), this.c.r.getUserProfile().mProfile.mId);
                }
                tc = this.c;
                tb = this.b;
                Objects.requireNonNull(tc);
                if (!PatchProxy.applyVoidOneRefs(tb, tc, uoe, "53")) {
                   if (tb != null) {
                      objArray = tb.getUrl();
                      str2 = tb.U2();
                   }else {
                      str2 = objArray;
                   }
                   b.a(0x4a533fa).a(QCurrentUser.me().getId(), tc.r.getUserProfile().mProfile.mId, objArray, str2).map(new e()).subscribe(new g0(tc), new a(tb));
                }
             }
          }else if(p1 == 0x7f104f05){
             this.c.Y8();
          }
       }
       return;
    }
}
