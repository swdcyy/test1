package mm8.f;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import mm8.g;
import java.util.Collection;
import mm8.e;

public class f implements Map	// class@002e76
{
    public Map b;
    public Map c;

    public void f(Map p0,Map p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void clear(){
       this.b.clear();
    }
    public boolean containsKey(Object p0){
       boolean b = (this.c.containsKey(p0) || this.b.containsKey(p0))? true: false;
       return b;
    }
    public boolean containsValue(Object p0){
       boolean b = (this.c.containsValue(p0) || this.b.containsValue(p0))? true: false;
       return b;
    }
    public Set entrySet(){
       return new g(this.c.entrySet(), this.b.entrySet());
    }
    public Object get(Object p0){
       Object obj = this.c.get(p0);
       if (obj == null) {
          return this.b.get(p0);
       }
       return obj;
    }
    public boolean isEmpty(){
       boolean b = (this.c.isEmpty() && this.b.isEmpty())? true: false;
       return b;
    }
    public Set keySet(){
       return new g(this.c.keySet(), this.b.keySet());
    }
    public Object put(Object p0,Object p1){
       return this.b.put(p0, p1);
    }
    public void putAll(Map p0){
       this.b.putAll(p0);
    }
    public Object remove(Object p0){
       return this.b.remove(p0);
    }
    public int size(){
       return (this.b.size() + this.c.size());
    }
    public Collection values(){
       return new e(this.c.values(), this.b.values());
    }
}
