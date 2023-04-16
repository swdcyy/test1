package com.yxcorp.login.userlogin.presenter.kwaiapplogin.FollowKwaiAppShareLoginPresenter;
import g2d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.social.login.model.LoginParams;
import mrd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import x45.b$a;
import java.util.Map;
import b3d.v;
import x45.b;
import u45.b;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1;
import android.app.Activity;
import u45.a;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import h3b.a;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import o1d.h;
import java.lang.Boolean;
import brd.y;

public class FollowKwaiAppShareLoginPresenter extends a	// class@001bc0
{

    public void FollowKwaiAppShareLoginPresenter(GifshowActivity p0,LoginParams p1,c p2){
       a.p(p0, "activity");
       a.p(p1, "loginParams");
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, FollowKwaiAppShareLoginPresenter.class, "1")) {
          return;
       }
       ProgressFragment progressFrag = new ProgressFragment();
       progressFrag.Cb(this.c().getSupportFragmentManager(), this.g());
       b$a uoa = new b$a();
       uoa.f("nebula_app");
       uoa.b("code");
       uoa.d(1);
       String[] stringArray = new String[]{"nebula_app"};
       uoa.e(stringArray);
       uoa.c(v.a());
       b uob = uoa.a();
       b.b().d(this.c(), uob, new FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1(this, progressFrag));
       return;
    }
    public String g(){
       return "follow_login_kwai_app";
    }
    public final void h(LoginUserResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowKwaiAppShareLoginPresenter.class, "2")) {
          return;
       }
       a.p(14);
       h.a(p0, 0, "", 7, this.c().N2(), this.d());
       LoginUserResponse mIsNewThirdP = (p0 != null)? p0.mIsNewThirdPlatformUser: false;
       this.f(p0, mIsNewThirdP);
       c uoc = this.e();
       if (uoc != null) {
          uoc.onNext(Boolean.TRUE);
       }
       return;
    }
}
