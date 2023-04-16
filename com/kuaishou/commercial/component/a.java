package com.kuaishou.commercial.component.a;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.kuaishou.commercial.component.c;
import nl9.i0;
import zl9.c;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import jyc.b;
import com.kwai.yoda.model.LaunchModel$a;
import com.yxcorp.gifshow.webview.c;
import com.kwai.yoda.model.LaunchModel;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import m59.p;
import mxb.i;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import android.app.Activity;
import k59.j2;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import ow.n;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import ow.m;
import android.os.Bundle;
import ow.h;
import androidx.fragment.app.DialogFragment;
import uxc.b;
import ow.g;
import uxc.a;

public final class a implements DialogContainerFragment$b	// class@001494
{
    public final c a;
    public final i0 b;
    public final c c;
    public final BaseFeed d;

    public void a(c p0,i0 p1,c p2,BaseFeed p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final Fragment a(){
       a uoa = this;
       a a = uoa.a;
       a b = uoa.b;
       a c = uoa.c;
       a d = uoa.d;
       c a1 = a.a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdYodaFragment uAdYodaFragm = PatchProxy.applyFourRefs(a1, b, c, d, a, c.class, "8");
       if (uAdYodaFragm != patchProxyRe) {
       }else {
          i0 a2 = b.a;
          i0 c1 = b.c;
          Intent intent = KwaiWebViewActivity.N3(a2, c1).a();
          String str = b.b(c1);
          if (("0").equals(str)) {
             str = "3";
          }
          intent.putExtra("KEY_THEME", str);
          LaunchModel$a uoa1 = c.c(c1, "");
          uoa1.g(false);
          c.f(uoa1, intent);
          LaunchModel launchModel = uoa1.a();
          c.a(launchModel, intent, c1);
          SerializableHook.putExtra(intent, "model", launchModel);
          AdYodaFragment uAdYodaFragm1 = new AdYodaFragment();
          a uoa2 = d;
          p op = new p(a2, uAdYodaFragm1, d, b.g, 3, 3, a.b(b.f), null);
          uAdYodaFragm1.Qh(c1);
          c uoc = a1;
          PatchProxyResult patchProxyRe1 = patchProxyRe;
          AdYodaFragment uAdYodaFragm2 = uAdYodaFragm1;
          Intent intent1 = intent;
          i0 oi0 = a2;
          n on = PatchProxy.applyFourRefs(b, a2, uoa2, c, a, c.class, "12");
          if (on != patchProxyRe1) {
          }else {
             on = new n(a, oi0, uoa2, b, c);
          }
          uAdYodaFragm2.lh(on);
          m om = PatchProxy.apply(null, a, c.class, "10");
          if (om != patchProxyRe1) {
          }else {
             om = new m(a);
          }
          uAdYodaFragm2.ch(om);
          uAdYodaFragm2.setArguments(intent1.getExtras());
          a.c(b, uoa2);
          uAdYodaFragm2.kh(new h(uoc));
          uAdYodaFragm2.gh(new g(uoc));
          uAdYodaFragm = uAdYodaFragm2;
       }
       return uAdYodaFragm;
    }
}
