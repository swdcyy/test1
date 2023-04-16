package com.google.common.primitives.Ints$IntArrayAsList;
import java.util.RandomAccess;
import java.io.Serializable;
import java.util.AbstractList;
import java.lang.Object;
import java.lang.Integer;
import com.google.common.primitives.Ints;
import ok.n;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;

public class Ints$IntArrayAsList extends AbstractList implements RandomAccess, Serializable	// class@0018ec
{
    public final int[] array;
    public final int end;
    public final int start;
    public static final long serialVersionUID;

    public void Ints$IntArrayAsList(int[] p0){
       super(p0, 0, p0.length);
    }
    public void Ints$IntArrayAsList(int[] p0,int p1,int p2){
       super();
       this.array = p0;
       this.start = p1;
       this.end = p2;
    }
    public boolean contains(Object p0){
       boolean b = (p0 instanceof Integer && Ints.a(this.array, p0.intValue(), this.start, this.end) != -1)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof Ints$IntArrayAsList) {
          return super.equals(p0);
       }
       int i = this.size();
       if (p0.size() != i) {
          return false;
       }
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return true;
          }
          int i2 = this.start + i1;
          int i3 = p0.start + i1;
          if (this.array[i2] != p0.array[i3]) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return false;
    }
    public Integer get(int p0){
       n.i(p0, this.size());
       return Integer.valueOf(this.array[(this.start + p0)]);
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public int hashCode(){
       int i = 1;
       for (Ints$IntArrayAsList tstart = this.start; tstart < this.end; tstart = tstart + 1) {
          i = i * 31;
          i = i + this.array[tstart];
       }
       return i;
    }
    public int indexOf(Object p0){
       if (p0 instanceof Integer) {
          int i = Ints.a(this.array, p0.intValue(), this.start, this.end);
          if (i >= 0) {
             return (i - this.start);
          }
       }
       return -1;
    }
    public boolean isEmpty(){
       return false;
    }
    public int lastIndexOf(Object p0){
       if (p0 instanceof Integer) {
          Ints$IntArrayAsList tarray = this.array;
          int i = p0.intValue();
          Ints$IntArrayAsList tstart = this.start;
          int i1 = this.end - 1;
          while (true) {
             if (i1 >= tstart) {
                if (tarray[i1] == i) {
                label_001d :
                   if (i1 >= 0) {
                      return (i1 - this.start);
                   }
                }else {
                   i1 = i1 - 1;
                }
             }else {
                i1 = -1;
                goto label_001d ;
             }
          }
       }
       return -1;
    }
    public Integer set(int p0,Integer p1){
       n.i(p0, this.size());
       Ints$IntArrayAsList tarray = this.array;
       Ints$IntArrayAsList tstart = this.start;
       n.j(p1);
       tarray[(tstart + p0)] = p1.intValue();
       return Integer.valueOf(tarray[(tstart + p0)]);
    }
    public Object set(int p0,Object p1){
       return this.set(p0, p1);
    }
    public int size(){
       return (this.end - this.start);
    }
    public List subList(int p0,int p1){
       n.m(p0, p1, this.size());
       if (p0 == p1) {
          return Collections.emptyList();
       }
       Ints$IntArrayAsList tstart = this.start;
       p0 = p0 + tstart;
       return new Ints$IntArrayAsList(this.array, p0, (tstart + p1));
    }
    public int[] toIntArray(){
       return Arrays.copyOfRange(this.array, this.start, this.end);
    }
    public String toString(){
       StringBuilder str = new StringBuilder((this.size() * 5))+'['+this.array[this.start];
       Ints$IntArrayAsList tstart = this.start;
       int i = tstart + 1;
       while (i < this.end) {
          str = str+", "+this.array[i];
       }
       return str+']';
    }
}
