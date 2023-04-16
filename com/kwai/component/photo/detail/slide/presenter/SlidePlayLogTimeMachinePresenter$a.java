package com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$a;
import java.lang.Object;
import nsd.u;
import com.kwai.kcube.TabIdentifier;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import on5.b;

public final class SlidePlayLogTimeMachinePresenter$a	// class@000a89
{

    public void SlidePlayLogTimeMachinePresenter$a(){
       super();
    }
    public void SlidePlayLogTimeMachinePresenter$a(u p0){
       super();
    }
    public final String a(TabIdentifier p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlayLogTimeMachinePresenter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "homeTabId");
       String str = (a.g(p0, b.f))? "NasaFeature": null;
       return str;
    }
}
