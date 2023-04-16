package jl9.b;
import java.lang.Object;

public class b	// class@002b08
{
    public long a;
    public long b;
    public long c;
    public boolean d;
    public float e;

    public void b(){
       super();
       this.d = true;
    }
    public float a(){
       return this.e;
    }
    public boolean b(){
       return this.d;
    }
    public void c(long p0){
       b ta = this.a;
       if (this.b - ta >= 0) {
          this.d = true;
          return;
       }else if(this.c < 0){
          this.c = p0;
       }
       p0 = p0 - this.c;
       this.b = p0;
       if (p0 - ta > 0) {
          this.b = ta;
       }
       this.e = ((float)this.b * 0x3f800000) / (float)ta;
       return;
    }
    public void d(long p0){
       this.b = 0;
       this.c = -1;
       this.a = p0;
       this.d = false;
       this.e = 0;
    }
}
