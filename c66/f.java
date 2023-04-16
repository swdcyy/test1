package c66.f;
import erd.g;
import java.lang.Object;
import com.google.gson.JsonObject;
import c66.h;
import wkd.b;
import ia0.g;
import java.util.Random;
import com.kwai.framework.config.NetworkResponse;
import com.kwai.framework.config.NetworkResponse$Status;
import java.lang.String;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;

public final class f implements g	// class@000656
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void accept(Object p0){
       float f = b.a(-1961311520).b();
       if (h.a.nextFloat() - f <= 0) {
          NetworkResponse networkRespo = new NetworkResponse();
          networkRespo.mStatus = NetworkResponse$Status.SUCCESS;
          networkRespo.mApi = "rest/system/stat";
          networkRespo.mRatio = String.valueOf(f);
          u1.Q("apiStatus", a.a.q(networkRespo));
       }
       return;
    }
}
