package androidx.collection.MapCollections$EntrySet;
import java.util.Set;
import androidx.collection.MapCollections;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.UnsupportedOperationException;
import java.util.Collection;
import java.util.Iterator;
import androidx.collection.ContainerHelpers;
import androidx.collection.MapCollections$MapIterator;

public final class MapCollections$EntrySet implements Set	// class@00065d
{
    public final MapCollections this$0;

    public void MapCollections$EntrySet(MapCollections p0){
       this.this$0 = p0;
       super();
    }
    public boolean add(Object p0){
       return this.add(p0);
    }
    public boolean add(Map$Entry p0){
       throw new UnsupportedOperationException();
    }
    public boolean addAll(Collection p0){
       int i = this.this$0.colGetSize();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          this.this$0.colPut(key, uEntry.getValue());
       }
       boolean b = (i != this.this$0.colGetSize())? true: false;
       return b;
    }
    public void clear(){
       this.this$0.colClear();
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (!p0 instanceof Map$Entry) {
          return b;
       }
       int i = this.this$0.colIndexOfKey(p0.getKey());
       if (i < 0) {
          return b;
       }
       return ContainerHelpers.equal(this.this$0.colGetEntry(i, 1), p0.getValue());
    }
    public boolean containsAll(Collection p0){
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (!this.contains(iterator.next())) {
             break ;
          }
       }
       return false;
    }
    public boolean equals(Object p0){
       return MapCollections.equalsSetHelper(this, p0);
    }
    public int hashCode(){
       int i1 = 0;
       for (int i = this.this$0.colGetSize() - 1; i >= 0; i = i - 1) {
          Object obj = this.this$0.colGetEntry(i, 0);
          Object obj1 = this.this$0.colGetEntry(i, 1);
          int i2 = (obj == null)? 0: obj.hashCode();
          int i3 = (obj1 == null)? 0: obj1.hashCode();
          i2 = i2 ^ i3;
          i1 = i1 + i2;
       }
       return i1;
    }
    public boolean isEmpty(){
       boolean b = (!this.this$0.colGetSize())? true: false;
       return b;
    }
    public Iterator iterator(){
       return new MapCollections$MapIterator(this.this$0);
    }
    public boolean remove(Object p0){
       throw new UnsupportedOperationException();
    }
    public boolean removeAll(Collection p0){
       throw new UnsupportedOperationException();
    }
    public boolean retainAll(Collection p0){
       throw new UnsupportedOperationException();
    }
    public int size(){
       return this.this$0.colGetSize();
    }
    public Object[] toArray(){
       throw new UnsupportedOperationException();
    }
    public Object[] toArray(Object[] p0){
       throw new UnsupportedOperationException();
    }
}
