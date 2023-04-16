package baa.d;
import java.lang.Object;
import java.lang.String;
import daa.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.lang.Long;
import kotlin.jvm.internal.a;

public final class d	// class@000430
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public static final d a(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uod, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       long l = System.currentTimeMillis();
       if (PatchProxy.isSupport(uod)) {
          uod = PatchProxy.applyTwoRefs(p0, Long.valueOf(l), null, uod, "1");
          if (uod != patchProxyRe) {
          label_0033 :
             return uod;
          }
       }
       a.p(p0, "text");
       uod = new d(p0, l);
       goto label_0033 ;
    }
}
