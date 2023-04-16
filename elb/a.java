package elb.a;
import java.lang.Cloneable;
import elb.a$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.Data;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;

public final class a implements Cloneable	// class@00273a
{
    public final Data data;
    public final int reqType;
    public static final a$a b;

    static {
       a.b = new a$a(null);
    }
    public void a(String p0,long p1){
       a.p(p0, "objectID");
       super();
       this.reqType = 1500;
       this.data = new Data(p0, p1);
    }
    public final Data a(){
       return this.data;
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = super.clone();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.model.ActivityCount");
       }
       return obj;
    }
}
