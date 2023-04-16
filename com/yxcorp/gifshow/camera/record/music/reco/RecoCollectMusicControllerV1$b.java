package com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class RecoCollectMusicControllerV1$b extends AnimatorListenerAdapter	// class@000e96
{
    public final RecoCollectMusicControllerV1 a;

    public void RecoCollectMusicControllerV1$b(RecoCollectMusicControllerV1 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RecoCollectMusicControllerV1$b.class, "1")) {
          return;
       }
       this.a.u2();
       PatchProxy.onMethodExit(RecoCollectMusicControllerV1$b.class, "1");
       return;
    }
}
