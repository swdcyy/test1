package kd9.l;
import erd.g;
import com.yxcorp.gifshow.camera.record.frame.c;
import java.lang.Object;
import zb9.i;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class l implements g	// class@002c5c
{
    public final c b;

    public void l(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "13")) {
       }else {
          tb.i2(p0.a);
       }
       return;
    }
}
