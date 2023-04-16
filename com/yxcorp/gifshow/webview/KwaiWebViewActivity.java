package com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class KwaiWebViewActivity extends KwaiYodaWebViewActivity	// class@0016c9
{
    public static final int J;

    public void KwaiWebViewActivity(){
       super();
    }
    public static KwaiWebViewActivity$a M3(Context p0,Class p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, KwaiWebViewActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiWebViewActivity$a(p0, p1, p2);
    }
    public static KwaiWebViewActivity$a N3(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KwaiWebViewActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiWebViewActivity$a(p0, p1);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KwaiWebViewActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       KwaiYodaWebViewActivity obj = PatchProxy.apply(null, this, KwaiWebViewActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj == null) {
          return "ks://webview";
       }
       return obj.getUrl();
    }
}
