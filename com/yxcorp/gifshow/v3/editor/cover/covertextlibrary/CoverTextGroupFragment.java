package com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment$a;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Integer;
import ypc.a;
import android.util.Pair;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import i2b.a;
import rwc.j;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import androidx.recyclerview.widget.GridLayoutManager;
import qpc.g;
import kotlin.Triple;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Math;
import java.lang.Float;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment$e;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment$b;
import androidx.recyclerview.widget.RecyclerView$r;
import jn9.e;
import qpc.b;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment$c;
import pn9.c;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import pn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import nsd.u;
import qpc.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel;
import jn9.b;
import jn9.d;
import mn9.b;
import androidx.lifecycle.LifecycleOwner;

public class CoverTextGroupFragment extends BaseFragment	// class@000e4b
{
    public RecyclerView j;
    public CoverTextLibraryFragment$b k;
    public DynamicTextViewModel l;
    public CoverTextLibraryFragment$a m;
    public b n;
    public List o;
    public int p;
    public int q;
    public int r;
    public j s;
    public final PostListComponentView$b t;
    public static final int u;

    static {
       CoverTextGroupFragment.u = a1.d(0x7f070271);
    }
    public void CoverTextGroupFragment(){
       super();
       this.p = -1;
       this.q = -1;
       this.r = -1;
       this.t = new CoverTextGroupFragment$a(this);
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, CoverTextGroupFragment.class, "5")) {
          return;
       }
       if (this.j != null) {
          CoverTextGroupFragment tm = this.m;
          if (tm == null || (!tm.a().isEmpty() && this.o != null)) {
             this.j.getViewTreeObserver().addOnGlobalLayoutListener(new CoverTextGroupFragment$d(this));
          }
       }
       return;
    }
    public void dh(){
       int i3;
       if (PatchProxy.applyVoid(null, this, CoverTextGroupFragment.class, "6")) {
          return;
       }
       if (this.j != null) {
          CoverTextGroupFragment tm = this.m;
          if (tm == null || (!tm.a().isEmpty() && this.o != null)) {
             RecyclerView$LayoutManager layoutManage = this.j.getLayoutManager();
             if (!layoutManage instanceof LinearLayoutManager) {
                return;
             }else {
                int i = layoutManage.i0();
                int i1 = layoutManage.c();
                CoverTextGroupFragment tq = this.q;
                int i2 = -1;
                if (i >= tq || i1 >= tq) {
                   i2 = tq + 1;
                   i3 = i1;
                }else {
                   tq = this.p;
                   if (i1 <= tq || i <= tq) {
                      i2 = tq - 1;
                      i3 = i2;
                      i2 = i;
                   }else {
                      i3 = -1;
                   }
                }
                while (i2 <= i3) {
                   if (i2 > this.q || i2 < this.p) {
                      this.o.add(Pair.create(Integer.valueOf(i2), this.m.a().get(i2)));
                   }
                   i2 = i2 + 1;
                }
                this.p = i;
                this.q = i1;
             }
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CoverTextGroupFragment.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.d(this.getActivity(), 0x7f0d04ae, p1, false);
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, CoverTextGroupFragment.class, "4")) {
          return;
       }
       super.onResume();
       CoverTextGroupFragment ts = this.s;
       if (ts != null && (ts.getValue() != null && (this.s.getValue()).equals(this.m.a))) {
          this.ch();
       }
    label_002e :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       RecyclerView recyclerView = this;
       PostListComponentView obj = p0;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, recyclerView, CoverTextGroupFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       recyclerView.j = obj.findViewById(0x7f0a34da);
       obj = obj.findViewById(R.id.recycler_view_container);
       recyclerView.j.setLayoutManager(new GridLayoutManager(this.getActivity(), 4));
       if (recyclerView.j.getItemDecorationCount()) {
          recyclerView.j.removeItemDecorationAt(0);
       }
       FragmentActivity activity = this.getActivity();
       Triple triple = PatchProxy.applyOneRefs(activity, null, g.class, "1");
       if (triple != PatchProxyResult.class) {
       }else {
          float f = 0x3f800000;
          if (activity != null && !activity.isFinishing()) {
             f = Math.min(((float)n.k(activity) / (float)g.a), f);
          }
          triple = new Triple(Float.valueOf(((float)g.d * f)), Float.valueOf(((float)g.b * f)), Float.valueOf(((float)g.c * f)));
       }
       int i = (int)triple.component3().floatValue();
       int u = CoverTextGroupFragment.u;
       CoverTextGroupFragment$e uoe = new CoverTextGroupFragment$e((int)triple.component2().floatValue(), u, i, i, u, u);
       recyclerView.j.addItemDecoration(v6);
       recyclerView.j.addOnScrollListener(new CoverTextGroupFragment$b(recyclerView));
       e uoe1 = new e(new b((int)triple.component1().floatValue()), recyclerView.t, null, new CoverTextGroupFragment$c(recyclerView, this.getView()), null, null, 48, null);
       d uod = new d(new a(recyclerView, recyclerView.m, recyclerView.l), -1, "", false, null, null, false, 112, null);
       b uob = new b(uoe1, recyclerView);
       recyclerView.n = uob;
       obj.a(triple, recyclerView, uob);
       recyclerView.n.v(true, 0, null);
       return;
    }
}
