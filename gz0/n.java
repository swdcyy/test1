package gz0.n;
import lf3.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.j;
import com.kuaishou.livestream.message.nano.SendGiftNotifyAnimation;
import gz0.a;
import t02.a0;
import p91.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lf3.f;

public final class n implements g	// class@0025d0
{
    public final LiveAudienceBottomBarGiftAnimationManger b;

    public void n(LiveAudienceBottomBarGiftAnimationManger p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LiveAudienceBottomBarGiftAnimationManger.class, "3")) {
       }else {
          SendGiftNotifyAnimation sendGiftNoti = j.f(p0.sendGiftNotifyAnimation, 0);
          if (sendGiftNoti != null && (TextUtils.n(sendGiftNoti.liveStreamId, tb.d.Z2.getLiveStreamId()) && tb.o == null)) {
             tb.g();
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
