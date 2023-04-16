package com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter$c;
import erd.g;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import o74.a;

public final class MerchantAutoPlayPagePresenter$c implements g	// class@001754
{
    public final MerchantAutoPlayPagePresenter b;

    public void MerchantAutoPlayPagePresenter$c(MerchantAutoPlayPagePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       MerchantAutoPlayPagePresenter$c uoc = MerchantAutoPlayPagePresenter$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoc, "1")) {
          if (b) {
             a.s(MerchantHomeLogBiz.AutoPlay, "MerchantAutoPlayPagePresenter", "fragment hide, stop play");
             this.b.stopAllPlayCard();
          }else {
             a.s(MerchantHomeLogBiz.AutoPlay, "MerchantAutoPlayPagePresenter", "fragment show, start play");
             this.b.tryStartDispatch();
          }
       }
       return;
    }
}
