package m69.b;
import j69.d;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostUtils;
import wkd.b;
import j80.c;

public final class b implements d	// class@002e12
{

    public void b(){
       super();
    }
    public File a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subPath");
       File uFile = PostUtils.p(p0);
       a.o(uFile, "PostUtils.getSubCacheDir\(subPath\)");
       return uFile;
    }
    public File getDirInRoot(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subPath");
       return b.a(-1504323719).h(p0);
    }
}
