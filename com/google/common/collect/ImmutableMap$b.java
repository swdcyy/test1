package com.google.common.collect.ImmutableMap$b;
import java.lang.Object;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.ImmutableCollection$b;
import java.util.Arrays;
import qk.g;
import java.util.Map$Entry;
import java.lang.Iterable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.AbstractMap$SimpleImmutableEntry;
import java.util.Comparator;
import com.google.common.collect.Ordering;
import ok.h;
import com.google.common.collect.Maps;

public class ImmutableMap$b	// class@0017e4
{
    public Comparator a;
    public Object[] b;
    public int c;
    public boolean d;

    public void ImmutableMap$b(){
       super(4);
    }
    public void ImmutableMap$b(int p0){
       super();
       Object[] objArray = new Object[(p0 * 2)];
       this.b = objArray;
       this.c = 0;
       this.d = false;
    }
    public ImmutableMap a(){
       this.g();
       this.d = true;
       return RegularImmutableMap.create(this.c, this.b);
    }
    public final void b(int p0){
       p0 = p0 * 2;
       ImmutableMap$b tb = this.b;
       if (p0 > tb.length) {
          this.b = Arrays.copyOf(tb, ImmutableCollection$b.e(tb.length, p0));
          this.d = false;
       }
       return;
    }
    public ImmutableMap$b c(Object p0,Object p1){
       this.b((this.c + 1));
       g.a(p0, p1);
       ImmutableMap$b tb = this.b;
       ImmutableMap$b tc = this.c;
       tb[(tc * 2)] = p0;
       tb[((tc * 2) + 1)] = p1;
       this.c = tc + 1;
       return this;
    }
    public ImmutableMap$b d(Map$Entry p0){
       return this.c(p0.getKey(), p0.getValue());
    }
    public ImmutableMap$b e(Iterable p0){
       if (p0 instanceof Collection) {
          this.b((this.c + p0.size()));
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.d(iterator.next());
       }
       return this;
    }
    public ImmutableMap$b f(Map p0){
       return this.e(p0.entrySet());
    }
    public void g(){
       if (this.a != null) {
          if (this.d != null) {
             this.b = Arrays.copyOf(this.b, (this.c * 2));
          }
          Map$Entry[] uEntryArray = new Map$Entry[this.c];
          int i = 0;
          int i1 = 0;
          ImmutableMap$b tc = this.c;
          while (i1 < tc) {
             ImmutableMap$b tb = this.b;
             int i2 = i1 * 2;
             i2 = i2 + 1;
             uEntryArray[i1] = new AbstractMap$SimpleImmutableEntry(tb[i2], tb[i2]);
             i1 = i1 + 1;
          }
          Arrays.sort(uEntryArray, i, tc, Ordering.from(this.a).onResultOf(Maps.D()));
          for (; i < this.c; i = i + 1) {
             int i3 = i * 2;
             this.b[i3] = uEntryArray[i].getKey();
             i3 = i3 + 1;
             this.b[i3] = uEntryArray[i].getValue();
          }
       }
       return;
    }
}
