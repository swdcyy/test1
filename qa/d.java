package qa.d;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import kotlin.jvm.internal.a;
import yx.j0;
import com.yxcorp.retrofit.model.RetrofitException;
import ox8.e;
import com.yxcorp.gifshow.entity.QPhoto;
import s49.b;
import com.yxcorp.gifshow.ad.response.InstreamAdResponse;
import nsd.u;

public final class d implements o	// class@0029b8
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       j0.b("AdBaseDataRequester", "request diverse ad error", p0);
       int i = (p0 instanceof RetrofitException)? 3: -4;
       p0 = p0.getMessage();
       if (p0 == null) {
          p0 = "";
       }
       e uoe = new e(false, null, i, null, null, p0, 0, 90, null);
       return v0;
    }
}
