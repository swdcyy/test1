package com.yxcorp.gifshow.v3.editor.sticker.e$b;
import voc.y;
import com.yxcorp.gifshow.v3.editor.sticker.e;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import itc.l;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import faa.a;
import q87.c;
import io.reactivex.subjects.PublishSubject;

public class e$b implements y	// class@00122d
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "1")) {
          return;
       }
       this.b.G.post(new l(this));
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
       if (PatchProxy.applyVoid(null, this, e$b.class, "3")) {
          return;
       }
       e$b tb = this.b;
       tb.G.removeCallbacks(tb.I);
       tb = this.b;
       tb.G.removeCallbacks(tb.J);
       this.b.v.c(false);
       this.b.G.setVisibility(8);
       h1.b();
       Object[] objArray = new Object[false];
       a.D().w("StickerEditorPresenter", "discardEditChanges", objArray);
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "2")) {
          return;
       }
       e$b tb = this.b;
       tb.G.removeCallbacks(tb.I);
       tb = this.b;
       tb.G.removeCallbacks(tb.J);
       this.b.v.c(true);
       this.b.G.setVisibility(8);
       h1.m();
       h1.b();
       return;
    }
    public void z2(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "4")) {
          return;
       }
       this.b.G.setVisibility(0);
       e$b tb = this.b;
       tb.G.postDelayed(tb.I, 500);
       Object[] objArray = new Object[0];
       a.D().w("StickerEditorPresenter", "restore panel animation start", objArray);
       tb = this.b;
       tb.G.postDelayed(tb.J, 500);
       this.b.w.onNext(new Object());
       return;
    }
}
