package io.netty.util.internal.chmv8.ConcurrentHashMapV8$ValuesView;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$CollectionView;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.util.Collection;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$b;
import java.util.Objects;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$z;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import java.util.Iterator;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$c0;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$f;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$d0;

public final class ConcurrentHashMapV8$ValuesView extends ConcurrentHashMapV8$CollectionView	// class@001149
{
    public static final long serialVersionUID = 0x1f364c905893293d;

    public void ConcurrentHashMapV8$ValuesView(ConcurrentHashMapV8 p0){
       super(p0);
    }
    public final boolean add(Object p0){
       throw new UnsupportedOperationException();
    }
    public final boolean addAll(Collection p0){
       throw new UnsupportedOperationException();
    }
    public final boolean contains(Object p0){
       return this.map.containsValue(p0);
    }
    public void forEach(ConcurrentHashMapV8$b p0){
       Objects.requireNonNull(p0);
       ConcurrentHashMapV8 table = this.map.table;
       if (table != null) {
          ConcurrentHashMapV8$z oz = new ConcurrentHashMapV8$z(table, table.length, 0, table.length);
          ConcurrentHashMapV8$r or = oz.e();
          while (or != null) {
             p0.apply(or.d);
          }
       }
       return;
    }
    public final Iterator iterator(){
       ConcurrentHashMapV8$CollectionView tmap = this.map;
       ConcurrentHashMapV8 table = tmap.table;
       int i = (table == null)? 0: table.length;
       ConcurrentHashMapV8$c0 uoc0 = new ConcurrentHashMapV8$c0(table, i, 0, i, tmap);
       return v6;
    }
    public final boolean remove(Object p0){
       if (p0 != null) {
          Iterator iterator = this.iterator();
          while (iterator.hasNext()) {
             if (p0.equals(iterator.next())) {
                iterator.remove();
                return true;
             }
          }
       }
       return false;
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
       ConcurrentHashMapV8$d0 uod0 = new ConcurrentHashMapV8$d0(table, i, 0, i, l1);
       return tmap;
    }
}
