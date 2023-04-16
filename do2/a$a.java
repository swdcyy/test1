package do2.a$a;
import lf3.g;
import do2.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCKtvApplauded;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qu2.a;
import hp2.e;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import jp2.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import lf3.f;

public final class a$a implements g	// class@002560
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          a$a tb = this.b;
          a.o(p0, "msg");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, a.class, "3")) {
             b.P(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyApplauseAudienceController"), " ’µΩπƒ’∆–≈¡Ó£¨πƒ’∆ID£∫"+p0.applauseId);
             if (TextUtils.x(p0.applauseId) || (a.g(p0.applauseId, tb.a) || ((a.g(p0.liveStreamId, tb.k.getLiveStreamId()) ^ 0x01) || (!(a.g(p0.voicePartyId, tb.l.f().g0()) ^ 0x01) && !(a.g(p0.ktvId, tb.m.e().d()) ^ 0x01))))) {
                tb.a = p0.applauseId;
                tb.a();
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
