package em1.t;
import em1.r;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.String;
import brd.t;
import com.kuaishou.gifshow.network.degrade.RequestTiming;

public interface abstract t	// class@0021c6
{
    public static final x a;

    static {
       t.a = Suppliers.c(Suppliers.a(r.b));
    }
    t a(String p0,int p1);
    t b(RequestTiming p0);
    t c(String p0,String p1);
    t d(String p0,String p1);
}
