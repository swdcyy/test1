package com.google.common.collect.LexicographicalOrdering;
import java.io.Serializable;
import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class LexicographicalOrdering extends Ordering implements Serializable	// class@001815
{
    public final Comparator elementOrder;
    public static final long serialVersionUID;

    public void LexicographicalOrdering(Comparator p0){
       super();
       this.elementOrder = p0;
    }
    public int compare(Iterable p0,Iterable p1){
       Iterator iterator = p0.iterator();
       Iterator iterator1 = p1.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (!iterator1.hasNext()) {
                break ;
             }else {
                int i = this.elementOrder.compare(iterator.next(), iterator1.next());
                if (i) {
                   return i;
                }
                continue ;
             }
          }else if(iterator1.hasNext()){
             return -1;
          }else {
             return 0;
          }
       }
       return 1;
    }
    public int compare(Object p0,Object p1){
       return this.compare(p0, p1);
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof LexicographicalOrdering) {
          return this.elementOrder.equals(p0.elementOrder);
       }
       return false;
    }
    public int hashCode(){
       return (this.elementOrder.hashCode() ^ 0x7bb78cf5);
    }
    public String toString(){
       return this.elementOrder+".lexicographical\(\)";
    }
}
