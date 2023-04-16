package com.kuaishou.live.core.voiceparty.userlevel.model.MicSeatUserLevelUpService$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.livestream.message.nano.LiveVoicePartyMicSeatUserLevelUpNotice;
import java.lang.Object;
import xx2.e;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import xx2.a;
import com.kwai.robust.PatchProxyResult;
import xx2.c;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import java.util.List;

public final class MicSeatUserLevelUpService$1$1 extends Lambda implements l	// class@001acc
{
    public final LiveVoicePartyMicSeatUserLevelUpNotice $it;

    public void MicSeatUserLevelUpService$1$1(LiveVoicePartyMicSeatUserLevelUpNotice p0){
       this.$it = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatUserLevelUpService$1$1.class, str)) {
          return;
       }
       a.p(p0, "$receiver");
       b.Z(LiveLogTag.LIVE_VOICE_PARTY, "MicSeatUserLevelUpService onLevelUpNotice");
       MicSeatUserLevelUpService$1$1 t$it = this.$it;
       a.o(t$it, "it");
       c uoc = PatchProxy.applyOneRefs(t$it, null, a.class, str);
       if (uoc != PatchProxyResult.class) {
       }else {
          a.p(t$it, "$this$toLevelUpNotice");
          LiveVoicePartyMicSeatUserLevelUpNotice material = t$it.material;
          a.o(material, "material");
          ArrayList uArrayList = new ArrayList(material.length);
          int len = material.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = material[i];
             uArrayList.add(new CDNUrl(oobject.cdn, oobject.url));
          }
          LiveVoicePartyMicSeatUserLevelUpNotice title = t$it.title;
          a.o(title, "title");
          material = t$it.toast;
          if (material == null) {
             str = "";
          }
          c uoc1 = new c(uArrayList, title, material, t$it.level, t$it.subLevel);
       }
       p0.a(uoc);
       return;
    }
}
