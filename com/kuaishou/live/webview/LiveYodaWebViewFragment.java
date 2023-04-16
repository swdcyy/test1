package com.kuaishou.live.webview.LiveYodaWebViewFragment;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import lp3.e;
import o63.e;
import nsd.u;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import d61.j0;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import jq3.a;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import ekd.m1;
import sq5.a;
import lp3.c;
import sq5.b;
import com.kwai.feature.api.live.base.service.perf.LivePerfBizType;
import kotlin.jvm.internal.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.webview.yoda.view.c;
import z1.k;
import com.kwai.yoda.bridge.YodaBaseWebView;
import wkd.b;
import eyc.a;
import o63.a;
import com.kuaishou.live.webview.a;
import android.widget.AbsoluteLayout;

public final class LiveYodaWebViewFragment extends KwaiYodaWebViewFragment	// class@000ffc
{
    public k C;
    public boolean D;
    public float E;
    public final e F;
    public final e G;

    public void LiveYodaWebViewFragment(){
       super(null, null, 3, null);
    }
    public void LiveYodaWebViewFragment(e p0){
       super(p0, null, 2, null);
    }
    public void LiveYodaWebViewFragment(e p0,e p1){
       super();
       this.F = p0;
       this.G = p1;
    }
    public void LiveYodaWebViewFragment(e p0,e p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       super(p0, null);
       return;
    }
    public void doBindView(View p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveYodaWebViewFragment.class, "6")) {
          return;
       }
       super.doBindView(p0);
       if (this.D != null && p0 != null) {
          j0.a(p0, (float)a1.e(this.E));
       }
       Bundle arguments = this.getArguments();
       if (arguments != null) {
          String str = arguments.getString("KEY_THEME", "0");
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          a uoa = a.class;
          Object obj = null;
          Object obj1 = PatchProxy.applyOneRefs(str, obj, uoa, "2");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             Object obj2 = PatchProxy.apply(obj, obj, uoa, "3");
             boolean b1 = (obj2 != patchProxyRe)? obj2.booleanValue(): a.t().u("SOURCE_LIVE").d("enableLiveWebViewReplaceThemeType", false);
             if (b1) {
                b = TextUtils.equals(str, "3");
             }else {
                b = false;
             }
          }
          if (!b) {
             return;
          }else {
             p0 = m1.f(p0, R.id.title_root);
             if (p0 != null) {
                p0.setVisibility(8);
             }
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveYodaWebViewFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       LiveYodaWebViewFragment tF = this.F;
       if (tF != null && !tF.b()) {
          a uoa = this.F.c(a.class);
          if (uoa != null) {
             String webUrl = this.getWebUrl();
             a.o(webUrl, "webUrl");
             uoa.Hc(new b().c(LivePerfBizType.WEB).d(webUrl));
          }
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveYodaWebViewFragment.class, "2")) {
          return;
       }
       super.onDestroy();
       LiveYodaWebViewFragment tF = this.F;
       if (tF != null && !tF.b()) {
          a uoa = this.F.c(a.class);
          if (uoa != null) {
             String webUrl = this.getWebUrl();
             a.o(webUrl, "webUrl");
             uoa.zm(new b().c(LivePerfBizType.WEB).d(webUrl));
          }
       }
       return;
    }
    public c rh(){
       c uoc;
       LiveYodaWebViewFragment obj = PatchProxy.apply(null, this, LiveYodaWebViewFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj != null) {
          uoc = obj.get();
          if (uoc != null) {
          label_0026 :
             return uoc;
          }
       }
       uoc = super.rh();
       a.o(uoc, "super.buildController\(\)");
       goto label_0026 ;
    }
    public void th(YodaBaseWebView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveYodaWebViewFragment.class, "4")) {
          return;
       }
       super.th(p0);
       if (p0 == null || (this.F != null && b.a(-1275906972).isKwaiUrl(this.getWebUrl()))) {
          if (this.F.b()) {
             return;
          }else {
             a.d(p0, this.F.a(a.class), this.G);
             LiveYodaWebViewFragment tG = this.G;
             if (tG != null) {
                p0.setTag(R.id.liveJsApiStrategy, tG);
             }
          }
       }
       return;
    }
}
