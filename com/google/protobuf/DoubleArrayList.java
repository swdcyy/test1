package com.google.protobuf.DoubleArrayList;
import com.google.protobuf.Internal$DoubleList;
import java.util.RandomAccess;
import com.google.protobuf.PrimitiveNonBoxingCollection;
import com.google.protobuf.AbstractProtobufList;
import java.lang.Double;
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

public final class DoubleArrayList extends AbstractProtobufList implements Internal$DoubleList, RandomAccess, PrimitiveNonBoxingCollection	// class@0003f1
{
    public double[] array;
    public int size;
    public static final DoubleArrayList EMPTY_LIST;

    static {
       double[] uodoubleArra = new double[0];
       DoubleArrayList uDoubleArray = new DoubleArrayList(uodoubleArra, 0);
       DoubleArrayList.EMPTY_LIST = uDoubleArray;
       uDoubleArray.makeImmutable();
    }
    public void DoubleArrayList(){
       double[] uodoubleArra = new double[10];
       super(uodoubleArra, 0);
    }
    public void DoubleArrayList(double[] p0,int p1){
       super();
       this.array = p0;
       this.size = p1;
    }
    public static DoubleArrayList emptyList(){
       return DoubleArrayList.EMPTY_LIST;
    }
    public void add(int p0,Double p1){
       this.addDouble(p0, p1.doubleValue());
    }
    public void add(int p0,Object p1){
       this.add(p0, p1);
    }
    public boolean add(Double p0){
       this.addDouble(p0.doubleValue());
       return true;
    }
    public boolean add(Object p0){
       return this.add(p0);
    }
    public boolean addAll(Collection p0){
       this.ensureIsMutable();
       Internal.checkNotNull(p0);
       if (!p0 instanceof DoubleArrayList) {
          return super.addAll(p0);
       }
       DoubleArrayList size = p0.size;
       if (size == null) {
          return false;
       }
       DoubleArrayList tsize = this.size;
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
    public void addDouble(double p0){
       this.ensureIsMutable();
       DoubleArrayList tsize = this.size;
       DoubleArrayList tarray = this.array;
       if (tsize == tarray.length) {
          double[] uodoubleArra = new double[(((tsize * 3) / 2) + 1)];
          System.arraycopy(tarray, 0, uodoubleArra, 0, tsize);
          this.array = uodoubleArra;
       }
       tarray = this.size;
       this.size = tarray + 1;
       this.array[tarray] = p0;
       return;
    }
    public final void addDouble(int p0,double p1){
       this.ensureIsMutable();
       if (p0 >= 0) {
          DoubleArrayList tsize = this.size;
          if (p0 <= tsize) {
             DoubleArrayList tarray = this.array;
             if (tsize < tarray.length) {
                System.arraycopy(tarray, p0, tarray, (p0 + 1), (tsize - p0));
             }else {
                double[] uodoubleArra = new double[(((tsize * 3) / 2) + 1)];
                System.arraycopy(tarray, 0, uodoubleArra, 0, p0);
                System.arraycopy(this.array, p0, uodoubleArra, (p0 + 1), (this.size - p0));
                this.array = uodoubleArra;
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
       if (!p0 instanceof DoubleArrayList) {
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
          if (Double.doubleToLongBits(this.array[i]) - Double.doubleToLongBits(p0[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public Double get(int p0){
       return Double.valueOf(this.getDouble(p0));
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public double getDouble(int p0){
       this.ensureIndexInRange(p0);
       return this.array[p0];
    }
    public int hashCode(){
       int i = 1;
       for (int i1 = 0; i1 < this.size; i1 = i1 + 1) {
          i = i * 31;
          i = i + Internal.hashLong(Double.doubleToLongBits(this.array[i1]));
       }
       return i;
    }
    public final String makeOutOfBoundsExceptionMessage(int p0){
       return "Index:"+p0+", Size:"+this.size;
    }
    public Internal$DoubleList mutableCopyWithCapacity(int p0){
       if (p0 >= this.size) {
          return new DoubleArrayList(Arrays.copyOf(this.array, p0), this.size);
       }
       throw new IllegalArgumentException();
    }
    public Internal$ProtobufList mutableCopyWithCapacity(int p0){
       return this.mutableCopyWithCapacity(p0);
    }
    public Double remove(int p0){
       this.ensureIsMutable();
       this.ensureIndexInRange(p0);
       DoubleArrayList tarray = this.array;
       long l = tarray[p0];
       DoubleArrayList tsize = this.size;
       if (p0 < (tsize - 1)) {
          System.arraycopy(tarray, (p0 + 1), tarray, p0, ((tsize - p0) - 1));
       }
       this.size = this.size - 1;
       this.modCount = this.modCount + 1;
       return Double.valueOf(l);
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
          if (p0.equals(Double.valueOf(this.array[i1]))) {
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
    public Double set(int p0,Double p1){
       return Double.valueOf(this.setDouble(p0, p1.doubleValue()));
    }
    public Object set(int p0,Object p1){
       return this.set(p0, p1);
    }
    public double setDouble(int p0,double p1){
       this.ensureIsMutable();
       this.ensureIndexInRange(p0);
       DoubleArrayList tarray = this.array;
       long l = tarray[p0];
       tarray[p0] = p1;
       return l;
    }
    public int size(){
       return this.size;
    }
}
