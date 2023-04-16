package b3d.p;
import u07.u;
import com.yxcorp.login.util.h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import o1d.c;
import com.yxcorp.login.util.h$a;

public final class p implements u	// class@00033e
{
    public final h b;
    public final GifshowActivity c;
    public final int[] d;

    public void p(h p0,GifshowActivity p1,int[] p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       p tb = this.b;
       Objects.requireNonNull(tb);
       c.a(0, this.c, this.d[0]);
       h b = tb.b;
       if (b != null) {
          b.Hc(0);
       }
       return;
    }
}
