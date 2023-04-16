package com.yxcorp.gifshow.v3.editor.sticker.g0;
import uv8.o$b;
import itc.r1;
import com.yxcorp.gifshow.v3.editor.sticker.g0$a;
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
import itc.i0;
import uwc.a;
import twc.a;
import itc.v;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.sticker.h0;
import com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import ntc.f;
import com.yxcorp.gifshow.v3.editor.sticker.g0$b;
import com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel$a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;

public class g0 extends o$b	// class@001250
{
    public a f;
    public Map g;
    public r0 h;

    public void g0(){
       super();
       this.f = new r1(this);
       this.h = new g0$a(this);
    }
    public void a(EditorActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "1")) {
          return;
       }
       super.a(p0);
       this.b.o0().d(this.h);
       return;
    }
    public BaseEditor e(){
       i0 oi0 = PatchProxy.apply(null, this, g0.class, "2");
       if (oi0 != PatchProxyResult.class) {
       }else if(this.i()){
          oi0 = new i0(v.a(this.c()).D());
       }else {
          oi0 = new h0(v.a(this.c()).D());
       }
       return oi0;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, g0.class, "8")) {
          return;
       }
       this.b.o0().c(this.h);
       super.f();
       this.h = null;
       this.f = null;
       return;
    }
    public StickerElementViewModel h(){
       Object obj = PatchProxy.apply(null, this, g0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewModelProviders.of(this.d, new f(this.c().w0(), new g0$b(this))).get(StickerElementViewModel.class);
    }
    public boolean i(){
       Object obj = PatchProxy.apply(null, this, g0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.c().w0().a1() == Workspace$Type.SINGLE_PICTURE && this.c().w0().T0() != Workspace$Source.REEDIT)? true: false;
       return b;
    }
}
