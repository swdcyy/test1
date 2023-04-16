package com.kuaishou.commercial.component.d;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.kuaishou.commercial.component.f;
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
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import jyc.b;
import com.kwai.yoda.model.LaunchModel$a;
import com.yxcorp.gifshow.webview.c;
import com.kwai.yoda.model.LaunchModel;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.ad.webview.o;
import ow.u;
import android.app.Activity;
import com.yxcorp.gifshow.commercial.api.web.AdYodaConfig;
import sl9.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import ow.v;
import android.os.Bundle;
import ow.q;
import androidx.fragment.app.DialogFragment;
import uxc.b;
import ow.p;
import uxc.a;

public final class d implements DialogContainerFragment$b	// class@00149a
{
    public final f a;
    public final i0 b;
    public final c c;
    public final BaseFeed d;

    public void d(f p0,i0 p1,c p2,BaseFeed p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final Fragment a(){
       d ta = this.a;
       d tb = this.b;
       d tc = this.c;
       f c = ta.c;
       KwaiYodaWebViewFragment kwaiYodaWebV = PatchProxy.applyFourRefs(c, tb, tc, this.d, ta, f.class, "9");
       if (kwaiYodaWebV != PatchProxyResult.class) {
       }else {
          i0 a = tb.a;
          i0 c1 = tb.c;
          Intent intent = KwaiYodaWebViewActivity.G3(a, c1).a();
          String str = b.b(c1);
          if (("0").equals(str)) {
             str = "3";
          }
          intent.putExtra("KEY_THEME", str);
          LaunchModel$a uoa = c.c(c1, "");
          uoa.g(false);
          c.f(uoa, intent);
          LaunchModel launchModel = uoa.a();
          c.a(launchModel, intent, c1);
          SerializableHook.putExtra(intent, "model", launchModel);
          o oo = new o();
          ta.b = oo;
          kwaiYodaWebV = oo.a(a, ta.a, new u(ta, tc, tb));
          v ov = PatchProxy.apply(null, ta, f.class, "10");
          if (ov != PatchProxyResult.class) {
          }else {
             ov = new v(ta);
          }
          kwaiYodaWebV.ch(ov);
          Bundle extras = intent.getExtras();
          if (extras != null) {
             SerializableHook.putSerializable(extras, "AD_YODA_CONFIG", ta.a);
          }
          kwaiYodaWebV.setArguments(extras);
          kwaiYodaWebV.kh(new q(c));
          kwaiYodaWebV.gh(new p(c));
       }
       return kwaiYodaWebV;
    }
}
