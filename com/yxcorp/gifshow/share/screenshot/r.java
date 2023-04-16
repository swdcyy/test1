package com.yxcorp.gifshow.share.screenshot.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import h4d.a;
import uic.b0;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import java.util.ArrayList;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import brd.t;
import t45.d;
import brd.z;
import uic.h;
import erd.g;
import uic.f;
import erd.a;
import uic.i;
import com.yxcorp.gifshow.share.screenshot.p;
import crd.b;
import android.view.View;
import uic.d;
import android.view.View$OnClickListener;
import ekd.m1;
import uic.e;
import uic.c;
import android.net.Uri;

public class r extends PresenterV2	// class@001c65
{
    public DialogFragment p;
    public BaseFeed q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public Uri w;
    public ProgressFragment x;
    public Bitmap y;
    public QPhoto z;

    public void r(){
       super();
    }
    public void E8(){
       r or = r.class;
       if (PatchProxy.applyVoid(null, this, or, "3")) {
          return;
       }
       this.z = new QPhoto(this.q);
       if (!PatchProxy.applyVoid(null, this, or, "4")) {
          boolean b = false;
          int i = 1;
          boolean b1 = (!TextUtils.x(this.s) && a.d(this.getContext()))? true: false;
          if (!TextUtils.x(this.s) && a.b(this.getContext())) {
             b = true;
          }
          r tq = this.q;
          if (!PatchProxy.isSupport(b0.class) || !PatchProxy.applyVoidFourRefs(tq, Boolean.valueOf(b1), Boolean.valueOf(b), Boolean.FALSE, null, b0.class, "9")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHOW_SHARE_SCREEN_SHOT";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             if (tq != null) {
                uContentPack.photoPackage = w1.f(tq);
             }
             ArrayList uArrayList = new ArrayList();
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             userPackage.kwaiId = "wechat_session";
             userPackage.index = i;
             ClientContent$UserPackage userPackage1 = new ClientContent$UserPackage();
             userPackage1.kwaiId = "wechat_timeline";
             userPackage1.index = 2;
             if (b1) {
                uArrayList.add(userPackage);
                uArrayList.add(userPackage1);
             }
             ClientContent$UserPackage userPackage2 = new ClientContent$UserPackage();
             userPackage2.kwaiId = "qq";
             userPackage2.index = 3;
             if (b) {
                uArrayList.add(userPackage2);
             }
             userPackage2 = new ClientContent$UserPackage();
             userPackage2.kwaiId = "screenShotDownload";
             userPackage2.index = 3;
             ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
             uContentPack.batchUserPackage = uBatchUserPa;
             ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[uArrayList.size()];
             uBatchUserPa.userPackage = uArrayList.toArray(userPackageA);
             u1.v0(4, uElementPack, uContentPack, null);
          }
       }
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "7")) {
          return;
       }
       if (this.x == null) {
          this.x = new ProgressFragment();
       }
       this.p.dismissAllowingStateLoss();
       this.x.show(this.getActivity().getSupportFragmentManager(), "share_snap_shot");
       t.just(p0).subscribeOn(d.a).doOnError(new h(this)).doFinally(new f(this)).subscribe(new i(this), p.b);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       m1.a(p0, new d(this), R.id.ll_wechat_container_screen_shot);
       m1.a(p0, new e(this), R.id.ll_circle_container_screen_shot);
       m1.a(p0, new c(this), R.id.ll_qq_container_screen_shot);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "2")) {
          return;
       }
       this.q = this.t8("SCREEN_SHOT_FEED");
       this.p = this.r8("SCREEN_SHOT_DIALOG_FRAGMENT");
       this.r = this.r8("SCREEN_SHOT_CONTENT_TYPE");
       this.s = this.r8("SCREEN_SHOT_CONTENT_ID");
       this.t = this.r8("SCREEN_SHOT_AUTHOR_ID");
       this.u = this.r8("SCREEN_SHOT_SUBBIZ");
       this.v = this.r8("SCREEN_SHOT_SHARE_CONTENT");
       this.w = this.t8("SCREEN_SHOT_URI");
       return;
    }
}
