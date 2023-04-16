package com.yxcorp.gifshow.prettify.makeup.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.prettify.makeup.h;
import java.lang.Object;
import j8c.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.prettify.makeup.d;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.prettify.makeup.e;
import com.yxcorp.gifshow.prettify.makeup.f;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.camera.record.base.d;

public final class g implements Runnable	// class@00117b
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       if (!tb.C()) {
          Object[] objArray = new Object[0];
          a.D().w("MakeupController", "getMakeupResponse", objArray);
          tb.Y1(d.a().c(tb.q, 0, tb.l2(), tb.h2()).observeOn(d.c).subscribe(new e(tb), f.b));
       }
       return;
    }
}
