package com.kuaishou.recruit.live.rightpendant.anchor.a;
import k51.c;
import rq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import wt4.e;
import com.kuaishou.recruit.live.rightpendant.anchor.a$a;
import wt4.f;
import wt4.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fq5.b;
import sr5.b;
import aq5.d;
import aq5.b;
import aq5.a;
import hf3.a;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LivePlusRecruitAuthorWidget;
import lf3.g;
import le1.a;
import lp3.c;
import lp3.i;
import le1.a$a;
import com.kuaishou.recruit.live.rightpendant.anchor.LiveAnchorRecruitPendantBottomView;
import wt4.c;
import android.view.View$OnClickListener;
import com.kuaishou.recruit.live.rightpendant.common.LiveBaseRecruitRightBottomPendantView;
import wt4.a;
import wt4.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.anchorchat.LiveAnchorChatBaseService;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import java.lang.CharSequence;
import pq5.c;
import java.lang.Boolean;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;
import yt4.b;
import yt4.c$b;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import yt4.c;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$RecruitWidgetButtonInfo;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public class a extends c	// class@000ed1
{
    public boolean A;
    public LivePlusRecruitMessages$LivePlusRecruitAuthorWidget B;
    public final AnchorBizRelation[] C;
    public final g D;
    public final a E;
    public final b F;
    public final a$a G;
    public c p;
    public d q;
    public b r;
    public i s;
    public LiveAnchorRecruitPendantBottomView t;
    public String u;
    public String v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public void a(){
       super();
       this.z = a.g;
       AnchorBizRelation[] uAnchorBizRe = new AnchorBizRelation[]{AnchorBizRelation.CHAT_BETWEEN_ANCHORS,AnchorBizRelation.CHAT_WITH_GUEST,AnchorBizRelation.CHAT_CENTER_VIEW};
       this.C = uAnchorBizRe;
       this.D = new e(this);
       this.E = new a$a(this);
       this.F = new f(this);
       this.G = new d(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.r.b().A0().u5(this.F, this.C);
       this.r.L().u0(881, LivePlusRecruitMessages$LivePlusRecruitAuthorWidget.class, this.D);
       this.s.a(a.class).Jc(this.G);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       this.r.L().o(881, this.D);
       this.r.b().A0().G5(this.F, this.C);
       this.V8();
       this.u = objArray;
       this.w = false;
       this.A = false;
       this.s.a(a.class).Nm(this.G);
       return;
    }
    public final void P8(LiveAnchorRecruitPendantBottomView p0,LivePlusRecruitMessages$LivePlusRecruitAuthorWidget p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "7")) {
          return;
       }
       String str = (p1.widgetState == 1)? "EMPTY": "PUT_ON";
       LivePlusRecruitMessages$LivePlusRecruitAuthorWidget jobId = p1.jobId;
       p0.setCloseViewClickListener(new c(this, jobId, str));
       p0.setRootViewClickListener(new a(this, p1, str, jobId));
       p0.setBottomButtonClickListener(new b(this, p1, str, jobId));
       return;
    }
    public String R8(){
       Object obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(this.s.a(LiveAnchorChatBaseService.class).f());
    }
    public final String S8(String p0,String p1,String p2){
       i3 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       if (!TextUtils.x(p2)) {
          obj.d("post_id", p2);
       }
       p2 = this.R8();
       if (!TextUtils.x(p2)) {
          obj.d("live_mic_chat_id", p2);
       }
       obj.d("card_type", p1);
       obj.d("btn_name", p0);
       p0 = (this.W8())? "TRUE": "FALSE";
       obj.d("if_open_explain", p0);
       return obj.e();
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.p.g9(this.E);
       this.u = null;
       this.B = null;
       return;
    }
    public boolean W8(){
       Object obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.r.b().A0().r2(AnchorBizRelation.RECRUIT_EXPLAIN_PANEL);
    }
    public final boolean X8(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.w != null && !TextUtils.n(p1, p0))? true: false;
       return b;
    }
    public final void Y8(LivePlusRecruitMessages$LivePlusRecruitAuthorWidget p0,boolean p1,boolean p2){
       boolean b2;
       String str = this;
       LivePlusRecruitMessages$LivePlusRecruitAuthorWidget livePlusRecr = p0;
       boolean b = p1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, a.class, "8")) {
          return;
       }
       LivePlusRecruitMessages$LivePlusRecruitAuthorWidget jumpUrl = livePlusRecr.jumpUrl;
       LivePlusRecruitMessages$LivePlusRecruitAuthorWidget jobId = livePlusRecr.jobId;
       Context context = this.getContext();
       LiveLogTag obj = PatchProxy.applyTwoRefs(jumpUrl, jobId, str, uoa, "10");
       boolean b1 = false;
       int i = 1;
       if (obj != PatchProxyResult.class) {
          b2 = obj.booleanValue();
       }else if(!TextUtils.x(jobId) && (!TextUtils.x(jumpUrl) && (!str.q.P0(jumpUrl) || TextUtils.n(str.u, jobId)))){
          b2 = true;
       }else {
          b2 = false;
       }
       if (context == null || b2) {
          obj = LiveLogTag.LIVE_RECRUIT;
          obj.appendTag("AnchorRightBottomPendant");
          LiveLogTag liveLogTag = obj;
          if (context == null) {
             b1 = true;
          }
          b.V(liveLogTag, "show pendant no need handle", "context is null ", Boolean.valueOf(b1), "new job id ", Boolean.valueOf(TextUtils.x(jobId)), " mLastDelPendantJobId ", TextUtils.k(str.u), "isPendantMsgInvalid ", Boolean.valueOf(b2));
          return;
       }else if(str.X8(jobId, str.v)){
          b.a(str.r.b(), null, jobId, "PUT_ON", this.R8(), this.W8());
       }
       str.u = null;
       str.v = jobId;
       if (str.t == null) {
          str.t = new LiveAnchorRecruitPendantBottomView(context);
       }
       c$b uob = new c$b();
       uob.e(livePlusRecr.jobTitle);
       uob.d(livePlusRecr.salary);
       uob.b(livePlusRecr.salary);
       uob.e = livePlusRecr.applyCount;
       uob.c(livePlusRecr.picture);
       c uoc = uob.a();
       jobId = livePlusRecr.button;
       if (jobId != null && !TextUtils.x(jobId.buttonText)) {
          uoc.g = livePlusRecr.button.buttonText;
       }
       a t = str.t;
       if (p2) {
          i = 2;
       }
       t.f(i, uoc, b);
       str.t.d(livePlusRecr.alertInfo);
       str.a9(b);
       str.P8(str.t, livePlusRecr);
       str.p.eo(str.E);
       str.B = livePlusRecr;
       return;
    }
    public final void Z8(LivePlusRecruitMessages$LivePlusRecruitAuthorWidget p0,boolean p1){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "4")) {
          return;
       }
       String liveStreamId = this.r.b().getLiveStreamId();
       String str = "AnchorRightBottomPendant";
       if (!TextUtils.n(p0.liveStreamId, liveStreamId)) {
          LiveLogTag lIVE_RECRUIT = LiveLogTag.LIVE_RECRUIT;
          lIVE_RECRUIT.appendTag(str);
          b.T(lIVE_RECRUIT, "receive pendant msg but live stream id is not equals", "currentLiveStreamId: ", liveStreamId, "msg liveStreamId ", p0.liveStreamId);
          return;
       }else {
          LivePlusRecruitMessages$LivePlusRecruitAuthorWidget widgetState = p0.widgetState;
          b = true;
          if (widgetState != b) {
             if (widgetState != 2) {
                if (widgetState != 3) {
                   if (widgetState == 4) {
                      this.Y8(p0, p1, b);
                   }
                }else {
                   this.V8();
                }
             }else {
                this.Y8(p0, p1, false);
             }
          }else if(PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "6")){
             LivePlusRecruitMessages$LivePlusRecruitAuthorWidget jumpUrl = p0.jumpUrl;
             Context context = this.getContext();
             if (TextUtils.x(jumpUrl) || !this.q.P0(jumpUrl)) {
                b = false;
             }
             if (context == null || !b) {
                b.S(LiveLogTag.LIVE_RECRUIT.appendTag(str), "receive empty pendant msg jump url error or context is null", "msg jumpUrl isJumpUrlAvailable ", Boolean.valueOf(b));
             }else if(this.X8(null, this.v)){
                b.a(this.r.b(), null, this.v, "EMPTY", this.R8(), this.W8());
             }
             this.u = null;
             this.v = null;
             if (this.t == null) {
                this.t = new LiveAnchorRecruitPendantBottomView(context);
             }
             c$b uob = new c$b();
             uob.e(p0.guideTitle);
             uob.d = p0.guideDesc;
             uob.c(p0.picture);
             uob.b(p0.guideTitle);
             c uoc = uob.a();
             widgetState = p0.button;
             if (widgetState != null && !TextUtils.x(widgetState.buttonText)) {
                uoc.g = p0.button.buttonText;
             }
             this.t.f(false, uoc, p1);
             this.a9(p1);
             this.P8(this.t, p0);
             this.p.eo(this.E);
             this.B = p0;
          }
          return;
       }
    }
    public final void a9(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "13")) {
          return;
       }
       if (p0) {
          this.z = this.y;
          a tt = this.t;
          if (tt != null) {
             tt.c(this.x);
          }
       }else {
          this.z = a.g;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.r8("LIVE_PUSH_CALLER_CONTEXT");
       this.q = this.r8("LIVE_ROUTER_SERVICE");
       this.p = this.q8(c.class);
       this.s = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
