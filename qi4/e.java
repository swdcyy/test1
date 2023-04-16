package qi4.e;
import java.lang.String;
import com.kuaishou.merchant.transaction.base.model.PayResultQueryResponse;
import java.lang.Throwable;
import java.util.HashMap;
import com.yxcorp.gateway.pay.params.PayResult$PaySdKElapsedTime;

public interface abstract e	// class@002e9e
{

    void a();
    void b();
    void c(String p0,String p1,PayResultQueryResponse p2);
    boolean d(Throwable p0);
    void e();
    void f(String p0,int p1);
    void g(String p0);
    boolean h();
    void i();
    void j(String p0,String p1);
    void k(String p0,String p1,int p2,String p3);
    void l(int p0,String p1,HashMap p2);
    void m(String p0);
    void n(int p0,long p1,long p2,long p3,long p4,PayResult$PaySdKElapsedTime p5,long p6,long p7,String p8);
    boolean o(PayResultQueryResponse p0,String p1);
    void p(String p0);
    void q();
}
