package b9a.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.slide.base.widget.d;
import b9a.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.i;
import vy6.a;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import b9a.a$b;
import bz6.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends PresenterV2	// class@000424
{
    public BaseFragment p;
    public i q;
    public VerticalViewPager r;
    public SlidePlayViewModel s;
    public final d t;
    public ViewGroup u;
    public View v;
    public final a w;

    public void a(){
       super();
       this.t = new d();
       this.w = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p);
       this.s = slidePlayVie;
       this.q = slidePlayVie.X0();
       this.s.E(this.w);
       VerticalViewPager verticalView = this.s.s2();
       this.r = verticalView;
       this.t.setContentView(verticalView);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       this.s.g0(this.w);
       return;
    }
    public void doBindView(View p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a2d6f);
       if (!PatchProxy.applyVoid(null, this, uoa, "6") && this.v == null) {
          this.v = new View(this.getContext());
          this.v.setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
       }
       this.u.addView(this.v);
       this.t.j(new a$b(this.v));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
