package androidx.collection.MapCollections$KeySet;
import java.util.Set;
import androidx.collection.MapCollections;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import androidx.collection.MapCollections$ArrayIterator;

public final class MapCollections$KeySet implements Set	// class@00065e
{
    public final MapCollections this$0;

    public void MapCollections$KeySet(MapCollections p0){
       this.this$0 = p0;
       super();
    }
    public boolean add(Object p0){
       throw new UnsupportedOperationException();
    }
    public boolean addAll(Collection p0){
       throw new UnsupportedOperationException();
    }
    public void clear(){
       this.this$0.colClear();
    }
    public boolean contains(Object p0){
       boolean b = (this.this$0.colIndexOfKey(p0) >= 0)? true: false;
       return b;
    }
    public boolean containsAll(Collection p0){
       return MapCollections.containsAllHelper(this.this$0.colGetMap(), p0);
    }
    public boolean equals(Object p0){
       return MapCollections.equalsSetHelper(this, p0);
    }
    public int hashCode(){
       int i1 = 0;
       for (int i = this.this$0.colGetSize() - 1; i >= 0; i = i - 1) {
          Object obj = this.this$0.colGetEntry(i, 0);
          int i2 = (obj == null)? 0: obj.hashCode();
          i1 = i1 + i2;
       }
       return i1;
    }
    public boolean isEmpty(){
       boolean b = (!this.this$0.colGetSize())? true: false;
       return b;
    }
    public Iterator iterator(){
       return new MapCollections$ArrayIterator(this.this$0, 0);
    }
    public boolean remove(Object p0){
       int i = this.this$0.colIndexOfKey(p0);
       if (i < 0) {
          return false;
       }
       this.this$0.colRemoveAt(i);
       return true;
    }
    public boolean removeAll(Collection p0){
       return MapCollections.removeAllHelper(this.this$0.colGetMap(), p0);
    }
    public boolean retainAll(Collection p0){
       return MapCollections.retainAllHelper(this.this$0.colGetMap(), p0);
    }
    public int size(){
       return this.this$0.colGetSize();
    }
    public Object[] toArray(){
       return this.this$0.toArrayHelper(0);
    }
    public Object[] toArray(Object[] p0){
       return this.this$0.toArrayHelper(p0, 0);
    }
}
