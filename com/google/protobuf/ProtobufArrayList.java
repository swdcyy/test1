package com.google.protobuf.ProtobufArrayList;
import java.util.RandomAccess;
import com.google.protobuf.AbstractProtobufList;
import java.lang.Object;
import java.lang.System;
import java.util.AbstractList;
import java.lang.IndexOutOfBoundsException;
import java.lang.String;
import java.util.Arrays;
import java.lang.StringBuilder;
import com.google.protobuf.Internal$ProtobufList;
import java.lang.IllegalArgumentException;

public final class ProtobufArrayList extends AbstractProtobufList implements RandomAccess	// class@00049c
{
    public Object[] array;
    public int size;
    public static final ProtobufArrayList EMPTY_LIST;

    static {
       Object[] objArray = new Object[0];
       ProtobufArrayList protobufArra = new ProtobufArrayList(objArray, 0);
       ProtobufArrayList.EMPTY_LIST = protobufArra;
       protobufArra.makeImmutable();
    }
    public void ProtobufArrayList(){
       Object[] objArray = new Object[10];
       super(objArray, 0);
    }
    public void ProtobufArrayList(Object[] p0,int p1){
       super();
       this.array = p0;
       this.size = p1;
    }
    public static Object[] createArray(int p0){
       Object[] objArray = new Object[p0];
       return objArray;
    }
    public static ProtobufArrayList emptyList(){
       return ProtobufArrayList.EMPTY_LIST;
    }
    public void add(int p0,Object p1){
       this.ensureIsMutable();
       if (p0 >= 0) {
          ProtobufArrayList tsize = this.size;
          if (p0 <= tsize) {
             ProtobufArrayList tarray = this.array;
             if (tsize < tarray.length) {
                System.arraycopy(tarray, p0, tarray, (p0 + 1), (tsize - p0));
             }else {
                Object[] objArray = ProtobufArrayList.createArray((((tsize * 3) / 2) + 1));
                System.arraycopy(this.array, 0, objArray, 0, p0);
                System.arraycopy(this.array, p0, objArray, (p0 + 1), (this.size - p0));
                this.array = objArray;
             }
             this.array[p0] = p1;
             this.size = this.size + 1;
             this.modCount = this.modCount + 1;
             return;
          }
       }
       throw new IndexOutOfBoundsException(this.makeOutOfBoundsExceptionMessage(p0));
    }
    public boolean add(Object p0){
       this.ensureIsMutable();
       ProtobufArrayList tsize = this.size;
       ProtobufArrayList tarray = this.array;
       if (tsize == tarray.length) {
          this.array = Arrays.copyOf(tarray, (((tsize * 3) / 2) + 1));
       }
       tarray = this.size;
       this.size = tarray + 1;
       this.array[tarray] = p0;
       this.modCount = this.modCount + 1;
       return 1;
    }
    public final void ensureIndexInRange(int p0){
       if (p0 >= 0 && p0 < this.size) {
          return;
       }
       throw new IndexOutOfBoundsException(this.makeOutOfBoundsExceptionMessage(p0));
    }
    public Object get(int p0){
       this.ensureIndexInRange(p0);
       return this.array[p0];
    }
    public final String makeOutOfBoundsExceptionMessage(int p0){
       return "Index:"+p0+", Size:"+this.size;
    }
    public Internal$ProtobufList mutableCopyWithCapacity(int p0){
       return this.mutableCopyWithCapacity(p0);
    }
    public ProtobufArrayList mutableCopyWithCapacity(int p0){
       if (p0 >= this.size) {
          return new ProtobufArrayList(Arrays.copyOf(this.array, p0), this.size);
       }
       throw new IllegalArgumentException();
    }
    public Object remove(int p0){
       this.ensureIsMutable();
       this.ensureIndexInRange(p0);
       ProtobufArrayList tarray = this.array;
       object oobject = tarray[p0];
       ProtobufArrayList tsize = this.size;
       if (p0 < (tsize - 1)) {
          System.arraycopy(tarray, (p0 + 1), tarray, p0, ((tsize - p0) - 1));
       }
       this.size = this.size - 1;
       this.modCount = this.modCount + 1;
       return oobject;
    }
    public Object set(int p0,Object p1){
       this.ensureIsMutable();
       this.ensureIndexInRange(p0);
       ProtobufArrayList tarray = this.array;
       object oobject = tarray[p0];
       tarray[p0] = p1;
       this.modCount = this.modCount + 1;
       return oobject;
    }
    public int size(){
       return this.size;
    }
}
