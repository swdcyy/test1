package a96.o;
import erd.g;
import com.kwai.framework.krn.init.preload.e;
import com.kwai.framework.krn.init.network.RequestConfig;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import c96.a;
import java.lang.String;
import q87.c;
import com.yxcorp.retrofit.model.RetrofitException;
import okhttp3.Request;
import retrofit2.HttpException;
import retrofit2.p;
import okhttp3.Response;

public final class o implements g	// class@000051
{
    public final e b;
    public final RequestConfig c;
    public final LaunchModel d;
    public final long e;

    public void o(e p0,RequestConfig p1,LaunchModel p2,long p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       o tb = this.b;
       o tc = this.c;
       o td = this.d;
       o te = this.e;
       Throwable throwable = p0;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().t("KrnNetwork", throwable.getMessage(), objArray);
       if (throwable instanceof RetrofitException) {
          tb.i(tc, throwable.mRequest, td, te, throwable);
       }else if(throwable instanceof HttpException){
          p0 = throwable;
          if (p0.response() != null && p0.response().g() != null) {
             tb.i(tc, p0.response().g().request(), td, te, throwable);
          }
       }
       tb.i(tc, null, td, te, throwable);
       return;
    }
}
