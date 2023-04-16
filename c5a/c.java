package c5a.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c5a.c$a;
import c5a.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.viewpager.widget.ViewPager$i;
import vy6.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import c5a.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import zv6.t;
import c5a.b;
import java.lang.Runnable;

public abstract class c extends PresenterV2	// class@00054b
{
    public final String p;
    public BaseFragment q;
    public QPhoto r;
    public int s;
    public final a t;
    public SlidePlayViewModel u;
    public final ViewPager$i v;

    public void c(){
       super();
       this.p = "NasaBaseSpecialCameraButtonPresenter";
       this.t = new c$a(this);
       this.v = new c$b(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "2")) {
          return;
       }
       this.r = objArray;
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q);
       this.u = slidePlayVie;
       slidePlayVie.i(this.v);
       this.u.E(this.t);
       this.X7(this.q.Vg().j().subscribe(new a(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c tu = this.u;
       if (tu != null) {
          tu.g(this.v);
          this.u.g0(this.t);
       }
       return;
    }
    public void P8(QPhoto p0,boolean p1){
       this.r = p0;
    }
    public void R8(){
       this.r = null;
    }
    public void S8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "4")) {
          return;
       }
       uoc = this.u;
       if (uoc != null) {
          uoc.t1().b(this.q, new b(this, p0), "NasaBaseSpecialCameraButtonPresenter getRealPositionInAdapter");
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       return;
    }
}
