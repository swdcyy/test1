package kshark.lite.HeapObject$HeapInstance$readFields$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kshark.lite.HeapObject$HeapInstance$readFields$1;
import kshark.lite.HeapObject$HeapClass;
import java.lang.Object;
import rtd.l$a$a$a$a;
import rtd.h;
import java.lang.String;
import kotlin.jvm.internal.a;
import kshark.lite.HeapObject$b;
import kshark.lite.HprofHeapGraph;
import qrd.p;
import std.e;
import java.util.Objects;
import rtd.d0$i;
import java.lang.IllegalArgumentException;
import rtd.d0$a;
import rtd.l$a$a$b;
import rtd.d0$c;
import zsd.d;
import java.nio.charset.Charset;
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
import rtd.i;
import kshark.lite.b;
import rtd.d0;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class HeapObject$HeapInstance$readFields$1$1 extends Lambda implements l	// class@001b8c
{
    public final HeapObject$HeapClass $heapClass;
    public final HeapObject$HeapInstance$readFields$1 this$0;

    public void HeapObject$HeapInstance$readFields$1$1(HeapObject$HeapInstance$readFields$1 p0,HeapObject$HeapClass p1){
       this.this$0 = p0;
       this.$heapClass = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final h invoke(l$a$a$a$a p0){
       long l;
       d0$i oi1;
       int i1;
       e a;
       a.p(p0, "fieldRecord");
       String str = this.this$0.this$0.d.i(this.$heapClass.d(), p0);
       HeapObject$HeapInstance$readFields$1$1 tthis$0 = this.this$0;
       e value = tthis$0.$fieldReader.getValue();
       Objects.requireNonNull(value);
       a.p(p0, "field");
       int i = p0.a();
       i oi = 1;
       HeapObject$HeapInstance$readFields$1$1 heapInstance = 2;
       if (i == heapInstance) {
          e c = value.c;
          if (c != oi) {
             if (c != heapInstance) {
                if (c != 4) {
                   if (c == 8) {
                      l = value.c();
                   label_005c :
                      oi1 = new d0$i(l);
                   }else {
                      throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
                   }
                }else {
                   i1 = value.b();
                }
             }else {
                i1 = value.d();
             }
          }else {
             i1 = value.a();
          }
          l = (long)i1;
          goto label_005c ;
       }else if(i == e.d){
          a = value.a;
          value.a = a + oi;
          if (value.b.a()[a] == (byte)0) {
             oi = false;
          }
          oi1 = new d0$a(oi);
       }else if(i == e.e){
          value.a = value.a + heapInstance;
          oi1 = new d0$c((new String(value.b.a(), value.a, heapInstance, d.c)).charAt(0));
       }else if(i == e.f){
          oi1 = new d0$f(Float.intBitsToFloat(value.b()));
       }else if(i == e.g){
          oi1 = new d0$e(Double.longBitsToDouble(value.c()));
       }else if(i == e.h){
          oi1 = new d0$b(value.a());
       }else if(i == e.i){
          oi1 = new d0$j(value.d());
       }else if(i == e.j){
          oi1 = new d0$g(value.b());
       }else if(i == e.k){
          oi1 = new d0$h(value.c());
       }else {
          throw new IllegalStateException("Unknown type "+p0.a());
       }
       return new h(this.$heapClass, str, new i(this.this$0.this$0.d, oi1));
    }
}
