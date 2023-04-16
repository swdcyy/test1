package f21.f;
import android.content.Context;
import android.app.Activity;
import t02.a0;
import ok.x;
import mrd.c;
import hg2.e;
import lp3.i;
import om1.a;
import xp5.g;
import f21.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import io.reactivex.subjects.PublishSubject;
import f21.f$c;
import f21.f$a;
import f21.f$b;
import com.yxcorp.gifshow.models.Gift;
import lm1.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import java.util.Objects;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import com.kwai.framework.model.user.User;
import lm1.f;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.gift.gift.p;
import lm1.e;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;
import f92.b;
import p91.m;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.c;
import fq5.b;
import lp3.e;
import w91.a;
import lp3.c;
import java.util.Map;
import lm1.d;
import lm1.g;
import lm1.g$a;
import ik1.i0;
import f21.f$d;
import androidx.collection.ArrayMap;
import ht5.b$b;
import fg6.a;
import com.google.gson.Gson;
import ht5.d;
import ht5.b;
import ht5.a;
import java.lang.Long;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.common.core.component.recharge.d;
import lnc.a1;
import z12.x;

public class f	// class@0022a9
{
    public final Map a;
    public c b;
    public int c;
    public int d;
    public LiveAudienceSendExplicitGiftConfirmDialog e;
    public final LiveAudienceSendExplicitGiftConfirmDialog$a f;
    public final LiveGuideGiftAnimationView$b g;
    public final Runnable h;
    public final Context i;
    public final Activity j;
    public final a0 k;
    public final x l;
    public final x m;
    public final c n;
    public final e o;
    public final i p;
    public final a q;
    public final g r;
    public final b s;

    public void f(Context p0,Activity p1,a0 p2,x p3,x p4,c p5,e p6,i p7,a p8,g p9,b p10){
       a.p(p2, "livePlayCallerContext");
       a.p(p3, "giftGuideInfoSupplier");
       a.p(p4, "giftGuideGiftSupplier");
       a.p(p6, "liveAudienceSendGiftRealActionService");
       a.p(p7, "liveServiceManager");
       a.p(p8, "liveSendGiftTraceService");
       a.p(p9, "liveInfoManager");
       a.p(p10, "giftBattleBottomBarViewItem");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.n = p5;
       this.o = p6;
       this.p = p7;
       this.q = p8;
       this.r = p9;
       this.s = p10;
       this.a = new HashMap();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.b = publishSubje;
       this.d = 1;
       this.f = new f$c(this);
       this.g = new f$a(this);
       this.h = new f$b(this);
    }
    public final i a(Gift p0,int p1){
       LiveSendGiftBaseTraceInfo obj2;
       Object obj = this;
       Object obj1 = p0;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj2 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(p1), obj, uof, "14");
          if (obj2 != PatchProxyResult.class) {
             return obj2;
          }
       }
       obj2 = obj.q.o6();
       Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo");
       LiveSendGiftBaseTraceInfo liveSendGift = obj2;
       liveSendGift.j(obj1);
       liveSendGift.t(p1);
       liveSendGift.s(1);
       User user = obj.r.I();
       if (user == null) {
          user = new User();
       }
       uof = new f(UserInfo.convertFromQUser(user), p0, "", p.k(obj.d), false, true, 0, p1, false, 1, "", null);
       i oi = new i(liveSendGift);
       oi.g(v15);
       return oi;
    }
    public final Runnable b(){
       return this.h;
    }
    public final String c(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l.get() != null) {
          objArray = this.l.get().mRecoGiftLlsid;
       }else {
          b.Z(LiveLogTag.Live_LINE_GIFT_BATTLE, "[LiveAudienceNormalGiftGuidePresenter][getRecoGiftLlsid]:mGiftGuideInfoSupplier.get\(\) is null");
       }
       String str = "";
       if (TextUtils.x(objArray)) {
          objArray = str;
       }
       if (objArray != null) {
          str = objArray;
       }
       return str;
    }
    public final void d(i p0,String p1,String p2,String p3,int p4){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uof, "15")) {
             return;
          }
       }
       if (!this.p.b()) {
          this.q.yk(p0.e()).d(p2).f(p1).g(p4).e(p3).a();
       }else {
          b.P(b.a, "[LiveAudienceNormalGiftGuidePresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public final void e(i p0,Gift p1,int p2,int p3,String p4,String p5,int p6,int p7,int p8){
       f uof = this;
       f uof1 = f.class;
       if (PatchProxy.isSupport(uof1)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, uof1, "16")) {
             return;
          }
       }
       a0 z2 = uof.k.Z2;
       a.o(z2, "livePlayCallerContext.mLiveBasicContext");
       b uob = new b(z2.getLiveStreamId(), GiftMessage.createSelfGiftMessage(p1, p2), p1, p2, false, true, p6);
       f uof2 = p0.b();
       b uob1 = uof.k.b();
       a.o(uob1, "livePlayCallerContext.liveBasicContext");
       c uoc = uob1.t5().a(a.class);
       a.o(uoc, "livePlayCallerContext.li¡­rvice::class.java\n      \)");
       c uoc1 = new c("", null, null, uoc.d6(), null);
       uof1.c(new d(uof2, v3, uof2.g(), g.f.a(0x1870a, "")));
       uof.k.V1.G4(uof1);
       return;
    }
    public final void f(i p0,Gift p1,int p2,String p3,int p4,int p5,int p6){
       a0 i1;
       f uof = f.class;
       int i = 0;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uof, "8")) {
             return;
          }
       }
       if (this.k.I1 == null) {
          this.d(p0, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][sendNormalGift]send gift service is null", 0x18719);
          return;
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("recoGiftLlsid", this.c());
          ArrayMap uArrayMap = new ArrayMap();
          uArrayMap.put("panel_source", String.valueOf(p6));
          b$b uob = new b$b(p1);
          uob.g(p3);
          uob.e(a.a.q(uArrayMap));
          uob.d(p2);
          uob.f(p4);
          uob.l(p5);
          uob.h(hashMap);
          uob.i(1);
          uob.k(new f$d(this, p1, p3));
          b uob1 = uob.a();
          a.o(uob1, "LiveHttpSendGiftParamsBu¡­\(callback\)\n      .build\(\)");
          uob1.a("key_send_gift_context", p0);
          if (p1.mCanCombo != null) {
             uob1.c = this.d;
             uob1.d = this.c;
             p0.e().k(uob1);
             f uof1 = p0.b();
             if (this.d > 1) {
                i = true;
             }
             uof1.k(i);
             i1 = this.k.I1;
             if (i1 != null) {
                i1.a7(uob1);
             }
             this.d = this.d + 1;
          }else {
             p0.e().k(uob1);
             i1 = this.k.I1;
             if (i1 != null) {
                i1.a7(uob1);
             }
             this.d = 1;
          }
          return;
       }
    }
    public final void g(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "9")) {
          return;
       }
       c uoc = this.p.a(a.class);
       a.o(uoc, "liveServiceManager.getSe¡­Service::class.java\n    \)");
       Map map = uoc.d6();
       a.o(map, "liveServiceManager.getSe¡­    \)\n      .bizLogParams");
       a0 z2 = this.k.Z2;
       a.o(z2, "livePlayCallerContext.mLiveBasicContext");
       String liveStreamId = z2.getLiveStreamId();
       z2 = this.k.Z2;
       a.o(z2, "livePlayCallerContext.mLiveBasicContext");
       String str = z2.d();
       uof = this.k;
       z2 = uof.c;
       a.o(z2, "livePlayCallerContext.mPhoto");
       d.e("LIVE_ROOM_CHEAP_GIFT_BUTTON", this.j, liveStreamId, str, p0, uof.p, z2.getExpTag(), map);
       x.H(a1.p(R.string.arg_RES_7f101c45));
       return;
    }
}
