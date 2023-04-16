package g19.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g19.j$a;
import nsd.u;
import g19.j$c;
import g19.j$b;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import qw6.a;
import jta.c;
import rf5.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class j extends PresenterV2	// class@0023c2
{
    public BaseFragment p;
    public SlidePlayViewModel q;
    public u r;
    public final a s;
    public final j$b t;
    public static final j$a u;

    static {
       j.u = new j$a(null);
    }
    public void j(){
       super();
       this.s = new j$c(this);
       this.t = new j$b();
    }
    public static final SlidePlayViewModel P8(j p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mSlidePlayViewModel");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       j tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp);
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment\)");
       this.q = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("mSlidePlayViewModel");
       }
       slidePlayVie.h(this.s);
       tp = this.r;
       if (tp == null) {
          a.S("mSwipeToProfileFeedMovement");
       }
       tp.j(this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       j tq = this.q;
       if (tq == null) {
          a.S("mSlidePlayViewModel");
       }
       tq.l(this.s);
       tq = this.r;
       if (tq == null) {
          a.S("mSwipeToProfileFeedMovement");
       }
       tq.B(this.t);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.q8(u.class);
       a.o(obj, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.r = obj;
       return;
    }
}
