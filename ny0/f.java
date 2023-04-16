package ny0.f;
import im8.g;
import ng1.a;
import ny0.d;
import ny0.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import oq5.c;
import jv1.b;
import d71.a;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewGroup;
import cc1.a;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import ny0.i;
import java.util.Map;
import java.util.HashMap;
import java.lang.Long;
import java.util.Set;
import java.util.Iterator;
import gq5.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qc2.a;
import lk2.b;
import ok2.h;
import java.lang.Runnable;
import e93.f;
import android.animation.AnimatorSet;
import java.lang.Float;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import ekd.f;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import ny0.e;
import ny0.f$b;
import android.animation.Animator$AnimatorListener;
import ny0.f$c;

public class f extends a implements g	// class@003425
{
    public h A;
    public Runnable B;
    public Set C;
    public boolean D;
    public a0 E;
    public c F;
    public f G;
    public View v;
    public ImageView w;
    public View x;
    public a y;
    public b z;
    public static String sLivePresenterClassName = "LiveAudienceFloatElementsPresenter";

    public void f(){
       super();
       this.D = true;
       this.F = new d(this);
       this.G = new f$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.E.x.H6(this.F);
       if (this.E.x.H2()) {
          if (this.E.l()) {
             this.h9(0);
          }else {
             this.q9(false);
          }
       }
       return;
    }
    public void J8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "24")) {
          this.j9();
          this.E.x.Q0(this.F);
          this.D = true;
       }
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, f.class, "21")) {
          return;
       }
       this.E.a2.d(4);
       this.w.setVisibility(4);
       return;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, f.class, "20")) {
          return;
       }
       this.E.a2.j();
       this.w.setVisibility(0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.u = a.a(p0);
       this.w = m1.f(p0, 0x7f0a1b30);
       this.s = m1.f(p0, 0x7f0a3fd0);
       this.x = m1.f(p0, 0x7f0a2801);
       this.v = m1.f(p0, 0x7f0a208d);
       this.t = m1.f(p0, 0x7f0a26b7);
       return;
    }
    public void e9(){
       if (PatchProxy.applyVoid(null, this, f.class, "13")) {
          return;
       }
       this.h9(200);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new i());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public final void h9(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "14")) {
          return;
       }
       this.j9();
       if (p0 > 0) {
          this.R8();
          this.P8();
       }else {
          this.m9();
          this.a9();
       }
       this.S8();
       f tC = this.C;
       if (tC != null && !tC.isEmpty()) {
          Iterator iterator = this.C.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(false);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.E = this.q8(a0.class);
       this.y = this.s8(a.class);
       this.z = this.s8(b.class);
       this.A = this.s8(h.class);
       return;
    }
    public void j9(){
       if (PatchProxy.applyVoid(null, this, f.class, "16")) {
          return;
       }
       f tB = this.B;
       if (tB != null) {
          f.f(tB);
          this.B = null;
       }
       this.Y8(this.p);
       this.Y8(this.q);
       this.Y8(this.r);
       return;
    }
    public final AnimatorSet k9(View p0,float p1,float p2){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, f.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return f.e(p0, p1, p2, 200, new AccelerateDecelerateInterpolator());
    }
    public final AnimatorSet l9(View p0,float p1,float p2){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, f.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return f.e(p0, p1, p2, 200, new AccelerateDecelerateInterpolator());
    }
    public void m9(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       b.P(LiveLogTag.LIVE_TOP_BAR.appendTag("LiveAudienceFloatElementsPresenter"), "invoke hideTopBar");
       this.s.setVisibility(8);
       return;
    }
    public boolean n9(){
       Object obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.s.getVisibility())? true: false;
       return b;
    }
    public void o9(){
       if (PatchProxy.applyVoid(null, this, f.class, "15")) {
          return;
       }
       this.j9();
       if (this.E.x.H2()) {
          e uoe = new e(this);
          this.B = uoe;
          f.j("animHideFloatElements", uoe, 5000);
       }
       return;
    }
    public void q9(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "19")) {
          return;
       }
       this.j9();
       AnimatorSet uAnimatorSet = this.Z8(this.s);
       this.p = uAnimatorSet;
       if (p0) {
          uAnimatorSet.addListener(new f$b(this));
       }else {
          uAnimatorSet.addListener(new f$c(this));
       }
       this.p.start();
       this.V8();
       this.X8();
       f tC = this.C;
       if (tC != null && !tC.isEmpty()) {
          Iterator iterator = this.C.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(true);
          }
       }
       return;
    }
}
