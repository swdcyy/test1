package qk.a;
import qk.u0;
import ok.n;
import java.lang.Object;
import java.util.NoSuchElementException;

public abstract class a extends u0	// class@002286
{
    public final int b;
    public int c;

    public void a(int p0){
       super(p0, 0);
    }
    public void a(int p0,int p1){
       super();
       n.l(p1, p0);
       this.b = p0;
       this.c = p1;
    }
    public abstract Object a(int p0);
    public final boolean hasNext(){
       boolean b = (this.c < this.b)? true: false;
       return b;
    }
    public final boolean hasPrevious(){
       boolean b = (this.c > null)? true: false;
       return b;
    }
    public final Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       a tc = this.c;
       this.c = tc + 1;
       return this.a(tc);
    }
    public final int nextIndex(){
       return this.c;
    }
    public final Object previous(){
       if (!this.hasPrevious()) {
          throw new NoSuchElementException();
       }
       int i = this.c - 1;
       this.c = i;
       return this.a(i);
    }
    public final int previousIndex(){
       return (this.c - 1);
    }
}
