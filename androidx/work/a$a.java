package androidx.work.a$a;
import java.lang.Object;
import java.util.HashMap;
import androidx.work.a;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.IllegalArgumentException;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class a$a	// class@000a58
{
    public Map a;

    public void a$a(){
       super();
       this.a = new HashMap();
    }
    public a a(){
       a uoa = new a(this.a);
       a.k(uoa);
       return uoa;
    }
    public a$a b(String p0,Object p1){
       if (p1 == null) {
          this.a.put(p0, null);
       }else {
          Class class = p1.getClass();
          if (class != Boolean.class && (class != Byte.class && (class != Integer.class && (class != Long.class && (class != Float.class && (class != Double.class && (class != String.class && (class != Boolean[].class && (class != Byte[].class && (class != Integer[].class && (class != Long[].class && (class != Float[].class && (class == Double[].class || class == String[].class))))))))))))) {
             this.a.put(p0, p1);
          }else if(class == boolean[].class){
             this.a.put(p0, a.a(p1));
          }else if(class == byte[].class){
             this.a.put(p0, a.b(p1));
          }else if(class == int[].class){
             this.a.put(p0, a.e(p1));
          }else if(class == long[].class){
             this.a.put(p0, a.f(p1));
          }else if(class == float[].class){
             this.a.put(p0, a.d(p1));
          }else if(class == double[].class){
             this.a.put(p0, a.c(p1));
          }else {
             Object[] objArray = new Object[]{p0,class};
             throw new IllegalArgumentException(String.format("Key %s has invalid type %s", objArray));
          }
       }
       return this;
    }
    public a$a c(a p0){
       this.d(p0.a);
       return this;
    }
    public a$a d(Map p0){
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          this.b(key, uEntry.getValue());
       }
       return this;
    }
    public a$a e(String p0,String p1){
       this.a.put(p0, p1);
       return this;
    }
}
