package eod.h;
import eod.d;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import androidx.recyclerview.widget.RecyclerView;
import god.a;
import iod.a;
import ynd.g;
import eod.h$b;
import jn9.b;
import jn9.d;
import mn9.b;
import java.util.List;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import eod.h$f;
import eod.h$e;
import eod.h$d;
import eod.h$c;
import faa.a;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import lnc.a1;
import eod.h$a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.utils.TextTemplateConstantV2;
import androidx.recyclerview.widget.RecyclerView$n;
import eod.b;
import jn9.e;
import pn9.c;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import pn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import jn9.b$b;

public final class h extends d	// class@000dc7
{
    public final PostListComponentView c;
    public final RecyclerView d;
    public final a e;
    public final g f;
    public final Observer g;
    public final b h;
    public final Observer i;
    public final h$e j;
    public final h$d k;
    public final h$c l;
    public final Fragment m;

    public void h(Fragment p0,View p1){
       a a;
       Object obj = p0;
       Object obj1 = p1;
       a.p(obj, "fragment");
       a.p(obj1, "rootView");
       super(obj1);
       this.m = obj;
       View view = obj1.findViewById(R.id.template_rv_unfold_container);
       a.o(view, "rootView.findViewById\(R.¡­late_rv_unfold_container\)");
       this.c = view;
       View view1 = obj1.findViewById(R.id.template_rv_unfold);
       a.o(view1, "rootView.findViewById\(R.id.template_rv_unfold\)");
       this.d = view1;
       a = a.a;
       a uoa = a.b(obj);
       this.e = uoa;
       this.f = a.c(obj);
       this.g = new h$b(this);
       d uod = new d(uoa.w0(), 0, null, false, null, null, false, 126, null);
       b uob = new b(a, obj);
       this.h = uob;
       this.i = new h$f(this);
       this.j = new h$e(this);
       h$d uod1 = new h$d(this);
       this.k = uod1;
       h$c uoc = new h$c(this, obj1, obj1);
       this.l = uoc;
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "TextTemplateUnfoldViewBinderV2";
       a.D().w(str, "init", objArray);
       if (PatchProxy.applyVoidOneRefs(obj1, this, h.class, "3")) {
       }else {
          objArray = new Object[i];
          a.D().w(str, "initTemplateUnfoldView", objArray);
          int i1 = 4;
          if (view1.getLayoutManager() == null) {
             view1.setLayoutManager(new GridLayoutManager(p1.getContext(), i1, 1, i));
          }
          view1.addItemDecoration(new h$a(this, i1, (((a1.h() - (TextTemplateConstantV2.m.e() * 4)) - (TextTemplateConstantV2.d * 2)) / 3)));
          e uoe = new e(new b(), uod1, null, uoc, null, null, 52, null);
          view.a(obj1, obj, uob);
          b.w(uob, false, false, 0, 7, 0);
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.e.o0().observe(this.m, this.g);
       this.e.u0().observe(this.m, this.i);
       b.b(this.h, this.j, false, 2, null);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.e.o0().removeObserver(this.g);
       this.e.u0().removeObserver(this.i);
       this.h.B(this.j);
       return;
    }
}
