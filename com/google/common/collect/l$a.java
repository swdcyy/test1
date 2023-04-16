package com.google.common.collect.l$a;
import com.google.common.collect.Multisets$a;
import com.google.common.collect.l;
import java.lang.Object;
import ok.k;

public class l$a extends Multisets$a	// class@0018be
{
    public final Object b;
    public int c;
    public final l d;

    public void l$a(l p0,int p1){
       this.d = p0;
       super();
       this.b = p0.a[p1];
       this.c = p1;
    }
    public int getCount(){
       l$a tc = this.c;
       l$a uoa = -1;
       if (tc != uoa && (tc >= this.d.t() || !k.a(this.b, this.d.a[this.c]))) {
          this.c = this.d.j(this.b);
       }
       tc = this.c;
       int i = (tc == uoa)? 0: this.d.b[tc];
       return i;
    }
    public Object getElement(){
       return this.b;
    }
}
