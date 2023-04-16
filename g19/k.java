package g19.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.BitSet;
import g19.k$a;
import g19.k$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jta.c;
import g19.l;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.lang.Float;
import oo5.a;
import android.view.View;
import ekd.m1;
import ekd.i;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import rf5.u;

public class k extends PresenterV2	// class@0023c6
{
    public final a A;
    public BaseFragment p;
    public PublishSubject q;
    public u r;
    public SlidePlayViewModel s;
    public l t;
    public View u;
    public float v;
    public boolean w;
    public boolean x;
    public final BitSet y;
    public final c z;

    public void k(){
       super();
       this.v = 0x3f800000;
       this.y = new BitSet();
       this.z = new k$a(this);
       this.A = new k$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       this.t.a(this.z);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p.getParentFragment());
       this.s = slidePlayVie;
       slidePlayVie.P(this.p, this.A);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       this.t.c(this.z);
       this.s.D(this.p, this.A);
       return;
    }
    public void P8(float p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ok, "7")) {
          return;
       }
       a.a(this.p, p0);
       return;
    }
    public void doBindView(View p0){
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ok, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a04db);
       if (PatchProxy.applyVoid(null, this, ok, "8") || (this.u != null && i.c())) {
          this.u.setBackground(a1.f(R.drawable.arg_RES_7f082082));
       }
    label_0035 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_FRAGMENT");
       this.q = this.r8("DETAIL_NASA_BOTTOM_VISIBLE_EVENT");
       this.r = this.q8(u.class);
       this.t = this.r8("NASA_SIDEBAR_STATUS");
       return;
    }
}
