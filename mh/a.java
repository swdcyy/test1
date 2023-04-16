package mh.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mh.a$a;
import mh.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class a extends PresenterV2	// class@002689
{
    public QPhoto p;
    public List q;
    public List r;
    public BaseFragment s;
    public SlidePlayViewModel t;
    public FragmentCompositeLifecycleState u;
    public final a v;
    public final d w;

    public void a(){
       super();
       this.v = new a$a(this);
       this.w = new a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a ts = this.s;
       if (ts != null) {
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(ts.getParentFragment());
          this.t = slidePlayVie;
          if (slidePlayVie != null) {
             slidePlayVie.P(ts, this.v);
          }else {
             a tq = this.q;
             if (tq != null) {
                tq.add(this.v);
             }
          }
          if (this.u == null) {
             this.u = new FragmentCompositeLifecycleState(ts);
          }
       }else {
          ts = this.q;
          if (ts != null) {
             ts.add(this.v);
          }
       }
       ts = this.r;
       if (ts != null) {
          ts.add(this.w);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a ts = this.s;
       if (ts != null) {
          a tt = this.t;
          if (tt != null) {
             tt.D(ts, this.v);
          }else {
             ts = this.q;
             if (ts != null) {
                ts.remove(this.v);
             }
          }
       }else {
          ts = this.q;
          if (ts != null) {
             ts.remove(this.v);
          }
       }
       ts = this.r;
       if (ts != null) {
          ts.remove(this.w);
       }
       return;
    }
    public final QPhoto P8(){
       return this.p;
    }
    public final boolean R8(){
       a obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t;
       boolean b = (obj != null)? obj.r(): false;
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.s8(QPhoto.class);
       this.q = this.t8("DETAIL_ATTACH_LISTENERS");
       this.r = this.t8("SLIDE_PLAY_SLIDE_PROFILE_LIST");
       this.s = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
