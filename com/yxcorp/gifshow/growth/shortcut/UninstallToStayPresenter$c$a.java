package com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$c$a;
import erd.g;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$c;
import java.lang.Object;
import com.yxcorp.gifshow.growth.model.response.GrowthStayDialogConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;

public final class UninstallToStayPresenter$c$a implements g	// class@0014c5
{
    public final UninstallToStayPresenter$c b;

    public void UninstallToStayPresenter$c$a(UninstallToStayPresenter$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UninstallToStayPresenter$c$a.class, "1")) {
       }else if(p0 != null){
          if (p0.accountDialog != null) {
             this.b.c.V8(p0, true);
          }else {
             UninstallToStayPresenter$c$a tb = this.b;
             if (p0.relationDialog != null) {
                tb.c.V8(p0, false);
             }else {
                tb.c.W8();
             }
          }
          p0 = Result.constructor-impl(l1.a);
          if (Result.exceptionOrNull-impl(p0) != null) {
             this.b.c.W8();
          }
       }
       return;
    }
}
