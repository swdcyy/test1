package b8d.b;
import ucd.n;
import java.util.ArrayList;
import nfd.e;
import b8d.b$a;
import lkd.b;
import b8d.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.d;
import nfd.x3;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nfd.r0;
import e7d.h;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.search.entity.SearchItem;
import nfd.o3;
import nfd.t0;
import android.view.ViewGroup;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import nfd.b1;
import com.yxcorp.plugin.search.ext.filter.SearchResultFilterPresenter$3;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k8d.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$n;
import med.e;
import k8d.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import qvb.i;
import qvb.q;
import qvb.j;
import joc.d;
import joc.c;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import ekd.m1;

public class b extends n	// class@0003b6
{
    public List A;
    public boolean B;
    public List C;
    public e D;
    public final q E;
    public h p;
    public SearchResultFragment q;
    public c r;
    public RecyclerView s;
    public c t;
    public SearchItem u;
    public d v;
    public RecyclerView w;
    public f x;
    public e y;
    public r0 z;

    public void b(){
       super();
       this.C = new ArrayList();
       this.D = new e(new b$a(this));
       this.E = new b$b(this);
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "4")) {
          return;
       }
       x3.a(this.q.g7(), this.v.get());
       this.m8().setVisibility(0);
       this.z = this.p.z();
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          if (q.f(this.z.b())) {
             SearchItem mFilterLists = this.u.mFilterLists;
             this.C = mFilterLists;
             if (q.f(mFilterLists)) {
                o3.H(this.s, 8);
             }else if(PatchProxy.applyVoid(objArray, this, uob, "1")){
                b ts = this.s;
                ts.setPadding(t0.t, ts.getPaddingTop(), t0.t, this.s.getPaddingBottom());
             }
             this.z.i(this.C);
             b1.f(this.C, this.q, 0);
             o3.H(this.s, 0);
          }
          if (!q.f(this.C)) {
             o3.H(this.s, 0);
             this.z.i(this.C);
             if (!PatchProxy.applyVoid(objArray, this, uob, "7") && this.t == null) {
                this.s.setLayoutManager(new SearchResultFilterPresenter$3(this, this.getContext(), 0, 0));
                this.s.setNestedScrollingEnabled(0);
                this.s.setHasFixedSize(true);
                c uoc = new c(this.q, this.s);
                this.t = uoc;
                this.s.setAdapter(uoc);
             }
             if (!PatchProxy.applyVoid(objArray, this, uob, "10")) {
                if (q.f(this.C)) {
                   this.t.M0();
                }else {
                   this.s.scrollToPosition(0);
                   this.t.W0(this.C.get(0));
                   this.t.k0();
                }
             }
          }else {
             this.z.i(objArray);
             o3.H(this.s, 8);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
          SearchItem mSecondFilte = this.u.mSecondFilters;
          if (this.A != mSecondFilte && this.B == null) {
             this.A = mSecondFilte;
             if (!q.f(mSecondFilte)) {
                this.z.j(this.A);
                this.V8(true);
                uob = this.y;
                if (uob != null) {
                   this.w.removeItemDecoration(uob);
                }
                if (this.A.size() > 1) {
                   if (this.y == null) {
                      this.y = new e(0, t0.i, 0, 0);
                   }
                   this.w.addItemDecoration(this.y);
                }
                if (this.x == null) {
                   this.x = new f(this.q, this.w);
                   this.w.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
                   this.w.setNestedScrollingEnabled(0);
                   this.w.setAdapter(this.x);
                }
                this.x.W0(this.A);
                this.x.k0();
             }else {
                o3.H(this.w, 8);
             }
          }
       }
       this.q.q().h(this.E);
       uob = this.r;
       if (uob != null) {
          uob.k(this.D);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       b tr = this.r;
       if (tr != null) {
          tr.t(this.D);
       }
       this.q.q().f(this.E);
       return;
    }
    public void V8(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "8")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.w.getLayoutParams();
       int i = 0;
       if (p0) {
          layoutParams.height = -2;
          layoutParams.width = -2;
          o3.H(this.w, i);
       }else {
          layoutParams.height = i;
          layoutParams.width = i;
          o3.H(this.w, 8);
       }
       this.w.setLayoutParams(layoutParams);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0e93);
       this.w = m1.f(p0, 0x7f0a00c9);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.p = this.r8("SEARCH_FRAGMENT_DELEGATE");
       this.q = this.r8("FRAGMENT");
       this.r = this.t8("SEARCH_SWIPE_DETECTOR");
       this.u = this.q8(SearchItem.class);
       this.v = this.r8("ADAPTER_POSITION_GETTER");
       return;
    }
}
