package com.google.protobuf.LongArrayList;
import com.google.protobuf.Internal$LongList;
import java.util.RandomAccess;
import com.google.protobuf.PrimitiveNonBoxingCollection;
import com.google.protobuf.AbstractProtobufList;
import java.lang.Long;
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

public final class LongArrayList extends AbstractProtobufList implements Internal$LongList, RandomAccess, PrimitiveNonBoxingCollection	// class@00046d
{
    public long[] array;
    public int size;
    public static final LongArrayList EMPTY_LIST;

    static {
       long[] olongArray = new long[0];
       LongArrayList longArrayLis = new LongArrayList(olongArray, 0);
       LongArrayList.EMPTY_LIST = longArrayLis;
       longArrayLis.makeImmutable();
    }
    public void LongArrayList(){
       long[] olongArray = new long[10];
       super(olongArray, 0);
    }
    public void LongArrayList(long[] p0,int p1){
       super();
       this.array = p0;
       this.size = p1;
    }
    public static LongArrayList emptyList(){
       return LongArrayList.EMPTY_LIST;
    }
    public void add(int p0,Long p1){
       this.addLong(p0, p1.longValue());
    }
    public void add(int p0,Object p1){
       this.add(p0, p1);
    }
    public boolean add(Long p0){
       this.addLong(p0.longValue());
       return true;
    }
    public boolean add(Object p0){
       return this.add(p0);
    }
    public boolean addAll(Collection p0){
       this.ensureIsMutable();
       Internal.checkNotNull(p0);
       if (!p0 instanceof LongArrayList) {
          return super.addAll(p0);
       }
       LongArrayList size = p0.size;
       if (size == null) {
          return false;
       }
       LongArrayList tsize = this.size;
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
    public final void addLong(int p0,long p1){
       this.ensureIsMutable();
       if (p0 >= 0) {
          LongArrayList tsize = this.size;
          if (p0 <= tsize) {
             LongArrayList tarray = this.array;
             if (tsize < tarray.length) {
                System.arraycopy(tarray, p0, tarray, (p0 + 1), (tsize - p0));
             }else {
                long[] olongArray = new long[(((tsize * 3) / 2) + 1)];
                System.arraycopy(tarray, 0, olongArray, 0, p0);
                System.arraycopy(this.array, p0, olongArray, (p0 + 1), (this.size - p0));
                this.array = olongArray;
             }
             this.array[p0] = p1;
             this.size = this.size + 1;
             this.modCount = this.modCount + 1;
             return;
          }
       }
       throw new IndexOutOfBoundsException(this.makeOutOfBoundsExceptionMessage(p0));
    }
    public void addLong(long p0){
       this.ensureIsMutable();
       LongArrayList tsize = this.size;
       LongArrayList tarray = this.array;
       if (tsize == tarray.length) {
          long[] olongArray = new long[(((tsize * 3) / 2) + 1)];
          System.arraycopy(tarray, 0, olongArray, 0, tsize);
          this.array = olongArray;
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
       if (!p0 instanceof LongArrayList) {
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
          if (this.array[i] - p0[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public Long get(int p0){
       return Long.valueOf(this.getLong(p0));
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public long getLong(int p0){
       this.ensureIndexInRange(p0);
       return this.array[p0];
    }
    public int hashCode(){
       int i = 1;
       for (int i1 = 0; i1 < this.size; i1 = i1 + 1) {
          i = i * 31;
          i = i + Internal.hashLong(this.array[i1]);
       }
       return i;
    }
    public final String makeOutOfBoundsExceptionMessage(int p0){
       return "Index:"+p0+", Size:"+this.size;
    }
    public Internal$LongList mutableCopyWithCapacity(int p0){
       if (p0 >= this.size) {
          return new LongArrayList(Arrays.copyOf(this.array, p0), this.size);
       }
       throw new IllegalArgumentException();
    }
    public Internal$ProtobufList mutableCopyWithCapacity(int p0){
       return this.mutableCopyWithCapacity(p0);
    }
    public Long remove(int p0){
       this.ensureIsMutable();
       this.ensureIndexInRange(p0);
       LongArrayList tarray = this.array;
       long l = tarray[p0];
       LongArrayList tsize = this.size;
       if (p0 < (tsize - 1)) {
          System.arraycopy(tarray, (p0 + 1), tarray, p0, ((tsize - p0) - 1));
       }
       this.size = this.size - 1;
       this.modCount = this.modCount + 1;
       return Long.valueOf(l);
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
          if (p0.equals(Long.valueOf(this.array[i1]))) {
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
    public Long set(int p0,Long p1){
       return Long.valueOf(this.setLong(p0, p1.longValue()));
    }
    public Object set(int p0,Object p1){
       return this.set(p0, p1);
    }
    public long setLong(int p0,long p1){
       this.ensureIsMutable();
       this.ensureIndexInRange(p0);
       LongArrayList tarray = this.array;
       long l = tarray[p0];
       tarray[p0] = p1;
       return l;
    }
    public int size(){
       return this.size;
    }
}
