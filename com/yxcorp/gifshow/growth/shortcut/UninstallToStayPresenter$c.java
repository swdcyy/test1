package com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import wkd.b;
import yma.a;
import yma.b;
import brd.t;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$c$a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.Pair;

public final class UninstallToStayPresenter$c extends m	// class@0014c6
{
    public final UninstallToStayPresenter c;

    public void UninstallToStayPresenter$c(UninstallToStayPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UninstallToStayPresenter$c.class, "1")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (!mE.isLogined()) {
          this.c.W8();
       }else {
          b obj = b.a(-1257347683);
          a.o(obj, "Singleton.get\(GrowthApi::class.java\)");
          obj = obj.b();
          a.o(obj, "Singleton.get\(GrowthApi::class.java\).apiService");
          this.c.X7(obj.q().map(new e()).subscribe(new UninstallToStayPresenter$c$a(this)));
       }
       Pair[] pairArray = new Pair[0];
       this.c.S8("KEEP_UNLOAD_BUTTON", pairArray);
       return;
    }
}
