package com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$f;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import yx.j0;
import im8.f;
import android.view.TextureView;

public final class BrokenFramePresenter$f implements IMediaPlayer$OnInfoListener	// class@0015d4
{
    public final BrokenFramePresenter b;

    public void BrokenFramePresenter$f(BrokenFramePresenter p0){
       this.b = p0;
       super();
    }
    public boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(BrokenFramePresenter$f.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, BrokenFramePresenter$f.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       j0.f("BrokenFramePresenter", "magic player onInfo what:"+p1, objArray);
       if (p1 == 0x2775) {
          BrokenFramePresenter t = this.b.t;
          if (t != null) {
             TextureView textureView = t.get();
             if (textureView != null) {
                textureView.setVisibility(8);
             }
          }
       }
       return 0;
    }
}
