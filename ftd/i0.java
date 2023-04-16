package ftd.i0;
import ftd.d3;
import asd.a;
import ftd.i0$a;
import nsd.u;
import kotlin.coroutines.CoroutineContext$b;
import java.lang.Object;
import kotlin.coroutines.CoroutineContext;
import java.lang.String;
import ftd.j0;
import kotlin.coroutines.CoroutineContext$a;
import java.lang.Thread;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import kotlin.TypeCastException;
import msd.p;
import ftd.d3$a;

public final class i0 extends a implements d3	// class@000e95
{
    public final long b;
    public static final i0$a c;

    static {
       i0.c = new i0$a(null);
    }
    public void i0(long p0){
       super(i0.c);
       this.b = p0;
    }
    public static i0 x(i0 p0,long p1,int p2,Object p3){
       i0 b;
       if (p2 & 0x01) {
          b = p0.b;
       }
       return p0.v(b);
    }
    public String A(CoroutineContext p0){
       String str;
       j0 oj0 = p0.get(j0.c);
       if (oj0 != null) {
          str = oj0.y();
          if (str != null) {
          label_0013 :
             Thread thread = Thread.currentThread();
             String name = thread.getName();
             int i = StringsKt__StringsKt.w3(name, " @", 0, false, 6, null);
             if (i < 0) {
                i = name.length();
             }
             StringBuilder str1 = new StringBuilder(((str.length() + i) + 10));
             int i1 = 0;
             if (name != null) {
                String str2 = name.substring(i1, i);
                a.h(str2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                str1 = str1+str2;
                str = str1+" @"+str+'#'+this.b;
                a.h(str, "StringBuilder\(capacity\).¡­builderAction\).toString\(\)");
                thread.setName(str);
                return name;
             }else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
             }
          }
       }
       str = "coroutine";
       goto label_0013 ;
    }
    public Object V(CoroutineContext p0){
       return this.A(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof i0 && !this.b - p0.b)) {
          return true;
       }
       return false;
    }
    public Object fold(Object p0,p p1){
       return d3$a.a(this, p0, p1);
    }
    public CoroutineContext$a get(CoroutineContext$b p0){
       return d3$a.b(this, p0);
    }
    public final long getId(){
       return this.b;
    }
    public int hashCode(){
       i0 tb = this.b;
       return (int)(tb ^ (tb >> 32));
    }
    public void i(CoroutineContext p0,Object p1){
       this.y(p0, p1);
    }
    public CoroutineContext minusKey(CoroutineContext$b p0){
       return d3$a.c(this, p0);
    }
    public CoroutineContext plus(CoroutineContext p0){
       return d3$a.d(this, p0);
    }
    public String toString(){
       return "CoroutineId\("+this.b+')';
    }
    public final long u(){
       return this.b;
    }
    public final i0 v(long p0){
       return new i0(p0);
    }
    public void y(CoroutineContext p0,String p1){
       Thread.currentThread().setName(p1);
    }
}
