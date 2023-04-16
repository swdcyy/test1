package androidx.collection.CircularIntArray;
import java.lang.Object;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.System;
import java.lang.RuntimeException;
import java.lang.ArrayIndexOutOfBoundsException;

public final class CircularIntArray	// class@000658
{
    public int mCapacityBitmask;
    public int[] mElements;
    public int mHead;
    public int mTail;

    public void CircularIntArray(){
       super(8);
    }
    public void CircularIntArray(int p0){
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
       int[] ointArray = new int[p0];
       this.mElements = ointArray;
       return;
    }
    public void addFirst(int p0){
       int i = (this.mHead - 1) & this.mCapacityBitmask;
       this.mHead = i;
       this.mElements[i] = p0;
       if (i == this.mTail) {
          this.doubleCapacity();
       }
       return;
    }
    public void addLast(int p0){
       CircularIntArray tmTail = this.mTail;
       this.mElements[tmTail] = p0;
       p0 = this.mCapacityBitmask & (tmTail + 1);
       this.mTail = p0;
       if (p0 == this.mHead) {
          this.doubleCapacity();
       }
       return;
    }
    public void clear(){
       this.mTail = this.mHead;
    }
    public final void doubleCapacity(){
       CircularIntArray tmElements = this.mElements;
       int len = tmElements.length;
       CircularIntArray tmHead = this.mHead;
       int i = len - tmHead;
       int i1 = len << 1;
       if (i1 < 0) {
          throw new RuntimeException("Max array capacity exceeded");
       }
       int[] ointArray = new int[i1];
       System.arraycopy(tmElements, tmHead, ointArray, 0, i);
       System.arraycopy(this.mElements, 0, ointArray, i, this.mHead);
       this.mElements = ointArray;
       this.mHead = 0;
       this.mTail = len;
       this.mCapacityBitmask = i1 - 1;
       return;
    }
    public int get(int p0){
       if (p0 >= 0 && p0 < this.size()) {
          return this.mElements[(this.mCapacityBitmask & (this.mHead + p0))];
       }
       throw new ArrayIndexOutOfBoundsException();
    }
    public int getFirst(){
       CircularIntArray tmHead = this.mHead;
       if (tmHead != this.mTail) {
          return this.mElements[tmHead];
       }
       throw new ArrayIndexOutOfBoundsException();
    }
    public int getLast(){
       CircularIntArray tmTail = this.mTail;
       if (this.mHead != tmTail) {
          return this.mElements[((tmTail - 1) & this.mCapacityBitmask)];
       }
       throw new ArrayIndexOutOfBoundsException();
    }
    public boolean isEmpty(){
       boolean b = (this.mHead == this.mTail)? true: false;
       return b;
    }
    public int popFirst(){
       CircularIntArray tmHead = this.mHead;
       if (tmHead == this.mTail) {
          throw new ArrayIndexOutOfBoundsException();
       }
       this.mHead = (tmHead + 1) & this.mCapacityBitmask;
       return this.mElements[tmHead];
    }
    public int popLast(){
       CircularIntArray tmTail = this.mTail;
       if (this.mHead == tmTail) {
          throw new ArrayIndexOutOfBoundsException();
       }
       int i = this.mCapacityBitmask & (tmTail - 1);
       this.mTail = i;
       return this.mElements[i];
    }
    public void removeFromEnd(int p0){
       if (p0 <= 0) {
          return;
       }
       if (p0 > this.size()) {
          throw new ArrayIndexOutOfBoundsException();
       }
       this.mTail = this.mCapacityBitmask & (this.mTail - p0);
       return;
    }
    public void removeFromStart(int p0){
       if (p0 <= 0) {
          return;
       }
       if (p0 > this.size()) {
          throw new ArrayIndexOutOfBoundsException();
       }
       this.mHead = this.mCapacityBitmask & (this.mHead + p0);
       return;
    }
    public int size(){
       return ((this.mTail - this.mHead) & this.mCapacityBitmask);
    }
}
