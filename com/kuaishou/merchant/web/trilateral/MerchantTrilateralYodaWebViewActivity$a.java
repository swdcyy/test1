package com.kuaishou.merchant.web.trilateral.MerchantTrilateralYodaWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import android.content.Intent;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class MerchantTrilateralYodaWebViewActivity$a extends KwaiWebViewActivity$a	// class@0009db
{
    public boolean j;
    public MerchantTrilateralUrlWhiteListModel k;

    public void MerchantTrilateralYodaWebViewActivity$a(Context p0,Class p1,String p2){
       super(p0, p1, p2);
    }
    public Intent a(){
       Intent obj = PatchProxy.apply(null, this, MerchantTrilateralYodaWebViewActivity$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.putExtra("DISABLE_WEBVIEW_DOWNLOAD", this.j);
       SerializableHook.putExtra(obj, "HOST_WHITE_LIST", this.k);
       return obj;
    }
}
