package kshark.lite.internal.PathFinder$enqueueGcRoots$$inlined$forEach$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import kshark.lite.HeapObject$b;
import std.j;
import std.j$c;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import java.lang.Thread;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import java.util.Objects;
import kotlin.jvm.internal.a;
import lsd.a;
import rtd.h;
import rtd.i;

public final class PathFinder$enqueueGcRoots$$inlined$forEach$lambda$1 extends Lambda implements a	// class@001bcf
{
    public final j$c $this_enqueueGcRoots$inlined;
    public final HeapObject$b $threadInstance;
    public final Map $threadNames$inlined;
    public final Map $threadsBySerialNumber$inlined;
    public final j this$0;

    public void PathFinder$enqueueGcRoots$$inlined$forEach$lambda$1(HeapObject$b p0,j p1,j$c p2,Map p3,Map p4){
       this.$threadInstance = p0;
       this.this$0 = p1;
       this.$this_enqueueGcRoots$inlined = p2;
       this.$threadsBySerialNumber$inlined = p3;
       this.$threadNames$inlined = p4;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String name;
       String str;
       PathFinder$enqueueGcRoots$$inlined$forEach$lambda$1 t$threadInst = this.$threadInstance;
       d uod = m0.d(Thread.class);
       Objects.requireNonNull(t$threadInst);
       a.p(uod, "declaringClass");
       a.p("name", "fieldName");
       a.p(uod, "declaringClass");
       a.p("name", "fieldName");
       name = a.c(uod).getName();
       a.o(name, "declaringClass.java.name");
       h oh = t$threadInst.m(name, "name");
       if (oh != null) {
          i oi = oh.b();
          if (oi != null) {
             str = oi.d();
             if (str != null) {
             label_003f :
                this.$threadNames$inlined.put(this.$threadInstance, str);
                return str;
             }
          }
       }
       str = "";
       goto label_003f ;
    }
}
