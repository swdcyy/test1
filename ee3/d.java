package ee3.d;
import ee3.d$a;
import nsd.u;
import com.kuaishou.live.livestage.a;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import brd.t;

public interface abstract d	// class@002673
{
    public static final d a;
    public static final d$a b;

    static {
       d.b = new d$a(null);
       d.a = new a();
    }
    t a(LayoutConfig p0);
    void detach();
}
