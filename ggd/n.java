package ggd.n;
import im8.g;
import com.yxcorp.plugin.setting.fragment.UpdatesSettingPrivacyFragment;
import java.lang.Object;
import com.kwai.framework.model.user.QCurrentUser;
import io.reactivex.subjects.PublishSubject;
import ggd.m;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ggd.u;
import java.util.Map;
import java.util.HashMap;

public final class n implements g	// class@000f1e
{
    public final UpdatesSettingPrivacyFragment b;
    public final g c;
    public final int d;
    public final PublishSubject e;
    public final int f;

    public void n(UpdatesSettingPrivacyFragment p0){
       super();
       this.b = p0;
       this.d = QCurrentUser.ME.getNewsPrivate();
       this.f = QCurrentUser.ME.getPrivateNewsBlackCount();
       this.e = PublishSubject.g();
       this.c = m.b;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(n.class, new u());
       }else {
          obj.put(n.class, null);
       }
       return obj;
    }
}
