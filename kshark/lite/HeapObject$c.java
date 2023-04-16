package kshark.lite.HeapObject$c;
import kshark.lite.HeapObject;
import kshark.lite.HprofHeapGraph;
import std.i$c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import kshark.lite.b;
import rtd.l$a$a;
import rtd.l$a$a$c;
import java.util.Objects;
import kshark.lite.HprofHeapGraph$readObjectArrayDumpRecord$1;
import std.i;
import msd.l;
import java.lang.StringBuilder;

public final class HeapObject$c extends HeapObject	// class@001b91
{
    public final HprofHeapGraph d;
    public final i$c e;
    public final long f;
    public final int g;

    public void HeapObject$c(HprofHeapGraph p0,i$c p1,long p2,int p3){
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
       return this.i();
    }
    public final String h(){
       return this.d.h(this.e.b);
    }
    public l$a$a$c i(){
       HeapObject$c td = this.d;
       HeapObject$c te = this.e;
       Objects.requireNonNull(td);
       a.p(te, "indexedObject");
       return td.y(this.d(), te, HprofHeapGraph$readObjectArrayDumpRecord$1.INSTANCE);
    }
    public String toString(){
       return "object array @"+this.d()+" of "+this.h();
    }
}
