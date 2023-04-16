package ba4.g;
import rk0.b;
import androidx.fragment.app.Fragment;
import android.content.Context;
import lnc.a1;
import com.yxcorp.utility.n;
import ba4.g$a;
import ba4.g$b;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ca4.a;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import t94.c;
import y94.b;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.model.LiveMerchantContainerDataList;
import android.view.View;
import ca0.a;
import ekd.m1;
import com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba4.g$c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import z8c.e;
import androidx.recyclerview.widget.RecyclerView$n;
import w94.e;
import android.view.animation.OvershootInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.z;

public class g extends b	// class@000356
{
    public b A;
    public RecyclerView$r B;
    public Fragment s;
    public LiveMerchantScaleRecyclerView t;
    public View u;
    public c v;
    public a w;
    public int x;
    public int y;
    public int z;

    public void g(Fragment p0){
       super(p0);
       int i = n.z(a1.c());
       this.x = i;
       this.y = i / 2;
       this.z = (i - a1.d(0x7f070831)) / 2;
       this.A = new g$a(this);
       this.B = new g$b(this);
       this.s = p0;
       this.w = ViewModelProviders.of(p0).get(a.class);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       g tv = this.v;
       if (tv != null) {
          tv.W0(this.w.b);
          this.S8();
          this.w.b.observe(this.A);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       super.J8();
       this.w.b.cancelObserve(this.A);
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       int i = 8;
       if (this.w.b.size() <= 1) {
          this.u.setVisibility(i);
       }else {
          g tu = this.u;
          if (a.b() <= 3) {
             i = 0;
          }
          tu.setVisibility(i);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a2172);
       this.u = m1.f(p0, 0x7f0a2171);
       LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext());
       linearLayout.setOrientation(0);
       this.t.setLayoutManager(linearLayout);
       c uoc = new c(this.s);
       this.v = uoc;
       uoc.h = new g$c(this);
       this.t.setAdapter(this.v);
       this.t.addItemDecoration(new e(0, a1.d(R.dimen.arg_RES_7f070295), this.z, this.z));
       this.t.setItemAnimator(new e(new OvershootInterpolator()));
       this.t.addOnScrollListener(this.B);
       new p().b(this.t);
       return;
    }
}
