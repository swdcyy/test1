package iz9.a;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBarV2$b;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import iz9.a$a;
import nsd.u;
import jh5.a;
import tr7.b;
import rp7.a;
import java.util.BitSet;
import iz9.a$c;
import iz9.a$e;
import iz9.a$d;
import iz9.a$b;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import jf5.a;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import wr7.g;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import qp7.g;
import tr7.c;
import iz9.a$f;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import iz9.a$g;
import brd.t;
import iz9.a$h;
import iz9.a$i;
import java.util.Objects;
import iz9.a$j;
import qp7.b1;
import p5a.e;
import de5.a;
import com.kwai.framework.player.multisource.e;
import p5a.c;
import java.lang.Runnable;
import ekd.k1;
import java.lang.StringBuilder;
import qp7.d;
import wr7.e;
import xr7.b;
import android.view.View;
import java.lang.Float;
import java.lang.Integer;
import uw9.o;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import qp7.c;
import wr7.f;

public final class a extends DispatchBaseElement implements SlidePlayVideoLoadingProgressBarV2$b	// class@0028d6
{
    public a A;
    public PublishSubject B;
    public PublishSubject C;
    public PublishSubject D;
    public final Runnable E;
    public final Runnable F;
    public final e G;
    public final b1 H;
    public BaseFragment t;
    public QPhoto u;
    public MilanoContainerEventBus v;
    public BitSet w;
    public boolean x;
    public boolean y;
    public long z;
    public static final a$a I;

    static {
       a.I = new a$a(null);
    }
    public void a(a p0){
       super(b.c, p0);
       this.w = new BitSet();
       this.E = new a$c(this);
       this.F = new a$e(this);
       this.G = new a$d(this);
       this.H = new a$b(this);
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
       }else {
          a.p(p0, "callerContext");
          this.t = p0.b;
          a c = p0.c;
          PhotoDetailParam mPhoto = (c != null)? c.mPhoto: null;
          this.u = mPhoto;
          c = p0.v.X;
          a.o(c, "callerContext.mPhotoDeta¡­.mMilanoContainerEventBus");
          this.v = c;
          this.A = p0.j;
          this.B = p0.C0;
          this.C = p0.D0;
          this.D = p0.E0;
          PatchProxy.onMethodExit(a.class, "1");
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       a tD = this.D;
       if (tD != null) {
          tD.onNext(Boolean.TRUE);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       a tB = this.B;
       if (tB != null) {
          tB.onNext(Boolean.TRUE);
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       a tC = this.C;
       if (tC != null) {
          tC.onNext(Boolean.TRUE);
       }
       tC = this.B;
       if (tC != null) {
          tC.onNext(Boolean.FALSE);
       }
       return;
    }
    public a f0(a p0){
       g og = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g(p0);
       }
       return og;
    }
    public void j0(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.n0("bind");
       this.w.set(1);
       if (this.H().X()) {
          this.p0("use8ShapedLoadingStyle");
          return;
       }else {
          g e = Functions.e;
          String str = "Functions.ERROR_CONSUMER";
          a.o(e, str);
          this.j(this.D().c(new a$f(this), e));
          a tv = this.v;
          String str1 = "mMilanoContainerEventBus";
          if (tv == null) {
             a.S(str1);
          }
          b uob = tv.W.subscribe(new a$g(this), e);
          a.o(uob, "mMilanoContainerEventBus¡­Functions.ERROR_CONSUMER\)");
          this.j(uob);
          a.o(e, str);
          this.j(this.D().d(new a$h(this), e));
          c uoc = this.D();
          a$i oi = new a$i(this);
          a.o(e, str);
          Objects.requireNonNull(uoc);
          b uob1 = PatchProxy.applyTwoRefs(oi, e, uoc, c.class, "1");
          if (uob1 != PatchProxyResult.class) {
          }else {
             a.p(oi, "consumer");
             a.p(e, "error");
             uob1 = uoc.a.subscribe(oi, e);
             a.o(uob1, "mBottomMargin.subscribe\(consumer, error\)");
          }
          this.j(uob1);
          tv = this.v;
          if (tv == null) {
             a.S(str1);
          }
          uob = tv.r.subscribe(new a$j(this), e);
          a.o(uob, "mMilanoContainerEventBus¡­Functions.ERROR_CONSUMER\)");
          this.j(uob);
          this.i(this.H);
          tv = this.A;
          if (tv != null) {
             e player = tv.getPlayer();
             if (player != null) {
                player.d(this.G);
             }
          }
          return;
       }
    }
    public void l0(boolean p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, a.class, "11")) {
          return;
       }
       this.x = false;
       k1.m(this.E);
       k1.m(this.F);
       return;
    }
    public void m0(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       a tA = this.A;
       if (tA != null) {
          e player = tA.getPlayer();
          if (player != null) {
             player.e(this.G);
          }
       }
       return;
    }
    public final void n0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       if (this.m != null) {
          this.p0("tryHide "+p0);
       }
       this.b0();
       e uoe = this.C();
       if (uoe != null && !PatchProxy.applyVoid(null, uoe, e.class, "4")) {
          uoe.l.hide();
       }
       return;
    }
    public final void o0(String p0){
       e uoe;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "7")) {
          return;
       }
       if (this.w.isEmpty()) {
          this.c0();
          this.p0("tryShow "+p0);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, uoa, "9")) {
             if (this.m == null || this.C() == null) {
                this.p0("viewState: not show; isRealShow-"+this.m+' '+this.C());
             }else {
                uoe = this.C();
                View view = (uoe != null)? uoe.p(): objArray;
                StringBuilder str = "viewState visible: "+"alpha-";
                int i = -1;
                Float uFloat = (view != null)? Float.valueOf(view.getAlpha()): Integer.valueOf(i);
                str = str+uFloat+"; visibility-";
                if (view != null) {
                   i = view.getVisibility();
                }
                this.p0(str+i);
             }
          }
          uoe = this.C();
          if (uoe != null && !PatchProxy.applyVoid(objArray, uoe, e.class, "3")) {
             uoe.l.show();
          }
       }
    label_00c2 :
       return;
    }
    public final void p0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       o oo = o.C();
       StringBuilder str = p0+"; [";
       a tu = this.u;
       tu = (tu != null)? tu.getUserName(): null;
       Object[] objArray = new Object[0];
       oo.s("BottomProgressLoadingElement", str+tu, objArray);
       return;
    }
    public d q(){
       e uoe = PatchProxy.apply(null, this, a.class, "6");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(this);
       }
       return uoe;
    }
    public c r(){
       f uof = PatchProxy.apply(null, this, a.class, "5");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f();
       }
       return uof;
    }
}
