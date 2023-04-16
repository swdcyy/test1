package androidx.collection.SparseArrayCompat;
import java.lang.Cloneable;
import java.lang.Object;
import androidx.collection.ContainerHelpers;
import java.lang.System;
import java.lang.AssertionError;
import java.lang.Math;
import java.lang.String;
import java.lang.StringBuilder;

public class SparseArrayCompat implements Cloneable	// class@000663
{
    public boolean mGarbage;
    public int[] mKeys;
    public int mSize;
    public Object[] mValues;
    public static final Object DELETED;

    static {
       SparseArrayCompat.DELETED = new Object();
    }
    public void SparseArrayCompat(){
       super(10);
    }
    public void SparseArrayCompat(int p0){
       super();
       this.mGarbage = false;
       if (!p0) {
          this.mKeys = ContainerHelpers.EMPTY_INTS;
          this.mValues = ContainerHelpers.EMPTY_OBJECTS;
       }else {
          p0 = ContainerHelpers.idealIntArraySize(p0);
          int[] ointArray = new int[p0];
          this.mKeys = ointArray;
          Object[] objArray = new Object[p0];
          this.mValues = objArray;
       }
       return;
    }
    public void append(int p0,Object p1){
       SparseArrayCompat tmSize = this.mSize;
       if (tmSize != null && p0 <= this.mKeys[(tmSize - 1)]) {
          this.put(p0, p1);
          return;
       }else if(this.mGarbage != null && tmSize >= this.mKeys.length){
          this.gc();
       }
       tmSize = this.mSize;
       if (tmSize >= this.mKeys.length) {
          int i = ContainerHelpers.idealIntArraySize((tmSize + 1));
          int[] ointArray = new int[i];
          Object[] objArray = new Object[i];
          SparseArrayCompat tmKeys = this.mKeys;
          System.arraycopy(tmKeys, 0, ointArray, 0, tmKeys.length);
          tmKeys = this.mValues;
          System.arraycopy(tmKeys, 0, objArray, 0, tmKeys.length);
          this.mKeys = ointArray;
          this.mValues = objArray;
       }
       this.mKeys[tmSize] = p0;
       p0[tmSize] = p1;
       this.mSize = tmSize + 1;
       return;
    }
    public void clear(){
       SparseArrayCompat tmSize = this.mSize;
       SparseArrayCompat tmValues = this.mValues;
       for (int i = 0; i < tmSize; i = i + 1) {
          tmValues[i] = null;
       }
       this.mSize = 0;
       this.mGarbage = false;
       return;
    }
    public SparseArrayCompat clone(){
       try{
          SparseArrayCompat sparseArrayC = super.clone();
          sparseArrayC.mKeys = this.mKeys.clone();
          sparseArrayC.mValues = this.mValues.clone();
          return sparseArrayC;
       }catch(java.lang.CloneNotSupportedException e0){
          throw new AssertionError(e0);
       }
    }
    public Object clone(){
       return this.clone();
    }
    public boolean containsKey(int p0){
       boolean b = (this.indexOfKey(p0) >= 0)? true: false;
       return b;
    }
    public boolean containsValue(Object p0){
       boolean b = (this.indexOfValue(p0) >= 0)? true: false;
       return b;
    }
    public void delete(int p0){
       this.remove(p0);
    }
    public final void gc(){
       SparseArrayCompat tmSize = this.mSize;
       SparseArrayCompat tmKeys = this.mKeys;
       SparseArrayCompat tmValues = this.mValues;
       int i = 0;
       int i1 = 0;
       while (i < tmSize) {
          object oobject = tmValues[i];
          if (oobject != SparseArrayCompat.DELETED) {
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
    public Object get(int p0){
       return this.get(p0, null);
    }
    public Object get(int p0,Object p1){
       p0 = ContainerHelpers.binarySearch(this.mKeys, this.mSize, p0);
       if (p0 >= 0) {
          SparseArrayCompat tmValues = this.mValues;
          if (tmValues[p0] != SparseArrayCompat.DELETED) {
             return tmValues[p0];
          }
       }
       return p1;
    }
    public int indexOfKey(int p0){
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
    public int keyAt(int p0){
       if (this.mGarbage != null) {
          this.gc();
       }
       return this.mKeys[p0];
    }
    public void put(int p0,Object p1){
       int i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, p0);
       if (i >= 0) {
          p0[i] = p1;
       }else {
          i = ~ i;
          SparseArrayCompat tmSize = this.mSize;
          if (i < tmSize) {
             SparseArrayCompat tmValues = this.mValues;
             if (tmValues[i] == SparseArrayCompat.DELETED) {
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
             int i1 = ContainerHelpers.idealIntArraySize((tmSize + 1));
             int[] ointArray = new int[i1];
             Object[] objArray = new Object[i1];
             SparseArrayCompat tmKeys = this.mKeys;
             System.arraycopy(tmKeys, 0, ointArray, 0, tmKeys.length);
             tmKeys = this.mValues;
             System.arraycopy(tmKeys, 0, objArray, 0, tmKeys.length);
             this.mKeys = ointArray;
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
    public void putAll(SparseArrayCompat p0){
       int i = p0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.put(p0.keyAt(i1), p0.valueAt(i1));
       }
       return;
    }
    public Object putIfAbsent(int p0,Object p1){
       Object obj = this.get(p0);
       if (obj == null) {
          this.put(p0, p1);
       }
       return obj;
    }
    public void remove(int p0){
       p0 = ContainerHelpers.binarySearch(this.mKeys, this.mSize, p0);
       if (p0 >= 0) {
          SparseArrayCompat tmValues = this.mValues;
          Object dELETED = SparseArrayCompat.DELETED;
          if (tmValues[p0] != dELETED) {
             tmValues[p0] = dELETED;
             this.mGarbage = true;
          }
       }
       return;
    }
    public boolean remove(int p0,Object p1){
       p0 = this.indexOfKey(p0);
       if (p0 >= 0) {
          Object obj = this.valueAt(p0);
          if (p1 == obj || (p1 != null && p1.equals(obj))) {
             this.removeAt(p0);
             return true;
          }
       }
       return false;
    }
    public void removeAt(int p0){
       SparseArrayCompat tmValues = this.mValues;
       Object dELETED = SparseArrayCompat.DELETED;
       if (tmValues[p0] != dELETED) {
          tmValues[p0] = dELETED;
          this.mGarbage = true;
       }
       return;
    }
    public void removeAtRange(int p0,int p1){
       p1 = Math.min(this.mSize, (p1 + p0));
       for (; p0 < p1; p0++) {
          this.removeAt(p0);
       }
       return;
    }
    public Object replace(int p0,Object p1){
       p0 = this.indexOfKey(p0);
       if (p0 < 0) {
          return null;
       }
       SparseArrayCompat tmValues = this.mValues;
       object oobject = tmValues[p0];
       tmValues[p0] = p1;
       return oobject;
    }
    public boolean replace(int p0,Object p1,Object p2){
       p0 = this.indexOfKey(p0);
       if (p0 >= 0) {
          object oobject = this.mValues[p0];
          if (oobject == p1 || (p1 != null && p1.equals(oobject))) {
             p1[p0] = p2;
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
