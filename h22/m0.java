package h22.m0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h22.n0;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import java.lang.Object;

public class m0 extends Accessor	// class@002c01
{
    public final LiveActivityRedPacketPresenter c;
    public final n0 d;

    public void m0(n0 p0,LiveActivityRedPacketPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c;
    }
}
