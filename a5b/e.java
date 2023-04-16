package a5b.e;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.util.ArrayList;

public final class e	// class@00004a
{
    public static final ConcurrentHashMap a;
    public static final e b;

    static {
       e.b = new e();
       e.a = new ConcurrentHashMap();
    }
    public void e(){
       super();
    }
    public final List a(MagicBusinessId p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "businessId");
       List list = e.a.get(Integer.valueOf(p0.mId));
       if (list == null) {
          list = new ArrayList();
       }
       return list;
    }
}
