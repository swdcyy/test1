package bz1.b;
import bz1.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kuaishou.live.common.core.component.wishroom.LiveAudienceWishDetail;
import lp3.e;
import lp3.c;
import lp3.b;

public class b implements a	// class@000439
{
    public a b;

    public void b(a p0){
       super();
       this.b = p0;
    }
    public void Ji(String p0,long p1,String p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          tb.Ji(p0, p1, p2);
       }
       return;
    }
    public void cl(LiveAudienceWishDetail p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          tb.cl(p0);
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void oc(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "3")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          tb.oc(p0, p1, p2);
       }
       return;
    }
}
