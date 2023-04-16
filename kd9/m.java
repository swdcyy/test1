package kd9.m;
import erd.g;
import com.yxcorp.gifshow.camera.record.frame.c;
import java.lang.Object;
import lm6.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class m implements g	// class@002c5e
{
    public final c b;

    public void m(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "45")) {
       }else {
          tb.I2();
          tb.E2();
       }
       return;
    }
}
