package com.google.common.collect.ImmutableSetMultimap$a;
import com.google.common.collect.ImmutableMultimap$c;
import java.util.Collection;
import com.google.common.collect.CompactHashSet;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.ImmutableSetMultimap;
import java.util.Set;
import java.util.Map;
import java.util.Comparator;
import com.google.common.collect.Ordering;
import java.lang.Iterable;
import com.google.common.collect.ImmutableList;

public final class ImmutableSetMultimap$a extends ImmutableMultimap$c	// class@0017fd
{

    public void ImmutableSetMultimap$a(){
       super();
    }
    public Collection a(){
       return CompactHashSet.create();
    }
    public ImmutableMultimap$c b(Object p0,Object p1){
       this.e(p0, p1);
       return this;
    }
    public ImmutableMultimap$c c(Map$Entry p0){
       super.c(p0);
       return this;
    }
    public ImmutableSetMultimap d(){
       Set set = this.a.entrySet();
       ImmutableMultimap$c tb = this.b;
       if (tb != null) {
          set = Ordering.from(tb).onKeys().immutableSortedCopy(set);
       }
       return ImmutableSetMultimap.fromMapEntries(set, this.c);
    }
    public ImmutableSetMultimap$a e(Object p0,Object p1){
       super.b(p0, p1);
       return this;
    }
}
