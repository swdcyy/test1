package a2.u0$d;
import a2.u0$f;
import android.view.WindowInsets$Builder;
import a2.u0;
import android.view.WindowInsets;
import p1.b;
import android.graphics.Insets;

public class u0$d extends u0$f	// class@0000ae
{
    public final WindowInsets$Builder c;

    public void u0$d(){
       super();
       this.c = new WindowInsets$Builder();
    }
    public void u0$d(u0 p0){
       super();
       WindowInsets windowInsets = p0.v();
       WindowInsets$Builder uBuilder = (windowInsets != null)? new WindowInsets$Builder(windowInsets): new WindowInsets$Builder();
       this.c = uBuilder;
       return;
    }
    public u0 b(){
       this.a();
       u0 ou0 = u0.w(this.c.build());
       ou0.r(this.b);
       return ou0;
    }
    public void d(b p0){
       this.c.setMandatorySystemGestureInsets(p0.e());
    }
    public void e(b p0){
       this.c.setStableInsets(p0.e());
    }
    public void f(b p0){
       this.c.setSystemGestureInsets(p0.e());
    }
    public void g(b p0){
       this.c.setSystemWindowInsets(p0.e());
    }
    public void h(b p0){
       this.c.setTappableElementInsets(p0.e());
    }
}
