package com.yxcorp.gifshow.detail.slidev2.presenter.h$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import crd.a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import b8a.a0;
import erd.g;
import crd.b;
import brd.t;

public class h$a extends a	// class@0019b4
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "2")) {
          return;
       }
       this.b.P8(false);
       this.b.w.onNext(Boolean.FALSE);
       this.b.B.d();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "1")) {
          return;
       }
       if (this.b.C.getPlayer() != null && this.b.C.getPlayer().isPaused()) {
          this.b.w.onNext(Boolean.TRUE);
          this.b.P8(true);
       }
       h$a tb = this.b;
       tb.B.c(tb.w.subscribe(new a0(this)));
       return;
    }
}
