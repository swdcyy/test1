package com.kuaishou.commercial.home.c$d;
import java.lang.Runnable;
import com.kuaishou.commercial.home.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import android.net.Uri;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class c$d implements Runnable	// class@0014db
{
    public final c b;

    public void c$d(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$d.class, "1")) {
          return;
       }
       this.b.H = System.currentTimeMillis();
       d uod = Fresco.newDraweeControllerBuilder().D(this.b.E);
       uod.s(this.b.F);
       AbstractDraweeController uAbstractDra = uod.e();
       c p = this.b.p;
       if (p != null) {
          p.setController(uAbstractDra);
       }
       return;
    }
}
