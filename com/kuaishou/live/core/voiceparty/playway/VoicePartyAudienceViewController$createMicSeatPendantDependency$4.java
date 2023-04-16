package com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$createMicSeatPendantDependency$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import hu2.j;
import hu2.i;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;
import java.util.List;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.util.Objects;
import kotlin.jvm.internal.a;
import qs2.d;

public final class VoicePartyAudienceViewController$createMicSeatPendantDependency$4 extends Lambda implements l	// class@00183d
{
    public final boolean $isOpponent;
    public final VoicePartyAudienceViewController this$0;

    public void VoicePartyAudienceViewController$createMicSeatPendantDependency$4(VoicePartyAudienceViewController p0,boolean p1){
       this.this$0 = p0;
       this.$isOpponent = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       Object obj;
       VoicePartyAudienceViewController b;
       VoicePartyAudienceViewController$b uob = VoicePartyAudienceViewController$b.class;
       String str = "1";
       if (PatchProxy.isSupport(VoicePartyAudienceViewController$createMicSeatPendantDependency$4.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyAudienceViewController$createMicSeatPendantDependency$4.class, str)) {
          return;
       }
       List list = (this.$isOpponent != null)? this.this$0.H.d().c().l(): this.this$0.H.d().c().k();
       Iterator iterator = list.iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             Object obj1 = (obj.mId == p0)? 1: null;
             if (!obj1) {
                continue ;
             }
          }else {
             obj = null;
          }
          if (obj != null) {
             if (this.$isOpponent != null) {
                b = this.this$0.B;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidOneRefs(obj, b, uob, "2")) {
                   a.p(obj, "data");
                   b = b.b.o;
                   if (b != null) {
                      b.i(obj);
                      break ;
                   }
                }
             }else {
                b = this.this$0.B;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidOneRefs(obj, b, uob, str)) {
                   a.p(obj, "data");
                   b = b.b.o;
                   if (b != null) {
                      b.B(obj);
                      break ;
                   }
                }
             }
          }
          break ;
       }
       return;
    }
}
