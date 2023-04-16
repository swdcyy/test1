package kshark.lite.HeapObject$HeapClass;
import kshark.lite.HeapObject;
import kshark.lite.HprofHeapGraph;
import std.i$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import kshark.lite.b;
import rtd.l$a$a;
import java.util.Objects;
import java.lang.Long;
import java.util.Map;
import rtd.l$a$a$a;
import kshark.lite.HprofHeapGraph$readClassDumpRecord$1;
import std.i;
import msd.l;
import rtd.h;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import rtd.l$a$a$a$b;
import rtd.i;
import rtd.d0;
import wsd.m;
import kshark.lite.HeapObject$HeapClass$classHierarchy$1;
import kotlin.sequences.SequencesKt__SequencesKt;
import std.c;
import kshark.lite.internal.HprofInMemoryIndex;
import rtd.l$a$a$a$a;
import rtd.d0$i;
import rtd.d0$a;
import rtd.d0$c;
import rtd.d0$f;
import nsd.y;
import java.lang.Float;
import rtd.d0$e;
import nsd.v;
import java.lang.Double;
import rtd.d0$b;
import rtd.d0$j;
import rtd.d0$g;
import rtd.d0$h;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class HeapObject$HeapClass extends HeapObject	// class@001b8b
{
    public m d;
    public final HprofHeapGraph e;
    public final i$a f;
    public final long g;
    public final int h;

    public void HeapObject$HeapClass(HprofHeapGraph p0,i$a p1,long p2,int p3){
       a.p(p0, "hprofGraph");
       a.p(p1, "indexedObject");
       super(null);
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
    }
    public b c(){
       return this.e;
    }
    public long d(){
       return this.g;
    }
    public int e(){
       return this.h;
    }
    public int f(){
       return (int)this.f.b();
    }
    public l$a$a g(){
       HeapObject$HeapClass te = this.e;
       long l = this.d();
       HeapObject$HeapClass tf = this.f;
       Objects.requireNonNull(te);
       a.p(tf, "indexedObject");
       l$a$a$a uoa$a$a = te.e.get(Long.valueOf(l));
       if (uoa$a$a == null) {
          uoa$a$a = te.y(l, tf, HprofHeapGraph$readClassDumpRecord$1.INSTANCE);
          te.e.put(Long.valueOf(l), uoa$a$a);
       }
       return uoa$a$a;
    }
    public final h h(String p0){
       h oh;
       a.p(p0, "fieldName");
       a.p(p0, "fieldName");
       Iterator iterator = this.m().iterator();
       while (true) {
          if (iterator.hasNext()) {
             l$a$a$a$b uoa$a$a$b = iterator.next();
             if (a.g(this.e.z(this.d(), uoa$a$a$b), p0)) {
                oh = new h(this, p0, new i(this.e, uoa$a$a$b.a()));
                break ;
             }
          }else {
             oh = null;
             break ;
          }
       }
       return oh;
    }
    public final m i(){
       if (this.d == null) {
          this.d = SequencesKt__SequencesKt.o(this, HeapObject$HeapClass$classHierarchy$1.INSTANCE);
       }
       HeapObject$HeapClass td = this.d;
       a.m(td);
       return td;
    }
    public final String j(){
       return this.e.h(this.d());
    }
    public final HeapObject$HeapClass k(){
       if (!this.f.d()) {
          return null;
       }
       return this.e.u(this.f.d());
    }
    public final List l(){
       HeapObject$HeapClass te = this.e;
       HeapObject$HeapClass tf = this.f;
       Objects.requireNonNull(te);
       a.p(tf, "indexedClass");
       c uoc = te.h.b();
       Objects.requireNonNull(uoc);
       a.p(tf, "indexedClass");
       uoc.a = tf.c();
       uoc.h();
       int i = uoc.g();
       ArrayList uArrayList = new ArrayList(i);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uArrayList.add(new l$a$a$a$a(uoc.b(), uoc.f()));
       }
       return uArrayList;
    }
    public final List m(){
       int i2;
       d0$i oi;
       HeapObject$HeapClass te = this.e;
       HeapObject$HeapClass tf = this.f;
       Objects.requireNonNull(te);
       a.p(tf, "indexedClass");
       c uoc = te.h.b();
       Objects.requireNonNull(uoc);
       a.p(tf, "indexedClass");
       uoc.a = tf.c();
       int i = uoc.g();
       ArrayList uArrayList = new ArrayList(i);
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return uArrayList;
          }
          long l = uoc.b();
          i2 = uoc.f();
          if (i2 == 2) {
             oi = new d0$i(uoc.b());
          }else if(i2 == c.d){
             boolean b = (uoc.a())? true: false;
             oi = new d0$a(b);
          }else if(i2 == c.e){
             oi = new d0$c((char)uoc.e());
          }else if(i2 == c.f){
             oi = new d0$f(Float.intBitsToFloat(uoc.c()));
          }else if(i2 == c.g){
             oi = new d0$e(Double.longBitsToDouble(uoc.d()));
          }else if(i2 == c.h){
             oi = new d0$b(uoc.a());
          }else if(i2 == c.i){
             oi = new d0$j(uoc.e());
          }else if(i2 == c.j){
             oi = new d0$g(uoc.c());
          }else if(i2 == c.k){
             oi = new d0$h(uoc.d());
          }else {
             break ;
          }
          uArrayList.add(new l$a$a$a$b(l, i2, oi));
          i1 = i1 + 1;
       }
       throw new IllegalStateException("Unknown type "+i2);
    }
    public String toString(){
       return "class "+this.j();
    }
}
