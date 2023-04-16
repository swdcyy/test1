package com.yxcorp.gifshow.follow.stagger.post.MockUploadFailedPresenter$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.follow.stagger.post.MockUploadFailedPresenter;
import com.kwai.feature.post.api.feature.upload.model.UploadPostForbidNotify$PunishTopDialog;
import java.lang.Object;
import android.view.View;
import r16.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.s6;
import g36.a;
import lnc.x6;
import lnc.y6;
import com.yxcorp.gifshow.entity.QPhoto;
import r26.a;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.post.fragment.TopSnackBarFragment;
import tkd.b;
import tkd.d;
import lv5.d;
import o26.d;

public final class MockUploadFailedPresenter$b implements View$OnClickListener	// class@0011cc
{
    public final MockUploadFailedPresenter b;
    public final UploadPostForbidNotify$PunishTopDialog c;

    public void MockUploadFailedPresenter$b(MockUploadFailedPresenter p0,UploadPostForbidNotify$PunishTopDialog p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MockUploadFailedPresenter$b.class, "1")) {
          return;
       }
       if (s6.B() && (this.b.S8() && this.c != null)) {
          a.a(true, false, false, 6, null);
       }else {
          this.b.V8("close");
       }
       f uof1 = y6.r(uof);
       if (uof1 != null) {
          a uoa = uof1.L0(MockUploadFailedPresenter.P8(this.b).getPostWorkInfoId());
          if (uoa != null) {
             a.o(uoa, "PostPluginManager.get\(Po¡­return@setOnClickListener");
             QPhoto qPhoto = MockUploadFailedPresenter.P8(this.b);
             if (!qPhoto.getMoodTemplateId() && (qPhoto.isUserStatusPhoto() || qPhoto.isRecreationPhoto())) {
                uoa.setShowCancelToast(false);
             }
             x6 ox6 = y6.r(uof);
             if (ox6 != null) {
                ox6.W3(uoa.getId(), true, true, 17, null);
             }
             this.b.R8().ch();
             b uob = d.a(-447917650);
             a.o(uob, "PluginManager.get\(MockFeedRepoPlugin::class.java\)");
             d uod = uob.XV();
             if (uod != null) {
                uod.Y5();
             }
             PatchProxy.onMethodExit(MockUploadFailedPresenter$b.class, "1");
             return;
          }
       }
       PatchProxy.onMethodExit(MockUploadFailedPresenter$b.class, "1");
       return;
    }
}
