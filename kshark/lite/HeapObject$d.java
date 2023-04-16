package kshark.lite.HeapObject$d;
import kshark.lite.HeapObject;
import kshark.lite.HprofHeapGraph;
import std.i$d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import kshark.lite.b;
import rtd.l$a$a;
import java.util.Objects;
import kshark.lite.HprofHeapGraph$readPrimitiveArrayDumpRecord$1;
import std.i;
import msd.l;
import rtd.l$a$a$d;
import java.lang.StringBuilder;
import kshark.lite.PrimitiveType;
import java.lang.Enum;
import java.util.Locale;

public final class HeapObject$d extends HeapObject	// class@001b92
{
    public final HprofHeapGraph d;
    public final i$d e;
    public final long f;
    public final int g;

    public void HeapObject$d(HprofHeapGraph p0,i$d p1,long p2,int p3){
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
       HeapObject$d td = this.d;
       HeapObject$d te = this.e;
       Objects.requireNonNull(td);
       a.p(te, "indexedObject");
       return td.y(this.d(), te, HprofHeapGraph$readPrimitiveArrayDumpRecord$1.INSTANCE);
    }
    public final String h(){
       String str = this.i().name();
       Locale uS = Locale.US;
       a.o(uS, "Locale.US");
       Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
       str = str.toLowerCase(uS);
       a.o(str, "\(this as java.lang.String\).toLowerCase\(locale\)");
       StringBuilder str1 = str;
       return str1+"[]";
    }
    public final PrimitiveType i(){
       HeapObject$d te = this.e;
       Objects.requireNonNull(te);
       return PrimitiveType.values()[te.a];
    }
    public String toString(){
       return "primitive array @"+this.d()+" of "+this.h();
    }
}
