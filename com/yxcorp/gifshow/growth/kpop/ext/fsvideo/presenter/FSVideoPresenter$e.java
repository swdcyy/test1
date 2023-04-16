package com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter$e;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cra.w;
import java.lang.StringBuilder;
import android.view.Surface;
import com.kwai.framework.player.core.b;
import q87.c;

public final class FSVideoPresenter$e implements IMediaPlayer$OnPreparedListener	// class@001403
{
    public final FSVideoPresenter b;

    public void FSVideoPresenter$e(FSVideoPresenter p0){
       this.b = p0;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       FSVideoPresenter w;
       if (PatchProxy.applyVoidOneRefs(p0, this, FSVideoPresenter$e.class, "1")) {
          return;
       }
       w ow = w.C();
       StringBuilder str = "onPrepared hasSurface: ";
       w = this.b.w;
       Surface surface = null;
       Surface surface1 = (w != null)? w.getSurface(): surface;
       boolean b = (surface1 != null)? true: false;
       Object[] objArray = new Object[0];
       ow.w("FSVideoPresenter", str+b, objArray);
       FSVideoPresenter w1 = this.b.w;
       if (w1 != null) {
          surface = w1.getSurface();
       }
       if (surface != null) {
          FSVideoPresenter$e tb = this.b;
          tb.x = false;
          w1 = tb.w;
          if (w1 != null) {
             w1.start();
          }
       }else {
          w1.x = true;
       }
       return;
    }
}
