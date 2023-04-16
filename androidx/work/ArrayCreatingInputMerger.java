package androidx.work.ArrayCreatingInputMerger;
import k3.f;
import java.util.List;
import androidx.work.a;
import androidx.work.a$a;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.String;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.reflect.Array;
import java.lang.System;

public final class ArrayCreatingInputMerger extends f	// class@000a44
{

    public void ArrayCreatingInputMerger(){
       super();
    }
    public a b(List p0){
       a$a uoa = new a$a();
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.iterator();
       while (true) {
          if (iterator.hasNext()) {
             Iterator iterator1 = iterator.next().h().entrySet().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   Map$Entry uEntry = iterator1.next();
                   String key = uEntry.getKey();
                   Object value = uEntry.getValue();
                   Class class = value.getClass();
                   Object obj = hashMap.get(key);
                   if (obj == null) {
                      if (!class.isArray()) {
                         value = this.f(value);
                      }
                   }else {
                      Class class1 = obj.getClass();
                      if (class1.equals(class)) {
                         value = (class1.isArray())? this.d(obj, value): this.e(obj, value);
                      }else if(class1.isArray() && class1.getComponentType().equals(class)){
                         value = this.c(obj, value);
                      }else if(class.isArray() && class.getComponentType().equals(class1)){
                         value = this.c(value, obj);
                      }else {
                         break ;
                      }
                   }
                   hashMap.put(key, value);
                }else {
                   continue ;
                }
             }
             throw new IllegalArgumentException();
          }else {
             uoa.d(hashMap);
             return uoa.a();
          }
       }
    }
    public final Object c(Object p0,Object p1){
       int length = Array.getLength(p0);
       Object obj = Array.newInstance(p1.getClass(), (length + 1));
       System.arraycopy(p0, 0, obj, 0, length);
       Array.set(obj, length, p1);
       return obj;
    }
    public final Object d(Object p0,Object p1){
       int length = Array.getLength(p0);
       int length1 = Array.getLength(p1);
       Object obj = Array.newInstance(p0.getClass().getComponentType(), (length + length1));
       System.arraycopy(p0, 0, obj, 0, length);
       System.arraycopy(p1, 0, obj, length, length1);
       return obj;
    }
    public final Object e(Object p0,Object p1){
       Object obj = Array.newInstance(p0.getClass(), 2);
       Array.set(obj, 0, p0);
       Array.set(obj, 1, p1);
       return obj;
    }
    public final Object f(Object p0){
       Object obj = Array.newInstance(p0.getClass(), 1);
       Array.set(obj, 0, p0);
       return obj;
    }
}
