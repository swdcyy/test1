package com.kuaishou.live.gzone.v2.activity.i$a;
import c77.a$a;
import com.kuaishou.live.gzone.v2.activity.i;
import java.lang.String;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.pendant.service.LiveGzoneFeatureEntrances;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import y43.a;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.kwai.yoda.model.LaunchModel$a;
import com.kwai.yoda.model.LaunchModel;
import f37.o0;
import android.content.Intent;
import android.os.Bundle;
import lp3.e;
import fq5.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import tkd.b;
import tkd.d;
import oq3.a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import androidx.fragment.app.Fragment;
import w53.p0;
import uxc.b;
import w53.q0;
import uxc.a;
import w53.m0;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import w53.n0;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c$b;
import w53.o0;
import androidx.fragment.app.e;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import k67.l;
import f37.c0;
import com.yxcorp.gifshow.model.CDNUrl;
import c77.a;

public class i$a extends a$a	// class@001cc0
{
    public final i b;

    public void i$a(i p0,String p1){
       this.b = p0;
       super(p1);
    }
    public void a(LiveGzoneTabSource p0){
       a y;
       i p;
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       i$a tb = this.b;
       if (tb.y == null) {
          Objects.requireNonNull(tb);
          i oi = i.class;
          if (!PatchProxy.applyVoid(null, tb, oi, "4")) {
             KwaiWebViewActivity$a uoa = KwaiWebViewActivity.N3(tb.getActivity(), tb.r.mUrl).o(tb.s.O().getUrl()).l("KEY_THEME", "3").m("KEY_IS_SELECTABLE_PAGE", true).l("KEY_WEB_TYPE", "Live_GzoneTab_1");
             uoa.j("");
             LaunchModel launchModel = new LaunchModel$a(tb.r.mUrl).f(false).g(true).a();
             o0.r(launchModel, 2);
             uoa.i("none");
             uoa.h(launchModel);
             Bundle extras = uoa.a().getExtras();
             e uoe = tb.s.m.t5();
             KwaiYodaWebViewFragment kwaiYodaWebV = PatchProxy.applyTwoRefs(extras, uoe, tb, oi, "6");
             if (kwaiYodaWebV != PatchProxyResult.class) {
             }else {
                kwaiYodaWebV = d.a(0x7b1b2208).Tf(uoe);
                kwaiYodaWebV.setArguments(extras);
                kwaiYodaWebV.kh(new p0(tb));
                kwaiYodaWebV.gh(new q0(tb));
             }
             tb.y = kwaiYodaWebV;
             kwaiYodaWebV.ch(new m0(tb));
             tb.y.lh(new n0(tb));
             tb.y.c0();
             oi = tb.t;
             tb.w = (oi != null)? oi.getChildFragmentManager(): tb.getActivity().getSupportFragmentManager();
             oi = tb.E;
             if (oi != null) {
                tb.w.unregisterFragmentLifecycleCallbacks(oi);
             }
             oi = tb.w;
             o0 oo0 = new o0(tb);
             tb.E = oo0;
             try{
                oi.registerFragmentLifecycleCallbacks(oo0, false);
                e uoe1 = tb.w.beginTransaction();
                uoe1.h(tb.y, "LiveGzoneWebTabFragment");
                uoe1.o();
             }catch(java.lang.IllegalArgumentException e8){
                ExceptionHandler.handleCaughtException(e8);
             }
          }
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "2")) {
          return;
       }
       i y = this.b.y;
       if (y != null) {
          y.c0();
       }
       y = this.b.p;
       if (y != null) {
          y.c(true);
       }
       return;
    }
}
