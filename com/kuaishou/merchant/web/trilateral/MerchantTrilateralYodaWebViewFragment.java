package com.kuaishou.merchant.web.trilateral.MerchantTrilateralYodaWebViewFragment;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.merchant.basic.model.MerchantTrilateralUrlWhiteListModel;
import cn4.a;
import ym4.d;
import android.view.View;
import o56.c;
import o56.a;
import androidx.fragment.app.FragmentActivity;
import android.view.ViewGroup;
import android.content.Context;
import xm4.a;
import ekd.m1;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.webview.yoda.view.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.web.trilateral.MerchantTrilateralYodaWebViewFragment$a;
import com.kuaishou.webkit.WebViewClient;
import com.yxcorp.gifshow.webview.yoda.g;
import com.kuaishou.merchant.web.trilateral.b;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.app.Activity;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import cn4.f;
import com.yxcorp.gifshow.webview.yoda.g$c;

public class MerchantTrilateralYodaWebViewFragment extends KwaiYodaWebViewFragment	// class@0009de
{
    public a C;
    public b D;

    public void MerchantTrilateralYodaWebViewFragment(){
       super();
       this.C = null;
    }
    public int M(){
       return 1;
    }
    public String o(){
       return "MERCHANT_TRILATERAL_YODA_WEB";
    }
    public void onCreate(Bundle p0){
       MerchantTrilateralUrlWhiteListModel serializable;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantTrilateralYodaWebViewFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = null;
       if (this.getArguments() != null) {
          serializable = SerializableHook.getSerializable(this.getArguments(), "HOST_WHITE_LIST");
       }
       this.C = new a(serializable);
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, MerchantTrilateralYodaWebViewFragment.class, "5")) {
          return;
       }
       super.onStop();
       MerchantTrilateralYodaWebViewFragment tD = this.D;
       if (tD != null) {
          tD.F();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantTrilateralYodaWebViewFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (a.a().c()) {
          m1.f(a.b(this.getActivity(), R.layout.arg_RES_7f0d15d0, p0), R.id.test_web_tag_tv).setText("MerchantTrilateralYodaPage");
       }
       return;
    }
    public c rh(){
       Object obj = PatchProxy.apply(null, this, MerchantTrilateralYodaWebViewFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MerchantTrilateralYodaWebViewFragment$a(this, this.C);
    }
    public WebViewClient sh(){
       MerchantTrilateralYodaWebViewFragment merchantTril = PatchProxy.apply(null, this, MerchantTrilateralYodaWebViewFragment.class, "4");
       if (merchantTril != PatchProxyResult.class) {
       }else {
          b uob = new b(this.Ch(), this.getActivity(), this.C, this.getWebUrl());
          this.D = uob;
          uob.A(this.zh());
          this.D.B(new f(this));
          merchantTril = this.D;
       }
       return merchantTril;
    }
}
