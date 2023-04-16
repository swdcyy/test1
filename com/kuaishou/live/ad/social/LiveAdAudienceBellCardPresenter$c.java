package com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$c;
import java.lang.Runnable;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionState;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveAdAudienceBellCardPresenter$c implements Runnable	// class@0009ef
{
    public final LiveAdAudienceBellCardPresenter b;
    public final LiveAdSocialMessages$LiveAdSocialConversionState c;
    public final LiveExtraMessages$LiveCommonAbstractSignal d;

    public void LiveAdAudienceBellCardPresenter$c(LiveAdAudienceBellCardPresenter p0,LiveAdSocialMessages$LiveAdSocialConversionState p1,LiveExtraMessages$LiveCommonAbstractSignal p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveAdAudienceBellCardPresenter$c.class, "1")) {
          return;
       }
       this.b.W8(this.c, this.d);
       return;
    }
}
