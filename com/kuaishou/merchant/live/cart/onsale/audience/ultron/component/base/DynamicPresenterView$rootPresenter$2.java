package com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.base.DynamicPresenterView$rootPresenter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.base.DynamicPresenterView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import l44.a;

public final class DynamicPresenterView$rootPresenter$2 extends Lambda implements a	// class@00198b
{
    public final DynamicPresenterView this$0;

    public void DynamicPresenterView$rootPresenter$2(DynamicPresenterView p0){
       this.this$0 = p0;
       super(0);
    }
    public final PresenterV2 invoke(){
       Object obj = PatchProxy.applyWithListener(null, this, DynamicPresenterView$rootPresenter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(DynamicPresenterView$rootPresenter$2.class, "1");
       return this.this$0.c.a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
