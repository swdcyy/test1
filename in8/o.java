package in8.o;
import in8.m;
import in8.o$k;
import in8.o$s;
import in8.o$t;
import in8.o$u;
import in8.o$v;
import in8.o$w;
import in8.o$x;
import in8.o$y;
import in8.o$z;
import in8.o$a;
import in8.o$b;
import in8.o$c;
import in8.o$d;
import in8.o$e;
import in8.o$f;
import in8.o$g;
import in8.o$h;
import in8.o$i;
import in8.o$j;
import in8.o$l;
import in8.o$m;
import in8.o$n;
import in8.o$o;
import in8.o$p;
import in8.o$q;
import in8.o$r;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import hn8.f;
import java.lang.Object;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Double;
import java.lang.Class;
import in8.o$b0;

public class o extends m	// class@0026e3
{
    public final int[] a;
    public final m[] b;
    public final o$b0 c;
    public static final o$b0 A;
    public static final o$b0 B;
    public static final o$b0 C;
    public static final o$b0 d;
    public static final o$b0 e;
    public static final o$b0 f;
    public static final o$b0 g;
    public static final o$b0 h;
    public static final o$b0 i;
    public static final o$b0 j;
    public static final o$b0 k;
    public static final o$b0 l;
    public static final o$b0 m;
    public static final o$b0 n;
    public static final o$b0 o;
    public static final o$b0 p;
    public static final o$b0 q;
    public static final o$b0 r;
    public static final o$b0 s;
    public static final o$b0 t;
    public static final o$b0 u;
    public static final o$b0 v;
    public static final o$b0 w;
    public static final o$b0 x;
    public static final o$b0 y;
    public static final o$b0 z;

    static {
       o.d = new o$k();
       o.e = new o$s();
       o.f = new o$t();
       o.g = new o$u();
       o.h = new o$v();
       o.i = new o$w();
       o.j = new o$x();
       o.k = new o$y();
       o.l = new o$z();
       o.m = new o$a();
       o.n = new o$b();
       o.o = new o$c();
       o.p = new o$d();
       o.q = new o$e();
       o.r = new o$f();
       o.s = new o$g();
       o.t = new o$h();
       o.u = new o$i();
       o.v = new o$j();
       o.w = new o$l();
       o.x = new o$m();
       o.y = new o$n();
       o.z = new o$o();
       o.A = new o$p();
       o.B = new o$q();
       o.C = new o$r();
    }
    public void o(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       int[] ointArray = f.a(p1.getArray("input"));
       this.a = ointArray;
       m[] omArray = new m[ointArray.length];
       this.b = omArray;
       String str = p1.getString("op");
       if (("add").equals(str)) {
          this.c = o.d;
       }else if(("sub").equals(str)){
          this.c = o.e;
       }else if(("multiply").equals(str)){
          this.c = o.f;
       }else if(("divide").equals(str)){
          this.c = o.g;
       }else if(("pow").equals(str)){
          this.c = o.h;
       }else if(("modulo").equals(str)){
          this.c = o.i;
       }else if(("sqrt").equals(str)){
          this.c = o.j;
       }else if(("log").equals(str)){
          this.c = o.k;
       }else if(("sin").equals(str)){
          this.c = o.l;
       }else if(("cos").equals(str)){
          this.c = o.m;
       }else if(("tan").equals(str)){
          this.c = o.n;
       }else if(("acos").equals(str)){
          this.c = o.o;
       }else if(("asin").equals(str)){
          this.c = o.p;
       }else if(("atan").equals(str)){
          this.c = o.q;
       }else if(("exp").equals(str)){
          this.c = o.r;
       }else if(("round").equals(str)){
          this.c = o.s;
       }else if(("and").equals(str)){
          this.c = o.t;
       }else if(("or").equals(str)){
          this.c = o.u;
       }else if(("not").equals(str)){
          this.c = o.v;
       }else if(("defined").equals(str)){
          this.c = o.w;
       }else if(("lessThan").equals(str)){
          this.c = o.x;
       }else if(("eq").equals(str)){
          this.c = o.y;
       }else if(("greaterThan").equals(str)){
          this.c = o.z;
       }else if(("lessOrEq").equals(str)){
          this.c = o.A;
       }else if(("greaterOrEq").equals(str)){
          this.c = o.B;
       }else if(("neq").equals(str)){
          this.c = o.C;
       }else {
          throw new JSApplicationIllegalArgumentException("Unrecognized operator "+str);
       }
       return;
    }
    public static boolean b(Object p0){
       boolean b = (p0 != null && !p0.equals(Double.valueOf(0)))? true: false;
       return b;
    }
    public Object evaluate(){
       int i = 0;
       o ta = this.a;
       while (i < ta.length) {
          this.b[i] = this.mNodesManager.a(ta[i], m.class);
          i = i + 1;
       }
       return Double.valueOf(this.c.a(this.b));
    }
}
