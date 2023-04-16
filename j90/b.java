package j90.b;
import qvb.f;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import u80.e;
import q87.c;
import i90.a;
import i90.b;
import java.lang.Long;
import qvb.n0;
import com.kuaishou.gifshow.kuaishan.network.KSTemplateFriendVideoListResponse;
import cjd.e;
import erd.o;

public final class b extends f	// class@002242
{
    public final String p;

    public void b(String p0){
       a.p(p0, "templateId");
       super();
       this.p = p0;
    }
    public t I1(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray1 = new Object[0];
       e.D().w("KSFriendFeedPageList", "onCreateRequest", objArray1);
       obj = b.a();
       long l = Long.parseLong(this.p);
       if (!this.K()) {
          KSTemplateFriendVideoListResponse kSTemplateFr = this.L0();
          if (kSTemplateFr != null) {
             objArray = kSTemplateFr.getMPcursor();
          }
       }
       t ot = obj.m(l, 20, objArray).map(new e());
       a.o(ot, "KSApiServiceManager.getA¡­\).map\(ResponseFunction\(\)\)");
       return ot;
    }
}
