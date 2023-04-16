package bu2.b;
import z1.a;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import bw2.b;

public final class b implements a	// class@000455
{
    public final VoicePartyOnlineUser a;
    public final g b;
    public final int c;
    public final VoicePartyOnlineUser d;
    public final int e;

    public void b(VoicePartyOnlineUser p0,g p1,int p2,VoicePartyOnlineUser p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final void accept(Object p0){
       p0.mStatus = 2;
       this.b.l0(this.c);
       b.d(this.d, this.e);
    }
}
