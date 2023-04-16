package com.yxcorp.gifshow.follow.stagger.post.MockUploadFailedPresenter$c;
import android.view.View$OnClickListener;
import com.kwai.feature.post.api.feature.upload.model.UploadPostForbidNotify$PunishTopDialog;
import com.yxcorp.gifshow.follow.stagger.post.MockUploadFailedPresenter;
import java.lang.Object;
import android.view.View;
import r16.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g36.a;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import lnc.x6;
import lnc.y6;
import com.yxcorp.gifshow.entity.QPhoto;
import r26.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.post.fragment.TopSnackBarFragment;
import tkd.b;
import tkd.d;
import lv5.d;
import o26.d;

public final class MockUploadFailedPresenter$c implements View$OnClickListener	// class@0011cd
{
    public final UploadPostForbidNotify$PunishTopDialog b;
    public final MockUploadFailedPresenter c;

    public void MockUploadFailedPresenter$c(UploadPostForbidNotify$PunishTopDialog p0,MockUploadFailedPresenter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MockUploadFailedPresenter$c.class, "1")) {
          return;
       }
       boolean b = false;
       a.a(b, b, true, 3, null);
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       ActivityContext uActivityCon1 = ActivityContext.g();
       a.o(uActivityCon1, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon1.e();
       uActivityCon.e().startActivity(KwaiYodaWebViewActivity.G3(uActivity, this.b.mButton1Link).a());
       f uof1 = y6.r(uof);
       if (uof1 != null) {
          a uoa = uof1.L0(MockUploadFailedPresenter.P8(this.c).getPostWorkInfoId());
          if (uoa != null) {
             a.o(uoa, "PostPluginManager.get\(Po¡­return@setOnClickListener");
             QPhoto qPhoto = MockUploadFailedPresenter.P8(this.c);
             if (!qPhoto.getMoodTemplateId() && (qPhoto.isUserStatusPhoto() || qPhoto.isRecreationPhoto())) {
                uoa.setShowCancelToast(b);
             }
             x6 ox6 = y6.r(uof);
             if (ox6 != null) {
                ox6.W3(uoa.getId(), true, true, 17, null);
             }
             this.c.R8().ch();
             b uob = d.a(-447917650);
             a.o(uob, "PluginManager.get\(MockFeedRepoPlugin::class.java\)");
             d uod = uob.XV();
             if (uod != null) {
                uod.Y5();
             }
             PatchProxy.onMethodExit(MockUploadFailedPresenter$c.class, "1");
             return;
          }
       }
       PatchProxy.onMethodExit(MockUploadFailedPresenter$c.class, "1");
       return;
    }
}
