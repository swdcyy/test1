package h92.l;
import lf3.g;
import h92.s;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveGiftOutsideMessages$LiveGiftOutsideConfig;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.model.LiveGiftOutsideConfigResponse;
import lf3.f;

public final class l implements g	// class@002d18
{
    public final s b;

    public void l(s p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       LiveGiftOutsideConfigResponse liveGiftOuts = PatchProxy.applyOneRefs(p0, tb, s.class, "15");
       if (liveGiftOuts != PatchProxyResult.class) {
       }else if(p0 == null){
          liveGiftOuts = null;
       }else {
          liveGiftOuts = new LiveGiftOutsideConfigResponse();
          liveGiftOuts.mShowContent = p0.showContent;
          liveGiftOuts.mGiftIdArray = p0.giftId;
       }
       tb.d9(liveGiftOuts);
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
