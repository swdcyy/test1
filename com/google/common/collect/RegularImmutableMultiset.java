package com.google.common.collect.RegularImmutableMultiset;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.l;
import com.google.common.primitives.Ints;
import java.lang.Object;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import com.google.common.collect.k$a;

public class RegularImmutableMultiset extends ImmutableMultiset	// class@001874
{
    public final l contents;
    public final int e;
    public ImmutableSet f;
    public static final RegularImmutableMultiset EMPTY;

    static {
       RegularImmutableMultiset.EMPTY = new RegularImmutableMultiset(new l());
    }
    public void RegularImmutableMultiset(l p0){
       super();
       this.contents = p0;
       long l = 0;
       for (int i = 0; i < p0.t(); i = i + 1) {
          l = l + (long)p0.h(i);
       }
       this.e = Ints.d(l);
       return;
    }
    public int count(Object p0){
       return this.contents.c(p0);
    }
    public ImmutableSet elementSet(){
       return null;
    }
    public Set elementSet(){
       return this.elementSet();
    }
    public k$a getEntry(int p0){
       return this.contents.d(p0);
    }
    public boolean isPartialView(){
       return false;
    }
    public int size(){
       return this.e;
    }
}
