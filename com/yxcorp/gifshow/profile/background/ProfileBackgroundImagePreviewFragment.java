package com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.profile.fragment.BaseImmersiveFragment;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewFragment$mPresenterManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter;
import java.util.HashMap;
import lnc.g2;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.Objects;
import java.util.ArrayList;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewFragment$a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import kotlin.jvm.internal.a;
import i2b.a;

public final class ProfileBackgroundImagePreviewFragment extends BaseImmersiveFragment implements g2$a	// class@001224
{
    public final p l;
    public HashMap m;

    public void ProfileBackgroundImagePreviewFragment(){
       super();
       this.l = s.c(new ProfileBackgroundImagePreviewFragment$mPresenterManager$2(this));
    }
    public PresenterV2 B2(){
       ProfilePreviewImagePresenter profilePrevi = PatchProxy.apply(null, this, ProfileBackgroundImagePreviewFragment.class, "4");
       if (profilePrevi != PatchProxyResult.class) {
       }else {
          profilePrevi = new ProfilePreviewImagePresenter();
       }
       return profilePrevi;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, ProfileBackgroundImagePreviewFragment.class, "6")) {
          return;
       }
       ProfileBackgroundImagePreviewFragment tm = this.m;
       if (tm != null) {
          tm.clear();
       }
       return;
    }
    public final g2 dh(){
       Object obj = PatchProxy.apply(null, this, ProfileBackgroundImagePreviewFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
    public void onActivityCreated(Bundle p0){
       ProfileBackgroundImagePreviewFragment$a uoa;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundImagePreviewFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       p0 = this.getArguments();
       Serializable serializable = null;
       if (p0 != null) {
          String str = "PROFILE_PREVIEW_IMAGE_URLS";
          if (p0.containsKey(str) == true) {
             p0 = this.getArguments();
             if (p0 != null) {
                serializable = SerializableHook.getSerializable(p0, str);
             }
             Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.yxcorp.gifshow.model.CDNUrl> /* = java.util.ArrayList<com.yxcorp.gifshow.model.CDNUrl> */");
             uoa = new ProfileBackgroundImagePreviewFragment$a();
             uoa.a(this);
             uoa.c = serializable;
             this.dh().b(uoa);
          }else {
          label_0041 :
             p0 = this.getArguments();
             if (p0 != null && p0.containsKey("PROFILE_PREVIEW_IMAGE_LOCAL_PATH") == true) {
                p0 = this.getArguments();
                if (p0 != null) {
                   serializable = p0.getString("PROFILE_PREVIEW_IMAGE_LOCAL_PATH", "");
                }
                uoa = new ProfileBackgroundImagePreviewFragment$a();
                uoa.a(this);
                uoa.d = serializable;
                this.dh().b(uoa);
             }
          }
       }else {
          goto label_0041 ;
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileBackgroundImagePreviewFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d11bf, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­esId\(\), container, false\)");
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.ch();
    }
}
