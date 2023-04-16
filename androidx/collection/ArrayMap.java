package androidx.collection.ArrayMap;
import java.util.Map;
import androidx.collection.SimpleArrayMap;
import java.util.Collection;
import androidx.collection.MapCollections;
import java.util.Set;
import androidx.collection.ArrayMap$1;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;

public class ArrayMap extends SimpleArrayMap implements Map	// class@000654
{
    public MapCollections mCollections;

    public void ArrayMap(){
       super();
    }
    public void ArrayMap(int p0){
       super(p0);
    }
    public void ArrayMap(SimpleArrayMap p0){
       super(p0);
    }
    public boolean containsAll(Collection p0){
       return MapCollections.containsAllHelper(this, p0);
    }
    public Set entrySet(){
       return this.getCollection().getEntrySet();
    }
    public final MapCollections getCollection(){
       if (this.mCollections == null) {
          this.mCollections = new ArrayMap$1(this);
       }
       return this.mCollections;
    }
    public Set keySet(){
       return this.getCollection().getKeySet();
    }
    public void putAll(Map p0){
       this.ensureCapacity((this.mSize + p0.size()));
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          this.put(key, uEntry.getValue());
       }
       return;
    }
    public boolean removeAll(Collection p0){
       return MapCollections.removeAllHelper(this, p0);
    }
    public boolean retainAll(Collection p0){
       return MapCollections.retainAllHelper(this, p0);
    }
    public Collection values(){
       return this.getCollection().getValues();
    }
}
