package gqb.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gqb.o$a;
import nsd.u;
import gqb.o$c;
import gqb.o$b;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import th0.c;
import qw6.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;

public final class o extends PresenterV2	// class@002b84
{
    public SlidePlayViewModel p;
    public BaseFragment q;
    public QPhoto r;
    public ObjectAnimator s;
    public ObjectAnimator t;
    public View u;
    public final o$c v;
    public final o$b w;
    public static final o$a x;

    static {
       o.x = new o$a(null);
    }
    public void o(){
       super();
       this.v = new o$c(this);
       this.w = new o$b(this);
    }
    public static final SlidePlayViewModel P8(o p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mSlidePlayViewModel");
       }
       return p0;
    }
    public void E8(){
       ObjectAnimator objectAnimat;
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       if (this.u == null) {
          return;
       }
       o tq = this.q;
       String str = "mFragment";
       if (tq == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tq.requireParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(m¡­.requireParentFragment\(\)\)");
       this.p = slidePlayVie;
       long l = 200;
       int i = 2;
       if (this.s == null) {
          objectAnimat = ObjectAnimator.ofFloat(this.u, View.ALPHA, new float[i]{0x3f800000,0x3e99999a}).setDuration(l);
          this.s = objectAnimat;
          if (objectAnimat != null) {
             objectAnimat.setInterpolator(new e());
          }
       }
       if (this.t == null) {
          objectAnimat = ObjectAnimator.ofFloat(this.u, View.ALPHA, new float[i]{0x3e99999a,0x3f800000}).setDuration(l);
          this.t = objectAnimat;
          if (objectAnimat != null) {
             objectAnimat.setInterpolator(new c());
          }
       }
       tq = this.p;
       if (tq == null) {
          a.S("mSlidePlayViewModel");
       }
       o tq1 = this.q;
       if (tq1 == null) {
          a.S(str);
       }
       tq.o0(tq1, this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "5")) {
          return;
       }
       o tp = this.p;
       if (tp == null) {
          a.S("mSlidePlayViewModel");
       }
       o tq = this.q;
       if (tq == null) {
          a.S("mFragment");
       }
       tp.y(tq, this.w);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       o tp = this.p;
       if (tp == null) {
          a.S("mSlidePlayViewModel");
       }
       if (!tp.b1()) {
          tp = this.s;
          if (tp != null) {
             tp.cancel();
          }
          tp = this.t;
          if (tp != null) {
             tp.cancel();
          }
          tp = this.u;
          if (tp != null) {
             tp.setAlpha(0x3f800000);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "3")) {
          return;
       }
       p0 = (p0 != null)? p0.findViewById(R.id.music_radio_bottom_container): null;
       this.u = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(PageAccessIds.FRAGMENT\)");
       this.q = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       return;
    }
}
