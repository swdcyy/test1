package fjd.b;
import java.lang.String;
import javax.net.ssl.HostnameVerifier;
import com.yxcorp.retrofit.idc.models.Host;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import jjd.b;
import android.content.Context;
import java.util.Map;
import okhttp3.OkHttpClient;
import kjd.b;
import gjd.a;
import ijd.a;

public interface abstract b	// class@001615
{

    HostnameVerifier a(String p0,String p1);
    boolean b(String p0);
    Host c(String p0);
    List d(String p0);
    int e(String p0);
    void f(String p0,Host p1);
    SSLSocketFactory g(String p0,String p1);
    b getType(String p0);
    void h(Context p0,Map p1,OkHttpClient p2,b p3,String p4);
    void i(a p0);
    void j(boolean p0);
    void k(Context p0,Map p1,OkHttpClient p2,b p3,String p4,a p5);
}
