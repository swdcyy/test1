package isd.a$a;
import trd.q;
import java.io.BufferedInputStream;
import java.util.NoSuchElementException;
import java.lang.String;

public final class a$a extends q	// class@0014ff
{
    public int b;
    public boolean c;
    public boolean d;
    public final BufferedInputStream e;

    public void a$a(BufferedInputStream p0){
       this.e = p0;
       super();
       this.b = -1;
    }
    public final boolean b(){
       return this.d;
    }
    public final int c(){
       return this.b;
    }
    public final boolean d(){
       return this.c;
    }
    public final void e(){
       if (this.c == null && this.d == null) {
          int i = this.e.read();
          this.b = i;
          boolean b = true;
          this.c = b;
          if (i != -1) {
             b = false;
          }
          this.d = b;
       }
       return;
    }
    public final void f(boolean p0){
       this.d = p0;
    }
    public final void g(int p0){
       this.b = p0;
    }
    public final void h(boolean p0){
       this.c = p0;
    }
    public boolean hasNext(){
       this.e();
       return (this.d ^ 0x01);
    }
    public byte nextByte(){
       this.e();
       if (this.d != null) {
          throw new NoSuchElementException("Input stream is over.");
       }
       this.c = false;
       return (byte)this.b;
    }
}
