package com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$f;
import erd.g;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class UninstallToStayPresenter$f implements g	// class@0014c9
{
    public final UninstallToStayPresenter b;

    public void UninstallToStayPresenter$f(UninstallToStayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UninstallToStayPresenter$f.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          p0.R8("kwai://featured");
          PatchProxy.onMethodExit(UninstallToStayPresenter$f.class, "1");
       }
       return;
    }
}
