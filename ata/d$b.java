package ata.d$b;
import java.util.concurrent.Callable;
import ata.d;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.kcube.TabViewInfo$TabLottie;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import com.kwai.component.kcube.model.startup.c;
import java.io.File;
import qkd.b;

public final class d$b implements Callable	// class@0002f8
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public Object call(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       TabViewInfo$TabLottie obj = PatchProxy.apply(objArray, this, d$b.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = d.b(this.b).mTabLottieUrl;
          a.o(obj, "mTabLottie.mTabLottieUrl");
          List list = ArraysKt___ArraysKt.Ey(obj);
          Object obj1 = PatchProxy.applyOneRefs(list, objArray, c.class, "8");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             File uFile = c.b(list);
             String str = (uFile == null)? "": b.f0(uFile);
             obj = str;
          }
       }
       return obj;
    }
}
