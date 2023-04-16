package androidx.collection.LongSparseArray;
import java.lang.Cloneable;
import java.lang.Object;
import androidx.collection.ContainerHelpers;
import java.lang.System;
import java.lang.AssertionError;
import java.lang.String;
import java.lang.StringBuilder;

public class LongSparseArray implements Cloneable	// class@00065a
{
    public boolean mGarbage;
    public long[] mKeys;
    public int mSize;
    public Object[] mValues;
    public static final Object DELETED;

    static {
       LongSparseArray.DELETED = new Object();
    }
    public void LongSparseArray(){
       super(10);
    }
    public void LongSparseArray(int p0){
       super();
       this.mGarbage = false;
       if (!p0) {
          this.mKeys = ContainerHelpers.EMPTY_LONGS;
          this.mValues = ContainerHelpers.EMPTY_OBJECTS;
       }else {
          p0 = ContainerHelpers.idealLongArraySize(p0);
          long[] olongArray = new long[p0];
          this.mKeys = olongArray;
          Object[] objArray = new Object[p0];
          this.mValues = objArray;
       }
       return;
    }
    public void append(long p0,Object p1){
       LongSparseArray tmSize = this.mSize;
       if (tmSize != null && p0 - this.mKeys[(tmSize - 1)] <= 0) {
          this.put(p0, p1);
          return;
       }else if(this.mGarbage != null && tmSize >= this.mKeys.length){
          this.gc();
       }
       tmSize = this.mSize;
       if (tmSize >= this.mKeys.length) {
          int i = ContainerHelpers.idealLongArraySize((tmSize + 1));
          long[] olongArray = new long[i];
          Object[] objArray = new Object[i];
          LongSparseArray tmKeys = this.mKeys;
          System.arraycopy(tmKeys, 0, olongArray, 0, tmKeys.length);
          tmKeys = this.mValues;
          System.arraycopy(tmKeys, 0, objArray, 0, tmKeys.length);
          this.mKeys = olongArray;
          this.mValues = objArray;
       }
       this.mKeys[tmSize] = p0;
       p0[tmSize] = p1;
       this.mSize = tmSize + 1;
       return;
    }
    public void clear(){
       LongSparseArray tmSize = this.mSize;
       LongSparseArray tmValues = this.mValues;
       for (int i = 0; i < tmSize; i = i + 1) {
          tmValues[i] = null;
       }
       this.mSize = 0;
       this.mGarbage = false;
       return;
    }
    public LongSparseArray clone(){
       try{
          LongSparseArray longSparseAr = super.clone();
          longSparseAr.mKeys = this.mKeys.clone();
          longSparseAr.mValues = this.mValues.clone();
          return longSparseAr;
       }catch(java.lang.CloneNotSupportedException e0){
          throw new AssertionError(e0);
       }
    }
    public Object clone(){
       return this.clone();
    }
    public boolean containsKey(long p0){
       boolean b = (this.indexOfKey(p0) >= 0)? true: false;
       return b;
    }
    public boolean containsValue(Object p0){
       boolean b = (this.indexOfValue(p0) >= 0)? true: false;
       return b;
    }
    public void delete(long p0){
       this.remove(p0);
    }
    public final void gc(){
       LongSparseArray tmSize = this.mSize;
       LongSparseArray tmKeys = this.mKeys;
       LongSparseArray tmValues = this.mValues;
       int i = 0;
       int i1 = 0;
       while (i < tmSize) {
          object oobject = tmValues[i];
          if (oobject != LongSparseArray.DELETED) {
             if (i != i1) {
                tmKeys[i1] = tmKeys[i];
                tmValues[i1] = oobject;
                tmValues[i] = null;
             }
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       this.mGarbage = false;
       this.mSize = i1;
       return;
    }
    public Object get(long p0){
       return this.get(p0, null);
    }
    public Object get(long p0,Object p1){
       int i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, p0);
       if (i >= 0) {
          LongSparseArray tmValues = this.mValues;
          if (tmValues[i] != LongSparseArray.DELETED) {
             return tmValues[i];
          }
       }
       return p1;
    }
    public int indexOfKey(long p0){
       if (this.mGarbage != null) {
          this.gc();
       }
       return ContainerHelpers.binarySearch(this.mKeys, this.mSize, p0);
    }
    public int indexOfValue(Object p0){
       if (this.mGarbage != null) {
          this.gc();
       }
       int i = 0;
       while (true) {
          if (i >= this.mSize) {
             return -1;
          }
          if (this.mValues[i] == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public boolean isEmpty(){
       boolean b = (!this.size())? true: false;
       return b;
    }
    public long keyAt(int p0){
       if (this.mGarbage != null) {
          this.gc();
       }
       return this.mKeys[p0];
    }
    public void put(long p0,Object p1){
       int i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, p0);
       if (i >= 0) {
          p0[i] = p1;
       }else {
          i = ~ i;
          LongSparseArray tmSize = this.mSize;
          if (i < tmSize) {
             LongSparseArray tmValues = this.mValues;
             if (tmValues[i] == LongSparseArray.DELETED) {
                this.mKeys[i] = p0;
                tmValues[i] = p1;
                return;
             }
          }
          if (this.mGarbage != null && tmSize >= this.mKeys.length) {
             this.gc();
             i = ~ ContainerHelpers.binarySearch(this.mKeys, this.mSize, p0);
          }
          tmSize = this.mSize;
          if (tmSize >= this.mKeys.length) {
             int i1 = ContainerHelpers.idealLongArraySize((tmSize + 1));
             long[] olongArray = new long[i1];
             Object[] objArray = new Object[i1];
             LongSparseArray tmKeys = this.mKeys;
             System.arraycopy(tmKeys, 0, olongArray, 0, tmKeys.length);
             tmKeys = this.mValues;
             System.arraycopy(tmKeys, 0, objArray, 0, tmKeys.length);
             this.mKeys = olongArray;
             this.mValues = objArray;
          }
          tmSize = this.mSize;
          if (tmSize - i) {
             int i2 = i + 1;
             System.arraycopy(this.mKeys, i, this.mKeys, i2, (tmSize - i));
             System.arraycopy(this.mValues, i, this.mValues, i2, (this.mSize - i));
          }
          this.mKeys[i] = p0;
          p0[i] = p1;
          this.mSize = this.mSize + 1;
       }
       return;
    }
    public void putAll(LongSparseArray p0){
       int i = p0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.put(p0.keyAt(i1), p0.valueAt(i1));
       }
       return;
    }
    public Object putIfAbsent(long p0,Object p1){
       Object obj = this.get(p0);
       if (obj == null) {
          this.put(p0, p1);
       }
       return obj;
    }
    public void remove(long p0){
       int i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, p0);
       if (i >= 0) {
          LongSparseArray tmValues = this.mValues;
          Object dELETED = LongSparseArray.DELETED;
          if (tmValues[i] != dELETED) {
             tmValues[i] = dELETED;
             this.mGarbage = true;
          }
       }
       return;
    }
    public boolean remove(long p0,Object p1){
       int i = this.indexOfKey(p0);
       if (i >= 0) {
          Object obj = this.valueAt(i);
          if (p1 == obj || (p1 != null && p1.equals(obj))) {
             this.removeAt(i);
             return true;
          }
       }
       return false;
    }
    public void removeAt(int p0){
       LongSparseArray tmValues = this.mValues;
       Object dELETED = LongSparseArray.DELETED;
       if (tmValues[p0] != dELETED) {
          tmValues[p0] = dELETED;
          this.mGarbage = true;
       }
       return;
    }
    public Object replace(long p0,Object p1){
       int i = this.indexOfKey(p0);
       if (i < 0) {
          return null;
       }
       LongSparseArray tmValues = this.mValues;
       object oobject = tmValues[i];
       tmValues[i] = p1;
       return oobject;
    }
    public boolean replace(long p0,Object p1,Object p2){
       int i = this.indexOfKey(p0);
       if (i >= 0) {
          object oobject = this.mValues[i];
          if (oobject == p1 || (p1 != null && p1.equals(oobject))) {
             this.mValues[i] = p2;
             return true;
          }
       }
       return false;
    }
    public void setValueAt(int p0,Object p1){
       if (this.mGarbage != null) {
          this.gc();
       }
       this.mValues[p0] = p1;
       return;
    }
    public int size(){
       if (this.mGarbage != null) {
          this.gc();
       }
       return this.mSize;
    }
    public String toString(){
       if (this.size() <= 0) {
          return "{}";
       }
       StringBuilder str = new StringBuilder((this.mSize * 28))+'{';
       int i = 0;
       while (i < this.mSize) {
          if (i > 0) {
             str = str+", ";
          }
          str = str+this.keyAt(i)+'=';
          Object obj = this.valueAt(i);
          str = (obj != this)? str+obj: str+"\(this Map\)";
          i = i + 1;
       }
       return str+'}';
    }
    public Object valueAt(int p0){
       if (this.mGarbage != null) {
          this.gc();
       }
       return this.mValues[p0];
    }
}
