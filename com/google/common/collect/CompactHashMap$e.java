package com.google.common.collect.CompactHashMap$e;
import java.util.Iterator;
import com.google.common.collect.CompactHashMap;
import java.lang.Object;
import com.google.common.collect.CompactHashMap$a;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import qk.g;

public abstract class CompactHashMap$e implements Iterator	// class@0017ad
{
    public int b;
    public int c;
    public int d;
    public final CompactHashMap e;

    public void CompactHashMap$e(CompactHashMap p0){
       this.e = p0;
       super();
       this.b = p0.modCount;
       this.c = p0.firstEntryIndex();
       this.d = -1;
    }
    public void CompactHashMap$e(CompactHashMap p0,CompactHashMap$a p1){
       super(p0);
    }
    public final void a(){
       if (this.e.modCount == this.b) {
          return;
       }
       throw new ConcurrentModificationException();
    }
    public abstract Object b(int p0);
    public boolean hasNext(){
       boolean b = (this.c >= null)? true: false;
       return b;
    }
    public Object next(){
       this.a();
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       CompactHashMap$e tc = this.c;
       this.d = tc;
       Object obj = this.b(tc);
       this.c = this.e.getSuccessor(this.c);
       return obj;
    }
    public void remove(){
       this.a();
       int i = 1;
       boolean b = (this.d >= null)? true: false;
       g.c(b);
       this.b = this.b + i;
       this.e.removeEntry(this.d);
       this.c = this.e.adjustAfterRemove(this.c, this.d);
       this.d = -1;
       return;
    }
}
