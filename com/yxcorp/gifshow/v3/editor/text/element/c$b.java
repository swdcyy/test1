package com.yxcorp.gifshow.v3.editor.text.element.c$b;
import voc.y;
import com.yxcorp.gifshow.v3.editor.text.element.c;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import suc.e;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import lwc.h;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;

public class c$b implements y	// class@0013fb
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "2")) {
          return;
       }
       if (this.b.S8() && this.b.w.booleanValue()) {
          this.b.q.z().findViewById(R.id.pictures_container).setVisibility(0);
       }
       this.b.y.post(new e(this));
       return;
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
       if (PatchProxy.applyVoid(null, this, c$b.class, "4")) {
          return;
       }
       c$b tb = this.b;
       if (tb.D != null) {
          tb.y.setVisibility(8);
       }
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "3")) {
          return;
       }
       c$b tb = this.b;
       if (tb.D != null) {
          tb.y.setVisibility(8);
       }
       return;
    }
    public void z2(){
       c$b tb;
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       this.b.y.setVisibility(0);
       if (this.b.S8()) {
          tb = this.b;
          tb.x.onNext(Integer.valueOf(tb.R8()));
          if (this.b.w.booleanValue()) {
             this.b.q.z().findViewById(R.id.pictures_container).setVisibility(8);
          }
       }else {
          tb = this.b;
          tb.B.q1(tb.R8(), this.b.C);
       }
       return;
    }
}
