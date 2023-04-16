package com.kuaishou.merchant.marketing.shop.welfarepurchase.list.LiveAnchorWelfarePurchaseActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import android.os.Bundle;
import com.kuaishou.merchant.router.b;

public class LiveAnchorWelfarePurchaseActivity extends GifshowActivity	// class@001c34
{

    public void LiveAnchorWelfarePurchaseActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorWelfarePurchaseActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorWelfarePurchaseActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       b.k(this, "kwai://krn?bundleId=KwaishopCWelfarePurchase&componentName=WelfarePurchaseList&liveStreamId=&fullScreen=1");
       this.finish();
       return;
    }
}
