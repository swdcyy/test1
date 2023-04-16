package com.google.gson.internal.LinkedTreeMap$d;
import java.util.Iterator;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.Object;
import com.google.gson.internal.LinkedTreeMap$e;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;

public abstract class LinkedTreeMap$d implements Iterator	// class@00056d
{
    public LinkedTreeMap$e b;
    public LinkedTreeMap$e c;
    public int d;
    public final LinkedTreeMap e;

    public void LinkedTreeMap$d(LinkedTreeMap p0){
       this.e = p0;
       super();
       this.b = p0.header.e;
       this.c = null;
       this.d = p0.modCount;
    }
    public final LinkedTreeMap$e a(){
       LinkedTreeMap$d tb = this.b;
       LinkedTreeMap$d te = this.e;
       if (tb == te.header) {
          throw new NoSuchElementException();
       }
       if (te.modCount != this.d) {
          throw new ConcurrentModificationException();
       }
       this.b = tb.e;
       this.c = tb;
       return tb;
    }
    public final boolean hasNext(){
       boolean b = (this.b != this.e.header)? true: false;
       return b;
    }
    public final void remove(){
       LinkedTreeMap$d tc = this.c;
       if (tc == null) {
          throw new IllegalStateException();
       }
       this.e.removeInternal(tc, true);
       this.c = null;
       this.d = this.e.modCount;
       return;
    }
}
