package com.google.common.collect.ImmutableMultiset$b;
import com.google.common.collect.ImmutableCollection$b;
import com.google.common.collect.l;
import java.lang.Object;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMultiset;
import ok.n;
import com.google.common.collect.RegularImmutableMultiset;

public class ImmutableMultiset$b extends ImmutableCollection$b	// class@0017f5
{
    public l a;
    public boolean b;
    public boolean c;

    public void ImmutableMultiset$b(){
       super(4);
    }
    public void ImmutableMultiset$b(int p0){
       super();
       this.b = false;
       this.c = false;
       this.a = new l(p0);
    }
    public void ImmutableMultiset$b(boolean p0){
       super();
       this.b = false;
       this.c = false;
       this.a = null;
    }
    public ImmutableCollection$b a(Object p0){
       this.f(p0);
       return this;
    }
    public ImmutableCollection d(){
       return this.i();
    }
    public ImmutableMultiset$b f(Object p0){
       this.h(p0, 1);
       return this;
    }
    public ImmutableMultiset$b g(Object[] p0){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          this.a(p0[i]);
       }
       return this;
    }
    public ImmutableMultiset$b h(Object p0,int p1){
       if (!p1) {
          return this;
       }
       boolean b = false;
       if (this.b != null) {
          this.a = new l(this.a);
          this.c = b;
       }
       this.b = b;
       n.j(p0);
       ImmutableMultiset$b ta = this.a;
       ta.n(p0, (p1 + ta.c(p0)));
       return this;
    }
    public ImmutableMultiset i(){
       if (!this.a.t()) {
          return ImmutableMultiset.of();
       }
       if (this.c != null) {
          this.a = new l(this.a);
          this.c = false;
       }
       this.b = true;
       return new RegularImmutableMultiset(this.a);
    }
}
