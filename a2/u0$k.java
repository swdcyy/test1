package a2.u0$k;
import a2.u0$j;
import android.view.WindowInsets;
import a2.u0;
import android.view.View;
import p1.b;
import a2.u0$g;
import a2.u0$n;
import android.graphics.Insets;

public class u0$k extends u0$j	// class@0000b5
{
    public static final u0 r;

    static {
       u0$k.r = u0.w(WindowInsets.CONSUMED);
    }
    public void u0$k(u0 p0,u0$k p1){
       super(p0, p1);
    }
    public void u0$k(u0 p0,WindowInsets p1){
       super(p0, p1);
    }
    public final void d(View p0){
    }
    public b g(int p0){
       return b.d(this.c.getInsets(u0$n.a(p0)));
    }
    public boolean p(int p0){
       return this.c.isVisible(u0$n.a(p0));
    }
}
