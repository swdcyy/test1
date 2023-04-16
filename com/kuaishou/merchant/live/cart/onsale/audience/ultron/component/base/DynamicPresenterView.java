package com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.base.DynamicPresenterView;
import android.widget.FrameLayout;
import android.content.Context;
import l44.a;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.base.DynamicPresenterView$rootPresenter$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DynamicPresenterView extends FrameLayout	// class@00198c
{
    public final p b;
    public final a c;
    public HashMap d;

    public void DynamicPresenterView(Context p0,a p1){
       super(p0);
       this.c = p1;
       this.b = s.c(new DynamicPresenterView$rootPresenter$2(this));
       this.addView(a.c(p0, p1.i(), this, false));
       this.getRootPresenter().f(this);
    }
    public final PresenterV2 getRootPresenter(){
       Object obj = PatchProxy.applyWithListener(null, this, DynamicPresenterView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(DynamicPresenterView.class, "1");
       return this.b.getValue();
    }
}
