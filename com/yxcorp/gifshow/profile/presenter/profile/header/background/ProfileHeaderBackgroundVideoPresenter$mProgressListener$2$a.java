package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$e;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$mProgressListener$2;
import java.lang.Object;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter;
import android.view.View;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a$a;
import z5c.l0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
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
import e17.i$b;
import e17.i;
import java.util.Objects;
import android.view.ViewGroup;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a implements ProfileBackgroundPublishManager$e	// class@0014ce
{
    public final ProfileHeaderBackgroundVideoPresenter$mProgressListener$2 a;

    public void ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a(ProfileHeaderBackgroundVideoPresenter$mProgressListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(ProfileBgVideoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a.class, "4")) {
          return;
       }
       a.p(p0, "videoInfo");
       ProfileHeaderBackgroundVideoPresenter v = this.a.this$0.v;
       if (v != null) {
          v.setVisibility(8);
       }
       this.a.this$0.X7(t.timer(300, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(new ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a$a(this), l0.a));
       ProfileHeaderBackgroundVideoPresenter.P8(this.a.this$0).onNext(Boolean.TRUE);
       return;
    }
    public void b(ProfileBgVideoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a.class, "3")) {
          return;
       }
       a.p(p0, "videoInfo");
       ProfileHeaderBackgroundVideoPresenter w = this.a.this$0.w;
       if (w != null) {
          w.setPercent(100.00f);
       }
       w = this.a.this$0.x;
       if (w != null) {
          w.setText(a1.r(R.string.arg_RES_7f10506a, "100%"));
       }
       return;
    }
    public void c(ProfileBgVideoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "videoInfo");
       ProfileHeaderBackgroundVideoPresenter.P8(this.a.this$0).onNext(Boolean.TRUE);
       return;
    }
    public void d(ProfileBgVideoInfo p0,int p1,int p2){
       if (PatchProxy.isSupport(ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a.class, "2")) {
          return;
       }
       a.p(p0, "videoInfo");
       this.a.this$0.R8(p0);
       ProfileHeaderBackgroundVideoPresenter$mProgressListener$2 this$0 = this.a.this$0;
       if (this$0.v == null) {
          ProfileHeaderBackgroundVideoPresenter u = this$0.u;
          if (u != null) {
             a.m(u);
             this$0.v = f3.a(u);
             this$0 = this.a.this$0;
             this$0.w = m1.f(this$0.v, 0x7f0a311b);
             this$0 = this.a.this$0;
             this$0.x = m1.f(this$0.v, 0x7f0a4343);
          }else {
             return;
          }
       }
       ProfileHeaderBackgroundVideoPresenter v = this.a.this$0.v;
       if (v != null) {
          v.setVisibility(0);
       }
       v = this.a.this$0.w;
       if (v != null) {
          v.setPercent((((float)p1 / (float)p2) * (float)100));
       }
       v = this.a.this$0.x;
       if (v != null) {
          v.setText(a1.r(R.string.arg_RES_7f10506a, p1+'%'));
       }
       return;
    }
    public void e(ProfileBgVideoInfo p0,int p1,String p2,Throwable p3){
       if (PatchProxy.isSupport(ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, ProfileHeaderBackgroundVideoPresenter$mProgressListener$2$a.class, "5")) {
          return;
       }
       a.p(p0, "videoInfo");
       ProfileHeaderBackgroundVideoPresenter v = this.a.this$0.v;
       if (v != null) {
          v.setVisibility(8);
       }
       if (p0.getStatus() == 2) {
          i$b uob = i.m();
          uob.x(R.string.arg_RES_7f104f9d);
          uob.p(R.drawable.arg_RES_7f082462);
          uob.o(3000);
          View view = this.a.this$0.m8();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          uob.n(view);
          a.o(i.z(uob), "KSToast.show<KSToast>\(KS¡­w\(rootView as ViewGroup\)\)");
       }else {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          ExceptionHandler.handleException(uoc.a(), p3);
       }
       ProfileHeaderBackgroundVideoPresenter.P8(this.a.this$0).onNext(Boolean.TRUE);
       return;
    }
}
