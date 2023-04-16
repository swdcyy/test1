package ok.r;
import ok.s$d;
import ok.s$a;
import ok.s;
import java.lang.CharSequence;
import java.lang.String;

public class r extends s$d	// class@0027f9
{
    public final s$a i;

    public void r(s$a p0,s p1,CharSequence p2){
       this.i = p0;
       super(p1, p2);
    }
    public int c(int p0){
       return (p0 + (this.i.a).length());
    }
    public int d(int p0){
       int i = (this.i.a).length();
       int i1 = this.d.length() - i;
       while (true) {
          if (p0 > i1) {
             return -1;
          }
          int i2 = 0;
          while (i2 < i) {
             int i3 = i2 + p0;
             char c = this.d.charAt(i3);
             if (c != (this.i.a).charAt(i2)) {
                p0++;
             }else {
                i2 = i2 + 1;
             }
          }
          return p0;
       }
    }
}
