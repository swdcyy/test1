package ahd.j;
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
import com.yxcorp.plugin.setting.stencil.item.QuickOrderItem;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import jhc.f$a;

public final class j implements f	// class@00003e
{
    public final String a;

    public void j(){
       super();
       this.a = SettingItem.QUICK_ORDER.getKey();
    }
    public b a(BaseFragment p0,SettingItemStencil p1){
       QuickOrderItem quickOrderIt = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "1");
       if (quickOrderIt != PatchProxyResult.class) {
       }else {
          a.p(p0, "targetFragment");
          a.p(p1, "data");
          quickOrderIt = new QuickOrderItem(p0, p1);
       }
       return quickOrderIt;
    }
    public String b(){
       return this.a;
    }
    public boolean c(SettingItemStencil p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       return f$a.a(this, p0);
    }
}
