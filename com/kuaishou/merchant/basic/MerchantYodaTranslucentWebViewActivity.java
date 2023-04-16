package com.kuaishou.merchant.basic.MerchantYodaTranslucentWebViewActivity;
import dt3.a;
import com.kuaishou.merchant.basic.MerchantYodaWebViewActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.view.View;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.kuaishou.webkit.WebView;
import android.widget.AbsoluteLayout;

public class MerchantYodaTranslucentWebViewActivity extends MerchantYodaWebViewActivity implements a	// class@0015a0
{

    public void MerchantYodaTranslucentWebViewActivity(){
       super();
    }
    public int E3(){
       return 0;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, MerchantYodaTranslucentWebViewActivity.class, "3")) {
          return;
       }
       super.finish();
       if (!this.M3()) {
          this.overridePendingTransition(0, 0);
       }
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantYodaTranslucentWebViewActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void n1(){
       if (PatchProxy.applyVoid(null, this, MerchantYodaTranslucentWebViewActivity.class, "4")) {
          return;
       }
       View view = this.findViewById(R.id.title_root);
       if (view != null) {
          b uob = new b();
          uob.g(KwaiRadiusStyles.TL16_TR16);
          uob.v(ContextCompat.getColor(this, R.color.arg_RES_7f061e52));
          view.setBackground(uob.a());
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantYodaTranslucentWebViewActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (!this.M3()) {
          this.overridePendingTransition(0, 0);
       }
       return;
    }
    public void w1(WebViewFragment p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantYodaTranslucentWebViewActivity.class, "2")) {
          return;
       }
       super.w1(p0, p1);
       p1.setBackgroundColor(0);
       if (p1.getBackground() != null) {
          p1.getBackground().setAlpha(0);
       }
       return;
    }
}
