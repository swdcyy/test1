package i8d.j0;
import ucd.n;
import i8d.e0;
import i8d.j0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import mcd.k;
import java.util.Set;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import i8d.h0;
import erd.r;
import i8d.f0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.u1;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.entity.QPhoto;
import ekd.k1;
import foc.t;
import moc.b;
import android.graphics.Rect;
import android.app.Activity;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import i8d.i0;
import e7d.h;
import e6a.b;

public class j0 extends n	// class@002866
{
    public SearchItem p;
    public BaseFragment q;
    public k r;
    public h s;
    public AppBarLayout t;
    public Runnable u;
    public k$a v;
    public j0$a w;

    public void j0(){
       super();
       this.v = new e0(this);
       this.w = new j0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "4")) {
          return;
       }
       j0 tr = this.r;
       j0 tv = this.v;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidOneRefs(tv, tr, k.class, "1")) {
          tr.a.add(tv);
       }
       this.t = this.q.getParentFragment().getView().findViewById(0x7f0a0225);
       tr = this.q;
       if (tr instanceof SearchResultFragment && tr.Y != null) {
          this.X7(tr.Vg().g().filter(h0.b).subscribe(new f0(this)));
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "2")) {
          return;
       }
       u1.a(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "3")) {
          return;
       }
       u1.b(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "5")) {
          return;
       }
       this.X8();
       this.h0().removeCallbacks(this.w);
       j0 tr = this.r;
       j0 tv = this.v;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidOneRefs(tv, tr, k.class, "2")) {
          tr.a.remove(tv);
       }
       return;
    }
    public View V8(int p0){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj0, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.h0().getLayoutManager().findViewByPosition(p0);
    }
    public int W8(QPhoto p0){
       return -1;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "9")) {
          return;
       }
       j0 tu = this.u;
       if (tu != null) {
          k1.m(tu);
          this.u = null;
       }
       return;
    }
    public void Y8(int p0,View p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oj0, "11")) {
          return;
       }
       t ot = b.c(p0, t.class);
       if (ot != null) {
          ot.p(p1);
       }
       return;
    }
    public void Z8(int p0){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj0, "8")) {
          return;
       }
       RecyclerView recyclerView = this.h0();
       if (recyclerView != null) {
          View view = recyclerView.getLayoutManager().findViewByPosition(p0);
          Rect rect = new Rect();
          if (view != null) {
             view.getGlobalVisibleRect(rect);
             if (rect.bottom >= n.j(this.getActivity())) {
                recyclerView.smoothScrollBy(0, (rect.bottom - n.j(this.getActivity())));
             }
          }else {
             recyclerView.smoothScrollToPosition(p0);
          }
          if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
             recyclerView.getLayoutManager().scrollToPositionWithOffset(p0, 0);
          }else if(recyclerView.getLayoutManager() instanceof LinearLayoutManager){
             recyclerView.getLayoutManager().scrollToPositionWithOffset(p0, 0);
          }
       }
       return;
    }
    public void a9(QPhoto p0,int p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oj0, "7")) {
          return;
       }
       int i = this.W8(p0);
       if (i > -1) {
          this.Z8(i);
          this.X8();
          RecyclerView recyclerView = this.h0();
          if (recyclerView != null) {
             recyclerView.removeCallbacks(this.w);
          }
          i0 oi0 = new i0(this, p1, i);
          this.u = oi0;
          k1.r(oi0, 50);
       }
       return;
    }
    public final void b9(int p0,int p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oj0, "12")) {
          return;
       }
       if (p0 >= 0 && this.h0() != null) {
          oj0 = this.w;
          oj0.b = p1;
          oj0.c = p0;
          oj0.run();
          j0 tt = this.t;
          if (tt != null) {
             tt.p(false, false);
          }
          this.h0().smoothScrollToPosition(p0);
          this.p = null;
       }
       return;
    }
    public RecyclerView h0(){
       return null;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.s = this.r8("SEARCH_FRAGMENT_DELEGATE");
       this.r = this.r8("SEARCH_PLAY_POS_SYNC_ACTION");
       return;
    }
    public void onEventMainThread(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "6")) {
          return;
       }
       if (this.getActivity() != null && this.h0() != null) {
          if (p0.a != this.q.hashCode()) {
             return;
          }else {
             j0 tq = this.q;
             if (tq instanceof SearchResultFragment && tq.Y != null) {
                this.b9(this.W8(p0.b), p0.c);
             }
             this.a9(p0.b, p0.c);
          }
       }
       return;
    }
}
