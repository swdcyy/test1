package i90.f;
import n46.a;
import java.lang.Object;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i90.g;
import i90.b;
import java.util.List;
import java.lang.Integer;

public final class f implements a	// class@00218e
{

    public void f(){
       super();
    }
    public t b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "renderId");
       t ot = b.b().b(p0);
       a.o(ot, "KSApiServiceManager.getP¡­erationDownload\(renderId\)");
       return ot;
    }
    public t c(List p0,String p1,String p2,String p3,int p4){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "fileKeys");
       a.p(p1, "id");
       a.p(p2, "actionMode");
       a.p(p3, "text");
       t ot = b.b().c(p0, p1, p2, p3, p4);
       a.o(ot, "KSApiServiceManager.getP¡­   text, uploadType\n    \)");
       return ot;
    }
    public t d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "renderId");
       t ot = b.b().d(p0);
       a.o(ot, "KSApiServiceManager.getP¡­enerationStatus\(renderId\)");
       return ot;
    }
    public t e(int p0){
       t ot;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p0) {
          ot = b.b().a();
          a.o(ot, "KSApiServiceManager.getP¡­Service\(\).uploadPrepare\(\)");
       }else {
          ot = b.b().e(p0);
          a.o(ot, "KSApiServiceManager.getP¡­loadPrepare\(numToProcess\)");
       }
       return ot;
    }
}
