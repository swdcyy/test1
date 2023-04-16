package com.kuaishou.recruit.live.rightpendant.audience.b;
import im8.g;
import h41.a;
import oy.a;
import com.kuaishou.commercial.reporter.data.ApiResponseMessageData;
import com.kuaishou.commercial.reporter.data.SignalMessageData;
import com.kuaishou.commercial.reporter.data.CommercialRecruitLiveShowClickReportMessageData;
import java.util.ArrayList;
import rq5.a;
import xt4.p;
import xt4.o;
import com.kuaishou.recruit.live.rightpendant.audience.b$a;
import xt4.n;
import com.kuaishou.recruit.live.rightpendant.audience.b$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import sr5.a;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import fq5.b;
import aq5.d;
import aq5.b;
import aq5.a;
import androidx.fragment.app.KwaiDialogFragment;
import et4.a;
import crd.b;
import lnc.b9;
import hf3.a;
import lf3.g;
import le1.a;
import lp3.c;
import lp3.i;
import le1.a$a;
import e41.a;
import lnc.i3;
import java.lang.CharSequence;
import com.kuaishou.recruit.live.rightpendant.audience.LiveAudienceRecruitPendantBottomView;
import wkd.b;
import lg2.m;
import java.util.Objects;
import lg2.a;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonObject;
import java.lang.System;
import java.lang.Long;
import java.lang.Number;
import com.google.gson.JsonElement;
import ct4.b;
import ct4.a;
import brd.t;
import xt4.b;
import erd.g;
import cjd.e;
import erd.o;
import xt4.h;
import xt4.i;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import pq5.c;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LivePlusRecruitAudienceWidget;
import vt4.a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRecruitRepeatApplyConfig;
import java.lang.reflect.Type;
import wg3.a;
import vq5.d;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import kt4.q;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$RecruitWidgetButtonInfo;
import yt4.b;
import android.widget.FrameLayout;
import xt4.g;
import xt4.e;
import xt4.t;
import java.util.HashMap;
import yt4.c$b;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import yt4.c;
import android.widget.TextView;
import com.kuaishou.recruit.live.rightpendant.common.LiveBaseRecruitRightBottomPendantView;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo;
import java.lang.Integer;
import xt4.m;
import android.view.View$OnClickListener;
import xt4.k;
import xt4.l;
import fu4.b;
import tj3.e;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import xt4.q;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import xt4.j;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import xt4.a;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import xt4.f;
import com.kuaishou.recruit.live.rightpendant.audience.b$c;
import tj3.k;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import cu4.a;
import t45.d;
import brd.z;
import xt4.d;
import bp6.a;
import xt4.c;

public class b extends a implements g	// class@000ed7
{
    public final ApiResponseMessageData A;
    public final SignalMessageData B;
    public long C;
    public boolean D;
    public boolean E;
    public boolean F;
    public a G;
    public a H;
    public a I;
    public a J;
    public CommercialRecruitLiveShowClickReportMessageData K;
    public LiveAudienceRecruitPendantBottomView L;
    public String M;
    public String N;
    public boolean O;
    public b P;
    public boolean Q;
    public ProgressFragment R;
    public b S;
    public b T;
    public List U;
    public AudienceBizRelation[] U0;
    public LivePlusRecruitMessages$LivePlusRecruitAudienceWidget V;
    public JsonElement V0;
    public int W;
    public final b W0;
    public int X;
    public final g X0;
    public int Y;
    public final a Y0;
    public boolean Z;
    public final a$a Z0;
    public a a1;
    public c s;
    public q t;
    public d u;
    public a v;
    public i w;
    public e x;
    public b y;
    public a z;

    public void b(){
       super();
       this.z = a.k();
       this.A = new ApiResponseMessageData();
       this.B = new SignalMessageData();
       this.G = a.l();
       this.H = a.l();
       this.I = a.l();
       this.J = a.o();
       this.K = new CommercialRecruitLiveShowClickReportMessageData();
       this.U = new ArrayList();
       this.Y = a.g;
       this.U0 = null;
       this.W0 = new p(this);
       this.X0 = new o(this);
       this.Y0 = new b$a(this);
       this.Z0 = new n(this);
       this.a1 = new b$b(this);
    }
    public final String P8(){
       LiveStreamFeedWrapper obj = PatchProxy.apply(null, this, b.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v.j0().mEntity;
       if (obj != null) {
          PhotoAdvertisement photoAdverti = obj.get("AD");
          if (photoAdverti != null) {
             return TextUtils.k(photoAdverti.mCallbackParam);
          }
       }
       return "";
    }
    public void Q(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "3")) {
          return;
       }
       super.Q(p0);
       if (this.U0 != null) {
          this.v.b().A0().G5(this.W0, this.U0);
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          uob = this.z;
          uob.Y(this.B);
          uob.X(this.A);
          uob.t();
       }
       a.a(this.R);
       b9.a(this.S);
       this.v.b().u().o(882, this.X0);
       this.X8();
       this.M = objArray;
       this.Z = false;
       this.w.a(a.class).Nm(this.Z0);
       b9.a(this.T);
       this.V0 = objArray;
       this.Q = false;
       this.F = false;
       this.D = false;
       this.E = false;
       b9.a(this.P);
       return;
    }
    public String R8(){
       Object obj = PatchProxy.apply(null, this, b.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(this.w.a(a.class).f());
    }
    public final String S8(String p0,String p1){
       i3 obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       if (!TextUtils.x(p0)) {
          obj.d("post_id", p0);
       }
       obj.d("btn_name", p1);
       p0 = this.R8();
       if (!TextUtils.x(p0)) {
          obj.d("live_mic_chat_id", p0);
       }
       b tL = this.L;
       tL = (tL == null)? "APPLY": tL.getButtonStatus();
       obj.d("post_status", tL);
       tL = (this.a9())? "TRUE": "FALSE";
       obj.d("if_open_explain", tL);
       return obj.e();
    }
    public final String V8(){
       LiveStreamFeedWrapper obj = PatchProxy.apply(null, this, b.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v.j0().mEntity;
       if (obj != null) {
          PhotoAdvertisement photoAdverti = obj.get("AD");
          if (photoAdverti != null) {
             return TextUtils.k(photoAdverti.mFansTopAttributeParams);
          }
       }
       return "";
    }
    public final void W8(String p0,String p1){
       String str1;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidTwoRefs(obj1, p1, obj, b.class, "21")) {
          return;
       }
       String liveStreamId = obj.v.b().getLiveStreamId();
       String str = obj.v.b().d();
       if (TextUtils.x(liveStreamId) || TextUtils.x(str)) {
          b.U(LiveLogTag.LIVE_RECRUIT.appendTag("AudienceRecruitRightBottomPendant"), "try apply recruit params error ", "job id", p0, "liveStream id ", TextUtils.k(liveStreamId), "anchor user id ", TextUtils.k(str));
          return;
       }else {
          obj.d9("APPLYING", obj1);
          m om = b.a(-1498019239);
          Objects.requireNonNull(om);
          Object[] objArray = null;
          b obj2 = PatchProxy.apply(objArray, om, m.class, "3");
          if (obj2 != PatchProxyResult.class) {
             str1 = obj2;
          }else {
             a uoa = om.d();
             if (uoa == null || uoa.d == null) {
                str1 = objArray;
             }else {
                i3 oi3 = i3.f();
                Iterator iterator = uoa.d.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String key = uEntry.getKey();
                   oi3.d(key, uEntry.getValue());
                }
                str1 = oi3.e();
             }
          }
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("liveStreamId", liveStreamId);
          jsonObject.c0("authorId", str);
          jsonObject.c0("jobId", obj1);
          jsonObject.a0("clientTimestamp", Long.valueOf(System.currentTimeMillis()));
          jsonObject.c0("fansTopAttributeParams", this.V8());
          jsonObject.c0("adCallbackParam", this.P8());
          jsonObject.c0("taskInfo", str1);
          jsonObject.c0("scene", "LIVE_STREAM");
          jsonObject.c0("entrance", "CARD_INTERPRET_PENDANT");
          jsonObject.c0("submit", "ONE_SHOT");
          obj2 = obj.I;
          obj2.z("/rest/n/live/plus/recruit/audience/job/tryApply");
          obj2.U(jsonObject.toString());
          long l = System.currentTimeMillis();
          obj.X7(a.b().b(liveStreamId, str, p0, System.currentTimeMillis(), this.V8(), this.P8(), str1, "LIVE_STREAM", "CARD_INTERPRET_PENDANT", "ONE_SHOT").doOnNext(new b(obj)).map(new e()).subscribe(new h(obj, l, obj1), new i(obj, obj1, l)));
          return;
       }
    }
    public final void X8(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "8")) {
          return;
       }
       b.P(LiveLogTag.LIVE_RECRUIT.appendTag("AudienceRecruitRightBottomPendant"), "hideRecruitPendant");
       if (!PatchProxy.applyVoid(null, this, uob, "11")) {
          this.s.g9(this.Y0);
          this.N = null;
          this.O = false;
       }
       return;
    }
    public boolean Y8(LivePlusRecruitMessages$LivePlusRecruitAudienceWidget p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "34");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          LiveConfigStartupResponse$LiveRecruitRepeatApplyConfig liveRecruitR = a.E(LiveConfigStartupResponse$LiveRecruitRepeatApplyConfig.class);
          if (liveRecruitR == null) {
             liveRecruitR = new LiveConfigStartupResponse$LiveRecruitRepeatApplyConfig();
          }
          liveRecruitR = liveRecruitR.mShouldShowCheckMoreJobs;
       }
       boolean b1 = (b != null && (p0.isMultiJob != null && this.U.contains(p0.jobId)))? true: false;
       return b1;
    }
    public final boolean Z8(String p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (!TextUtils.x(p0) && this.u.P0(p0))? true: false;
       return b;
    }
    public boolean a9(){
       Object obj = PatchProxy.apply(null, this, b.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.v.b().A0().r2(AudienceBizRelation.RECRUIT_EXPLAIN_PANEL);
    }
    public final boolean b9(){
       boolean b;
       boolean b1;
       d obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v.b().A0();
       b tU0 = this.U0;
       b = false;
       if (tU0 != null) {
          int len = tU0.length;
          int i = 0;
          b1 = false;
          while (i < len) {
             object oobject = tU0[i];
             b1 = (b1 || obj.r2(oobject))? true: false;
             i = i + 1;
          }
       }else {
          b1 = 0;
       }
       if (!obj.r2(AudienceBizRelation.CHAT_CENTER_STATUS_VIEW)) {
          b = b1;
       }
       return b;
    }
    public final void c9(LivePlusRecruitMessages$LivePlusRecruitAudienceWidget p0){
       boolean b;
       String str1;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!TextUtils.n(p0.liveStreamId, this.v.b().getLiveStreamId())) {
          return;
       }
       b = true;
       this.Q = b;
       LivePlusRecruitMessages$LivePlusRecruitAudienceWidget widgetState = p0.widgetState;
       LivePlusRecruitMessages$LivePlusRecruitAudienceWidget livePlusRecr = null;
       Boolean uBoolean = 2;
       if (widgetState != b) {
          if (widgetState == uBoolean) {
             this.V = livePlusRecr;
             this.X8();
          }
       }else if(PatchProxy.applyVoidOneRefs(p0, this, uob, "7")){
          this.V = p0;
          boolean b1 = false;
          this.t.Nd(p0.jobId, b1);
          if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "12")) {
             LiveLogTag lIVE_RECRUIT = LiveLogTag.LIVE_RECRUIT;
             String str = "AudienceRecruitRightBottomPendant";
             lIVE_RECRUIT.appendTag(str);
             b.P(lIVE_RECRUIT, "showRecruitPendant");
             LivePlusRecruitMessages$LivePlusRecruitAudienceWidget applyUrl = p0.applyUrl;
             LivePlusRecruitMessages$LivePlusRecruitAudienceWidget jobId = p0.jobId;
             Context context = this.getContext();
             boolean b2 = (this.Z8(p0.detailUrl) && this.Z8(applyUrl))? true: false;
             b uob1 = (p0.button != null)? 1: null;
             if (context != null && (TextUtils.x(jobId) || (b2 || (!uob1 || TextUtils.n(this.M, jobId))))) {
                lIVE_RECRUIT.appendTag(str);
                LiveLogTag liveLogTag = lIVE_RECRUIT;
                if (context != null) {
                   b = false;
                }
                b.V(liveLogTag, "show pendant no need handle", "context is null ", Boolean.valueOf(b), "new job id ", Boolean.valueOf(TextUtils.x(jobId)), " mLastDelPendantJobId ", TextUtils.k(this.M), " url is available ", Boolean.valueOf(b2));
             }else if(this.D == null){
                this.z.d0(uBoolean);
                this.D = b;
             }
             uob = this.N;
             this.N = jobId;
             if (this.O != null && !TextUtils.n(uob, jobId)) {
                if (this.Y8(p0)) {
                   str1 = "MORE_POST";
                }else {
                   LivePlusRecruitMessages$LivePlusRecruitAudienceWidget button = p0.button;
                   str1 = (button != null && button.type == 5)? "CHAT": "BUTTON";
                }
                b.b(this.v.b(), str1, this.N, this.R8(), this.a9());
             }
             this.h9(uob, p0, context);
             this.M = livePlusRecr;
             this.L.setVisibility(b1);
             this.s.eo(this.Y0);
          }
       }
       return;
    }
    public void d9(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "26")) {
          return;
       }
       if (!TextUtils.x(this.N) && this.L != null) {
          if (!TextUtils.n(this.N, p1)) {
             return;
          }else {
             this.L.setBottomButtonStatus(p0);
          }
       }
       return;
    }
    public void e9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "23")) {
          return;
       }
       String str = this.v.b().d();
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("authorId", str);
       b tH = this.H;
       tH.z("/rest/n/live/plus/recruit/audience/job/applied/info");
       tH.U(jsonObject.toString());
       long l = System.currentTimeMillis();
       this.X7(a.b().c(str).map(new e()).subscribe(new g(this, l, p0), new e(this, l)));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new t());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public final void h9(String p0,LivePlusRecruitMessages$LivePlusRecruitAudienceWidget p1,Context p2){
       boolean b;
       String str1;
       k ok;
       b uob = this;
       LivePlusRecruitMessages$LivePlusRecruitAudienceWidget livePlusRecr = p1;
       Context uContext = p2;
       b uob1 = b.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "14")) {
          return;
       }
       if (uob.L == null) {
          uob.L = new LiveAudienceRecruitPendantBottomView(uContext);
       }
       c$b uob2 = new c$b();
       uob2.c(livePlusRecr.picture);
       uob2.d(livePlusRecr.salary);
       uob2.b(livePlusRecr.salary);
       uob2.e(livePlusRecr.jobTitle);
       c uoc = uob2.a();
       b l = uob.L;
       b z = uob.Z;
       Objects.requireNonNull(l);
       if (PatchProxy.isSupport(LiveAudienceRecruitPendantBottomView.class) && PatchProxy.applyTwoRefs(uoc, Boolean.valueOf(z), l, LiveAudienceRecruitPendantBottomView.class, "3") != PatchProxyResult.class) {
       }else {
          l.e(l.q, uoc.c);
          l.e(l.r, uoc.b);
          l.e(l.k, uoc.f);
          l.setJobIconView(uoc.a);
          l.setPendantViewStatus(z);
       }
       this.m9(uob.Z);
       uob.L.d(livePlusRecr.alertInfo);
       b = uob.U.contains(livePlusRecr.jobId);
       boolean b1 = this.Y8(livePlusRecr);
       LivePlusRecruitMessages$LivePlusRecruitAudienceWidget button = livePlusRecr.button;
       int i = 6;
       b uob3 = null;
       String str = 1;
       b uob4 = (button != null && (button.type == i && (!b && !b1)))? 1: null;
       if (button == null || (button.type != i || uob4)) {
          uob.L.setCustomBottomButton(button);
          uob4 = uob.L;
          LivePlusRecruitMessages$LivePlusRecruitAudienceWidget button1 = livePlusRecr.button;
          LivePlusRecruitMessages$RecruitWidgetButtonInfo buttonUrl = button1.buttonUrl;
          LivePlusRecruitMessages$RecruitWidgetButtonInfo type = button1.type;
          if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidThreeRefs(uob4, buttonUrl, Integer.valueOf(type), this, b.class, "15")) {
             uob4.setBottomBarButtonClickListener(new m(this, buttonUrl, type));
          }
          this.k9(uob.L, uContext, livePlusRecr.jobId);
       }else if(b1){
          str1 = "MORE_POST";
       }else if(b){
          str1 = "APPLYED";
       }else {
          str1 = "APPLY";
       }
       uob.L.setBottomButtonStatus(str1);
       uob4 = uob.L;
       LivePlusRecruitMessages$LivePlusRecruitAudienceWidget detailUrl = livePlusRecr.detailUrl;
       LivePlusRecruitMessages$LivePlusRecruitAudienceWidget applyUrl = livePlusRecr.applyUrl;
       LivePlusRecruitMessages$LivePlusRecruitAudienceWidget jobId = livePlusRecr.jobId;
       if (PatchProxy.isSupport(uob1)) {
          Object[] objArray = new Object[]{uob4,uContext,detailUrl,applyUrl,jobId};
          if (!PatchProxy.applyVoid(objArray, this, uob1, "17")) {
          }
       }else {
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.v = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       this.u = this.r8("LIVE_ROUTER_SERVICE");
       this.s = this.q8(c.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.w = oi;
       this.y = oi.a(b.class);
       this.t = this.q8(q.class);
       this.x = this.r8("LIVE_LOG_REPORTER");
       return;
    }
    public void j9(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "30")) {
          return;
       }
       LiveStreamFeedWrapper mEntity = this.v.j0().mEntity;
       if (mEntity != null) {
          i0.a().e(p0, mEntity).f(new q(p1)).a();
       }
       return;
    }
    public final void k9(LiveAudienceRecruitPendantBottomView p0,Context p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "18")) {
          return;
       }
       p0.setRootViewClickListener(new j(this, p1, p2));
       return;
    }
    public void l9(Context p0,String p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "19")) {
          return;
       }
       b9.a(this.S);
       a.a(this.R);
       ProgressFragment progressFrag = new ProgressFragment();
       this.R = progressFrag;
       progressFrag.setCancelable(false);
       this.R.k0(new a(this));
       this.R.show(this.v.b().b().getChildFragmentManager(), "mGetWidgetUrlLoadingDialog");
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("jobId", p1);
       jsonObject.c0("liveStreamId", this.v.b().getLiveStreamId());
       jsonObject.a0("scene", Integer.valueOf(p2));
       b tG = this.G;
       tG.z("/rest/n/live/plus/recruit/audience/job/widgetUrl");
       tG.U(jsonObject.toString());
       long l = System.currentTimeMillis();
       this.S = a.b().d(p1, this.v.b().getLiveStreamId(), p2).map(new e()).subscribe(new f(this, l, p0), new b$c(this, l));
       return;
    }
    public final void m9(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "29")) {
          return;
       }
       if (p0) {
          this.Y = this.X;
          b tL = this.L;
          if (tL != null) {
             tL.c(this.W);
          }
       }else {
          this.Y = a.g;
       }
       return;
    }
    public void x(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.z = a.k();
       this.G = a.l();
       this.H = a.l();
       this.I = a.l();
       this.J = a.o();
       this.K = new CommercialRecruitLiveShowClickReportMessageData();
       AudienceBizRelation[] uAudienceBiz = new AudienceBizRelation[]{AudienceBizRelation.CHAT,AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW,AudienceBizRelation.CHAT_VIDEO_VIEW,AudienceBizRelation.CHAT_CENTER_STATUS_VIEW};
       this.U0 = uAudienceBiz;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          LiveStreamFeedWrapper mEntity = this.v.j0().mEntity;
          if (mEntity == null) {
             b.P(LiveLogTag.LIVE_RECRUIT.appendTag("AudienceRecruitRightBottomPendant"), "LiveStreamFeed is null");
          }else {
             long l = this.x.x().M();
             this.C = l;
             if (l - null <= 0) {
                this.C = System.currentTimeMillis();
             }
             b tz = this.z;
             tz.S(mEntity.mTypeViewList);
             tz.D(this.v.b().a().sourceTypeNew);
             tz.R(mEntity.getId());
             tz.C(this.C);
             tz.T("explainCard");
             tz = this.G;
             tz.S(mEntity.mTypeViewList);
             tz.R(mEntity.getId());
             tz = this.H;
             tz.S(mEntity.mTypeViewList);
             tz.R(mEntity.getId());
             tz = this.I;
             tz.S(mEntity.mTypeViewList);
             tz.R(mEntity.getId());
             this.z.Z();
             this.K.mLiveStreamId = mEntity.getId();
             tz = this.K;
             tz.mTypeViewList = mEntity.mTypeViewList;
             tz.mMessageType = "explainCard";
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "10")) {
          this.P = this.w.a(a.class).Kd().observeOn(d.a).subscribe(new d(this), new a());
       }
       this.v.b().A0().u5(this.W0, this.U0);
       this.v.b().u().u0(882, LivePlusRecruitMessages$LivePlusRecruitAudienceWidget.class, this.X0);
       this.w.a(a.class).Jc(this.Z0);
       this.Z = this.b9();
       this.T = this.y.W().subscribe(new c(this));
       return;
    }
}
