package d6.h;
import d6.i;
import d6.j;
import java.lang.Object;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import d6.f;
import java.lang.IllegalArgumentException;
import java.lang.reflect.Type;
import java.lang.Class;
import org.json.alipay.b;
import java.util.Properties;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.lang.reflect.ParameterizedType;
import java.lang.StringBuilder;
import java.lang.Throwable;
import f6.a;
import d6.e;

public final class h implements i, j	// class@001e16
{

    public void h(){
       super();
    }
    public final Object a(Object p0){
       TreeMap treeMap = new TreeMap();
       p0 = p0.entrySet().iterator();
       while (true) {
          if (!p0.hasNext()) {
             return treeMap;
          }
          Map$Entry uEntry = p0.next();
          if (uEntry.getKey() instanceof String) {
             treeMap.put(uEntry.getKey(), f.b(uEntry.getValue()));
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("Map key must be String!");
    }
    public final Object a(Object p0,Type p1){
       Properties properties;
       String obj;
       if (!p0.getClass().equals(b.class)) {
          return null;
       }
       ParameterizedType parameterize = p1;
       while (true) {
          if (parameterize == Properties.class) {
             properties = new Properties();
          label_00ac :
             if (!p1 instanceof ParameterizedType) {
                throw new IllegalArgumentException("Deserialize Map must be Generics!");
             }
             object oobject = p1.getActualTypeArguments()[1];
             if (String.class != p1.getActualTypeArguments()[0]) {
                throw new IllegalArgumentException("Deserialize Map Key must be String.class");
             }
             Iterator iterator = p0.a();
             while (iterator.hasNext()) {
                String str = iterator.next();
                obj = (a.b(oobject))? p0.a(str): e.a(p0.a(str), oobject);
                properties.put(str, obj);
             }
             return properties;
          }else if(parameterize == Hashtable.class){
             properties = new Hashtable();
             goto label_00ac ;
          }else if(parameterize == IdentityHashMap.class){
             properties = new IdentityHashMap();
             goto label_00ac ;
          }else if(parameterize == SortedMap.class || parameterize == TreeMap.class){
             properties = new TreeMap();
             goto label_00ac ;
          }else if(parameterize == ConcurrentMap.class || parameterize == ConcurrentHashMap.class){
             properties = new ConcurrentHashMap();
             goto label_00ac ;
          }else if(parameterize == Map.class || parameterize == HashMap.class){
             properties = new HashMap();
             goto label_00ac ;
          }else if(parameterize == LinkedHashMap.class){
             properties = new LinkedHashMap();
             goto label_00ac ;
          }else if(parameterize instanceof ParameterizedType){
             parameterize = parameterize.getRawType();
          }else {
             ParameterizedType parameterize1 = parameterize;
             obj = "unsupport type ";
             if (!parameterize1.isInterface()) {
                try{
                   properties = parameterize1.newInstance();
                   goto label_00ac ;
                }catch(java.lang.Exception e5){
                   throw new IllegalArgumentException(obj+properties, e5);
                }
             }else {
                break ;
             }
          }
       }
       throw new IllegalArgumentException(obj+parameterize);
    }
    public final boolean a(Class p0){
       return Map.class.isAssignableFrom(p0);
    }
}
