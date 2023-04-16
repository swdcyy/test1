package com.google.common.collect.ImmutableSet$a;
import com.google.common.collect.ImmutableCollection$a;
import com.google.common.collect.ImmutableSet;
import java.lang.Object;
import com.google.common.collect.ImmutableCollection$b;
import com.google.common.collect.ImmutableCollection;
import ok.n;
import qk.w;
import qk.h0;
import java.lang.System;
import java.util.Iterator;
import java.util.Arrays;
import com.google.common.collect.RegularImmutableSet;
import java.util.AbstractCollection;

public class ImmutableSet$a extends ImmutableCollection$a	// class@0017fa
{
    public Object[] d;
    public int e;

    public void ImmutableSet$a(){
       super(4);
    }
    public void ImmutableSet$a(int p0){
       super(p0);
       Object[] objArray = new Object[ImmutableSet.chooseTableSize(p0)];
       this.d = objArray;
    }
    public ImmutableCollection$b a(Object p0){
       return this.h(p0);
    }
    public ImmutableCollection d(){
       return this.k();
    }
    public ImmutableCollection$a f(Object p0){
       return this.h(p0);
    }
    public ImmutableSet$a h(Object p0){
       n.j(p0);
       if (this.d != null) {
          ImmutableSet$a td = this.d;
          if (ImmutableSet.chooseTableSize(this.b) <= td.length) {
             int i = td.length - 1;
             int i1 = p0.hashCode();
             int i2 = w.b(i1);
             while (true) {
                i2 = i2 & i;
                ImmutableSet$a td1 = this.d;
                object oobject = td1[i2];
                if (oobject == null) {
                   td1[i2] = p0;
                   this.e = this.e + i1;
                   super.f(p0);
                   break ;
                }else if(oobject.equals(p0)){
                   break ;
                }else {
                   i2 = i2 + 1;
                }
             }
             return this;
          }
       }
       this.d = null;
       super.f(p0);
       return this;
    }
    public ImmutableSet$a i(Object[] p0){
       int i = 0;
       if (this.d != null) {
          int len = p0.length;
          for (; i < len; i = i + 1) {
             this.h(p0[i]);
          }
       }else {
          h0.b(p0);
          this.g((this.b + p0.length));
          System.arraycopy(p0, i, this.a, this.b, p0.length);
          this.b = this.b + p0.length;
       }
       return this;
    }
    public ImmutableSet$a j(Iterator p0){
       n.j(p0);
       while (p0.hasNext()) {
          this.h(p0.next());
       }
       return this;
    }
    public ImmutableSet k(){
       Object[] objArray;
       ImmutableCollection$a tb = this.b;
       if (tb == null) {
          return ImmutableSet.of();
       }
       boolean b = true;
       if (tb == b) {
          return ImmutableSet.of(this.a[0]);
       }
       if (this.d != null && ImmutableSet.chooseTableSize(tb) == this.d.length) {
          objArray = (ImmutableSet.shouldTrim(this.b, this.a.length))? Arrays.copyOf(this.a, this.b): this.a;
          ImmutableSet$a td = this.d;
          RegularImmutableSet regularImmut = new RegularImmutableSet(objArray, this.e, td, (td.length - 1), this.b);
       }else {
          ImmutableSet immutableSet = ImmutableSet.construct(this.b, this.a);
          this.b = immutableSet.size();
       }
       this.c = b;
       this.d = null;
       return objArray;
    }
}
