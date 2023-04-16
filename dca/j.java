package dca.j;
import ei0.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import dca.s;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import android.widget.LinearLayout;
import android.widget.ImageView;
import lnc.a1;
import java.util.Objects;
import com.kwai.robust.PatchProxy;
import tyc.g4;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import dca.j$a;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$b;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import dca.j$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import tvc.e;
import cca.b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.widget.FrameLayout;

public final class j extends a	// class@001ef8
{
    public final RecyclerTabWithIndicatorView c;
    public final ScrollToCenterRecyclerView d;
    public final s e;

    public void j(BaseFragment p0,BaseEditorFragment p1,View p2,boolean p3,boolean p4){
       a.p(p0, "previewFragment");
       a.p(p1, "fragment");
       a.p(p2, "rootView");
       super(p2);
       RecyclerTabWithIndicatorView recyclerTabW = p2.findViewById(R.id.recycler_view_tab);
       this.c = recyclerTabW;
       ScrollToCenterRecyclerView scrollToCent = p2.findViewById(R.id.recycler_view);
       this.d = scrollToCent;
       ViewModel viewModel = ViewModelProviders.of(p0).get(s.class);
       a.o(viewModel, "ViewModelProviders.of\(pr¡­ateViewModel::class.java\)");
       this.e = viewModel;
       if (!p3) {
          LinearLayout linearLayout = p2.findViewById(R.id.tab_container);
          a.o(linearLayout, "rootView.tab_container");
          linearLayout.setVisibility(8);
          ImageView imageView = p2.findViewById(R.id.origin_theme);
          a.o(imageView, "rootView.origin_theme");
          imageView.setVisibility(8);
          p2.setPadding(0, a1.d(R.dimen.arg_RES_7f07027a), 0, 0);
       }else {
          String str = "recyclerView";
          a.o(scrollToCent, str);
          Objects.requireNonNull(recyclerTabW);
          if (!PatchProxy.applyVoidOneRefs(scrollToCent, recyclerTabW, RecyclerTabWithIndicatorView.class, "4")) {
             a.p(scrollToCent, str);
             recyclerTabW.n = scrollToCent;
             if (scrollToCent != null) {
                scrollToCent.addOnScrollListener(new g4(recyclerTabW));
             }
          }
          recyclerTabW.setOnTabClickListener(new j$a(this, p4));
          recyclerTabW.setCorner((float)a1.e(0x3f800000));
       }
       viewModel.r0().observe(p1, new j$b(this));
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.D(this.e.u0());
       return;
    }
    public final void D(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoTemplateTabVB", "selectCurIndex\(\) called with: index = "+p0.c(), objArray);
       if (p0.c() < 0) {
          return;
       }
       this.d.x(p0.c());
       j tc = this.c;
       a.o(tc, "tabView");
       if (!tc.getVisibility()) {
          this.c.p(p0.c());
       }
       return;
    }
}
