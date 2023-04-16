package ahd.f;
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
import com.yxcorp.plugin.setting.stencil.item.FontItem;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import jhc.f$a;

public final class f implements f	// class@000038
{
    public final String a;

    public void f(){
       super();
       this.a = SettingItem.FONT.getKey();
    }
    public b a(BaseFragment p0,SettingItemStencil p1){
       FontItem uFontItem = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (uFontItem != PatchProxyResult.class) {
       }else {
          a.p(p0, "targetFragment");
          a.p(p1, "data");
          uFontItem = new FontItem(p0, p1);
       }
       return uFontItem;
    }
    public String b(){
       return this.a;
    }
    public boolean c(SettingItemStencil p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       return f$a.a(this, p0);
    }
}
