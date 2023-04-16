package ahd.h;
import jhc.f;
import ahd.h$b;
import nsd.u;
import ahd.h$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Object;
import com.yxcorp.plugin.setting.stencil.config.SettingItem;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import ehc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ahd.g;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.RetentionActivityModel;
import yfd.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.settings.stencil.entity.action.SettingPageAction;
import com.yxcorp.gifshow.settings.stencil.entity.action.SettingItemActionType;
import com.yxcorp.gifshow.settings.stencil.entity.SettingLocalizedString;
import hhc.a;

public final class h implements f	// class@00003c
{
    public final String a;
    public static final Type b;
    public static final h$b c;

    static {
       h.c = new h$b(null);
       h.b = new h$a().getType();
    }
    public void h(){
       super();
       this.a = SettingItem.INVITATION.getKey();
    }
    public b a(BaseFragment p0,SettingItemStencil p1){
       g og = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "1");
       if (og != PatchProxyResult.class) {
       }else {
          a.p(p0, "targetFragment");
          a.p(p1, "data");
          og = new g(p0, p1);
       }
       return og;
    }
    public String b(){
       return this.a;
    }
    public boolean c(SettingItemStencil p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, oh, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       obj = null;
       Object[] objArray = PatchProxy.apply(obj, this, oh, "3");
       if (objArray != patchProxyRe) {
       }else {
          Type b = h.b;
          String str = a.a.getString(b.d("user")+"incentive_activity", "");
          Object[] objArray1 = (str == null || str == "")? obj: b.a(str, b);
          if (objArray1 != null) {
             obj = objArray1.get("setting");
          }
          objArray = obj;
       }
       if (objArray != null && (TextUtils.x(objArray.mText) || TextUtils.x(objArray.mLinkUrl))) {
          return false;
       }else {
          p0.setAction(new SettingPageAction(SettingItemActionType.Page, objArray.mLinkUrl));
          RetentionActivityModel mText = objArray.mText;
          a.o(mText, "model.mText");
          p0.setTitle(a.a(mText));
          return true;
       }
    }
}
