package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$a;
import nsd.u;
import kotlin.Pair;
import java.lang.Integer;
import java.lang.Object;
import qrd.r0;
import java.util.Map;
import trd.t0;
import jh5.a;
import xq7.d;
import rp7.a;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$quickCommentEmotions$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$mMaxGuideFollowCount$2;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$mEnableFollowGuideShow$2;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$triggers$2;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$mOnInfoListener$2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.HyperTag;
import gy9.f;
import uw9.q3;
import d7a.b;
import java.lang.Long;
import qp7.x0;
import dr7.f0;
import qp7.g;
import xq7.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.l;
import wkd.b;
import qra.d;
import com.kwai.framework.model.user.User$FollowStatus;
import java.util.Objects;
import dr7.f0$a;
import pp7.b;
import or7.a;
import m9a.t;
import kp.r1;
import k2b.f3;
import lnc.i3;
import java.lang.Number;
import k2b.e0;
import qp7.a;
import v6a.m0;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.j;
import io.reactivex.subjects.PublishSubject;
import xx9.a;
import android.app.Activity;
import com.yxcorp.gifshow.comment.e;
import p1a.a$a;
import lnc.a1;
import p1a.a;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import rq7.a;
import dr7.e0;
import com.kwai.component.photo.reduce.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.ba;
import wh5.c;
import l66.a;
import lnc.u1;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import gy9.a;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import de5.c;
import java.util.Collection;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$f;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$onBind$2;
import gy9.d;
import msd.l;
import erd.o;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$g;
import io.reactivex.internal.functions.Functions;
import sra.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$h;
import qp7.c;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$i;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$j;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$k;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$l;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$m;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$c;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$d;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$e;
import qp7.b1;
import cda.c;
import dda.e;
import m66.a;
import com.kwai.framework.model.feed.BaseFeed;
import dda.g;
import qp7.d;
import dr7.a;
import uw9.c;
import yz7.k;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.util.Date;
import android.content.Intent;
import ekd.j0;
import nsd.r0;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import java.util.Arrays;
import jga.f$a;
import jga.c;
import k2b.k2;
import k2b.u1;
import wca.b;
import jga.f;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$b;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import lu7.f;

public final class IntensifyFollowElement extends DispatchBaseElement	// class@001423
{
    public PublishSubject A;
    public j B;
    public d C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public final p K;
    public final p L;
    public final p M;
    public final p N;
    public final p O;
    public User t;
    public QPhoto u;
    public PhotoDetailParam v;
    public c w;
    public a x;
    public Activity y;
    public BaseFragment z;
    public static final Map P;
    public static final IntensifyFollowElement$a Q;

    static {
       IntensifyFollowElement.Q = new IntensifyFollowElement$a(null);
       Pair[] pairArray = new Pair[]{r0.a("unknown", Integer.valueOf(1)),r0.a("like", Integer.valueOf(2)),r0.a("collect", Integer.valueOf(4)),r0.a("comment", Integer.valueOf(8))};
       IntensifyFollowElement.P = t0.W(pairArray);
    }
    public void IntensifyFollowElement(a p0){
       super(d.B, p0);
       this.K = s.c(IntensifyFollowElement$quickCommentEmotions$2.INSTANCE);
       this.L = s.c(IntensifyFollowElement$mMaxGuideFollowCount$2.INSTANCE);
       this.M = s.c(IntensifyFollowElement$mEnableFollowGuideShow$2.INSTANCE);
       this.N = s.c(IntensifyFollowElement$triggers$2.INSTANCE);
       this.O = s.c(new IntensifyFollowElement$mOnInfoListener$2(this));
    }
    public static void L0(IntensifyFollowElement p0,boolean p1,boolean p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = false;
       }
       if (p3 & 0x02) {
          p2 = false;
       }
       p0.K0(p1, p2);
       return;
    }
    public static final BaseFragment n0(IntensifyFollowElement p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final QPhoto o0(IntensifyFollowElement p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public static final User p0(IntensifyFollowElement p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mUser");
       }
       return p0;
    }
    public final boolean A0(){
       boolean b;
       QCurrentUser obj = PatchProxy.apply(null, this, IntensifyFollowElement.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = QCurrentUser.ME;
       a.o(obj, "QCurrentUser.ME");
       if (obj.isLogined()) {
          IntensifyFollowElement tt = this.t;
          if (tt != null) {
             if (tt == null) {
                a.S("mUser");
             }
             if (tt.isFollowingOrFollowRequesting()) {
                b = true;
             label_0035 :
                return b;
             }
          }
       }
       b = false;
       goto label_0035 ;
    }
    public final boolean B0(){
       Object obj = PatchProxy.apply(null, this, IntensifyFollowElement.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.H().m1;
    }
    public final boolean C0(){
       IntensifyFollowElement obj = PatchProxy.apply(null, this, IntensifyFollowElement.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       if (obj == null) {
          a.S("mPhoto");
       }
       PhotoMeta photoMeta = obj.getPhotoMeta();
       boolean b = false;
       photoMeta = (photoMeta != null)? photoMeta.mPhotoFollowingIntensify: null;
       if (photoMeta > null) {
          b = true;
       }
       return b;
    }
    public final boolean D0(){
       HyperTag mPymlFollowi;
       IntensifyFollowElement obj = PatchProxy.apply(null, this, IntensifyFollowElement.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.F0()) {
          obj = this.u;
          if (obj == null) {
             a.S("mPhoto");
          }
          PhotoMeta photoMeta = obj.getPhotoMeta();
          if (photoMeta != null) {
             photoMeta = photoMeta.mHyperTag;
             if (photoMeta != null) {
                mPymlFollowi = photoMeta.mPymlFollowingIntensifyType;
             label_0032 :
                if (mPymlFollowi > null) {
                   b = true;
                }
             }
          }
          mPymlFollowi = null;
          goto label_0032 ;
       }
       return b;
    }
    public final boolean E0(){
       IntensifyFollowElement obj = PatchProxy.apply(null, this, IntensifyFollowElement.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.F0()) {
          obj = this.u;
          if (obj == null) {
             a.S("mPhoto");
          }
          PhotoMeta photoMeta = obj.getPhotoMeta();
          if (photoMeta != null) {
             photoMeta = photoMeta.mHyperTag;
             if (photoMeta != null && photoMeta.mPymlFollowingIntensifyType == b) {
             label_0034 :
                return b;
             }
          }
       }
    label_0033 :
       b = false;
       goto label_0034 ;
    }
    public final boolean F0(){
       Object obj = PatchProxy.apply(null, this, IntensifyFollowElement.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (f.a() < q3.a())? true: false;
       return b;
    }
    public final void G0(b p0,long p1,long p2){
       if (PatchProxy.isSupport2(IntensifyFollowElement.class, "19") && PatchProxy.applyVoidThreeRefsWithListener(p0, Long.valueOf(p1), Long.valueOf(p2), this, IntensifyFollowElement.class, "19")) {
          return;
       }
       if (!this.E().i() && !this.A0()) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (mE.isLogined()) {
             long l = ((long)this.J * p2) + p1;
             if (((long)p0.playBeforeEndMills + l) - p2 >= 0 || ((long)p0.playAfterEndMills + p2) - l <= 0) {
                this.I = this.u0(p0.a());
             }
             if (this.I == null) {
                PatchProxy.onMethodExit(IntensifyFollowElement.class, "19");
                return;
             }else if(p0.b()){
                this.H0();
             }
             PatchProxy.onMethodExit(IntensifyFollowElement.class, "19");
             return;
          }
       }
       PatchProxy.onMethodExit(IntensifyFollowElement.class, "19");
       return;
    }
    public final void H0(){
       IntensifyFollowElement tu;
       boolean b1;
       IntensifyFollowElement intensifyFol = IntensifyFollowElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, intensifyFol, "21")) {
          return;
       }
       if (!this.A0()) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (mE.isLogined() && (!this.H().G() || this.D().c() <= 0)) {
             boolean b = true;
             if (!(this.H & this.I)) {
                tu = this.u;
                if (tu == null) {
                   a.S("mPhoto");
                }
                PhotoMeta photoMeta = tu.getPhotoMeta();
                if (photoMeta == null || photoMeta.mIntensifyTriggered != b) {
                label_00b9 :
                   return;
                }
             }
             if (this.E0()) {
                IntensifyFollowElement.L0(this, false, b, b, objArray);
                goto label_00b9 ;
             }else {
                PhotoMeta obj = PatchProxy.apply(objArray, this, intensifyFol, "28");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else if(this.F0()){
                   intensifyFol = this.u;
                   if (intensifyFol == null) {
                      a.S("mPhoto");
                   }
                   obj = intensifyFol.getPhotoMeta();
                   if (obj != null) {
                      obj = obj.mHyperTag;
                      if (obj != null && obj.mPymlFollowingIntensifyType == 2) {
                      label_008e :
                         b1 = b;
                      }
                   }
                }
             label_008d :
                b = 0;
                goto label_008e ;
                if (b1) {
                   intensifyFol = this.u;
                   if (intensifyFol == null) {
                      a.S("mPhoto");
                   }
                   obj = intensifyFol.getPhotoMeta();
                   if (obj != null && (obj.mIntensifyTriggered == null && this.s0())) {
                      RxBus f = RxBus.f;
                      tu = this.u;
                      if (tu == null) {
                         a.S("mPhoto");
                      }
                      f.b(new l(tu));
                      goto label_00b9 ;
                   }else {
                      goto label_00b9 ;
                   }
                }else {
                   goto label_00b9 ;
                }
             }
          }
       }else {
          goto label_00b9 ;
       }
    }
    public final void I0(){
       this.H = 0;
       this.I = 0;
       this.J = 0;
    }
    public final void J0(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElement.class, "34")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       boolean b = true;
       int b1 = (mE.isLogined() && p0.isFollowingOrFollowRequesting())? true: false;
       boolean b2 = (b1 && (b.a(0x36dab11a).d(p0) && p0.getFollowStatus() == User$FollowStatus.FOLLOWING))? true: false;
       IntensifyFollowElement tu = this.u;
       if (tu == null) {
          a.S("mPhoto");
       }
       PhotoMeta photoMeta = tu.getPhotoMeta();
       if (photoMeta == null || photoMeta.mPhotoFollowingIntensify != 2) {
          b = false;
       }
       int i = 0x7f103c43;
       if (this.B0()) {
          i = 0x7f100dc8;
       }
       f0 uof0 = this.E();
       Objects.requireNonNull(uof0);
       if (!PatchProxy.isSupport(f0.class) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(b1), Boolean.valueOf(b), Integer.valueOf(i), Boolean.valueOf(b2), uof0, f0.class, "1")) {
          uof0.f.f(b2);
          f0 f = uof0.f;
          f.d = b1;
          if (b1) {
             if (f.b()) {
                uof0.f.e(0);
                uof0.f.g(R.string.arg_RES_7f104244);
             }else {
                uof0.f.e(8);
                f = uof0.f;
                b1 = (b)? 0x7f100fa6: 0x7f101034;
                f.g(b1);
             }
          }else {
             f.b = b;
             f.e(0);
             f = uof0.f;
             b1 = (b)? 0x7f10408e: 0x7f100f8f;
             f.g(b1);
             if (uof0.f.d()) {
                uof0.f.g(R.string.arg_RES_7f101024);
             }
          }
          uof0.d.f(uof0.f);
          uof0.g.e(8);
          uof0.g.g(i);
          uof0.e.f(uof0.g);
       }
       return;
    }
    public final void K0(boolean p0,boolean p1){
       IntensifyFollowElement intensifyFol = IntensifyFollowElement.class;
       if (PatchProxy.isSupport(intensifyFol) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, intensifyFol, "22")) {
          return;
       }
       if (this.H().G() && this.D().c() > 0) {
          return;
       }
       if (p0 || this.s0()) {
          IntensifyFollowElement tu = this.u;
          if (tu == null) {
             a.S("mPhoto");
          }
          PhotoMeta photoMeta = tu.getPhotoMeta();
          if (photoMeta != null) {
             photoMeta.mIntensifyShowing = true;
          }
          this.c0();
          f0 uof0 = this.E();
          Objects.requireNonNull(uof0);
          f0 uof01 = f0.class;
          if (!PatchProxy.isSupport(uof01) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), uof0, uof01, "16") && uof0.t == null)) {
             uof0.k.f(Boolean.valueOf(p1));
             uof0.t = true;
          }
       }
    label_007d :
       return;
    }
    public final void M0(boolean p0){
       f0 uof0 = f0.class;
       IntensifyFollowElement intensifyFol = IntensifyFollowElement.class;
       if (PatchProxy.isSupport(intensifyFol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, intensifyFol, "24")) {
          return;
       }
       intensifyFol = this.u;
       String str = "mPhoto";
       if (intensifyFol == null) {
          a.S(str);
       }
       boolean b = true;
       if (!intensifyFol.isAllowComment() || !this.H().m().a()) {
          if (this.E().g().b()) {
             f0 uof01 = this.E();
             Objects.requireNonNull(uof01);
             if (!PatchProxy.applyVoid(null, uof01, uof0, "20") && uof01.v == null) {
                uof01.m.f(Boolean.TRUE);
                uof01.v = b;
             }
             if (this.G == null) {
                this.G = b;
                f3 uof3 = f3.j("GREET_BUTTON");
                i3 oi3 = i3.f();
                intensifyFol = this.t;
                if (intensifyFol == null) {
                   a.S("mUser");
                }
                oi3.d("identity", intensifyFol.getId());
                oi3.c("source", Integer.valueOf(b));
                uof3.m(oi3.e());
                IntensifyFollowElement tz = this.z;
                if (tz == null) {
                   a.S("mFragment");
                }
                uof3.h(tz);
             }
             return;
          }else if(this.E().h(b)){
             this.b0();
          }
          return;
       }else if(!t.c()){
          return;
       }else {
          intensifyFol = this.u;
          if (intensifyFol == null) {
             a.S(str);
          }
          if (r1.o3(intensifyFol)) {
             return;
          }else {
             this.E = b;
             f0 uof02 = this.E();
             Objects.requireNonNull(uof02);
             if (!PatchProxy.isSupport(uof0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uof02, uof0, "2")) {
                uof02.h.f(Boolean.valueOf(p0));
             }
             return;
          }
       }
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, IntensifyFollowElement.class, "6")) {
       }else {
          a.p(p0, "callerContext");
          a b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.z = b;
          b = p0.c;
          a.o(b, "callerContext.mPhotoDetailParam");
          this.v = b;
          if (b == null) {
             a.S("mDetailParams");
          }
          QPhoto photo = b.getPhoto();
          a.o(photo, "mDetailParams.photo");
          this.u = photo;
          if (photo == null) {
             a.S("mPhoto");
          }
          User user = photo.getUser();
          a.o(user, "mPhoto.user");
          this.t = user;
          m0 o = p0.o;
          a.o(o, "callerContext.mLogListener");
          this.x = o;
          b = p0.a;
          a.o(b, "callerContext.mActivity");
          this.y = b;
          b = p0.d;
          a.o(b, "callerContext.mProgressPublisher");
          this.A = b;
          o = p0.k;
          a.o(o, "callerContext.mPlayInfoListenerBundle");
          this.w = o;
          a c = p0.c;
          j oj = new j(p0.a, c.mPhoto, c, this.H().n1, p0.r.a(), p0.l);
          this.B = o;
          PatchProxy.onMethodExit(IntensifyFollowElement.class, "6");
       }
       return;
    }
    public void S(){
       IntensifyFollowElement intensifyFol = IntensifyFollowElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, intensifyFol, "10")) {
          return;
       }
       IntensifyFollowElement tx = this.x;
       String str = "mLogListener";
       if (tx == null) {
          a.S(str);
       }
       a$a uoa = a$a.s(31, "展示强化关注按钮");
       i3 oi3 = i3.f();
       oi3.d("follow_position", this.v0());
       IntensifyFollowElement tt = this.t;
       if (tt == null) {
          a.S("mUser");
       }
       String str1 = (tt.isFollowingOrFollowRequesting())? "FOLLOW": "UN_FOLLOW";
       oi3.d("follow_state", str1);
       str1 = (this.F != null)? a1.p(R.string.arg_RES_7f101024): a1.p(R.string.arg_RES_7f100f8f);
       oi3.d("follow_text", str1);
       oi3.d("head_position", "FRIEND_CHAIN_TOAST");
       uoa.m(oi3.e());
       uoa.f("USER_FOLLOW");
       uoa.r(true);
       tx.b(uoa);
       if (this.E == null && !PatchProxy.applyVoid(objArray, this, intensifyFol, "38")) {
          intensifyFol = this.x;
          if (intensifyFol == null) {
             a.S(str);
          }
          a$a uoa1 = a$a.s(0, "NOT_INTEREST_BUTTON");
          uoa1.f("NOT_INTEREST_BUTTON");
          i3 oi31 = i3.f();
          oi31.d("author_source", this.r0());
          uoa1.m(oi31.e());
          tx = this.u;
          if (tx == null) {
             a.S("mPhoto");
          }
          uoa1.j(tx.getFeedLogCtx());
          intensifyFol.b(uoa1);
       }
       return;
    }
    public a f0(a p0){
       f0 uof0 = PatchProxy.applyOneRefs(p0, this, IntensifyFollowElement.class, "7");
       if (uof0 != PatchProxyResult.class) {
       }else {
          uof0 = new f0(p0);
       }
       return uof0;
    }
    public void j0(boolean p0){
       boolean b1;
       boolean b2;
       g e;
       IntensifyFollowElement intensifyFol = IntensifyFollowElement.class;
       e0 uoe0 = e0.class;
       String str = "12";
       if (PatchProxy.isSupport(intensifyFol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, intensifyFol, str)) {
          return;
       }
       IntensifyFollowElement tu = this.u;
       String str1 = "mPhoto";
       if (tu == null) {
          a.S(str1);
       }
       IntensifyFollowElement ty = this.y;
       if (ty == null) {
          a.S("mActivity");
       }
       this.C = new d(tu, ty);
       p0 = this.A0();
       tu = this.u;
       if (tu == null) {
          a.S(str1);
       }
       boolean b = true;
       tu = (ba.a(tu.getPhotoId()) && this.H().m().c == null)? 1: null;
       if (!c.l() && !c.b()) {
          Object[] objArray = null;
          QCurrentUser obj = PatchProxy.apply(objArray, this, intensifyFol, "17");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else {
             int i = 0x6d2a4fdd;
             if (!this.D0()) {
                if (this.C0() && this.w0()) {
                   b.a(i).a(this);
                   u1.a(this);
                }
                b1 = false;
             }else {
                b.a(i).a(this);
                u1.a(this);
                Iterator iterator = this.y0().iterator();
                while (iterator.hasNext()) {
                   b uob4 = iterator.next();
                   String str3 = uob4.a();
                   Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                   str3 = str3.toLowerCase();
                   a.o(str3, "\(this as java.lang.String\).toLowerCase\(\)");
                   String str4 = "unknown";
                   if (a.g(str3, str4)) {
                      this.q0(str4);
                   }else if(!uob4.b()){
                      int i1 = this.I | this.u0(uob4.a());
                      this.I = i1;
                   }
                   IntensifyFollowElement tA = this.A;
                   if (tA == null) {
                      a.S("mProgressListener");
                   }
                   uob4 = tA.subscribe(new a(uob4, this));
                   a.o(uob4, "mProgressListener.subscr…vent.mDuration\)\n        }");
                   this.j(uob4);
                }
                IntensifyFollowElement tw = this.w;
                if (tw == null) {
                   a.S("mPlayerListenerBundler");
                }
                IMediaPlayer$OnInfoListener onInfoListen = PatchProxy.apply(objArray, this, intensifyFol, "5");
                if (onInfoListen == PatchProxyResult.class) {
                   onInfoListen = this.O.getValue();
                }
                tw.b(onInfoListen);
                b1 = this.y0().isEmpty() ^ b;
             }
          }
          if (!b1 && (this.C0() || this.B0())) {
             obj = QCurrentUser.ME;
             a.o(obj, "QCurrentUser.ME");
             if (obj.isLogined()) {
                if (p0) {
                   if (!tu) {
                      tu = this.u;
                      if (tu == null) {
                         a.S(str1);
                      }
                      if (!tu.isAllowComment()) {
                      label_03c7 :
                         IntensifyFollowElement tu1 = this.u;
                         if (tu1 == null) {
                            a.S(str1);
                         }
                         PhotoMeta photoMeta = tu1.getPhotoMeta();
                         if (photoMeta != null) {
                            photoMeta.mIntensifyShowing = false;
                         }
                         this.b0();
                         return;
                      }
                   }else {
                      goto label_03c7 ;
                   }
                }
                tu = this.u;
                if (tu == null) {
                   a.S(str1);
                }
                if (r1.A2(tu)) {
                   goto label_03c7 ;
                }else {
                   this.c0();
                   if (this.H().G()) {
                      this.j(e.g(this.D(), new IntensifyFollowElement$f(this), objArray, 2, objArray));
                   }
                   t obj1 = PatchProxy.apply(objArray, this, intensifyFol, "23");
                   if (obj1 != PatchProxyResult.class) {
                      b2 = obj1.booleanValue();
                   }else {
                      intensifyFol = this.u;
                      if (intensifyFol == null) {
                         a.S(str1);
                      }
                      if (!intensifyFol.isLiked()) {
                         intensifyFol = this.u;
                         if (intensifyFol == null) {
                            a.S(str1);
                         }
                         if (!intensifyFol.isCollected()) {
                         label_01bd :
                            b2 = false;
                         }
                      }
                      if (this.w0()) {
                         b2 = true;
                      }else {
                         goto label_01bd ;
                      }
                   }
                   this.F = b2;
                   this.E().k(this.F);
                   intensifyFol = this.t;
                   String str2 = "mUser";
                   if (intensifyFol == null) {
                      a.S(str2);
                   }
                   this.J0(intensifyFol);
                   if (this.B0() || this.C0()) {
                      intensifyFol = this.t;
                      if (intensifyFol == null) {
                         a.S(str2);
                      }
                      if (!intensifyFol.isFollowingOrFollowRequesting()) {
                         this.K0(b, false);
                      }else if(this.E0()){
                         intensifyFol = this.u;
                         if (intensifyFol == null) {
                            a.S(str1);
                         }
                         PhotoMeta photoMeta1 = intensifyFol.getPhotoMeta();
                         if (photoMeta1 != null) {
                            photoMeta1.mIntensifyShowing = false;
                         }
                         if (this.E().h(false)) {
                            this.b0();
                         }
                      }
                   }else {
                      goto label_01f4 ;
                   }
                   intensifyFol = this.t;
                   if (intensifyFol == null) {
                      a.S(str2);
                   }
                   obj1 = intensifyFol.observable();
                   IntensifyFollowElement$onBind$2 iNSTANCE = IntensifyFollowElement$onBind$2.INSTANCE;
                   if (iNSTANCE != null) {
                      iNSTANCE = new d(iNSTANCE);
                   }
                   e = Functions.e;
                   b uob = obj1.distinctUntilChanged(iNSTANCE).subscribe(new IntensifyFollowElement$g(this), e);
                   a.o(uob, "mUser.observable\(\).disti…Functions.ERROR_CONSUMER\)");
                   this.j(uob);
                   uob = RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new IntensifyFollowElement$h(this));
                   a.o(uob, "RxBus.INSTANCE.toObserva…w\(true\)\n        }\n      }");
                   this.j(uob);
                   e0 uoe01 = this.A();
                   IntensifyFollowElement$i oi = new IntensifyFollowElement$i(this);
                   a.o(e, "Functions.ERROR_CONSUMER");
                   Objects.requireNonNull(uoe01);
                   b uob1 = PatchProxy.applyTwoRefs(oi, e, uoe01, uoe0, "2");
                   if (uob1 != PatchProxyResult.class) {
                   }else {
                      a.p(oi, "onNext");
                      a.p(e, "onError");
                      uob1 = uoe01.a.subscribe(oi, e);
                      a.o(uob1, "mFollowButtonClickSubjec…ubscribe\(onNext, onError\)");
                   }
                   this.j(uob1);
                   uoe01 = this.A();
                   IntensifyFollowElement$j oj = new IntensifyFollowElement$j(this);
                   a.o(e, "Functions.ERROR_CONSUMER");
                   Objects.requireNonNull(uoe01);
                   uob1 = PatchProxy.applyTwoRefs(oj, e, uoe01, uoe0, "4");
                   if (uob1 != PatchProxyResult.class) {
                   }else {
                      a.p(oj, "onNext");
                      a.p(e, "onError");
                      uob1 = uoe01.b.subscribe(oj, e);
                      a.o(uob1, "mCommentButtonClickSubje…ubscribe\(onNext, onError\)");
                   }
                   this.j(uob1);
                   uoe01 = this.A();
                   IntensifyFollowElement$k ok = new IntensifyFollowElement$k(this);
                   a.o(e, "Functions.ERROR_CONSUMER");
                   Objects.requireNonNull(uoe01);
                   uob1 = PatchProxy.applyTwoRefs(ok, e, uoe01, uoe0, "10");
                   if (uob1 != PatchProxyResult.class) {
                   }else {
                      a.p(ok, "onNext");
                      a.p(e, "onError");
                      uob1 = uoe01.c.subscribe(ok, e);
                      a.o(uob1, "mQuickCommentViewInitSub…ubscribe\(onNext, onError\)");
                   }
                   this.j(uob1);
                   uoe01 = this.A();
                   IntensifyFollowElement$l ol = new IntensifyFollowElement$l(this);
                   a.o(e, "Functions.ERROR_CONSUMER");
                   Objects.requireNonNull(uoe01);
                   uob1 = PatchProxy.applyTwoRefs(ol, e, uoe01, uoe0, "6");
                   if (uob1 != PatchProxyResult.class) {
                   }else {
                      a.p(ol, "onNext");
                      a.p(e, "onError");
                      uob1 = uoe01.e.subscribe(ol, e);
                      a.o(uob1, "mQuickCommentClickSubjec…ubscribe\(onNext, onError\)");
                   }
                   this.j(uob1);
                   uoe01 = this.A();
                   IntensifyFollowElement$m om = new IntensifyFollowElement$m(this);
                   a.o(e, "Functions.ERROR_CONSUMER");
                   Objects.requireNonNull(uoe01);
                   uob1 = PatchProxy.applyTwoRefs(om, e, uoe01, uoe0, "8");
                   if (uob1 != PatchProxyResult.class) {
                   }else {
                      a.p(om, "onNext");
                      a.p(e, "onError");
                      uob1 = uoe01.d.subscribe(om, e);
                      a.o(uob1, "mQuickCommentDisappearAn…ubscribe\(onNext, onError\)");
                   }
                   this.j(uob1);
                   uoe01 = this.A();
                   IntensifyFollowElement$c uoc = new IntensifyFollowElement$c(this);
                   a.o(e, "Functions.ERROR_CONSUMER");
                   Objects.requireNonNull(uoe01);
                   b uob2 = PatchProxy.applyTwoRefs(uoc, e, uoe01, uoe0, str);
                   if (uob2 != PatchProxyResult.class) {
                   }else {
                      a.p(uoc, "onNext");
                      a.p(e, "onError");
                      uob2 = uoe01.g.subscribe(uoc, e);
                      a.o(uob2, "mHideViewSubject.subscribe\(onNext, onError\)");
                   }
                   this.j(uob2);
                   uoe01 = this.A();
                   IntensifyFollowElement$d uod = new IntensifyFollowElement$d(this);
                   a.o(e, "Functions.ERROR_CONSUMER");
                   Objects.requireNonNull(uoe01);
                   b uob3 = PatchProxy.applyTwoRefs(uod, e, uoe01, uoe0, "14");
                   if (uob3 != PatchProxyResult.class) {
                   }else {
                      a.p(uod, "onNext");
                      a.p(e, "onError");
                      uob3 = uoe01.h.subscribe(uod, e);
                      a.o(uob3, "mShowFollowBackAnimatorE…ubscribe\(onNext, onError\)");
                   }
                   this.j(uob3);
                   this.i(new IntensifyFollowElement$e(this));
                   if (p0) {
                      this.M0(false);
                   }else {
                      this.z0();
                   }
                   return;
                }
             }else {
                goto label_03c7 ;
             }
          }else {
             goto label_03c7 ;
          }
       }else {
          goto label_03c7 ;
       }
    }
    public void m0(boolean p0){
       IntensifyFollowElement intensifyFol = IntensifyFollowElement.class;
       if (PatchProxy.isSupport(intensifyFol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, intensifyFol, "13")) {
          return;
       }
       if (this.D0()) {
          this.I0();
       }
       b.a(0x6d2a4fdd).c(this);
       u1.b(this);
       f0 uof0 = this.E();
       Objects.requireNonNull(uof0);
       if (!PatchProxy.applyVoid(null, uof0, f0.class, "14")) {
          uof0.s.f(Boolean.TRUE);
       }
       this.E = false;
       return;
    }
    public final void onEventMainThread(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElement.class, "15")) {
          return;
       }
       a.p(p0, "event");
       c b = p0.b;
       IntensifyFollowElement tu = this.u;
       if (tu == null) {
          a.S("mPhoto");
       }
       if (a.g(b, tu) && p0.a == 1) {
          this.q0("collect");
       }
       return;
    }
    public final void onEventMainThread(e p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElement.class, "16")) {
          return;
       }
       a.p(p0, "event");
       a = p0.a;
       IntensifyFollowElement tu = this.u;
       if (tu == null) {
          a.S("mPhoto");
       }
       if (a.g(a, tu.mEntity)) {
          this.q0("comment");
       }
       return;
    }
    public final void onEventMainThread(g p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElement.class, "14")) {
          return;
       }
       a.p(p0, "event");
       a = p0.a;
       IntensifyFollowElement tu = this.u;
       if (tu == null) {
          a.S("mPhoto");
       }
       if (a.g(a, tu.mEntity)) {
          IntensifyFollowElement tu1 = this.u;
          if (tu1 == null) {
             a.S("mPhoto");
          }
          if (tu1.isLiked()) {
             this.q0("like");
          }
       }
       return;
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, IntensifyFollowElement.class, "9");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public final void q0(String p0){
       IntensifyFollowElement intensifyFol = IntensifyFollowElement.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, intensifyFol, "18")) {
          return;
       }
       if (!this.E().i() || (!this.E0() && !this.A0())) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (mE.isLogined()) {
             Object[] objArray = null;
             if (this.w0() && this.E().i()) {
                int i = 1;
                if (a.g("unknown", p0) ^ i) {
                   int i1 = c.c();
                   Number number = PatchProxy.apply(objArray, this, intensifyFol, "2");
                   if (number == PatchProxyResult.class) {
                      number = this.L.getValue();
                   }
                   if (i1 <= number.intValue()) {
                      f0 uof0 = this.E();
                      Objects.requireNonNull(uof0);
                      f0 uof01 = f0.class;
                      if (!PatchProxy.isSupport(uof01) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, uof0, uof01, "17")) {
                         uof0.l.f(Boolean.TRUE);
                         uof0.t = i;
                      }
                      this.F = i;
                      this.E().k(this.F);
                      c.A((c.c() + i));
                      this.S();
                   }
                }
             }
             Iterator iterator = this.y0().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   Object obj = iterator.next();
                   String str = obj.a();
                   Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                   str = str.toLowerCase();
                   a.o(str, "\(this as java.lang.String\).toLowerCase\(\)");
                   if (a.g(str, p0)) {
                      objArray = obj;
                   }
                }
                if (objArray != null) {
                   this.H = this.u0(p0) | this.H;
                   this.H0();
                   break ;
                }
             }
          }
       }
       return;
    }
    public c r(){
       e0 uoe0 = PatchProxy.apply(null, this, IntensifyFollowElement.class, "8");
       if (uoe0 != PatchProxyResult.class) {
       }else {
          uoe0 = new e0();
       }
       return uoe0;
    }
    public final String r0(){
       String obj = PatchProxy.apply(null, this, IntensifyFollowElement.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B0()) {
          obj = "OUTSIDE_SHARE";
       }else if(this.C0()){
          obj = "PYMK";
       }else if(this.D0()){
          obj = "PYML";
       }else {
          obj = k.a;
       }
       a.o(obj, "if \(isPymkButton\(\)\) SOUR…e StringUtil.EMPTY_STRING");
       return obj;
    }
    public final boolean s0(){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       IntensifyFollowElement obj = PatchProxy.apply(objArray, this, IntensifyFollowElement.class, "30");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.u;
       if (obj == null) {
          a.S("mPhoto");
       }
       PhotoMeta photoMeta = obj.getPhotoMeta();
       boolean b = false;
       if (photoMeta == null || photoMeta.mIntensifyTriggered != true) {
          SharedPreferences obj1 = PatchProxy.apply(objArray, objArray, f.class, "3");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             b1 = f.a();
             if (b1 < q3.a()) {
                obj1 = q3.a;
                SharedPreferences$Editor uEditor = obj1.edit();
                uEditor.putInt("pyml_show_count", (b1 + true));
                g.a(uEditor);
                SharedPreferences$Editor uEditor1 = obj1.edit();
                uEditor1.putLong("pyml_limit_date", new Date().getTime());
                g.a(uEditor1);
                b1 = true;
             }else {
                b1 = false;
             }
          }
          if (!b1) {
          label_007d :
             return b;
          }
       }
       IntensifyFollowElement tu = this.u;
       if (tu == null) {
          a.S("mPhoto");
       }
       PhotoMeta photoMeta1 = tu.getPhotoMeta();
       if (photoMeta1 != null) {
          photoMeta1.mIntensifyTriggered = true;
       }
       b = true;
       goto label_007d ;
    }
    public final void t0(boolean p0){
       String str5;
       IntensifyFollowElement tt2;
       QPhoto qPhoto1;
       IntensifyFollowElement intensifyFol = IntensifyFollowElement.class;
       if (PatchProxy.isSupport(intensifyFol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, intensifyFol, "42")) {
          return;
       }
       IntensifyFollowElement ty = this.y;
       String str = "mActivity";
       if (ty == null) {
          a.S(str);
       }
       if (ty instanceof GifshowActivity) {
          ty = this.y;
          if (ty == null) {
             a.S(str);
          }
          String str1 = j0.f(ty.getIntent(), "arg_photo_exp_tag");
          int i = 2;
          Object[] objArray = new Object[i];
          int i1 = 0;
          IntensifyFollowElement tv = this.v;
          String str2 = "mDetailParams";
          if (tv == null) {
             a.S(str2);
          }
          DetailCommonParam detailCommon = tv.getDetailCommonParam();
          String str3 = "mDetailParams.detailCommonParam";
          a.o(detailCommon, str3);
          String str4 = "_";
          if (detailCommon.getPreUserId() == null) {
             str5 = str4;
          }else {
             tv = this.v;
             if (tv == null) {
                a.S(str2);
             }
             detailCommon = tv.getDetailCommonParam();
             a.o(detailCommon, str3);
             str5 = detailCommon.getPreUserId();
          }
          objArray[i1] = str5;
          IntensifyFollowElement tv1 = this.v;
          if (tv1 == null) {
             a.S(str2);
          }
          DetailCommonParam detailCommon1 = tv1.getDetailCommonParam();
          a.o(detailCommon1, str3);
          if (detailCommon1.getPrePhotoId() != null) {
             tv1 = this.v;
             if (tv1 == null) {
                a.S(str2);
             }
             detailCommon1 = tv1.getDetailCommonParam();
             a.o(detailCommon1, str3);
             str4 = detailCommon1.getPrePhotoId();
          }
          objArray[1] = str4;
          String str6 = String.format("%s/%s", Arrays.copyOf(objArray, i));
          a.o(str6, "java.lang.String.format\(format, *args\)");
          IntensifyFollowElement tt = this.t;
          if (tt == null) {
             a.S("mUser");
          }
          tt.mPage = "photo";
          tt = this.y;
          if (tt == null) {
             a.S(str);
          }
          QPhoto qPhoto = null;
          if (!tt instanceof GifshowActivity) {
             tt = qPhoto;
          }
          String str7 = (tt != null)? tt.Q2(): qPhoto;
          IntensifyFollowElement tt1 = this.t;
          if (tt1 == null) {
             a.S("mUser");
          }
          f$a uoa = new f$a(tt1, str7);
          tt = this.u;
          if (tt == null) {
             a.S("mPhoto");
          }
          uoa.c(tt.getFullSource());
          tt = this.y;
          if (tt == null) {
             a.S(str);
          }
          if (!tt instanceof GifshowActivity) {
             tt = qPhoto;
          }
          str = (tt != null)? tt.getUrl(): qPhoto;
          str7 = (p0)? "#follow": "#unfollow";
          uoa.o(a.C(str, str7));
          uoa.g(str1);
          ty = this.u;
          if (ty == null) {
             a.S("mPhoto");
          }
          uoa.f(ty.getExpTag());
          uoa.n(str6);
          uoa.q(1);
          ty = this.u;
          if (ty == null) {
             a.S("mPhoto");
          }
          uoa.m(ty);
          ty = this.u;
          if (ty == null) {
             a.S("mPhoto");
          }
          c uoc = PatchProxy.applyOneRefs(ty, this, intensifyFol, "43");
          if (uoc != PatchProxyResult.class) {
          }else {
             i3 oi3 = i3.f();
             oi3.d("follow_position", this.v0());
             String str8 = oi3.e();
             a.o(str8, "JsonStringBuilder.newIns…ition\(\)\)\n        .build\(\)");
             k2 d = u1.j().d;
             if (ty != null) {
                qPhoto = ty.mEntity;
             }
             uoc = b.d(d, qPhoto, str8);
          }
          uoa.i(uoc);
          f uof = uoa.b();
          if (p0) {
             FollowHelper.c(uof, new IntensifyFollowElement$b(this));
             tt2 = this.t;
             if (tt2 == null) {
                a.S("mUser");
             }
             f.m(tt2, User$FollowStatus.FOLLOWING);
          }else {
             FollowHelper.l(uof);
             tt2 = this.t;
             if (tt2 == null) {
                a.S("mUser");
             }
             f.m(tt2, User$FollowStatus.UNFOLLOW);
          }
       }
       return;
    }
    public final int u0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IntensifyFollowElement.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       p0 = p0.toLowerCase();
       a.o(p0, "\(this as java.lang.String\).toLowerCase\(\)");
       Integer integer = IntensifyFollowElement.P.get(p0);
       int i = (integer != null)? integer.intValue(): 0;
       return i;
    }
    public final String v0(){
       String obj = PatchProxy.apply(null, this, IntensifyFollowElement.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B0()) {
          obj = "OUTSIDE_SHARE";
       }else if(this.C0() || this.D0()){
          obj = "FRIEND_CHAIN_TOAST";
       }else {
          obj = "";
       }
       return obj;
    }
    public final boolean w0(){
       Object obj = PatchProxy.apply(null, this, IntensifyFollowElement.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = this.M.getValue();
       }
       return obj.booleanValue();
    }
    public final List x0(){
       Object obj = PatchProxy.apply(null, this, IntensifyFollowElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.getValue();
    }
    public final List y0(){
       Object obj = PatchProxy.apply(null, this, IntensifyFollowElement.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.N.getValue();
    }
    public final void z0(){
       f0 uof0 = f0.class;
       if (PatchProxy.applyVoid(null, this, IntensifyFollowElement.class, "25")) {
          return;
       }
       boolean b = false;
       this.E = b;
       f0 uof01 = this.E();
       Objects.requireNonNull(uof01);
       if (!PatchProxy.applyVoid(null, uof01, uof0, "28")) {
          uof01.n.f(Boolean.TRUE);
       }
       uof01 = this.E();
       Objects.requireNonNull(uof01);
       if (!PatchProxy.applyVoid(null, uof01, uof0, "3")) {
          uof01.i.f(Boolean.TRUE);
       }
       if (this.m == null && this.C0()) {
          IntensifyFollowElement.L0(this, true, b, 2, null);
       }else {
          IntensifyFollowElement tu = this.u;
          if (tu == null) {
             a.S("mPhoto");
          }
          PhotoMeta photoMeta = tu.getPhotoMeta();
          if (photoMeta != null && photoMeta.mIntensifyTriggered == true) {
             this.H0();
          }
       }
       return;
    }
}
