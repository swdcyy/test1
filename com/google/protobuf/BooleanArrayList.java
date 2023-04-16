package com.google.protobuf.BooleanArrayList;
import com.google.protobuf.Internal$BooleanList;
import java.util.RandomAccess;
import com.google.protobuf.PrimitiveNonBoxingCollection;
import com.google.protobuf.AbstractProtobufList;
import java.lang.Boolean;
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

public final class BooleanArrayList extends AbstractProtobufList implements Internal$BooleanList, RandomAccess, PrimitiveNonBoxingCollection	// class@0003c5
{
    public boolean[] array;
    public int size;
    public static final BooleanArrayList EMPTY_LIST;

    static {
       boolean[] uobooleanArr = new boolean[0];
       BooleanArrayList uBooleanArra = new BooleanArrayList(uobooleanArr, 0);
       BooleanArrayList.EMPTY_LIST = uBooleanArra;
       uBooleanArra.makeImmutable();
    }
    public void BooleanArrayList(){
       boolean[] uobooleanArr = new boolean[10];
       super(uobooleanArr, 0);
    }
    public void BooleanArrayList(boolean[] p0,int p1){
       super();
       this.array = p0;
       this.size = p1;
    }
    public static BooleanArrayList emptyList(){
       return BooleanArrayList.EMPTY_LIST;
    }
    public void add(int p0,Boolean p1){
       this.addBoolean(p0, p1.booleanValue());
    }
    public void add(int p0,Object p1){
       this.add(p0, p1);
    }
    public boolean add(Boolean p0){
       this.addBoolean(p0.booleanValue());
       return true;
    }
    public boolean add(Object p0){
       return this.add(p0);
    }
    public boolean addAll(Collection p0){
       this.ensureIsMutable();
       Internal.checkNotNull(p0);
       if (!p0 instanceof BooleanArrayList) {
          return super.addAll(p0);
       }
       BooleanArrayList size = p0.size;
       if (size == null) {
          return false;
       }
       BooleanArrayList tsize = this.size;
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
    public final void addBoolean(int p0,boolean p1){
       this.ensureIsMutable();
       if (p0 >= 0) {
          BooleanArrayList tsize = this.size;
          if (p0 <= tsize) {
             BooleanArrayList tarray = this.array;
             if (tsize < tarray.length) {
                System.arraycopy(tarray, p0, tarray, (p0 + 1), (tsize - p0));
             }else {
                boolean[] uobooleanArr = new boolean[(((tsize * 3) / 2) + 1)];
                System.arraycopy(tarray, 0, uobooleanArr, 0, p0);
                System.arraycopy(this.array, p0, uobooleanArr, (p0 + 1), (this.size - p0));
                this.array = uobooleanArr;
             }
             this.array[p0] = p1;
             this.size = this.size + 1;
             this.modCount = this.modCount + 1;
             return;
          }
       }
       throw new IndexOutOfBoundsException(this.makeOutOfBoundsExceptionMessage(p0));
    }
    public void addBoolean(boolean p0){
       this.ensureIsMutable();
       BooleanArrayList tsize = this.size;
       BooleanArrayList tarray = this.array;
       if (tsize == tarray.length) {
          boolean[] uobooleanArr = new boolean[(((tsize * 3) / 2) + 1)];
          System.arraycopy(tarray, 0, uobooleanArr, 0, tsize);
          this.array = uobooleanArr;
       }
       tarray = this.size;
       this.size = tarray + 1;
       this.array[tarray] = p0;
       return;
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
       if (!p0 instanceof BooleanArrayList) {
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
          if (this.array[i] != p0[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public Boolean get(int p0){
       return Boolean.valueOf(this.getBoolean(p0));
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public boolean getBoolean(int p0){
       this.ensureIndexInRange(p0);
       return this.array[p0];
    }
    public int hashCode(){
       int i = 1;
       for (int i1 = 0; i1 < this.size; i1 = i1 + 1) {
          i = i * 31;
          i = i + Internal.hashBoolean(this.array[i1]);
       }
       return i;
    }
    public final String makeOutOfBoundsExceptionMessage(int p0){
       return "Index:"+p0+", Size:"+this.size;
    }
    public Internal$BooleanList mutableCopyWithCapacity(int p0){
       if (p0 >= this.size) {
          return new BooleanArrayList(Arrays.copyOf(this.array, p0), this.size);
       }
       throw new IllegalArgumentException();
    }
    public Internal$ProtobufList mutableCopyWithCapacity(int p0){
       return this.mutableCopyWithCapacity(p0);
    }
    public Boolean remove(int p0){
       this.ensureIsMutable();
       this.ensureIndexInRange(p0);
       BooleanArrayList tarray = this.array;
       boolean b = tarray[p0];
       BooleanArrayList tsize = this.size;
       if (p0 < (tsize - 1)) {
          System.arraycopy(tarray, (p0 + 1), tarray, p0, ((tsize - p0) - 1));
       }
       this.size = this.size - 1;
       this.modCount = this.modCount + 1;
       return Boolean.valueOf(b);
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
          if (p0.equals(Boolean.valueOf(this.array[i1]))) {
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
    public Boolean set(int p0,Boolean p1){
       return Boolean.valueOf(this.setBoolean(p0, p1.booleanValue()));
    }
    public Object set(int p0,Object p1){
       return this.set(p0, p1);
    }
    public boolean setBoolean(int p0,boolean p1){
       this.ensureIsMutable();
       this.ensureIndexInRange(p0);
       BooleanArrayList tarray = this.array;
       boolean b = tarray[p0];
       tarray[p0] = p1;
       return b;
    }
    public int size(){
       return this.size;
    }
}
