package com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$g;
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
import yx.j0;

public final class BrokenFramePresenter$g implements IMediaPlayer$OnInfoListener	// class@0015d5
{
    public final BrokenFramePresenter b;

    public void BrokenFramePresenter$g(BrokenFramePresenter p0){
       this.b = p0;
       super();
    }
    public boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(BrokenFramePresenter$g.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, BrokenFramePresenter$g.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 0x2775) {
          Object[] objArray = new Object[0];
          j0.f("BrokenFramePresenter", "MEDIA_INFO_PLAY_TO_END", objArray);
          this.b.R8(true);
       }
       return 0;
    }
}
