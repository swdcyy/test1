package com.yxcorp.gifshow.detail.slidev2.presenter.h$b;
import com.yxcorp.gifshow.nasa.NasaShootRefreshView$c;
import com.yxcorp.gifshow.detail.slidev2.presenter.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;

public class h$b implements NasaShootRefreshView$c	// class@0019b5
{
    public final h a;

    public void h$b(h p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "2")) {
          return;
       }
       h$b ta = this.a;
       ta.G = true;
       ta.w.onNext(Boolean.FALSE);
       this.a.P8(false);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "1")) {
          return;
       }
       h$b ta = this.a;
       ta.G = false;
       if (ta.C.getPlayer() != null && this.a.C.getPlayer().isPaused()) {
          this.a.w.onNext(Boolean.TRUE);
          this.a.P8(true);
       }
       return;
    }
}
