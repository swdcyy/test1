package ltd.a;
import java.lang.Object;
import trd.n;
import kotlin.TypeCastException;
import java.lang.String;

public class a	// class@001cbf
{
    public Object[] a;
    public int b;
    public int c;

    public void a(){
       super();
       Object[] objArray = new Object[16];
       this.a = objArray;
    }
    public final void a(Object p0){
       a ta = this.a;
       a tc = this.c;
       ta[tc] = p0;
       int i = (ta.length - 1) & (tc + 1);
       this.c = i;
       if (i == this.b) {
          this.c();
       }
       return;
    }
    public final void b(){
       this.b = 0;
       this.c = 0;
       Object[] objArray = new Object[this.a.length];
       this.a = objArray;
    }
    public final void c(){
       a uoa = this;
       a a = uoa.a;
       int len = a.length;
       Object[] objArray = new Object[(len << 1)];
       Object[] objArray1 = objArray;
       n.l1(a, objArray1, 0, uoa.b, 0, 10, null);
       a a1 = uoa.a;
       a b = uoa.b;
       Object[] objArray2 = objArray;
       n.l1(a1, objArray2, (a1.length - b), 0, b, 4, 0);
       uoa.a = objArray1;
       uoa.b = 0;
       uoa.c = len;
    }
    public final boolean d(){
       boolean b = (this.b == this.c)? true: false;
       return b;
    }
    public final Object e(){
       a tb = this.b;
       if (tb == this.c) {
          return null;
       }
       a ta = this.a;
       object oobject = ta[tb];
       ta[tb] = null;
       this.b = (tb + 1) & (ta.length - 1);
       if (oobject != null) {
          return oobject;
       }
       throw new TypeCastException("null cannot be cast to non-null type T");
    }
}
