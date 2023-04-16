package com.google.common.collect.ImmutableCollection$b;
import java.lang.Object;
import java.lang.Integer;
import java.lang.AssertionError;
import java.lang.Iterable;
import java.util.Iterator;
import com.google.common.collect.ImmutableCollection;

public abstract class ImmutableCollection$b	// class@0017d8
{

    public void ImmutableCollection$b(){
       super();
    }
    public static int e(int p0,int p1){
       if (p1 < 0) {
          throw new AssertionError("cannot store more than MAX_VALUE elements");
       }
       p0 = (p0 + (p0 >> 1)) + 1;
       if (p0 < p1) {
          p1--;
          p0 = Integer.highestOneBit(p1) << 1;
       }
       if (p0 < 0) {
          p0 = Integer.MAX_VALUE;
       }
       return p0;
    }
    public abstract ImmutableCollection$b a(Object p0);
    public ImmutableCollection$b b(Iterable p0){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.a(iterator.next());
       }
       return this;
    }
    public ImmutableCollection$b c(Iterator p0){
       while (p0.hasNext()) {
          this.a(p0.next());
       }
       return this;
    }
    public abstract ImmutableCollection d();
}
