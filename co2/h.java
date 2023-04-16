package co2.h;
import lf3.g;
import com.kuaishou.live.core.voiceparty.h;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.socket.nano.SocketMessages$SCVoicePartyAboardApplyResult;
import java.lang.String;
import yx2.g;
import lf3.f;

public final class h implements g	// class@00058f
{
    public final h b;

    public void h(h p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       h tb = this.b;
       tb.a.c("VoicePartyAboardApplyResult");
       tb.l.H4(p0);
    }
    public boolean V(){
       return f.a(this);
    }
}
