package com.google.common.collect.Multisets$d;
import java.util.Iterator;
import com.google.common.collect.k;
import java.lang.Object;
import com.google.common.collect.k$a;
import java.util.NoSuchElementException;
import qk.g;

public final class Multisets$d implements Iterator	// class@001861
{
    public final k b;
    public final Iterator c;
    public k$a d;
    public int e;
    public int f;
    public boolean g;

    public void Multisets$d(k p0,Iterator p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public boolean hasNext(){
       boolean b = (this.e > null || this.c.hasNext())? true: false;
       return b;
    }
    public Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       if (this.e == null) {
          k$a uoa = this.c.next();
          this.d = uoa;
          int count = uoa.getCount();
          this.e = count;
          this.f = count;
       }
       this.e = this.e - 1;
       this.g = true;
       return this.d.getElement();
    }
    public void remove(){
       g.c(this.g);
       if (this.f == 1) {
          this.c.remove();
       }else {
          this.b.remove(this.d.getElement());
       }
       this.f = this.f - 1;
       this.g = false;
       return;
    }
}
