package com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoPreviewFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.profile.fragment.BaseImmersiveFragment;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoPreviewFragment$mPresenterManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter;
import c2c.g;
import c2c.h;
import c2c.d;
import java.util.HashMap;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.Objects;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import a2c.y;
import lnc.g2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import kotlin.jvm.internal.a;
import i2b.a;

public final class ProfileBackgroundVideoPreviewFragment extends BaseImmersiveFragment implements g2$a	// class@00123c
{
    public final p l;
    public HashMap m;

    public void ProfileBackgroundVideoPreviewFragment(){
       super();
       this.l = s.c(new ProfileBackgroundVideoPreviewFragment$mPresenterManager$2(this));
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ProfileBackgroundVideoPreviewFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new ProfilePreviewVideoStatusPresenter());
       obj.U7(new g());
       obj.U7(new h());
       obj.U7(new d());
       PatchProxy.onMethodExit(ProfileBackgroundVideoPreviewFragment.class, "4");
       return obj;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, ProfileBackgroundVideoPreviewFragment.class, "6")) {
          return;
       }
       ProfileBackgroundVideoPreviewFragment tm = this.m;
       if (tm != null) {
          tm.clear();
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundVideoPreviewFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       p0 = this.getArguments();
       Object[] objArray = null;
       Serializable serializable = (p0 != null)? SerializableHook.getSerializable(p0, "PROFILE_PREVIEW_VIDEO_INFO"): objArray;
       Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo");
       y oy = new y();
       oy.b(this);
       oy.a(serializable);
       g2 og2 = PatchProxy.apply(objArray, this, ProfileBackgroundVideoPreviewFragment.class, "1");
       if (og2 == PatchProxyResult.class) {
          og2 = this.l.getValue();
       }
       og2.b(oy);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileBackgroundVideoPreviewFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d11c7, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­esId\(\), container, false\)");
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.ch();
    }
}
