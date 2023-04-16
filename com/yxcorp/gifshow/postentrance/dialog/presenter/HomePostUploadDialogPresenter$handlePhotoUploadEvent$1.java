package com.yxcorp.gifshow.postentrance.dialog.presenter.HomePostUploadDialogPresenter$handlePhotoUploadEvent$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import uzb.a;
import w16.n;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import a0c.g;
import q87.c;
import r26.a;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Integer;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import java.lang.Throwable;

public final class HomePostUploadDialogPresenter$handlePhotoUploadEvent$1 extends Lambda implements a	// class@001043
{
    public final n $event;
    public final a this$0;

    public void HomePostUploadDialogPresenter$handlePhotoUploadEvent$1(a p0,n p1){
       this.this$0 = p0;
       this.$event = p1;
       super(0);
    }
    public final t invoke(){
       t ot1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       HomePostUploadDialogPresenter$handlePhotoUploadEvent$1 obj = PatchProxy.apply(objArray, this, HomePostUploadDialogPresenter$handlePhotoUploadEvent$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       HomePostUploadDialogPresenter$handlePhotoUploadEvent$1 t$event = this.$event;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyOneRefs(t$event, obj, a.class, "4");
       if (ot != patchProxyRe) {
       }else {
          int i = 0;
          Object[] objArray1 = new Object[i];
          g.C().w("HomePostUploadDialogPresenter", "prepareGuideInfo", objArray1);
          IUploadInfo uploadInfo = t$event.a().getUploadInfo();
          a.o(uploadInfo, "uploadInfo");
          Map publishedGui = uploadInfo.getPublishedGuideTaskInfoMap();
          if (publishedGui != null) {
             objArray = publishedGui.get(Integer.valueOf(uploadInfo.getTaskType()));
          }
          if (objArray != null) {
             ot1 = t.just(objArray);
             a.o(ot1, "Observable.just\(uploadConfig\)");
          }else {
             Object[] objArray2 = new Object[i];
             g.C().w("HomePostUploadDialogPresenter", "handlePhotoUploadEvent upload config is null", objArray2);
             ot1 = t.error(new Throwable("config is null"));
             a.o(ot1, "Observable.error\(Throwable\(\"config is null\"\)\)");
          }
          ot = ot1;
       }
       return ot;
    }
    public Object invoke(){
       return this.invoke();
    }
}
