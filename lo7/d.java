package lo7.d;
import java.lang.String;
import java.util.Map;
import com.kwai.sdk.switchconfig.v1.SwitchConfig;
import java.lang.reflect.Type;
import java.lang.Object;
import lo7.a;
import com.kwai.sdk.switchconfig.v1.ConfigPriority;
import com.google.gson.JsonObject;
import com.kwai.sdk.switchconfig.UpdateConfigMode;
import lo7.g;
import java.util.List;

public interface abstract d	// class@001de1
{

    int a(String p0,int p1);
    long b(String p0,long p1);
    String c(String p0,String p1);
    boolean d(String p0,boolean p1);
    Map e();
    SwitchConfig f(String p0);
    Object getValue(String p0,Type p1,Object p2);
    void l(String p0,a p1);
    void m(String p0,ConfigPriority p1);
    void n(JsonObject p0,ConfigPriority p1,UpdateConfigMode p2);
    void q(g p0);
    void r(String p0,a p1);
    boolean s(String p0,a p1);
    void t(List p0,ConfigPriority p1);
    void u(g p0);
    void w(String p0,ConfigPriority p1);
    void x(JsonObject p0,ConfigPriority p1);
    void y(String p0,ConfigPriority p1,boolean p2);
}
