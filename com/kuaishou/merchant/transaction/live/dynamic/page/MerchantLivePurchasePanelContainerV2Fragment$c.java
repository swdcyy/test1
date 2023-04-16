package com.kuaishou.merchant.transaction.live.dynamic.page.MerchantLivePurchasePanelContainerV2Fragment$c;
import android.content.DialogInterface$OnKeyListener;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantLivePurchasePanelContainerV2Fragment;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class MerchantLivePurchasePanelContainerV2Fragment$c implements DialogInterface$OnKeyListener	// class@0007ae
{
    public final MerchantLivePurchasePanelContainerV2Fragment b;

    public void MerchantLivePurchasePanelContainerV2Fragment$c(MerchantLivePurchasePanelContainerV2Fragment p0){
       this.b = p0;
       super();
    }
    public final boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport2(MerchantLivePurchasePanelContainerV2Fragment$c.class, "1")) {
          p0 = PatchProxy.applyThreeRefsWithListener(p0, Integer.valueOf(p1), p2, this, MerchantLivePurchasePanelContainerV2Fragment$c.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       int i = 0;
       if (p1 == 4 && p2.getAction() == 1) {
          MerchantLivePurchasePanelContainerV2Fragment.Lh(this.b, i, 1, null);
          i = true;
       }
       PatchProxy.onMethodExit(MerchantLivePurchasePanelContainerV2Fragment$c.class, "1");
       return i;
    }
}
