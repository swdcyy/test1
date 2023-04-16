package co2.f;
import lf3.g;
import com.kuaishou.live.core.voiceparty.h;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.socket.nano.SocketMessages$SCVoicePartyAboardApplyResult;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import z12.e;
import lf3.f;

public final class f implements g	// class@000587
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.allow != null && !TextUtils.x(p0.aryaConfig)) {
          tb.a(p0.aryaConfig);
          String[] stringArray = new String[0];
          e.c("VoicePartyCoreAudience", "SCVoicePartyAboardApplyResult parse IM message success", stringArray);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
