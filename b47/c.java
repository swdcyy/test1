package b47.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b47.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oq5.c;
import oq5.a;
import mrd.a;
import c77.p;
import b47.b;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import java.lang.Integer;
import android.app.Activity;
import d61.y;
import android.view.View;
import ekd.m1;

public class c extends PresenterV2	// class@0003c5
{
    public p p;
    public a q;
    public View r;
    public c s;

    public void c(){
       super();
       this.s = new a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.q.H6(this.s);
       c tp = this.p;
       if (tp != null) {
          this.X7(tp.Yf().subscribe(new b(this), Functions.e));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.q.Q0(this.s);
       return;
    }
    public final void P8(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "5")) {
          return;
       }
       if (this.p == null) {
          return;
       }
       if (y.d(this.getActivity())) {
          this.r.setVisibility(0);
       }else if(p0 == 2 || !this.p.Q6()){
          this.r.setVisibility(8);
       }else {
          this.r.setVisibility(0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1e11);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.s8(p.class);
       this.q = this.r8("LIVE_CONFIGURATION_SERVICE");
       return;
    }
}
