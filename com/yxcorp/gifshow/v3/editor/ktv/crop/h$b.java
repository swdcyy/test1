package com.yxcorp.gifshow.v3.editor.ktv.crop.h$b;
import voc.y;
import com.yxcorp.gifshow.v3.editor.ktv.crop.h;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.edit.draft.model.c;
import mwc.p;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;

public class h$b implements y	// class@000fc9
{
    public final h b;

    public void h$b(h p0){
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
       if (PatchProxy.applyVoid(null, this, h$b.class, "2")) {
          return;
       }
       h u = this.b.u;
       if (u != null) {
          u.c(false);
       }
       this.b.P8(false);
       this.b.v.j();
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "1")) {
          return;
       }
       h u = this.b.u;
       boolean b = true;
       if (u != null) {
          u.c(b);
       }
       this.b.P8(b);
       p.a().l(this.b.w);
       this.b.v.f();
       return;
    }
    public void z2(){
       x.c(this);
    }
}
