package ny0.b;
import oq5.c;
import ny0.c;
import java.lang.Object;
import android.content.res.Configuration;
import jv1.b;
import t02.a0;

public final class b implements c	// class@00341e
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       b tb = this.b;
       tb.P8();
       boolean b = tb.u.H2();
       if (tb.u.H2() && tb.t.l()) {
          b = false;
       }
       tb.R8(b);
       return;
    }
}
