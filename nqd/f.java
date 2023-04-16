package nqd.f;
import java.util.AbstractSet;
import java.nio.channels.SelectionKey;
import java.lang.Object;
import java.lang.System;
import java.util.Iterator;
import java.lang.UnsupportedOperationException;

public final class f extends AbstractSet	// class@001eb5
{
    public SelectionKey[] b;
    public int c;
    public SelectionKey[] d;
    public int e;
    public boolean f;

    public void f(){
       super();
       this.f = true;
       SelectionKey[] selectionKey = new SelectionKey[1024];
       this.b = selectionKey;
       this.d = selectionKey.clone();
    }
    public boolean add(Object p0){
       f tc;
       f tb;
       int i;
       boolean b = false;
       if (p0 == null) {
       }else if(this.f != null){
          tc = this.c;
          tb = this.b;
          i = tc + 1;
          tb[tc] = p0;
          this.c = i;
          if (i == tb.length) {
             p0 = new SelectionKey[(tb.length << 1)];
             System.arraycopy(tb, b, p0, b, i);
             this.b = p0;
          }
       }else {
          tc = this.e;
          tb = this.d;
          i = tc + 1;
          tb[tc] = p0;
          this.e = i;
          if (i == tb.length) {
             p0 = new SelectionKey[(tb.length << 1)];
             System.arraycopy(tb, b, p0, b, i);
             this.d = p0;
          }
       }
       b = true;
       return b;
    }
    public SelectionKey[] b(){
       f tb;
       if (this.f != null) {
          this.f = false;
          tb = this.b;
          tb[this.c] = null;
          this.e = 0;
          return tb;
       }else {
          this.f = true;
          tb = this.d;
          tb[this.e] = null;
          this.c = 0;
          return tb;
       }
    }
    public boolean contains(Object p0){
       return false;
    }
    public Iterator iterator(){
       throw new UnsupportedOperationException();
    }
    public boolean remove(Object p0){
       return false;
    }
    public int size(){
       if (this.f != null) {
          return this.c;
       }
       return this.e;
    }
}
