package pb6.o;
import pb6.o$a;
import pb6.b;
import com.google.gson.JsonObject;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.a0;
import com.kwai.framework.network.keyconfig.BaseConfig;

public interface abstract o	// class@002199
{
    public static final o$a a;

    static {
       o.a = o$a.b;
    }
    boolean a();
    boolean b();
    int c();
    b d();
    JsonObject e();
    a0 f(RequestTiming p0);
    boolean g();
    long getServerTimestamp();
    int getVersion();
    BaseConfig h();
}
