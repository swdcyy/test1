package com.google.common.collect.CompactLinkedHashMap;
import com.google.common.collect.CompactHashMap;
import java.util.Arrays;
import java.lang.Object;

public class CompactLinkedHashMap extends CompactHashMap	// class@0017b4
{
    public final boolean accessOrder;
    public int g;
    public int h;
    public long[] links;

    public void CompactLinkedHashMap(){
       super(3);
    }
    public void CompactLinkedHashMap(int p0){
       super(p0, 0x3f800000, false);
    }
    public void CompactLinkedHashMap(int p0,float p1,boolean p2){
       super(p0, p1);
       this.accessOrder = p2;
    }
    public static CompactLinkedHashMap create(){
       return new CompactLinkedHashMap();
    }
    public static CompactLinkedHashMap createWithExpectedSize(int p0){
       return new CompactLinkedHashMap(p0);
    }
    public void accessEntry(int p0){
       if (this.accessOrder != null) {
          this.k(this.j(p0), this.getSuccessor(p0));
          this.k(this.h, p0);
          this.k(p0, -2);
          this.modCount = this.modCount + 1;
       }
       return;
    }
    public int adjustAfterRemove(int p0,int p1){
       if (p0 >= this.size()) {
          p0 = p1;
       }
       return p0;
    }
    public void clear(){
       super.clear();
       this.g = -2;
       this.h = -2;
    }
    public int firstEntryIndex(){
       return this.g;
    }
    public int getSuccessor(int p0){
       return (int)this.links[p0];
    }
    public void init(int p0,float p1){
       super.init(p0, p1);
       this.g = -2;
       this.h = -2;
       long[] olongArray = new long[p0];
       this.links = olongArray;
       Arrays.fill(olongArray, -1);
    }
    public void insertEntry(int p0,Object p1,Object p2,int p3){
       super.insertEntry(p0, p1, p2, p3);
       this.k(this.h, p0);
       this.k(p0, -2);
    }
    public final int j(int p0){
       return (int)(this.links[p0] >> 32);
    }
    public final void k(int p0,int p1){
       long l = 0xffffffff;
       int i = -2;
       if (p0 == i) {
          this.g = p1;
       }else {
          CompactLinkedHashMap tlinks1 = this.links;
          tlinks1[p0] = (tlinks1[p0] & 0xffffffff00000000) | ((long)p1 & l);
       }
       if (p1 == i) {
          this.h = p0;
       }else {
          CompactLinkedHashMap tlinks = this.links;
          tlinks[p1] = (l & tlinks[p1]) | ((long)p0 << 32);
       }
       return;
    }
    public void moveLastEntry(int p0){
       int i = this.size() - 1;
       this.k(this.j(p0), this.getSuccessor(p0));
       if (p0 < i) {
          this.k(this.j(i), p0);
          this.k(p0, this.getSuccessor(i));
       }
       super.moveLastEntry(p0);
       return;
    }
    public void resizeEntries(int p0){
       super.resizeEntries(p0);
       this.links = Arrays.copyOf(this.links, p0);
    }
}
