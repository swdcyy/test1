package com.yxcorp.gifshow.v3.editor.sticker.y0$b;
import voc.y;
import com.yxcorp.gifshow.v3.editor.sticker.y0;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.sticker.e;
import im8.f;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public class y0$b implements y	// class@0012f0
{
    public final y0 b;

    public void y0$b(y0 p0){
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
       if (PatchProxy.applyVoid(null, this, y0$b.class, "2")) {
          return;
       }
       this.b.x.set(null);
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       x.j(this);
    }
    public void z2(){
       if (PatchProxy.applyVoid(null, this, y0$b.class, "1")) {
          return;
       }
       y0$b tb = this.b;
       tb.X.onNext(tb.W.get());
       return;
    }
}
