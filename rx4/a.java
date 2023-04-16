package rx4.a;
import tx4.r;
import java.lang.String;
import tx4.n;
import java.util.Map;
import sx4.e$a;
import tx4.o;
import java.lang.Object;
import sx4.e;
import java.io.Serializable;
import com.tkruntime.v8.V8JsonProxyObject;
import tx4.w;
import tx4.q;
import tx4.l;
import com.tkruntime.v8.V8ObjectProxy;
import tx4.d;
import com.google.gson.JsonObject;
import tx4.p;

public interface abstract a	// class@0030f1
{

    boolean A();
    void B(r p0);
    void C(boolean p0,r p1);
    void c(String p0);
    void d(long p0,n p1);
    void e(String p0,Map p1);
    e f(e$a p0,o p1,String p2,Object[] p3);
    void g(int p0);
    V8JsonProxyObject h(Serializable p0);
    void i(w p0,boolean p1,r p2,String p3);
    boolean isDestroyed();
    void j(q p0);
    void k(e$a p0,o p1,String p2,Object[] p3);
    void l(l p0);
    void n(long p0,e$a p1,o p2,String p3,Object[] p4);
    V8ObjectProxy o(Object p0);
    void onDestroy();
    void onPause();
    void onResume();
    void onStop();
    void p(d p0);
    void q(boolean p0);
    void r(long p0,r p1);
    V8JsonProxyObject s(JsonObject p0);
    void t(l p0);
    void u(boolean p0);
    void v();
    void w(boolean p0);
    w x();
    void y(boolean p0);
    void z(p p0);
}
