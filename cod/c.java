package cod.c;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import god.a;
import iod.a;
import ynd.g;
import cod.c$g;
import cod.c$i;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.FrameLayout;
import k17.b;
import lnc.a1;
import jn9.b;
import jn9.d;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.data.ColorDataProvider;
import mn9.b;
import java.util.List;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import cod.c$f;
import cod.c$e;
import cod.c$c;
import cod.c$d;
import cod.c$a;
import android.view.View$OnClickListener;
import cod.c$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.widget.CenterLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$n;
import jn9.e;
import cod.a;
import pn9.c;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import pn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import jn9.b$b;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import cod.c$h;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class c extends a	// class@000359
{
    public final a c;
    public final g d;
    public final Observer e;
    public final Observer f;
    public final PostListComponentView g;
    public final RecyclerView h;
    public final ImageView i;
    public final ImageView j;
    public final FrameLayout k;
    public final b l;
    public final b m;
    public final c$f n;
    public final c$e o;
    public final PostListComponentView$a p;
    public final c$d q;
    public final Fragment r;

    public void c(Fragment p0,View p1){
       a a;
       Object obj = p0;
       Object obj1 = p1;
       a.p(obj, "fragment");
       a.p(obj1, "rootView");
       super(obj1);
       this.r = obj;
       a = a.a;
       this.c = a.b(obj);
       this.d = a.c(obj);
       this.e = new c$g(this);
       this.f = new c$i(this);
       View view = obj1.findViewById(R.id.colors_rv_container);
       a.o(view, "rootView.findViewById\(R.¡­    .colors_rv_container\)");
       this.g = view;
       View view1 = obj1.findViewById(R.id.text_style_colors_recyclerview);
       a.o(view1, "rootView.findViewById\(R.¡­tyle_colors_recyclerview\)");
       this.h = view1;
       View view2 = obj1.findViewById(R.id.text_style_mode_switch);
       a.o(view2, "rootView.findViewById\(R.id.text_style_mode_switch\)");
       this.i = view2;
       View view3 = obj1.findViewById(R.id.text_style_alignment_switch);
       a.o(view3, "rootView.findViewById\(R.¡­t_style_alignment_switch\)");
       this.j = view3;
       this.k = obj1.findViewById(0x7f0a3f95);
       b uob = new b(0, a1.e(10.00f), a1.e(10.00f), 0);
       this.l = uob;
       d uod = new d(new ColorDataProvider(), 0, null, false, null, null, false, 126, null);
       b uob1 = new b(v8, obj);
       this.m = uob1;
       this.n = new c$f(this);
       c$e uoe = new c$e(this);
       this.o = uoe;
       c$c uoc = new c$c(this);
       this.p = uoc;
       c$d uod1 = new c$d(this, obj1, obj1);
       this.q = uod1;
       view2.setOnClickListener(new c$a(this));
       view3.setOnClickListener(new c$b(this));
       if (PatchProxy.applyVoidOneRefs(obj1, this, c.class, "6")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().s("TextStyleViewBinderV2", "initColorsView", objArray);
          view1.setLayoutManager(new CenterLayoutManager(p1.getContext(), 0, 0, 0));
          view1.setItemAnimator(null);
          if (!view1.getItemDecorationCount()) {
             view1.addItemDecoration(uob);
          }
          e uoe1 = new e(new a(), uoe, uoc, uod1, null, null, 48, null);
          view.a(obj1, obj, uob1);
          b.w(uob1, false, false, 0, 7, null);
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.c.s0().observe(this.r, this.e);
       this.c.v0().observe(this.r, this.f);
       b.b(this.m, this.n, false, 2, null);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.c.s0().removeObserver(this.e);
       this.c.v0().removeObserver(this.f);
       this.m.B(this.n);
       return;
    }
    public final void D(int p0,boolean p1){
       RecyclerView$LayoutManager layoutManage1;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoc, "11")) {
          return;
       }
       if (!this.h.getWidth() || !this.h.getChildCount()) {
          this.h.getViewTreeObserver().addOnGlobalLayoutListener(new c$h(this, p0, p1));
       }
       RecyclerView$LayoutManager layoutManage = this.h.getLayoutManager();
       Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.widget.CenterLayoutManager");
       layoutManage.H(true);
       if (p1) {
          layoutManage1 = this.h.getLayoutManager();
          Objects.requireNonNull(layoutManage1, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.widget.CenterLayoutManager");
          layoutManage1.W0(100.00f);
          this.h.smoothScrollToPosition(p0);
       }else {
          layoutManage1 = this.h.getLayoutManager();
          Objects.requireNonNull(layoutManage1, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.widget.CenterLayoutManager");
          layoutManage1.W0(10.00f);
          this.h.smoothScrollToPosition(p0);
       }
       return;
    }
}
