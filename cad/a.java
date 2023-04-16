package cad.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.result.a;
import cad.a$a;
import nfd.e;
import cad.a$b;
import lkd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oad.b;
import y8c.d;
import com.yxcorp.plugin.search.entity.SearchItem;
import zed.q;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import y8c.q;
import y8c.g;
import oad.b$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.utils.j;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import nfd.c0;
import android.view.ViewGroup;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import java.util.List;
import g9c.a;
import nfd.y0;
import java.util.Map;
import nfd.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import joc.d;
import joc.c;
import android.view.View;
import joc.y;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.x;
import nfd.t0;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$n;
import lnc.a1;
import com.yxcorp.plugin.search.utils.j0;
import nfd.o3;
import ekd.m1;

public class a extends PresenterV2	// class@000510
{
    public RecyclerView A;
    public b$a B;
    public d C;
    public RecyclerView$r D;
    public e E;
    public RecyclerFragment p;
    public SearchItem q;
    public Map r;
    public c s;
    public q t;
    public final a u;
    public b v;
    public RecyclerView$LayoutManager w;
    public RecyclerView$n x;
    public j y;
    public q z;

    public void a(a p0){
       super();
       this.D = new a$a(this);
       this.E = new e(new a$b(this));
       this.u = p0;
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          return;
       }
       if (this.v == null) {
          b uob = new b(this.q, this.t, this.u, this.C.get());
          this.v = uob;
          this.A.setAdapter(uob);
       }
       this.v.s1(this.q);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "8")) {
          this.v.o1(this.p);
          uoa = this.B;
          if (uoa == null) {
             this.B = new b$a(this.q, this.p);
          }else {
             uoa.c(this.q);
          }
          if (this.y == null) {
             this.y = new j(this.p, this.B, this.A, this.v);
          }
       }
       this.A.setVisibility(0);
       SearchItem mKBoxItem = this.q.mKBoxItem;
       if (mKBoxItem != null) {
          this.v.W0(mKBoxItem.mKBoxFeeds);
       }
       this.v.o1(this.p);
       this.v.k0();
       if (!y0.j()) {
          if (this.r.containsKey(this.q)) {
             this.z = this.r.get(this.q);
          }else {
             q oq = new q();
             this.z = oq;
             this.r.put(this.q, oq);
          }
          this.w.scrollToPositionWithOffset(this.z.b(), this.z.a());
       }
       uoa = this.s;
       if (uoa != null) {
          uoa.k(this.E);
       }
       this.y.a();
       y.b(this.A);
       return;
    }
    public void F8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       int i = 2;
       if (y0.j()) {
          this.w = new GridLayoutManager(this.getContext(), i);
       }else {
          LinearLayoutManager linearLayout = new LinearLayoutManager(this.getActivity());
          this.w = linearLayout;
          linearLayout.setOrientation(0);
       }
       this.A.setLayoutManager(this.w);
       this.A.setItemAnimator(objArray);
       this.A.setHasFixedSize(true);
       this.A.addOnScrollListener(this.D);
       x ox = new x();
       x.x(this.A, 6000);
       ox.y(0x3f4ccccd);
       int i1 = t0.i;
       ox.w(((- i1) * 2));
       ox.b(this.A);
       RecyclerView$n on = PatchProxy.apply(objArray, this, uoa, "4");
       if (on != PatchProxyResult.class) {
       }else {
          int i2 = a1.e(8.00f);
          int i3 = a1.e(6.00f);
          if (y0.j()) {
             int t = t0.t;
             on = j0.n(t, t, t0.f, 0, i1, i1);
          }else {
             on = o3.U(i2, i3, 0);
          }
       }
       this.x = on;
       this.A.addItemDecoration(on);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       this.A.removeOnScrollListener(this.D);
       this.v.Z0();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.y.b();
       a ts = this.s;
       if (ts != null) {
          ts.t(this.E);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a06d2);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(SearchItem.class);
       this.r = this.r8("SEARCH_LIST_SCROLL_STATE");
       this.s = this.t8("SEARCH_SWIPE_DETECTOR");
       this.t = this.q8(q.class);
       this.C = this.r8("ADAPTER_POSITION_GETTER");
       return;
    }
}
