package com.kuaishou.growth.privacy.dialog.helper.f;
import u07.u;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import wf0.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import wf0.o;
import wf0.r;
import kzc.d;
import com.kuaishou.growth.privacy.dialog.helper.m;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.weapon.i.WeaponHI;

public final class f implements u	// class@000714
{
    public final Activity b;
    public final boolean c;

    public void f(Activity p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       f tb = this.b;
       f tc = this.c;
       Object obj = PatchProxy.apply(null, null, k.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("privacyAlertCityBlackSwitch", true);
       if (b) {
          p0.q(3);
          if (!PatchProxy.applyVoidOneRefs(tb, null, PrivacyDialogHelper.class, "12")) {
             boolean b1 = VisitorModeManager.f();
             PrivacyDialogHelper.d(tb, new o(tb, b1), new r(tb, b1)).Y(new m());
          }
       }else {
          PrivacyDialogHelper.l(tb, tc, p0);
       }
       WeaponHI.setPS(false);
       return;
    }
}
