package com.yxcorp.gifshow.camera.record.frame.b;
import erd.g;
import com.yxcorp.gifshow.camera.record.frame.c;
import java.lang.Object;
import com.kwai.gifshow.post.api.feature.ktv.KtvMode;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.frame.n;
import com.yxcorp.gifshow.camera.record.base.d;
import android.view.View;
import android.app.Activity;
import kd9.g;
import java.lang.Runnable;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Boolean;
import java.util.List;
import oc9.e0;
import java.util.Iterator;
import oc9.t;
import kd9.n0;

public final class b implements g	// class@000dd8
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoc, "44")) {
       }else if(p0 == KtvMode.MV){
          tb.t.l2();
          tb.G = true;
          if (!PatchProxy.applyVoid(null, tb, uoc, "46")) {
             p0 = tb.e.findViewById(R.id.record_btn);
             if (p0 != null) {
                p0.post(new g(tb));
             }
          }
          tb.d.b().p6();
       }else if(p0 == KtvMode.SONG){
          tb.t.i2();
          tb.G = false;
       }
       p0 = tb.G;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tb, uoc, "55")) {
          Iterator iterator = tb.getChildren().iterator();
          while (iterator.hasNext()) {
             t ot = iterator.next();
             if (ot instanceof n0) {
                ot.Ya(p0);
             }
          }
       }
       return;
    }
}
