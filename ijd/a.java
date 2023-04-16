package ijd.a;
import java.lang.String;
import javax.net.ssl.HostnameVerifier;
import com.yxcorp.retrofit.idc.models.Host;
import javax.net.ssl.SSLSocketFactory;

public interface abstract a	// class@0017fc
{

    HostnameVerifier a(String p0,String p1);
    boolean b(String p0);
    Host c(String p0);
    SSLSocketFactory d(String p0,String p1);
    boolean e();
}
