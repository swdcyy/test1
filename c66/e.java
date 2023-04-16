package c66.e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import c66.h;
import com.kwai.framework.config.NetworkResponse;
import com.kwai.framework.config.NetworkResponse$Status;
import fg6.a;
import java.lang.String;
import com.google.gson.Gson;
import k2b.u1;

public final class e implements g	// class@000655
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       p0 = new NetworkResponse();
       p0.mStatus = NetworkResponse$Status.FAILURE;
       p0.mApi = "rest/system/stat";
       p0.mRatio = "1";
       u1.Q("apiStatus", a.a.q(p0));
    }
}
