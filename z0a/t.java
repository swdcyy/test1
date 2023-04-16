package z0a.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import c95.c;
import bf5.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import z0a.t$a;
import androidx.recyclerview.widget.RecyclerView$n;
import ekd.m1;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import d6a.u;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rf5.u;

public class t extends PresenterV2	// class@0047b8
{
    public RecyclerView p;
    public u q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public c t;
    public q u;
    public View v;

    public void t(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       if (this.v == null) {
          return;
       }
       this.s = SlidePlayViewModel.B0(this.r);
       t tu = this.u;
       t tt = this.t;
       tu.e = tt.o;
       tu.f = tt.p;
       tu.g = tt.r;
       RecyclerView recyclerView = this.v.findViewById(R.id.profile_photos_recycler_view);
       this.p = recyclerView;
       if (recyclerView == null) {
          return;
       }
       NpaLinearLayoutManager npaLinearLay = new NpaLinearLayoutManager(this.getActivity());
       npaLinearLay.M0(true);
       this.p.setLayoutManager(npaLinearLay);
       this.p.addItemDecoration(new t$a(this));
       this.R8();
       return;
    }
    public void P8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "3")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a3a23).inflate();
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, t.class, "5")) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.p.getLayoutParams();
       layoutParams.bottomMargin = this.u.f;
       this.p.setLayoutParams(layoutParams);
       View view = this.v.findViewById(R.id.profile_feed_live_frame);
       ViewGroup$MarginLayoutParams layoutParams1 = view.getLayoutParams();
       layoutParams1.topMargin = this.u.e;
       view.setLayoutParams(layoutParams1);
       view = this.v.findViewById(R.id.global_mine_photos_wrapper);
       layoutParams1 = view.getLayoutParams();
       layoutParams1.bottomMargin = a1.d(0x7f070fb0);
       view.setLayoutParams(layoutParams1);
       if (this.t.j != null) {
          view.setVisibility(8);
       }
       if (u.a()) {
          n.a(this.v.findViewById(R.id.profile_feed_avatar_wrapper));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       this.P8(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.q = this.q8(u.class);
       this.t = this.q8(c.class);
       this.u = this.q8(q.class);
       return;
    }
}
