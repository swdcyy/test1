package dv1.g;
import z1.a;
import dv1.j;
import ks5.m;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import ks5.e;
import android.view.ViewGroup$LayoutParams;

public final class g implements a	// class@002032
{
    public final j a;
    public final m b;

    public void g(j p0,m p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       g ta = this.a;
       g tb = this.b;
       p0 = tb.b(ta.b);
       p0.setVisibility(0);
       p0.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       ta.b(tb);
    }
}
