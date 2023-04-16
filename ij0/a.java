package ij0.a;
import nu6.a;
import java.lang.Object;
import iu6.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.io.File;
import com.kuaishou.krn.experiment.ExpConfigKt;
import qrd.p;
import y56.a;

public final class a implements a	// class@0028fe
{

    public void a(){
       super();
    }
    public boolean a(a p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Boolean obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "bundleInfo");
       File uFile = new File(new File(p0.e()), "resource.tex");
       boolean b = false;
       if (!uFile.isFile()) {
          return b;
       }
       obj = PatchProxy.apply(null, null, ExpConfigKt.class, "45");
       if (obj == patchProxyRe) {
          obj = ExpConfigKt.R.getValue();
       }
       if (!obj.booleanValue()) {
          return true;
       }else if(a.c(uFile) > 0){
          b = true;
       }
       return b;
    }
}
