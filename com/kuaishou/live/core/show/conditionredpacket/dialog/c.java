package com.kuaishou.live.core.show.conditionredpacket.dialog.c;
import im8.g;
import c12.f;
import com.kuaishou.live.core.show.conditionredpacket.dialog.c$a;
import com.kuaishou.live.core.show.conditionredpacket.dialog.c$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import ekd.k1;
import vq5.d;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.kuaishou.live.core.show.conditionredpacket.dialog.LiveAudienceJoinFansGroupDialog;
import com.google.gson.JsonElement;
import java.lang.Integer;
import java.lang.Long;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.e0;
import u52.u;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import l95.c;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupAutoActivePromptDialogInfo;
import kg1.e;
import mg1.a;
import f82.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.conditionredpacket.dialog.e;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kg1.i;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import com.kwai.framework.model.user.User;
import x52.a;
import x52.b;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import lp3.i;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig;
import java.lang.reflect.Type;
import wg3.a;
import brd.t;
import ry1.b;
import x52.d;
import bp6.a;
import erd.g;
import crd.b;
import x52.c;
import vq5.b;

public class c extends f implements g	// class@000a74
{
    public a0 K;
    public m L;
    public i M;
    public d N;
    public LiveFollowExtParams O;
    public LiveAudienceJoinFansGroupDialog P;
    public String Q;
    public int R;
    public LiveConfigStartupResponse$LiveFansGroupConfig S;
    public LiveFansGroupInfo T;
    public boolean U;
    public a V;
    public c$c W;
    public static String sLivePresenterClassName = "LiveAudienceJoinFansGroupDialogPresenter";

    public void c(){
       super();
       this.Q = "UNKNOWN";
       this.V = new c$a(this);
       this.W = new c$b(this);
    }
    public void Q(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "3")) {
          return;
       }
       this.a9();
       k1.n(this);
       this.N.Z4("joinfansgroupdialog");
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, c.class, "16")) {
          return;
       }
       this.b9();
       x.E(this.P);
       this.P = null;
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, c.class, "15")) {
          return;
       }
       c tP = this.P;
       if (tP != null) {
          tP.wh();
       }
       return;
    }
    public final void c9(int p0,long p1,JsonElement p2){
       c uoc = this;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), p2, this, c.class, "17")) {
          return;
       }
       u.e(uoc.K.R().t0(), uoc.L.a(), uoc.L.y(), p0, p1, uoc.Q, uoc.L.d(), e.r(this.getActivity()), p2, uoc.K.c0());
       return;
    }
    public void d9(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "18")) {
          return;
       }
       if (FansGroupKswitchUtil.b()) {
          b uob = new b(false, "JoinDialog", "REQUEST_JOIN");
          uob.f(404);
          uob.c(p0);
          uob.g(p1);
          c.a(uob);
       }
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, c.class, "12")) {
          return;
       }
       if (this.K.r1.je() != null) {
          this.K.r1.Tf(c.a(this.Q), new a(true, "POPUP"));
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new e());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void h9(LiveFollowExtParams p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "13")) {
          return;
       }
       if (TextUtils.x(p1)) {
          p1 = "UNKNOWN";
       }
       i.i(this.K.Z2.a(), this.K.Z2.d(), p1);
       this.a9();
       this.O = p0;
       this.Q = p1;
       LiveAudienceJoinFansGroupDialog liveAudience = LiveAudienceJoinFansGroupDialog.xh(this.V, this.K.Z2.I(), c.c(this.T, this.R), p1);
       this.P = liveAudience;
       liveAudience.k0(new b(this));
       this.P.Cb(this.K.R().getChildFragmentManager(), "LiveAudienceJoinFansGroupDialogPresenter");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.q8(a0.class);
       this.L = this.r8("LIVE_BASIC_CONTEXT");
       this.N = this.r8("LIVE_ROUTER_SERVICE");
       this.M = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
    public void x(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       LiveConfigStartupResponse$LiveFansGroupConfig liveFansGrou = a.o(LiveConfigStartupResponse$LiveFansGroupConfig.class);
       this.S = liveFansGrou;
       if (liveFansGrou != null) {
          this.R = liveFansGrou.mJoinCoinCount;
       }
       this.X7(this.K.b3.T3().subscribe(new d(this), new a()));
       this.N.t5("joinfansgroupdialog", new c(this));
       return;
    }
}
