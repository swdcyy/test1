package ggd.e;
import im8.g;
import com.yxcorp.plugin.setting.fragment.AtTabPrivateWorksSettingFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ggd.h;
import java.util.Map;
import java.util.HashMap;

public final class e implements g	// class@000f15
{
    public final AtTabPrivateWorksSettingFragment b;

    public void e(AtTabPrivateWorksSettingFragment p0){
       a.p(p0, "mHost");
       super();
       this.b = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new h());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
}
