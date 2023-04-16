package com.google.common.collect.HashBiMap$g$a;
import java.util.Iterator;
import com.google.common.collect.HashBiMap$g;
import java.lang.Object;
import com.google.common.collect.HashBiMap;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import qk.g;

public class HashBiMap$g$a implements Iterator	// class@0017cf
{
    public int b;
    public int c;
    public int d;
    public int e;
    public final HashBiMap$g f;

    public void HashBiMap$g$a(HashBiMap$g p0){
       this.f = p0;
       super();
       p0 = p0.b;
       this.b = p0.firstInInsertionOrder;
       this.c = -1;
       this.d = p0.modCount;
       this.e = p0.size;
    }
    public final void a(){
       if (this.f.b.modCount == this.d) {
          return;
       }
       throw new ConcurrentModificationException();
    }
    public boolean hasNext(){
       this.a();
       boolean b = (this.b != -2 && this.e > null)? true: false;
       return b;
    }
    public Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       HashBiMap$g$a tb = this.b;
       this.c = tb;
       this.b = this.f.b.nextInInsertionOrder[tb];
       this.e = this.e - 1;
       return this.f.b(this.b);
    }
    public void remove(){
       this.a();
       boolean b = (this.c != -1)? true: false;
       g.c(b);
       this.f.b.removeEntry(this.c);
       HashBiMap$g b1 = this.f.b;
       if (this.b == b1.size) {
          this.b = this.c;
       }
       this.c = -1;
       this.d = b1.modCount;
       return;
    }
}
