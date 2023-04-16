package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$e;
import android.view.TextureView$SurfaceTextureListener;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFragment;
import com.kwai.framework.model.feed.BaseFeed;
import w99.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.HashMap;
import u99.d;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;

public final class ProfileHeaderBackgroundLivePresenter$e implements TextureView$SurfaceTextureListener	// class@0014bd
{
    public final ProfileHeaderBackgroundLivePresenter b;

    public void ProfileHeaderBackgroundLivePresenter$e(ProfileHeaderBackgroundLivePresenter p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(ProfileHeaderBackgroundLivePresenter$e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ProfileHeaderBackgroundLivePresenter$e.class, "1")) {
          return;
       }
       a.p(p0, "surface");
       ProfileHeaderBackgroundLivePresenter$e tb = this.b;
       d.h("ProfileHeaderBackgroundLivePresenter", "onSurfaceTextureAvailable", d.b(tb.H, tb.J, ProfileHeaderBackgroundLivePresenter.P8(tb)));
       ProfileHeaderBackgroundLivePresenter j = this.b.J;
       if (j != null) {
          j.g0(true);
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileHeaderBackgroundLivePresenter$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "surface");
       ProfileHeaderBackgroundLivePresenter$e tb = this.b;
       d.h("ProfileHeaderBackgroundLivePresenter", "onSurfaceTextureDestroyed", d.b(tb.H, tb.J, ProfileHeaderBackgroundLivePresenter.P8(tb)));
       if (ProfileHeaderBackgroundLivePresenter.P8(this.b).isResumed()) {
          this.b.X8();
       }
       ProfileHeaderBackgroundLivePresenter j = this.b.J;
       if (j != null) {
          j.g0(false);
       }
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(ProfileHeaderBackgroundLivePresenter$e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ProfileHeaderBackgroundLivePresenter$e.class, "2")) {
          return;
       }
       a.p(p0, "surface");
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundLivePresenter$e.class, "4")) {
          return;
       }
       a.p(p0, "surface");
       return;
    }
}
