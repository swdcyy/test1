package com.google.common.collect.ImmutableSortedMap$b;
import com.google.common.collect.ImmutableMap$b;
import java.util.Comparator;
import java.lang.Object;
import ok.n;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.RegularImmutableSortedSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableCollection$b;
import qk.g;
import java.util.Map$Entry;
import java.lang.Iterable;
import java.util.Map;

public class ImmutableSortedMap$b extends ImmutableMap$b	// class@001804
{
    public Object[] e;
    public Object[] f;
    public final Comparator g;

    public void ImmutableSortedMap$b(Comparator p0){
       super();
       n.j(p0);
       this.g = p0;
       Object[] objArray = new Object[4];
       this.e = objArray;
       Object[] objArray1 = new Object[4];
       this.f = objArray1;
    }
    public ImmutableMap a(){
       ImmutableSortedMap immutableSor;
       ImmutableMap$b tc = this.c;
       if (tc != null) {
          int i = 0;
          if (tc != 1) {
             Object[] objArray = Arrays.copyOf(this.e, tc);
             Arrays.sort(objArray, this.g);
             Object[] objArray1 = new Object[this.c];
             while (true) {
                if (i < this.c) {
                   if (i > 0) {
                      int i1 = i - 1;
                      if (!this.g.compare(objArray[i1], objArray[i])) {
                         throw new IllegalArgumentException("keys required to be distinct but compared as equal: "+objArray[i1]+" and "+objArray[i]);
                      }
                   }
                   objArray1[Arrays.binarySearch(objArray, this.e[i], this.g)] = this.f[i];
                   i = i + 1;
                }else {
                   immutableSor = new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.asImmutableList(objArray), this.g), ImmutableList.asImmutableList(objArray1));
                   break ;
                }
             }
          }else {
             immutableSor = ImmutableSortedMap.of(this.g, this.e[i], this.f[i]);
          }
       }else {
          immutableSor = ImmutableSortedMap.emptyMap(this.g);
       }
       return immutableSor;
    }
    public ImmutableMap$b c(Object p0,Object p1){
       int i = this.c + 1;
       ImmutableSortedMap$b te = this.e;
       if (i > te.length) {
          i = ImmutableCollection$b.e(te.length, i);
          this.e = Arrays.copyOf(this.e, i);
          this.f = Arrays.copyOf(this.f, i);
       }
       g.a(p0, p1);
       ImmutableMap$b tc = this.c;
       this.e[tc] = p0;
       p0[tc] = p1;
       this.c = tc + 1;
       return this;
    }
    public ImmutableMap$b d(Map$Entry p0){
       super.d(p0);
       return this;
    }
    public ImmutableMap$b e(Iterable p0){
       super.e(p0);
       return this;
    }
    public ImmutableMap$b f(Map p0){
       super.f(p0);
       return this;
    }
}
