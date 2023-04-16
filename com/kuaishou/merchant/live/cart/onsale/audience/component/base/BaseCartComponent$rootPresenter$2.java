package com.kuaishou.merchant.live.cart.onsale.audience.component.base.BaseCartComponent$rootPresenter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.live.cart.onsale.audience.component.base.BaseCartComponent;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BaseCartComponent$rootPresenter$2 extends Lambda implements a	// class@001930
{
    public final BaseCartComponent this$0;

    public void BaseCartComponent$rootPresenter$2(BaseCartComponent p0){
       this.this$0 = p0;
       super(0);
    }
    public final PresenterV2 invoke(){
       Object obj = PatchProxy.applyWithListener(null, this, BaseCartComponent$rootPresenter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(BaseCartComponent$rootPresenter$2.class, "1");
       return this.this$0.i();
    }
    public Object invoke(){
       return this.invoke();
    }
}
