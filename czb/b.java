package czb.b;
import java.util.HashSet;
import java.lang.Object;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.google.gson.JsonArray;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.upload.UploadRequest;

public final class b	// class@00209f
{
    public static e a;
    public static HashSet b;
    public static final b c;

    static {
       b.c = new b();
       b.b = new HashSet();
    }
    public void b(){
       super();
    }
    public final void a(UploadRequest$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.p(p0, "builder");
       if (b.b.isEmpty()) {
          return;
       }
       JsonArray jsonArray = new JsonArray();
       Iterator iterator = b.b.iterator();
       while (iterator.hasNext()) {
          jsonArray.a0(iterator.next());
       }
       p0.mUsedPostFeatures = jsonArray;
       return;
    }
}
