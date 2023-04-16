package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.TabWithAvatarViewElement;
import zsa.a;
import wq6.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.TabWithAvatarViewElement$createView$1;
import msd.l;
import mr6.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bta.a;
import com.kwai.library.widget.textview.IconifyRadioButtonNew;

public final class TabWithAvatarViewElement extends a	// class@001712
{

    public void TabWithAvatarViewElement(h p0){
       a.p(p0, "tab");
       super(p0);
    }
    public View c(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TabWithAvatarViewElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "container");
       return this.a(new TabWithAvatarViewElement$createView$1(this));
    }
    public void u(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TabWithAvatarViewElement.class, "3")) {
          return;
       }
       a.p(p0, "rootPresenter");
       super.u(p0);
       p0.U7(new a());
       PatchProxy.onMethodExit(TabWithAvatarViewElement.class, "3");
       return;
    }
    public IconifyRadioButtonNew y(){
       View obj = PatchProxy.apply(null, this, TabWithAvatarViewElement.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j().findViewById(R.id.follow_tab_text);
       a.o(obj, "getView\(\).findViewById\(R.id.follow_tab_text\)");
       return obj;
    }
}
