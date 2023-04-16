package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$l;
import erd.g;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a;
import java.lang.Object;
import ujc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$l implements g	// class@00171f
{
    public final a b;

    public void a$l(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$l.class, "1")) {
       }else {
          a.p(p0, "event");
          this.b.onHomeSplashStateEvent(p0);
       }
       return;
    }
}
