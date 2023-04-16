package b66.g;
import erd.g;
import java.lang.Object;
import com.google.gson.JsonObject;
import b66.k;
import wkd.b;
import ia0.g;
import java.util.Random;
import com.kwai.framework.config.NetworkResponse;
import com.kwai.framework.config.NetworkResponse$Status;
import java.lang.String;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;

public final class g implements g	// class@000420
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void accept(Object p0){
       float f = b.a(-1961311520).b();
       if (k.b.nextFloat() - f <= 0) {
          NetworkResponse networkRespo = new NetworkResponse();
          networkRespo.mStatus = NetworkResponse$Status.SUCCESS;
          networkRespo.mApi = "rest/system/startup";
          networkRespo.mRatio = String.valueOf(f);
          u1.Q("apiStatus", a.a.q(networkRespo));
       }
       return;
    }
}
