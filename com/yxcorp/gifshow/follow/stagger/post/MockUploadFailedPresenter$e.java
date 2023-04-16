package com.yxcorp.gifshow.follow.stagger.post.MockUploadFailedPresenter$e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.follow.stagger.post.MockUploadFailedPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.p0;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.s6;
import tkd.b;
import tkd.d;
import mv5.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import hn5.n;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import r16.f;
import lnc.x6;
import lnc.y6;
import com.yxcorp.gifshow.follow.stagger.post.fragment.TopSnackBarFragment;
import e17.i;
import kotlin.jvm.internal.a;
import lv5.d;
import o26.d;

public final class MockUploadFailedPresenter$e implements View$OnClickListener	// class@0011cf
{
    public final MockUploadFailedPresenter b;

    public void MockUploadFailedPresenter$e(MockUploadFailedPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       Activity activity;
       if (PatchProxy.applyVoidOneRefs(p0, this, MockUploadFailedPresenter$e.class, "1")) {
          return;
       }
       this.b.V8("retry");
       if (p0.C(this.b.getActivity()) && MockUploadFailedPresenter.P8(this.b).getPostWorkInfoId() != -1) {
          boolean b = false;
          if (s6.n() && s6.t() == 1) {
             activity = this.b.getActivity();
             if (activity != null) {
                d.a(0x3ee97dc2).yh(activity, b, 5);
             }
          }else {
             activity = this.b.getActivity();
             if (!activity instanceof RxFragmentActivity) {
                activity = null;
             }
             if (activity != null) {
                d.a(-1883158055).r30(activity, b.c);
             }
          }
          f uof = y6.r(f.class);
          if (uof != null) {
             uof.o1(MockUploadFailedPresenter.P8(this.b).getPostWorkInfoId(), b, true);
          }
          this.b.R8().ch();
       }else {
          a.o(i.a(R.style.arg_RES_7f110668, 0x7f1038e5), "KSToast.applyStyle\(R.sty¡­tring.network_failed_tip\)");
       }
       b uob = d.a(-447917650);
       a.o(uob, "PluginManager.get\(MockFeedRepoPlugin::class.java\)");
       d uod = uob.XV();
       if (uod != null) {
          uod.Y5();
       }
       return;
    }
}
