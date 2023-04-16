package com.kuaishou.live.audience.component.comments.send.e;
import im8.g;
import k51.c;
import s93.k;
import com.kwai.feature.api.live.service.show.comments.sendcomment.CustomerServiceCommentInfo;
import java.util.HashSet;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.audience.component.comments.send.e$a;
import com.kuaishou.live.audience.component.comments.send.e$b;
import p02.u;
import gy0.b;
import gy0.e;
import com.kuaishou.live.audience.component.comments.send.e$c;
import com.kuaishou.live.audience.component.comments.send.e$d;
import com.kuaishou.live.audience.component.comments.send.e$e;
import com.kuaishou.live.audience.component.comments.send.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hy0.p;
import wx0.m;
import w91.a;
import zx0.u;
import n81.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ne1.a;
import t02.a0;
import ne1.b;
import gy0.n;
import ne1.c;
import ft5.d;
import zx0.u$a;
import mq5.h;
import mq5.b;
import kq5.b;
import p91.m;
import androidx.fragment.app.c$b;
import m91.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import gy0.g;
import vq5.b;
import vq5.d;
import gy0.f;
import gy0.c;
import java.lang.Runnable;
import kv1.a;
import e93.f;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Integer;
import java.lang.Boolean;
import hy0.y;
import ft5.b;
import hy0.p$b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import ne1.k;
import ne1.d;
import lp3.c;
import lp3.i;
import brd.t;
import android.os.SystemClock;
import com.kwai.robust.PatchProxyResult;
import y47.k;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import iz1.a;
import pf1.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import pf1.f$a$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import android.app.Activity;
import com.kuaishou.live.core.basic.utils.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import pf1.f$a;
import gy0.i;
import erd.g;
import cjd.e;
import erd.o;
import gy0.k;
import com.kuaishou.live.audience.component.comments.send.c;
import crd.b;
import java.lang.System;
import ow0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.action.c;
import wo1.a;
import java.util.Iterator;
import ft5.e;
import java.lang.Float;
import va1.z;
import java.util.Objects;
import com.kuaishou.live.common.core.component.comments.util.LiveCommentLogger;
import lnc.i3;
import pf1.b;
import gy0.h;
import com.kuaishou.live.audience.component.comments.send.d;
import gq5.f;
import gy0.s;
import java.util.Map;
import java.util.HashMap;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import tj3.e;
import wx0.m$b;
import n91.f;

public class e extends c implements g	// class@000abf
{
    public final CustomerServiceCommentInfo A;
    public i B;
    public a C;
    public f D;
    public JsonElement E;
    public float F;
    public String G;
    public final HashSet H;
    public final MutableLiveData I;
    public boolean J;
    public boolean K;
    public String L;
    public boolean M;
    public boolean N;
    public LiveActivityCommentQueryUserConsumedResponse O;
    public b P;
    public b Q;
    public final c R;
    public final b S;
    public final h T;
    public final c$b U;
    public final g V;
    public d W;
    public a p;
    public LiveBizParam q;
    public a0 r;
    public e s;
    public m t;
    public d u;
    public LiveStreamFeedWrapper v;
    public a w;
    public p$b x;
    public m$b y;
    public u$a z;
    public static final long X = 0x0;
    public static String sLivePresenterClassName = "LiveAudienceSendCommentsPresenter";

    static {
       long l = (k.b())? 0: 1000;
       e.X = l;
    }
    public void e(){
       super();
       this.A = new CustomerServiceCommentInfo();
       this.F = 0x3f800000;
       this.H = new HashSet();
       this.I = new MutableLiveData();
       this.K = true;
       this.L = "UNKNOWN";
       this.P = new e$a(this);
       this.Q = new e$b(this);
       u ou = new u();
       this.R = ou;
       this.S = new b(this);
       this.T = new e(this);
       this.U = new e$c(this);
       this.V = new e$d(this);
       this.W = new e$e(this);
       this.U7(new a());
       this.U7(new p());
       this.U7(new m(this.C));
       this.U7(new u(ou));
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          a uoa = new a(this.r.X0);
          this.p = uoa;
          n on = new n(this);
          if (!PatchProxy.applyVoidOneRefs(on, uoa, a.class, "4")) {
             uoa.a.o(on);
          }
       }
       this.z.V2(this.W);
       this.r.D2.Km(this.T);
       this.t.k().c(this.U);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY_GUEST,AudienceBizRelation.CHAT,AudienceBizRelation.VOICE_PARTY_THEATER,AudienceBizRelation.VOICE_PARTY_THEATER_PORTRAIT_FULL_SCREEN,AudienceBizRelation.VOICE_PARTY_THEATER_LANDSCAPE_FULL_SCREEN,AudienceBizRelation.GAME_INTERACTIVE_VOICE_GUEST};
       this.r.N().u5(this.S, uoaArray);
       if (!PatchProxy.applyVoid(objArray, this, uoe, "6")) {
          this.u.t5("showCommentEditor", new g(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "8")) {
          this.u.t5("sendcomment", new f(this));
       }
       this.w.a(new c(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       f.g(this);
       this.r.D2.le(this.T);
       this.t.k().a(this.U);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY_GUEST,AudienceBizRelation.CHAT,AudienceBizRelation.VOICE_PARTY_THEATER,AudienceBizRelation.VOICE_PARTY_THEATER_PORTRAIT_FULL_SCREEN,AudienceBizRelation.VOICE_PARTY_THEATER_LANDSCAPE_FULL_SCREEN,AudienceBizRelation.GAME_INTERACTIVE_VOICE_GUEST};
       this.r.N().G5(this.S, uoaArray);
       this.H.clear();
       this.u.Z4("showCommentEditor");
       this.u.Z4("sendcomment");
       return;
    }
    public void P8(BaseEditorFragment$g p0,int p1,String p2,boolean p3){
       e uoe = this;
       BaseEditorFragment$g og = p0;
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, e.class, "9")) {
          return;
       }
       e r = uoe.r;
       t ot = 1;
       boolean b = (r.j != null || og.b != null)? true: false;
       if (y.a(r) && (uoe.M != null && uoe.P.M())) {
          uoe.x.a(og);
       }else if(p3){
          b.P(LiveLogTag.COMMENT.appendTag("LiveAudienceSendCommentsPresenter"), "common live/comment not request, not hit probability");
       }else if(PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(b), Integer.valueOf(p1), p2, this, e.class, "19")){
          String str = 2;
          int i = (b)? 2: 1;
          t ot1 = uoe.B.a(d.class).k9(i, p1, p2, og.c, og.o, b, og.h, k.j(og.c));
          long l = SystemClock.elapsedRealtime();
          BaseEditorFragment$g c = og.c;
          Object[] objArray = null;
          String[] stringArray = PatchProxy.apply(objArray, uoe, e.class, "2");
          if (stringArray != PatchProxyResult.class) {
          }else {
             a0 e stringArray1 = uoe.r;
             if (stringArray1 != null) {
                stringArray1 = stringArray1.v1;
                if (stringArray1 != null && (stringArray1.a() && QCurrentUser.ME.isLogined())) {
                   stringArray = uoe.r.v1.g();
                }
             }
             stringArray = objArray;
          }
          boolean b2 = k.k(c, stringArray);
          ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
          moreInfoPack.text = og.c;
          String str1 = (uoe.r.i != null)? "POST": "COMMON";
          moreInfoPack.type = str1;
          if (p1 == str) {
             moreInfoPack.name = "CNY_COMMENT";
          }else if(uoe.M != null){
             moreInfoPack.name = "FLOATING_COMMENT";
          }else if(uoe.P.Xd()){
             moreInfoPack.name = "CUSTOMER_SERVICE";
          }else {
             moreInfoPack.name = "COMMENT";
          }
          if (a.c(uoe.r.c) && !PatchProxy.applyVoid(objArray, objArray, f.class, "13")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "OP_ACTIVITY_POST_LIVE_COMMENT";
             u1.u(ot, uElementPack, objArray);
          }
          f$a$a uoa$a = new f$a$a();
          uoa$a.j(uoe.r.Z2.b());
          uoa$a.h(uoe.r.Z2.a());
          uoa$a.c("WORD");
          str1 = (og.i != null)? "VOICE": "CLICK";
          uoa$a.k(str1);
          uoa$a.f(b2);
          uoa$a.n(og.k);
          uoa$a.b(og.l);
          uoa$a.l(e.s(this.getActivity()));
          e l1 = (TextUtils.x(og.d))? uoe.L: og.d;
          uoa$a.m(l1);
          uoa$a.g(uoe.r.c0());
          uoa$a.i(moreInfoPack);
          f.d(uoa$a.a());
          k ok = stringArray;
          e uoe1 = this;
          k ok1 = stringArray;
          ok = new k(uoe1, p0, b2, l, moreInfoPack);
          c uoc = v5;
          c uoc1 = v5;
          uoc = new c(uoe1, p1, p0, b2, l, moreInfoPack);
          uoe.X7(ot1.doOnNext(new i(uoe)).map(new e()).subscribe(ok1, uoc1));
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putLong(b.d("user")+"liveAudienceCommentLastTimeMs", System.currentTimeMillis());
          g.a(uEditor);
          c.a(4, uoe.v.mEntity);
       }
       if (!PatchProxy.applyVoidOneRefs(og, uoe, e.class, "10")) {
          r = uoe.r;
          boolean b1 = false;
          r.i = b1;
          r.j = b1;
          a0 w2 = r.W2;
          if (w2 != null) {
             w2.a();
          }
          Iterator iterator = uoe.H.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(og.c);
          }
       }
       return;
    }
    public void R8(BaseEditorFragment$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "12")) {
          return;
       }
       if (this.K == null) {
          this.K = true;
          return;
       }else {
          p0 = p0.c;
          this.G = p0;
          a0 v1 = this.r.v1;
          if (v1 != null) {
             v1.f(p0);
          }
          return;
       }
    }
    public boolean S8(float p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uoe, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return (z.a(p0) ^ 0x01);
    }
    public void V8(CharSequence p0,boolean p1,boolean p2,String p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, e.class, "21")) {
          return;
       }
       this.W8(p0, p1, p2, p3, 0xbf800000, 0);
       return;
    }
    public void W8(CharSequence p0,boolean p1,boolean p2,String p3,float p4,int p5){
       e uoe = e.class;
       int i = 1;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Boolean.valueOf(p2),p3,Float.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoe, "22")) {
             return;
          }
       }
       uoe = this.z;
       e tp = this.p;
       Objects.requireNonNull(tp);
       Object[] objArray1 = null;
       String str = PatchProxy.apply(objArray1, tp, a.class, "6");
       if (str != PatchProxyResult.class) {
       }else {
          str = tp.a.j();
       }
       uoe.b(str);
       uoe = this.t;
       if (!PatchProxy.applyVoidTwoRefs(uoe, p3, objArray1, LiveCommentLogger.class, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_COMMENT_CARD";
          i3 oi3 = i3.f();
          oi3.d("source", p3);
          uElementPack.params = oi3.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = uoe.a();
          u1.C0("", uoe.b(), i, uElementPack, uContentPack);
       }
       this.L = p3;
       this.z.d(p3);
       this.X7(this.z.a(p0, p5, p1, p2, this.Q.h()).doOnNext(new h(p4)).subscribe(this.V, d.b));
       return;
    }
    public final boolean X8(int p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoe, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.K = p1;
       boolean b = false;
       if (this.P.M()) {
          return b;
       }else {
          p1.i = b;
          if (p0 == 2) {
             b = 1;
          }
          e tG = this.G;
          int i = b ^ 0x01;
          String str = (b)? "BOTTOM_STICKER": "BOTTOM_BUTTON";
          this.V8(tG, i, b, str);
          this.G = "";
          this.r.g2.t();
          return true;
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new s());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.s8(LiveBizParam.class);
       this.r = this.q8(a0.class);
       this.s = this.r8("LIVE_LOG_REPORTER");
       this.t = this.r8("LIVE_BASIC_CONTEXT");
       this.u = this.r8("LIVE_ROUTER_SERVICE");
       this.v = this.r8("LIVE_PHOTO");
       this.w = this.q8(a.class);
       this.x = this.q8(p$b.class);
       this.y = this.q8(m$b.class);
       this.B = this.r8("LIVE_SERVICE_MANAGER");
       this.z = this.q8(u$a.class);
       this.D = this.B.a(f.class);
       this.C = this.B.a(a.class);
       return;
    }
}
