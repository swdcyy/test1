package gs2.i$a;
import lf3.g;
import gs2.i;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCKtvRecommendToSing;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import java.util.Objects;
import hp2.e;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import da1.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.comments.model.LiveKtvOrderGuideMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import n81.a;
import lf3.f;

public final class i$a implements g	// class@002b98
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
       }else {
          LiveVoicePartyLogTag kTV = LiveVoicePartyLogTag.KTV;
          String str = "VoicePartyKtvAudienceOrderGuideController";
          kTV.appendTag(str);
          b.P(kTV, "onReceive ktv recommend Msg");
          i$a tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, i.class, "5")) {
             kTV.appendTag(str);
             b.P(kTV, "onReceiveKtvRecommendMsg");
             if (a.g(p0.voicePartyId, tb.l.f().g0()) ^ 0x01) {
                kTV.appendTag(str);
                b.P(kTV, "onReceiveKtvRecommendMsg voice party id not match");
             }else {
                b.S(kTV.appendTag(str), "onReceiveKtvRecommendMsg ", "feedContent", p0.feedContent);
                i o = tb.o;
                LiveKtvOrderGuideMessage liveKtvOrder = PatchProxy.applyOneRefs(p0, null, c.class, "11");
                if (liveKtvOrder != PatchProxyResult.class) {
                }else {
                   liveKtvOrder = new LiveKtvOrderGuideMessage();
                   liveKtvOrder.mRecommendToSingMsg = p0;
                }
                o.R0(liveKtvOrder);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
