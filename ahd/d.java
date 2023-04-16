package ahd.d;
import jhc.f;
import java.lang.Object;
import com.yxcorp.plugin.setting.stencil.config.SettingItem;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import ehc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.setting.stencil.item.FansTopItem;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import jhc.f$a;

public final class d implements f	// class@000036
{
    public final String a;

    public void d(){
       super();
       this.a = SettingItem.FAN_TOP.getKey();
    }
    public b a(BaseFragment p0,SettingItemStencil p1){
       FansTopItem uFansTopItem = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (uFansTopItem != PatchProxyResult.class) {
       }else {
          a.p(p0, "targetFragment");
          a.p(p1, "data");
          uFansTopItem = new FansTopItem(p0, p1);
       }
       return uFansTopItem;
    }
    public String b(){
       return this.a;
    }
    public boolean c(SettingItemStencil p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       return f$a.a(this, p0);
    }
}
