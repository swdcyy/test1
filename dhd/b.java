package dhd.b;
import jhc.g;
import java.lang.Object;
import com.yxcorp.plugin.setting.stencil.config.SettingItem;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import ehc.b;
import dhd.a;
import bgd.d;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import ayb.i;
import com.yxcorp.plugin.setting.stencil.item.storage.CleanerItem;
import jhc.g$a;
import jhc.a;
import jhc.a$a;

public final class b implements g	// class@000cca
{
    public final String a;

    public void b(){
       super();
       this.a = SettingItem.STORAGE.getKey();
    }
    public List a(BaseFragment p0,SettingItemStencil p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, uob, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       obj = new ArrayList();
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, this, uob, "3");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = PatchProxy.applyTwoRefs(p0, p1, this, uob, "4");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = new a(p0, p1);
          }
       }
       if (obj1 != null) {
          obj.add(obj1);
       }
       Object[] objArray = PatchProxy.applyTwoRefs(p0, p1, this, uob, "2");
       if (objArray != patchProxyRe) {
       }else {
          CleanerItem obj2 = PatchProxy.apply(null, null, d.class, "1");
          b = (obj2 != patchProxyRe)? obj2.booleanValue(): d.a(0x4f878389).Pe(2);
          if (!b) {
             objArray = null;
          }else {
             obj2 = new CleanerItem(p0, p1);
          }
       }
       if (objArray != null) {
          obj.add(objArray);
       }
       return obj;
    }
    public String b(){
       return this.a;
    }
    public boolean c(SettingItemStencil p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, g$a.class, "1");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "data");
          b = a$a.a(this, p0);
       }
       return b;
    }
}
