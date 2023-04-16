package com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$j;
import java.lang.Runnable;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionState;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveAdAudienceBellCardPresenter$j implements Runnable	// class@0009f6
{
    public final LiveAdAudienceBellCardPresenter b;
    public final LiveAdSocialMessages$LiveAdSocialConversionState c;

    public void LiveAdAudienceBellCardPresenter$j(LiveAdAudienceBellCardPresenter p0,LiveAdSocialMessages$LiveAdSocialConversionState p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, LiveAdAudienceBellCardPresenter$j.class, "1")) {
          return;
       }
       this.b.V8(true);
       PatchProxy.onMethodExit(LiveAdAudienceBellCardPresenter$j.class, "1");
       return;
    }
}
