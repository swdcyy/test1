package e29.a;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import e29.a$a;
import nsd.u;
import hs7.d;
import rp7.a;
import jh5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import qp7.a;
import w19.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import k2b.u1;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import js7.o;
import java.lang.Boolean;
import qp7.b;
import qp7.x0;
import com.kuaishou.android.model.mix.PhotoMeta;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import e29.a$c;
import erd.g;
import crd.b;
import xy5.j;
import tkd.b;
import tkd.d;
import gx5.b;
import qp7.c;
import js7.n;
import e29.a$d;
import io.reactivex.internal.functions.Functions;
import e29.a$e;
import qp7.b1;
import e29.a$f;
import e29.a$g;
import qp7.t0;
import w19.e;
import e29.a$h;
import e29.a$b;
import w4.j;
import sf5.b;
import qp7.d;
import js7.a;

public final class a extends DispatchBaseElement	// class@002136
{
    public int A;
    public boolean B;
    public boolean C;
    public GifshowActivity t;
    public PhotoDetailParam u;
    public QPhoto v;
    public j w;
    public BaseFragment x;
    public b y;
    public b z;
    public static final a$a D;

    static {
       a.D = new a$a(null);
    }
    public void a(){
       super(d.p.a(), null);
    }
    public static final QPhoto n0(a p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void P(a p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
       }else {
          a.p(p0, "callerContext");
          a = p0.a;
          a.o(a, "callerContext.mActivity");
          this.t = a;
          a = p0.c;
          a.o(a, "callerContext.mPhotoDetailParam");
          this.u = a;
          if (a == null) {
             a.S("mParam");
          }
          PhotoDetailParam mPhoto = a.mPhoto;
          a.o(mPhoto, "mParam.mPhoto");
          this.v = mPhoto;
          d b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.x = b;
       }
       return;
    }
    public void S(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "13")) {
          uoa = this.u;
          if (uoa == null) {
             a.S("mParam");
          }
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          PhotoDetailParam mPhoto = uoa.mPhoto;
          String str = "mPhoto";
          a.o(mPhoto, str);
          uContentPack.photoPackage = w1.f(mPhoto.getEntity());
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "COLLECTION_BUTTON";
          i3 oi3 = i3.f();
          PhotoDetailParam mPhoto1 = uoa.mPhoto;
          a.o(mPhoto1, str);
          String str1 = (mPhoto1.isCollected())? "CANCEL_COLLECTION": "TO_COLLECTION";
          oi3.d("collection_type", str1);
          oi3.d("source", "RIGHT_BAR");
          uElementPack.params = oi3.e();
          uoa = this.x;
          if (uoa == null) {
             a.S("mFragment");
          }
          u1.C0("", uoa, 6, uElementPack, uContentPack);
       }
       return;
    }
    public a f0(a p0){
       o oo = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (oo != PatchProxyResult.class) {
       }else {
          oo = new o(p0);
       }
       return oo;
    }
    public void j0(boolean p0){
       b uob;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       a tv = this.v;
       String str = "mPhoto";
       if (tv == null) {
          a.S(str);
       }
       if (!tv.isPublic()) {
          this.b0();
          return;
       }else {
          this.c0();
          o oo = this.E();
          a tv1 = this.v;
          if (tv1 == null) {
             a.S(str);
          }
          oo.l(tv1.isCollected());
          oo = this.E();
          tv1 = this.v;
          if (tv1 == null) {
             a.S(str);
          }
          oo.m(tv1.numberOfCollects());
          tv = this.v;
          if (tv == null) {
             a.S(str);
          }
          PhotoMeta photoMeta = tv.getPhotoMeta();
          if (photoMeta != null) {
             uob = photoMeta.observable().subscribe(new a$c(this));
             a.o(uob, "it.observable\(\).subscrib¡­mberOfCollects\(\)\)\n      }");
             this.j(uob);
          }
          tv1 = this.v;
          if (tv1 == null) {
             a.S(str);
          }
          j oj = new j(tv1);
          oj.f();
          a.o(oj, "PhotoCollectHelper\(mPhot¡­isableUnCollectionToast\(\)");
          this.w = oj;
          uob = d.a(0x3673894c);
          tv1 = this.w;
          if (tv1 == null) {
             a.S("mCollectHelper");
          }
          a tu = this.u;
          String str1 = "mParam";
          if (tu == null) {
             a.S(str1);
          }
          int source = tu.getSource();
          a tu1 = this.u;
          if (tu1 == null) {
             a.S(str1);
          }
          uob.Vk(tv1, source, tu1.getBizType());
          g e = Functions.e;
          a.o(e, "Functions.ERROR_CONSUMER");
          this.j(this.A().c(new a$d(this), e));
          this.i(new a$e(this));
          this.o0();
          oo = this.E();
          tv1 = this.v;
          if (tv1 == null) {
             a.S(str);
          }
          oo.l(tv1.isCollected());
          oo = this.E();
          tv1 = this.v;
          if (tv1 == null) {
             a.S(str);
          }
          oo.m(tv1.numberOfCollects());
          this.j(this.A().a(new a$f(this)));
          this.j(this.A().b(new a$g(this)));
          uob = this.H().N.subscribe(new a$h(this));
          a.o(uob, "pageConfig.showCommentDi¡­ntPanelShowd = true\n    }");
          this.j(uob);
          return;
       }
    }
    public final void o0(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       this.E().g();
       return;
    }
    public final String p0(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(p0, new a$b(this));
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, a.class, "2");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public final void q0(boolean p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "14")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       a tv = this.v;
       if (tv == null) {
          a.S("mPhoto");
       }
       uContentPack.photoPackage = w1.f(tv.getEntity());
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = (p0)? "COLLECTION_BUBBLE": "COLLECTION_LOTTIE";
       uElementPack.action2 = str;
       if (p0) {
          i3 oi3 = i3.f();
          str = "bubble_type";
          if (p1) {
             oi3.d(str, "KSBubbleId_11009");
          }else {
             oi3.d(str, "KSBubbleId_11008");
          }
          uElementPack.params = oi3.e();
       }
       a tx = this.x;
       if (tx == null) {
          a.S("mFragment");
       }
       u1.C0("", tx, 0, uElementPack, uContentPack);
       return;
    }
    public c r(){
       n on = PatchProxy.apply(null, this, a.class, "3");
       if (on != PatchProxyResult.class) {
       }else {
          on = new n();
       }
       return on;
    }
}
