package ng1.a;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import ekd.f;
import ng1.a$e;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import ng1.a$b;
import ng1.a$d;
import ng1.a$f;
import ng1.a$a;
import ng1.a$c;

public class a extends c	// class@003314
{
    public AnimatorSet p;
    public AnimatorSet q;
    public AnimatorSet r;
    public View s;
    public View t;
    public View u;
    public static String sLivePresenterClassName = "LiveFloatElementsBasePresenter";

    public void a(){
       super();
    }
    public void P8(){
       AnimatorSet uAnimatorSet;
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "12")) {
          return;
       }
       this.Y8(this.q);
       a tu = this.u;
       long l = 200;
       if (PatchProxy.isSupport(uoa)) {
          uAnimatorSet = PatchProxy.applyTwoRefs(tu, Long.valueOf(l), this, uoa, "1");
          if (uAnimatorSet != PatchProxyResult.class) {
          label_003d :
             this.q = uAnimatorSet;
             uAnimatorSet.addListener(new a$e(this));
             this.q.start();
             return;
          }
       }
       uAnimatorSet = f.e(tu, 0, (float)tu.getHeight(), 200, new AccelerateDecelerateInterpolator());
       goto label_003d ;
    }
    public void R8(){
       AnimatorSet uAnimatorSet;
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "9")) {
          return;
       }
       b.P(LiveLogTag.LIVE_TOP_BAR.appendTag("LiveFloatElementsBasePresenter"), "invoke animHideTopBar");
       this.Y8(this.p);
       a ts = this.s;
       a tt = this.t;
       tt = (tt != null && !tt.getVisibility())? this.t: this.s;
       a uoa1 = tt;
       long l = 200;
       if (PatchProxy.isSupport(uoa)) {
          uAnimatorSet = PatchProxy.applyThreeRefs(ts, uoa1, Long.valueOf(l), this, a.class, "3");
          if (uAnimatorSet != PatchProxyResult.class) {
          label_0066 :
             this.p = uAnimatorSet;
             uAnimatorSet.addListener(new a$b(this));
             this.p.start();
             return;
          }
       }
       uAnimatorSet = f.e(ts, 0, (float)((- uoa1.getHeight()) - uoa1.getTop()), 200, new AccelerateDecelerateInterpolator());
       goto label_0066 ;
    }
    public void S8(){
       AnimatorSet uAnimatorSet;
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "11")) {
          return;
       }
       this.Y8(this.r);
       a tt = this.t;
       if (tt == null) {
          return;
       }
       long l = 200;
       if (PatchProxy.isSupport(uoa)) {
          uAnimatorSet = PatchProxy.applyTwoRefs(tt, Long.valueOf(l), this, uoa, "2");
          if (uAnimatorSet != PatchProxyResult.class) {
          label_0046 :
             this.r = uAnimatorSet;
             uAnimatorSet.addListener(new a$d(this));
             this.r.start();
             return;
          }
       }
       uAnimatorSet = f.e(tt, 0, (float)((- tt.getHeight()) - tt.getTop()), 200, new AccelerateDecelerateInterpolator());
       goto label_0046 ;
    }
    public void V8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "13")) {
          return;
       }
       this.Y8(this.q);
       a tu = this.u;
       AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(tu, this, uoa, "4");
       if (uAnimatorSet != PatchProxyResult.class) {
       }else {
          uAnimatorSet = f.e(tu, (float)tu.getHeight(), 0, 200, new AccelerateDecelerateInterpolator());
       }
       this.q = uAnimatorSet;
       uAnimatorSet.addListener(new a$f(this));
       this.q.start();
       return;
    }
    public void W8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "8")) {
          return;
       }
       this.Y8(this.p);
       a ts = this.s;
       a tt = this.t;
       tt = (tt != null && !tt.getVisibility())? this.t: this.s;
       AnimatorSet uAnimatorSet = PatchProxy.applyTwoRefs(ts, tt, this, uoa, "6");
       if (uAnimatorSet != PatchProxyResult.class) {
       }else {
          uAnimatorSet = f.e(ts, (float)((- tt.getHeight()) - tt.getTop()), 0, 200, new AccelerateDecelerateInterpolator());
       }
       this.p = uAnimatorSet;
       uAnimatorSet.addListener(new a$a(this));
       this.p.start();
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       this.Y8(this.r);
       a tt = this.t;
       if (tt == null) {
          return;
       }
       AnimatorSet uAnimatorSet = this.Z8(tt);
       this.r = uAnimatorSet;
       uAnimatorSet.addListener(new a$c(this));
       this.r.start();
       return;
    }
    public void Y8(AnimatorSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       if (p0 != null) {
          p0.removeAllListeners();
          if (p0.isStarted()) {
             p0.end();
          }
       }
       return;
    }
    public AnimatorSet Z8(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.e(p0, (float)((- p0.getHeight()) - p0.getTop()), 0, 200, new AccelerateDecelerateInterpolator());
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       this.b9(this.u);
       return;
    }
    public void b9(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "17")) {
          return;
       }
       if (p0 != null) {
          p0.setVisibility(4);
       }
       return;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       this.d9(this.u);
       return;
    }
    public void d9(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "16")) {
          return;
       }
       if (p0 != null) {
          p0.setVisibility(0);
       }
       return;
    }
}
