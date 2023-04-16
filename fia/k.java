package fia.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fia.k$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;

public final class k extends PresenterV2	// class@002918
{
    public t p;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public f s;
    public b t;
    public final k$a u;

    public void k(){
       super();
       this.u = new k$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       k tq = this.q;
       String str = "mFragment";
       if (tq == null) {
          a.S(str);
       }
       Fragment parentFragme = tq.getParentFragment();
       a.m(parentFragme);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(parentFragme);
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment!!\)");
       this.r = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("mSlidePlayViewModel");
       }
       k tq1 = this.q;
       if (tq1 == null) {
          a.S(str);
       }
       slidePlayVie.P(tq1, this.u);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       k tr = this.r;
       if (tr == null) {
          a.S("mSlidePlayViewModel");
       }
       k tq = this.q;
       if (tq == null) {
          a.S("mFragment");
       }
       tr.D(tq, this.u);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.t8("DETAIL_SLIDE_SCREEN_VISIBILITY_EVENT");
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       this.s = this.x8("SLIDE_PLAY_CLOSE_STATE");
       return;
    }
}
