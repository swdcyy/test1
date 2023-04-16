package kshark.lite.HprofHeapGraph$readObjectArrayDumpRecord$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import rtd.m;
import rtd.l$a$a$c;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class HprofHeapGraph$readObjectArrayDumpRecord$1 extends Lambda implements l	// class@001b9c
{
    public static final HprofHeapGraph$readObjectArrayDumpRecord$1 INSTANCE;

    static {
       HprofHeapGraph$readObjectArrayDumpRecord$1.INSTANCE = new HprofHeapGraph$readObjectArrayDumpRecord$1();
    }
    public void HprofHeapGraph$readObjectArrayDumpRecord$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final l$a$a$c invoke(m p0){
       a.p(p0, "$receiver");
       long l = p0.g();
       int i = p0.h();
       int i1 = p0.h();
       long l1 = p0.g();
       long[] olongArray = new long[i1];
       for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
          olongArray[i2] = p0.g();
       }
       l$a$a$c uoa$a$c = new l$a$a$c(l, i, l1, olongArray);
       return p0;
    }
}
