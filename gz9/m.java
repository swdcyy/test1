package gz9.m;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import jh5.a;
import tr7.b;
import rp7.a;
import gz9.m$a;
import gz9.m$b;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import zr7.g;
import nsd.u;
import zr7.e;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import vca.i;
import qp7.b;
import qp7.c;
import gz9.m$c;
import io.reactivex.internal.functions.Functions;
import java.util.Objects;
import crd.b;
import erd.g;
import brd.t;
import gz9.m$d;
import gz9.m$e;
import gz9.a;
import gz9.m$f;
import gz9.b;
import gz9.f;
import crd.a;
import qrd.l1;
import pp7.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.paycourse.TrialPlayInfo;
import qp7.x0;
import zr7.f;
import android.content.res.Resources;
import android.app.Activity;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import qp7.d;
import zr7.d;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.framework.player.core.b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;

public final class m extends DispatchBaseElement	// class@002528
{
    public final IMediaPlayer$OnCompletionListener A;
    public final IMediaPlayer$OnInfoListener B;
    public QPhoto t;
    public Activity u;
    public BaseFragment v;
    public a w;
    public a x;
    public m0 y;
    public b z;

    public void m(a p0){
       super(b.f, p0);
       this.A = new m$a(this);
       this.B = new m$b(this);
    }
    public void P(a p0){
       a a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, m.class, "1")) {
       }else {
          a.p(p0, "callerContext");
          this.y = p0;
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.t = mPhoto;
          a = p0.a;
          a.o(a, "callerContext.mActivity");
          this.u = a;
          a = p0.b;
          a.o(a, "callerContext.mFragment");
          this.v = a;
          m0 j = p0.j;
          a.o(j, "callerContext.mPlayModule");
          this.w = j;
          m0 z = p0.Z;
          a.o(z, "callerContext.mPayCourseEventCombination");
          this.x = z;
          PatchProxy.onMethodExit(m.class, "1");
       }
       return;
    }
    public a f0(a p0){
       g og = PatchProxy.applyOneRefs(p0, this, m.class, "14");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g(null, 1, null);
       }
       return og;
    }
    public void j0(boolean p0){
       g e;
       b a;
       e uoe = e.class;
       m om = m.class;
       String str = "2";
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, str)) {
          return;
       }
       m tt = this.t;
       if (tt == null) {
          a.S("mPhoto");
       }
       if (!i.d(tt)) {
          this.b0();
          return;
       }else {
          this.b0();
          this.r0();
          e uoe1 = this.A();
          m$c uoc = new m$c(this);
          e = Functions.e;
          String str1 = "Functions.ERROR_CONSUMER";
          a.o(e, str1);
          Objects.requireNonNull(uoe1);
          b uob = PatchProxy.applyTwoRefs(uoc, e, uoe1, uoe, "3");
          if (uob != PatchProxyResult.class) {
          }else {
             a.p(uoc, "onNext");
             a.p(e, "onError");
             uob = uoe1.a.subscribe(uoc, e);
             a.o(uob, "mBuyNowClickSubject.subscribe\(onNext, onError\)");
          }
          this.j(uob);
          uoe1 = this.A();
          m$d uod = new m$d(this);
          a.o(e, str1);
          Objects.requireNonNull(uoe1);
          b uob1 = PatchProxy.applyTwoRefs(uod, e, uoe1, uoe, "4");
          if (uob1 != PatchProxyResult.class) {
          }else {
             a.p(uod, "onNext");
             a.p(e, "onError");
             uob1 = uoe1.b.subscribe(uod, e);
             a.o(uob1, "mReplayClickSubject.subscribe\(onNext, onError\)");
          }
          this.j(uob1);
          tt = this.x;
          String str2 = "mPayCourseEventCombination";
          if (tt == null) {
             a.S(str2);
          }
          a.o(e, str1);
          this.j(tt.c(new m$e(this), e));
          tt = this.x;
          if (tt == null) {
             a.S(str2);
          }
          a.o(e, str1);
          this.j(tt.b(new m$f(this), e));
          m ty = this.y;
          if (ty == null) {
             a.S("mCallerContext");
          }
          b uob2 = new b(ty);
          if (!PatchProxy.applyVoid(null, uob2, b.class, "1")) {
             uob1 = uob2.i;
             a = uob2.a;
             f uof = new f(uob2);
             a.o(e, str1);
             Objects.requireNonNull(a);
             b uob3 = PatchProxy.applyTwoRefs(uof, e, a, a.class, str);
             if (uob3 != PatchProxyResult.class) {
             }else {
                a.p(uof, "onNext");
                a.p(e, "onError");
                uob3 = a.a.subscribe(uof, e);
                a.o(uob3, "paymentRequestSubject.subscribe\(onNext, onError\)");
             }
             uob1.c(uob3);
          }
          this.z = uob2;
          return;
       }
    }
    public void m0(boolean p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "3")) {
          return;
       }
       this.q0();
       m tz = this.z;
       if (tz != null && !PatchProxy.applyVoid(null, tz, b.class, "2")) {
          tz.i.dispose();
       }
       this.z = null;
       return;
    }
    public final boolean n0(){
       Object obj = PatchProxy.apply(null, this, m.class, "9");
       if (obj == PatchProxyResult.class) {
          obj = this.I().a();
          a.o(obj, "tryToShow.value");
       }
       return obj.booleanValue();
    }
    public final void o0(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "7")) {
          return;
       }
       this.c0();
       String str = "mFragment";
       String str1 = "";
       String str2 = 6;
       if (!PatchProxy.applyVoid(objArray, this, om, "10")) {
          ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
          uElementPack1.action2 = "TRY_AGAIN_BUTTON";
          m tv1 = this.v;
          if (tv1 == null) {
             a.S(str);
          }
          u1.C0(str1, tv1, str2, uElementPack1, objArray);
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "11")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "BUY_FULL_BUTTON";
          m tv = this.v;
          if (tv == null) {
             a.S(str);
          }
          u1.C0(str1, tv, str2, uElementPack, objArray);
       }
       om = this.t;
       String str3 = "mPhoto";
       if (om == null) {
          a.S(str3);
       }
       TrialPlayInfo trialPlayInf = i.a(om.getEntity());
       if (trialPlayInf != null) {
          g og = this.E();
          TrialPlayInfo mPlayFinText = trialPlayInf.mPlayFinText;
          a.o(mPlayFinText, "trialPlayInfo.mPlayFinText");
          trialPlayInf = trialPlayInf.mPlayFinPurchaseText;
          a.o(trialPlayInf, "trialPlayInfo.mPlayFinPurchaseText");
          m tu = this.u;
          if (tu == null) {
             a.S("mActivity");
          }
          str2 = tu.getResources().getString(R.string.arg_RES_7f103b8f);
          a.o(str2, "mActivity.resources.getS¡­string.pay_course_replay\)");
          f uof = new f(mPlayFinText, trialPlayInf, str2);
          Objects.requireNonNull(og);
          if (!PatchProxy.applyVoidOneRefs(uof, og, g.class, "1")) {
             a.p(uof, "model");
             og.d.f(uof);
          }
       }
       a uoa = a.d();
       m tt = this.t;
       if (tt == null) {
          a.S(str3);
       }
       uoa.k(new PlayEvent(tt, PlayEvent$Status.PAUSE, 32));
       om = this.x;
       if (om == null) {
          a.S("mPayCourseEventCombination");
       }
       om.d(true);
       return;
    }
    public final void p0(){
       if (PatchProxy.applyVoid(null, this, m.class, "8")) {
          return;
       }
       this.b0();
       a uoa = a.d();
       m tt = this.t;
       if (tt == null) {
          a.S("mPhoto");
       }
       uoa.k(new PlayEvent(tt, PlayEvent$Status.RESUME, 32));
       m tx = this.x;
       if (tx == null) {
          a.S("mPayCourseEventCombination");
       }
       tx.d(false);
       return;
    }
    public d q(){
       d uod = PatchProxy.apply(null, this, m.class, "15");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d();
       }
       return uod;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, m.class, "5")) {
          return;
       }
       m tw = this.w;
       String str = "mPlayModule";
       if (tw == null) {
          a.S(str);
       }
       tw.getPlayer().removeOnCompletionListener(this.A);
       tw = this.w;
       if (tw == null) {
          a.S(str);
       }
       tw.getPlayer().removeOnInfoListener(this.B);
       return;
    }
    public c r(){
       e uoe = PatchProxy.apply(null, this, m.class, "16");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
       }
       return uoe;
    }
    public final void r0(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "4")) {
          return;
       }
       m tt = this.t;
       if (tt == null) {
          a.S("mPhoto");
       }
       if (i.a(tt.getEntity()) == null) {
          if (!PatchProxy.applyVoid(objArray, this, om, "6")) {
             this.q0();
             this.p0();
          }
          return;
       }else {
          om = this.w;
          String str = "mPlayModule";
          if (om == null) {
             a.S(str);
          }
          om.getPlayer().addOnCompletionListener(this.A);
          om = this.w;
          if (om == null) {
             a.S(str);
          }
          om.getPlayer().addOnInfoListener(this.B);
          return;
       }
    }
}
