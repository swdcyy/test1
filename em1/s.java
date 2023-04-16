package em1.s;
import em1.t;
import java.lang.Object;
import ok.x;
import com.kwai.framework.model.router.RouteType;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;
import wkd.b;
import ia0.g;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import java.lang.Class;
import com.yxcorp.retrofit.e;

public final class s	// class@0021c5
{

    static {
    }
    public static t a(){
       return s.c();
    }
    public static t b(){
       return t.a.get();
    }
    public static t c(){
       RouteType lIVE = RouteType.LIVE;
       b.Z(LiveLogTag.GIFT, "[LiveGiftStoreApiService][sApiSupplier]routeType:"+lIVE);
       return e.b(b.a(-1961311520).a(lIVE, d.b), t.class);
    }
}
