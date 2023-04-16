package kotlin.collections.AbstractMap;
import java.util.Map;
import osd.a;
import kotlin.collections.AbstractMap$a;
import nsd.u;
import java.lang.Object;
import java.util.Map$Entry;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.AbstractMap$b;
import kotlin.collections.AbstractMap$c;
import java.lang.StringBuilder;
import kotlin.collections.AbstractMap$toString$1;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;

public abstract class AbstractMap implements Map, a	// class@00182e
{
    public Set b;
    public Collection c;
    public static final AbstractMap$a d;

    static {
       AbstractMap.d = new AbstractMap$a(null);
    }
    public void AbstractMap(){
       super();
    }
    public final boolean a(Map$Entry p0){
       if (!p0 instanceof Map$Entry) {
          return false;
       }
       Object key = p0.getKey();
       Object obj = this.get(key);
       if (a.g(p0.getValue(), obj) ^ 1) {
          return false;
       }
       if (obj == null && !this.containsKey(key)) {
          return false;
       }
       return 1;
    }
    public abstract Set c();
    public void clear(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean containsKey(Object p0){
       boolean b = (this.h(p0) != null)? true: false;
       return b;
    }
    public boolean containsValue(Object p0){
       Set set = this.entrySet();
       boolean b = false;
       if (!set instanceof Collection || !set.isEmpty()) {
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             if (a.g(iterator.next().getValue(), p0)) {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public Set e(){
       if (this.b == null) {
          this.b = new AbstractMap$b(this);
       }
       AbstractMap tb = this.b;
       a.m(tb);
       return tb;
    }
    public final Set entrySet(){
       return this.c();
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof Map) {
          return false;
       }
       if (this.size() != p0.size()) {
          return false;
       }
       p0 = p0.entrySet();
       if (!p0 instanceof Collection || !p0.isEmpty()) {
          p0 = p0.iterator();
          while (p0.hasNext()) {
             if (!this.a(p0.next())) {
                b = false;
                break ;
             }
          }
       }
       return b;
    }
    public int f(){
       return this.entrySet().size();
    }
    public Collection g(){
       if (this.c == null) {
          this.c = new AbstractMap$c(this);
       }
       AbstractMap tc = this.c;
       a.m(tc);
       return tc;
    }
    public Object get(Object p0){
       p0 = this.h(p0);
       p0 = (p0 != null)? p0.getValue(): null;
       return p0;
    }
    public final Map$Entry h(Object p0){
       Map$Entry uEntry;
       Iterator iterator = this.entrySet().iterator();
       do {
          if (iterator.hasNext()) {
          }else {
             uEntry = null;
             break ;
          }
          uEntry = iterator.next();
       } while (a.g(uEntry.getKey(), p0));
       return uEntry;
    }
    public int hashCode(){
       return this.entrySet().hashCode();
    }
    public final String i(Object p0){
       p0 = (p0 == this)? "\(this Map\)": String.valueOf(p0);
       return p0;
    }
    public boolean isEmpty(){
       boolean b = (!this.size())? true: false;
       return b;
    }
    public final String j(Map$Entry p0){
       return this.i(p0.getKey())+"="+this.i(p0.getValue());
    }
    public final Set keySet(){
       return this.e();
    }
    public Object put(Object p0,Object p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public void putAll(Map p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public Object remove(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final int size(){
       return this.f();
    }
    public String toString(){
       return CollectionsKt___CollectionsKt.V2(this.entrySet(), ", ", "{", "}", 0, null, new AbstractMap$toString$1(this), 24, null);
    }
    public final Collection values(){
       return this.g();
    }
}
