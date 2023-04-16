package gz.y2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gz.y2$b;
import nsd.u;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import yy.f;
import java.lang.reflect.Type;
import java.lang.Object;
import gz.y2$a;
import com.kuaishou.android.model.ads.SplashInfo$InteractionInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.x;
import brd.t;
import t45.d;
import brd.z;
import gz.y2$c;
import erd.g;
import crd.b;
import ujc.e;
import gz.y2$d;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager;
import kotlin.jvm.internal.a;
import gz.y2$f;
import wkd.b;
import tjc.c;
import tjc.b;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import im8.f;
import com.kuaishou.commercial.splash.presenter.r0;
import java.util.concurrent.TimeUnit;
import gz.u2;
import gz.s;
import yx.j0;
import gz.y2$e;
import android.view.ViewGroup;
import o56.a;
import wl9.z;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import gz.y2$g;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import gz.y2$h;
import android.animation.ValueAnimator;
import ekd.k1;
import android.view.ViewStub;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import mrd.c;
import java.lang.Runnable;
import android.view.View$OnTouchListener;
import p49.f;
import p49.c;
import java.util.Objects;
import p49.f$a;
import gz.z2;
import p49.a;

public class y2 extends PresenterV2	// class@002477
{
    public f A;
    public ViewGroup B;
    public ViewStub C;
    public boolean D;
    public boolean E;
    public boolean F;
    public String G;
    public Runnable H;
    public f I;
    public long J;
    public boolean K;
    public c L;
    public SensorEventListener M;
    public c N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public int S;
    public View$OnTouchListener T;
    public boolean U;
    public final boolean V;
    public final boolean W;
    public final f X;
    public String p;
    public ValueAnimator q;
    public boolean r;
    public SensorManager s;
    public f t;
    public f u;
    public f v;
    public PublishSubject w;
    public f x;
    public ViewGroup y;
    public ViewStub z;
    public static final y2$b Y;

    static {
       y2.Y = new y2$b(null);
    }
    public void y2(){
       super();
       this.p = "SplashInteractionPresenter";
       this.O = 1;
       this.Q = "";
       this.V = a.t().d("SplashInteractiveDelayRegisterLifecycle", 1);
       this.W = a.t().d("splashRegisterSensorCheckSplashState", 1);
       this.X = a.t().getValue("sensitiveControlDefaultValues", f.class, null);
       this.T = new y2$a(this);
    }
    public void B9(SplashInfo$InteractionInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y2.class, "6")) {
          return;
       }
       if (p0 != null) {
          RxBus f = RxBus.f;
          this.X7(f.f(x.class).observeOn(d.a).subscribe(new y2$c(this)));
          this.X7(f.f(e.class).subscribe(new y2$d(this)));
          if (this.V != null) {
             Activity activity = this.getActivity();
             if (!activity instanceof GifshowActivity) {
                activity = null;
             }
             if (activity != null) {
                this.G9(activity);
             }
          }
       }
       return;
    }
    public void C9(SplashInfo$InteractionInfo p0){
    }
    public final void D9(){
       if (PatchProxy.applyVoid(null, this, y2.class, "7")) {
          return;
       }
       String str = SegmentManager.Instance.loadSessionId();
       a.o(str, "SegmentManager.Instance.loadSessionId\(\)");
       this.Q = str;
       return;
    }
    public void E8(){
       t ot;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y2.class, "5")) {
          return;
       }
       if (this.V == null) {
          Activity activity = this.getActivity();
          if (!activity instanceof GifshowActivity) {
             activity = objArray;
          }
          if (activity != null) {
             this.G9(activity);
          }
       }
       if (this.W != null) {
          this.X7(RxBus.f.f(x.class).observeOn(d.a).subscribe(new y2$f(this)));
       }
       b obj = b.a(-1608526086);
       a.o(obj, "Singleton.get\(SplashDataManager::class.java\)");
       obj = obj.a();
       obj = (obj != null)? obj.b: objArray;
       this.D = c.c(obj);
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = objArray;
       y2 tt = this.t;
       if (tt != null) {
          r0 or0 = (tt != null)? tt.get(): objArray;
          if (or0 != null) {
             tt = this.L;
             ot = (tt != null)? tt.delay(600, TimeUnit.MILLISECONDS): objArray;
             objectRef.element = ot;
             tt = this.t;
             if (tt != null) {
                or0 = tt.get();
                if (or0 != null) {
                   objArray = or0.R;
                }
             }
             this.H = objArray;
          }else {
          label_0094 :
             tt = this.v;
             u2 ou2 = (tt != null)? tt.get(): objArray;
             if (ou2 != null) {
                objectRef.element = this.L;
                tt = this.v;
                if (tt != null) {
                   ou2 = tt.get();
                   if (ou2 != null) {
                      objArray = ou2.U;
                   }
                }
                this.H = objArray;
             }
          }
       }else {
          goto label_0094 ;
       }
       y2 tu = this.u;
       if (tu != null) {
          s os = tu.get();
          if (os != null) {
             if (os.P != null) {
                objArray = new Object[0];
                j0.f(this.p, "not show rotate or shake while landscape", objArray);
             }else {
                Ref$ObjectRef element = objectRef.element;
                if (element != null) {
                   ot = element.observeOn(d.a);
                   if (ot != null) {
                      obj = ot.subscribe(new y2$e(os, this, objectRef));
                      if (obj != null) {
                         this.X7(obj);
                      }
                   }
                }
                this.C9(os.F);
                this.y9(os.N, os.M);
                y2 ty = this.y;
                if (ty != null) {
                   ty.setVisibility(8);
                }
             }
          }
       }
       if (a.d()) {
          this.X7(RxBus.f.g(z.class, RxBus$ThreadMode.MAIN).subscribe(new y2$g(this)));
       }
       return;
    }
    public void E9(){
    }
    public final void F9(){
       if (PatchProxy.applyVoid(null, this, y2.class, "8")) {
          return;
       }
       this.U = true;
       y2 ts = this.s;
       if (ts != null) {
          ts.unregisterListener(this.M);
       }
       return;
    }
    public final void G9(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y2.class, "14")) {
          return;
       }
       this.X7(p0.m().subscribe(new y2$h(this)));
       return;
    }
    public void H9(){
       if (PatchProxy.applyVoid(null, this, y2.class, "15")) {
          return;
       }
       this.r = true;
       y2 tq = this.q;
       if (tq != null) {
          tq.cancel();
       }
       return;
    }
    public void I9(){
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, y2.class, "13")) {
          return;
       }
       SegmentManager.Instance.clearBySessionId(this.Q);
       y2 ts = this.s;
       if (ts != null) {
          ts.unregisterListener(this.M);
       }
       this.H9();
       k1.n(this);
       return;
    }
    public final void J9(ValueAnimator p0){
       this.q = p0;
    }
    public final void K9(ViewGroup p0){
       this.y = p0;
    }
    public final void L9(ViewStub p0){
       this.z = p0;
    }
    public final void M9(int p0){
       this.O = p0;
    }
    public final void O9(boolean p0){
       this.K = p0;
    }
    public void P8(z p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y2.class, "16")) {
          return;
       }
       a.p(p0, "event");
       return;
    }
    public final void Q9(SensorEventListener p0){
       this.M = p0;
    }
    public final ViewGroup R8(){
       return this.B;
    }
    public final void R9(SensorManager p0){
       this.s = p0;
    }
    public final boolean S8(){
       return this.r;
    }
    public final void T9(long p0){
       this.J = p0;
    }
    public final void U9(int p0){
       this.P = p0;
    }
    public final f V8(){
       return this.I;
    }
    public final void V9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y2.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.p = p0;
       return;
    }
    public final PublishSubject W8(){
       return this.w;
    }
    public final f X8(){
       return this.X;
    }
    public void X9(){
    }
    public final ViewGroup Y8(){
       return this.y;
    }
    public final ViewStub Z8(){
       return this.z;
    }
    public final f a9(){
       return this.A;
    }
    public final boolean b9(){
       return this.F;
    }
    public final boolean c9(){
       return this.E;
    }
    public final String d9(){
       return this.Q;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y2.class, "4")) {
          return;
       }
       ViewStub viewStub = (p0 != null)? p0.findViewById(R.id.splash_bubble_stub): null;
       this.C = viewStub;
       return;
    }
    public final f e9(){
       return this.x;
    }
    public final int h9(){
       return this.O;
    }
    public void j8(){
       y2 oy2 = y2.class;
       if (PatchProxy.applyVoid(null, this, oy2, "11")) {
          return;
       }
       this.t = this.x8("SPLASH_VIDEO_TYPE_PARAM");
       this.v = this.x8("SPLASH_IMAGE_TYPE_PARAM");
       this.u = this.x8("SPLASH_BASE_PARAM");
       this.x = this.x8("SPLASH_AD_LOG");
       this.w = this.r8("SPLASH_ENHANCE_DISPLAY_EVENT");
       this.L = this.r8("SPLASH_VIEW_SHOW_EVENT");
       this.N = this.r8("SPLASH_VIEW_INTERACTIVE_SHOW_EVENT");
       this.I = this.x8("SPLASH_CONVERTED");
       y2 tu = this.u;
       if (tu != null) {
          s os = tu.get();
          if (os != null && !PatchProxy.applyVoidOneRefs(os, this, oy2, "12")) {
             if (os.y != null) {
                this.E = true;
             }
             s z = os.z;
             if (z != null) {
                z = (z.length() > 0)? 1: null;
                if (z == true) {
                   this.G = os.z;
                }
             }
             this.F = os.A;
          }
       }
       this.A = this.x8("SPLASH_VIEW_INTERACTIVE_LAYOUT");
       return;
    }
    public final Runnable j9(){
       return this.H;
    }
    public final boolean k9(){
       return this.K;
    }
    public final String l9(){
       return this.G;
    }
    public final View$OnTouchListener m9(){
       return this.T;
    }
    public final int n9(){
       return this.R;
    }
    public final int o9(){
       return this.S;
    }
    public final void onHomeSplashStateEvent(e p0){
       y2 oy2 = y2.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oy2, "9")) {
          return;
       }
       if (p0 != null && p0.a == 4) {
          y2 ts = this.s;
          if (ts != null) {
             ts.unregisterListener(this.M);
          }
          this.E9();
          if (!PatchProxy.applyVoid(null, this, oy2, "17")) {
             f$a uoa = ((this.Q).length() > 0)? 1: null;
             if (uoa) {
                Objects.requireNonNull(c.Z);
                f.a.a(c.K).b(0).e(this.Q, false, new z2(this));
             }
          }
       }
    label_0052 :
       return;
    }
    public final SensorEventListener q9(){
       return this.M;
    }
    public final SensorManager s9(){
       return this.s;
    }
    public final long t9(){
       return this.J;
    }
    public final int u9(){
       return this.P;
    }
    public final String x9(){
       return this.p;
    }
    public void y9(boolean p0,String p1){
    }
}
