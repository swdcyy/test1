package ad9.i;
import lnc.a1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ad9.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ad9.e;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import crd.b;
import lnc.b9;
import java.lang.Boolean;
import ad9.i$c;
import ad9.d;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import ad9.i$b;
import com.yxcorp.utility.n;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import j8c.a;
import q87.c;
import ad9.h;
import ad9.i$a;
import java.lang.Long;
import java.lang.Integer;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import ad9.b;
import ad9.c;
import erd.g;

public class i	// class@0000a5
{
    public BaseFragment a;
    public final l b;
    public ProgressBar c;
    public TextView d;
    public TextView e;
    public KwaiImageView f;
    public View g;
    public TextView h;
    public View i;
    public View j;
    public b k;
    public boolean l;
    public Animator m;
    public boolean n;
    public int o;
    public static final int p;
    public static final int q;
    public static final int r;

    static {
       i.p = a1.e(6.00f);
       i.q = a1.e(195.00f);
       i.r = a1.e(0x41f00000);
    }
    public void i(BaseFragment p0,l p1,int p2){
       super();
       this.k = null;
       this.o = 0;
       this.a = p0;
       this.b = p1;
       this.o = p2;
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "10")) {
          return;
       }
       i tg = this.g;
       if (tg == null) {
          return;
       }
       if (p0 != null) {
          f.G(tg, new e(this, p0));
       }else {
          tg.setTranslationY(0);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i.class, "13")) {
          return;
       }
       b9.a(this.k);
       return;
    }
    public void c(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "7")) {
          return;
       }
       this.l = false;
       this.d(p0, new i$c(this), new d(this));
       return;
    }
    public void d(boolean p0,Animator$AnimatorListener p1,Runnable p2){
       int i;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, i.class, "4")) {
          return;
       }
       if (this.g == null) {
          return;
       }
       i tm = this.m;
       if (tm != null && tm.isRunning()) {
          this.m.cancel();
       }
       if (this.g.getVisibility()) {
          if (p2 != null) {
             p2.run();
          }
          this.b.a(this.g);
          return;
       }else {
          i = 0;
          if (p0) {
             i tg = this.g;
             float[] uofloatArray = new float[]{tg.getAlpha(),0};
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tg, "alpha", uofloatArray);
             this.m = objectAnimat;
             objectAnimat.setDuration(300);
             this.m.setInterpolator(new e());
             this.m.addListener(new i$b(this));
             if (p1 != null) {
                this.m.addListener(p1);
             }
             this.m.start();
          }else {
             n.Y(this.g, 4, i);
             if (p2 != null) {
                p2.run();
             }
             this.b.a(this.g);
          }
          return;
       }
    }
    public boolean e(){
       ViewStubInflater2 obj = PatchProxy.apply(null, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a.getView() == null || this.a.isDetached()) {
          return false;
       }
       obj = new ViewStubInflater2(0x7f0a031b, 0x7f0a031a);
       i to = this.o;
       if (to != null) {
          obj.e(to);
       }
       obj.d(this.a.getView());
       this.g = obj.b(0x7f0a031a);
       this.c = obj.b(0x7f0a031c);
       this.d = obj.b(0x7f0a031d);
       this.e = obj.b(0x7f0a031e);
       this.h = obj.b(0x7f0a2ed9);
       this.f = obj.b(0x7f0a0319);
       this.i = obj.b(0x7f0a0316);
       this.j = obj.b(0x7f0a0317);
       return true;
    }
    public void f(boolean p0){
       this.n = p0;
    }
    public void g(boolean p0){
       int i;
       i te;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "2")) {
          return;
       }
       i = 1;
       int i1 = 2;
       if (p0) {
          View[] viewArray = new View[i1];
          viewArray[0] = this.h;
          viewArray[i] = this.i;
          n.Z(0, viewArray);
          this.d.setPadding(0, 0, 0, 0);
          te = this.e;
          if (te != null) {
             te.setPadding(0, 0, 0, 0);
          }
       }else {
          View[] viewArray1 = new View[i1];
          viewArray1[0] = this.h;
          viewArray1[i] = this.i;
          n.Z(8, viewArray1);
          te = this.e;
          if (te != null && te.getWidth() > 0) {
             this.e.setPadding(0, 0, i.p, 0);
             this.d.setPadding(0, 0, 0, 0);
          }else {
             this.d.setPadding(0, 0, i.p, 0);
          }
       }
       return;
    }
    public void h(Animator$AnimatorListener p0,Runnable p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "3")) {
          return;
       }
       if (this.g == null) {
          return;
       }
       i = 0;
       if (this.n != null) {
          Object[] objArray = new Object[i];
          a.D().s("AutoDownloadBarViewHelper", "showDownloadPanel, mIsBlockPanelShow", objArray);
          if (p1 != null) {
             p1.run();
          }
          return;
       }else {
          i tm = this.m;
          if (tm != null && tm.isRunning()) {
             this.m.cancel();
          }
          if (!this.g.getVisibility() && !this.g.getAlpha() - 0x3f800000) {
             if (p1 != null) {
                p1.run();
             }
             this.b.b(this.g);
             return;
          }else {
             i tg = this.g;
             float[] uofloatArray = new float[]{tg.getAlpha(),0x3f800000};
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tg, "alpha", uofloatArray);
             this.m = objectAnimat;
             objectAnimat.setDuration(300);
             this.m.setInterpolator(new e());
             this.m.addListener(new i$a(this));
             if (p0 != null) {
                this.m.addListener(p0);
             }
             this.m.start();
             this.b.b(this.g);
             return;
          }
       }
    }
    public void i(Runnable p0,long p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, oi, "12")) {
          return;
       }
       this.k = t.just(Integer.valueOf(1)).delay(p1, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).compose(this.a.Ug(FragmentEvent.DESTROY_VIEW)).subscribe(new b(this, p0), c.b);
       return;
    }
}
