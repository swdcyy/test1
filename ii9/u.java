package ii9.u;
import java.lang.Runnable;
import ii9.v;
import java.lang.Object;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;
import android.os.Handler;
import ii9.r;
import ekd.k1;

public final class u implements Runnable	// class@002847
{
    public final v b;

    public void u(v p0){
       this.b = p0;
    }
    public final void run(){
       u tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "main camera view FirstFrameRendered", objArray);
       tb.I.removeMessages(1);
       tb.H = true;
       tb.G = true;
       k1.o(new r(tb));
    }
}
