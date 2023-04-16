package com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$d;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$d$a;
import java.lang.Runnable;
import ekd.k1;

public final class AdAutoPlayPresenter$d implements IMediaPlayer$OnInfoListener	// class@00158e
{
    public final AdAutoPlayPresenter b;

    public void AdAutoPlayPresenter$d(AdAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(AdAutoPlayPresenter$d.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AdAutoPlayPresenter$d.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (!this.b.S8()) {
          return false;
       }else {
          k1.r(new AdAutoPlayPresenter$d$a(this, p1), 0);
          return false;
       }
    }
}
