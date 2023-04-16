package androidx.collection.MapCollections$MapIterator;
import java.util.Iterator;
import java.util.Map$Entry;
import androidx.collection.MapCollections;
import java.lang.Object;
import androidx.collection.ContainerHelpers;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.NoSuchElementException;
import java.lang.StringBuilder;

public final class MapCollections$MapIterator implements Iterator, Map$Entry	// class@00065f
{
    public int mEnd;
    public boolean mEntryValid;
    public int mIndex;
    public final MapCollections this$0;

    public void MapCollections$MapIterator(MapCollections p0){
       this.this$0 = p0;
       super();
       this.mEntryValid = false;
       this.mEnd = p0.colGetSize() - 1;
       this.mIndex = -1;
    }
    public boolean equals(Object p0){
       if (this.mEntryValid == null) {
          throw new IllegalStateException("This container does not support retaining Map.Entry objects");
       }
       boolean b = false;
       if (!p0 instanceof Map$Entry) {
          return b;
       }
       if (ContainerHelpers.equal(p0.getKey(), this.this$0.colGetEntry(this.mIndex, b)) && ContainerHelpers.equal(p0.getValue(), this.this$0.colGetEntry(this.mIndex, 1))) {
          b = true;
       }
       return b;
    }
    public Object getKey(){
       if (this.mEntryValid != null) {
          return this.this$0.colGetEntry(this.mIndex, 0);
       }
       throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    public Object getValue(){
       if (this.mEntryValid != null) {
          return this.this$0.colGetEntry(this.mIndex, 1);
       }
       throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    public boolean hasNext(){
       boolean b = (this.mIndex < this.mEnd)? true: false;
       return b;
    }
    public int hashCode(){
       if (this.mEntryValid == null) {
          throw new IllegalStateException("This container does not support retaining Map.Entry objects");
       }
       int i = 0;
       Object obj = this.this$0.colGetEntry(this.mIndex, i);
       Object obj1 = this.this$0.colGetEntry(this.mIndex, 1);
       int i1 = (obj == null)? 0: obj.hashCode();
       if (obj1 != null) {
          i = obj1.hashCode();
       }
       return (i1 ^ i);
    }
    public Object next(){
       return this.next();
    }
    public Map$Entry next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       this.mIndex = this.mIndex + 1;
       this.mEntryValid = true;
       return this;
    }
    public void remove(){
       if (this.mEntryValid == null) {
          throw new IllegalStateException();
       }
       this.this$0.colRemoveAt(this.mIndex);
       this.mIndex = this.mIndex - 1;
       this.mEnd = this.mEnd - 1;
       this.mEntryValid = false;
       return;
    }
    public Object setValue(Object p0){
       if (this.mEntryValid != null) {
          return this.this$0.colSetValue(this.mIndex, p0);
       }
       throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    public String toString(){
       return this.getKey()+"="+this.getValue();
    }
}
