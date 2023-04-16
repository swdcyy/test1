package com.yxcorp.gifshow.profile.presenter.f$c;
import com.yxcorp.gifshow.profile.presenter.f;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public abstract class f$c	// class@001448
{
    public f$c a;
    public QPhoto b;
    public final f c;

    public void f$c(f p0,QPhoto p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, f$c.class, "1")) {
          return;
       }
       if (this.c()) {
          this.b();
       }
       f$c ta = this.a;
       if (ta != null) {
          ta.a();
       }
       return;
    }
    public abstract void b();
    public abstract boolean c();
}
