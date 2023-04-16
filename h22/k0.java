package h22.k0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h22.n0;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import java.lang.Object;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;

public class k0 extends Accessor	// class@002bfd
{
    public final LiveActivityRedPacketPresenter c;
    public final n0 d;

    public void k0(n0 p0,LiveActivityRedPacketPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.D;
    }
    public void set(Object p0){
       this.c.D = p0;
    }
}
