package en9.a;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import kp.y1;

public final class a implements g	// class@00221e
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.o(p0, "it");
          y1.g(p0.getItems(), 7, p0.mLlsid);
       }
       return;
    }
}
