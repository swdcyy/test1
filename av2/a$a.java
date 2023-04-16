package av2.a$a;
import ok.h;
import av2.a;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.emoji.play.VoicePartyEmojiPlayInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Void;
import com.kuaishou.live.core.voiceparty.emoji.play.VoicePartyEmojiPlayInfo$PlayStatus;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import co2.f2;
import co2.q1;
import qrd.l1;

public final class a$a implements h	// class@0002cd
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = null;
          VoicePartyEmojiPlayInfo mPlayStatus = (p0 != null)? p0.mPlayStatus: obj;
          if (mPlayStatus == VoicePartyEmojiPlayInfo$PlayStatus.Finished) {
             a$a tb = this.b;
             _monitor_enter(tb);
             q1.d(p0.getEmojiId(), this.b.g.a(), this.b.f);
             p0 = this.b;
             p0.a = false;
             p0.a();
             _monitor_exit(tb);
          }
       }
       return obj;
    }
}
