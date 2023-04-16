package com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoPreviewSelectFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.profile.fragment.BaseImmersiveFragment;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoPreviewSelectFragment$mPresenterManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter;
import d2c.a;
import d2c.b;
import c2c.g;
import c2c.h;
import c2c.d;
import java.util.HashMap;
import android.os.Bundle;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoPreviewSelectFragment$a;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.Objects;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import z5c.k0;
import lnc.g2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;

public final class ProfileBackgroundVideoPreviewSelectFragment extends BaseImmersiveFragment implements g2$a	// class@00123f
{
    public boolean l;
    public final p m;
    public HashMap n;

    public void ProfileBackgroundVideoPreviewSelectFragment(){
       super();
       this.m = s.c(new ProfileBackgroundVideoPreviewSelectFragment$mPresenterManager$2(this));
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ProfileBackgroundVideoPreviewSelectFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       if (this.l != null) {
          obj.U7(new ProfilePreviewPanelPresenter());
       }
       obj.U7(new a());
       obj.U7(new b());
       obj.U7(new g());
       obj.U7(new h());
       obj.U7(new d());
       PatchProxy.onMethodExit(ProfileBackgroundVideoPreviewSelectFragment.class, "4");
       return obj;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, ProfileBackgroundVideoPreviewSelectFragment.class, "6")) {
          return;
       }
       ProfileBackgroundVideoPreviewSelectFragment tn = this.n;
       if (tn != null) {
          tn.clear();
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       ProfileBackgroundVideoPreviewSelectFragment$a uoa = ProfileBackgroundVideoPreviewSelectFragment$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundVideoPreviewSelectFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       p0 = this.getArguments();
       Serializable serializable = (p0 != null)? SerializableHook.getSerializable(p0, "PROFILE_PREVIEW_VIDEO_INFO"): null;
       Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo");
       Bundle arguments = this.getArguments();
       boolean b = true;
       if (arguments == null || arguments.getBoolean("from_mine") != b) {
          b = false;
       }
       this.l = b;
       arguments = this.getArguments();
       String str = "";
       if (arguments != null) {
          String str1 = arguments.getString("PROFILE_PREVIEW_PHOTO_LAST_UID", str);
          if (str1 != null) {
             str = str1;
          }
       }
       arguments = this.getArguments();
       long longx = (arguments != null)? arguments.getLong("PROFILE_PREVIEW_VIDEO_PROGRESS"): 0;
       ProfileBackgroundVideoPreviewSelectFragment$a uoa1 = new ProfileBackgroundVideoPreviewSelectFragment$a();
       if (!PatchProxy.applyVoidOneRefs(this, uoa1, uoa, "2")) {
          a.p(this, "<set-?>");
          uoa1.b = this;
       }
       if (!PatchProxy.applyVoidOneRefs(serializable, uoa1, uoa, "4")) {
          a.p(serializable, "<set-?>");
          uoa1.c = serializable;
       }
       uoa1.e = longx;
       uoa1.f = serializable.getFeed();
       uoa1.g = serializable.getUser();
       if (!PatchProxy.applyVoidOneRefs(str, uoa1, uoa, "7")) {
          a.p(str, "<set-?>");
          uoa1.h = str;
       }
       uoa1.i = k0.u();
       uoa1.j = this.l;
       g2 og2 = PatchProxy.apply(null, this, ProfileBackgroundVideoPreviewSelectFragment.class, "1");
       if (og2 == PatchProxyResult.class) {
          og2 = this.m.getValue();
       }
       og2.b(uoa1);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileBackgroundVideoPreviewSelectFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d11c8, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­esId\(\), container, false\)");
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.ch();
    }
}
