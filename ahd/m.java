package ahd.m;
import jhc.f;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import ehc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.setting.stencil.item.SwitchAccountItem;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import wh5.c;

public final class m implements f	// class@000041
{
    public final String a;

    public void m(){
       super();
       this.a = "switch_account";
    }
    public b a(BaseFragment p0,SettingItemStencil p1){
       SwitchAccountItem switchAccoun = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "2");
       if (switchAccoun != PatchProxyResult.class) {
       }else {
          a.p(p0, "targetFragment");
          a.p(p1, "data");
          switchAccoun = new SwitchAccountItem(p0, p1);
       }
       return switchAccoun;
    }
    public String b(){
       return this.a;
    }
    public boolean c(SettingItemStencil p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       return c.n();
    }
}
