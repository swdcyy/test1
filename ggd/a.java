package ggd.a;
import im8.g;
import com.yxcorp.plugin.setting.fragment.AlbumSettingFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ggd.d;
import java.util.Map;
import java.util.HashMap;

public class a implements g	// class@000f11
{
    public final AlbumSettingFragment b;

    public void a(AlbumSettingFragment p0){
       super();
       this.b = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
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
