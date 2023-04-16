package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter$mScreenWidth$2;
import msd.a;
import qrd.p;
import qrd.s;
import xl8.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import brd.t;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter$a;
import z5c.l0;
import erd.g;
import crd.b;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter$b;
import com.kwai.framework.model.user.User;
import z5c.d3;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter$c;
import android.view.View$OnClickListener;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import lnc.d2;
import z5c.o2;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import m4c.a;
import android.graphics.drawable.ColorDrawable;
import androidx.fragment.app.Fragment;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter$d;
import rkd.b;
import uc.d;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import com.google.android.material.appbar.AppBarLayout;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import im8.f;

public final class ProfileHeaderBackgroundImagePresenter extends PresenterV2	// class@0014a3
{
    public final p A;
    public View p;
    public KwaiImageView q;
    public AppBarLayout r;
    public BaseFragment s;
    public User t;
    public f u;
    public PublishSubject v;
    public b w;
    public int x;
    public int y;
    public int z;

    public void ProfileHeaderBackgroundImagePresenter(){
       super();
       this.x = 5;
       this.y = a1.d(0x7f070d46);
       this.A = s.c(new ProfileHeaderBackgroundImagePresenter$mScreenWidth$2(this));
    }
    public static final b P8(ProfileHeaderBackgroundImagePresenter p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mBackgroundStatus");
       }
       return p0;
    }
    public static final View R8(ProfileHeaderBackgroundImagePresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mHeaderBgImageContainer");
       }
       return p0;
    }
    public static final KwaiImageView S8(ProfileHeaderBackgroundImagePresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mHeaderImage");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundImagePresenter.class, "4")) {
          return;
       }
       ProfileHeaderBackgroundImagePresenter tq = this.q;
       if (tq == null) {
          a.S("mHeaderImage");
       }
       tq.setBackgroundColor(a1.a(R.color.arg_RES_7f0616be));
       tq = this.w;
       if (tq == null) {
          a.S("mBackgroundStatus");
       }
       this.X7(tq.observable().subscribe(new ProfileHeaderBackgroundImagePresenter$a(this), l0.b));
       tq = this.v;
       if (tq == null) {
          a.S("mOnConfigurationChangedPublisher");
       }
       this.X7(tq.delay(100, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new ProfileHeaderBackgroundImagePresenter$b(this)));
       tq = this.t;
       if (tq == null) {
          a.S("mUser");
       }
       if (!d3.a(tq)) {
          m1.a(this.m8(), new ProfileHeaderBackgroundImagePresenter$c(this), R.id.profile_background_container);
       }
       return;
    }
    public final int V8(){
       Object obj = PatchProxy.apply(null, this, ProfileHeaderBackgroundImagePresenter.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.A.getValue();
       }
       return obj.intValue();
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundImagePresenter.class, "7")) {
          return;
       }
       Activity activity = this.getActivity();
       int i = (activity != null)? d2.b(activity): o2.a(this.getActivity());
       this.z = i;
       return;
    }
    public final void X8(ImageRequestBuilder p0,ImageView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileHeaderBackgroundImagePresenter.class, "6")) {
          return;
       }
       ProfileHeaderBackgroundImagePresenter tw = this.w;
       if (tw == null) {
          a.S("mBackgroundStatus");
       }
       if (tw.a().d()) {
          return;
       }else {
          ColorDrawable uColorDrawab = new ColorDrawable(a1.a(0x7f061ca3));
          if (p0 == null) {
             ProfileHeaderBackgroundImagePresenter ts = this.s;
             if (ts == null) {
                a.S("mFragment");
             }
             if (ts.isAdded()) {
                p1.setImageDrawable(uColorDrawab);
             }
          }else {
             ProfileHeaderBackgroundImagePresenter$d uod = new ProfileHeaderBackgroundImagePresenter$d(this, p1, uColorDrawab);
             if (b.g()) {
                this.W8();
                p0.v(new d(this.z, this.y));
             }else {
                p0.v(new d(this.V8(), this.y));
             }
             a.d(p0.a(), uod);
          }
          return;
       }
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundImagePresenter.class, "2")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.background);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.background\)");
       this.q = view;
       view = m1.f(p0, R.id.profile_background_container);
       a.o(view, "ViewBindUtils.bindWidget¡­ile_background_container\)");
       this.p = view;
       p0 = m1.f(p0, R.id.app_bar_layout);
       a.o(p0, "ViewBindUtils.bindWidget¡­iew, R.id.app_bar_layout\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundImagePresenter.class, "3")) {
          return;
       }
       f obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.s = obj;
       obj = this.q8(User.class);
       a.o(obj, "inject\(User::class.java\)");
       this.t = obj;
       obj = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­FIGURATION_CHANGED_EVENT\)");
       this.v = obj;
       obj = this.r8("PROFILE_BACKGROUND_STYLE");
       a.o(obj, "inject\(com.yxcorp.gifsho¡­PROFILE_BACKGROUND_STYLE\)");
       this.w = obj;
       obj = this.x8("DATA_USER_PROFILE");
       a.o(obj, "injectRef\(SocialAccessIds.DATA_USER_PROFILE\)");
       this.u = obj;
       Object obj1 = this.r8("PROFILE_STYLE");
       a.o(obj1, "inject\(ProfileCommonAccessIds.PROFILE_STYLE\)");
       this.x = obj1.intValue();
       return;
    }
}
