package b3d.q;
import u07.u;
import com.yxcorp.login.util.h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import o1d.c;
import com.yxcorp.login.util.h$a;

public final class q implements u	// class@000340
{
    public final h b;
    public final GifshowActivity c;
    public final int[] d;

    public void q(h p0,GifshowActivity p1,int[] p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       q tb = this.b;
       Objects.requireNonNull(tb);
       c.a(true, this.c, this.d[0]);
       h b = tb.b;
       if (b != null) {
          b.Hc(true);
       }
       return;
    }
}
