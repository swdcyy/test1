package androidx.collection.CircularArray;
import java.lang.Object;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.System;
import java.lang.RuntimeException;
import java.lang.ArrayIndexOutOfBoundsException;

public final class CircularArray	// class@000657
{
    public int mCapacityBitmask;
    public Object[] mElements;
    public int mHead;
    public int mTail;

    public void CircularArray(){
       super(8);
    }
    public void CircularArray(int p0){
       super();
       int i = 1;
       if (p0 < i) {
          throw new IllegalArgumentException("capacity must be >= 1");
       }
       if (p0 > 0x40000000) {
          throw new IllegalArgumentException("capacity must be <= 2^30");
       }
       if (Integer.bitCount(p0) != i) {
          p0--;
          p0 = Integer.highestOneBit(p0) << i;
       }
       this.mCapacityBitmask = p0 - 1;
       Object[] objArray = new Object[p0];
       this.mElements = objArray;
       return;
    }
    public void addFirst(Object p0){
       int i = (this.mHead - 1) & this.mCapacityBitmask;
       this.mHead = i;
       this.mElements[i] = p0;
       if (i == this.mTail) {
          this.doubleCapacity();
       }
       return;
    }
    public void addLast(Object p0){
       CircularArray tmTail = this.mTail;
       this.mElements[tmTail] = p0;
       int i = this.mCapacityBitmask & (tmTail + 1);
       this.mTail = i;
       if (i == this.mHead) {
          this.doubleCapacity();
       }
       return;
    }
    public void clear(){
       this.removeFromStart(this.size());
    }
    public final void doubleCapacity(){
       CircularArray tmElements = this.mElements;
       int len = tmElements.length;
       CircularArray tmHead = this.mHead;
       int i = len - tmHead;
       int i1 = len << 1;
       if (i1 < 0) {
          throw new RuntimeException("Max array capacity exceeded");
       }
       Object[] objArray = new Object[i1];
       System.arraycopy(tmElements, tmHead, objArray, 0, i);
       System.arraycopy(this.mElements, 0, objArray, i, this.mHead);
       this.mElements = objArray;
       this.mHead = 0;
       this.mTail = len;
       this.mCapacityBitmask = i1 - 1;
       return;
    }
    public Object get(int p0){
       if (p0 >= 0 && p0 < this.size()) {
          return this.mElements[(this.mCapacityBitmask & (this.mHead + p0))];
       }
       throw new ArrayIndexOutOfBoundsException();
    }
    public Object getFirst(){
       CircularArray tmHead = this.mHead;
       if (tmHead != this.mTail) {
          return this.mElements[tmHead];
       }
       throw new ArrayIndexOutOfBoundsException();
    }
    public Object getLast(){
       CircularArray tmTail = this.mTail;
       if (this.mHead != tmTail) {
          return this.mElements[((tmTail - 1) & this.mCapacityBitmask)];
       }
       throw new ArrayIndexOutOfBoundsException();
    }
    public boolean isEmpty(){
       boolean b = (this.mHead == this.mTail)? true: false;
       return b;
    }
    public Object popFirst(){
       CircularArray tmHead = this.mHead;
       if (tmHead == this.mTail) {
          throw new ArrayIndexOutOfBoundsException();
       }
       CircularArray tmElements = this.mElements;
       object oobject = tmElements[tmHead];
       tmElements[tmHead] = null;
       this.mHead = (tmHead + 1) & this.mCapacityBitmask;
       return oobject;
    }
    public Object popLast(){
       CircularArray tmTail = this.mTail;
       if (this.mHead == tmTail) {
          throw new ArrayIndexOutOfBoundsException();
       }
       int i = this.mCapacityBitmask & (tmTail - 1);
       tmTail = this.mElements;
       object oobject = tmTail[i];
       tmTail[i] = null;
       this.mTail = i;
       return oobject;
    }
    public void removeFromEnd(int p0){
       if (p0 <= 0) {
          return;
       }
       if (p0 > this.size()) {
          throw new ArrayIndexOutOfBoundsException();
       }
       int i = 0;
       CircularArray tmTail = this.mTail;
       if (p0 < tmTail) {
          i = tmTail - p0;
       }
       int i1 = i;
       CircularArray tmTail1 = this.mTail;
       while (i1 < tmTail1) {
          this.mElements[i1] = null;
          i1 = i1 + 1;
       }
       i = tmTail1 - i;
       p0 = p0 - i;
       this.mTail = tmTail1 - i;
       if (p0 > 0) {
          i = this.mElements.length;
          this.mTail = i;
          i = i - p0;
          for (p0 = i; p0 < this.mTail; p0++) {
             this.mElements[p0] = null;
          }
          this.mTail = i;
       }
       return;
    }
    public void removeFromStart(int p0){
       if (p0 <= 0) {
          return;
       }
       if (p0 > this.size()) {
          throw new ArrayIndexOutOfBoundsException();
       }
       int len = this.mElements.length;
       CircularArray tmHead = this.mHead;
       int i = len - tmHead;
       if (p0 < i) {
          len = tmHead + p0;
       }
       while (tmHead < len) {
          this.mElements[tmHead] = null;
          tmHead = tmHead + 1;
       }
       tmHead = this.mHead;
       len = len - tmHead;
       p0 = p0 - len;
       int i1 = tmHead + len;
       this.mHead = this.mCapacityBitmask & i1;
       if (p0 > 0) {
          for (len = 0; len < p0; len = len + 1) {
             this.mElements[len] = null;
          }
          this.mHead = p0;
       }
       return;
    }
    public int size(){
       return ((this.mTail - this.mHead) & this.mCapacityBitmask);
    }
}
