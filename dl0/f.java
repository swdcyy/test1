package dl0.f;
import hn5.l;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dl0.e;
import gl0.a;
import q87.c;
import tkd.b;
import tkd.d;
import hn5.k;
import com.kuaishou.life_plugin_common.fragment.LifeProxyFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.i;
import kotlin.jvm.internal.a;

public class f implements l	// class@001fb6
{
    public final String b;

    public void f(){
       super();
       this.b = "LifeProxyPluginImpl";
    }
    public BaseFragment Nw(){
       Object[] objArray;
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (e.a()) {
          objArray = new Object[i];
          a.C().w(this.b, "plugin is Installed", objArray);
          return d.a(-119680890).Nw();
       }else {
          objArray = new Object[i];
          a.C().w(this.b, "plugin is not Installed", objArray);
          return new LifeProxyFragment();
       }
    }
    public boolean isAvailable(){
       return true;
    }
    public i j00(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "photo");
       if (e.a()) {
          return d.a(-119680890).j00(p0);
       }
       return null;
    }
}
