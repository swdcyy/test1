package dh2.i;
import java.lang.Runnable;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketPendantContainerView;
import java.util.List;
import java.lang.Object;

public final class i implements Runnable	// class@00252d
{
    public final LiveRedPacketPendantContainerView b;
    public final List c;

    public void i(LiveRedPacketPendantContainerView p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.f(this.c);
    }
}
