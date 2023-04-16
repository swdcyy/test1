package fs2.n$a;
import rq5.a;
import fs2.n;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.voiceparty.ktv.LiveVoicePartyKtvOrderMusicPendantView;
import android.content.Context;
import fs2.m;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import java.util.List;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;

public final class n$a extends a	// class@0029b4
{
    public final n h;

    public void n$a(n p0){
       this.h = p0;
       super();
    }
    public View H(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n$a obj = PatchProxy.apply(null, this, n$a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.h;
       n m = obj.m;
       Objects.requireNonNull(obj);
       LiveVoicePartyKtvOrderMusicPendantView liveVoicePar = PatchProxy.applyOneRefs(m, obj, n.class, "4");
       if (liveVoicePar != patchProxyRe) {
       }else {
          liveVoicePar = new LiveVoicePartyKtvOrderMusicPendantView(m);
          liveVoicePar.setOnClickListener(new m(obj));
       }
       return liveVoicePar;
    }
    public List c(){
       LivePendantRelation[] obj = PatchProxy.apply(null, this, n$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LivePendantRelation[]{LivePendantRelation.ASK_QUESTION,LivePendantRelation.VOICE_PARTY_THEATER_PLAY_LIST};
       return CollectionsKt__CollectionsKt.L(obj);
    }
    public LivePendantPriority f(){
       return LivePendantPriority.VOICE_PARTY_KTV_ORDER_MUSIC;
    }
    public LivePendantRelation h(){
       return LivePendantRelation.VOICE_PARTY_KTV_ORDER_MUSIC;
    }
}
