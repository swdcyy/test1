package b00.d;
import erd.g;
import b00.f;
import oo8.o;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import java.lang.String;
import com.tachikoma.core.component.network.TKNetErrorInfo;
import com.tachikoma.core.component.network.TKNetErrorInfo$SubErrorInfo;
import com.tachikoma.core.component.network.TKNetResponse;
import com.yxcorp.retrofit.model.RetrofitException;
import aegon.chrome.net.NetworkException;
import com.yxcorp.utility.Log;

public final class d implements g	// class@00022b
{
    public final f b;
    public final o c;

    public void d(f p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       int i = -1000;
       if (p0 instanceof KwaiException) {
          KwaiException kwaiExceptio = p0;
          if (kwaiExceptio.mResponse.a() instanceof String) {
             TKNetErrorInfo tKNetErrorIn = new TKNetErrorInfo(i, f.q(i, p0.getMessage()));
             p0 = new TKNetErrorInfo$SubErrorInfo();
             p0.code = kwaiExceptio.mErrorCode;
             p0.message = kwaiExceptio.mErrorMessage;
             tKNetErrorIn.apiErrorInfo = p0;
             tc.a(null, tKNetErrorIn);
          }
       }else if(p0 instanceof RetrofitException){
          RetrofitException mCause = p0.mCause;
          if (mCause instanceof NetworkException) {
             tc.a(null, tb.p(p0, mCause));
             Log.e("TKNetworkService", p0.getMessage(), p0);
          }
       }
       tb.u(tc, i, p0, p0.getMessage());
       return;
    }
}
