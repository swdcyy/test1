package c31.g;
import oq5.c;
import c31.h;
import java.lang.Object;
import android.content.res.Configuration;
import c31.h$a;
import dk2.b;

public final class g implements c	// class@000462
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       g tb = this.b;
       h t = tb.t;
       boolean b = (p0.orientation == 2)? true: false;
       t.a(b);
       tb.q.d();
       return;
    }
}
