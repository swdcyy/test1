package qk.r;
import java.util.Map;
import qk.t;
import java.lang.Object;
import java.util.Set;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.o;
import java.util.Map$Entry;
import ok.k;
import java.lang.String;
import java.util.Collection;

public abstract class r extends t implements Map	// class@002a15
{

    public void r(){
       super();
    }
    public void clear(){
       this.delegate().clear();
    }
    public boolean containsKey(Object p0){
       return this.delegate().containsKey(p0);
    }
    public boolean containsValue(Object p0){
       return this.delegate().containsValue(p0);
    }
    public Object delegate(){
       return this.delegate();
    }
    public abstract Map delegate();
    public Set entrySet(){
       return this.delegate().entrySet();
    }
    public boolean equals(Object p0){
       boolean b = (p0 == this || this.delegate().equals(p0))? true: false;
       return b;
    }
    public Object get(Object p0){
       return this.delegate().get(p0);
    }
    public int hashCode(){
       return this.delegate().hashCode();
    }
    public boolean isEmpty(){
       return this.delegate().isEmpty();
    }
    public Set keySet(){
       return this.delegate().keySet();
    }
    public Object put(Object p0,Object p1){
       return this.delegate().put(p0, p1);
    }
    public void putAll(Map p0){
       this.delegate().putAll(p0);
    }
    public Object remove(Object p0){
       return this.delegate().remove(p0);
    }
    public int size(){
       return this.delegate().size();
    }
    public void standardClear(){
       Iterators.d(this.entrySet().iterator());
    }
    public boolean standardContainsKey(Object p0){
       return Iterators.f(Maps.n(this.entrySet().iterator()), p0);
    }
    public boolean standardContainsValue(Object p0){
       return Iterators.f(Maps.E(this.entrySet().iterator()), p0);
    }
    public boolean standardEquals(Object p0){
       return Maps.f(this, p0);
    }
    public int standardHashCode(){
       return o.d(this.entrySet());
    }
    public boolean standardIsEmpty(){
       return (this.entrySet().iterator().hasNext() ^ 0x01);
    }
    public void standardPutAll(Map p0){
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          this.put(key, uEntry.getValue());
       }
       return;
    }
    public Object standardRemove(Object p0){
       Map$Entry uEntry;
       Iterator iterator = this.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uEntry = iterator.next();
          if (k.a(uEntry.getKey(), p0)) {
             break ;
          }
       }
       iterator.remove();
       return uEntry.getValue();
    }
    public String standardToString(){
       return Maps.A(this);
    }
    public Collection values(){
       return this.delegate().values();
    }
}
