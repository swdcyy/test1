package com.kuaishou.merchant.transaction.live.dynamic.page.MerchantPurchasePanelV2Fragment$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantPurchasePanelV2Fragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import qrd.l1;
import androidx.fragment.app.Fragment;

public final class MerchantPurchasePanelV2Fragment$a	// class@0007b2
{

    public void MerchantPurchasePanelV2Fragment$a(){
       super();
    }
    public void MerchantPurchasePanelV2Fragment$a(u p0){
       super();
    }
    public final MerchantPurchasePanelV2Fragment a(String p0,LiveMerchantBaseContext p1,ClientEvent$ExpTagTrans p2,ClientEvent$ExpTagTrans p3){
       MerchantPurchasePanelV2Fragment obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, MerchantPurchasePanelV2Fragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MerchantPurchasePanelV2Fragment();
       Bundle uBundle = new Bundle();
       uBundle.putString("KEY_MERCHANT_ROUTER_URL", p0);
       uBundle.putParcelable("MERCHANT_BASE_CONTEXT", b.c(p1));
       obj.setArguments(uBundle);
       obj.w = p2;
       obj.x = p3;
       return obj;
    }
}
