package com.yxcorp.gifshow.detail.slideplay.presenter.c$b;
import gc6.k;
import com.yxcorp.gifshow.detail.slideplay.presenter.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import p5a.c;

public class c$b implements k	// class@001842
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       if (this.b.p.getPlayer().i() == 2) {
          this.b.P8("SwitchedFailed", null);
       }
       return;
    }
}
