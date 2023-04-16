package bac.p$a;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bac.e0;
import java.util.Map;
import java.util.HashMap;

public class p$a implements g	// class@000417
{
    public int b;
    public d c;
    public RecoUser d;
    public BaseFragment e;
    public c f;
    public PublishSubject g;
    public PublishSubject h;
    public PublishSubject i;
    public h j;

    public void p$a(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, p$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(p$a.class, new e0());
       }else {
          obj.put(p$a.class, null);
       }
       return obj;
    }
}
