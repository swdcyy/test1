package kshark.lite.HprofHeapGraph$readClassDumpRecord$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import rtd.m;
import rtd.l$a$a$a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import rtd.d0$i;
import rtd.d0$a;
import okio.d;
import rtd.d0$c;
import rtd.d0$f;
import rtd.d0$e;
import rtd.d0$b;
import rtd.d0$j;
import rtd.d0$g;
import rtd.d0$h;
import rtd.l$a$a$a$b;
import rtd.d0;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import rtd.l$a$a$a$a;
import java.util.List;

public final class HprofHeapGraph$readClassDumpRecord$1 extends Lambda implements l	// class@001b9a
{
    public static final HprofHeapGraph$readClassDumpRecord$1 INSTANCE;

    static {
       HprofHeapGraph$readClassDumpRecord$1.INSTANCE = new HprofHeapGraph$readClassDumpRecord$1();
    }
    public void HprofHeapGraph$readClassDumpRecord$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final l$a$a$a invoke(m p0){
       long l6;
       int i6;
       long l7;
       d0$i oi;
       long l8;
       long l = p0;
       a.p(l, "$receiver");
       long l1 = p0.g();
       int i = p0.h();
       long l2 = p0.g();
       long l3 = p0.g();
       long l4 = p0.g();
       long l5 = p0.g();
       p0.g();
       p0.g();
       int i1 = p0.h();
       int i2 = p0.l();
       for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
          l.n(m.h);
          l.n(l.c[p0.k()]);
       }
       i2 = p0.l();
       ArrayList uArrayList = new ArrayList(i2);
       int i4 = 0;
       while (true) {
          if (i4 < i2) {
             l6 = l5;
             l5 = p0.g();
             int i5 = i2;
             i2 = p0.k();
             i6 = i1;
             if (i2 == 2) {
                l7 = l4;
                oi = new d0$i(p0.g());
                l8 = l3;
             }else {
                l7 = l4;
                if (i2 == m.k) {
                   l8 = l3;
                   l4 = l.a + (long)m.e;
                   l.a = l4;
                   boolean b = (l.d.readByte())? true: false;
                   oi = new d0$a(b);
                }else {
                   l8 = l3;
                   if (i2 == m.l) {
                      oi = new d0$c(p0.d());
                   }else if(i2 == m.m){
                      oi = new d0$f(p0.f());
                   }else if(i2 == m.n){
                      oi = new d0$e(p0.e());
                   }else if(i2 == m.o){
                      oi = new d0$b(p0.b());
                   }else if(i2 == m.p){
                      oi = new d0$j(p0.j());
                   }else if(i2 == m.q){
                      oi = new d0$g(p0.h());
                   }else if(i2 == m.r){
                      oi = new d0$h(p0.i());
                   }else {
                      break ;
                   }
                }
             }
             uArrayList.add(new l$a$a$a$b(l5, i2, oi));
             i4 = i4 + 1;
             l5 = l6;
             i2 = i5;
             i1 = i6;
             l4 = l7;
             l3 = l8;
          }else {
             l8 = l3;
             l7 = l4;
             l6 = l5;
             i6 = i1;
             i2 = p0.l();
             ArrayList uArrayList1 = new ArrayList(i2);
             for (i4 = 0; i4 < i2; i4 = i4 + 1) {
                uArrayList1.add(new l$a$a$a$a(p0.g(), p0.k()));
             }
             l$a$a$a uoa$a$a = new l$a$a$a(l1, i, l2, l8, l7, l6, i6, uArrayList, uArrayList1);
             return l;
          }
       }
       throw new IllegalStateException("Unknown type "+i2);
    }
}
