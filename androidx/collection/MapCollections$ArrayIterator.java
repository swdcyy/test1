package androidx.collection.MapCollections$ArrayIterator;
import java.util.Iterator;
import androidx.collection.MapCollections;
import java.lang.Object;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;

public final class MapCollections$ArrayIterator implements Iterator	// class@00065c
{
    public boolean mCanRemove;
    public int mIndex;
    public final int mOffset;
    public int mSize;
    public final MapCollections this$0;

    public void MapCollections$ArrayIterator(MapCollections p0,int p1){
       this.this$0 = p0;
       super();
       this.mCanRemove = false;
       this.mOffset = p1;
       this.mSize = p0.colGetSize();
    }
    public boolean hasNext(){
       boolean b = (this.mIndex < this.mSize)? true: false;
       return b;
    }
    public Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       this.mIndex = this.mIndex + 1;
       this.mCanRemove = true;
       return this.this$0.colGetEntry(this.mIndex, this.mOffset);
    }
    public void remove(){
       if (this.mCanRemove == null) {
          throw new IllegalStateException();
       }
       int i = this.mIndex - 1;
       this.mIndex = i;
       this.mSize = this.mSize - 1;
       this.mCanRemove = false;
       this.this$0.colRemoveAt(i);
       return;
    }
}
