package ii9.p;
import erd.g;
import ii9.v;
import java.lang.Object;
import wc9.r;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camerasdk.q;

public final class p implements g	// class@002842
{
    public final v b;

    public void p(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "countdown cancel", objArray);
       p0 = tb.h;
       if (p0 != null) {
          p0.d1();
       }
       tb.m2();
       return;
    }
}
