package com.google.common.collect.ImmutableCollection$a;
import com.google.common.collect.ImmutableCollection$b;
import java.lang.String;
import qk.g;
import java.lang.Object;
import java.lang.Iterable;
import java.util.Collection;
import com.google.common.collect.ImmutableCollection;
import ok.n;
import java.util.Arrays;

public abstract class ImmutableCollection$a extends ImmutableCollection$b	// class@0017d7
{
    public Object[] a;
    public int b;
    public boolean c;

    public void ImmutableCollection$a(int p0){
       super();
       g.b(p0, "initialCapacity");
       Object[] objArray = new Object[p0];
       this.a = objArray;
       this.b = 0;
    }
    public ImmutableCollection$b a(Object p0){
       return this.f(p0);
    }
    public ImmutableCollection$b b(Iterable p0){
       if (p0 instanceof Collection) {
          Collection uCollection = p0;
          this.g((this.b + uCollection.size()));
          if (uCollection instanceof ImmutableCollection) {
             this.b = uCollection.copyIntoArray(this.a, this.b);
             return this;
          }
       }
       super.b(p0);
       return this;
    }
    public ImmutableCollection$a f(Object p0){
       n.j(p0);
       this.g((this.b + 1));
       ImmutableCollection$a tb = this.b;
       this.b = tb + 1;
       this.a[tb] = p0;
       return this;
    }
    public final void g(int p0){
       ImmutableCollection$a ta = this.a;
       if (ta.length < p0) {
          this.a = Arrays.copyOf(ta, ImmutableCollection$b.e(ta.length, p0));
          this.c = false;
       }else if(this.c != null){
          this.a = ta.clone();
          this.c = false;
       }
       return;
    }
}
