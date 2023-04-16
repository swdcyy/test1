package kd9.o;
import erd.g;
import com.yxcorp.gifshow.camera.record.frame.c;
import java.lang.Object;
import kd9.t;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.frame.l;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import ld9.b;

public final class o implements g	// class@002c62
{
    public final c b;

    public void o(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "11")) {
       }else {
          c u = tb.u;
          boolean b = false;
          if (u != null && !PatchProxy.applyVoidOneRefs(p0, u, l.class, "10")) {
             if (p0.a != null) {
                u.x = true;
                u.l2(b);
             }else {
                u.x = b;
                u.l2(true);
             }
          }
          if (p0.a != null) {
             p0 = tb.z;
             if (p0 == true || p0 == 5) {
                b = 1;
             }
             if (!b) {
                tb.i2(b.e(tb.e, tb.c));
             }
          }
       }
       return;
    }
}
