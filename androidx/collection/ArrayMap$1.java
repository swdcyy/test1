package androidx.collection.ArrayMap$1;
import androidx.collection.MapCollections;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.lang.Object;
import java.util.Map;

public class ArrayMap$1 extends MapCollections	// class@000653
{
    public final ArrayMap this$0;

    public void ArrayMap$1(ArrayMap p0){
       this.this$0 = p0;
       super();
    }
    public void colClear(){
       this.this$0.clear();
    }
    public Object colGetEntry(int p0,int p1){
       return this.this$0.mArray[((p0 << 1) + p1)];
    }
    public Map colGetMap(){
       return this.this$0;
    }
    public int colGetSize(){
       return this.this$0.mSize;
    }
    public int colIndexOfKey(Object p0){
       return this.this$0.indexOfKey(p0);
    }
    public int colIndexOfValue(Object p0){
       return this.this$0.indexOfValue(p0);
    }
    public void colPut(Object p0,Object p1){
       this.this$0.put(p0, p1);
    }
    public void colRemoveAt(int p0){
       this.this$0.removeAt(p0);
    }
    public Object colSetValue(int p0,Object p1){
       return this.this$0.setValueAt(p0, p1);
    }
}
