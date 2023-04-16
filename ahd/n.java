package ahd.n;
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
import com.yxcorp.plugin.setting.stencil.item.WangCardItem;
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
import com.yxcorp.gifshow.settings.SettingItem;
import java.lang.Enum;

public final class n implements f	// class@000042
{
    public final String a;

    public void n(){
       super();
       this.a = SettingItem.WANG_CARD.getKey();
    }
    public b a(BaseFragment p0,SettingItemStencil p1){
       WangCardItem wangCardItem = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "1");
       if (wangCardItem != PatchProxyResult.class) {
       }else {
          a.p(p0, "targetFragment");
          a.p(p1, "data");
          wangCardItem = new WangCardItem(p0, p1);
       }
       return wangCardItem;
    }
    public String b(){
       return this.a;
    }
    public boolean c(SettingItemStencil p0){
       KcardBookInfo obj = PatchProxy.applyOneRefs(p0, this, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       obj = KcardBookInfo.class;
       String str = "";
       String str1 = b.a.getString("kcard_book_info", str);
       obj = (str1 == null || str1 == str)? null: b.a(str1, obj);
       if (obj != null && (TextUtils.isEmpty(obj.mTitle) || TextUtils.isEmpty(obj.mUrl))) {
          return false;
       }else {
          p0.setAction(new SettingPageAction(SettingItemActionType.Page, obj.mUrl));
          KcardBookInfo mTitle = obj.mTitle;
          a.o(mTitle, "info.mTitle");
          p0.setTitle(a.a(mTitle));
          String str2 = (TextUtils.isEmpty(obj.mProductName))? SettingItem.WANG_CARD_GET_MONEY.name(): obj.mProductName;
          p0.setItemLogName(str2);
          return true;
       }
    }
}
