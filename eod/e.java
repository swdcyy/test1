package eod.e;
import eod.d;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.v3.widget.FadingEdgeContainer;
import android.widget.ImageView;
import god.a;
import iod.a;
import ynd.g;
import eod.e$a;
import jn9.b;
import jn9.d;
import mn9.b;
import java.util.List;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import eod.e$e;
import eod.e$d;
import eod.e$c;
import eod.e$b;
import faa.a;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eod.f;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.utils.TextTemplateConstantV2;
import tyc.f3;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.v3.widget.CenterLayoutManager;
import android.content.Context;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import eod.g;
import androidx.recyclerview.widget.RecyclerView$r;
import eod.a;
import jn9.e;
import pn9.c;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import pn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import jod.f;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import jn9.b$b;

public final class e extends d	// class@000dbd
{
    public final PostListComponentView c;
    public final LinearLayout d;
    public final RecyclerView e;
    public final FadingEdgeContainer f;
    public final ImageView g;
    public final a h;
    public final g i;
    public final Observer j;
    public final b k;
    public final Observer l;
    public final e$d m;
    public final e$c n;
    public final e$b o;
    public final Fragment p;

    public void e(Fragment p0,View p1){
       a a;
       Object obj = p0;
       Object obj1 = p1;
       a.p(obj, "fragment");
       a.p(obj1, "rootView");
       super(obj1);
       this.p = obj;
       View view = obj1.findViewById(R.id.template_rv_fold_container);
       a.o(view, "rootView.findViewById\(R.¡­mplate_rv_fold_container\)");
       this.c = view;
       View view1 = obj1.findViewById(R.id.ll_texp_template);
       a.o(view1, "rootView.findViewById\(R.id.ll_texp_template\)");
       this.d = view1;
       view1 = obj1.findViewById(R.id.template_rv);
       a.o(view1, "rootView.findViewById\(R.id.template_rv\)");
       this.e = view1;
       View view2 = obj1.findViewById(R.id.fading_edge_container);
       a.o(view2, "rootView.findViewById\(R.id.fading_edge_container\)");
       this.f = view2;
       view2 = obj1.findViewById(R.id.text_template_unfold_btn);
       a.o(view2, "rootView.findViewById\(R.¡­text_template_unfold_btn\)");
       this.g = view2;
       a = a.a;
       a uoa = a.b(obj);
       this.h = uoa;
       g og = a.c(obj);
       this.i = og;
       this.j = new e$a(this);
       d uod = new d(uoa.w0(), 0, null, false, null, null, false, 126, null);
       b uob = new b(v8, obj);
       this.k = uob;
       this.l = new e$e(this);
       this.m = new e$d(this);
       e$c uoc = new e$c(this);
       this.n = uoc;
       e$b uob1 = new e$b(this, obj1, obj1);
       this.o = uob1;
       Object[] objArray = new Object[0];
       String str = "TextTemplateFoldViewBinderV2";
       a.D().s(str, "init", objArray);
       if (PatchProxy.applyVoidOneRefs(obj1, this, e.class, "3")) {
       }else {
          objArray = new Object[0];
          a.D().s(str, "initTemplateFoldView", objArray);
          TextTemplateConstantV2 m = TextTemplateConstantV2.m;
          view2.setOnClickListener(new f(this, m.b()));
          if (view1.getLayoutManager() == null) {
             view1.setLayoutManager(new CenterLayoutManager(p1.getContext(), 0, 0, m.a()));
          }
          view1.addItemDecoration(new b(0, a1.e(19.00f), 0, m.a()));
          view1.addOnScrollListener(new g(this));
          e uoe = new e(new a(), uoc, null, uob1, null, null, 52, null);
          view.a(obj1, obj, uob);
          b.w(uob, false, false, 0, 7, null);
          if (a.g(og.a().d(), "shadow_01") ^ 0x01) {
             view1.setAlpha(0);
          }
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.h.o0().observe(this.p, this.j);
       this.h.u0().observe(this.p, this.l);
       b.b(this.k, this.m, false, 2, null);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.h.o0().removeObserver(this.j);
       this.h.u0().removeObserver(this.l);
       this.k.B(this.m);
       return;
    }
}
