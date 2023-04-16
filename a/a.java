package a.a;
import java.lang.Object;
import java.io.OutputStream;

public class a	// class@00001c
{
    public byte[] a;
    public int b;
    public int c;
    public int d;
    public OutputStream e;

    public void a(){
       super();
       this.c = 0;
    }
    public void a(){
       a td = this.d;
       int i = this.b - td;
       if (!i) {
          return;
       }
       this.e.write(this.a, td, i);
       if (this.b >= this.c) {
          this.b = 0;
       }
       this.d = this.b;
       return;
    }
    public byte b(int p0){
       int i = (this.b - p0) - 1;
       if (i < 0) {
          i = i + this.c;
       }
       return this.a[i];
    }
    public void c(){
       this.a();
       this.e = null;
    }
}
