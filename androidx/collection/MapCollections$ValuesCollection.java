package androidx.collection.MapCollections$ValuesCollection;
import java.util.Collection;
import androidx.collection.MapCollections;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.util.Iterator;
import androidx.collection.MapCollections$ArrayIterator;

public final class MapCollections$ValuesCollection implements Collection	// class@000660
{
    public final MapCollections this$0;

    public void MapCollections$ValuesCollection(MapCollections p0){
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
       boolean b = (this.this$0.colIndexOfValue(p0) >= 0)? true: false;
       return b;
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
    public boolean isEmpty(){
       boolean b = (!this.this$0.colGetSize())? true: false;
       return b;
    }
    public Iterator iterator(){
       return new MapCollections$ArrayIterator(this.this$0, 1);
    }
    public boolean remove(Object p0){
       int i = this.this$0.colIndexOfValue(p0);
       if (i < 0) {
          return false;
       }
       this.this$0.colRemoveAt(i);
       return true;
    }
    public boolean removeAll(Collection p0){
       int i = this.this$0.colGetSize();
       int i1 = 0;
       MapCollections$ValuesCollection valuesCollec = null;
       while (i1 < i) {
          if (p0.contains(this.this$0.colGetEntry(i1, 1))) {
             this.this$0.colRemoveAt(i1);
             i1 = i1 - 1;
             i = i - 1;
             valuesCollec = true;
          }
          i1 = i1 + 1;
       }
       return valuesCollec;
    }
    public boolean retainAll(Collection p0){
       int i = this.this$0.colGetSize();
       int i1 = 0;
       MapCollections$ValuesCollection valuesCollec = null;
       while (i1 < i) {
          if (!p0.contains(this.this$0.colGetEntry(i1, 1))) {
             this.this$0.colRemoveAt(i1);
             i1 = i1 - 1;
             i = i - 1;
             valuesCollec = true;
          }
          i1 = i1 + 1;
       }
       return valuesCollec;
    }
    public int size(){
       return this.this$0.colGetSize();
    }
    public Object[] toArray(){
       return this.this$0.toArrayHelper(1);
    }
    public Object[] toArray(Object[] p0){
       return this.this$0.toArrayHelper(p0, 1);
    }
}
