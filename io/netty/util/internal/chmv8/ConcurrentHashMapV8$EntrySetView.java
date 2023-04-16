package io.netty.util.internal.chmv8.ConcurrentHashMapV8$EntrySetView;
import java.util.Set;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$CollectionView;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import java.lang.Object;
import java.util.Map$Entry;
import java.util.Collection;
import java.util.Iterator;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$b;
import java.util.Objects;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$z;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$q;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$i;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$f;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$j;

public final class ConcurrentHashMapV8$EntrySetView extends ConcurrentHashMapV8$CollectionView implements Set	// class@001127
{
    public static final long serialVersionUID = 0x1f364c905893293d;

    public void ConcurrentHashMapV8$EntrySetView(ConcurrentHashMapV8 p0){
       super(p0);
    }
    public boolean add(Object p0){
       return this.add(p0);
    }
    public boolean add(Map$Entry p0){
       boolean b = false;
       if (this.map.putVal(p0.getKey(), p0.getValue(), b) == null) {
          b = true;
       }
       return b;
    }
    public boolean addAll(Collection p0){
       Iterator iterator = p0.iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          if (this.add(iterator.next())) {
             b = true;
          }
       }
       return b;
    }
    public boolean contains(Object p0){
       boolean b;
       if (p0 instanceof Map$Entry) {
          Object key = p0.getKey();
          if (key != null) {
             key = this.map.get(key);
             if (key != null) {
                p0 = p0.getValue();
                if (p0 != null && (p0 == key || p0.equals(key))) {
                   b = true;
                label_0025 :
                   return b;
                }
             }
          }
       }
       b = false;
       goto label_0025 ;
    }
    public final boolean equals(Object p0){
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
             p0.apply(new ConcurrentHashMapV8$q(or.c, or.d, this.map));
          }
       }
       return;
    }
    public final int hashCode(){
       ConcurrentHashMapV8 table = this.map.table;
       int i = 0;
       if (table != null) {
          ConcurrentHashMapV8$z oz = new ConcurrentHashMapV8$z(table, table.length, i, table.length);
          ConcurrentHashMapV8$r or = oz.e();
          while (or != null) {
             i = i + or.hashCode();
          }
       }
       return i;
    }
    public Iterator iterator(){
       ConcurrentHashMapV8$CollectionView tmap = this.map;
       ConcurrentHashMapV8 table = tmap.table;
       int i = (table == null)? 0: table.length;
       ConcurrentHashMapV8$i oi = new ConcurrentHashMapV8$i(table, i, 0, i, tmap);
       return v6;
    }
    public boolean remove(Object p0){
       boolean b;
       if (p0 instanceof Map$Entry) {
          Object key = p0.getKey();
          if (key != null) {
             p0 = p0.getValue();
             if (p0 != null && this.map.remove(key, p0)) {
                b = true;
             label_001d :
                return b;
             }
          }
       }
       b = false;
       goto label_001d ;
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
       ConcurrentHashMapV8$j oj = new ConcurrentHashMapV8$j(table, i, 0, i, l1, tmap);
       return v8;
    }
}
