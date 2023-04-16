package com.yxcorp.gifshow.postentrance.dialog.presenter.HomePostUploadDialogPresenter$handlePhotoUploadEvent$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import t46.h;
import java.util.Map;

public final class HomePostUploadDialogPresenter$handlePhotoUploadEvent$2 extends Lambda implements l	// class@001044
{
    public final Activity $activity;

    public void HomePostUploadDialogPresenter$handlePhotoUploadEvent$2(Activity p0){
       this.$activity = p0;
       super(1);
    }
    public final t invoke(GrowthGuideItemConfig p0){
       h obj = PatchProxy.applyOneRefs(p0, this, HomePostUploadDialogPresenter$handlePhotoUploadEvent$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "info");
       HomePostUploadDialogPresenter$handlePhotoUploadEvent$2 t$activity = this.$activity;
       a.m(t$activity);
       obj = new h(t$activity);
       return obj.a(p0, null);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
