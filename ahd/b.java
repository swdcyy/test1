package ahd.b;
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
import com.yxcorp.plugin.setting.stencil.item.DarkModeItem;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import zf6.i;

public final class b implements f	// class@000034
{
    public final String a;

    public void b(){
       super();
       this.a = SettingItem.DARK.getKey();
    }
    public b a(BaseFragment p0,SettingItemStencil p1){
       DarkModeItem uDarkModeIte = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "2");
       if (uDarkModeIte != PatchProxyResult.class) {
       }else {
          a.p(p0, "targetFragment");
          a.p(p1, "data");
          uDarkModeIte = new DarkModeItem(p0, p1);
       }
       return uDarkModeIte;
    }
    public String b(){
       return this.a;
    }
    public boolean c(SettingItemStencil p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       return i.a();
    }
}
