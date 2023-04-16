package androidx.collection.MapCollections;
import java.lang.Object;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import androidx.collection.MapCollections$EntrySet;
import androidx.collection.MapCollections$KeySet;
import androidx.collection.MapCollections$ValuesCollection;
import java.lang.Class;
import java.lang.reflect.Array;

public abstract class MapCollections	// class@000661
{
    public MapCollections$EntrySet mEntrySet;
    public MapCollections$KeySet mKeySet;
    public MapCollections$ValuesCollection mValues;

    public void MapCollections(){
       super();
    }
    public static boolean containsAllHelper(Map p0,Collection p1){
       Iterator iterator = p1.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (!p0.containsKey(iterator.next())) {
             break ;
          }
       }
       return false;
    }
    public static boolean equalsSetHelper(Set p0,Object p1){
       boolean b = true;
       if (p0 == p1) {
          return b;
       }
       if (!p1 instanceof Set) {
          return false;
       }
       try{
          if (p0.size() != p1.size() || !p0.containsAll(p1)) {
             b = false;
          }
          return b;
       }catch(java.lang.NullPointerException e0){
       }catch(java.lang.ClassCastException e0){
       }
    }
    public static boolean removeAllHelper(Map p0,Collection p1){
       int i = p0.size();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          p0.remove(iterator.next());
       }
       boolean b = (i != p0.size())? true: false;
       return b;
    }
    public static boolean retainAllHelper(Map p0,Collection p1){
       int i = p0.size();
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          if (!p1.contains(iterator.next())) {
             iterator.remove();
          }
       }
       boolean b = (i != p0.size())? true: false;
       return b;
    }
    public abstract void colClear();
    public abstract Object colGetEntry(int p0,int p1);
    public abstract Map colGetMap();
    public abstract int colGetSize();
    public abstract int colIndexOfKey(Object p0);
    public abstract int colIndexOfValue(Object p0);
    public abstract void colPut(Object p0,Object p1);
    public abstract void colRemoveAt(int p0);
    public abstract Object colSetValue(int p0,Object p1);
    public Set getEntrySet(){
       if (this.mEntrySet == null) {
          this.mEntrySet = new MapCollections$EntrySet(this);
       }
       return this.mEntrySet;
    }
    public Set getKeySet(){
       if (this.mKeySet == null) {
          this.mKeySet = new MapCollections$KeySet(this);
       }
       return this.mKeySet;
    }
    public Collection getValues(){
       if (this.mValues == null) {
          this.mValues = new MapCollections$ValuesCollection(this);
       }
       return this.mValues;
    }
    public Object[] toArrayHelper(int p0){
       int i = this.colGetSize();
       Object[] objArray = new Object[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          objArray[i1] = this.colGetEntry(i1, p0);
       }
       return objArray;
    }
    public Object[] toArrayHelper(Object[] p0,int p1){
       int i = this.colGetSize();
       if (p0.length < i) {
          p0 = Array.newInstance(p0.getClass().getComponentType(), i);
       }
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          p0[i1] = this.colGetEntry(i1, p1);
       }
       if (p0.length > i) {
          p0[i] = null;
       }
       return p0;
    }
}
