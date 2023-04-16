package com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$c;
import rq5.a;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.voiceparty.theater.tube.widget.LiveVoicePartyTheaterPlayListPendantView;
import qrd.p;
import java.util.List;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;

public final class VoicePartyTheaterAudiencePanelController$c extends a	// class@0019ef
{
    public final VoicePartyTheaterAudiencePanelController h;

    public void VoicePartyTheaterAudiencePanelController$c(VoicePartyTheaterAudiencePanelController p0){
       this.h = p0;
       super();
    }
    public View H(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       VoicePartyTheaterAudiencePanelController$c obj = PatchProxy.apply(objArray, this, VoicePartyTheaterAudiencePanelController$c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.h;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, VoicePartyTheaterAudiencePanelController.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = obj.m.getValue();
       }
       return obj1;
    }
    public List c(){
       LivePendantRelation[] obj = PatchProxy.apply(null, this, VoicePartyTheaterAudiencePanelController$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LivePendantRelation[]{LivePendantRelation.ASK_QUESTION,LivePendantRelation.VOICE_PARTY_KTV_ORDER_MUSIC,LivePendantRelation.LOCAL_LIFE_HOT_BUBBLE};
       return CollectionsKt__CollectionsKt.L(obj);
    }
    public LivePendantPriority f(){
       return LivePendantPriority.VOICE_PARTY_THEATER_PLAY_LIST;
    }
    public LivePendantRelation h(){
       return LivePendantRelation.VOICE_PARTY_THEATER_PLAY_LIST;
    }
}
