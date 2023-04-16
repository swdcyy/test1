package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter$a;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter;
import java.lang.Object;
import m4c.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import m4c.s;
import m4c.d;
import lnc.a1;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;
import xl8.b;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.io.File;
import android.net.Uri;
import ekd.x0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import android.widget.ImageView;
import s0d.f;
import java.util.List;
import java.util.Collection;
import s0d.e;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;

public final class ProfileHeaderBackgroundImagePresenter$a implements g	// class@00149e
{
    public final ProfileHeaderBackgroundImagePresenter b;

    public void ProfileHeaderBackgroundImagePresenter$a(ProfileHeaderBackgroundImagePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       ImageRequestBuilder imageRequest;
       e[] uoeArray;
       int i1;
       ProfileHeaderBackgroundImagePresenter q;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundImagePresenter$a.class, "1")) {
       }else {
          a.p(p0, "status");
          if (!p0.d()) {
             int i = 0;
             ProfileHeaderBackgroundImagePresenter.R8(this.b).setVisibility(i);
             Context context = this.b.getContext();
             a.m(context);
             a.o(context, "context!!");
             s.a(ProfileHeaderBackgroundImagePresenter.S8(this.b), context);
             p0 = d.a;
             ProfileHeaderBackgroundImagePresenter r = this.b.r;
             if (r == null) {
                a.S("mAppBarLayout");
             }
             p0.f(r, ProfileHeaderBackgroundImagePresenter.S8(this.b), a1.d(R.dimen.arg_RES_7f0702a5));
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, ProfileHeaderBackgroundImagePresenter.class, "5")) {
                r = p0.w;
                String str = "mBackgroundStatus";
                if (r == null) {
                   a.S(str);
                }
                ProfileBgVideoInfo profileBgVid = r.a().e();
                if (profileBgVid != null) {
                   if (profileBgVid.getLocalVideo()) {
                      imageRequest = ImageRequestBuilder.k(x0.e(new File(profileBgVid.getPath())));
                      r = p0.q;
                      if (r == null) {
                         a.S("mHeaderImage");
                      }
                      p0.X8(imageRequest, r);
                   }else {
                      uoeArray = f.x().q(profileBgVid.getCoverUrls()).w();
                      a.o(uoeArray, "requests");
                      i1 = (!uoeArray.length)? 1: 0;
                      if (i1 ^ 1) {
                         imageRequest = ImageRequestBuilder.d(uoeArray[i]);
                         r = p0.q;
                         if (r == null) {
                            a.S("mHeaderImage");
                         }
                         p0.X8(imageRequest, r);
                      }else {
                         q = p0.q;
                         if (q == null) {
                            a.S("mHeaderImage");
                         }
                         p0.X8(null, q);
                      }
                   }
                }else {
                   r = p0.w;
                   if (r == null) {
                      a.S(str);
                   }
                   File uFile = r.a().c();
                   if (uFile != null) {
                      imageRequest = ImageRequestBuilder.k(x0.e(uFile));
                      r = p0.q;
                      if (r == null) {
                         a.S("mHeaderImage");
                      }
                      p0.X8(imageRequest, r);
                   }else {
                      f uof = f.x();
                      ProfileHeaderBackgroundImagePresenter w = p0.w;
                      if (w == null) {
                         a.S(str);
                      }
                      uoeArray = uof.q(w.a().b()).w();
                      a.o(uoeArray, "requests");
                      i1 = (!uoeArray.length)? 1: 0;
                      if (i1 ^ 1) {
                         imageRequest = ImageRequestBuilder.d(uoeArray[i]);
                         r = p0.q;
                         if (r == null) {
                            a.S("mHeaderImage");
                         }
                         p0.X8(imageRequest, r);
                      }else {
                         q = p0.q;
                         if (q == null) {
                            a.S("mHeaderImage");
                         }
                         p0.X8(null, q);
                      }
                   }
                }
             }
          }else {
             ProfileHeaderBackgroundImagePresenter.R8(this.b).setVisibility(8);
          }
       }
       return;
    }
}
