package com.yxcorp.gifshow.common_music_player.MusicListPlayerView$b;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qm9.d0;
import java.util.List;
import kob.r;

public final class MusicListPlayerView$b implements Application$ActivityLifecycleCallbacks	// class@001185
{
    public final MusicListPlayerView b;

    public void MusicListPlayerView$b(MusicListPlayerView p0){
       this.b = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicListPlayerView$b.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       return;
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicListPlayerView$b.class, "7")) {
          return;
       }
       a.p(p0, "activity");
       return;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicListPlayerView$b.class, "4")) {
          return;
       }
       a.p(p0, "activity");
       if (a.g(this.b.getCurrentActivity(), p0)) {
          MusicListPlayerView z = this.b.z;
          if (z != null && !PatchProxy.applyVoid(null, z, d0.class, "3")) {
             z.d();
             z.f = z.a.U0();
          }
       }
       return;
    }
    public void onActivityResumed(Activity p0){
       MusicListPlayerView$b tb;
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicListPlayerView$b.class, "3")) {
          return;
       }
       a.p(p0, "activity");
       int i = 1;
       if (a.g(this.b.getCurrentActivity(), p0) ^ i) {
          tb = this.b;
          tb.A = i;
          tb.b();
          tb = this.b;
          if (tb.N == 21) {
             r mMusicListPl = tb.getMMusicListPlayerController();
             if (mMusicListPl != null) {
                mMusicListPl.pause();
             }
          }
       }else {
          tb = this.b;
          if (tb.A != null) {
             tb.A = false;
             MusicListPlayerView z = tb.z;
             if (z != null) {
                z.f(i);
             }
          }
       }
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicListPlayerView$b.class, "6")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "outState");
       return;
    }
    public void onActivityStarted(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicListPlayerView$b.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       return;
    }
    public void onActivityStopped(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicListPlayerView$b.class, "5")) {
          return;
       }
       a.p(p0, "activity");
       return;
    }
}
