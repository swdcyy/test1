package usd.j;
import trd.l0;
import java.util.NoSuchElementException;

public final class j extends l0	// class@002618
{
    public final int b;
    public boolean c;
    public int d;
    public final int e;

    public void j(int p0,int p1,int p2){
       super();
       this.e = p2;
       this.b = p1;
       boolean b = true;
       if (p2 > 0) {
          if (p0 > p1) {
          label_0011 :
             b = false;
          }
       }else if(p0 >= p1){
       }
       this.c = b;
       if (!b) {
          p0 = p1;
       }
       this.d = p0;
       return;
    }
    public int b(){
       j td = this.d;
       if (td == this.b) {
          if (this.c != null) {
             this.c = false;
          }else {
             throw new NoSuchElementException();
          }
       }else {
          this.d = this.e + td;
       }
       return td;
    }
    public final int c(){
       return this.e;
    }
    public boolean hasNext(){
       return this.c;
    }
}
