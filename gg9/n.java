package gg9.n;
import erd.g;
import com.yxcorp.gifshow.camera.record.permission.b;
import java.lang.Object;
import kd9.l0;
import java.util.Objects;
import crd.b;

public final class n implements g	// class@002480
{
    public final b b;

    public void n(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a == 2) {
          tb.B.dispose();
          tb.g2();
       }
       return;
    }
}
