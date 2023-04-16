package com.yxcorp.gifshow.photoad.game.GameCenterDownloadProcessor$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;

public class GameCenterDownloadProcessor$1 implements DefaultLifecycleObserver	// class@000f8e
{
    public final GameCenterDownloadParams b;

    public void GameCenterDownloadProcessor$1(GameCenterDownloadParams p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GameCenterDownloadProcessor$1.class, "1")) {
          return;
       }
       d.a(-1986139969).clearDownloadListeners(this.b.mDownloadUrl);
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
