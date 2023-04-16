package com.kwai.live.gzone.accompanyplay.anchor.j0$c;
import u07.u;
import com.kwai.live.gzone.accompanyplay.anchor.j0;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySdkPlatformConfig;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameSdkConfig;
import g37.e;

public class j0$c implements u	// class@000b18
{
    public final j0 b;

    public void j0$c(j0 p0){
       this.b = p0;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j0$c.class, "1")) {
          return;
       }
       j0$c tb = this.b;
       j0 r = tb.r;
       if (r != null && r.mAccompanySdkPlatformConfig != null) {
          e.c(tb.getActivity(), this.b.r.mAccompanySdkPlatformConfig.mSdkConfig);
       }
       return;
    }
}
