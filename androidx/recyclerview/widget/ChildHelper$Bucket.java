package androidx.recyclerview.widget.ChildHelper$Bucket;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.StringBuilder;

public class ChildHelper$Bucket	// class@000866
{
    public long mData;
    public ChildHelper$Bucket mNext;

    public void ChildHelper$Bucket(){
       super();
       this.mData = 0;
    }
    public void clear(int p0){
       int i = 64;
       if (p0 >= i) {
          ChildHelper$Bucket tmNext = this.mNext;
          if (tmNext != null) {
             tmNext.clear((p0 - i));
          }
       }else {
          this.mData = this.mData & (~ (1 << p0));
       }
       return;
    }
    public int countOnesBefore(int p0){
       ChildHelper$Bucket tmNext = this.mNext;
       if (tmNext == null) {
          if (p0 >= 64) {
             return Long.bitCount(this.mData);
          }
          return Long.bitCount((this.mData & ((1 << p0) - 1)));
       }else if(p0 < 64){
          return Long.bitCount((this.mData & ((1 << p0) - 1)));
       }else {
          return (tmNext.countOnesBefore((p0 - 64)) + Long.bitCount(this.mData));
       }
    }
    public final void ensureNext(){
       if (this.mNext == null) {
          this.mNext = new ChildHelper$Bucket();
       }
       return;
    }
    public boolean get(int p0){
       boolean b;
       int i = 64;
       if (p0 >= i) {
          this.ensureNext();
          return this.mNext.get((p0 - i));
       }else if(this.mData & (1 << p0)){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public void insert(int p0,boolean p1){
       int i = 64;
       if (p0 >= i) {
          this.ensureNext();
          this.mNext.insert((p0 - i), p1);
       }else {
          ChildHelper$Bucket tmData = this.mData;
          boolean b = (Long.MIN_VALUE & tmData)? true: false;
          long l = (1 << p0) - 1;
          long l1 = tmData & l;
          this.mData = ((tmData & (~ l)) << 1) | l1;
          if (p1) {
             this.set(p0);
          }else {
             this.clear(p0);
          }
          if (b || this.mNext != null) {
             this.ensureNext();
             this.mNext.insert(0, b);
          }
       }
       return;
    }
    public boolean remove(int p0){
       int i = 64;
       if (p0 >= i) {
          this.ensureNext();
          return this.mNext.remove((p0 - i));
       }else {
          long l = 1;
          long l1 = l << p0;
          ChildHelper$Bucket tmData = this.mData;
          p0 = 1;
          boolean b = (tmData & l1)? true: false;
          long l2 = tmData & (~ l1);
          this.mData = l2;
          l1 = l1 - l;
          l = l2 & l1;
          this.mData = l | Long.rotateRight(((~ l1) & l2), p0);
          ChildHelper$Bucket tmNext = this.mNext;
          if (tmNext != null) {
             if (tmNext.get(0)) {
                this.set(63);
             }
             this.mNext.remove(0);
          }
          return b;
       }
    }
    public void reset(){
       this.mData = 0;
       ChildHelper$Bucket tmNext = this.mNext;
       if (tmNext != null) {
          tmNext.reset();
       }
       return;
    }
    public void set(int p0){
       int i = 64;
       if (p0 >= i) {
          this.ensureNext();
          this.mNext.set((p0 - i));
       }else {
          this.mData = this.mData | (1 << p0);
       }
       return;
    }
    public String toString(){
       String str = (this.mNext == null)? Long.toBinaryString(this.mData): this.mNext.toString()+"xx"+Long.toBinaryString(this.mData);
       return str;
    }
}
