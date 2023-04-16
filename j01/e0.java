package j01.e0;
import im8.g;
import k51.c;
import j01.e0$a;
import lm1.i;
import com.yxcorp.gifshow.models.Gift;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.robust.PatchProxyResult;
import xp5.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.common.encryption.model.SendingGiftParam$b;
import com.kuaishou.common.encryption.model.SendingGiftParam;
import lp3.c;
import lp3.e;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import java.lang.System;
import mk1.h;
import tkd.b;
import tkd.d;
import nl9.r;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.common.encryption.model.enums.GiftUserSource;
import java.lang.Enum;
import android.os.SystemClock;
import k2b.u1;
import java.lang.Number;
import tk1.b;
import java.lang.StringBuilder;
import android.util.SparseArray;
import z12.e;
import com.kuaishou.live.core.show.gift.GiftMessage;
import fq5.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import java.util.HashMap;
import d61.e0;
import p91.m;
import xp5.i;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.Map;
import z12.x;
import ht5.c;
import fg6.a;
import com.google.gson.Gson;
import lm1.g;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import com.google.gson.JsonElement;
import em1.c0;
import em1.b0;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import com.kuaishou.live.external.invoke.deserializer.gift.PacketGift;
import i12.a;
import brd.t;
import qj1.h;
import erd.o;
import j01.c0;
import erd.g;
import cjd.e;
import j01.d0;
import j01.e0$b;
import crd.b;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveGiftPanelItemView;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView;
import j01.h0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mk1.b;
import el1.a;
import om1.a;

public class e0 extends c implements g	// class@0029f0
{
    public View p;
    public HorizontalPageIndicator q;
    public JsonElement r;
    public LiveGiftGridView s;
    public h t;
    public a0 u;
    public e v;
    public a w;
    public b x;
    public a y;
    public e0$c z;
    public static String sLivePresenterClassName = "GiftBoxSendPacketGiftToAnchorPresenter";

    public void e0(){
       super();
       this.r = null;
       this.z = new e0$a(this);
    }
    public void P8(i p0,Gift p1,UserInfo p2,int p3,boolean p4){
       LiveGiftToAudienceMessage liveGiftToAu;
       String str1;
       Object obj = this;
       object oobject = p1;
       object oobject1 = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       e0 uoe0 = e0.class;
       int i = 4;
       int i1 = 2;
       int i2 = 1;
       int i3 = 5;
       int i4 = 3;
       int i5 = 0;
       if (PatchProxy.isSupport(uoe0)) {
          Object[] objArray = new Object[i3];
          objArray[i5] = p0;
          objArray[i2] = oobject;
          objArray[i1] = oobject1;
          objArray[i4] = Integer.valueOf(p3);
          objArray[i] = Boolean.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, obj, uoe0, "3")) {
             return;
          }
       }
       SendingGiftParam$b uob = SendingGiftParam.newBuilder();
       uob.e(oobject.mId);
       uob.g(obj.v.a(og).getLiveStreamId());
       uob.k(Long.parseLong(QCurrentUser.me().getId()));
       uob.i(System.currentTimeMillis());
       uob.b(System.currentTimeMillis());
       uob.c(String.valueOf(obj.t.H));
       uob.d(p3);
       if (d.a(0x691527a8).OB(obj.u.c)) {
          uob.j(GiftUserSource.LIVE_FANS_TOP.ordinal());
       }else {
          uob.j(GiftUserSource.DEFAULT.ordinal());
       }
       long l = SystemClock.elapsedRealtime();
       String str = u1.f();
       String[] obj1 = PatchProxy.applyOneRefs(oobject, obj, uoe0, "5");
       int i6 = (obj1 != patchProxyRe)? obj1.intValue(): obj.y.B2(oobject);
       int i7 = i6;
       obj1 = new String[9];
       obj1[i5] = "taskSessionId="+str;
       obj1[i2] = "giftId=";
       obj1[i1] = String.valueOf(oobject.mId);
       obj1[i4] = "giftCount=";
       obj1[i] = String.valueOf(p3);
       obj1[5] = "giftComboCount=";
       e0 t = obj.t;
       int i8 = 6;
       obj1[i8] = String.valueOf(t.I.get(t.H));
       obj1[7] = "giftIndex=";
       obj1[8] = String.valueOf(i7);
       e.c("LiveAudienceGiftBox", "sendPacketGiftStart", obj1);
       e0 t1 = obj.t;
       Integer integer = t1.I.get(t1.H);
       if (integer == null) {
          integer = Integer.valueOf(i5);
          u1.R("gift_combo_value_error", "httpSendPacketGift getComboValue null", i4);
       }
       Gift mId = oobject.mId;
       Gift mGiftType = oobject.mGiftType;
       i6 = integer.intValue();
       h h = obj.t.H;
       if (PatchProxy.isSupport(uoe0)) {
          Object[] objArray1 = new Object[i8];
          objArray1[i5] = oobject1;
          objArray1[1] = Integer.valueOf(mId);
          objArray1[2] = Long.valueOf(mGiftType);
          objArray1[i4] = Integer.valueOf(p3);
          objArray1[4] = Integer.valueOf(i6);
          objArray1[5] = Integer.valueOf(h);
          FeedLogCtx obj2 = PatchProxy.apply(objArray1, obj, uoe0, "4");
          if (obj2 != patchProxyRe) {
             liveGiftToAu = obj2;
          label_0199 :
             str1 = str;
          label_01ac :
             HashMap hashMap = new HashMap();
             hashMap.put("expTagList", e0.b());
             obj2 = obj.u.b().t5().a(i.class).c0();
             if (obj2 != null) {
                hashMap.put("interStid", obj2.stidContainer);
             }
             hashMap.put("commonStid", b.a(0x4b316083).i(obj.u.R().t0().o(), null));
             x.b(hashMap, obj.u);
             c uoc = new c();
             Gson a = a.a;
             uoc.mLogExtraInfo = a.q(hashMap);
             g og1 = new g(null, null, 0, "", null);
             uoe0 = this;
             d0 uod0 = new d0(uoe0, p1, liveGiftToAu, p0, p3, l, str1, i7, v30);
             e0$b uob1 = i5;
             e0$b uob2 = i5;
             uob1 = new e0$b(uoe0, p0, l, str1, liveGiftToAu, p3, i7, p1, v30);
             b0.a().a(p0.e().f(), obj.v.a(og).getLiveStreamId(), oobject.mItemId, p3, obj.t.H, System.currentTimeMillis(), oobject1.mId, a.q(uoc), a.a(obj.u)).retryWhen(new h()).doOnNext(new c0(obj)).map(new e()).subscribe(str, uob2);
             return;
          }
       }
       if (!TextUtils.n(oobject1.mId, obj.u.b().d())) {
          liveGiftToAu = LiveGiftToAudienceMessage.createSelfToAudienceGiftMessage(mId, mGiftType, p3, h, p2);
          goto label_0199 ;
       }else {
          str1 = str;
          liveGiftToAu = GiftMessage.createSelfGiftMessage(mId, mGiftType, p3, i6, h);
          goto label_01ac ;
       }
    }
    public void R8(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(e0.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, e0.class, "6")) {
          return;
       }
       if (!this.v.b()) {
          this.w.yk(p0.e()).d(p1).f("SENDING_GIFT").g(p3).e(p2).a();
       }else {
          b.P(b.a, "[GiftBoxSendPacketGiftToAnchorPresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "2")) {
          return;
       }
       LiveGiftPanelItemView liveGiftPane = m1.f(p0, R.id.packet_gift_layout);
       this.p = liveGiftPane.getTipsHostView();
       this.q = liveGiftPane.getHorizontalPageIndicator();
       this.s = liveGiftPane.getGridView();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e0.class, new h0());
       }else {
          obj.put(e0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "1")) {
          return;
       }
       this.t = this.q8(h.class);
       this.u = this.q8(a0.class);
       this.v = this.r8("LIVE_SERVICE_MANAGER");
       this.x = this.q8(b.class);
       this.y = this.q8(a.class);
       this.w = this.v.a(a.class);
       return;
    }
}
