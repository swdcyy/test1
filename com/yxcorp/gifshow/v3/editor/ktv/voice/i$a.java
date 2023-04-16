package com.yxcorp.gifshow.v3.editor.ktv.voice.i$a;
import voc.y;
import com.yxcorp.gifshow.v3.editor.ktv.voice.i;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.i;
import mwc.p;
import com.yxcorp.gifshow.edit.draft.model.c;
import xvc.l;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;

public class i$a implements y	// class@001005
{
    public final i b;

    public void i$a(i p0){
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
       if (PatchProxy.applyVoid(null, this, i$a.class, "2")) {
          return;
       }
       this.b.v.c(false);
       p.a().i();
       this.b.w.j();
       l.a.a();
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "1")) {
          return;
       }
       this.b.v.c(true);
       p.a().l(this.b.x);
       this.b.w.f();
       return;
    }
    public void z2(){
       x.c(this);
    }
}
