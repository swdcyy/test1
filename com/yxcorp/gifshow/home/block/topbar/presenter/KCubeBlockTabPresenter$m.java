package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$m;
import erd.g;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import java.util.List;
import wq6.g;
import pr6.d;
import po5.c;
import pr6.b;
import k2b.e0;
import ura.b;

public final class KCubeBlockTabPresenter$m implements g	// class@001675
{
    public final KCubeBlockTabPresenter b;

    public void KCubeBlockTabPresenter$m(KCubeBlockTabPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeBlockTabPresenter$m.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, KCubeBlockTabPresenter.class, "8")) {
             Log.b("BLOCK_APP_BAR", "logTabShow");
             KCubeBlockTabPresenter s = p0.s;
             String str = "mContainerDecorator";
             if (s == null) {
                a.S(str);
             }
             List children = s.c().getChildren();
             p0 = p0.s;
             if (p0 == null) {
                a.S(str);
             }
             b c = c.C;
             a.o(c, "HomeFragmentFuncIds.LOG_PAGE");
             p0 = p0.e().e(c);
             b.c(children, "HOT_CHANNEL_TAB", false, p0);
          }
       }
       return;
    }
}
