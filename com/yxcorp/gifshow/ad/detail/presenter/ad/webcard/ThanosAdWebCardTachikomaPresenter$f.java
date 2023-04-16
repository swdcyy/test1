package com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$f;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;

public final class ThanosAdWebCardTachikomaPresenter$f implements IMediaPlayer$OnInfoListener	// class@00161f
{
    public final ThanosAdWebCardTachikomaPresenter b;

    public void ThanosAdWebCardTachikomaPresenter$f(ThanosAdWebCardTachikomaPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(ThanosAdWebCardTachikomaPresenter$f.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ThanosAdWebCardTachikomaPresenter$f.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 0x2775) {
          ThanosAdWebCardTachikomaPresenter$f tb = this.b;
          ThanosAdWebCardTachikomaPresenter j = tb.J;
          if (j != null && !tb.a9()) {
             tb = this.b;
             if (tb.I == null && (j.mCardDelayReplay != null && (tb.p != null && tb.h9(j)))) {
                tb = this.b;
                tb.I = true;
                tb.j9(j.mTemplateDelayTime);
             }
          }
       }
    label_0054 :
       return false;
    }
}
