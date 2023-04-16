package com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoCropFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.profile.fragment.BaseImmersiveFragment;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoCropFragment$mPresenterManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter;
import c2c.b;
import java.util.HashMap;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.Objects;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.framework.model.feed.BaseFeed;
import a2c.y;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import kotlin.jvm.internal.a;
import qrd.l1;
import lnc.g2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Number;
import z5c.k0;
import i2b.a;

public final class ProfileBackgroundVideoCropFragment extends BaseImmersiveFragment implements g2$a	// class@00123a
{
    public final p l;
    public HashMap m;

    public void ProfileBackgroundVideoCropFragment(){
       super();
       this.l = s.c(new ProfileBackgroundVideoCropFragment$mPresenterManager$2(this));
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ProfileBackgroundVideoCropFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new ProfileCropVideoSizePresenter());
       obj.U7(new b());
       PatchProxy.onMethodExit(ProfileBackgroundVideoCropFragment.class, "6");
       return obj;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, ProfileBackgroundVideoCropFragment.class, "8")) {
          return;
       }
       ProfileBackgroundVideoCropFragment tm = this.m;
       if (tm != null) {
          tm.clear();
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundVideoCropFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       p0 = this.getArguments();
       Serializable serializable = (p0 != null)? SerializableHook.getSerializable(p0, "PROFILE_PREVIEW_VIDEO_INFO"): null;
       Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.yxcorp.gifshow.models.QMedia");
       Bundle arguments = this.getArguments();
       Serializable serializable1 = (arguments != null)? SerializableHook.getSerializable(arguments, "PROFILE_PREVIEW_PHOTO_FEED"): null;
       y oy = new y();
       oy.b(this);
       ProfileBgVideoInfo profileBgVid = PatchProxy.applyOneRefs(serializable, this, ProfileBackgroundVideoCropFragment.class, "4");
       if (profileBgVid != PatchProxyResult.class) {
       }else {
          profileBgVid = new ProfileBgVideoInfo();
          QMedia path = serializable.path;
          a.o(path, "media.path");
          profileBgVid.setPath(path);
          profileBgVid.setClipStart(serializable.mClipStart);
          profileBgVid.setClipDuration(serializable.mClipDuration);
          profileBgVid.setDuration(serializable.duration);
          boolean b = true;
          profileBgVid.setLocalVideo(b);
          profileBgVid.setEnableAbLoop(b);
       }
       profileBgVid.setFeed(serializable1);
       oy.a(profileBgVid);
       g2 og2 = PatchProxy.apply(null, this, ProfileBackgroundVideoCropFragment.class, "1");
       if (og2 == PatchProxyResult.class) {
          og2 = this.l.getValue();
       }
       og2.b(oy);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileBackgroundVideoCropFragment.class, "2");
       if (p2 != patchProxyRe) {
          return p2;
       }
       a.p(p0, "inflater");
       p2 = PatchProxy.apply(null, this, ProfileBackgroundVideoCropFragment.class, "5");
       if (p2 != patchProxyRe) {
          i = p2.intValue();
       }else if(k0.s()){
          i = 0x7f0d11c6;
       }else {
          i = 0x7f0d11c5;
       }
       View view = a.g(p0, i, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­esId\(\), container, false\)");
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.ch();
    }
}
