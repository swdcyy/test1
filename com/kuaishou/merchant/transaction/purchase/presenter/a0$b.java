package com.kuaishou.merchant.transaction.purchase.presenter.a0$b;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import com.kuaishou.merchant.transaction.purchase.presenter.a0;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import em4.m;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class a0$b implements ViewTreeObserver$OnScrollChangedListener	// class@00095e
{
    public Rect a;
    public final a0 b;

    public void a0$b(a0 p0){
       this.b = p0;
       super();
       this.a = new Rect();
    }
    public void onScrollChanged(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a0$b.class, "1")) {
          return;
       }
       if (this.b.C != null) {
          return;
       }
       this.a.set(0, 0, 0, 0);
       if (!this.b.t.getLocalVisibleRect(this.a)) {
          return;
       }
       if ((float)this.a.height() - 0x3f800000 >= 0) {
          boolean b = this.b.P8();
          m om = m.class;
          if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), objArray, om, "17")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "FOCUS_SHOP_MODULE";
             i3 oi3 = i3.f();
             oi3.c("is_focus_default", Integer.valueOf(b));
             uElementPack.params = oi3.e();
             u1.u0(3, uElementPack, new ClientContent$ContentPackage());
          }
          this.b.C = true;
       }
       return;
    }
}
