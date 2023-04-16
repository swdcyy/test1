package ind.b$a;
import ooc.r0;
import ind.b;
import java.lang.Object;
import crd.a;
import ooc.q0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import uwc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uv8.o$b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.Map;
import xsc.c;
import t36.f;
import java.lang.Boolean;
import uxb.u;
import uxb.l;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import r1c.h;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.f;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3;
import androidx.lifecycle.ViewModel;
import ind.b$a$a;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import ind.b$a$b;
import erd.g;
import crd.b;
import ind.b$a$c;
import ind.b$a$d;

public final class b$a implements r0	// class@00102c
{
    public final a b;
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
       this.b = new a();
    }
    public void Z(){
       q0.q(this);
    }
    public void b(c p0){
       q0.j(this, p0);
    }
    public void c(View p0,Bundle p1,BaseEditorFragment p2){
       q0.p(this, p0, p1, p2);
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "4")) {
          return;
       }
       q0.o(this, p0);
       if (p0 == null) {
          return;
       }
       a uoa = this.c.c();
       a.o(uoa, "currentPreviewViewModel");
       if (!PostExperimentUtils.y(uoa.w0())) {
          return;
       }
       f.t0(this.c.f, p0.t0(), c.class);
       return;
    }
    public void d0(){
       q0.g(this);
    }
    public void e(boolean p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       q0.a(this, p0);
       a uoa1 = this.c.c();
       a.o(uoa1, "currentPreviewViewModel");
       if (!PostExperimentUtils.y(uoa1.w0())) {
          return;
       }
       o$b d = this.c.d;
       a.o(d, "mCurrentFragment");
       l.n().Fn(d);
       return;
    }
    public List f(){
       return q0.c(this);
    }
    public void g(int p0){
       q0.i(this, p0);
    }
    public void h(EditorBasePreviewFragment p0,c p1){
       q0.m(this, p0, p1);
    }
    public void i(){
       q0.l(this);
    }
    public List j(h p0,boolean p1){
       return q0.b(this, p0, p1);
    }
    public void m(LayoutInflater p0,ViewGroup p1,Bundle p2,View p3,BaseEditorFragment p4){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
             return;
          }
       }
       a.p(p0, "inflater");
       a.p(p3, "rootView");
       a.p(p4, "currentEditorFragment");
       q0.n(this, p0, p1, p2, p3, p4);
       a uoa1 = this.c.c();
       String str = "currentPreviewViewModel";
       a.o(uoa1, str);
       if (!PostExperimentUtils.y(uoa1.w0())) {
          return;
       }else if(f.F(p4)){
          b$a tc = this.c;
          uoa1 = tc.c();
          a.o(uoa1, str);
          f.o0(tc.f, uoa1.t0(), c.class);
       }
       return;
    }
    public void onActivityDestroy(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       q0.f(this);
       this.b.dispose();
       return;
    }
    public void onActivityResume(){
       q0.h(this);
    }
    public void p(boolean p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       q0.k(this, p0);
       a uoa1 = this.c.c();
       if (uoa1 != null) {
          if (!PostExperimentUtils.y(uoa1.w0())) {
             return;
          }else {
             ViewModel viewModel = ViewModelProviders.of(this.c.a).get(TextKeyboardDataViewModelV3.class);
             a.o(viewModel, "ViewModelProviders.of\(mE¡­aViewModelV3::class.java\)");
             z c = d.c;
             this.b.c(t.create(new b$a$a(viewModel)).subscribeOn(c).subscribe(b$a$b.b));
             t ot = t.create(new b$a$c(viewModel)).subscribeOn(c);
             this.b.c(ot.subscribe(new b$a$d(viewModel)));
          }
       }
       return;
    }
    public void s(Bundle p0){
       q0.e(this, p0);
    }
    public void u(boolean p0,String p1){
       q0.d(this, p0, p1);
    }
}
