package com.kuaishou.live.lite.adapter.component.voiceparty.LiveLiteVoicePartyPresenter$a;
import mq5.h;
import com.kuaishou.live.lite.adapter.component.voiceparty.LiveLiteVoicePartyPresenter;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qrd.l1;
import io.reactivex.subjects.PublishSubject;

public final class LiveLiteVoicePartyPresenter$a implements h	// class@001e26
{
    public final LiveLiteVoicePartyPresenter b;

    public void LiveLiteVoicePartyPresenter$a(LiveLiteVoicePartyPresenter p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, LiveLiteVoicePartyPresenter$a.class, "1")) {
          return;
       }
       this.b.M.onNext(l1.a);
       return;
    }
}
