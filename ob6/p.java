package ob6.p;
import ob6.p$a;
import pb6.b;
import ob6.h;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.String;
import brd.a0;
import ob6.f;

public interface abstract p	// class@001ff7
{
    public static final p$a a;

    static {
       p.a = p$a.b;
    }
    boolean a();
    boolean b();
    int c();
    b d();
    boolean e();
    h f();
    h g();
    long getServerTimestamp();
    int getVersion();
    a0 h(RequestTiming p0,String p1);
    f i();
    a0 j(RequestTiming p0);
}
