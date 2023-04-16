package eca.f;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.a;

public final class f	// class@00210b
{

    public static final List a(CDNUrl[] p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p0 == null) {
          return obj;
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          String url = p0[i].getUrl();
          a.o(url, "cdnUrl.url");
          obj.add(url);
       }
       return obj;
    }
}
