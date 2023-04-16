package ii9.k;
import java.lang.Runnable;
import ii9.v;
import java.lang.Object;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;
import android.os.Handler;
import ii9.s;
import ekd.k1;

public final class k implements Runnable	// class@00283d
{
    public final v b;

    public void k(v p0){
       this.b = p0;
    }
    public final void run(){
       k tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "main camera view FirstFrameRendered", objArray);
       boolean b = true;
       tb.G = b;
       if (tb.H != null) {
          tb.I.removeMessages(b);
          k1.o(new s(tb));
       }
       return;
    }
}
