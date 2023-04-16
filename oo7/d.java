package oo7.d;
import java.lang.String;
import java.util.Map;
import com.kwai.sdk.switchconfig.v2.SwitchConfig;
import java.lang.reflect.Type;
import java.lang.Object;
import oo7.a;
import com.kwai.sdk.switchconfig.v2.ConfigPriority;
import com.google.gson.JsonObject;
import oo7.g;

public interface abstract d	// class@00210c
{

    int a(String p0,int p1);
    long b(String p0,long p1);
    String c(String p0,String p1);
    boolean d(String p0,boolean p1);
    Map e();
    SwitchConfig f(String p0);
    Object getValue(String p0,Type p1,Object p2);
    void k(String p0,a p1);
    void m(String p0,ConfigPriority p1);
    void n(String p0,ConfigPriority p1,boolean p2);
    void o(JsonObject p0,ConfigPriority p1);
    boolean p(String p0,a p1);
    void r(String p0,ConfigPriority p1);
    void s(g p0);
    void v(String p0,a p1);
    void w(g p0);
}
