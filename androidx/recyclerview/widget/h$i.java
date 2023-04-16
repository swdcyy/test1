package androidx.recyclerview.widget.h$i;
import java.lang.Object;
import java.lang.Math;
import androidx.recyclerview.widget.h$d;

public class h$i	// class@000911
{
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public void h$i(){
       super();
    }
    public int a(){
       return Math.min((this.c - this.a), (this.d - this.b));
    }
    public boolean b(){
       boolean b = ((this.d - this.b) != (this.c - this.a))? true: false;
       return b;
    }
    public boolean c(){
       boolean b = ((this.d - this.b) > (this.c - this.a))? true: false;
       return b;
    }
    public h$d d(){
       if (this.b()) {
          if (this.e != null) {
             return new h$d(this.a, this.b, this.a());
          }
          if (this.c()) {
             return new h$d(this.a, (this.b + 1), this.a());
          }
          return new h$d((this.a + 1), this.b, this.a());
       }else {
          h$i ta = this.a;
          return new h$d(ta, this.b, (this.c - ta));
       }
    }
}
