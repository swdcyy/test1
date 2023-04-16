package com.google.protobuf.nano.KwaiFieldArray;
import java.lang.Cloneable;
import com.google.protobuf.nano.KwaiFieldData;
import java.lang.Object;
import java.lang.System;

public final class KwaiFieldArray implements Cloneable	// class@000512
{
    public KwaiFieldData[] mData;
    public int[] mFieldNumbers;
    public boolean mGarbage;
    public int mSize;
    public static final KwaiFieldData DELETED;

    static {
       KwaiFieldArray.DELETED = new KwaiFieldData();
    }
    public void KwaiFieldArray(){
       super(10);
    }
    public void KwaiFieldArray(int p0){
       super();
       this.mGarbage = false;
       p0 = this.idealIntArraySize(p0);
       int[] ointArray = new int[p0];
       this.mFieldNumbers = ointArray;
       KwaiFieldData[] kwaiFieldDat = new KwaiFieldData[p0];
       this.mData = kwaiFieldDat;
       this.mSize = 0;
    }
    public final boolean arrayEquals(int[] p0,int[] p1,int p2){
       int i = 0;
       while (true) {
          if (i >= p2) {
             return true;
          }
          if (p0[i] != p1[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final boolean arrayEquals(KwaiFieldData[] p0,KwaiFieldData[] p1,int p2){
       int i = 0;
       while (true) {
          if (i >= p2) {
             return true;
          }
          if (!p0[i].equals(p1[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final int binarySearch(int p0){
       int i2;
       int i = this.mSize - 1;
       int i1 = 0;
       while (true) {
          if (i1 > i) {
             return (~ i1);
          }
          i2 = i1 + i;
          i2 = i2 >> 1;
          int i3 = this.mFieldNumbers[i2];
          if (i3 < p0) {
             i2 = i2 + 1;
             i1 = i2;
          }else if(i3 > p0){
             i2 = i2 - 1;
             i = i2;
          }else {
             break ;
          }
       }
       return i2;
    }
    public final KwaiFieldArray clone(){
       int i = this.size();
       KwaiFieldArray kwaiFieldArr = new KwaiFieldArray(i);
       int i1 = 0;
       System.arraycopy(this.mFieldNumbers, i1, kwaiFieldArr.mFieldNumbers, i1, i);
       while (i1 < i) {
          KwaiFieldArray tmData = this.mData;
          if (tmData[i1] != null) {
             kwaiFieldArr.mData[i1] = tmData[i1].clone();
          }
          i1 = i1 + 1;
       }
       kwaiFieldArr.mSize = i;
       return kwaiFieldArr;
    }
    public Object clone(){
       return this.clone();
    }
    public synchronized KwaiFieldData dataAt(int p0){
       if (this.mGarbage != null) {
          this.gc();
       }
       return this.mData[p0];
    }
    public synchronized boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof KwaiFieldArray) {
          return false;
       }
       if (this.size() != p0.size()) {
          return false;
       }
       if (!this.arrayEquals(this.mFieldNumbers, p0.mFieldNumbers, this.mSize) || !this.arrayEquals(this.mData, p0.mData, this.mSize)) {
          b = false;
       }
       return b;
    }
    public synchronized final void gc(){
       KwaiFieldArray tmSize = this.mSize;
       KwaiFieldArray tmFieldNumbe = this.mFieldNumbers;
       KwaiFieldArray tmData = this.mData;
       int i = 0;
       int i1 = 0;
       while (i < tmSize) {
          object oobject = tmData[i];
          if (oobject != KwaiFieldArray.DELETED) {
             if (i != i1) {
                tmFieldNumbe[i1] = tmFieldNumbe[i];
                tmData[i1] = oobject;
                tmData[i] = null;
             }
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       this.mGarbage = false;
       this.mSize = i1;
       return;
    }
    public synchronized KwaiFieldData get(int p0){
       p0 = this.binarySearch(p0);
       if (p0 >= 0) {
          KwaiFieldArray tmData = this.mData;
          if (tmData[p0] != KwaiFieldArray.DELETED) {
             return tmData[p0];
          }
       }
       return null;
    }
    public synchronized int hashCode(){
       if (this.mGarbage != null) {
          this.gc();
       }
       int i = 17;
       for (int i1 = 0; i1 < this.mSize; i1 = i1 + 1) {
          i = i * 31;
          i = i + this.mFieldNumbers[i1];
          i = i * 31;
          i = i + this.mData[i1].hashCode();
       }
       return i;
    }
    public final int idealByteArraySize(int p0){
       int i1;
       int i = 4;
       while (true) {
          if (i >= 32) {
             return p0;
          }
          i1 = 1 << i;
          i1 = i1 - 12;
          if (p0 <= i1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i1;
    }
    public final int idealIntArraySize(int p0){
       return (this.idealByteArraySize((p0 * 4)) / 4);
    }
    public boolean isEmpty(){
       boolean b = (!this.size())? true: false;
       return b;
    }
    public synchronized void put(int p0,KwaiFieldData p1){
       int i = this.binarySearch(p0);
       if (i >= 0) {
          p0[i] = p1;
       }else {
          i = ~ i;
          KwaiFieldArray tmSize = this.mSize;
          if (i < tmSize) {
             KwaiFieldArray tmData = this.mData;
             if (tmData[i] == KwaiFieldArray.DELETED) {
                this.mFieldNumbers[i] = p0;
                tmData[i] = p1;
                return;
             }
          }
          if (this.mGarbage != null && tmSize >= this.mFieldNumbers.length) {
             this.gc();
             i = ~ this.binarySearch(p0);
          }
          tmSize = this.mSize;
          if (tmSize >= this.mFieldNumbers.length) {
             int i1 = this.idealIntArraySize((tmSize + 1));
             int[] ointArray = new int[i1];
             KwaiFieldData[] kwaiFieldDat = new KwaiFieldData[i1];
             KwaiFieldArray tmFieldNumbe = this.mFieldNumbers;
             System.arraycopy(tmFieldNumbe, 0, ointArray, 0, tmFieldNumbe.length);
             tmFieldNumbe = this.mData;
             System.arraycopy(tmFieldNumbe, 0, kwaiFieldDat, 0, tmFieldNumbe.length);
             this.mFieldNumbers = ointArray;
             this.mData = kwaiFieldDat;
          }
          tmSize = this.mSize;
          if (tmSize - i) {
             int i2 = i + 1;
             System.arraycopy(this.mFieldNumbers, i, this.mFieldNumbers, i2, (tmSize - i));
             System.arraycopy(this.mData, i, this.mData, i2, (this.mSize - i));
          }
          this.mFieldNumbers[i] = p0;
          p0[i] = p1;
          this.mSize = this.mSize + 1;
       }
       return;
    }
    public synchronized void remove(int p0){
       p0 = this.binarySearch(p0);
       if (p0 >= 0) {
          KwaiFieldArray tmData = this.mData;
          KwaiFieldData dELETED = KwaiFieldArray.DELETED;
          if (tmData[p0] != dELETED) {
             tmData[p0] = dELETED;
             this.mGarbage = true;
          }
       }
       return;
    }
    public synchronized int size(){
       if (this.mGarbage != null) {
          this.gc();
       }
       return this.mSize;
    }
}
