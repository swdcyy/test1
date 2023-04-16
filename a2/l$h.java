package a2.l$h;
import a2.l$g;
import a2.l;
import android.view.WindowInsets;
import p1.b;

public class l$h extends l$g	// class@000081
{
    public b m;

    public void l$h(l p0,l$h p1){
       super(p0, p1);
       this.m = null;
       this.m = p1.m;
    }
    public void l$h(l p0,WindowInsets p1){
       super(p0, p1);
       this.m = null;
    }
    public l b(){
       return l.n(this.c.consumeStableInsets());
    }
    public l c(){
       return l.n(this.c.consumeSystemWindowInsets());
    }
    public final b i(){
       if (this.m == null) {
          this.m = b.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
       }
       return this.m;
    }
    public boolean m(){
       return this.c.isConsumed();
    }
    public void r(b p0){
       this.m = p0;
    }
}
