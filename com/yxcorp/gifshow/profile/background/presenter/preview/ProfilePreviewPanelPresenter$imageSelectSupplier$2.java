package com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter$imageSelectSupplier$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.tbruyelle.rxpermissions2.g;
import java.io.File;
import wkd.b;
import j80.c;
import z5c.i1;

public final class ProfilePreviewPanelPresenter$imageSelectSupplier$2 extends Lambda implements a	// class@001279
{
    public final ProfilePreviewPanelPresenter this$0;

    public void ProfilePreviewPanelPresenter$imageSelectSupplier$2(ProfilePreviewPanelPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final ImageSelectSupplier invoke(){
       Activity activity;
       Activity activity1;
       ImageSelectSupplier obj = PatchProxy.apply(null, this, ProfilePreviewPanelPresenter$imageSelectSupplier$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = -1504323719;
       String str = "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity";
       if (this.this$0.S8()) {
          activity = this.this$0.getActivity();
          Objects.requireNonNull(activity, str);
          activity1 = this.this$0.getActivity();
          Objects.requireNonNull(activity1, str);
          obj = new ImageSelectSupplier(activity, new g(activity1), new File(b.a(i).o(), "background.jpg"));
          obj.h(57.00f);
          obj.j(3.00f);
       }else {
          activity = this.this$0.getActivity();
          Objects.requireNonNull(activity, str);
          activity1 = this.this$0.getActivity();
          Objects.requireNonNull(activity1, str);
          i1 oi1 = new i1(activity, new g(activity1), new File(b.a(i).o(), "background.jpg"));
          oi1.h(57.00f);
          oi1.j(3.00f);
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
