package androidx.recyclerview.widget.b0$a;
import java.lang.Object;

public class b0$a	// class@0008e8
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public void b0$a(){
       super();
       this.a = 0;
    }
    public void a(int p0){
       this.a = p0 | this.a;
    }
    public boolean b(){
       b0$a ta = this.a;
       if ((ta & 0x07) && !(ta & (this.c(this.d, this.b) << 0))) {
          return 0;
       }
       ta = this.a;
       if ((ta & 0x70) && !(ta & (this.c(this.d, this.c) << 4))) {
          return 0;
       }
       ta = this.a;
       if ((ta & 0x0700) && !(ta & (this.c(this.e, this.b) << 8))) {
          return 0;
       }
       ta = this.a;
       if ((ta & 0x7000) && !(ta & (this.c(this.e, this.c) << 12))) {
          return 0;
       }
       return true;
    }
    public int c(int p0,int p1){
       if (p0 > p1) {
          return 1;
       }
       if (p0 == p1) {
          return 2;
       }
       return 4;
    }
    public void d(){
       this.a = 0;
    }
    public void e(int p0,int p1,int p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
}
