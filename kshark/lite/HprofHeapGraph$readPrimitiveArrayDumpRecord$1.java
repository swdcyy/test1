package kshark.lite.HprofHeapGraph$readPrimitiveArrayDumpRecord$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import rtd.m;
import rtd.l$a$a$d;
import java.lang.String;
import kotlin.jvm.internal.a;
import rtd.l$a$a$d$a;
import rtd.l$a$a$d$c;
import rtd.l$a$a$d$e;
import rtd.l$a$a$d$d;
import rtd.l$a$a$d$b;
import rtd.l$a$a$d$h;
import rtd.l$a$a$d$f;
import rtd.l$a$a$d$g;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class HprofHeapGraph$readPrimitiveArrayDumpRecord$1 extends Lambda implements l	// class@001b9e
{
    public static final HprofHeapGraph$readPrimitiveArrayDumpRecord$1 INSTANCE;

    static {
       HprofHeapGraph$readPrimitiveArrayDumpRecord$1.INSTANCE = new HprofHeapGraph$readPrimitiveArrayDumpRecord$1();
    }
    public void HprofHeapGraph$readPrimitiveArrayDumpRecord$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final l$a$a$d invoke(m p0){
       l$a$a$d$a uoa$a$d$a;
       a.p(p0, "$receiver");
       long l = p0.g();
       int i = p0.h();
       int i1 = p0.h();
       int i2 = p0.k();
       int i3 = 0;
       if (i2 == m.k) {
          boolean[] uobooleanArr = new boolean[i1];
          for (int i4 = 0; i4 < i1; i4 = i4 + 1) {
             boolean b = (p0.b())? true: false;
             uobooleanArr[i4] = b;
          }
          uoa$a$d$a = new l$a$a$d$a(l, i, uobooleanArr);
       }else if(i2 == m.l){
          char[] uocharArray = new char[i1];
          for (; i3 < i1; i3 = i3 + 1) {
             uocharArray[i3] = p0.d();
          }
          uoa$a$d$a = new l$a$a$d$c(l, i, uocharArray);
       }else if(i2 == m.m){
          float[] uofloatArray = new float[i1];
          for (; i3 < i1; i3 = i3 + 1) {
             uofloatArray[i3] = p0.f();
          }
          uoa$a$d$a = new l$a$a$d$e(l, i, uofloatArray);
       }else if(i2 == m.n){
          double[] uodoubleArra = new double[i1];
          for (; i3 < i1; i3 = i3 + 1) {
             uodoubleArra[i3] = p0.e();
          }
          uoa$a$d$a = new l$a$a$d$d(l, i, uodoubleArra);
       }else if(i2 == m.o){
          uoa$a$d$a = new l$a$a$d$b(l, i, p0.c(i1));
       }else if(i2 == m.p){
          short[] oshortArray = new short[i1];
          for (; i3 < i1; i3 = i3 + 1) {
             oshortArray[i3] = p0.j();
          }
          uoa$a$d$a = new l$a$a$d$h(l, i, oshortArray);
       }else if(i2 == m.q){
          int[] ointArray = new int[i1];
          for (; i3 < i1; i3 = i3 + 1) {
             ointArray[i3] = p0.h();
          }
          uoa$a$d$a = new l$a$a$d$f(l, i, ointArray);
       }else if(i2 == m.r){
          long[] olongArray = new long[i1];
          for (; i3 < i1; i3 = i3 + 1) {
             olongArray[i3] = p0.i();
          }
          uoa$a$d$a = new l$a$a$d$g(l, i, olongArray);
       }else {
          throw new IllegalStateException("Unexpected type "+i2);
       }
       return uoa$a$d$a;
    }
}
