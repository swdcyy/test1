package ii9.l;
import java.lang.Runnable;
import ii9.v;
import java.lang.Object;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;
import android.os.Handler;
import ii9.t;
import ekd.k1;

public final class l implements Runnable	// class@00283e
{
    public final v b;

    public void l(v p0){
       this.b = p0;
    }
    public final void run(){
       l tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "sub camera view FirstFrameRendered", objArray);
       boolean b = true;
       tb.H = b;
       if (tb.G != null) {
          tb.I.removeMessages(b);
          k1.o(new t(tb));
       }
       return;
    }
}
