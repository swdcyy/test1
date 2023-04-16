package com.yxcorp.gifshow.v3.editor.ktv.lyric.a0$b;
import voc.y;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.a0;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import drc.t;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.Fragment;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;

public class a0$b implements y	// class@000fcf
{
    public final a0 b;

    public void a0$b(a0 p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       if (PatchProxy.applyVoid(null, this, a0$b.class, "2")) {
          return;
       }
       this.b.v.post(new t(this));
       return;
    }
    public void O(){
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
       if (PatchProxy.applyVoid(null, this, a0$b.class, "4")) {
          return;
       }
       this.b.v.setVisibility(8);
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       if (PatchProxy.applyVoid(null, this, a0$b.class, "3")) {
          return;
       }
       this.b.v.setVisibility(8);
       return;
    }
    public void z2(){
       if (PatchProxy.applyVoid(null, this, a0$b.class, "1")) {
          return;
       }
       this.b.v.setVisibility(0);
       this.b.x.q1(0, f.l(this.b.q.q()));
       return;
    }
}
