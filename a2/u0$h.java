package a2.u0$h;
import a2.u0$g;
import a2.u0;
import android.view.WindowInsets;
import p1.b;

public class u0$h extends u0$g	// class@0000b2
{
    public b n;

    public void u0$h(u0 p0,u0$h p1){
       super(p0, p1);
       this.n = null;
       this.n = p1.n;
    }
    public void u0$h(u0 p0,WindowInsets p1){
       super(p0, p1);
       this.n = null;
    }
    public u0 b(){
       return u0.w(this.c.consumeStableInsets());
    }
    public u0 c(){
       return u0.w(this.c.consumeSystemWindowInsets());
    }
    public final b i(){
       if (this.n == null) {
          this.n = b.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
       }
       return this.n;
    }
    public boolean n(){
       return this.c.isConsumed();
    }
    public void t(b p0){
       this.n = p0;
    }
}
