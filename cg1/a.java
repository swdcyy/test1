package cg1.a;
import c03.l;
import rz2.a;
import pz2.c;
import rz2.f;
import rz2.b;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kuaishou.live.effect.resource.download.common.e;
import pz2.a;
import zz2.d;
import java.util.List;
import java.util.Collections;
import com.kwai.robust.PatchProxyResult;
import sz2.b;

public class a extends a implements l	// class@0004ad
{

    public void a(c p0,f p1,b p2){
       super(p0, p1, p2);
    }
    public void a(String p0,int p1,Throwable p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "5")) {
          return;
       }
       if (p1 != 100) {
          if (p1 != 0x2719) {
             switch (p1){
                 case 0x2712:
                   p0 = "NETWORK_UNAVAILABLE";
                   break;
                 case 0x2713:
                   p0 = "SERVER_GIFT_NOT_EXIST";
                   break;
                 case 0x2714:
                   p0 = "MAGIC_GIFT_LIST_REQUEST_ERR";
                   break;
                 default:
                   p0 = "DOWNLOAD_ERR";
             }
          }else {
             p0 = "DEPEND_RESOURCE_DOWNLOAD_ERR";
          }
       }else {
          p0 = "DOWNLOAD_CANCEL";
       }
       this.c.a(this, p0, p2);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       e.b().Xk(this.f(), this);
       e.b().hl(String.valueOf(this.c().b()));
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       e.b().Qg(this.f(), this);
       e.b().Go(Collections.singletonList(new d(this.c())), 10);
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.c.b(this);
       return;
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c().I().d();
    }
}
