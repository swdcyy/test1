package fhd.i;
import jhc.i;
import jhc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import com.yxcorp.gifshow.settings.stencil.entity.SettingPageStencil;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import java.util.ArrayList;
import com.yxcorp.gifshow.settings.stencil.entity.SettingGroupStencil;
import jhc.c;
import com.yxcorp.gifshow.settings.stencil.entity.SettingLocalizedString;
import ehc.e;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import ehd.a;

public final class i implements i	// class@000e44
{
    public final b a;
    public final boolean b;

    public void i(b p0,boolean p1){
       a.p(p0, "groupStencilParser");
       super();
       this.a = p0;
       this.b = p1;
    }
    public List e(BaseFragment p0,Object p1,String p2){
       int i;
       int i3;
       List list = PatchProxy.applyThreeRefs(p0, p1, p2, this, i.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          a.p(p0, "targetFragment");
          a.p(p1, "data");
          String str = "pageKey";
          a.p(p2, str);
          if (p0.getActivity() == null) {
             list = CollectionsKt__CollectionsKt.E();
          }else {
             p1 = p1.getGroups();
             i = 0;
             ArrayList uArrayList = (p1 == null || p1.isEmpty())? 1: null;
             if (uArrayList) {
                p1 = null;
             }
             if (p1 != null) {
                int i1 = p1.size();
                uArrayList = new ArrayList();
                int i2 = p1.size();
                while (i < i2) {
                   List list1 = this.a.e(p0, p1.get(i), p2);
                   i3 = list1.isEmpty() ^ 1;
                   if (i3) {
                      uArrayList.addAll(list1);
                      if (this.b != null) {
                         int i4 = i1 - 1;
                         if (i != i4) {
                            i4 = i + 1;
                            if (p1.get(i4).getTitle() != null) {
                               uArrayList.add(new e());
                            }
                         }
                      }
                   }
                   i = i + 1;
                }
                list = uArrayList;
             }else {
                i3 oi3 = i3.f();
                oi3.d("type", "groups_empty");
                oi3.d(str, TextUtils.k(p2));
                String str1 = oi3.e();
                a.o(str1, "JsonStringBuilder.newIns¡­eKey\)\)\n          .build\(\)");
                a.c("settings_stencil_error", str1);
                list = CollectionsKt__CollectionsKt.E();
             }
          }
       }
       return list;
    }
}
