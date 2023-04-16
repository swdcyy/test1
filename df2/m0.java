package df2.m0;
import a51.c;
import db1.b;
import df2.m0$a;
import java.lang.String;
import com.yxcorp.retrofit.model.ActionResponse;
import u07.t;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.DialogInterface;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserInfo;
import zic.f;
import java.lang.Object;
import android.app.Activity;
import java.lang.CharSequence;
import e17.i;
import bb1.n;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import df2.d0;
import sfc.a;
import android.content.Context;
import erd.g;
import crd.b;
import cb1.b;
import cb1.c;
import brd.t;
import brd.x;
import cjd.e;
import erd.o;
import df2.r;
import df2.e0;
import df2.s;
import com.kuaishou.live.core.show.profilecard.b;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import tl8.d;
import mxb.j0;
import mxb.i0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wj2.r;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import bb1.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import k2b.u1;
import bb1.b;
import java.util.List;
import bb1.a;
import db1.a;
import b61.b;
import u07.t$a;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import df2.m;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.j;
import df2.n;
import com.yxcorp.utility.TextUtils;
import df2.h;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import android.widget.ImageView;
import java.util.Objects;
import ne2.k;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import o02.f;
import o02.e;
import df2.z;
import df2.q;
import erd.a;
import df2.c0;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import cg5.c;
import df2.a0;
import df2.j;
import df2.u;
import df2.x;
import com.kwai.component.misc.report.ReportInfo;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.n0;
import java.lang.Integer;
import ok.k;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;
import java.util.Iterator;
import android.widget.TextView;
import df2.g;
import android.view.View$OnClickListener;
import lnc.a1;
import df2.d;
import java.lang.Enum;
import df2.v;
import df2.y;
import hy2.c;
import java.util.ArrayList;
import tkd.b;
import tkd.d;
import fs3.g;
import mz6.b$d;
import oz1.b;
import java.lang.Boolean;
import tg3.c$b;
import hs5.a;
import mz6.b;
import df2.a;
import android.content.DialogInterface$OnCancelListener;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import df2.b;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import tx1.d;
import df2.g0;
import df2.f0;
import df2.i0;
import com.kwai.framework.model.user.UserExtraInfo;
import androidx.lifecycle.MutableLiveData;
import wkd.b;
import rfc.a;
import df2.t;
import df2.p;
import java.lang.Throwable;
import wj2.l0;
import ekd.m1;
import df2.c;
import df2.f;
import df2.e;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$AssistantConfig;
import java.lang.reflect.Type;
import s81.a;
import df2.k;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zf6.l;
import android.content.res.Resources;
import cf2.c;
import df2.o;

public class m0 extends c	// class@0024fd
{
    public User A;
    public LivePlayLogger B;
    public n0 C;
    public d D;
    public View E;
    public ImageView F;
    public TextView G;
    public View H;
    public TextView I;
    public boolean J;
    public a K;
    public final b L;
    public b M;
    public c$b N;
    public d O;
    public r v;
    public GifshowActivity w;
    public LiveProfileParams x;
    public LiveProfileMode y;
    public k z;
    public static String sLivePresenterClassName = "LiveProfileMoreOperationPresenter";

    public void m0(){
       super();
       this.L = new b();
       this.O = new m0$a(this);
    }
    public static void S8(m0 p0,String p1,ActionResponse p2){
       p0.s9(p1, p2);
    }
    public static void V8(m0 p0,t p1,View p2){
       p0.x9(p1, p2);
    }
    public static void W8(m0 p0,String p1,t p2,View p3){
       p0.u9(p1, p2, p3);
    }
    public static void X8(m0 p0,GifshowActivity p1,DialogInterface p2,int p3){
       p0.y9(p1, p2, p3);
    }
    public static void Y8(m0 p0,t p1,View p2){
       p0.t9(p1, p2);
    }
    private void s9(String p0,ActionResponse p1){
       f.e(this.x.getUserProfile().mProfile.mId, 0, this.w.Q2(), 0);
       Object[] objArray = new Object[]{p0};
       i.d(R.style.arg_RES_7f11066a, this.w.getString(R.string.arg_RES_7f104d3b, objArray));
       n.c(1681, this.x.getUserProfile().mProfile.mId, this.x.getLiveStreamId());
       if (this.x.getOriginUserAssPrivilege().mKickUser != null) {
          b.c(this.x.getLiveStreamId(), this.x.getUserProfile().mProfile.mId, new d0(this, p0), new a(this.w));
       }
       return;
    }
    private void t9(t p0,View p1){
       b.b().a(this.x.getLiveStreamId(), this.x.getUserProfile().mProfile.mId).compose(this.P8()).map(new e()).subscribe(new r(this), new a(this.w));
    }
    private void u9(String p0,t p1,View p2){
       b.c(this.x.getLiveStreamId(), this.x.getUserProfile().mProfile.mId, new e0(p0), new a(this.w));
    }
    private void x9(t p0,View p1){
       b.b().b(this.x.getLiveStreamId(), this.x.getUserProfile().mProfile.mId).compose(this.P8()).map(new e()).subscribe(new s(this), b.f("permitComment failed"));
    }
    private void y9(GifshowActivity p0,DialogInterface p1,int p2){
       m0 tw;
       m0 tB;
       if (p2 == 0x7f10169b) {
          this.K9();
       }else {
          int i = 0x7f103078;
          if (p2 == 0x7f104f68) {
             if (!QCurrentUser.me().isLogined()) {
                tw = this.w;
                y.a(tw, tw.getUrl(), "live_profile_feedback_negative", 47, a.a().a().getString(i), this.x.getBaseFeed(), null, null, null);
                return;
             }else {
                tB = this.B;
                if (tB != null) {
                   tB.onFeedbackLiveNegativeAtMoreDialog(this.x.getBaseFeed(), this.x.getUserProfile().mProfile.mId);
                }
                this.F9(p0);
             }
          }else if(p2 == 0x7f100103){
             if (!QCurrentUser.me().isLogined()) {
                tw = this.w;
                y.a(tw, tw.getUrl(), "live_profile_blacklist", 46, a.a().a().getString(i), this.x.getBaseFeed(), null, null, null);
                return;
             }else {
                tB = this.B;
                if (tB != null) {
                   tB.onPullToBlacklist(this.x.getBaseFeed(), this.x.getUserProfile().mProfile.mId);
                }
                this.a9(p0);
                BaseFeed baseFeed = this.x.getBaseFeed();
                if (baseFeed != null && baseFeed.get("AD") != null) {
                   i0.a().e(753, this.x.getBaseFeed()).a();
                }
             }
          }else if(p2 == 0x7f104f05){
             this.V9();
          }
       }
       return;
    }
    public final void B9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m0.class, "49")) {
          return;
       }
       int i = 1;
       if (this.v.m == LiveProfileMode.ANCHOR_VIEW_AUDIENCE) {
          UserProfile mProfile = this.x.getUserProfile().mProfile;
          ClientContent$LiveStreamPackage liveStreamPa = this.m9();
          if (!PatchProxy.applyVoidTwoRefs(mProfile, liveStreamPa, objArray, f.class, "6")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PERSONAL_CARD_MANAGE_BUTTON";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             uContentPack.userPackage = f.a(mProfile);
             u1.u(i, uElementPack, uContentPack);
          }
       }else {
          List list = this.K.x8("profile_page", this.M);
          int i1 = 0;
          if (list.size() == i) {
             f.c(this.x.getUserProfile().mProfile, this.h9(), list.get(i1).b(), this.m9());
          }else {
             f.c(this.x.getUserProfile().mProfile, this.h9(), i1, this.m9());
          }
       }
       return;
    }
    public final void C9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "30")) {
          return;
       }
       String str = b.c(this.x.getUserProfile().mProfile);
       t$a uoa = new t$a(this.w);
       m0 tw = this.w;
       int i = (this.x.getTargetUserAssType() == LiveApiParams$AssistantType.ADMIN)? 0x7f101ff6: 0x7f101fec;
       Object[] objArray = new Object[]{str};
       uoa.X0(tw.getString(i, objArray));
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.Q0(R.string.cancel);
       uoa.u0(new m(this));
       uoa.v(1);
       j.d(uoa);
       return;
    }
    public final void D9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "31")) {
          return;
       }
       String str = b.c(this.x.getUserProfile().mProfile);
       t$a uoa = new t$a(this.w);
       m0 tw = this.w;
       int i = (this.x.getTargetUserAssType() == LiveApiParams$AssistantType.SUPER_ADMIN)? 0x7f101ff7: 0x7f101fed;
       Object[] objArray = new Object[]{str};
       uoa.X0(tw.getString(i, objArray));
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.Q0(R.string.cancel);
       uoa.u0(new n(this));
       uoa.v(1);
       j.d(uoa);
       return;
    }
    public void E8(){
       m0 tv;
       m0 om0 = m0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om0, "5")) {
          return;
       }
       super.E8();
       boolean b = TextUtils.n(QCurrentUser.me().getId(), this.x.getUserProfile().mProfile.mId);
       if (this.o9()) {
          tv = this.v;
          tv.o.observe(tv.e, new h(this));
       }else if(b){
          this.F.setVisibility(8);
       }else {
          this.F.setVisibility(0);
          tv = this.z;
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoid(objArray, tv, k.class, "6")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PERSONAL_CARD_MORE";
             u1.u0(9, uElementPack, tv.a());
          }
       }
       if (b || (!PatchProxy.applyVoid(objArray, this, om0, "11") && (this.x.getOriginUserAssType() == LiveApiParams$AssistantType.PUSHER || this.x.getOriginUserAssPrivilege().mForbidComment != null))) {
          b.Z(LiveLogTag.LIVE_PROFILE, "refreshForbidCommentStatus start");
          e.a().j0(this.x.getLiveStreamId(), this.x.getUserProfile().mProfile.mId).compose(this.P8()).map(new e()).subscribe(new z(this), b.f("refreshForbidCommentStatus failed"), new q(this));
       }
    label_00ce :
       return;
    }
    public void E9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "10")) {
          return;
       }
       String str = b.c(this.x.getUserProfile().mProfile);
       int i = 0;
       f.e(this.x.getUserProfile().mProfile.mId, i, this.w.Q2(), i);
       Object[] objArray = new Object[]{str};
       i.d(R.style.arg_RES_7f11066a, this.w.getString(R.string.arg_RES_7f104d3b, objArray));
       if (this.x.getOriginUserAssPrivilege().mKickUser != null) {
          b.c(this.x.getLiveStreamId(), this.x.getUserProfile().mProfile.mId, new c0(this, str), new a(this.w));
       }
       return;
    }
    public final void F9(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "37")) {
          return;
       }
       m0 tx = this.x;
       String str = null;
       if (!PatchProxy.applyVoidOneRefs(tx, str, k.class, "30")) {
          BaseFeed baseFeed = tx.getBaseFeed();
          ClientContent$PhotoPackage photoPackage = w1.g(baseFeed, r1.y1(baseFeed));
          photoPackage.type = 2;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = photoPackage;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.name = "feedback_live_negative";
          uElementPack.type = 5;
          u1.u(1, uElementPack, uContentPack);
       }
       String str1 = (this.x.getBaseFeed() != null)? r1.M0(this.x.getBaseFeed()): str;
       if (this.x.getBaseFeed() != null) {
          str = r1.I1(this.x.getBaseFeed());
       }
       c.f(this.x.getLiveStreamId(), 1, 1, p0.getUrl(), str1, str, null, null, r1.O0(this.x.getBaseFeed())).map(new e()).compose(this.P8()).subscribe(new a0(this), new a());
       return;
    }
    public final void G9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "33")) {
          return;
       }
       t$a uoa = new t$a(this.w);
       Object[] objArray = new Object[]{b.c(this.x.getUserProfile().mProfile)};
       uoa.X0(this.w.getString(R.string.arg_RES_7f101ffa, objArray));
       uoa.y0(R.string.arg_RES_7f1028b0);
       uoa.S0(R.string.arg_RES_7f101ff5);
       uoa.Q0(R.string.arg_RES_7f101f00);
       uoa.u0(new j(this));
       uoa.v(1);
       j.d(uoa);
       return;
    }
    public final void H9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "40")) {
          return;
       }
       b.b().d(this.x.getUserProfile().mProfile.mId, this.x.getLiveStreamId(), true).compose(this.P8()).map(new e()).subscribe(new u(this), new a(this.w));
       return;
    }
    public final void I9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "42")) {
          return;
       }
       b.b().d(this.x.getUserProfile().mProfile.mId, this.x.getLiveStreamId(), true).compose(this.P8()).map(new e()).subscribe(new x(this), new a(this.w));
       return;
    }
    public final void J9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "26")) {
          return;
       }
       if (this.C != null) {
          ReportInfo reportInfo = new ReportInfo();
          reportInfo.mRefer = this.w.getUrl();
          reportInfo.mPreRefer = this.w.U2();
          reportInfo.mLiveId = this.x.getLiveStreamId();
          reportInfo.mVoicePartyId = this.x.getVoicePartyId();
          int clickType = this.x.getClickType();
          if (this.x.isLiveChatGuest() || clickType == LiveStreamClickType.VOICE_PARTY.getValue()) {
             reportInfo.mSourceType = "live_guest";
             reportInfo.mEntrySource = this.n9("live_audience_profile");
          }else if(clickType == LiveStreamClickType.LIVE_PK_PEER.getValue() || (clickType == LiveStreamClickType.LIVE_CHAT_BETWEEN_ANCHORS.getValue() && !TextUtils.x(this.x.getOpponentLiveStreamId()))){
             reportInfo.mLiveId = this.x.getOpponentLiveStreamId();
             reportInfo.mSourceType = "live";
             reportInfo.mEntrySource = this.n9("live_anchor_profile");
          }else if(clickType == LiveStreamClickType.LIVE_LINE.getValue()){
             reportInfo.mSourceType = "live";
             reportInfo.mEntrySource = this.n9("live_anchor_profile");
          }else {
             reportInfo.mSourceType = "audience";
             reportInfo.mEntrySource = this.n9("live_audience_profile");
          }
          reportInfo.mReportedUserId = this.x.getUserProfile().mProfile.mId;
          this.C.a(reportInfo);
          m0 tB = this.B;
          if (tB != null) {
             tB.onInformAtMoreDialog(this.x.getBaseFeed(), this.x.getUserProfile().mProfile.mId);
          }
       }
       return;
    }
    public final void K9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "36")) {
          return;
       }
       m0 tw = this.w;
       if (this.C != null) {
          ReportInfo reportInfo = new ReportInfo();
          reportInfo.mRefer = tw.getUrl();
          reportInfo.mPreRefer = tw.U2();
          reportInfo.mSourceType = "live";
          reportInfo.mLiveId = this.x.getLiveStreamId();
          reportInfo.mVoicePartyId = this.x.getVoicePartyId();
          reportInfo.mReportedUserId = this.x.getUserProfile().mProfile.mId;
          reportInfo.mEntrySource = this.n9("live_anchor_profile");
          this.C.a(reportInfo);
       }
       return;
    }
    public final void L9(int p0,String p1,String p2){
       if (PatchProxy.isSupport(m0.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, m0.class, "7")) {
          return;
       }
       if (k.a(p1, p2)) {
          return;
       }
       UserProfile mProfile = this.x.getUserProfile().mProfile;
       p2 = this.h9();
       ClientContent$LiveStreamPackage liveStreamPa = this.m9();
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidFourRefs(mProfile, p2, Integer.valueOf(p0), liveStreamPa, null, f.class, "13")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PERSONAL_CARD_MANAGE_BUTTON";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("administrator_type", p2);
          jsonObject.a0("btn_type", Integer.valueOf(p0));
          uElementPack.params = jsonObject.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          uContentPack.userPackage = f.a(mProfile);
          u1.u0(9, uElementPack, uContentPack);
       }
       return;
    }
    public final void M9(){
       StringBuilder str;
       m0 om0 = m0.class;
       if (PatchProxy.applyVoid(null, this, om0, "6")) {
          return;
       }
       if (this.x.getOriginUserAssType() == LiveApiParams$AssistantType.PUSHER) {
          return;
       }
       boolean b = TextUtils.n(QCurrentUser.me().getId(), this.x.getUserProfile().mProfile.mId);
       List list = this.K.x8("profile_page", this.M);
       if (!PatchProxy.applyVoidOneRefs(list, this, om0, "9")) {
          if (q.f(list)) {
             b.B(LiveLogTag.LIVE_ADMIN, "admin size is 0.");
          }else {
             str = "admin list:";
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                str = str+uoa.b()+" "+uoa.a()+", ";
             }
             b.Z(LiveLogTag.LIVE_ADMIN, str);
          }
       }
       str = this.I.getText().toString();
       if (b) {
          this.E.setVisibility(8);
       }else {
          int i = 0;
          if (q.f(list)) {
             this.E.setVisibility(i);
             this.G.setVisibility(i);
          }else if(list.size() == 1){
             this.E.setVisibility(i);
             this.G.setVisibility(i);
             this.H.setVisibility(i);
             this.I.setVisibility(i);
             a d = list.get(i).d;
             this.I.setText(d);
             this.L9(list.get(i).b(), str, d);
             this.I.setOnClickListener(new g(this, list));
          }else {
             this.E.setVisibility(i);
             this.G.setVisibility(i);
             this.H.setVisibility(i);
             this.I.setVisibility(i);
             String str1 = a1.p(R.string.arg_RES_7f102a8a);
             this.I.setText(str1);
             this.I.setOnClickListener(new d(this));
             this.L9(i, str, str1);
          }
       }
       return;
    }
    public final void O9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "41")) {
          return;
       }
       b.b().f(this.x.getUserProfile().mProfile.mId, LiveApiParams$AssistantType.ADMIN.ordinal(), this.x.getLiveStreamId(), true).compose(this.P8()).map(new e()).subscribe(new v(this), new a(this.w));
       return;
    }
    public final void Q9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "43")) {
          return;
       }
       b.b().f(this.x.getUserProfile().mProfile.mId, LiveApiParams$AssistantType.SUPER_ADMIN.ordinal(), this.x.getLiveStreamId(), true).map(new e()).compose(this.P8()).subscribe(new y(this), new a(this.w));
       return;
    }
    public final void R9(){
       String voicePartyId;
       ClientEvent$ElementPackage uElementPack1;
       JsonObject jsonObject;
       ClientContent$ContentPackage uContentPack1;
       ClientContentWrapper$ContentWrapper uContentWrap1;
       List list;
       Iterator iterator;
       a uoa;
       b$d uod;
       boolean b;
       m0 om0 = m0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om0, "18")) {
          return;
       }
       m0 tw = this.w;
       if (this.y == LiveProfileMode.ESCROW_VIEW_AUDIENCE) {
          this.T9(tw);
       }else if(PatchProxy.applyVoid(objArray, this, om0, "19")){
          c uoc = new c(this.w);
          ArrayList uArrayList = new ArrayList();
          if (!PatchProxy.applyVoidOneRefs(uArrayList, this, om0, "20")) {
             LiveApiParams$AssistantType originUserAs = this.x.getOriginUserAssType();
             b = d.a(-1695065466).gc(this.x.getLiveStreamId());
             if (originUserAs == LiveApiParams$AssistantType.PUSHER && b) {
                uArrayList.add(this.j9(R.string.arg_RES_7f104a8e));
                b.j(this.x.getLiveStreamId());
             }
             b.e0(LiveLogTag.LIVE_PROFILE, "addManagersPrefixItems", "originUserAssType", originUserAs, "isSandeagoModeOn", Boolean.valueOf(b), "OperationItemListSize", Integer.valueOf(uArrayList.size()));
          }
          if (!PatchProxy.applyVoidOneRefs(uArrayList, this, om0, "21") && this.x.getOriginUserAssType() == LiveApiParams$AssistantType.PUSHER) {
             m0 tN = this.N;
             if (tN == null) {
                b.Z(LiveLogTag.MERCHANT, "mPrefetchService is null");
             }else {
                list = tN.c();
                if (!q.f(list)) {
                   iterator = list.iterator();
                   while (iterator.hasNext()) {
                      uoa = iterator.next();
                      if (!TextUtils.x(uoa.getText())) {
                         uod = this.k9(uoa.getText());
                         uod.g(uoa);
                         uArrayList.add(uod);
                      }
                   }
                }
             }
          }
          if (!PatchProxy.applyVoidOneRefs(uArrayList, this, om0, "22")) {
             list = this.K.x8("profile_page", this.M);
             if (!q.f(list)) {
                iterator = list.iterator();
                while (iterator.hasNext()) {
                   uoa = iterator.next();
                   uod = this.k9(uoa.a());
                   uod.g(uoa);
                   uArrayList.add(uod);
                }
             }
             b.c0(LiveLogTag.LIVE_PROFILE, "addOperationsByAbility", "OperationItemListSize", Integer.valueOf(uArrayList.size()));
          }
          int i = 0;
          if (q.f(uArrayList)) {
             i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f101d17), i);
          }else {
             uoc.b(uArrayList);
             uoc.k(new a(this));
             if (!PatchProxy.applyVoid(objArray, this, om0, "50")) {
                String str = "PERSONAL_CARD_ADMINISTRATOR_SETTING_CARD";
                if (this.v.m == LiveProfileMode.ANCHOR_VIEW_AUDIENCE) {
                   voicePartyId = this.x.getVoicePartyId();
                   String theaterId = this.x.getTheaterId();
                   UserProfile mProfile = this.x.getUserProfile().mProfile;
                   ClientContent$LiveStreamPackage liveStreamPa = this.m9();
                   if (!PatchProxy.applyVoidFourRefs(voicePartyId, theaterId, mProfile, liveStreamPa, null, f.class, "8")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = str;
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = liveStreamPa;
                      uContentPack.userPackage = f.a(mProfile);
                      ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
                      uContentWrap.liveVoicePartyPackage = f.b(voicePartyId, theaterId);
                      u1.v0(9, uElementPack, uContentPack, uContentWrap);
                   }
                }else {
                   voicePartyId = this.x.getVoicePartyId();
                   String theaterId1 = this.x.getTheaterId();
                   UserProfile mProfile1 = this.x.getUserProfile().mProfile;
                   String str1 = this.h9();
                   ClientContent$LiveStreamPackage liveStreamPa1 = this.m9();
                   if (PatchProxy.isSupport(f.class)) {
                      Object[] objArray1 = new Object[]{voicePartyId,theaterId1,mProfile1,str1,liveStreamPa1};
                      if (!PatchProxy.applyVoid(objArray1, objArray, f.class, "14")) {
                      }
                   }else {
                   }
                }
             }
             uoc.l(new b(this, uArrayList));
             uoc.q();
          }
       }
       om0 = this.D;
       if (om0 != null) {
          om0.f();
       }
       return;
    }
    public final void T9(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "25")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       if (d.a(-1695065466).gc(this.x.getLiveStreamId())) {
          uArrayList.add(this.j9(R.string.arg_RES_7f104a8e));
          b.j(this.x.getLiveStreamId());
       }
       int i = (this.x.getTargetUserAssType() == LiveApiParams$AssistantType.SUPER_ADMIN)? 0x7f102cfb: 0x7f102cfd;
       uArrayList.add(this.j9(i));
       i = (this.x.getTargetUserAssType() == LiveApiParams$AssistantType.ADMIN)? 0x7f101d16: 0x7f10406c;
       uArrayList.add(this.j9(i));
       c uoc = new c(p0);
       uoc.b(uArrayList);
       uoc.l(new g0(this));
       uoc.q();
       return;
    }
    public final void U9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "29")) {
          return;
       }
       this.d9();
       m0 tD = this.D;
       if (tD != null) {
          tD.c();
       }
       d.a(-1695065466).W(this.x.getLiveStreamId(), this.x.getUserProfile().mProfile);
       b.f(this.x.getLiveStreamId());
       return;
    }
    public final void V9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "24")) {
          return;
       }
       c uoc = new c(this.w);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new b$d(R.string.arg_RES_7f104f05, -1, R.color.arg_RES_7f0607c5));
       uoc.b(uArrayList);
       uoc.k(new f0(this));
       uoc.l(new i0(this));
       uoc.q();
       return;
    }
    public void X9(UserProfile p0,LiveApiParams$AssistantType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m0.class, "45")) {
          return;
       }
       UserInfo mExtraInfo = p0.mProfile.mExtraInfo;
       LiveApiParams$AssistantType aUDIENCE = LiveApiParams$AssistantType.AUDIENCE;
       if (p1 == aUDIENCE && mExtraInfo == null) {
          return;
       }
       if (mExtraInfo == null) {
          mExtraInfo = new UserExtraInfo();
          p0.mExtraInfo = mExtraInfo;
       }
       int i = p1.ordinal();
       mExtraInfo.mAssistantType = i;
       if (i == 1) {
          this.x.setTargetUserAssType(LiveApiParams$AssistantType.SUPER_ADMIN);
       }else if(i == 2){
          this.x.setTargetUserAssType(LiveApiParams$AssistantType.ADMIN);
       }else {
          this.x.setTargetUserAssType(aUDIENCE);
       }
       this.v.n.setValue(this.x.getUserProfile());
       return;
    }
    public void Y9(boolean p0){
       m0 om0 = m0.class;
       if (PatchProxy.isSupport(om0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om0, "13")) {
          return;
       }
       this.J = p0;
       this.L.k(p0);
       if (this.o9()) {
          this.M9();
       }
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "15")) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          m0 tw = this.w;
          y.a(tw, tw.getUrl(), "live_profile_blacklist", 46, a.a().a().getString(R.string.arg_RES_7f103078), this.x.getBaseFeed(), null, null, null);
          return;
       }else {
          m0 tB = this.B;
          if (tB != null) {
             tB.onPullToBlacklist(this.x.getBaseFeed(), this.x.getUserProfile().mProfile.mId);
          }
          this.a9(this.w);
          BaseFeed baseFeed = this.x.getBaseFeed();
          if (baseFeed != null && baseFeed.get("AD") != null) {
             i0.a().e(753, this.x.getBaseFeed()).a();
          }
          return;
       }
    }
    public final void a9(GifshowActivity p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "38")) {
          return;
       }
       String str = null;
       if (p0 != null) {
          str = p0.getUrl();
          str1 = p0.U2();
       }else {
          str1 = str;
       }
       b.a(0x4a533fa).a(QCurrentUser.me().getId(), this.x.getUserProfile().mProfile.mId, str, str1).compose(this.P8()).map(new e()).subscribe(new t(this), new a(p0));
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "35")) {
          return;
       }
       String str = b.c(this.x.getUserProfile().mProfile);
       t$a uoa = new t$a(this.w);
       Object[] objArray = new Object[]{str};
       uoa.X0(this.w.getString(R.string.arg_RES_7f101fef, objArray));
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.Q0(R.string.cancel);
       uoa.u0(new p(this, str));
       uoa.v(1);
       j.d(uoa);
       return;
    }
    public void c9(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "3")) {
          return;
       }
       if (p0 == null) {
          b.B(LiveLogTag.LIVE_ADMIN, "error without throwable");
          return;
       }else {
          try{
             new a(this.w).b(p0);
          }catch(java.lang.Exception e0){
             b.I(LiveLogTag.LIVE_ADMIN, "handle error", p0);
          }
          return;
       }
    }
    public final void d9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "39")) {
          return;
       }
       r j = this.v.j;
       if (j != null) {
          j.a();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "4")) {
          return;
       }
       this.F = m1.f(p0, 0x7f0a1994);
       this.E = m1.f(p0, 0x7f0a2351);
       this.I = m1.f(p0, 0x7f0a234e);
       this.H = m1.f(p0, 0x7f0a234f);
       this.G = m1.f(p0, 0x7f0a23ad);
       m1.a(p0, new c(this), R.id.live_profile_admin_ability);
       m1.a(p0, new f(this), R.id.live_profile_report);
       m1.a(p0, new e(this), R.id.live_audience_new_profile_more);
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "32")) {
          return;
       }
       t$a uoa = new t$a(this.w);
       Object[] objArray = new Object[]{b.c(this.x.getUserProfile().mProfile)};
       uoa.X0(this.w.getString(R.string.arg_RES_7f101ff9, objArray));
       Object[] objArray1 = new Object[]{String.valueOf(((a.a(LiveCommonConfigResponse$AssistantConfig.class).mMaxForbidCommentDurationMs / 1000) / 60))};
       uoa.z0(this.w.getString(R.string.arg_RES_7f102226, objArray1));
       uoa.S0(R.string.arg_RES_7f101ff5);
       uoa.Q0(R.string.arg_RES_7f101f00);
       uoa.u0(new k(this));
       uoa.v(1);
       j.d(uoa);
       return;
    }
    public String h9(){
       String obj = PatchProxy.apply(null, this, m0.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.x.getOriginUserAssType() == LiveApiParams$AssistantType.SUPER_ADMIN)? "SUPER": "NORMAL";
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "1")) {
          return;
       }
       this.v = this.q8(r.class);
       this.w = this.q8(GifshowActivity.class);
       this.x = this.q8(LiveProfileParams.class);
       this.y = this.q8(LiveProfileMode.class);
       this.z = this.q8(k.class);
       this.A = this.q8(User.class);
       this.B = this.s8(LivePlayLogger.class);
       this.C = this.s8(n0.class);
       this.D = this.s8(d.class);
       this.K = this.q8(a.class);
       this.N = this.s8(c$b.class);
       return;
    }
    public final b$d j9(int p0){
       m0 om0 = m0.class;
       if (PatchProxy.isSupport(om0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om0, "46");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new b$d(p0, l.m(0x7f061dc4, 0x7f061d77));
    }
    public final b$d k9(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m0.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b$d(p0, null, this.getActivity().getResources().getColor(l.m(0x7f061dc4, 0x7f061d77)));
    }
    public final b$d l9(int p0){
       m0 om0 = m0.class;
       if (PatchProxy.isSupport(om0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om0, "48");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new b$d(p0, 0x7f0607c5);
    }
    public ClientContent$LiveStreamPackage m9(){
       Object obj = PatchProxy.apply(null, this, m0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.c().a();
    }
    public final String n9(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m0.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.x.getProfileOriginSource() == 2) {
          p0 = "live_audience_list_into_profile";
       }
       return p0;
    }
    public final boolean o9(){
       boolean b = (this.y != LiveProfileMode.ESCROW_VIEW_AUDIENCE)? true: false;
       return b;
    }
    public final void q9(){
       if (PatchProxy.applyVoid(null, this, m0.class, "34")) {
          return;
       }
       UserInfo mName = this.x.getUserProfile().mProfile.mName;
       t$a uoa = new t$a(this.w);
       Object[] objArray = new Object[]{mName};
       uoa.X0(this.w.getString(R.string.arg_RES_7f101ff4, objArray));
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.Q0(R.string.cancel);
       uoa.u0(new o(this, mName));
       uoa.v(1);
       j.d(uoa);
       return;
    }
}
