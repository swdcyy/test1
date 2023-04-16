package aea.b;
import com.yxcorp.gifshow.nasa.NasaShootRefreshView$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.Fragment;
import aoc.a;
import aoc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Float;

public class b implements NasaShootRefreshView$b	// class@000079
{
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final View e;
    public final View f;
    public final View g;
    public final BaseFragment h;
    public boolean i;

    public void b(BaseFragment p0){
       super();
       this.h = p0;
       this.a = b.a(p0.requireView(), 0x7f0a0e03);
       this.b = b.a(p0.requireView(), 0x7f0a2d43);
       this.c = b.a(p0.requireView(), 0x7f0a0df9);
       this.d = b.a(p0.requireView(), 0x7f0a0dfa);
       this.e = p0.requireView().findViewById(0x7f0a3f6a);
       this.f = p0.requireView().findViewById(0x7f0a3643);
       this.g = p0.requireView().findViewById(0x7f0a060c);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.i = true;
       b ta = this.a;
       if (ta != null) {
          ta.f("NasaShootRefreshView");
          ta.c(0);
          ta.a("NasaShootRefreshView");
       }
       ta = this.b;
       if (ta != null) {
          ta.f("NasaShootRefreshView");
          ta.c(0);
          ta.a("NasaShootRefreshView");
       }
       ta = this.c;
       if (ta != null) {
          ta.f("NasaShootRefreshView");
          ta.c(0);
          ta.a("NasaShootRefreshView");
       }
       ta = this.d;
       if (ta != null) {
          ta.f("NasaShootRefreshView");
          ta.c(0);
          ta.a("NasaShootRefreshView");
       }
       ta = this.f;
       if (ta != null) {
          ta.setAlpha(0);
       }
       ta = this.g;
       if (ta != null) {
          ta.setAlpha(0);
       }
       return;
    }
    public void b(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("NasaRefreshStateListener", "onLoadingViewVisible "+p0, objArray);
       uob = this.a;
       if (uob != null) {
          uob.d((p0 ^ 0x01));
       }
       uob = this.b;
       if (uob != null) {
          uob.d((p0 ^ 0x01));
       }
       uob = this.c;
       if (uob != null) {
          uob.d((p0 ^ 0x01));
       }
       uob = this.d;
       if (uob != null) {
          uob.d((p0 ^ 0x01));
       }
       return;
    }
    public void c(float p0,float p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uob, "1")) {
          return;
       }
       uob = this.a;
       if (uob != null) {
          uob.c(p0);
       }
       uob = this.b;
       if (uob != null) {
          uob.c(p0);
       }
       uob = this.c;
       if (uob != null) {
          uob.c(p0);
       }
       uob = this.d;
       if (uob != null) {
          uob.c(p0);
       }
       uob = this.e;
       if (uob != null) {
          uob.setAlpha(p0);
          this.e.setTranslationY(p1);
       }
       b tf = this.f;
       if (tf != null && this.i == null) {
          tf.setAlpha(p0);
       }
       tf = this.g;
       if (tf != null && this.i == null) {
          tf.setAlpha(p0);
       }
       return;
    }
    public void reset(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.i = false;
       b ta = this.a;
       b = true;
       if (ta != null) {
          ta.f("NasaShootRefreshView");
          ta.c(0x3f800000);
          this.a.d(b);
       }
       ta = this.b;
       if (ta != null) {
          ta.f("NasaShootRefreshView");
          ta.c(0x3f800000);
          this.b.d(b);
       }
       ta = this.c;
       if (ta != null) {
          ta.f("NasaShootRefreshView");
          ta.c(0x3f800000);
          this.c.d(b);
       }
       ta = this.d;
       if (ta != null) {
          ta.f("NasaShootRefreshView");
          ta.c(0x3f800000);
          this.d.d(b);
       }
       ta = this.e;
       if (ta != null) {
          ta.setAlpha(0x3f800000);
          this.e.setTranslationY(0);
       }
       ta = this.f;
       if (ta != null) {
          ta.setAlpha(0x3f800000);
       }
       ta = this.g;
       if (ta != null) {
          ta.setAlpha(0x3f800000);
       }
       return;
    }
}
