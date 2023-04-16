package fhd.h$a;
import fhd.h;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import wh5.c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.StringBuilder;
import ehd.a;

public final class h$a	// class@000e42
{

    public static List a(h p0,BaseFragment p1,SettingItemStencil p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, h$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "targetFragment");
       a.p(p2, "data");
       a.p(p3, "pageKey");
       if (!p2.getTeenagerModeEnable() && c.b()) {
          return CollectionsKt__CollectionsKt.E();
       }
       boolean b = p0.d(p2);
       a.b("setting_stencil_offline_["+p3+'_'+p2.getItemKey()+']', "isAvailable="+b);
       if (!b) {
          return CollectionsKt__CollectionsKt.E();
       }
       return p0.a(p1, p2);
    }
}
