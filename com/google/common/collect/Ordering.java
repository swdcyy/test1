package com.google.common.collect.Ordering;
import java.util.Comparator;
import java.lang.Object;
import com.google.common.collect.AllEqualOrdering;
import java.lang.Iterable;
import com.google.common.collect.CompoundOrdering;
import com.google.common.collect.Lists$OnePlusArrayList;
import java.util.List;
import com.google.common.collect.ExplicitOrdering;
import ok.n;
import com.google.common.collect.ComparatorOrdering;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.UsingToStringOrdering;
import java.util.Collections;
import java.util.Iterator;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Arrays;
import java.lang.String;
import qk.g;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import qk.q0;
import java.math.RoundingMode;
import tk.c$a;
import java.lang.AssertionError;
import java.lang.Integer;
import tk.d;
import java.lang.Math;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.google.common.collect.LexicographicalOrdering;
import com.google.common.collect.NullsFirstOrdering;
import com.google.common.collect.NullsLastOrdering;
import ok.h;
import com.google.common.collect.Maps;
import com.google.common.collect.ByFunctionOrdering;
import com.google.common.collect.ReverseOrdering;
import qk.y;

public abstract class Ordering implements Comparator	// class@001867
{

    public void Ordering(){
       super();
    }
    public static Ordering allEqual(){
       return AllEqualOrdering.INSTANCE;
    }
    public static Ordering compound(Iterable p0){
       return new CompoundOrdering(p0);
    }
    public static Ordering explicit(Object p0,Object[] p1){
       return Ordering.explicit(new Lists$OnePlusArrayList(p0, p1));
    }
    public static Ordering explicit(List p0){
       return new ExplicitOrdering(p0);
    }
    public static Ordering from(Ordering p0){
       n.j(p0);
       return p0;
    }
    public static Ordering from(Comparator p0){
       if (p0 instanceof Ordering) {
       }else {
          ComparatorOrdering uComparatorO = new ComparatorOrdering(p0);
       }
       return p0;
    }
    public static Ordering natural(){
       return NaturalOrdering.INSTANCE;
    }
    public static Ordering usingToString(){
       return UsingToStringOrdering.INSTANCE;
    }
    public int binarySearch(List p0,Object p1){
       return Collections.binarySearch(p0, p1, this);
    }
    public abstract int compare(Object p0,Object p1);
    public Ordering compound(Comparator p0){
       n.j(p0);
       return new CompoundOrdering(this, p0);
    }
    public List greatestOf(Iterable p0,int p1){
       return this.reverse().leastOf(p0, p1);
    }
    public List greatestOf(Iterator p0,int p1){
       return this.reverse().leastOf(p0, p1);
    }
    public ImmutableList immutableSortedCopy(Iterable p0){
       return ImmutableList.sortedCopyOf(this, p0);
    }
    public boolean isOrdered(Iterable p0){
       Iterator iterator = p0.iterator();
       if (iterator.hasNext()) {
          Object obj = iterator.next();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             if (this.compare(obj, obj1) > 0) {
                return false;
             }
             obj = obj1;
          }
       }
       return true;
    }
    public boolean isStrictlyOrdered(Iterable p0){
       Iterator iterator = p0.iterator();
       if (iterator.hasNext()) {
          Object obj = iterator.next();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             if (this.compare(obj, obj1) >= 0) {
                return false;
             }
             obj = obj1;
          }
       }
       return true;
    }
    public List leastOf(Iterable p0,int p1){
       if (p0 instanceof Collection) {
          Collection uCollection = p0;
          if ((long)uCollection.size() - ((long)p1 * 2) <= 0) {
             Object[] objArray = uCollection.toArray();
             Arrays.sort(objArray, this);
             if (objArray.length > p1) {
                objArray = Arrays.copyOf(objArray, p1);
             }
             return Collections.unmodifiableList(Arrays.asList(objArray));
          }
       }
       return this.leastOf(p0.iterator(), p1);
    }
    public List leastOf(Iterator p0,int p1){
       q0 obj;
       int i1;
       int i3;
       n.j(p0);
       g.b(p1, "k");
       if (!p1 || !p0.hasNext()) {
          return Collections.emptyList();
       }
       if (p1 >= 0x3fffffff) {
          ArrayList uArrayList = Lists.d(p0);
          Collections.sort(uArrayList, this);
          if (uArrayList.size() > p1) {
             uArrayList.subList(p1, uArrayList.size()).clear();
          }
          uArrayList.trimToSize();
          return Collections.unmodifiableList(uArrayList);
       }else {
          q0 oq0 = new q0(this, p1);
          while (true) {
             int i = 0;
             if (p0.hasNext()) {
                obj = p0.next();
                q0 a = oq0.a;
                if (a == null) {
                   continue ;
                }else {
                   q0 d = oq0.d;
                   if (d == null) {
                      oq0.c[i] = obj;
                      oq0.e = obj;
                      oq0.d = 1;
                   }else if(d < a){
                      i1 = d + 1;
                      oq0.d = i1;
                      oq0.c[d] = obj;
                      if (oq0.b.compare(obj, oq0.e) > 0) {
                         oq0.e = obj;
                      }
                   }else if(oq0.b.compare(obj, oq0.e) < 0){
                      d = oq0.d;
                      int i2 = d + 1;
                      oq0.d = i2;
                      oq0.c[d] = obj;
                      obj = oq0.a * 2;
                      if (i2 == obj) {
                         obj--;
                         i1 = obj + 0;
                         RoundingMode cEILING = RoundingMode.CEILING;
                         if (i1 > 0) {
                            switch (c$a.a[cEILING.ordinal()]){
                                case 1:
                                  i3 = (i1 > 0)? 1: 0;
                                  i2 = i1 - 1;
                                  i2 = i2 & i1;
                                  i2 = (!i2)? 1: 0;
                                  i3 = i3 & i2;
                                  d.a(i3);
                                case 2:
                                case 3:
                                  i3 = Integer.numberOfLeadingZeros(i1) - 31;
                               label_00d5 :
                                  i3 = i3 * 3;
                                  i1 = 0;
                                  i2 = 0;
                                  while (true) {
                                     if (i < obj) {
                                        int i4 = i + obj;
                                        i4 = i4 + 1;
                                        i4 = i4 >> 1;
                                        q0 c = oq0.c;
                                        object oobject = c[i4];
                                        c[i4] = c[obj];
                                        i4 = i;
                                        int i5 = i4;
                                        while (i4 < obj) {
                                           if (oq0.b.compare(oq0.c[i4], oobject) < 0) {
                                              q0 c1 = oq0.c;
                                              object oobject1 = c1[i5];
                                              c1[i5] = c1[i4];
                                              c1[i4] = oobject1;
                                              i5 = i5 + 1;
                                           }
                                           i4 = i4 + 1;
                                        }
                                        q0 c2 = oq0.c;
                                        c2[obj] = c2[i5];
                                        c2[i5] = oobject;
                                        c2 = oq0.a;
                                        if (i5 > c2) {
                                           i5 = i5 - 1;
                                           obj = i5;
                                        }else if(i5 < c2){
                                           i = i + 1;
                                           i = Math.max(i5, i);
                                           i2 = i5;
                                        }
                                        i1 = i1 + 1;
                                        if (i1 >= i3) {
                                           Arrays.sort(oq0.c, i, obj, oq0.b);
                                        }else {
                                           continue ;
                                        }
                                     }
                                     oq0.d = oq0.a;
                                     oq0.e = oq0.c[i2];
                                     i2 = i2 + 1;
                                     while (i2 < oq0.a) {
                                        if (oq0.b.compare(oq0.c[i2], oq0.e) > 0) {
                                           oq0.e = oq0.c[i2];
                                        }
                                        i2 = i2 + 1;
                                     }
                                  }
                                  break;
                                case 4:
                                case 5:
                                  i1 = i1 - 1;
                                  i3 = Integer.numberOfLeadingZeros(i1) - 32;
                                  goto label_00d5 ;
                                  break;
                                case 6:
                                case 8:
                                case 7:
                                  i3 = Integer.numberOfLeadingZeros(i1);
                                  i2 = -1257966797 >> i3;
                                  i3 = i3 - 31;
                                  i2 = i2 - i1;
                                  i1 = ~ i2;
                                  i1 = ~ i1;
                                  i1 = i1 >> 31;
                                  i3 = i3 + i1;
                                  goto label_00d5 ;
                                  break;
                            }
                            throw new AssertionError();
                         }else {
                            throw new IllegalArgumentException("x"+" \("+i1+"\) must be > 0");
                         }
                      }
                   }
                }
             }else {
                Arrays.sort(oq0.c, i, oq0.d, oq0.b);
                obj = oq0.a;
                if (oq0.d > obj) {
                   q0 c3 = oq0.c;
                   Arrays.fill(c3, obj, c3.length, null);
                   c3 = oq0.a;
                   oq0.d = c3;
                   c3--;
                   oq0.e = oq0.c[c3];
                   break ;
                }
                break ;
             }
          }
          return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(oq0.c, oq0.d)));
       }
    }
    public Ordering lexicographical(){
       return new LexicographicalOrdering(this);
    }
    public Object max(Iterable p0){
       return this.max(p0.iterator());
    }
    public Object max(Object p0,Object p1){
       if (this.compare(p0, p1) >= 0) {
       }else {
          p0 = p1;
       }
       return p0;
    }
    public Object max(Object p0,Object p1,Object p2,Object[] p3){
       p0 = this.max(this.max(p0, p1), p2);
       int len = p3.length;
       for (int i = 0; i < len; i++) {
          p0 = this.max(p0, p3[i]);
       }
       return p0;
    }
    public Object max(Iterator p0){
       Object obj = p0.next();
       while (p0.hasNext()) {
          obj = this.max(obj, p0.next());
       }
       return obj;
    }
    public Object min(Iterable p0){
       return this.min(p0.iterator());
    }
    public Object min(Object p0,Object p1){
       if (this.compare(p0, p1) <= 0) {
       }else {
          p0 = p1;
       }
       return p0;
    }
    public Object min(Object p0,Object p1,Object p2,Object[] p3){
       p0 = this.min(this.min(p0, p1), p2);
       int len = p3.length;
       for (int i = 0; i < len; i++) {
          p0 = this.min(p0, p3[i]);
       }
       return p0;
    }
    public Object min(Iterator p0){
       Object obj = p0.next();
       while (p0.hasNext()) {
          obj = this.min(obj, p0.next());
       }
       return obj;
    }
    public Ordering nullsFirst(){
       return new NullsFirstOrdering(this);
    }
    public Ordering nullsLast(){
       return new NullsLastOrdering(this);
    }
    public Ordering onKeys(){
       return this.onResultOf(Maps.m());
    }
    public Ordering onResultOf(h p0){
       return new ByFunctionOrdering(p0, this);
    }
    public Ordering reverse(){
       return new ReverseOrdering(this);
    }
    public List sortedCopy(Iterable p0){
       Object[] objArray = y.u(p0);
       Arrays.sort(objArray, this);
       return Lists.c(Arrays.asList(objArray));
    }
}
