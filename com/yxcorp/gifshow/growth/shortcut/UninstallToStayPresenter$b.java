package com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.Pair;

public final class UninstallToStayPresenter$b extends m	// class@0014c4
{
    public final UninstallToStayPresenter c;

    public void UninstallToStayPresenter$b(UninstallToStayPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UninstallToStayPresenter$b.class, "1")) {
          return;
       }
       UninstallToStayPresenter$b tc = this.c;
       Objects.requireNonNull(tc);
       tc.R8("kwai://featured");
       Pair[] pairArray = new Pair[0];
       this.c.S8("NO_UNLOAD_BUTTON", pairArray);
       return;
    }
}
