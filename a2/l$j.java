package a2.l$j;
import a2.l$i;
import a2.l;
import android.view.WindowInsets;
import p1.b;
import a2.l$g;
import android.graphics.Insets;

public class l$j extends l$i	// class@000083
{
    public b n;
    public b o;
    public b p;

    public void l$j(l p0,l$j p1){
       super(p0, p1);
       this.n = null;
       this.o = null;
       this.p = null;
    }
    public void l$j(l p0,WindowInsets p1){
       super(p0, p1);
       this.n = null;
       this.o = null;
       this.p = null;
    }
    public b h(){
       if (this.o == null) {
          this.o = b.d(this.c.getMandatorySystemGestureInsets());
       }
       return this.o;
    }
    public b j(){
       if (this.n == null) {
          this.n = b.d(this.c.getSystemGestureInsets());
       }
       return this.n;
    }
    public b l(){
       if (this.p == null) {
          this.p = b.d(this.c.getTappableElementInsets());
       }
       return this.p;
    }
    public void r(b p0){
    }
}
