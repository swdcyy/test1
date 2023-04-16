package nod.e$a;
import ooc.r0;
import nod.e;
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
import faa.a;
import q87.c;
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
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import nod.a;
import nod.e$a$a;
import java.lang.Runnable;
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
import nod.e$a$b;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import nod.e$a$c;
import erd.g;
import crd.b;
import nod.e$a$d;
import nod.e$a$e;

public final class e$a implements r0	// class@001ea3
{
    public final a b;
    public final e c;

    public void e$a(e p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "3")) {
          return;
       }
       q0.o(this, p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("TextEditorV3Factory", "onFragmentDestroyView", objArray);
       if (p0 == null) {
          return;
       }
       a uoa = this.c.c();
       a.o(uoa, "currentPreviewViewModel");
       if (!PostExperimentUtils.F(uoa.w0())) {
          Object[] objArray1 = new Object[i];
          a.D().w("TextEditorV3Factory", "onFragmentDestroyView return", objArray1);
          return;
       }else {
          f.t0(this.c.f, p0.t0(), c.class);
          return;
       }
    }
    public void d0(){
       q0.g(this);
    }
    public void e(boolean p0){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       q0.a(this, p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("TextEditorV3Factory", "beforeNextStep", objArray);
       a uoa1 = this.c.c();
       a.o(uoa1, "currentPreviewViewModel");
       if (!PostExperimentUtils.F(uoa1.w0())) {
          Object[] objArray1 = new Object[i];
          a.D().w("TextEditorV3Factory", "beforeNextStep return", objArray1);
          return;
       }else {
          o$b d = this.c.d;
          a.o(d, "mCurrentFragment");
          l.n().Fn(d);
          return;
       }
    }
    public List f(){
       ArrayList obj = PatchProxy.apply(null, this, e$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       a uoa = this.c.c();
       a.o(uoa, "currentPreviewViewModel");
       if (!PostExperimentUtils.F(uoa.w0())) {
          Object[] objArray = new Object[0];
          a.D().w("TextEditorV3Factory", "buildTaskList return", objArray);
          return obj;
       }else {
          obj.add(new a(new e$a$a(this)));
          return obj;
       }
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
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       a.p(p0, "inflater");
       a.p(p3, "rootView");
       a.p(p4, "currentEditorFragment");
       q0.n(this, p0, p1, p2, p3, p4);
       Object[] objArray1 = new Object[0];
       String str = "TextEditorV3Factory";
       a.D().w(str, "onFragmentCreateView", objArray1);
       a uoa1 = this.c.c();
       String str1 = "currentPreviewViewModel";
       a.o(uoa1, str1);
       if (!PostExperimentUtils.F(uoa1.w0())) {
          objArray1 = new Object[0];
          a.D().w(str, "onFragmentCreateView return", objArray1);
          return;
       }else if(f.F(p4)){
          Object[] objArray2 = new Object[0];
          a.D().w(str, "onFragmentCreateView picture add mPictureReorderListener", objArray2);
          e$a tc = this.c;
          uoa1 = tc.c();
          a.o(uoa1, str1);
          f.o0(tc.f, uoa1.t0(), c.class);
       }
       return;
    }
    public void onActivityDestroy(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "6")) {
          return;
       }
       q0.f(this);
       Object[] objArray = new Object[0];
       a.D().w("TextEditorV3Factory", "onActivityDestroy", objArray);
       this.b.dispose();
       return;
    }
    public void onActivityResume(){
       q0.h(this);
    }
    public void p(boolean p0){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       q0.k(this, p0);
       a uoa1 = this.c.c();
       if (uoa1 != null) {
          if (!PostExperimentUtils.F(uoa1.w0())) {
             Object[] objArray = new Object[0];
             a.D().w("TextEditorV3Factory", "onEditorFirstFrameShown return", objArray);
             return;
          }else {
             ViewModel viewModel = ViewModelProviders.of(this.c.a).get(TextKeyboardDataViewModelV3.class);
             a.o(viewModel, "ViewModelProviders.of\(mE¡­aViewModelV3::class.java\)");
             z c = d.c;
             this.b.c(t.create(new e$a$b(viewModel)).subscribeOn(c).subscribe(e$a$c.b));
             this.b.c(t.create(new e$a$d(viewModel)).subscribeOn(c).subscribe(e$a$e.b));
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
