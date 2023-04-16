package com.kuaishou.live.audience.gzone.v2.pendant.LiveGzoneActivityPendantView;
import z31.c;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.audience.gzone.v2.pendant.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.gzone.pendant.LiveGzonePendant;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzoneActivityPendantView$a;
import z31.b;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import pp.a;
import q87.c;
import java.util.Objects;
import ya1.u;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzoneActivityPendantView$c;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ya1.u$a;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzoneActivityPendantView$b;
import jyc.b;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.yoda.model.LaunchModel;
import ya1.q;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import lp3.e;
import p91.m;
import com.kuaishou.live.webview.LiveYodaWebViewFragment;
import ya1.s;
import uxc.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import ya1.t;
import uxc.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.live.common.core.basic.widget.e;
import com.kuaishou.live.common.core.basic.widget.f;
import erd.g;
import crd.b;
import ya1.o;
import va1.i0;
import android.view.ViewGroup$LayoutParams;
import d61.y;
import ya1.r;
import android.view.ViewOutlineProvider;
import ya1.p;
import java.lang.Runnable;
import androidx.fragment.app.e;

public class LiveGzoneActivityPendantView extends FrameLayout implements c	// class@000c33
{
    public u b;
    public KwaiImageView c;
    public LiveGzonePendant d;
    public h e;
    public m f;
    public b g;
    public LiveGzoneActivityPendantView$c h;
    public static final int i;

    public void LiveGzoneActivityPendantView(Context p0){
       super(p0, null);
    }
    public void LiveGzoneActivityPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGzoneActivityPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveGzoneActivityPendantView.class, "1")) {
       }else {
          a.k(this, R.layout.arg_RES_7f0d0cf0, true);
          this.c = this.findViewById(0x7f0a2fd1);
          this.d();
          this.setOnClickListener(new a(this));
       }
       return;
    }
    public void a(LiveGzonePendant p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneActivityPendantView.class, "2")) {
          return;
       }
       int i = 0;
       if (p0 != null && p0.mPicUrl != null) {
          this.d = null;
          this.d();
          this.setVisibility(i);
          LiveGzoneActivityPendantView$a uoa = new LiveGzoneActivityPendantView$a(this, p0);
          LiveGzoneActivityPendantView tg = this.g;
          if (tg != null) {
             tg.b();
          }
          p0 = p0.mPicUrl;
          CDNUrl[] uCDNUrlArray = new CDNUrl[p0.size()];
          this.c.a0(p0.toArray(uCDNUrlArray), uoa);
       }else {
          Object[] objArray = new Object[i];
          a.C().s("LiveHalfScreenPendantVi", "has no live pendant", objArray);
       }
       return;
    }
    public void b(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, LiveGzoneActivityPendantView.class, "10")) {
          return;
       }
       LiveGzoneActivityPendantView tb = this.b;
       if (tb != null) {
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.apply(null, tb, u.class, "12");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             u b1 = tb.b;
             b = (b1 != null && b1.isAdded())? true: false;
          }
          if (b) {
             this.b.a();
          }
       }
       this.b = null;
       return;
    }
    public final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneActivityPendantView.class, "4")) {
          return;
       }
       LiveGzoneActivityPendantView th = this.h;
       if (th != null) {
          th.a(p0);
          return;
       }else {
          this.e(p0);
          return;
       }
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneActivityPendantView.class, "7")) {
          return;
       }
       if (this.getVisibility() == 8) {
          return;
       }
       this.setVisibility(8);
       return;
    }
    public void e(String p0){
       Intent intent;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneActivityPendantView.class, "11")) {
          return;
       }
       Activity uActivity = n.d(this);
       if (uActivity instanceof GifshowActivity) {
          u$a uoa = new u$a(uActivity);
          uoa.c = new LiveGzoneActivityPendantView$b(this);
          uoa.d = uActivity.getUrl();
          uoa.e = p0;
          boolean b = false;
          uoa.l = b;
          uoa.f = this.f;
          u ou = PatchProxy.apply(null, uoa, u$a.class, "1");
          if (ou != patchProxyRe) {
          }else {
             c supportFragm = uoa.b.getSupportFragmentManager();
             String str = "KEY_THEME";
             KwaiWebViewActivity$a uoa1 = KwaiWebViewActivity.N3(uoa.b, uoa.e).o(uoa.d).l(str, b.b(uoa.e));
             if (uoa.a != null) {
                uoa1.l(str, "5");
                intent = uoa1.a();
                Serializable serializable = SerializableHook.getSerializable(intent.getExtras(), "model");
                if (serializable instanceof LaunchModel) {
                   serializable.setWebViewBgColorGrade(true);
                   serializable.setWebViewBgColor(b);
                }
             }else {
                intent = uoa1.a();
             }
             ou = new u(intent.getExtras(), supportFragm, uoa, null);
          }
          this.b = ou;
          Objects.requireNonNull(ou);
          u ou1 = u.class;
          if (!PatchProxy.applyVoid(null, ou, ou1, "9")) {
             u f = ou.f;
             LiveYodaWebViewFragment liveYodaWebV = PatchProxy.applyOneRefs(f, ou, ou1, "3");
             if (liveYodaWebV != patchProxyRe) {
             }else {
                u$a f1 = ou.g.f;
                e uoe1 = (f1 != null)? f1.t5(): null;
                liveYodaWebV = new LiveYodaWebViewFragment(uoe1);
                liveYodaWebV.setArguments(f);
                liveYodaWebV.kh(new s(ou));
                liveYodaWebV.gh(new t(ou));
             }
             ou.a = liveYodaWebV.m().subscribe(new e(ou), f.b);
             if (!PatchProxy.applyVoid(null, ou, ou1, "6")) {
                ou.e.setOnClickListener(new o(ou));
                i0.b(ou.g.b, ou.e);
             }
             ou.b = liveYodaWebV;
             if (!PatchProxy.applyVoid(null, ou, ou1, "4")) {
                View view1 = ou.e.findViewById(R.id.live_webview_wrap_container);
                ViewGroup$LayoutParams layoutParams = view1.getLayoutParams();
                boolean b1 = y.d(n.d(ou.e));
                int i = -1;
                if (b1) {
                   layoutParams.width = ou.k;
                   layoutParams.height = i;
                   ou.h = 0x7f010054;
                   ou.i = 0x7f010056;
                }else {
                   layoutParams.width = i;
                   layoutParams.height = ou.j;
                   ou.h = 0x7f010105;
                   ou.i = 0x7f01010d;
                }
                if (ou.g.m != null && (!PatchProxy.isSupport(ou1) || !PatchProxy.applyVoidTwoRefs(view1, Boolean.valueOf(b1), ou, ou1, "2"))) {
                   view1.setOutlineProvider(new r(ou, b1));
                   view1.setClipToOutline(true);
                }
                view1.requestLayout();
             }
             if (!PatchProxy.applyVoid(null, ou, ou1, "5")) {
                View view = ou.e.findViewById(R.id.live_webview_wrap_close_button);
                view.post(new p(ou, view));
             }
             e uoe = ou.d.beginTransaction();
             uoe.y(ou.h, ou.i);
             uoe.w(R.id.live_webview_wrap_container, liveYodaWebV, "LiveHalfScreenWebViewPopup");
             uoe.m();
          }
       }
       return;
    }
    public void setLivePendantViewListener(b p0){
       this.g = p0;
    }
    public void setUrlHandler(LiveGzoneActivityPendantView$c p0){
       this.h = p0;
    }
}
