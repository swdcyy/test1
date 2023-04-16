package e19.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e19.g$a;
import e19.g$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.b;
import brd.t;
import t45.d;
import brd.z;
import e19.f;
import erd.g;
import crd.b;
import p5a.e;
import de5.a;
import com.kwai.framework.player.multisource.e;
import p5a.c;
import g59.q;
import e19.g$c;
import com.yxcorp.gifshow.entity.QPhoto;
import g59.q$a;
import android.view.View;
import android.view.ViewGroup;
import com.kwai.library.widget.emptyview.KwaiPlayerFailedStateView;
import android.content.Context;
import lnc.a1;
import android.widget.FrameLayout;
import e19.g$d;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class g extends PresenterV2	// class@002129
{
    public final a A;
    public ViewGroup p;
    public QPhoto q;
    public a r;
    public BaseFragment s;
    public List t;
    public SlidePlayViewModel u;
    public boolean v;
    public q w;
    public KwaiPlayerFailedStateView x;
    public boolean y;
    public final e z;

    public void g(){
       super();
       this.z = new g$a(this);
       this.A = new g$b(this);
    }
    public void E8(){
       g tr;
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.s.getParentFragment());
       this.u = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.s, this.A);
       }else {
          tr = this.t;
          if (tr != null) {
             tr.add(this.A);
          }
       }
       this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new f(this)));
       tr = this.r;
       if (tr != null) {
          tr.getPlayer().d(this.z);
       }
       this.w = new q(this.q, new g$c(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       g tr = this.r;
       if (tr != null) {
          tr.getPlayer().e(this.z);
       }
       tr = this.u;
       if (tr != null) {
          tr.D(this.s, this.A);
       }else {
          tr = this.t;
          if (tr != null) {
             tr.remove(this.A);
          }
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       if (this.v != null) {
          this.R8();
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.S8();
       this.w.a();
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, g.class, "10")) {
          return;
       }
       g tp = this.p;
       if (tp == null) {
          return;
       }
       this.v = false;
       g tx = this.x;
       if (tx != null) {
          tp.removeView(tx);
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       this.W8();
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, g.class, "9")) {
          return;
       }
       g tp = this.p;
       if (tp == null) {
          return;
       }
       boolean b = true;
       this.v = b;
       g tx = this.x;
       if (tx != null) {
          tp.removeView(tx);
       }
       KwaiPlayerFailedStateView kwaiPlayerFa = new KwaiPlayerFailedStateView(this.p.getContext());
       this.x = kwaiPlayerFa;
       kwaiPlayerFa.setBackgroundColor(a1.a(R.color.arg_RES_7f062046));
       this.x.f(new g$d(this));
       this.x.setClickable(b);
       this.p.addView(this.x);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3698);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.s8(a.class);
       this.s = this.r8("DETAIL_FRAGMENT");
       this.t = this.t8("DETAIL_ATTACH_LISTENERS");
       return;
    }
}
