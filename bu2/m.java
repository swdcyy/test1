package bu2.m;
import z1.a;
import y8c.g;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import java.lang.Object;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class m implements a	// class@000464
{
    public final g a;
    public final VoicePartyOnlineUser b;

    public void m(g p0,VoicePartyOnlineUser p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       m ta = this.a;
       m tb = this.b;
       if (ta != null) {
          tb.mStatus = (p0 != null && p0.booleanValue())? 2: 1;
          ta.k0();
       }
       return;
    }
}
