package h22.l0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h22.n0;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import java.lang.Object;
import java.util.List;

public class l0 extends Accessor	// class@002bff
{
    public final LiveActivityRedPacketPresenter c;
    public final n0 d;

    public void l0(n0 p0,LiveActivityRedPacketPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.C;
    }
    public void set(Object p0){
       this.c.C = p0;
    }
}
