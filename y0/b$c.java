package y0.b$c;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.StringBuilder;

public class b$c implements Map$Entry	// class@00282e
{
    public final Object b;
    public final Object c;
    public b$c d;
    public b$c e;

    public void b$c(Object p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof b$c) {
          return false;
       }
       if (!this.b.equals(p0.b) || !this.c.equals(p0.c)) {
          b = false;
       }
       return b;
    }
    public Object getKey(){
       return this.b;
    }
    public Object getValue(){
       return this.c;
    }
    public int hashCode(){
       return (this.b.hashCode() ^ this.c.hashCode());
    }
    public Object setValue(Object p0){
       throw new UnsupportedOperationException("An entry modification is not supported");
    }
    public String toString(){
       return this.b+"="+this.c;
    }
}
