package lz9.b0;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import hs7.d;
import rp7.a;
import jh5.a;
import m9a.l;
import m9a.l$b;
import java.lang.String;
import m9a.l$c;
import lz9.a;
import lz9.b0$b;
import lz9.b0$c;
import lz9.b0$d;
import lz9.b0$e;
import lz9.b0$f;
import lz9.b0$g;
import lz9.b0$h;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import uw9.r3;
import android.content.SharedPreferences;
import im8.f;
import java.lang.Boolean;
import xx9.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import rf5.u;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import ak5.j;
import tkd.b;
import tkd.d;
import ap5.a;
import wh5.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import qp7.x0;
import qp7.b;
import ks7.h0;
import qp7.a;
import v6a.m0;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthCommentPlugin;
import jf5.a;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import ks7.g0;
import o2a.a;
import qvb.q;
import qvb.j;
import ayb.i;
import qp7.b1;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import lz9.w;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger;
import lz9.c0;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$f;
import lz9.q;
import java.util.BitSet;
import lz9.r;
import l9a.a;
import java.util.List;
import qp7.g;
import hs7.e;
import lz9.t;
import kotlin.jvm.internal.a;
import lz9.g;
import lz9.j;
import lz9.c;
import lz9.h;
import lz9.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.g;
import t45.d;
import brd.z;
import lz9.e;
import com.yxcorp.gifshow.comment.e$b;
import com.yxcorp.gifshow.comment.e;
import androidx.viewpager.widget.ViewPager$i;
import lz9.b0$i;
import jta.c;
import r7a.f;
import e8a.d1;
import lz9.n;
import java.lang.Runnable;
import ekd.k1;
import lm5.c;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import lz9.v;
import zca.s;
import lz9.u;
import zca.d;
import lz9.d;
import qp7.c;
import lz9.k;
import lz9.x;
import lz9.b;
import lz9.b0$a;
import lz9.m;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import qp7.d;
import ks7.a;
import m9a.t$c;
import el5.l;
import bk5.c;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.User;
import qa6.b;
import com.kuaishou.android.model.mix.QComment;
import lz9.p;
import msd.l;
import ek9.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import uy6.h;
import uy6.b;
import lz9.b0$k;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel;
import com.yxcorp.gifshow.detail.HoverHelper;
import com.yxcorp.gifshow.detail.HoverHelper$Companion;
import java.util.HashMap;
import ks7.h0$e;
import pp7.b;
import java.lang.Integer;

public class b0 extends DispatchBaseElement	// class@002ed6
{
    public BaseFragment A;
    public a B;
    public a C;
    public c D;
    public u E;
    public boolean F;
    public boolean G;
    public boolean H;
    public PhotoDetailParam I;
    public List J;
    public f K;
    public t L;
    public int M;
    public b N;
    public GrowthCommentPlugin O;
    public boolean P;
    public boolean Q;
    public ActionTrigger R;
    public a S;
    public c T;
    public long U;
    public a U0;
    public boolean V;
    public IMediaPlayer$OnInfoListener V0;
    public f W;
    public final d W0;
    public List X;
    public final c X0;
    public final l Y;
    public final e$b Y0;
    public b0$k Z;
    public final q Z0;
    public final q a1;
    public final b1 b1;
    public final ViewPager$i c1;
    public OppoPreventBurnInHelper d1;
    public QPhoto t;
    public a u;
    public e v;
    public a w;
    public HashMap x;
    public SlidePlayViewModel y;
    public o z;
    public static final int e1;

    public void b0(){
       super(d.g, null);
       this.P = false;
       this.Q = false;
       this.V = false;
       this.Y = new l(3, 1, new l$b("CommentElement"));
       this.V0 = new a(this);
       this.W0 = new b0$b(this);
       this.X0 = new b0$c(this);
       this.Y0 = new b0$d(this);
       this.Z0 = new b0$e(this);
       this.a1 = new b0$f(this);
       this.b1 = new b0$g(this);
       this.c1 = new b0$h(this);
    }
    public void b0(a p0){
       super(d.g, p0);
       this.P = false;
       this.Q = false;
       this.V = false;
       this.Y = new l(3, 1, new l$b("CommentElement"));
       this.V0 = new a(this);
       this.W0 = new b0$b(this);
       this.X0 = new b0$c(this);
       this.Y0 = new b0$d(this);
       this.Z0 = new b0$e(this);
       this.a1 = new b0$f(this);
       this.b1 = new b0$g(this);
       this.c1 = new b0$h(this);
    }
    public static boolean n0(b0 p0,IMediaPlayer p1,int p2,int p3){
       boolean b;
       Objects.requireNonNull(p0);
       if (p2 == 0x2775 && !PatchProxy.applyVoid(null, p0, b0.class, "8")) {
          if (p0.t.enableShowQuickCommentGuide() && (!r3.a.getBoolean("isShowNewGuyDirection", false) && (p0.Q == null && (!p0.W.get().booleanValue() && !p0.U0.c())))) {
             b0 y = p0.y;
             if (y != null && (!y.b1() && (p0.E.u() && (NasaSlidePlayExperimentUtil.d() && (!j.o().t() || (!d.a(-2061018968).AT() && (!a.f() && !p0.p0(p0.A.getActivity())))))))) {
                b = true;
             label_008a :
                p0.E().g(b);
             }
          }
       label_0089 :
          b = false;
          goto label_008a ;
       }
       return false;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b0.class, "1")) {
       }else {
          this.t = p0.c.mPhoto;
          this.u = p0.n;
          this.v = p0.l;
          this.w = p0.o;
          this.x = p0.I;
          a b = p0.b;
          this.A = b;
          this.y = SlidePlayViewModel.B0(b.getParentFragment());
          this.C = p0.j;
          this.D = p0.k;
          this.I = p0.c;
          this.J = p0.w;
          this.K = p0.H;
          this.L = p0.K;
          this.O = d.a(-1895938724);
          this.S = p0.q0;
          this.E = p0.v.R;
          this.U0 = p0.r;
          this.C.getPlayer().addOnInfoListener(this.V0);
          this.W = p0.y;
          PatchProxy.onMethodExit(b0.class, "1");
       }
       return;
    }
    public a f0(a p0){
       h0 oh0 = PatchProxy.applyOneRefs(p0, this, b0.class, "25");
       if (oh0 != PatchProxyResult.class) {
       }else {
          oh0 = new h0(p0);
       }
       return oh0;
    }
    public void j0(boolean p0){
       g e;
       z a;
       g0 og0 = g0.class;
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob0, "2")) {
          return;
       }
       this.B = new a();
       this.r0();
       this.u.h(this.Z0);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob0, "18") || (!this.I.isThanos() && !d.a(0x4f878389).zO())) {
          this.y.e(this.a1);
          this.i(this.b1);
          this.j(this.H().I1.subscribe(new w(this), Functions.e));
       }
    label_006e :
       String str = "3";
       boolean b = false;
       if (!PatchProxy.applyVoid(objArray, this, uob0, str) && (this.t.hasGodCommentShow() || (this.t.getPhotoMeta() != null && (this.t.getPhotoMeta().mCommentBubble == true && this.Y.e())))) {
          ActionTrigger uActionTrigg = new ActionTrigger(new c0(this));
          this.R = uActionTrigg;
          uActionTrigg.h = new q(this);
          int i = 4;
          int[] ointArray = new int[i]{6,5,2,7};
          if (!PatchProxy.applyVoidOneRefs(ointArray, uActionTrigg, ActionTrigger.class, str)) {
             BitSet uBitSet = new BitSet();
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                uBitSet.set(ointArray[i1]);
             }
             uActionTrigg.j = uBitSet;
          }
          b0 tR = this.R;
          tR.k = true;
          tR.a = new r(this);
          b0 tS = this.S;
          Objects.requireNonNull(tS);
          if (!PatchProxy.applyVoidOneRefs(tR, tS, a.class, "1")) {
             tS.a.add(tR);
          }
       }
    label_00f4 :
       e uoe = this.D();
       t ot = new t(this);
       Objects.requireNonNull(uoe);
       b uob = PatchProxy.applyOneRefs(ot, uoe, e.class, "11");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(ot, "onNext");
          uob = uoe.f.subscribe(ot);
          a.o(uob, "updateCommentCountSubject.subscribe\(onNext\)");
       }
       this.j(uob);
       this.j(this.L.subscribe(new g(this)));
       b ti = this.i;
       j oj = new j(this);
       e = Functions.e;
       Objects.requireNonNull(ti);
       b uob1 = PatchProxy.applyTwoRefs(oj, e, ti, og0, "6");
       if (uob1 != PatchProxyResult.class) {
       }else {
          a.p(oj, "onNext");
          a.p(e, "onError");
          uob1 = ti.b.subscribe(oj, e);
          a.o(uob1, "commentLongClickSubject.subscribe\(onNext, onError\)");
       }
       this.j(uob1);
       ti = this.i;
       c uoc = new c(this);
       Objects.requireNonNull(ti);
       uob1 = PatchProxy.applyTwoRefs(uoc, e, ti, og0, "10");
       if (uob1 != PatchProxyResult.class) {
       }else {
          a.p(uoc, "onNext");
          a.p(e, "onError");
          uob1 = ti.c.subscribe(uoc, e);
          a.o(uob1, "quickEmojiTipBubbleShown¡­ubscribe\(onNext, onError\)");
       }
       this.j(uob1);
       ti = this.i;
       h oh = new h(this);
       Objects.requireNonNull(ti);
       uob1 = PatchProxy.applyTwoRefs(oh, e, ti, og0, "8");
       if (uob1 != PatchProxyResult.class) {
       }else {
          a.p(oh, "onNext");
          a.p(e, "onError");
          uob1 = ti.d.subscribe(oh, e);
          a.o(uob1, "quickEmojiItemClick.subscribe\(onNext, onError\)");
       }
       this.j(uob1);
       this.j(this.i.a(new i(this), e));
       RxBus f = RxBus.f;
       a = d.a;
       this.j(f.f(g.class).observeOn(a).subscribe(new e(this)));
       this.v.b(this.Y0);
       this.P = b;
       this.y.i(this.c1);
       this.i(new b0$i(this));
       this.J.add(this.W0);
       this.K.a(this.X0);
       if (this.H().b2.c != null) {
          k1.o(new n(this));
       }
       this.j(f.g(c.class, RxBus$ThreadMode.MAIN).subscribe(new v(this), e));
       this.j(f.f(s.class).observeOn(a).subscribe(new u(this)));
       this.j(f.f(d.class).subscribe(new d(this), e));
       if (this.t.isNeedShowGodComment()) {
          this.E().j(true);
       }
       g0 og01 = this.A();
       k b1 = k.b;
       Objects.requireNonNull(og01);
       b uob2 = PatchProxy.applyTwoRefs(b1, e, og01, og0, "4");
       if (uob2 != PatchProxyResult.class) {
       }else {
          a.p(b1, "onNext");
          a.p(e, "onError");
          uob2 = og01.e.subscribe(b1, e);
          a.o(uob2, "danmakuTipBubbleSubject.subscribe\(onNext, onError\)");
       }
       this.j(uob2);
       this.j(this.H().A1.subscribe(new x(this)));
       this.j(this.U0.h(new b(this)));
       return;
    }
    public void k0(boolean p0){
       if (PatchProxy.isSupport(b0.class)) {
          PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b0.class, "28");
       }
       return;
    }
    public void l0(boolean p0){
       if (PatchProxy.isSupport(b0.class)) {
          PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b0.class, "29");
       }
       return;
    }
    public void m0(boolean p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob0, "14")) {
          return;
       }
       this.E().j(false);
       this.J.remove(this.W0);
       this.K.c(this.X0);
       this.u.f(this.Z0);
       this.v.j(this.Y0);
       this.y.g(this.c1);
       this.y.b(this.a1);
       b0 tR = this.R;
       if (tR != null) {
          uob0 = this.S;
          Objects.requireNonNull(uob0);
          if (!PatchProxy.applyVoidOneRefs(tR, uob0, a.class, "2")) {
             uob0.a.remove(tR);
          }
       }
       k1.o(new b0$a(this));
       this.Z = null;
       return;
    }
    public void o0(){
       if (PatchProxy.applyVoid(null, this, b0.class, "15")) {
          return;
       }
       this.j(this.H().u1.subscribe(m.b));
       return;
    }
    public final boolean p0(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b0.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return SlideGuideManager.a().b(p0);
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, b0.class, "27");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public final void q0(t$c p0){
       c b;
       b0 uob0 = b0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob0, "11")) {
          return;
       }
       if (this.V != null) {
          return;
       }
       this.V = true;
       if (p0 != null && p0.a != null) {
          l.b().d(p0.a);
          QComment qComment = this.t.newComment(p0.a.a+p0.a.a+p0.a.a, null, null, b.a(QCurrentUser.me()));
          if (!PatchProxy.applyVoidOneRefs(qComment, this, uob0, "12")) {
             this.j(this.v.i(this.A.getActivity(), a.a(new p(this, qComment))));
          }
          uob0 = this.t;
          b0 tA = this.A;
          b = p0.a.b;
          if (!PatchProxy.applyVoidThreeRefs(uob0, tA, b, null, b0.class, "24")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LONG_PRESS_COMMENT_CARD_EMOJI";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("emoji_id", b);
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(uob0.mEntity);
             u1.M("3960102", tA, 1, uElementPack, uContentPack, null);
          }
       }
    label_00b5 :
       return;
    }
    public c r(){
       g0 og0 = PatchProxy.apply(null, this, b0.class, "26");
       if (og0 != PatchProxyResult.class) {
       }else {
          og0 = new g0();
       }
       return og0;
    }
    public void r0(){
       if (PatchProxy.applyVoid(null, this, b0.class, "7")) {
          return;
       }
       if (h.a.h != null) {
          b0 tt = this.t;
          b0$k ok = new b0$k(tt, tt.numberOfComments(), this.t.isAllowComment());
          tt = this.Z;
          if (tt != null && tt.equals(ok)) {
             return;
          }else {
             this.Z = ok;
          }
       }
       this.E().h(this.t.numberOfComments(), this.t.isAllowComment());
       return;
    }
    public void s0(){
       boolean b2;
       boolean b3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b0 uob0 = b0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob0, "16")) {
          return;
       }
       if (this.t.isShowFollowingIntensify()) {
          return;
       }
       b0 obj = PatchProxy.apply(objArray, this, uob0, "17");
       boolean b = false;
       boolean b1 = true;
       if (obj != patchProxyRe) {
          b2 = obj.booleanValue();
       }else if(this.t.hasGodCommentShow() || (this.t.getCommonMeta() != null && (this.t.getCommonMeta().mCoverCommonTags != null && (this.t.getCommonMeta().mCoverCommonTags.mAuthorRightSideTag != null && this.t.getCommonMeta().mCoverCommonTags.mAuthorRightSideTag.tagType == 52)))){
          b2 = true;
       }else {
          b2 = false;
       }
       if (!b2) {
          return;
       }else if(this.t.isAlreadyShowGodComment()){
          return;
       }else {
          obj = this.t;
          HoverHelper hoverHelper = HoverHelper.class;
          if (PatchProxy.isSupport(hoverHelper)) {
             Object obj1 = PatchProxy.applyTwoRefs(obj, Boolean.FALSE, objArray, hoverHelper, "7");
             if (obj1 != patchProxyRe) {
                b3 = obj1.booleanValue();
             label_0091 :
                if (b3) {
                   return;
                }else if(this.G != null){
                   this.B.c = b;
                   this.x.put(this.t.getPhotoId(), this.B);
                   return;
                }else {
                   h0 oh0 = this.E();
                   Objects.requireNonNull(oh0);
                   h0 oh01 = h0.class;
                   if (!PatchProxy.isSupport(oh01) || !PatchProxy.applyVoidTwoRefs(Boolean.TRUE, Boolean.TRUE, oh0, oh01, "9")) {
                      h0$e uoe = new h0$e();
                      uoe.a(b1);
                      uoe.b(b1);
                      oh0.d.f(uoe);
                   }
                   this.t.setNeedShowGodComment(b1);
                   this.t.setAlreadyShowGodComment(b1);
                   this.x.put(this.t.getPhotoId(), this.B);
                   this.B.d = b1;
                   if (!PatchProxy.applyVoid(objArray, this, uob0, "21")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "GREAT_COMMENT_DYNAMIC";
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.photoPackage = w1.f(this.t.mEntity);
                      u1.D0("", this.A, 6, uElementPack, uContentPack, null);
                   }
                   return;
                }
             }
          }
          b3 = HoverHelper.o.b(obj, b);
          goto label_0091 ;
       }
    }
    public void t0(int p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob0, "6")) {
          return;
       }
       this.t.setNumberOfComments(p0);
       this.r0();
       return;
    }
}
