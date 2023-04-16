package com.google.protobuf.FloatArrayList;
import com.google.protobuf.Internal$FloatList;
import java.util.RandomAccess;
import com.google.protobuf.PrimitiveNonBoxingCollection;
import com.google.protobuf.AbstractProtobufList;
import java.lang.Float;
import java.lang.Object;
import java.util.Collection;
import com.google.protobuf.Internal;
import java.util.Arrays;
import java.lang.System;
import java.util.AbstractList;
import java.lang.OutOfMemoryError;
import java.lang.IndexOutOfBoundsException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import com.google.protobuf.Internal$ProtobufList;

public final class FloatArrayList extends AbstractProtobufList implements Internal$FloatList, RandomAccess, PrimitiveNonBoxingCollection	// class@00042b
{
    public float[] array;
    public int size;
    public static final FloatArrayList EMPTY_LIST;

    static {
       float[] uofloatArray = new float[0];
       FloatArrayList uFloatArrayL = new FloatArrayList(uofloatArray, 0);
       FloatArrayList.EMPTY_LIST = uFloatArrayL;
       uFloatArrayL.makeImmutable();
    }
    public void FloatArrayList(){
       float[] uofloatArray = new float[10];
       super(uofloatArray, 0);
    }
    public void FloatArrayList(float[] p0,int p1){
       super();
       this.array = p0;
       this.size = p1;
    }
    public static FloatArrayList emptyList(){
       return FloatArrayList.EMPTY_LIST;
    }
    public void add(int p0,Float p1){
       this.addFloat(p0, p1.floatValue());
    }
    public void add(int p0,Object p1){
       this.add(p0, p1);
    }
    public boolean add(Float p0){
       this.addFloat(p0.floatValue());
       return true;
    }
    public boolean add(Object p0){
       return this.add(p0);
    }
    public boolean addAll(Collection p0){
       this.ensureIsMutable();
       Internal.checkNotNull(p0);
       if (!p0 instanceof FloatArrayList) {
          return super.addAll(p0);
       }
       FloatArrayList size = p0.size;
       if (size == null) {
          return false;
       }
       FloatArrayList tsize = this.size;
       if ((Integer.MAX_VALUE - tsize) < size) {
          throw new OutOfMemoryError();
       }
       int i = tsize + size;
       size = this.array;
       if (i > size.length) {
          this.array = Arrays.copyOf(size, i);
       }
       System.arraycopy(p0.array, false, this.array, this.size, p0.size);
       this.size = i;
       this.modCount = this.modCount + 1;
       return 1;
    }
    public void addFloat(float p0){
       this.ensureIsMutable();
       FloatArrayList tsize = this.size;
       FloatArrayList tarray = this.array;
       if (tsize == tarray.length) {
          float[] uofloatArray = new float[(((tsize * 3) / 2) + 1)];
          System.arraycopy(tarray, 0, uofloatArray, 0, tsize);
          this.array = uofloatArray;
       }
       tarray = this.size;
       this.size = tarray + 1;
       this.array[tarray] = p0;
       return;
    }
    public final void addFloat(int p0,float p1){
       this.ensureIsMutable();
       if (p0 >= 0) {
          FloatArrayList tsize = this.size;
          if (p0 <= tsize) {
             FloatArrayList tarray = this.array;
             if (tsize < tarray.length) {
                System.arraycopy(tarray, p0, tarray, (p0 + 1), (tsize - p0));
             }else {
                float[] uofloatArray = new float[(((tsize * 3) / 2) + 1)];
                System.arraycopy(tarray, 0, uofloatArray, 0, p0);
                System.arraycopy(this.array, p0, uofloatArray, (p0 + 1), (this.size - p0));
                this.array = uofloatArray;
             }
             this.array[p0] = p1;
             this.size = this.size + 1;
             this.modCount = this.modCount + 1;
             return;
          }
       }
       throw new IndexOutOfBoundsException(this.makeOutOfBoundsExceptionMessage(p0));
    }
    public final void ensureIndexInRange(int p0){
       if (p0 >= 0 && p0 < this.size) {
          return;
       }
       throw new IndexOutOfBoundsException(this.makeOutOfBoundsExceptionMessage(p0));
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof FloatArrayList) {
          return super.equals(p0);
       }
       if (this.size != p0.size) {
          return false;
       }
       p0 = p0.array;
       int i = 0;
       while (true) {
          if (i >= this.size) {
             return true;
          }
          if (Float.floatToIntBits(this.array[i]) != Float.floatToIntBits(p0[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public Float get(int p0){
       return Float.valueOf(this.getFloat(p0));
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public float getFloat(int p0){
       this.ensureIndexInRange(p0);
       return this.array[p0];
    }
    public int hashCode(){
       int i = 1;
       for (int i1 = 0; i1 < this.size; i1 = i1 + 1) {
          i = i * 31;
          i = i + Float.floatToIntBits(this.array[i1]);
       }
       return i;
    }
    public final String makeOutOfBoundsExceptionMessage(int p0){
       return "Index:"+p0+", Size:"+this.size;
    }
    public Internal$FloatList mutableCopyWithCapacity(int p0){
       if (p0 >= this.size) {
          return new FloatArrayList(Arrays.copyOf(this.array, p0), this.size);
       }
       throw new IllegalArgumentException();
    }
    public Internal$ProtobufList mutableCopyWithCapacity(int p0){
       return this.mutableCopyWithCapacity(p0);
    }
    public Float remove(int p0){
       this.ensureIsMutable();
       this.ensureIndexInRange(p0);
       FloatArrayList tarray = this.array;
       int i = tarray[p0];
       FloatArrayList tsize = this.size;
       if (p0 < (tsize - 1)) {
          System.arraycopy(tarray, (p0 + 1), tarray, p0, ((tsize - p0) - 1));
       }
       this.size = this.size - 1;
       this.modCount = this.modCount + 1;
       return Float.valueOf(i);
    }
    public Object remove(int p0){
       return this.remove(p0);
    }
    public boolean remove(Object p0){
       this.ensureIsMutable();
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 >= this.size) {
             return i;
          }
          if (p0.equals(Float.valueOf(this.array[i1]))) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       System.arraycopy(this.array, (i1 + 1), this.array, i1, ((this.size - i1) - 1));
       this.size = this.size - 1;
       this.modCount = this.modCount + 1;
       return 1;
    }
    public void removeRange(int p0,int p1){
       this.ensureIsMutable();
       if (p1 < p0) {
          throw new IndexOutOfBoundsException("toIndex < fromIndex");
       }
       System.arraycopy(this.array, p1, this.array, p0, (this.size - p1));
       this.size = this.size - (p1 - p0);
       this.modCount = this.modCount + 1;
       return;
    }
    public Float set(int p0,Float p1){
       return Float.valueOf(this.setFloat(p0, p1.floatValue()));
    }
    public Object set(int p0,Object p1){
       return this.set(p0, p1);
    }
    public float setFloat(int p0,float p1){
       this.ensureIsMutable();
       this.ensureIndexInRange(p0);
       FloatArrayList tarray = this.array;
       int i = tarray[p0];
       tarray[p0] = p1;
       return i;
    }
    public int size(){
       return this.size;
    }
}
