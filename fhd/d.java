package fhd.d;
import jhc.d;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.String;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wh5.c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencilType;
import fhd.c;
import java.lang.Enum;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import ehd.a;
import ehc.c;
import ihc.a;
import lhc.a;
import java.util.ArrayList;

public class d implements d	// class@000e3d
{

    public void d(){
       super();
    }
    public List c(BaseFragment p0,SettingItemStencil p1,String p2){
       object oobject;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       obj = "pageKey";
       a.p(p2, obj);
       if (!p1.getTeenagerModeEnable() && c.b()) {
          return CollectionsKt__CollectionsKt.E();
       }
       int i = c.a[p1.getItemType().ordinal()];
       if (i != 1) {
          if (i != 2) {
             i3 oi3 = i3.f();
             oi3.d("type", "item_type_not_support");
             oi3.d(obj, TextUtils.k(p2));
             oi3.d("itemKey", TextUtils.k(p1.getItemKey()));
             String str = oi3.e();
             a.o(str, "JsonStringBuilder.newIns¡­ey\)\)\n            .build\(\)");
             a.c("settings_stencil_error", str);
          }
          oobject = null;
       }else {
          oobject = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "2");
          if (oobject != patchProxyRe) {
          }else {
             oobject = new a(p0, p1);
          }
       }
       c[] uocArray = new c[]{oobject};
       int i1 = 0;
       ArrayList uArrayList = PatchProxy.applyOneRefs(uocArray, null, a.class, "1");
       if (uArrayList != patchProxyRe) {
       }else {
          a.p(uocArray, "elements");
          uArrayList = new ArrayList();
          while (i1 < 1) {
             object oobject1 = uocArray[i1];
             if (oobject1 != null) {
                uArrayList.add(oobject1);
             }
             i1++;
          }
       }
       return uArrayList;
    }
    public List e(BaseFragment p0,Object p1,String p2){
       return this.c(p0, p1, p2);
    }
}
