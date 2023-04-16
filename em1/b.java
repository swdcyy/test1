package em1.b;
import java.lang.String;
import brd.t;
import cm1.b;
import java.util.List;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.models.Gift;

public interface abstract b	// class@0021af
{

    t a(String p0);
    t b(String p0);
    t c(String p0);
    void clear();
    void d(b p0);
    void e(List p0);
    void f(RequestTiming p0);
    void g(List p0,String p1);
    String getTag();
    Bitmap h(List p0,String p1);
    void i(List p0);
    Bitmap j(String p0,String p1);
    void k(b p0);
    t l(String p0,String p1);
    void m(List p0,boolean p1,String p2);
    void n(List p0,boolean p1,String p2);
    t o(String p0,int p1);
    void p(List p0);
    void q(List p0,int p1);
    t r(String p0,String p1);
    Gift s(int p0);
    long t(int p0);
    Bitmap u(int p0,String p1);
}
