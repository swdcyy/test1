package com.google.common.collect.CompactHashSet$a;
import java.util.Iterator;
import com.google.common.collect.CompactHashSet;
import java.lang.Object;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import qk.g;

public class CompactHashSet$a implements Iterator	// class@0017b2
{
    public int b;
    public int c;
    public int d;
    public final CompactHashSet e;

    public void CompactHashSet$a(CompactHashSet p0){
       this.e = p0;
       super();
       this.b = p0.modCount;
       this.c = p0.firstEntryIndex();
       this.d = -1;
    }
    public final void a(){
       if (this.e.modCount == this.b) {
          return;
       }
       throw new ConcurrentModificationException();
    }
    public boolean hasNext(){
       boolean b = (this.c >= null)? true: false;
       return b;
    }
    public Object next(){
       this.a();
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       CompactHashSet$a tc = this.c;
       this.d = tc;
       CompactHashSet$a te = this.e;
       this.c = te.getSuccessor(tc);
       return te.elements[tc];
    }
    public void remove(){
       this.a();
       int i = 1;
       boolean b = (this.d >= null)? true: false;
       g.c(b);
       this.b = this.b + i;
       CompactHashSet$a te = this.e;
       CompactHashSet$a td = this.d;
       te.remove(te.elements[td], CompactHashSet.getHash(te.entries[td]));
       this.c = this.e.adjustAfterRemove(this.c, this.d);
       this.d = -1;
       return;
    }
}
