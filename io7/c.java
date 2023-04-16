package io7.c;
import java.lang.String;
import java.util.Map;
import io7.f;
import java.util.List;
import com.kwai.sdk.switchconfig.ConfigPriority;
import java.lang.reflect.Type;
import java.lang.Object;
import com.google.gson.JsonObject;
import com.kwai.sdk.switchconfig.UpdateConfigMode;
import io7.x;
import io7.a;

public interface abstract c	// class@00195e
{

    int a(String p0,int p1);
    long b(String p0,long p1);
    String c(String p0,String p1);
    boolean d(String p0,boolean p1);
    Map e();
    f f(String p0);
    void g(List p0,ConfigPriority p1);
    Object getValue(String p0,Type p1,Object p2);
    void h(JsonObject p0,ConfigPriority p1);
    void i(JsonObject p0,ConfigPriority p1,UpdateConfigMode p2);
    void j(String p0,ConfigPriority p1);
    void k(x p0);
    void l(String p0,a p1);
    void m(x p0);
    void n(String p0,ConfigPriority p1);
    boolean o(String p0,a p1);
    void p(String p0,a p1);
}
