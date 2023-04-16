package com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import im8.f;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.IntimateTag;
import u3c.h;
import k2b.h;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import k2b.e0;
import nsd.r0;
import a3c.c;
import lnc.a1;
import java.util.Arrays;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import z5c.k0;
import zf6.k;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import z5c.u;

public final class UserProfileFavoriteAndMakerPresenter$d extends m	// class@0014ea
{
    public final UserProfileFavoriteAndMakerPresenter c;

    public void UserProfileFavoriteAndMakerPresenter$d(UserProfileFavoriteAndMakerPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       a uoa;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UserProfileFavoriteAndMakerPresenter$d.class, "1")) {
          return;
       }
       a.p(p0, "view");
       UserProfileFavoriteAndMakerPresenter$d tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, UserProfileFavoriteAndMakerPresenter.class, "21")) {
          UserProfileFavoriteAndMakerPresenter y = tc.y;
          String str = "mUserProfileRef";
          if (y == null) {
             a.S(str);
          }
          IntimateTag intimateTag = h.h(y.get());
          if (intimateTag != null) {
             h oh = h.k("RELATIONSHIP_ICON");
             i3 oi3 = i3.f();
             UserProfileFavoriteAndMakerPresenter y1 = tc.y;
             if (y1 == null) {
                a.S(str);
             }
             oi3.c("icon_type", Integer.valueOf(h.g(y1.get())));
             oh.n(oi3.e());
             UserProfileFavoriteAndMakerPresenter x = tc.x;
             String str1 = "mUser";
             if (x == null) {
                a.S(str1);
             }
             oh.c(b0.g(x.getId()));
             x = tc.v;
             if (x == null) {
                a.S("mFragment");
             }
             oh.i(x);
             x = tc.x;
             if (x == null) {
                a.S(str1);
             }
             int i = (c.c(x))? 0x7f103f19: 0x7f103f1a;
             str = a1.p(i);
             a.o(str, "CommonUtil.string\(\n     ¡­le_intimate_tag_tip_male\)");
             Object[] objArray = new Object[]{Integer.valueOf(intimateTag.level),intimateTag.nickName};
             String str2 = String.format(str, Arrays.copyOf(objArray, 2));
             a.o(str2, "java.lang.String.format\(format, *args\)");
             Activity activity = tc.getActivity();
             if (activity != null) {
                a.o(activity, "it");
                BubbleInterface$Position tOP = BubbleInterface$Position.TOP;
                boolean b = (k0.s() || k.d())? true: false;
                uoa = u.i(activity, null, p0, str2, tOP, 0, 3000, b);
             }else {
                uoa = null;
             }
             tc.C = uoa;
          }
       }
       PatchProxy.onMethodExit(UserProfileFavoriteAndMakerPresenter$d.class, "1");
       return;
    }
}
