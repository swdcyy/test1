package com.yxcorp.gifshow.activity.web.presenter.WebFullScreenVideoPresenter$2;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.activity.web.presenter.WebFullScreenVideoPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.player.core.b;

public class WebFullScreenVideoPresenter$2 implements LifecycleObserver	// class@0014c1
{
    public final WebFullScreenVideoPresenter b;

    public void WebFullScreenVideoPresenter$2(WebFullScreenVideoPresenter p0){
       this.b = p0;
       super();
    }
    public final void onPause(){
       if (PatchProxy.applyVoid(null, this, WebFullScreenVideoPresenter$2.class, "2")) {
          return;
       }
       WebFullScreenVideoPresenter x = this.b.x;
       if (x != null && x.isPlaying()) {
          this.b.x.pause();
       }
       return;
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, WebFullScreenVideoPresenter$2.class, "1")) {
          return;
       }
       WebFullScreenVideoPresenter x = this.b.x;
       if (x != null) {
          x.start();
       }
       return;
    }
}
