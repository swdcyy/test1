package com.kuaishou.live.core.show.wishlist.sendgift.c;
import im8.g;
import k51.c;
import java.util.ArrayList;
import com.kuaishou.live.core.show.wishlist.sendgift.c$a;
import com.kuaishou.live.core.show.wishlist.sendgift.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import crd.b;
import lnc.b9;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView;
import t02.a0;
import hg2.e;
import java.util.List;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.math.BigDecimal;
import java.lang.StringBuilder;
import java.text.DecimalFormat;
import com.yxcorp.gifshow.models.Gift;
import lm1.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import lm1.f;
import com.kwai.framework.model.user.User;
import xp5.g;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.gift.gift.p;
import lm1.e;
import lp3.e;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import java.util.Iterator;
import xq3.b;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.widget.FrameLayout;
import android.os.SystemClock;
import com.kuaishou.live.core.show.wishlist.sendgift.c$d;
import ht5.b$b;
import java.util.Map;
import java.util.LinkedHashMap;
import com.kuaishou.live.core.show.wishlist.model.LiveWishListDetailStat;
import ht5.d;
import ht5.b;
import ht5.a;
import w91.a;
import android.content.Context;
import android.widget.GridView;
import java.lang.CharSequence;
import f17.c;
import e17.s;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p91.m;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import lp3.c;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.common.core.component.recharge.d;
import f92.b;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.c;
import lm1.d;
import lm1.g;
import ik1.i0;
import ekd.k1;
import java.util.Random;
import com.kuaishou.live.core.show.wishlist.sendgift.e;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.live.core.basic.utils.e;
import k2b.e0;
import com.google.gson.JsonElement;
import nn2.r1;
import ekd.m1;
import com.kuaishou.live.core.show.wishlist.sendgift.c$c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.wishlist.sendgift.a;
import android.view.View$OnTouchListener;
import zn2.e;
import java.util.HashMap;
import fq5.b;
import xp5.i;
import rp5.a;
import bt5.b;
import ty1.d;

public class c extends c implements g	// class@0012fb
{
    public b A;
    public e B;
    public a C;
    public i D;
    public g E;
    public a F;
    public b G;
    public d H;
    public e I;
    public final List J;
    public c$e K;
    public final a L;
    public View p;
    public int q;
    public Gift r;
    public String s;
    public LiveWishListSendGiftConfirmDialog t;
    public a0 u;
    public GridView v;
    public LiveGiftComboAnimationView w;
    public int x;
    public int y;
    public List z;
    public static boolean M = false;
    public static String sLivePresenterClassName;

    public void c(){
       super();
       this.x = 1;
       this.z = new ArrayList();
       this.J = new ArrayList();
       this.K = new c$a(this);
       this.L = new c$b(this);
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "24")) {
          return;
       }
       x.E(this.t);
       this.t = null;
       this.r = null;
       this.s = null;
       b9.a(this.A);
       c tw = this.w;
       if (tw != null) {
          tw.l();
       }
       this.u.z2.ma();
       this.J.clear();
       return;
    }
    public String P8(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 < 0x2710) {
          return String.valueOf(p0);
       }else {
          return new DecimalFormat("#.0Íò").format(new BigDecimal(((float)p0 / 10000.00f)+"").setScale(1, 4).doubleValue());
       }
    }
    public i R8(Gift p0){
       LiveSendGiftTraceInfo obj = PatchProxy.applyOneRefs(p0, this, c.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C.o6();
       obj.j(p0);
       obj.t(8);
       obj.s(8);
       User user = (this.E.I() != null)? this.E.I(): new User();
       f uof = new f(UserInfo.convertFromQUser(user), this.r, this.s, p.k(this.x), false, true, 0, 8, false, 1, "", null);
       i oi = new i(obj);
       oi.g(8);
       return oi;
    }
    public void S8(i p0,String p1,String p2,String p3,int p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoc, "26")) {
             return;
          }
       }
       if (!this.B.b()) {
          this.C.yk(p0.e()).d(p2).f(p1).g(p4).e(p3).a();
       }else {
          b.P(b.a, "[LiveAudienceWishListDetailSendGiftPresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public void V8(boolean p0,Gift p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "8")) {
          return;
       }
       Iterator iterator = this.J.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob != null) {
             uob.a(p0, p1);
          }
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, c.class, "14")) {
          return;
       }
       c tp = this.p;
       if (tp == null) {
          return;
       }
       tp.findViewById(R.id.live_wish_list_detail_gift_description_container).setVisibility(0);
       View view = this.p.findViewById(R.id.live_wish_list_detail_gift_image_view);
       ViewGroup$MarginLayoutParams layoutParams = view.getLayoutParams();
       layoutParams.bottomMargin = a1.e(0);
       view.setLayoutParams(layoutParams);
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, c.class, "17")) {
          return;
       }
       this.w.l();
       this.w.setVisibility(8);
       this.p.findViewById(R.id.live_wish_list_send_gift).setVisibility(0);
       this.u.z2.ma();
       return;
    }
    public void Y8(i p0,Gift p1,int p2,int p3,String p4,boolean p5){
       c x;
       c uoc = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p4;
       int i = 1;
       if (PatchProxy.isSupport(c.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Integer.valueOf(p3),oobject2,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, c.class, "7")) {
             return;
          }
       }
       if (uoc.u.I1 == null || oobject1 == null) {
          this.S8(p0, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceWishListDetailSendGiftPresenter][sendGift] :send gift error, sendGift: "+oobject1, 0x1871b);
          return;
       }else if(oobject1.mCanCombo != null){
          x = uoc.x;
       }else {
          x = 1;
       }
       uoc.x = x;
       c$d uod = new c$d(this, p1, p5, SystemClock.elapsedRealtime());
       b$b uob = new b$b(oobject1);
       uob.g(oobject2);
       uob.d(i);
       uob.b(uoc.x);
       uob.c(uoc.y);
       uob.f(p2);
       uob.l(p3);
       LinkedHashMap linkedHashMa = PatchProxy.apply(null, this, c.class, "11");
       if (linkedHashMa != PatchProxyResult.class) {
       }else {
          linkedHashMa = new LinkedHashMap();
          linkedHashMa.put("is_wishlist_send", "1");
          linkedHashMa.put("wishlist_id", uoc.z.get(uoc.q).mWishId);
       }
       uob.h(linkedHashMa);
       uob.i(0);
       uob.k(v13);
       b uob1 = uob.a();
       p0.e().k(uob1);
       p0.g(f.a(uob1));
       uob1.a("key_send_gift_context", p0);
       uoc.u.I1.a7(uob1);
       if (oobject1.mCanCombo != null) {
          i = i + uoc.x;
       }
       uoc.x = i;
       return;
    }
    public void Z8(i p0){
       int i = this;
       a uoa = a.class;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, i, uoc, "4")) {
          return;
       }
       String str = null;
       String str1 = null;
       Object[] objArray = null;
       if (!p.m(i.r)) {
          this.X8();
          s.s(i.v.getContext(), a1.p(R.string.arg_RES_7f101c45), 0);
          if (!PatchProxy.applyVoid(objArray, i, uoc, "23") && i.v != null) {
             c u = i.u;
             d.f("LIVE_ROOM_SEND_GIFT", this.getActivity(), i.u.Z2.getLiveStreamId(), i.u.Z2.d(), u.p, u.c.getExpTag(), i.u.Z2.t5().a(uoa).d6());
          }
          this.S8(p0, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceWishListDetailSendGiftPresenter][sendSingleGiftIfNecessary]", 0x1870a);
          super(i.u.Z2.getLiveStreamId(), GiftMessage.createSelfGiftMessage(i.r, 1), i.r, 1, false, true, 0);
          f uof = p0.b();
          uoc = new c("", 0, null, i.B.a(uoa).d6(), null);
          this.c(new d(uof, v2, uof.g(), g.a(0x1870a, "")));
          i.u.V1.G4(this);
       }else if(PatchProxy.applyVoid(objArray, i, uoc, "5")){
          i.y = k1.b.nextInt(0x989680);
       }
       this.Y8(p0, i.r, 0, str, i.s, str1);
       if (!PatchProxy.applyVoid(objArray, i, uoc, "12")) {
          this.S8(i.R8(i.r), "PRE_SEND_GIFT", "CLIENT_AUDIENCE_WISH_LIST_CONTINUE_BUTTON_SHOW", "[LiveAudienceWishListDetailSendGiftPresenter][showComboSendView]: combo button show", 1);
          i.w.setVisibility(4);
          i.w.post(new e(i));
       }
       r1.v(i.u.R().t0(), i.u, i.r.mId, 1, false, 0, 1, e.r(this.getActivity()), 0, null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a285d);
       LiveGiftComboAnimationView liveGiftComb = m1.f(p0, R.id.live_wish_list_combo_send_view);
       this.w = liveGiftComb;
       liveGiftComb.setOnClickListener(new c$c(this));
       this.w.setOnTouchListener(a.b);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "28");
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
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       a0 uoa0 = this.q8(a0.class);
       this.u = uoa0;
       e uoe = uoa0.b().t5();
       this.B = uoe;
       this.C = uoe.a(a.class);
       this.D = this.B.a(i.class);
       this.E = this.B.a(g.class);
       this.F = this.B.a(a.class);
       this.G = this.B.a(b.class);
       this.H = this.B.a(d.class);
       return;
    }
}
