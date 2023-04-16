package fhd.a;
import jhc.b;
import jhc.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import com.yxcorp.gifshow.settings.stencil.entity.SettingGroupStencil;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wh5.c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import jhc.c;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import ehd.a;
import ehc.f;
import com.yxcorp.gifshow.settings.stencil.entity.SettingLocalizedString;

public final class a implements b	// class@000e3a
{
    public final d a;

    public void a(d p0){
       a.p(p0, "itemStencilParser");
       super();
       this.a = p0;
    }
    public List e(BaseFragment p0,Object p1,String p2){
       List list = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          a.p(p0, "targetFragment");
          a.p(p1, "data");
          String str = "pageKey";
          a.p(p2, str);
          if (!p1.getTeenagerModeEnable() && c.b()) {
             list = CollectionsKt__CollectionsKt.E();
          }else {
             ArrayList uArrayList = new ArrayList();
             List items = p1.getItems();
             a uoa = (items == null || items.isEmpty())? 1: null;
             f uof = null;
             if (uoa) {
                items = uof;
             }
             if (items != null) {
                Iterator iterator = items.iterator();
                while (iterator.hasNext()) {
                   uArrayList.addAll(this.a.e(p0, iterator.next(), p2));
                }
             }else {
                i3 oi3 = i3.f();
                oi3.d("type", "group_items_empty");
                oi3.d(str, TextUtils.k(p2));
                oi3.d("groupKey", TextUtils.k(p1.getGroupKey()));
                String str1 = oi3.e();
                a.o(str1, "JsonStringBuilder.newIns¡­pKey\)\)\n          .build\(\)");
                a.c("settings_stencil_error", str1);
             }
             if (uArrayList.isEmpty() ^ 1) {
                f uof1 = PatchProxy.applyOneRefs(p1, this, a.class, "2");
                if (uof1 != PatchProxyResult.class) {
                }else {
                   SettingLocalizedString title = p1.getTitle();
                   if (title != null) {
                      uof = new f(title.getString());
                   }
                   uof1 = uof;
                }
                if (uof1 != null) {
                   uArrayList.add(0, uof1);
                }
             }
             list = uArrayList;
          }
       }
       return list;
    }
}
