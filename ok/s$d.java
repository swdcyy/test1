package ok.s$d;
import com.google.common.base.AbstractIterator;
import ok.s;
import java.lang.CharSequence;
import java.lang.Object;
import ok.b;
import java.lang.String;

public abstract class s$d extends AbstractIterator	// class@002052
{
    public final CharSequence d;
    public final b e;
    public final boolean f;
    public int g;
    public int h;

    public void s$d(s p0,CharSequence p1){
       super();
       this.g = 0;
       this.e = p0.a;
       this.f = p0.b;
       this.h = p0.d;
       this.d = p1;
    }
    public Object a(){
       String str;
       s$d tg = this.g;
       while (true) {
          s$d tg1 = this.g;
          int i = -1;
          if (tg1 != i) {
             int i1 = this.d(tg1);
             if (i1 == i) {
                i1 = this.d.length();
                this.g = i;
             }else {
                this.g = this.c(i1);
             }
             s$d tg2 = this.g;
             if (tg2 == tg) {
                int i2 = tg2 + 1;
                this.g = i2;
                if (i2 > this.d.length()) {
                   this.g = i;
                }
             }else {
                while (tg < i1 && this.e.f(this.d.charAt(tg))) {
                   tg = tg + 1;
                }
                while (i1 > tg) {
                   int i3 = i1 - 1;
                   if (this.e.f(this.d.charAt(i3))) {
                      i1 = i3;
                   }else if(this.f != null && tg == i1){
                      tg = this.g;
                   }else {
                      tg2 = this.h;
                      int i4 = 1;
                      if (tg2 == i4) {
                         i1 = this.d.length();
                         this.g = i;
                         while (i1 > tg) {
                            i4 = i1 - 1;
                            if (this.e.f(this.d.charAt(i4))) {
                               i1 = i4;
                            }
                         }
                      }else {
                         this.h = tg2 - i4;
                      }
                      str = this.d.subSequence(tg, i1).toString();
                   }
                }
             }
          }else {
             this.b();
             str = null;
             break ;
          }
       }
       return str;
    }
    public abstract int c(int p0);
    public abstract int d(int p0);
}
