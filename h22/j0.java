package h22.j0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h22.n0;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import java.lang.Object;
import h22.b;

public class j0 extends Accessor	// class@002bfb
{
    public final LiveActivityRedPacketPresenter c;
    public final n0 d;

    public void j0(n0 p0,LiveActivityRedPacketPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.F;
    }
    public void set(Object p0){
       this.c.F = p0;
    }
}
