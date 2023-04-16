package eu2.e;
import com.kuaishou.live.core.voiceparty.pendant.VoicePartyTopicPendantView$b;
import eu2.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import eu2.c$d;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;
import co2.f2;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyChannelInfo;
import lo2.b;
import android.view.View;
import android.view.View$OnClickListener;

public final class e implements VoicePartyTopicPendantView$b	// class@0027f2
{
    public final c a;

    public void e(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "1")) {
          return;
       }
       e ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, c.class, "5")) {
          ta.R();
          if (c.n.a()) {
             LiveStreamMessages$VoicePartyCommonInfo channelInfo = ta.i.d().channelInfo;
             a.o(channelInfo, "voicePartyContext.commonInfo.channelInfo");
             ta.l.g(channelInfo);
          }
       }
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "2")) {
          return;
       }
       e ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, c.class, "6")) {
          ta.R();
          c f = ta.f;
          if (f != null) {
             f.onClick(ta.d);
          }else if(c.n.a()){
             LiveStreamMessages$VoicePartyCommonInfo channelInfo = ta.i.d().channelInfo;
             a.o(channelInfo, "voicePartyContext.commonInfo.channelInfo");
             ta.l.g(channelInfo);
          }
       }
       return;
    }
}
