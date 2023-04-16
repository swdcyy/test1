package com.yxcorp.gifshow.ad.webview.half.a;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragment;
import com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragment$a;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import k59.j2;
import java.lang.System;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.e;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import m59.p;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.yxcorp.gifshow.ad.webview.half.c;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import android.os.Bundle;
import n59.j;
import msd.a;
import k59.e2;
import n59.e;
import androidx.fragment.app.DialogFragment;
import uxc.b;
import n59.d;
import uxc.a;
import com.yxcorp.gifshow.ad.webview.half.b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;

public final class a implements DialogContainerFragment$b	// class@0018c2
{
    public final AdHalfWebFragment a;
    public final AdHalfWebFragment$a b;

    public void a(AdHalfWebFragment p0,AdHalfWebFragment$a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Fragment a(){
       a uoa = this;
       a a = uoa.a;
       a b = uoa.b;
       Objects.requireNonNull(a);
       AdHalfWebFragment$a f = b.f;
       AdHalfWebFragment$a a1 = b.a;
       AdHalfWebFragment$a e = b.e;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdYodaFragment uAdYodaFragm = PatchProxy.applyFourRefs(a, f, a1, e, a, AdHalfWebFragment.class, "12");
       if (uAdYodaFragm != patchProxyRe) {
       }else if(PatchProxy.applyVoid(null, a, AdHalfWebFragment.class, "13")){
          j2 oj2 = new j2();
          a.K = oj2;
          oj2.d(System.currentTimeMillis());
          a.K.f(System.currentTimeMillis());
       }
       Intent intent = KwaiYodaWebViewActivity.G3(f, a1).a();
       e.a(intent, a1);
       SerializableHook.putExtra(intent, "KEY_EXTRA", e);
       AdYodaFragment uAdYodaFragm1 = new AdYodaFragment();
       AdHalfWebFragment$a uoa1 = e;
       AdHalfWebFragment$a uoa2 = a1;
       AdHalfWebFragment$a uoa3 = f;
       p op = new p(f, uAdYodaFragm1, e, a.Nh(), 3, 3, a.I.j, a.K);
       uAdYodaFragm1.Qh(uAdYodaFragm);
       AdHalfWebFragment$a uoa4 = uoa2;
       AdHalfWebFragment$a uoa5 = uoa2;
       uoa2 = uoa3;
       AdHalfWebFragment$a uoa6 = uoa3;
       AdYodaFragment uAdYodaFragm2 = uAdYodaFragm1;
       c uoc = PatchProxy.applyThreeRefs(uoa4, uoa2, uoa1, a, AdHalfWebFragment.class, "17");
       if (uoc != patchProxyRe) {
          uoa2 = uoa1;
       }else {
          uoa2 = uoa1;
          uoc = new c(a, uoa6, uoa2, uoa5);
       }
       uAdYodaFragm2.lh(uoc);
       uAdYodaFragm2.setArguments(intent.getExtras());
       a.N.m(new j(a, uoa2, uoa5));
       uAdYodaFragm2.kh(new e(a));
       uAdYodaFragm2.gh(new d(a));
       uAdYodaFragm2.ch(new b(a));
       uAdYodaFragm = uAdYodaFragm2;
       return uAdYodaFragm;
    }
}
