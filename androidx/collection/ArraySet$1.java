package androidx.collection.ArraySet$1;
import androidx.collection.MapCollections;
import androidx.collection.ArraySet;
import java.lang.Object;
import java.util.Map;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public class ArraySet$1 extends MapCollections	// class@000655
{
    public final ArraySet this$0;

    public void ArraySet$1(ArraySet p0){
       this.this$0 = p0;
       super();
    }
    public void colClear(){
       this.this$0.clear();
    }
    public Object colGetEntry(int p0,int p1){
       return this.this$0.mArray[p0];
    }
    public Map colGetMap(){
       throw new UnsupportedOperationException("not a map");
    }
    public int colGetSize(){
       return this.this$0.mSize;
    }
    public int colIndexOfKey(Object p0){
       return this.this$0.indexOf(p0);
    }
    public int colIndexOfValue(Object p0){
       return this.this$0.indexOf(p0);
    }
    public void colPut(Object p0,Object p1){
       this.this$0.add(p0);
    }
    public void colRemoveAt(int p0){
       this.this$0.removeAt(p0);
    }
    public Object colSetValue(int p0,Object p1){
       throw new UnsupportedOperationException("not a map");
    }
}
