package bu2.i;
import erd.g;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import java.lang.Object;
import njd.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class i implements g	// class@00045c
{
    public final VoicePartyOnlineUser b;
    public final g c;
    public final int d;

    public void i(VoicePartyOnlineUser p0,g p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       this.b.mStatus = -1;
       this.c.l0(this.d);
    }
}
