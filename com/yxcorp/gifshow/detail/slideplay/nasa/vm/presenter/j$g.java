package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$g;
import gc6.k;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import p5a.c;
import rd5.i;
import io.reactivex.subjects.PublishSubject;

public class j$g implements k	// class@001820
{
    public final j b;

    public void j$g(j p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoidWithListener(null, this, j$g.class, "1")) {
          return;
       }
       if (this.b.w.getPlayer().i() == 2) {
          this.b.y.onNext(i.c);
       }
       PatchProxy.onMethodExit(j$g.class, "1");
       return;
    }
}
