package com.kwai.live.gzone.accompanyplay.audience.y;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.audience.z$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.audience.z;
import o37.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameDownloadConfig;
import java.util.Objects;
import android.net.Uri;
import k37.p1;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import s67.h1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f37.o0;

public class y implements View$OnClickListener	// class@000bc8
{
    public final z$a b;

    public void y(z$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
          return;
       }
       z$a b = this.b.b;
       z t = b.t;
       if (t != null) {
          LiveGzoneAccompanyGameInfo mGameDownloa = t.mGameInfo.mGameDownloadConfig;
          if (mGameDownloa != null) {
             LiveGzoneAccompanyGameDownloadConfig mGameCenterU = mGameDownloa.mGameCenterUrl;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidOneRefs(mGameCenterU, b, z.class, "6")) {
                Uri uri = Uri.parse(mGameCenterU);
                if (uri.isHierarchical()) {
                   String queryParamet = uri.getQueryParameter("game_id");
                   if (queryParamet == null || !b.p.w().f.F7(queryParamet)) {
                      o0.m(b.getActivity(), mGameCenterU);
                   }
                }
             }
          }
       }
       return;
    }
}
