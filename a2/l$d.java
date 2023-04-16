package a2.l$d;
import a2.l$f;
import android.view.WindowInsets$Builder;
import a2.l;
import android.view.WindowInsets;
import p1.b;
import android.graphics.Insets;

public class l$d extends l$f	// class@00007d
{
    public final WindowInsets$Builder c;

    public void l$d(){
       super();
       this.c = new WindowInsets$Builder();
    }
    public void l$d(l p0){
       super(p0);
       WindowInsets windowInsets = p0.m();
       WindowInsets$Builder uBuilder = (windowInsets != null)? new WindowInsets$Builder(windowInsets): new WindowInsets$Builder();
       this.c = uBuilder;
       return;
    }
    public l b(){
       this.a();
       l ol = l.n(this.c.build());
       ol.i(this.b);
       return ol;
    }
    public void c(b p0){
       this.c.setMandatorySystemGestureInsets(p0.e());
    }
    public void d(b p0){
       this.c.setStableInsets(p0.e());
    }
    public void e(b p0){
       this.c.setSystemGestureInsets(p0.e());
    }
    public void f(b p0){
       this.c.setSystemWindowInsets(p0.e());
    }
    public void g(b p0){
       this.c.setTappableElementInsets(p0.e());
    }
}
