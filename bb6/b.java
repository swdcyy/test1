package bb6.b;
import bb6.b$a;
import nsd.u;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import bjd.a;
import java.lang.Exception;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.retrofit.model.RetrofitException;
import retrofit2.HttpException;
import aegon.chrome.net.NetworkException;

public final class b	// class@000453
{
    public Exception a;
    public final a b;
    public static final List c;
    public static final b$a d;

    static {
       b.d = new b$a(null);
       Integer[] integerArray = new Integer[]{Integer.valueOf(-3),Integer.valueOf(-106)};
       b.c = CollectionsKt__CollectionsKt.L(integerArray);
    }
    public void b(int p0){
       super();
       this.b = new a(p0, false, 2, null);
    }
    public void b(Exception p0){
       a uoa;
       a.p(p0, "exception");
       super();
       this.a = p0;
       u ou = null;
       if (p0 instanceof RetrofitException) {
          uoa = new a(p0.mResponseCode, false, 2, ou);
       }else if(p0 instanceof HttpException){
          uoa = new a(p0.code(), false, 2, ou);
       }else if(p0 instanceof NetworkException){
          uoa = new a(p0, (b.c.contains(Integer.valueOf(p0.getCronetInternalErrorCode())) ^ 0x01));
       }else {
          uoa = new a(p0, false);
       }
       this.b = uoa;
       return;
    }
    public final a a(){
       return this.b;
    }
}
