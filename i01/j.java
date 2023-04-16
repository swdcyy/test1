package i01.j;
import im8.g;
import k51.c;
import i01.j$a;
import i01.j$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import brd.t;
import ry1.b;
import i01.e;
import bp6.a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig;
import java.lang.reflect.Type;
import wg3.a;
import l95.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig;
import com.kuaishou.live.core.show.conditionredpacket.dialog.LiveAudienceJoinFansGroupDialog;
import java.lang.Boolean;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupAutoActivePromptDialogInfo;
import kg1.e;
import w91.a;
import lp3.c;
import lp3.e;
import java.util.Map;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import f82.c;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import android.app.Activity;
import p91.m;
import wkd.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.common.core.component.recharge.d;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import java.util.HashMap;
import l95.c;
import android.os.SystemClock;
import i01.h;
import com.google.gson.JsonElement;
import i01.c;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import i01.g;
import java.lang.Long;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.core.basic.utils.e;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.e0;
import u52.u;
import lm1.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import mk1.b;
import com.yxcorp.gifshow.models.Gift;
import lm1.f;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import f92.b;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.c;
import fq5.b;
import lm1.d;
import lm1.e;
import lm1.g;
import ik1.i0;
import mg1.a;
import i01.m;
import mk1.h;
import h01.j;
import om1.a;

public class j extends c implements g	// class@0027e4
{
    public n A;
    public a B;
    public a0 p;
    public e q;
    public a r;
    public h s;
    public j t;
    public LiveAudienceJoinFansGroupDialog u;
    public int v;
    public LiveFansGroupInfo w;
    public boolean x;
    public LiveConfigStartupResponse$LiveFansGroupConfig y;
    public LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig z;
    public static String sLivePresenterClassName = "LiveFansGroupGiftSendPresenter";

    public void j(){
       super();
       this.A = new j$a(this);
       this.B = new j$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       this.X7(this.p.b3.T3().subscribe(new e(this), new a()));
       LiveConfigStartupResponse$LiveFansGroupConfig liveFansGrou = a.o(LiveConfigStartupResponse$LiveFansGroupConfig.class);
       this.y = liveFansGrou;
       if (liveFansGrou != null) {
          this.v = liveFansGrou.mJoinCoinCount;
          this.z = liveFansGrou.mLiveFansGroupFlashJoinConfig;
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.R8();
       return;
    }
    public final b P8(int p0){
       b obj;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new b(false, "JoinDialog", "REQUEST_JOIN");
       obj.g("GIFT_PANEL");
       obj.f(p0);
       return obj;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, j.class, "11")) {
          return;
       }
       this.V8();
       x.E(this.u);
       this.u = null;
       return;
    }
    public final int S8(){
       LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig mUnitJoinPri = (this.x != null)? this.z.mUnitJoinPrice: this.v;
       if (mUnitJoinPri <= null) {
          mUnitJoinPri = 1;
       }
       return mUnitJoinPri;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, j.class, "10")) {
          return;
       }
       j tu = this.u;
       if (tu != null) {
          tu.wh();
       }
       return;
    }
    public final boolean W8(){
       Object obj = PatchProxy.apply(null, this, j.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.p.r1.je() != null)? true: false;
       return b;
    }
    public final void X8(){
       boolean b1;
       Object obj = this;
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, oj, "14")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HashMap obj1 = PatchProxy.apply(objArray, obj, oj, "13");
       boolean b = false;
       int i = 1;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          Map map = obj.q.a(a.class).d6();
          if (!c.l(obj.w)) {
             obj1 = PatchProxy.apply(objArray, obj, oj, "12");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(d.a(0x630bc993).d1().q() - (long)this.S8() < 0){
                b1 = true;
             }else {
                b1 = false;
             }
             if (b1) {
                j p = obj.p;
                d.e("LIVE_ROOM_FANS_GROUP_DAILY_TASK_SEND_GIFT", this.getActivity(), obj.p.Z2.getLiveStreamId(), obj.p.Z2.d(), ((long)this.S8() - b.a(0x4c90014d).q()), p.p, p.c.getExpTag(), map);
                x.H(a1.p(R.string.arg_RES_7f101c45));
                if (!PatchProxy.applyVoid(objArray, obj, oj, "22") && FansGroupKswitchUtil.b()) {
                   b uob = obj.P8(404);
                   uob.c("lack coin");
                   obj1 = new HashMap();
                   obj1.put("need", String.valueOf(this.S8()));
                   obj1.put("currKcoin", String.valueOf(d.a(0x630bc993).d1().q()));
                   uob.d(obj1);
                   c.a(uob);
                }
                b = true;
             }
          }
       }
       if (b) {
          this.R8();
          return;
       }else {
          long l = SystemClock.elapsedRealtime();
          h oh = new h(obj, l);
          obj.Y8(i, (SystemClock.elapsedRealtime() - l), objArray);
          if (!PatchProxy.applyVoid(objArray, obj, oj, "20") && FansGroupKswitchUtil.b()) {
             c.a(obj.P8(i));
          }
          obj.X7(obj.p.r1.kj(obj.x, obj.z, k0.a(obj.y, c.a).or(Integer.valueOf(i)).intValue()).subscribe(new g(obj, l), oh));
          return;
       }
    }
    public final void Y8(int p0,long p1,JsonElement p2){
       j oj = this;
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), p2, this, j.class, "17")) {
          return;
       }
       u.e(oj.p.R().t0(), oj.p.Z2.a(), oj.p.Z2.y(), p0, p1, "GIFT_PANEL", oj.p.Z2.d(), e.r(this.getActivity()), p2, oj.p.c0());
       return;
    }
    public final void Z8(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, j.class, "18")) {
          return;
       }
       if (!this.q.b()) {
          this.r.yk(p0.e()).d(p1).f("SENDING_GIFT").g(p3).e(p2).a();
       }else {
          b.P(b.a, "[LiveFansGroupGiftSendPresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public final void a9(b p0,Gift p1,int p2,boolean p3,String p4,String p5,int p6,f p7){
       j oj = this;
       object oobject = p7;
       j oj1 = j.class;
       if (PatchProxy.isSupport(oj1)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),p4,p5,Integer.valueOf(p6),oobject};
          if (PatchProxy.applyVoid(objArray, this, oj1, "19")) {
             return;
          }
       }
       HashMap hashMap = new HashMap();
       hashMap.put("type", Integer.valueOf(LiveGiftSortType.DEFAULT.getType()));
       b uob = new b(oj.p.Z2.getLiveStreamId(), GiftMessage.createSelfGiftMessage(p1, p2), p1, p2, false, true, 4);
       c uoc = new c("", 0, hashMap, oj.p.b().t5().a(a.class).d6(), null);
       v13.c(new d(oobject, v10, p7.g(), g.a(p6, "")));
       oj.p.V1.G4(v13);
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, j.class, "15")) {
          return;
       }
       if (!this.W8()) {
          return;
       }
       this.p.r1.Tf(c.a("GIFT_PANEL"), new a(true, "POPUP"));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, j.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(j.class, new m());
       }else {
          obj.put(j.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.s = this.q8(h.class);
       this.t = this.q8(j.class);
       e uoe = this.r8("LIVE_SERVICE_MANAGER");
       this.q = uoe;
       this.r = uoe.a(a.class);
       return;
    }
}
