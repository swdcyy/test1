package ok.i;
import java.util.AbstractList;
import java.lang.Object;

public final class i extends AbstractList	// class@0027ec
{
    public final Object[] b;
    public final Object c;
    public final Object d;

    public void i(Object[] p0,Object p1,Object p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object get(int p0){
       if (!p0) {
          return this.c;
       }
       if (p0 != 1) {
          return this.b[(p0 - 2)];
       }
       return this.d;
    }
    public int size(){
       return (this.b.length + 2);
    }
}
