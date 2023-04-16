package tk8.a;
import tk8.b;
import java.lang.Object;
import java.util.Hashtable;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Number;
import java.util.Iterator;
import tk8.a$a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Map$Entry;

public abstract class a	// class@00392b
{
    public b b;
    public Hashtable c;
    public ArrayList d;
    public CameraFilterContextImpl e;

    public void a(b p0){
       super();
       this.b = null;
       this.c = new Hashtable();
       this.d = new ArrayList();
       this.e = null;
       this.b = p0;
    }
    public b a(){
       return this.b;
    }
    public Number b(String p0){
       if (this.d.size() > 0) {
          Iterator iterator = this.d.iterator();
          while (iterator.hasNext()) {
             if ((iterator.next().a).equals(p0) == true) {
                return this.c.get(p0);
             }
          }
       }
       throw new IllegalArgumentException("invalid key");
    }
    public String c(){
       if (this.c.size() <= 0) {
          return null;
       }
       StringBuilder str = "";
       Iterator iterator = this.c.entrySet().iterator();
       boolean b = iterator.hasNext();
       while (b) {
          Map$Entry uEntry = iterator.next();
          str = str+uEntry.getKey()+"="+uEntry.getValue().toString();
          b = iterator.hasNext();
          if (b == true) {
             str = str+",";
          }
       }
       return str;
    }
    public void finalize(){
       this.c.clear();
       this.d.clear();
       super.finalize();
    }
}
