package com.google.common.cache.LocalCache$h;
import java.util.Iterator;
import com.google.common.cache.LocalCache;
import java.lang.Object;
import com.google.common.cache.LocalCache$Segment;
import java.util.concurrent.atomic.AtomicReferenceArray;
import com.google.common.cache.d;
import ok.y;
import java.util.Objects;
import com.google.common.cache.LocalCache$s;
import com.google.common.cache.LocalCache$d0;
import java.util.NoSuchElementException;
import ok.n;

public abstract class LocalCache$h implements Iterator	// class@001761
{
    public int b;
    public int c;
    public LocalCache$Segment d;
    public AtomicReferenceArray e;
    public d f;
    public LocalCache$d0 g;
    public LocalCache$d0 h;
    public final LocalCache i;

    public void LocalCache$h(LocalCache p0){
       this.i = p0;
       super();
       this.b = p0.d.length - 1;
       this.c = -1;
       this.a();
    }
    public final void a(){
       this.g = null;
       if (this.d()) {
          return;
       }
       if (this.e()) {
          return;
       }
       LocalCache$h tb = this.b;
       while (tb >= null) {
          int i = tb - 1;
          this.b = i;
          object oobject = this.i.d[tb];
          this.d = oobject;
          if (oobject.count != null) {
             LocalCache$Segment table = this.d.table;
             this.e = table;
             int i1 = table.length() - 1;
             this.c = i1;
             if (this.e()) {
                break ;
             }
          }
       }
       return;
    }
    public boolean b(d p0){
       boolean b;
       long l = this.i.q.a();
       Object key = p0.getKey();
       LocalCache$h ti = this.i;
       Objects.requireNonNull(ti);
       Object obj = null;
       if (p0.getKey() == null) {
       }else {
          Object obj1 = p0.getValueReference().get();
          if (obj1 != null && !ti.m(p0, l)) {
             obj = obj1;
          }
       }
       if (obj != null) {
          this.g = new LocalCache$d0(this.i, key, obj);
          b = true;
       }else {
          b = false;
       }
       this.d.postReadCleanup();
       return b;
    }
    public LocalCache$d0 c(){
       LocalCache$h tg = this.g;
       if (tg == null) {
          throw new NoSuchElementException();
       }
       this.h = tg;
       this.a();
       return this.h;
    }
    public boolean d(){
       LocalCache$h tf = this.f;
       if (tf != null) {
          this.f = tf.getNext();
          tf = this.f;
          while (tf != null) {
             if (this.b(tf)) {
                return true;
             }
             tf = this.f;
          }
       }
       return false;
    }
    public boolean e(){
       while (true) {
          LocalCache$h tc = this.c;
          if (tc < null) {
             return false;
          }
          int i = tc - 1;
          this.c = i;
          d uod = this.e.get(tc);
          this.f = uod;
          if (uod != null && (this.b(uod) || this.d())) {
             break ;
          }
       }
       return true;
    }
    public boolean hasNext(){
       boolean b = (this.g != null)? true: false;
       return b;
    }
    public abstract Object next();
    public void remove(){
       boolean b = (this.h != null)? true: false;
       n.n(b);
       this.i.remove(this.h.getKey());
       this.h = null;
       return;
    }
}
