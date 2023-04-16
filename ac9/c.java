package ac9.c;
import erd.o;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import okhttp3.MultipartBody$Part;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import ssb.e;
import ssb.f;
import w3b.l;
import w3b.q;
import brd.t;
import cjd.e;
import ac9.b;
import erd.g;

public final class c implements o	// class@00007b
{
    public final AssistantDataHelper b;
    public final MultipartBody$Part c;
    public final int d;
    public final String e;
    public final int f;

    public void c(AssistantDataHelper p0,MultipartBody$Part p1,int p2,String p3,int p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public Object apply(Object p0){
       Object obj = p0;
       p0 = PatchProxy.applyOneRefs(obj, this, c.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          a.p(obj, "cpu");
          p0 = f.a().e(this.c, this.d, this.e, this.f, l.e(), q.d, obj).map(new e()).doOnNext(new b(this));
       }
       return p0;
    }
}
