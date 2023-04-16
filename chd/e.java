package chd.e;
import jhc.f;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import ehc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.setting.stencil.item.logout.LogoutItem;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import jhc.f$a;

public final class e implements f	// class@00032d
{
    public final String a;

    public void e(){
       super();
       this.a = "log_out";
    }
    public b a(BaseFragment p0,SettingItemStencil p1){
       LogoutItem logoutItem = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (logoutItem != PatchProxyResult.class) {
       }else {
          a.p(p0, "targetFragment");
          a.p(p1, "data");
          logoutItem = new LogoutItem(p0, p1);
       }
       return logoutItem;
    }
    public String b(){
       return this.a;
    }
    public boolean c(SettingItemStencil p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       return f$a.a(this, p0);
    }
}
