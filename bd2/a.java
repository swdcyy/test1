package bd2.a;
import im8.g;
import c12.f;
import kv1.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import bd2.d;
import java.util.Map;
import java.util.HashMap;

public class a extends f implements g	// class@0003e2
{
    public final a$a K;
    public a L;
    public static String sLivePresenterClassName = "LiveAudiencePassiveDialogPresenter";

    public void a(){
       super();
       a$a uoa = new a$a();
       this.K = uoa;
       this.L = uoa;
    }
    public void Q(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       a tK = this.K;
       Objects.requireNonNull(tK);
       if (!PatchProxy.applyVoid(null, tK, a$a.class, "3")) {
          tK.a.clear();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
