package com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewSelectFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.profile.fragment.BaseImmersiveFragment;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewSelectFragment$mPresenterManager$2;
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
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter;
import d2c.a;
import java.util.HashMap;
import lnc.g2;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Objects;
import java.util.ArrayList;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewSelectFragment$a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import kotlin.jvm.internal.a;
import i2b.a;

public final class ProfileBackgroundImagePreviewSelectFragment extends BaseImmersiveFragment implements g2$a	// class@001227
{
    public boolean l;
    public final p m;
    public HashMap n;

    public void ProfileBackgroundImagePreviewSelectFragment(){
       super();
       this.m = s.c(new ProfileBackgroundImagePreviewSelectFragment$mPresenterManager$2(this));
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ProfileBackgroundImagePreviewSelectFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       if (this.l != null) {
          obj.U7(new ProfilePreviewPanelPresenter());
       }
       obj.U7(new ProfilePreviewSelectImagePresenter());
       obj.U7(new a());
       PatchProxy.onMethodExit(ProfileBackgroundImagePreviewSelectFragment.class, "4");
       return obj;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, ProfileBackgroundImagePreviewSelectFragment.class, "6")) {
          return;
       }
       ProfileBackgroundImagePreviewSelectFragment tn = this.n;
       if (tn != null) {
          tn.clear();
       }
       return;
    }
    public final g2 dh(){
       Object obj = PatchProxy.apply(null, this, ProfileBackgroundImagePreviewSelectFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getValue();
    }
    public void onActivityCreated(Bundle p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundImagePreviewSelectFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       p0 = this.getArguments();
       Bundle uBundle = 1;
       boolean b = (p0 != null && p0.getBoolean("from_mine") == uBundle)? true: false;
       this.l = b;
       b = this.getArguments();
       User user = null;
       Serializable serializable = (b != null)? SerializableHook.getSerializable(b, "PROFILE_PREVIEW_PHOTO_FEED"): user;
       Bundle arguments = this.getArguments();
       String str = "";
       if (arguments != null) {
          str1 = arguments.getString("PROFILE_PREVIEW_PHOTO_LAST_UID", str);
          if (str1 != null) {
          label_0045 :
             Bundle arguments1 = this.getArguments();
             if (arguments1 != null) {
                String str2 = "PROFILE_PREVIEW_IMAGE_URLS";
                if (arguments1.containsKey(str2) == uBundle) {
                   uBundle = this.getArguments();
                   Serializable serializable1 = (uBundle != null)? SerializableHook.getSerializable(uBundle, str2): user;
                   Objects.requireNonNull(serializable1, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.yxcorp.gifshow.model.CDNUrl> /* = java.util.ArrayList<com.yxcorp.gifshow.model.CDNUrl> */");
                   Bundle arguments2 = this.getArguments();
                   Serializable serializable2 = (arguments2 != null)? SerializableHook.getSerializable(arguments2, "PROFILE_PREVIEW_PHOTO_USER"): user;
                   if (serializable2 instanceof User) {
                      user = serializable2;
                   }
                   ProfileBackgroundImagePreviewSelectFragment$a uoa = new ProfileBackgroundImagePreviewSelectFragment$a();
                   uoa.b(this);
                   uoa.c = serializable1;
                   uoa.a(serializable);
                   uoa.f = user;
                   uoa.c(str1);
                   uoa.d(this.l);
                   this.dh().b(uoa);
                }else {
                label_009b :
                   arguments1 = this.getArguments();
                   if (arguments1 != null && arguments1.containsKey("PROFILE_PREVIEW_IMAGE_LOCAL_PATH") == uBundle) {
                      uBundle = this.getArguments();
                      if (uBundle != null) {
                         user = uBundle.getString("PROFILE_PREVIEW_IMAGE_LOCAL_PATH", str);
                      }
                      ProfileBackgroundImagePreviewSelectFragment$a uoa1 = new ProfileBackgroundImagePreviewSelectFragment$a();
                      uoa1.b(this);
                      uoa1.d = user;
                      uoa1.a(serializable);
                      uoa1.c(str1);
                      uoa1.d(this.l);
                      this.dh().b(uoa1);
                   }
                }
             }else {
                goto label_009b ;
             }
             return;
          }
       }
       str1 = str;
       goto label_0045 ;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileBackgroundImagePreviewSelectFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d11c0, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­esId\(\), container, false\)");
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.ch();
    }
}
