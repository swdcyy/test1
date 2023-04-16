package com.google.common.collect.ImmutableTable$a;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableTable;
import java.util.List;
import java.util.Comparator;
import com.google.common.collect.RegularImmutableTable;
import com.google.common.collect.SingletonImmutableTable;
import java.lang.Iterable;
import qk.y;
import com.google.common.collect.s$a;

public final class ImmutableTable$a	// class@00180b
{
    public final List a;
    public Comparator b;
    public Comparator c;

    public void ImmutableTable$a(){
       super();
       this.a = Lists.b();
    }
    public ImmutableTable a(){
       int i = this.a.size();
       if (!i) {
          return ImmutableTable.of();
       }
       if (i != 1) {
          return RegularImmutableTable.forCells(this.a, this.b, this.c);
       }
       return new SingletonImmutableTable(y.n(this.a));
    }
    public ImmutableTable$a b(Object p0,Object p1,Object p2){
       this.a.add(ImmutableTable.cellOf(p0, p1, p2));
       return this;
    }
}
