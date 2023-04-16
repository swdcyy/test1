package co2.p;
import erd.g;
import com.kuaishou.live.core.voiceparty.h;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.util.Map;
import ekd.q;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import com.kuaishou.live.core.voiceparty.h$a;
import co2.r;

public final class p implements g	// class@0005a6
{
    public final h b;

    public void p(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "10")) {
       }else if(p0.aboardType != null){
          LiveVoicePartyCommonConfig liveVoicePar = a.M(LiveVoicePartyCommonConfig.class);
          if (liveVoicePar != null && (tb.n != p0.aboardType && !q.h(liveVoicePar.mAboardMicTypeSwitchToastMap))) {
             LiveStreamMessages$VoicePartyCommonInfo aboardType = p0.aboardType;
             tb.n = aboardType;
             String str = liveVoicePar.mAboardMicTypeSwitchToastMap.get(Integer.valueOf(aboardType));
             if (!TextUtils.x(str)) {
                i.d(R.style.arg_RES_7f11066a, str);
             }
             h j = tb.j;
             LiveStreamMessages$VoicePartyCommonInfo aboardType1 = p0.aboardType;
             if (j.a != aboardType1 || j.b != p0.isFansFreeAboard) {
                j.a = aboardType1;
                j.b = p0.isFansFreeAboard;
                j = 1;
             }else {
                j = 0;
             }
             if (j) {
                tb.e.b0(aboardType1, p0.isFansFreeAboard);
             }
          }
       }
       return;
    }
}
