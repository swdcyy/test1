package led.g;
import ucd.n;
import nfd.e;
import led.g$a;
import lkd.b;
import led.g$b;
import led.g$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.google.android.material.appbar.AppBarLayout;
import nfd.o3;
import qvb.i;
import qvb.q;
import qvb.j;
import joc.d;
import joc.c;
import android.view.View;
import joc.y;
import android.view.ViewGroup;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.plugin.search.SearchPage;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import g9c.a;
import led.m;
import led.m$a;
import y8c.f$b;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import nfd.t0;
import med.e;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$n;
import ekd.m1;
import e7d.f;
import e7d.h;

public class g extends n	// class@001c22
{
    public RefreshLayout$h A;
    public f p;
    public h q;
    public SearchResultFragment r;
    public RecyclerView s;
    public List t;
    public m u;
    public boolean v;
    public c w;
    public AppBarLayout x;
    public e y;
    public q z;

    public void g(){
       super();
       this.y = new e(new g$a(this));
       this.z = new g$b(this);
       this.A = new g$c(this);
    }
    public void E8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "6")) {
          return;
       }
       if (this.r.Ac() != null) {
          this.r.Ac().c(this.A);
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "7")) {
          o3.V(this.x);
       }
       this.r.q().h(this.z);
       og = this.w;
       if (og != null) {
          og.k(this.y);
       }
       y.b(this.s);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, g.class, "9")) {
          return;
       }
       this.r.q().f(this.z);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       g tw = this.w;
       if (tw != null) {
          tw.t(this.y);
       }
       this.s.clearAnimation();
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, g.class, "10")) {
          return;
       }
       if (!q.f(this.t)) {
          this.t.clear();
       }
       this.X8();
       return;
    }
    public boolean W8(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.r.kc() == SearchPage.COMMODITY)? true: false;
       return b;
    }
    public void X8(){
       g tu;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "11")) {
          return;
       }
       if (q.f(this.t)) {
          tu = this.u;
          if (tu != null) {
             tu.M0();
          }
          this.s.setVisibility(8);
       }else {
          boolean b = this.W8();
          m$a uoa = PatchProxy.apply(objArray, this, og, "13");
          if (uoa != patchProxyRe) {
          }else {
             uoa = new m$a();
             uoa.f = this.r;
             uoa.i = this.q;
             uoa.j = this.s;
             uoa.h = this.p;
          }
          this.u = new m(uoa, this.v, b);
          if (b) {
             this.s.setBackground(ContextCompat.getDrawable(this.getContext(), R.color.arg_RES_7f0608d1));
          }
          this.s.setAdapter(this.u);
          int i = 0;
          this.s.setVisibility(i);
          this.s.scrollToPosition(i);
          if (!PatchProxy.applyVoid(objArray, this, og, "12")) {
             LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext());
             linearLayout.setOrientation(i);
             int i1 = t0.i;
             int t = t0.t;
             Object obj = PatchProxy.apply(objArray, this, og, "3");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(this.r.kc() == SearchPage.AGGREGATE){
                i = 1;
             }
             b1 = i;
             int i2 = (b1)? t0.m: i1;
             e uoe = new e(i2, i1, i1, t, t0.j);
             this.s.setLayoutManager(linearLayout);
             if (!this.s.getItemDecorationCount()) {
                this.s.addItemDecoration(uoa);
             }
             this.s.setHasFixedSize(true);
          }
          tu = this.t;
          if (tu != null) {
             this.u.W0(tu);
             this.u.k0();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "5")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3cb4);
       this.x = m1.f(p0, 0x7f0a022a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.r8("SEARCH_RESULT_DELEGATE");
       this.q = this.r8("SEARCH_FRAGMENT_DELEGATE");
       this.r = this.r8("FRAGMENT");
       this.w = this.t8("SEARCH_SWIPE_DETECTOR");
       return;
    }
}
