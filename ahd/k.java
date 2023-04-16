package ahd.k;
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
import com.yxcorp.plugin.setting.stencil.item.RenWoKanItem;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.kwai.framework.preference.startup.KcardBookInfo;
import oe6.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.settings.stencil.entity.action.SettingPageAction;
import com.yxcorp.gifshow.settings.stencil.entity.action.SettingItemActionType;
import com.yxcorp.gifshow.settings.stencil.entity.SettingLocalizedString;
import hhc.a;

public final class k implements f	// class@00003f
{
    public final String a;

    public void k(){
       super();
       this.a = SettingItem.REN_WO_KAN.getKey();
    }
    public b a(BaseFragment p0,SettingItemStencil p1){
       RenWoKanItem renWoKanItem = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "1");
       if (renWoKanItem != PatchProxyResult.class) {
       }else {
          a.p(p0, "targetFragment");
          a.p(p1, "data");
          renWoKanItem = new RenWoKanItem(p0, p1);
       }
       return renWoKanItem;
    }
    public String b(){
       return this.a;
    }
    public boolean c(SettingItemStencil p0){
       KcardBookInfo obj = PatchProxy.applyOneRefs(p0, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       obj = KcardBookInfo.class;
       String str = "";
       String str1 = b.a.getString("renwokan_book_info", str);
       obj = (str1 == null || str1 == str)? null: b.a(str1, obj);
       if (obj != null && (TextUtils.isEmpty(obj.mTitle) || TextUtils.isEmpty(obj.mUrl))) {
          return false;
       }else {
          p0.setAction(new SettingPageAction(SettingItemActionType.Page, obj.mUrl));
          obj = obj.mTitle;
          a.o(obj, "info.mTitle");
          p0.setTitle(a.a(obj));
          return true;
       }
    }
}
