package yf7.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yf7.k;
import com.kwai.performance.monitor.base.d;
import yf7.c;
import yf7.i;
import yf7.d;
import yf7.d$a;

public final class h	// class@00289e
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public static final int a(String p0,String p1){
       a.q(p0, "tag");
       a.q(p1, "msg");
       if (!k.e()) {
          return 0;
       }
       return k.c.c().c().d(p0, p1);
    }
    public static final int b(String p0,String p1){
       a.q(p0, "tag");
       a.q(p1, "msg");
       if (!k.e()) {
          return 0;
       }
       return k.c.c().c().e(p0, p1);
    }
    public static final int c(String p0,String p1,boolean p2){
       a.q(p0, "tag");
       a.q(p1, "msg");
       if (!k.e()) {
          return 0;
       }
       if (p2) {
          d$a.c(i.a, p0, p1, false, 4, null);
       }
       return h.b(p0, p1);
    }
    public static final int d(String p0,String p1){
       a.q(p0, "tag");
       a.q(p1, "msg");
       if (!k.e()) {
          return 0;
       }
       return k.c.c().c().i(p0, p1);
    }
    public static final int e(String p0,String p1,boolean p2){
       a.q(p0, "tag");
       a.q(p1, "msg");
       if (!k.e()) {
          return 0;
       }
       if (p2) {
          d$a.c(i.a, p0, p1, false, 4, null);
       }
       return h.d(p0, p1);
    }
    public static final int f(String p0,String p1){
       a.q(p0, "tag");
       a.q(p1, "msg");
       if (!k.e()) {
          return 0;
       }
       return k.c.c().c().v(p0, p1);
    }
    public static final int g(String p0,String p1){
       a.q(p0, "tag");
       a.q(p1, "msg");
       if (!k.e()) {
          return 0;
       }
       return k.c.c().c().w(p0, p1);
    }
}
