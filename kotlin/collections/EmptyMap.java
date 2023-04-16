package kotlin.collections.EmptyMap;
import java.util.Map;
import java.io.Serializable;
import osd.a;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.Void;
import kotlin.jvm.internal.a;
import java.util.Set;
import kotlin.collections.EmptySet;
import java.util.Collection;
import kotlin.collections.EmptyList;

public final class EmptyMap implements Map, Serializable, a	// class@001c6e
{
    public static final EmptyMap INSTANCE;
    public static final long serialVersionUID;

    static {
       EmptyMap.INSTANCE = new EmptyMap();
    }
    public void EmptyMap(){
       super();
    }
    public void clear(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean containsKey(Object p0){
       return false;
    }
    public final boolean containsValue(Object p0){
       if (p0 instanceof Void) {
          return this.containsValue(p0);
       }
       return false;
    }
    public boolean containsValue(Void p0){
       a.p(p0, "value");
       return false;
    }
    public final Set entrySet(){
       return this.getEntries();
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof Map && p0.isEmpty())? true: false;
       return b;
    }
    public final Object get(Object p0){
       return this.get(p0);
    }
    public Void get(Object p0){
       return null;
    }
    public Set getEntries(){
       return EmptySet.INSTANCE;
    }
    public Set getKeys(){
       return EmptySet.INSTANCE;
    }
    public int getSize(){
       return 0;
    }
    public Collection getValues(){
       return EmptyList.INSTANCE;
    }
    public int hashCode(){
       return 0;
    }
    public boolean isEmpty(){
       return true;
    }
    public final Set keySet(){
       return this.getKeys();
    }
    public Object put(Object p0,Object p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public Void put(Object p0,Void p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public void putAll(Map p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final Object readResolve(){
       return EmptyMap.INSTANCE;
    }
    public Object remove(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final int size(){
       return this.getSize();
    }
    public String toString(){
       return "{}";
    }
    public final Collection values(){
       return this.getValues();
    }
}
