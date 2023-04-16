package asa.a$e;
import zq6.u;
import asa.a;
import java.lang.Object;
import com.kwai.framework.model.kcube.ActionBarSkinConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wq6.h;
import wq6.f;
import wq6.g;
import bo5.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper;
import java.lang.Integer;
import zq6.p;

public final class a$e implements u	// class@0002dc
{
    public final a a;

    public void a$e(a p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else if(this.a.V8()){
          String str = "KEY_TAB_ACTION_SKIN";
          p0 = a.R8(this.a).F(str);
          if (p0 == null) {
             a.P8(this.a).e().f(str);
          }else {
             a.P8(this.a).e().r(str, p0);
          }
          p c = a.C;
          a.o(c, "HomeTopStateId.TAB_TRIANGLE_COLOR");
          this.a.W8(c, Integer.valueOf(HomeActionBarSkinHelper.l(a.R8(this.a), this.a.getContext())));
       }
       return;
    }
}
