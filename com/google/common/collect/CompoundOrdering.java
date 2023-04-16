package com.google.common.collect.CompoundOrdering;
import java.io.Serializable;
import com.google.common.collect.Ordering;
import java.lang.Iterable;
import java.util.Comparator;
import java.lang.Object;
import qk.y;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;

public final class CompoundOrdering extends Ordering implements Serializable	// class@0017b6
{
    public final Comparator[] comparators;
    public static final long serialVersionUID;

    public void CompoundOrdering(Iterable p0){
       super();
       Comparator[] uComparatorA = new Comparator[0];
       this.comparators = y.w(p0, uComparatorA);
    }
    public void CompoundOrdering(Comparator p0,Comparator p1){
       super();
       Comparator[] uComparatorA = new Comparator[]{p0,p1};
       this.comparators = uComparatorA;
    }
    public int compare(Object p0,Object p1){
       int i1;
       int i = 0;
       while (true) {
          CompoundOrdering tcomparators = this.comparators;
          if (i >= tcomparators.length) {
             return 0;
          }
          i1 = tcomparators[i].compare(p0, p1);
          if (i1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i1;
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof CompoundOrdering) {
          return Arrays.equals(this.comparators, p0.comparators);
       }
       return false;
    }
    public int hashCode(){
       return Arrays.hashCode(this.comparators);
    }
    public String toString(){
       return "Ordering.compound\("+Arrays.toString(this.comparators)+"\)";
    }
}
