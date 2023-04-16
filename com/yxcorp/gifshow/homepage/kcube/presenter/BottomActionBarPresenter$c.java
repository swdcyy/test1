package com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$c;
import sn5.f;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import java.lang.Object;
import com.kwai.kcube.TabIdentifier;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import wq6.h;
import wq6.g;
import com.yxcorp.gifshow.homepage.kcube.actionbar.bottom.widget.BottomTabView;

public final class BottomActionBarPresenter$c implements f	// class@001748
{
    public final BottomActionBarPresenter a;

    public void BottomActionBarPresenter$c(BottomActionBarPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(TabIdentifier p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BottomActionBarPresenter$c obj = PatchProxy.applyOneRefs(p0, this, BottomActionBarPresenter$c.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "id");
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, BottomActionBarPresenter.class, "8");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          h oh = obj.z.G(p0);
          BottomTabView uBottomTabVi = (oh != null)? oh.F("KEY_BOTTOM_TAB_CUSTOM_VIEW"): null;
          b = obj.Z8(uBottomTabVi);
       }
       return b;
    }
}
