package com.kwai.nearby.local.presenter.p$h;
import java.lang.Runnable;
import com.kwai.nearby.local.presenter.p;
import nr4.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;

public final class p$h implements Runnable	// class@000fc4
{
    public final p b;
    public final a$a c;

    public void p$h(p p0,a$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, p$h.class, "1")) {
          return;
       }
       this.b.a9(null, this.c);
       return;
    }
}
