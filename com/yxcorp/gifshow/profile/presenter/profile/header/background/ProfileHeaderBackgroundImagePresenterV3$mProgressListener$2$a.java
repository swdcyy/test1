package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2$a;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$e;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2;
import java.lang.Object;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3;
import android.view.View;
import e17.i$b;
import e17.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import android.view.ViewGroup;
import io.reactivex.subjects.PublishSubject;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.SectorProgressView;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Integer;
import z5c.f3;
import ekd.m1;
import java.lang.StringBuilder;
import java.lang.Throwable;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.yxcorp.gifshow.profile.state.ProfileRefreshStatus;

public final class ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2$a implements ProfileBackgroundPublishManager$e	// class@0014b3
{
    public final ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2 a;

    public void ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2$a(ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(ProfileBgVideoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2$a.class, "4")) {
          return;
       }
       a.p(p0, "videoInfo");
       ProfileHeaderBackgroundImagePresenterV3 i = this.a.this$0.I;
       if (i != null) {
          i.setVisibility(8);
       }
       i$b uob = i.m();
       uob.x(R.string.arg_RES_7f103e9b);
       uob.p(R.drawable.arg_RES_7f082463);
       uob.o(3000);
       View view = this.a.this$0.m8();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       uob.n(view);
       i.z(uob);
       ProfileHeaderBackgroundImagePresenterV3.X8(this.a.this$0).onNext(Boolean.TRUE);
       return;
    }
    public void b(ProfileBgVideoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2$a.class, "3")) {
          return;
       }
       a.p(p0, "videoInfo");
       ProfileHeaderBackgroundImagePresenterV3 j = this.a.this$0.J;
       if (j != null) {
          j.setPercent(100.00f);
       }
       j = this.a.this$0.L;
       if (j != null) {
          j.setText(a1.r(R.string.arg_RES_7f10506a, "100%"));
       }
       return;
    }
    public void c(ProfileBgVideoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "videoInfo");
       ProfileHeaderBackgroundImagePresenterV3.X8(this.a.this$0).onNext(Boolean.TRUE);
       p0.T = false;
       return;
    }
    public void d(ProfileBgVideoInfo p0,int p1,int p2){
       if (PatchProxy.isSupport(ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2$a.class, "2")) {
          return;
       }
       a.p(p0, "videoInfo");
       ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2 this$0 = this.a.this$0;
       if (this$0.I == null) {
          ProfileHeaderBackgroundImagePresenterV3 h = this$0.H;
          if (h == null) {
             a.S("mVideoUploadViewStub");
          }
          this$0.I = f3.a(h);
          this$0 = this.a.this$0;
          this$0.J = m1.f(this$0.I, 0x7f0a311b);
          this$0 = this.a.this$0;
          this$0.L = m1.f(this$0.I, 0x7f0a4343);
       }
       ProfileHeaderBackgroundImagePresenterV3 i = this.a.this$0.I;
       if (i != null) {
          i.setVisibility(0);
       }
       i = this.a.this$0.J;
       if (i != null) {
          i.setPercent((((float)p1 / (float)p2) * (float)100));
       }
       i = this.a.this$0.L;
       if (i != null) {
          i.setText(a1.r(R.string.arg_RES_7f10506a, p1+'%'));
       }
       this$0 = this.a.this$0;
       if (this$0.T == null) {
          this$0.T = true;
          this$0.m9();
       }
       return;
    }
    public void e(ProfileBgVideoInfo p0,int p1,String p2,Throwable p3){
       if (PatchProxy.isSupport(ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, ProfileHeaderBackgroundImagePresenterV3$mProgressListener$2$a.class, "5")) {
          return;
       }
       a.p(p0, "videoInfo");
       ProfileHeaderBackgroundImagePresenterV3 i = this.a.this$0.I;
       if (i != null) {
          i.setVisibility(8);
       }
       if (p0.getStatus() == 2) {
          i$b uob = i.m();
          uob.x(R.string.arg_RES_7f104f9d);
          uob.p(R.drawable.arg_RES_7f082462);
          uob.o(3000);
          View view = this.a.this$0.m8();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          uob.n(view);
          a.o(i.z(uob), "KSToast.show<KSToast>\(\n ¡­as ViewGroup\)\n          \)");
       }else {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          ExceptionHandler.handleException(uoc.a(), p3);
       }
       ProfileHeaderBackgroundImagePresenterV3.Y8(this.a.this$0).b("PROFILE_REFRESH", "MAIN_KEY", ProfileRefreshStatus.PROFILE);
       return;
    }
}
