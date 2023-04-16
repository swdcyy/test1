package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import c2c.f;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;

public final class ProfilePreviewVideoStatusPresenter$b extends m	// class@00126a
{
    public final ProfilePreviewVideoStatusPresenter c;

    public void ProfilePreviewVideoStatusPresenter$b(ProfilePreviewVideoStatusPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewVideoStatusPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "v");
       ProfilePreviewVideoStatusPresenter$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, ProfilePreviewVideoStatusPresenter.class, "10")) {
          IWaynePlayer iWaynePlayer = tc.V8();
          if (iWaynePlayer != null && iWaynePlayer.isPlaying() == true) {
             iWaynePlayer = tc.V8();
             if (iWaynePlayer != null) {
                iWaynePlayer.pause();
             }
             ProfilePreviewVideoStatusPresenter b = tc.B;
             if (b == null) {
                a.S("mProgressVideoPlayBtn");
             }
             b.setSelected(false);
             b = tc.x;
             if (b == null) {
                a.S("mPlayBtn");
             }
             b.setVisibility(false);
          }else {
             tc.h9();
          }
          tc.j9();
       }
       return;
    }
}
