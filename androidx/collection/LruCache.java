package androidx.collection.LruCache;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Objects;
import java.lang.NullPointerException;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.Locale;
import java.lang.Integer;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Class;

public class LruCache	// class@00065b
{
    public int createCount;
    public int evictionCount;
    public int hitCount;
    public final LinkedHashMap map;
    public int maxSize;
    public int missCount;
    public int putCount;
    public int size;

    public void LruCache(int p0){
       super();
       if (p0 <= 0) {
          throw new IllegalArgumentException("maxSize <= 0");
       }
       this.maxSize = p0;
       this.map = new LinkedHashMap(0, 0x3f400000, true);
       return;
    }
    public Object create(Object p0){
       return null;
    }
    public synchronized final int createCount(){
       return this.createCount;
    }
    public void entryRemoved(boolean p0,Object p1,Object p2,Object p3){
    }
    public final void evictAll(){
       this.trimToSize(-1);
    }
    public synchronized final int evictionCount(){
       return this.evictionCount;
    }
    public final Object get(Object p0){
       Objects.requireNonNull(p0, "key == null");
       _monitor_enter(this);
       Object obj = this.map.get(p0);
       if (obj != null) {
          this.hitCount = this.hitCount + 1;
          _monitor_exit(this);
          return obj;
       }else {
          this.missCount = this.missCount + 1;
          _monitor_exit(this);
          obj = this.create(p0);
          if (obj == null) {
             return null;
          }
          _monitor_enter(this);
          this.createCount = this.createCount + 1;
          Object obj1 = this.map.put(p0, obj);
          if (obj1 != null) {
             this.map.put(p0, obj1);
          }else {
             this.size = this.size + this.safeSizeOf(p0, obj);
          }
          _monitor_exit(this);
          if (obj1 != null) {
             this.entryRemoved(false, p0, obj, obj1);
             return obj1;
          }else {
             this.trimToSize(this.maxSize);
             return obj;
          }
       }
    }
    public synchronized final int hitCount(){
       return this.hitCount;
    }
    public synchronized final int maxSize(){
       return this.maxSize;
    }
    public synchronized final int missCount(){
       return this.missCount;
    }
    public final Object put(Object p0,Object p1){
       if (p0 == null || p1 == null) {
          throw new NullPointerException("key == null || value == null");
       }
       _monitor_enter(this);
       this.putCount = this.putCount + 1;
       this.size = this.size + this.safeSizeOf(p0, p1);
       Object obj = this.map.put(p0, p1);
       if (obj != null) {
          this.size = this.size - this.safeSizeOf(p0, obj);
       }
       _monitor_exit(this);
       if (obj != null) {
          this.entryRemoved(false, p0, obj, p1);
       }
       this.trimToSize(this.maxSize);
       return obj;
    }
    public synchronized final int putCount(){
       return this.putCount;
    }
    public final Object remove(Object p0){
       Objects.requireNonNull(p0, "key == null");
       _monitor_enter(this);
       Object obj = this.map.remove(p0);
       if (obj != null) {
          this.size = this.size - this.safeSizeOf(p0, obj);
       }
       _monitor_exit(this);
       if (obj != null) {
          this.entryRemoved(false, p0, obj, null);
       }
       return obj;
    }
    public void resize(int p0){
       if (p0 <= 0) {
          throw new IllegalArgumentException("maxSize <= 0");
       }
       _monitor_enter(this);
       this.maxSize = p0;
       _monitor_exit(this);
       this.trimToSize(p0);
       return;
    }
    public final int safeSizeOf(Object p0,Object p1){
       int i = this.sizeOf(p0, p1);
       if (i >= 0) {
          return i;
       }
       throw new IllegalStateException("Negative size: "+p0+"="+p1);
    }
    public synchronized final int size(){
       return this.size;
    }
    public int sizeOf(Object p0,Object p1){
       return 1;
    }
    public synchronized final Map snapshot(){
       return new LinkedHashMap(this.map);
    }
    public synchronized final String toString(){
       LruCache thitCount = this.hitCount;
       int i = this.missCount + thitCount;
       int i1 = 0;
       int i2 = (i)? (thitCount * 100) / i: 0;
       Object[] objArray = new Object[]{Integer.valueOf(this.maxSize),Integer.valueOf(this.hitCount),Integer.valueOf(this.missCount),Integer.valueOf(i2)};
       return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", objArray);
    }
    public void trimToSize(int p0){
       while (true) {
          _monitor_enter(this);
          if (this.size < null || (this.map.isEmpty() && this.size != null)) {
             throw new IllegalStateException(this.getClass().getName()+".sizeOf\(\) is reporting inconsistent results!");
          }
          if (this.size <= p0 || this.map.isEmpty()) {
             break ;
          }else {
             Map$Entry uEntry = this.map.entrySet().iterator().next();
             Object key = uEntry.getKey();
             Object value = uEntry.getValue();
             this.map.remove(key);
             int i = this.size - this.safeSizeOf(key, value);
             this.size = i;
             i = this.evictionCount + 1;
             this.evictionCount = i;
             _monitor_exit(this);
             this.entryRemoved(1, key, value, null);
          }
       }
       _monitor_exit(this);
       return;
    }
}
