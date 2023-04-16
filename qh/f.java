package qh.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ef5.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qh.f$a;
import qh.f$c;
import qh.f$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import qw6.a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class f extends PresenterV2	// class@0029df
{
    public BaseFragment p;
    public SlidePlayViewModel q;
    public final a r;
    public final a s;
    public final f$b t;
    public final e u;

    public void f(e p0){
       a.p(p0, "mStickyListenerManager");
       super();
       this.u = p0;
       this.r = new f$a(this);
       this.s = new f$c(this);
       this.t = new f$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       f tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp);
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment\)");
       this.q = slidePlayVie;
       String str = "mSlidePlayViewModel";
       if (slidePlayVie == null) {
          a.S(str);
       }
       slidePlayVie.E(this.r);
       tp = this.q;
       if (tp == null) {
          a.S(str);
       }
       tp.h(this.s);
       tp = this.q;
       if (tp == null) {
          a.S(str);
       }
       tp.i(this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       f tq = this.q;
       String str = "mSlidePlayViewModel";
       if (tq == null) {
          a.S(str);
       }
       tq.g0(this.r);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.l(this.s);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.g(this.t);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       return;
    }
}
