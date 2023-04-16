package lv8.i;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import retrofit2.HttpException;

public class i	// class@002db3
{

    public static int a(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 instanceof HttpException) {
          return p0.code();
       }
       if (p0 != null && p0.getCause() instanceof HttpException) {
          return p0.getCause().code();
       }
       if (p0 != null && (p0.getCause() != null && p0.getCause().getCause() instanceof HttpException)) {
          return p0.getCause().getCause().code();
       }
       return 0;
    }
}
