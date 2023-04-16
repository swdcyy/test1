package com.yxcorp.gifshow.v3.editor.text.d1;
import uv8.o$b;
import com.yxcorp.gifshow.v3.editor.text.d1$a;
import com.yxcorp.gifshow.v3.editor.text.d1$b;
import com.yxcorp.gifshow.v3.editor.text.d1$c;
import huc.m1;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t36.f;
import ooc.j0;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.j;
import huc.t0;
import uwc.a;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import wba.p0;
import ovc.h;
import huc.l1;
import java.util.List;
import java.util.Iterator;
import ei0.a;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import xuc.e;
import com.yxcorp.gifshow.v3.editor.text.d1$d;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import xuc.c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import com.kuaishou.edit.draft.Workspace$Source;

public class d1 extends o$b	// class@0013bb
{
    public c f;
    public r0 g;
    public VideoFrameChangeListener h;
    public final a i;

    public void d1(){
       super();
       this.f = new d1$a(this);
       this.g = new d1$b(this);
       this.h = new d1$c(this);
       this.i = new m1(this);
    }
    public void a(EditorActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d1.class, "1")) {
          return;
       }
       super.a(p0);
       this.b.o0().d(this.g);
       return;
    }
    public BaseEditor e(){
       t0 ot0 = PatchProxy.apply(null, this, d1.class, "11");
       if (ot0 != PatchProxyResult.class) {
       }else if(this.k()){
          ot0 = new t0(this.h(this.c()).J());
       }else if(p0.c(this.c().w0())){
          ot0 = new h(this.h(this.c()).J());
       }else {
          ot0 = new l1(this.h(this.c()).J());
       }
       return ot0;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, d1.class, "12")) {
          return;
       }
       this.b.o0().c(this.g);
       super.f();
       this.g = null;
       this.f = null;
       this.h = null;
       return;
    }
    public TextElementViewBinder h(a p0){
       TextElementViewBinder obj = PatchProxy.applyOneRefs(p0, this, d1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       Iterator iterator = p0.v0().iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa instanceof TextElementViewBinder && !uoa.N()) {
             a uoa1 = uoa;
          }
       }
       return obj;
    }
    public TextElementViewModel i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d1 uod1 = d1.class;
       c obj = PatchProxy.apply(null, this, uod1, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.c().w0();
       o$b td = this.d;
       d1$d uod = new d1$d(this);
       ViewModel viewModel = PatchProxy.apply(null, this, uod1, "7");
       if (viewModel != patchProxyRe) {
       }else {
          viewModel = ViewModelProviders.of(this.a).get(FontViewModel.class);
       }
       return ViewModelProviders.of(td, new e(obj, uod, viewModel)).get(TextElementViewModel.class);
    }
    public boolean j(){
       Object obj = PatchProxy.apply(null, this, d1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p.i(this.c().w0().a1());
    }
    public boolean k(){
       Object obj = PatchProxy.apply(null, this, d1.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.c().w0().a1() == Workspace$Type.SINGLE_PICTURE && this.c().w0().T0() != Workspace$Source.REEDIT)? true: false;
       return b;
    }
}
