package a2.l$k;
import a2.l$j;
import android.view.WindowInsets;
import a2.l;
import android.view.View;
import p1.b;
import a2.l$g;
import a2.l$n;
import android.graphics.Insets;

public class l$k extends l$j	// class@000084
{
    public static final l q;

    static {
       l$k.q = l.n(WindowInsets.CONSUMED);
    }
    public void l$k(l p0,l$k p1){
       super(p0, p1);
    }
    public void l$k(l p0,WindowInsets p1){
       super(p0, p1);
    }
    public final void d(View p0){
    }
    public b g(int p0){
       return b.d(this.c.getInsets(l$n.a(p0)));
    }
}
