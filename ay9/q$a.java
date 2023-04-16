package ay9.q$a;
import qp7.y0;
import ay9.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import b8a.k1;

public class q$a extends y0	// class@000306
{
    public final q a;

    public void q$a(q p0){
       this.a = p0;
       super();
    }
    public void c(boolean p0){
       q$a uoa = q$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       q$a ta = this.a;
       ta.t = false;
       ta.K = false;
       Object obj = null;
       Objects.requireNonNull(ta);
       q oq = q.class;
       if (!PatchProxy.applyVoidOneRefs(obj, ta, oq, "9") && ta.t == null) {
          obj = PatchProxy.applyOneRefs(obj, ta, oq, "10");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): k1.a(ta.v.getCaption()) ^ true;
          if (b) {
             ta.t = true;
             ta.y0();
          }
       }
    label_0054 :
       return;
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport(q$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, q$a.class, "4")) {
          return;
       }
       this.a.z0();
       return;
    }
    public void g(){
       PatchProxy.applyVoid(null, this, q$a.class, "2");
    }
    public void h(){
       PatchProxy.applyVoid(null, this, q$a.class, "1");
    }
}
