package io.netty.util.internal.chmv8.ConcurrentHashMapV8$KeySetView;
import java.util.Set;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$CollectionView;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.util.Collection;
import java.util.Iterator;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$b;
import java.util.Objects;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$z;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$n;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$f;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$o;

public class ConcurrentHashMapV8$KeySetView extends ConcurrentHashMapV8$CollectionView implements Set	// class@001130
{
    public final Object value;
    public static final long serialVersionUID = 0x6499de129d87293d;

    public void ConcurrentHashMapV8$KeySetView(ConcurrentHashMapV8 p0,Object p1){
       super(p0);
       this.value = p1;
    }
    public boolean add(Object p0){
       ConcurrentHashMapV8$KeySetView tvalue = this.value;
       if (tvalue == null) {
          throw new UnsupportedOperationException();
       }
       boolean b = true;
       if (this.map.putVal(p0, tvalue, b) != null) {
          b = false;
       }
       return b;
    }
    public boolean addAll(Collection p0){
       ConcurrentHashMapV8$KeySetView tvalue = this.value;
       if (tvalue == null) {
          throw new UnsupportedOperationException();
       }
       Iterator iterator = p0.iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          if (this.map.putVal(iterator.next(), tvalue, true) == null) {
             b = true;
          }
       }
       return b;
    }
    public boolean contains(Object p0){
       return this.map.containsKey(p0);
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof Set && (p0 == this || (this.containsAll(p0) && p0.containsAll(this))))? true: false;
       return b;
    }
    public void forEach(ConcurrentHashMapV8$b p0){
       Objects.requireNonNull(p0);
       ConcurrentHashMapV8 table = this.map.table;
       if (table != null) {
          ConcurrentHashMapV8$z oz = new ConcurrentHashMapV8$z(table, table.length, 0, table.length);
          ConcurrentHashMapV8$r or = oz.e();
          while (or != null) {
             p0.apply(or.c);
          }
       }
       return;
    }
    public ConcurrentHashMapV8 getMap(){
       return super.getMap();
    }
    public Object getMappedValue(){
       return this.value;
    }
    public int hashCode(){
       Iterator iterator = this.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + iterator.next().hashCode();
       }
       return i;
    }
    public Iterator iterator(){
       ConcurrentHashMapV8$CollectionView tmap = this.map;
       ConcurrentHashMapV8 table = tmap.table;
       int i = (table == null)? 0: table.length;
       ConcurrentHashMapV8$n on = new ConcurrentHashMapV8$n(table, i, 0, i, tmap);
       return v6;
    }
    public boolean remove(Object p0){
       boolean b = (this.map.remove(p0) != null)? true: false;
       return b;
    }
    public ConcurrentHashMapV8$f spliterator166(){
       ConcurrentHashMapV8$CollectionView tmap = this.map;
       long l = tmap.sumCount();
       ConcurrentHashMapV8 table = tmap.table;
       int i = (table == null)? 0: table.length;
       long l1 = 0;
       if (l - l1 >= 0) {
          l1 = l;
       }
       ConcurrentHashMapV8$o oo = new ConcurrentHashMapV8$o(table, i, 0, i, l1);
       return tmap;
    }
}
