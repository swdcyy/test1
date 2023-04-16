package com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class UninstallToStayPresenter$a extends m	// class@0014c3
{
    public final UninstallToStayPresenter c;

    public void UninstallToStayPresenter$a(UninstallToStayPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UninstallToStayPresenter$a.class, "1")) {
          return;
       }
       UninstallToStayPresenter$a tc = this.c;
       Objects.requireNonNull(tc);
       tc.R8("kwai://featured");
       return;
    }
}
