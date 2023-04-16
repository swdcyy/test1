package com.kwai.live.gzone.accompanyplay.audience.t;
import u07.u;
import com.kwai.live.gzone.accompanyplay.audience.u;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o37.a;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySdkPlatformConfig;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameSdkConfig;
import g37.e;

public class t implements u	// class@000bb4
{
    public final u b;

    public void t(u p0){
       this.b = p0;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "1")) {
          return;
       }
       a uoa = this.b.t.t();
       if (uoa != null && uoa.mGameInfo.mAccompanySdkPlatformConfig != null) {
          e.c(this.b.getActivity(), uoa.mGameInfo.mAccompanySdkPlatformConfig.mSdkConfig);
       }
       return;
    }
}
