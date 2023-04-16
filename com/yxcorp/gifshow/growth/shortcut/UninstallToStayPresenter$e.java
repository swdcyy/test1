package com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$e;
import erd.g;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sqa.a;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public final class UninstallToStayPresenter$e implements g	// class@0014c8
{
    public final UninstallToStayPresenter b;

    public void UninstallToStayPresenter$e(UninstallToStayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UninstallToStayPresenter$e.class, "1")) {
       }else {
          UninstallToStayPresenter.P8(this.b).a().dismiss();
          PatchProxy.onMethodExit(UninstallToStayPresenter$e.class, "1");
       }
       return;
    }
}
