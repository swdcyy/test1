package ifd.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ifd.h$a;
import ifd.h$b;
import ifd.h$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ifd.e;
import erd.g;
import crd.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.search.result.fragment.SearchResultTabFragment;
import ifd.f;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ifd.g;
import io.reactivex.internal.functions.Functions;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.q;
import qvb.j;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Boolean;
import xed.b;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import android.view.View;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ekd.q1;

public class h extends PresenterV2	// class@00100c
{
    public RecyclerView p;
    public RecyclerFragment q;
    public boolean r;
    public RecyclerView$r s;
    public ViewTreeObserver$OnGlobalLayoutListener t;
    public q u;

    public void h(){
       super();
       this.r = false;
       this.s = new h$a(this);
       this.t = new h$b(this);
       this.u = new h$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.X7(this.q.n1().subscribe(new e(this)));
       if (this.q.getParentFragment() instanceof SearchResultTabFragment) {
          this.X7(this.q.getParentFragment().n1().subscribe(new f(this)));
       }
       this.X7(this.q.m().subscribe(new g(this), Functions.d()));
       this.q.q().h(this.u);
       this.p.addOnScrollListener(this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.q.q().f(this.u);
       this.p.removeOnScrollListener(this.s);
       return;
    }
    public void P8(boolean p0){
       boolean b;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "4")) {
          return;
       }
       if (!this.q.getParentFragment() instanceof SearchResultTabFragment) {
          return;
       }
       if (p0) {
          this.R8();
          return;
       }else {
          h tp = this.p;
          Object obj = PatchProxy.applyOneRefs(tp, null, b.class, "2");
          b = false;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(tp.getChildCount() <= 0){
             int childCount = tp.getChildCount();
             int i = 0;
             while (i < childCount) {
                View childAt = tp.getChildAt(i);
                if (childAt.findViewById(0x7f0a30e1) == null && (childAt.findViewById(0x7f0a06d2) != null || childAt.findViewById(0x7f0a0f90) != null)) {
                   b = true;
                   break ;
                }
                i = i + 1;
             }
          }
          if (b && this.q.K0()) {
             q1.r0(this.getActivity()).o0("SEARCH");
             this.r = true;
          }else {
             this.R8();
          }
          return;
       }
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       if (this.r != null) {
          q1.r0(this.getActivity()).q0("SEARCH");
          this.r = false;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.q8(RecyclerView.class);
       this.q = this.r8("FRAGMENT");
       return;
    }
}
