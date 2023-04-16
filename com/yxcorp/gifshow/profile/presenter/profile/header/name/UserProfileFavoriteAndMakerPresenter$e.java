package com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$e;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ki5.b;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import z5c.k0;
import zf6.k;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import z5c.u;

public final class UserProfileFavoriteAndMakerPresenter$e extends m	// class@0014eb
{
    public final UserProfileFavoriteAndMakerPresenter c;

    public void UserProfileFavoriteAndMakerPresenter$e(UserProfileFavoriteAndMakerPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       boolean b;
       a uoa;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UserProfileFavoriteAndMakerPresenter$e.class, "1")) {
          return;
       }
       a.p(p0, "view");
       UserProfileFavoriteAndMakerPresenter$e tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, UserProfileFavoriteAndMakerPresenter.class, "20")) {
          Activity activity = tc.getActivity();
          if (activity != null) {
             a.o(activity, "it");
             String str = b.b().c(R.string.arg_RES_7f100e52);
             a.o(str, "SocialLanguageManager.ge¡­String\(R.string.favorite\)");
             BubbleInterface$Position tOP = BubbleInterface$Position.TOP;
             b = (k0.s() || k.d())? true: false;
             uoa = u.i(activity, null, p0, str, tOP, null, 3000, b);
          }else {
             uoa = null;
          }
          tc.C = uoa;
       }
       PatchProxy.onMethodExit(UserProfileFavoriteAndMakerPresenter$e.class, "1");
       return;
    }
}
