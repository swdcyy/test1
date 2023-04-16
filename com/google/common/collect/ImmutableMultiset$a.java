package com.google.common.collect.ImmutableMultiset$a;
import qk.t0;
import com.google.common.collect.ImmutableMultiset;
import java.util.Iterator;
import java.lang.Object;
import com.google.common.collect.k$a;

public class ImmutableMultiset$a extends t0	// class@0017f4
{
    public int b;
    public Object c;
    public final Iterator d;
    public final ImmutableMultiset e;

    public void ImmutableMultiset$a(ImmutableMultiset p0,Iterator p1){
       this.e = p0;
       this.d = p1;
       super();
    }
    public boolean hasNext(){
       boolean b = (this.b > null || this.d.hasNext())? true: false;
       return b;
    }
    public Object next(){
       if (this.b <= null) {
          k$a uoa = this.d.next();
          this.c = uoa.getElement();
          this.b = uoa.getCount();
       }
       this.b = this.b - 1;
       return this.c;
    }
}
