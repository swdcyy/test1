package a2.u0$j;
import a2.u0$i;
import a2.u0;
import android.view.WindowInsets;
import p1.b;
import a2.u0$g;
import android.graphics.Insets;

public class u0$j extends u0$i	// class@0000b4
{
    public b o;
    public b p;
    public b q;

    public void u0$j(u0 p0,u0$j p1){
       super(p0, p1);
       this.o = null;
       this.p = null;
       this.q = null;
    }
    public void u0$j(u0 p0,WindowInsets p1){
       super(p0, p1);
       this.o = null;
       this.p = null;
       this.q = null;
    }
    public b h(){
       if (this.p == null) {
          this.p = b.d(this.c.getMandatorySystemGestureInsets());
       }
       return this.p;
    }
    public b j(){
       if (this.o == null) {
          this.o = b.d(this.c.getSystemGestureInsets());
       }
       return this.o;
    }
    public b l(){
       if (this.q == null) {
          this.q = b.d(this.c.getTappableElementInsets());
       }
       return this.q;
    }
    public u0 m(int p0,int p1,int p2,int p3){
       return u0.w(this.c.inset(p0, p1, p2, p3));
    }
    public void t(b p0){
    }
}
