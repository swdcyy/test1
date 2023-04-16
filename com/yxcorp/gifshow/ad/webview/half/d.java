package com.yxcorp.gifshow.ad.webview.half.d;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragmentV2;
import com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragment$a;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.e;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.ad.webview.o;
import n59.r;
import android.app.Activity;
import com.yxcorp.gifshow.commercial.api.web.AdYodaConfig;
import sl9.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import android.os.Bundle;
import n59.q;
import msd.a;
import k59.e2;
import n59.o;
import androidx.fragment.app.DialogFragment;
import uxc.b;
import n59.n;
import uxc.a;
import com.yxcorp.gifshow.ad.webview.half.e;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;

public final class d implements DialogContainerFragment$b	// class@0018c5
{
    public final AdHalfWebFragmentV2 a;
    public final AdHalfWebFragment$a b;

    public void d(AdHalfWebFragmentV2 p0,AdHalfWebFragment$a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Fragment a(){
       d ta = this.a;
       d tb = this.b;
       Objects.requireNonNull(ta);
       AdHalfWebFragment$a f = tb.f;
       AdHalfWebFragment$a a = tb.a;
       AdHalfWebFragment$a e = tb.e;
       KwaiYodaWebViewFragment kwaiYodaWebV = PatchProxy.applyFourRefs(ta, f, a, e, ta, AdHalfWebFragmentV2.class, "13");
       if (kwaiYodaWebV != PatchProxyResult.class) {
       }else {
          Intent intent = KwaiYodaWebViewActivity.G3(f, a).a();
          e.a(intent, a);
          SerializableHook.putExtra(intent, "KEY_EXTRA", e);
          o oo = new o();
          ta.K = oo;
          KwaiYodaWebViewFragment kwaiYodaWebV1 = oo.a(f, ta.J, new r(ta));
          Bundle extras = intent.getExtras();
          if (extras != null) {
             SerializableHook.putSerializable(extras, "AD_YODA_CONFIG", ta.J);
          }
          kwaiYodaWebV1.setArguments(extras);
          if (ta.H.h != null) {
             ta.I.m(new q(ta));
          }
          kwaiYodaWebV1.kh(new o(ta));
          kwaiYodaWebV1.gh(new n(ta));
          kwaiYodaWebV1.ch(new e(ta));
          kwaiYodaWebV = kwaiYodaWebV1;
       }
       return kwaiYodaWebV;
    }
}
