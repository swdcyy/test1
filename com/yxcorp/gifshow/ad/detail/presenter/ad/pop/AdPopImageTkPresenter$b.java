package com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$b;
import x49.q;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yx.j0;
import android.view.ViewGroup;

public final class AdPopImageTkPresenter$b implements q	// class@0015fd
{
    public final AdPopImageTkPresenter a;

    public void AdPopImageTkPresenter$b(AdPopImageTkPresenter p0){
       this.a = p0;
       super();
    }
    public void a(Exception p0){
       AdPopImageTkPresenter a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AdPopImageTkPresenter$b.class, "2")) {
          return;
       }
       a.p(p0, "e");
       Object[] objArray = new Object[0];
       j0.f("TachikomaAdPopPlayTkPresenter", "onRenderFailed", objArray);
       a = this.a.A;
       if (a != null) {
          a.setVisibility(8);
       }
       PatchProxy.onMethodExit(AdPopImageTkPresenter$b.class, "2");
       return;
    }
    public void b(){
       if (PatchProxy.applyVoidWithListener(null, this, AdPopImageTkPresenter$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("TachikomaAdPopPlayTkPresenter", "onRenderSuccess", objArray);
       PatchProxy.onMethodExit(AdPopImageTkPresenter$b.class, "1");
       return;
    }
}
