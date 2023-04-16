package com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$createClickWidgetDialog$1;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.lang.Boolean;
import f55.g;

public final class AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$b implements PopupInterface$h	// class@001608
{
    public final AddGrowthWidgetTaskHelper$createClickWidgetDialog$1 b;

    public void AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$b(AddGrowthWidgetTaskHelper$createClickWidgetDialog$1 p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$b uocreateClic = AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$b.class;
       if (PatchProxy.isSupport(uocreateClic) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uocreateClic, "1")) {
          return;
       }
       a.p(p0, "popup");
       i3 oi3 = i3.f();
       oi3.a("isShowDialog", Boolean.FALSE);
       this.b.$callback.onSuccess(oi3.e());
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
