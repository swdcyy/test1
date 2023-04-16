package com.yxcorp.gifshow.share.screenshot.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import uic.b0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import zic.p0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import java.lang.Integer;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.app.Application;
import o56.a;
import android.content.ContentResolver;
import android.net.Uri;
import xkd.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import brd.t;
import t45.d;
import brd.z;
import uic.z;
import erd.g;
import uic.y;
import erd.a;
import uic.q;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.e;
import android.view.View;
import uic.p;
import android.view.View$OnClickListener;
import ekd.m1;
import uic.r;
import uic.s;
import uic.t;
import uic.u;
import uic.v;
import uic.w;
import uic.x;
import im8.f;

public class w extends PresenterV2	// class@001c6b
{
    public ProgressFragment A;
    public DialogFragment p;
    public f q;
    public BaseFeed r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public Uri y;
    public int z;

    public void w(){
       super();
    }
    public final void P8(){
       w ow = w.class;
       Object[] objArray = null;
       String str = "6";
       if (PatchProxy.applyVoid(objArray, this, ow, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ow, "7")) {
          Activity activity = this.getActivity();
          if (activity != null && this.r != null) {
             this.p.dismissAllowingStateLoss();
             w tr = this.r;
             if (!PatchProxy.applyVoidTwoRefs(tr, activity, objArray, b0.class, str)) {
                b0.a(tr, 1, activity);
                b0.a(tr, 2, activity);
             }
             p0.a(activity, this.r, new StatModel(""));
          }
       }
       return;
    }
    public final void R8(){
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, w.class, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, b0.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SCREENSHOT_FEEDBACK";
          u1.H("", 1, uElementPack, objArray, objArray);
       }
       objArray = new Object[]{Integer.valueOf(this.z)};
       KwaiWebViewActivity$a uoa = KwaiWebViewActivity.N3(this.getActivity(), String.format(WebEntryUrls.B0, objArray));
       String str1 = b.a(a.b().getContentResolver(), this.y);
       Objects.requireNonNull(uoa);
       Object obj = PatchProxy.applyOneRefs(str1, uoa, KwaiWebViewActivity$a.class, str);
       if (obj != PatchProxyResult.class) {
          uoa = obj;
       }else {
          uoa.g(str1);
       }
       c.i(this.getContext(), uoa.m("KEY_ENABLE_SWIPE_BACK", 1).a());
       this.p.dismissAllowingStateLoss();
       return;
    }
    public final void S8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "9")) {
          return;
       }
       if (this.A == null) {
          this.A = new ProgressFragment();
       }
       this.p.dismissAllowingStateLoss();
       this.A.show(this.getActivity().getSupportFragmentManager(), "share_snap_shot");
       t.just(p0).subscribeOn(d.a).doOnError(new z(this)).doFinally(new y(this)).subscribe(new q(this));
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, w.class, "4")) {
          return;
       }
       this.S8("wechat_moments");
       b0.b("2", this.s, this.t, this.u, "wechat_moments");
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, w.class, "5")) {
          return;
       }
       this.S8("wechat");
       RxBus.f.b(new e(this.getActivity(), true));
       b0.b("1", this.s, this.t, this.u, "wechat");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "2")) {
          return;
       }
       m1.a(p0, new p(this), R.id.image_download);
       m1.a(p0, new r(this), R.id.text_download);
       m1.a(p0, new s(this), R.id.image_wechat_circle);
       m1.a(p0, new t(this), R.id.text_wechat_circle);
       m1.a(p0, new u(this), R.id.image_wechat);
       m1.a(p0, new v(this), R.id.text_wechat);
       m1.a(p0, new w(this), R.id.image_feedback);
       m1.a(p0, new x(this), R.id.text_feedback);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.r = this.t8("SCREEN_SHOT_FEED");
       this.p = this.r8("SCREEN_SHOT_DIALOG_FRAGMENT");
       this.q = this.x8("SCREEN_SHOT_PREVIEW_BITMAP");
       this.s = this.r8("SCREEN_SHOT_CONTENT_TYPE");
       this.t = this.r8("SCREEN_SHOT_CONTENT_ID");
       this.u = this.r8("SCREEN_SHOT_AUTHOR_ID");
       this.v = this.r8("SCREEN_SHOT_SUBBIZ");
       this.w = this.r8("SCREEN_SHOT_SHARE_CONTENT");
       this.x = this.r8("SCREEN_SHOT_SHARE_EXP_TAG");
       this.y = this.t8("SCREEN_SHOT_URI");
       this.z = this.r8("SCREEN_SHOT_CHANNEL").intValue();
       return;
    }
}
