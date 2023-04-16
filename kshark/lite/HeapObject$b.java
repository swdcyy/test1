package kshark.lite.HeapObject$b;
import kshark.lite.HeapObject;
import kshark.lite.HprofHeapGraph;
import std.i$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import kshark.lite.b;
import rtd.l$a$a;
import rtd.l$a$a$b;
import rtd.h;
import kshark.lite.HeapObject$HeapClass;
import java.util.Set;
import kshark.lite.HeapObject$HeapInstance$readFields$fieldReader$2;
import msd.a;
import qrd.p;
import qrd.s;
import wsd.m;
import kshark.lite.HeapObject$HeapInstance$readFields$1;
import vsd.n;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import java.util.Iterator;
import java.util.Objects;
import kshark.lite.HprofHeapGraph$readInstanceDumpRecord$1;
import std.i;
import java.lang.StringBuilder;

public final class HeapObject$b extends HeapObject	// class@001b90
{
    public final HprofHeapGraph d;
    public final i$b e;
    public final long f;
    public final int g;

    public void HeapObject$b(HprofHeapGraph p0,i$b p1,long p2,int p3){
       a.p(p0, "hprofGraph");
       a.p(p1, "indexedObject");
       super(null);
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
    }
    public b c(){
       return this.d;
    }
    public long d(){
       return this.f;
    }
    public int e(){
       return this.g;
    }
    public int f(){
       return (int)this.e.b();
    }
    public l$a$a g(){
       return this.n();
    }
    public final h h(String p0,String p1){
       a.p(p0, "declaringClassName");
       a.p(p1, "fieldName");
       return this.m(p0, p1);
    }
    public final HeapObject$HeapClass i(){
       return this.d.u(this.e.c());
    }
    public final long j(){
       return this.e.c();
    }
    public final String k(){
       return this.d.h(this.e.c());
    }
    public final boolean l(){
       return HeapObject.b.contains(this.k());
    }
    public final h m(String p0,String p1){
       a.p(p0, "declaringClassName");
       a.p(p1, "fieldName");
       n on = null;
       Iterator iterator = SequencesKt__SequencesKt.l(SequencesKt___SequencesKt.b1(this.i().i(), new HeapObject$HeapInstance$readFields$1(this, s.c(new HeapObject$HeapInstance$readFields$fieldReader$2(this)), on))).iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = obj;
          obj1 = (a.g(obj1.a.j(), p0) && a.g(obj1.a(), p1))? 1: null;
          if (obj1) {
             on = obj;
             break ;
          }
       }
       return on;
    }
    public l$a$a$b n(){
       HeapObject$b td = this.d;
       HeapObject$b te = this.e;
       Objects.requireNonNull(td);
       a.p(te, "indexedObject");
       return td.y(this.d(), te, HprofHeapGraph$readInstanceDumpRecord$1.INSTANCE);
    }
    public String toString(){
       return "instance @"+this.d()+" of "+this.k();
    }
}
