package mm8.e;
import java.util.AbstractCollection;
import java.util.Collection;
import java.lang.Object;
import java.util.Iterator;
import java.util.ArrayList;

public class e extends AbstractCollection	// class@002e75
{
    public Collection b;
    public Collection c;
    public Collection d;

    public void e(Collection p0,Collection p1){
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
          ArrayList uArrayList = new ArrayList(((((this.b.size() + this.c.size()) * 4) / 3) + 1));
          this.d = uArrayList;
          uArrayList.addAll(this.b);
          this.d.addAll(this.c);
       }
       return this.d.iterator();
    }
    public int size(){
       return (this.b.size() + this.c.size());
    }
}
