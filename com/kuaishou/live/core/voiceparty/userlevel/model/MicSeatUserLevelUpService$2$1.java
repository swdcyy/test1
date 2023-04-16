package com.kuaishou.live.core.voiceparty.userlevel.model.MicSeatUserLevelUpService$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.lang.Object;
import xx2.e;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import com.kuaishou.livestream.message.nano.LiveVoicePartyMicSeatUserLevelUpEffects;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Map;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.util.Set;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class MicSeatUserLevelUpService$2$1 extends Lambda implements l	// class@001acd
{
    public final SCActionSignal $it;

    public void MicSeatUserLevelUpService$2$1(SCActionSignal p0){
       this.$it = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       ArrayList uArrayList;
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatUserLevelUpService$2$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       SCActionSignal liveVoicePar = this.$it.liveVoicePartyMicSeatUserLevelUpEffect;
       if (liveVoicePar != null) {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          int len = liveVoicePar.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = liveVoicePar[i];
             String str = String.valueOf(oobject.userId);
             LiveVoicePartyMicSeatUserLevelUpEffects material = oobject.material;
             if (material != null) {
                uArrayList = new ArrayList(material.length);
                int len1 = material.length;
                for (int i1 = 0; i1 < len1; i1 = i1 + 1) {
                   object oobject1 = material[i1];
                   uArrayList.add(new CDNUrl(oobject1.cdn, oobject1.url));
                }
             }else {
                uArrayList = CollectionsKt__CollectionsKt.E();
             }
             linkedHashMa.put(str, uArrayList);
          }
          if (linkedHashMa.isEmpty() ^ 0x01) {
             b.Z(LiveLogTag.LIVE_VOICE_PARTY, "MicSeatUserLevelUpService onLevelUpEffect "+linkedHashMa.keySet());
             p0.b(linkedHashMa);
          }
       }
       return;
    }
}
