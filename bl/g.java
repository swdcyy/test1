package bl.g;
import java.util.Map;
import java.lang.Object;
import dl.b;
import el.a;
import bl.p;
import java.lang.reflect.Type;
import java.lang.Class;
import zk.e;
import bl.g$a;
import bl.g$b;
import java.lang.reflect.Constructor;
import java.lang.reflect.AccessibleObject;
import bl.h;
import java.util.Collection;
import java.util.SortedSet;
import bl.i;
import java.util.EnumSet;
import bl.j;
import java.util.Set;
import bl.k;
import java.util.Queue;
import bl.l;
import bl.m;
import java.util.concurrent.ConcurrentNavigableMap;
import bl.n;
import java.util.concurrent.ConcurrentMap;
import bl.b;
import java.util.SortedMap;
import bl.c;
import java.lang.reflect.ParameterizedType;
import java.lang.String;
import bl.d;
import bl.e;
import bl.f;

public final class g	// class@0002f5
{
    public final Map a;
    public final b b;

    public void g(Map p0){
       super();
       this.b = b.a();
       this.a = p0;
    }
    public p a(a p0){
       h oh;
       Type type = p0.getType();
       Class rawType = p0.getRawType();
       e uoe = this.a.get(type);
       if (uoe != null) {
          return new g$a(this, uoe, type);
       }
       uoe = this.a.get(rawType);
       if (uoe != null) {
          return new g$b(this, uoe, type);
       }
       SortedSet sortedSet = null;
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Constructor declaredCons = rawType.getDeclaredConstructor(uClassArray);
          if (!declaredCons.isAccessible()) {
             this.b.b(declaredCons);
          }
          oh = new h(this, declaredCons);
       }catch(java.lang.NoSuchMethodException e0){
          oh = sortedSet;
       }
       if (oh != null) {
          return oh;
       }else if(Collection.class.isAssignableFrom(rawType)){
          if (SortedSet.class.isAssignableFrom(rawType)) {
             sortedSet = new i(this);
          }else if(EnumSet.class.isAssignableFrom(rawType)){
             sortedSet = new j(this, e0);
          }else if(Set.class.isAssignableFrom(rawType)){
             sortedSet = new k(this);
          }else if(Queue.class.isAssignableFrom(rawType)){
             sortedSet = new l(this);
          }else {
             sortedSet = new m(this);
          }
       }else if(Map.class.isAssignableFrom(rawType)){
          if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
             sortedSet = new n(this);
          }else if(ConcurrentMap.class.isAssignableFrom(rawType)){
             sortedSet = new b(this);
          }else if(SortedMap.class.isAssignableFrom(rawType)){
             sortedSet = new c(this);
          }else if(e0 instanceof ParameterizedType && !String.class.isAssignableFrom(a.get(e0.getActualTypeArguments()[i]).getRawType())){
             sortedSet = new d(this);
          }else {
             sortedSet = new e(this);
          }
       }
       if (sortedSet != null) {
          return sortedSet;
       }else {
          return new f(this, rawType, e0);
       }
    }
    public String toString(){
       return this.a.toString();
    }
}
