package com.yxcorp.gifshow.v3.editor.BaseEditorFragment$a;
import voc.y;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aw9.c0;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.view.View;
import voc.e;
import java.lang.Runnable;
import voc.d;

public class BaseEditorFragment$a implements y	// class@000d90
{
    public final BaseEditorFragment b;

    public void BaseEditorFragment$a(BaseEditorFragment p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       if (PatchProxy.applyVoid(null, this, BaseEditorFragment$a.class, "2")) {
          return;
       }
       BaseEditorFragment t = this.b.t;
       if (t != null && t.O().b()) {
          this.b.t.z().post(new e(this));
       }
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       if (PatchProxy.applyVoid(null, this, BaseEditorFragment$a.class, "1")) {
          return;
       }
       BaseEditorFragment t = this.b.t;
       if (t != null && t.O().b()) {
          this.b.t.z().post(new d(this));
       }
       return;
    }
    public void z2(){
       x.c(this);
    }
}
