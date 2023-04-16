package com.google.common.collect.MapMakerInternalMap$e;
import java.util.Iterator;
import com.google.common.collect.MapMakerInternalMap;
import java.lang.Object;
import com.google.common.collect.MapMakerInternalMap$Segment;
import java.util.concurrent.atomic.AtomicReferenceArray;
import com.google.common.collect.MapMakerInternalMap$f;
import com.google.common.collect.MapMakerInternalMap$p;
import java.util.NoSuchElementException;
import qk.g;

public abstract class MapMakerInternalMap$e implements Iterator	// class@00182e
{
    public int b;
    public int c;
    public MapMakerInternalMap$Segment d;
    public AtomicReferenceArray e;
    public MapMakerInternalMap$f f;
    public MapMakerInternalMap$p g;
    public MapMakerInternalMap$p h;
    public final MapMakerInternalMap i;

    public void MapMakerInternalMap$e(MapMakerInternalMap p0){
       this.i = p0;
       super();
       this.b = p0.segments.length - 1;
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
       MapMakerInternalMap$e tb = this.b;
       while (tb >= null) {
          int i = tb - 1;
          this.b = i;
          object oobject = this.i.segments[tb];
          this.d = oobject;
          if (oobject.count != null) {
             MapMakerInternalMap$Segment table = this.d.table;
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
    public boolean b(MapMakerInternalMap$f p0){
       boolean b;
       Object key = p0.getKey();
       p0 = this.i.getLiveValue(p0);
       if (p0 != null) {
          this.g = new MapMakerInternalMap$p(this.i, key, p0);
          b = true;
       }else {
          b = false;
       }
       this.d.postReadCleanup();
       return b;
    }
    public MapMakerInternalMap$p c(){
       MapMakerInternalMap$e tg = this.g;
       if (tg == null) {
          throw new NoSuchElementException();
       }
       this.h = tg;
       this.a();
       return this.h;
    }
    public boolean d(){
       MapMakerInternalMap$e tf = this.f;
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
          MapMakerInternalMap$e tc = this.c;
          if (tc < null) {
             return false;
          }
          int i = tc - 1;
          this.c = i;
          MapMakerInternalMap$f uof = this.e.get(tc);
          this.f = uof;
          if (uof != null && (this.b(uof) || this.d())) {
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
       g.c(b);
       this.i.remove(this.h.getKey());
       this.h = null;
       return;
    }
}
