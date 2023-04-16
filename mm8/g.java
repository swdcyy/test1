package mm8.g;
import java.util.AbstractSet;
import java.util.Set;
import java.lang.Object;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;

public class g extends AbstractSet	// class@002e77
{
    public Set b;
    public Set c;
    public Set d;

    public void g(Set p0,Set p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public boolean contains(Object p0){
       boolean b = (this.c.contains(p0) || this.b.contains(p0))? true: false;
       return b;
    }
    public boolean isEmpty(){
       boolean b = (this.c.isEmpty() && this.b.isEmpty())? true: false;
       return b;
    }
    public Iterator iterator(){
       if (this.d == null) {
          HashSet hashSet = new HashSet(((((this.b.size() + this.c.size()) * 4) / 3) + 1));
          this.d = hashSet;
          hashSet.addAll(this.b);
          this.d.addAll(this.c);
       }
       return this.d.iterator();
    }
    public int size(){
       return (this.b.size() + this.c.size());
    }
}
