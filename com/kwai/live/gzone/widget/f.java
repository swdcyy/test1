package com.kwai.live.gzone.widget.f;
import com.kwai.live.gzone.widget.e;
import com.kwai.live.gzone.widget.f$b;
import com.kwai.live.gzone.widget.e$a;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import t77.a;
import android.view.View;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.app.Activity;
import d61.y;
import f37.o0;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import jyc.b;
import com.kwai.yoda.model.LaunchModel$a;
import com.kwai.yoda.model.LaunchModel;
import android.content.Intent;
import lp3.e;
import fq5.b;
import tkd.b;
import tkd.d;
import oq3.a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import androidx.fragment.app.Fragment;
import w77.e;
import uxc.b;
import w77.f;
import uxc.a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.kwai.live.gzone.widget.f$a;
import t77.a$b;
import w77.d;

public class f extends e	// class@000e92
{
    public boolean A;
    public boolean B;
    public Bundle C;
    public FrameLayout D;
    public b E;
    public a F;
    public a x;
    public FragmentActivity y;
    public String z;

    public void f(f$b p0){
       super(p0);
       this.A = true;
       this.p.a0(true);
       this.y = p0.L;
       this.z = p0.K;
       this.A = p0.I;
       this.B = p0.J;
       this.C = p0.M;
       this.E = p0.N;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       f ty = this.y;
       if (ty instanceof GifshowActivity) {
          ty.l3(this.x);
          this.x = null;
       }
       ty = this.F;
       if (ty != null) {
          ty.b();
          this.F = null;
       }
       return;
    }
    public int d0(){
       return 0x7f0d0bc9;
    }
    public void f0(View p0,Bundle p1){
       f uof = f.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uof, "1")) {
          return;
       }
       FrameLayout uFrameLayout = this.t(R.id.live_gzone_audience_webview_container);
       this.D = uFrameLayout;
       o0.p(uFrameLayout, y.d(this.y));
       Object[] objArray = null;
       KwaiYodaWebViewFragment kwaiYodaWebV = PatchProxy.apply(objArray, this, uof, "2");
       if (kwaiYodaWebV != PatchProxyResult.class) {
       }else {
          KwaiWebViewActivity$a uoa1 = KwaiWebViewActivity.N3(this.y, this.z).o("kwai://gzone/webview");
          uoa1.j("");
          String str = b.b(this.z);
          String str1 = "0";
          String str2 = "KEY_THEME";
          if (str != str1) {
             uoa1.e(str2, str);
          }else if(this.A != null){
             uoa1.e(str2, "3");
          }else {
             uoa1.e(str2, str1);
          }
          uoa1.h(new LaunchModel$a(this.z).f(false).g(true).a());
          Intent intent = uoa1.a();
          uof = this.C;
          if (uof != null) {
             intent.putExtras(uof);
          }
          if (this.B != null) {
             o0.q(intent, 2);
          }
          uof = this.E;
          if (uof != null) {
             objArray = uof.t5();
          }
          KwaiYodaWebViewFragment kwaiYodaWebV1 = d.a(0x7b1b2208).Tf(objArray);
          kwaiYodaWebV1.setArguments(intent.getExtras());
          kwaiYodaWebV1.kh(new e(this));
          kwaiYodaWebV1.gh(new f(this));
          kwaiYodaWebV = kwaiYodaWebV1;
       }
       a uoa = new a(this.y.getSupportFragmentManager(), kwaiYodaWebV, new f$a(this), "LiveGzoneAudienceTurntableWebViewPopup");
       this.F = uoa;
       uoa.a();
       d uod = new d(this, kwaiYodaWebV);
       this.x = uod;
       f ty = this.y;
       if (ty instanceof GifshowActivity) {
          ty.F2(uod);
       }
       return;
    }
    public boolean j0(){
       return true;
    }
}
