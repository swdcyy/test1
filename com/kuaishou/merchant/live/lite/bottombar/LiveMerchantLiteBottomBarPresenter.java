package com.kuaishou.merchant.live.lite.bottombar.LiveMerchantLiteBottomBarPresenter;
import com.kuaishou.merchant.live.lite.LiveMerchantLiteBarBasePresenter;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import m24.c2;
import z1.a;
import la3.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import k2b.e0;
import h64.o;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;

public class LiveMerchantLiteBottomBarPresenter extends LiveMerchantLiteBarBasePresenter	// class@001a2c
{
    public String J;

    public void LiveMerchantLiteBottomBarPresenter(){
       super();
       this.J = "LiveMerchantLiteBottomBarPresenter";
    }
    public void d9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantLiteBottomBarPresenter.class, "1")) {
          return;
       }
       MerchantLiveLogBiz bOTTOM_BAR = MerchantLiveLogBiz.BOTTOM_BAR;
       a.s(bOTTOM_BAR, this.J, "refreshBottomBarItem show type: "+p0);
       if (this.G == null) {
          this.c9();
       }
       if (this.H.a()) {
          if (this.D != null) {
             a.s(bOTTOM_BAR, this.J, "lite bottom bar already show");
             return;
          }else {
             this.D = true;
             this.B.a(281, null);
             o.b(this.A.a(), this.A.getPage());
             a.s(bOTTOM_BAR, this.J, "lite bottom bar show");
             this.E.a(this.F);
          }
       }else {
          this.D = false;
          a.s(bOTTOM_BAR, this.J, "lite bottom bar hide");
          this.E.c(this.F);
       }
       return;
    }
}
