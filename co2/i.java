package co2.i;
import lf3.g;
import com.kuaishou.live.core.voiceparty.h;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCMicSeatsLeft;
import java.lang.String;
import yx2.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import z12.e;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler;
import lf3.f;

public final class i implements g	// class@000592
{
    public final h b;

    public void i(h p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       int i;
       i tb = this.b;
       tb.a.c("MicSeatsLeft");
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "11")) {
       }else if(tb.c == null){
          if (!TextUtils.n(String.valueOf(p0.leftUserId), QCurrentUser.me().getId())) {
             String[] stringArray = new String[0];
             e.c("VoicePartyCoreAudience", "ignore SCMicSeatsLeft not me", stringArray);
          }else if(p0.leftReason == 4){
             i = 8;
          }else {
             i = 3;
          }
          tb.m.c().h(i, h.o);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
