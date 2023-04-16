package e12.p;
import e12.b;
import e12.l;
import e12.c;
import e12.p$a;
import qvb.j;
import qvb.q;
import com.kuaishou.live.basic.liveslide.datasource.b;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.basic.liveslide.datasource.LiveSlideResponse;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.response.CursorResponse;
import la6.a;

public class p extends l implements b	// class@002609
{
    public c l;
    public final q m;

    public void p(c p0){
       super();
       p$a uoa = new p$a(this);
       this.m = uoa;
       this.l = p0;
       p0.g0().h(uoa);
       this.d = this.l.hasMore();
    }
    public boolean a(){
       return false;
    }
    public String f(){
       return "LiveSlidePageListAdapterSyncPageModel";
    }
    public boolean h(Object p0){
       return this.y(p0);
    }
    public List m(boolean p0,Object p1){
       return this.z(p0, p1);
    }
    public boolean n(){
       p obj = PatchProxy.apply(null, this, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.l;
       if (obj == null) {
          return false;
       }
       obj.load();
       return true;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, p.class, "4")) {
          return;
       }
       p tl = this.l;
       if (tl != null) {
          tl.g0().f(this.m);
          this.l = null;
       }
       return;
    }
    public boolean y(LiveSlideResponse p0){
       p0 = PatchProxy.applyOneRefs(p0, this, p.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       p tl = this.l;
       if (tl == null) {
          return false;
       }
       return a.a(tl.v0().getCursor());
    }
    public List z(boolean p0,LiveSlideResponse p1){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, op, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return super.z(p0, p1);
    }
}
