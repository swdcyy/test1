package ii9.q;
import erd.g;
import ii9.v;
import java.lang.Object;
import ed9.b;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;

public final class q implements g	// class@002843
{
    public final v b;

    public void q(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "countdown finish, take second image", objArray);
       if (tb.C == null) {
          tb.n2(0);
       }
       return;
    }
}
