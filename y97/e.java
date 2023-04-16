package y97.e;
import erd.o;
import com.kwai.middleware.azeroth.sdk.SDKHandler;
import java.lang.String;
import java.lang.Object;
import l97.c;
import kotlin.jvm.internal.a;

public final class e implements o	// class@002866
{
    public final SDKHandler b;
    public final String c;

    public void e(SDKHandler p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       a.q(p0, "it");
       return this.b.b(this.c);
    }
}
