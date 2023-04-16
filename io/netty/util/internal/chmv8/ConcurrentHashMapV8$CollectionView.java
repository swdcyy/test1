package io.netty.util.internal.chmv8.ConcurrentHashMapV8$CollectionView;
import java.util.Collection;
import java.io.Serializable;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import java.lang.Object;
import java.util.Iterator;
import java.util.Arrays;
import java.lang.OutOfMemoryError;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Array;
import java.lang.StringBuilder;

public abstract class ConcurrentHashMapV8$CollectionView implements Collection, Serializable	// class@001126
{
    public final ConcurrentHashMapV8 map;
    public static final long serialVersionUID = 0x6499de129d87293d;

    public void ConcurrentHashMapV8$CollectionView(ConcurrentHashMapV8 p0){
       super();
       this.map = p0;
    }
    public final void clear(){
       this.map.clear();
    }
    public abstract boolean contains(Object p0);
    public final boolean containsAll(Collection p0){
       if (p0 != this) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             if (obj == null || !this.contains(obj)) {
                return false;
             }
          }
       }
       return true;
    }
    public ConcurrentHashMapV8 getMap(){
       return this.map;
    }
    public final boolean isEmpty(){
       return this.map.isEmpty();
    }
    public abstract Iterator iterator();
    public abstract boolean remove(Object p0);
    public final boolean removeAll(Collection p0){
       Iterator iterator = this.iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          if (p0.contains(iterator.next())) {
             iterator.remove();
             b = true;
          }
       }
       return b;
    }
    public final boolean retainAll(Collection p0){
       Iterator iterator = this.iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          if (!p0.contains(iterator.next())) {
             iterator.remove();
             b = true;
          }
       }
       return b;
    }
    public final int size(){
       return this.map.size();
    }
    public final Object[] toArray(){
       int i2;
       long l = this.map.mappingCount();
       if (l - 0x7ffffff7 > 0) {
          throw new OutOfMemoryError("Required array size too large");
       }
       int i = (int)l;
       Object[] objArray = new Object[i];
       int i1 = 0;
       Iterator iterator = this.iterator();
       while (true) {
          if (iterator.hasNext()) {
             Object obj = iterator.next();
             if (i1 == i) {
                i2 = 0x7ffffff7;
                if (i < i2) {
                   if (i < 0x3ffffffb) {
                      i2 = i >> 1;
                      i2 = i2 + 1;
                      i2 = i2 + i;
                   }
                   objArray = Arrays.copyOf(objArray, i2);
                   i = i2;
                }else {
                   throw new OutOfMemoryError("Required array size too large");
                }
             }
             i2 = i1 + 1;
             objArray[i1] = obj;
             i1 = i2;
          }else if(i1 == i){
             objArray = Arrays.copyOf(objArray, i1);
             break ;
          }
          break ;
       }
       return objArray;
    }
    public final Object[] toArray(Object[] p0){
       int i2;
       long l = this.map.mappingCount();
       if (l - 0x7ffffff7 > 0) {
          throw new OutOfMemoryError("Required array size too large");
       }
       int i = (int)l;
       Object[] objArray = (p0.length >= i)? p0: Array.newInstance(p0.getClass().getComponentType(), i);
       i = objArray.length;
       int i1 = 0;
       Iterator iterator = this.iterator();
       while (true) {
          if (iterator.hasNext()) {
             Object obj = iterator.next();
             if (i1 == i) {
                i2 = 0x7ffffff7;
                if (i < i2) {
                   if (i < 0x3ffffffb) {
                      i2 = i >> 1;
                      i2 = i2 + 1;
                      i2 = i2 + i;
                   }
                   objArray = Arrays.copyOf(objArray, i2);
                   i = i2;
                }else {
                   throw new OutOfMemoryError("Required array size too large");
                }
             }
             i2 = i1 + 1;
             objArray[i1] = obj;
             i1 = i2;
          }else if(p0 == objArray && i1 < i){
             objArray[i1] = null;
             return objArray;
          }else if(i1 == i){
             objArray = Arrays.copyOf(objArray, i1);
             break ;
          }
          break ;
       }
       return objArray;
    }
    public final String toString(){
       StringBuilder str = '[';
       Iterator iterator = this.iterator();
       if (iterator.hasNext()) {
          String str1 = iterator.next();
          while (str1 == this) {
             str1 = "\(this Collection\)";
             break ;
             str = str+','+' ';
          }
          str = str+str1;
          if (iterator.hasNext()) {
          }
       }
       return str+']';
    }
}
