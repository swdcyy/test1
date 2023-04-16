package ihc.a;
import ehc.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.settings.stencil.item.ToolKitKt;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.settings.stencil.entity.SettingLocalizedString;
import com.yxcorp.gifshow.settings.stencil.entity.action.SettingPageAction;
import msd.l;
import k2b.e0;
import ehc.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import tkd.b;
import tkd.d;
import vgc.a;
import zf6.k;
import ehc.h;
import ihc.a$a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;

public class a implements c	// class@002b38
{
    public final Context b;
    public final FragmentActivity c;
    public final e0 d;
    public final Class e;
    public final String f;
    public final String g;
    public final l h;
    public final g i;
    public final int j;
    public final String k;
    public final int l;
    public final int m;
    public final h n;
    public final MutableLiveData o;
    public final MutableLiveData p;
    public final SettingItemStencil q;

    public void a(BaseFragment p0,SettingItemStencil p1){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ToolKitKt toolKitKt = ToolKitKt.class;
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super();
       this.q = p1;
       Context uContext = p0.requireContext();
       a.o(uContext, "targetFragment.requireContext\(\)");
       this.b = uContext;
       FragmentActivity uFragmentAct = p0.requireActivity();
       a.o(uFragmentAct, "targetFragment.requireActivity\(\)");
       this.c = uFragmentAct;
       this.d = p0;
       this.e = c.class;
       String itemKey = p1.getItemKey();
       if (itemKey != null) {
       }else {
          itemKey = "NO_ITEM_KEY";
       }
       this.f = itemKey;
       SettingLocalizedString title = p1.getTitle();
       String str = "";
       if (title != null) {
          itemKey = title.getString();
          if (itemKey != null) {
          label_004a :
             this.g = itemKey;
             SettingPageAction action = p1.getAction();
             l ol = (action != null)? ToolKitKt.a(action, uContext): null;
             this.h = ol;
             this.i = ToolKitKt.b(p1, p0);
             String obj = PatchProxy.applyOneRefs(p1, null, toolKitKt, "2");
             if (obj != patchProxyRe) {
                i = obj.intValue();
             }else {
                a.p(p1, "$this$getSettingItemIconResources");
                i = d.a(0x5da6cca5).y10(p1);
             }
             this.j = i;
             obj = PatchProxy.applyOneRefs(p1, null, toolKitKt, "1");
             if (obj != patchProxyRe) {
             }else {
                a.p(p1, "$this$getIconUrl");
                obj = (k.d())? p1.getIconDarkUrl(): p1.getIconUrl();
             }
             this.k = obj;
             this.l = 0x7f080e8a;
             this.m = 0x7f07034b;
             h oh = PatchProxy.applyTwoRefs(p1, p0, null, toolKitKt, "3");
             if (oh != patchProxyRe) {
             }else {
                a.p(p1, "$this$createRedDotHandler");
                a.p(p0, "logPage");
                oh = d.a(0x5da6cca5).qc(p0, p1);
             }
             this.n = oh;
             SettingLocalizedString subTitle = p1.getSubTitle();
             if (subTitle != null) {
                String str1 = subTitle.getString();
                if (str1 != null) {
                   str = str1;
                }
             }
             this.o = new a$a(this, str);
             this.p = new MutableLiveData(Boolean.TRUE);
             return;
          }
       }
       itemKey = str;
       goto label_004a ;
    }
    public MutableLiveData a(){
       return this.p;
    }
    public String b(){
       return this.f;
    }
    public int c(){
       return this.j;
    }
    public int e(){
       return this.m;
    }
    public g f(){
       return this.i;
    }
    public l getAction(){
       return this.h;
    }
    public Class getDataType(){
       return this.e;
    }
    public String getIconUrl(){
       return this.k;
    }
    public MutableLiveData getStatus(){
       return this.o;
    }
    public String getTitle(){
       return this.g;
    }
    public h i(){
       return this.n;
    }
    public int j(){
       return this.l;
    }
    public void k(){
    }
}
