package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideCollectPresenter$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideCollectPresenter$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideCollectPresenter;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import k2b.u1;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import java.lang.System;
import wy5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import xy5.j;
import e8a.u;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;

public final class NasaProfileSideCollectPresenter$a$a implements View$OnClickListener	// class@001913
{
    public final NasaProfileSideCollectPresenter$a b;

    public void NasaProfileSideCollectPresenter$a$a(NasaProfileSideCollectPresenter$a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       PhotoDetailParam mPhoto;
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaProfileSideCollectPresenter$a$a.class, "1")) {
          return;
       }
       NasaProfileSideCollectPresenter$a b = this.b.b;
       Objects.requireNonNull(b);
       NasaProfileSideCollectPresenter nasaProfileS = NasaProfileSideCollectPresenter.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, b, nasaProfileS, "7")) {
          String str = "SLIDE_BAR";
          if (!PatchProxy.applyVoid(objArray, b, nasaProfileS, "12")) {
             nasaProfileS = b.x;
             if (nasaProfileS == null) {
                a.S("mPhotoDetailParam");
             }
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             mPhoto = nasaProfileS.mPhoto;
             a.o(mPhoto, "mPhoto");
             uContentPack.photoPackage = w1.f(mPhoto.getEntity());
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "COLLECTION_BUTTON";
             i3 oi3 = i3.f();
             PhotoDetailParam mPhoto1 = nasaProfileS.mPhoto;
             a.o(mPhoto1, "mPhoto");
             String str1 = (mPhoto1.isCollected())? "CANCEL_COLLECTION": "TO_COLLECTION";
             oi3.d("collection_type", str1);
             oi3.d("show_pos", str);
             uElementPack.params = oi3.e();
             u1.L("", b.u, true, uElementPack, uContentPack);
          }
          if (!VisitorModeManager.g(11)) {
             nasaProfileS = b.t;
             if (nasaProfileS == null) {
                a.S("mPhoto");
             }
             if (!nasaProfileS.isCollected()) {
                a.k(System.currentTimeMillis());
             }
             nasaProfileS = b.w;
             if (nasaProfileS == null) {
                a.S("mCollectHelper");
             }
             Activity activity = b.getActivity();
             Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
             t ot = nasaProfileS.a(activity, str);
             if (ot != null) {
                b.X7(ot.subscribe(u.b, Functions.e));
             }
             nasaProfileS = b.t;
             if (nasaProfileS == null) {
                a.S("mPhoto");
             }
             if (nasaProfileS.isCollected()) {
                b.P8(false);
             }else {
                b.P8(true);
             }
             b.S8();
          }
       }
       return;
    }
}
