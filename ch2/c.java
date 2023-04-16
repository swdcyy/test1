package ch2.c;
import o63.c;
import com.kuaishou.live.core.show.redpacket.krn.LiveKrnRedPacketFragment;
import java.lang.Object;
import java.lang.Integer;
import zj0.x;
import androidx.lifecycle.Lifecycle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;

public class c implements c	// class@000534
{
    public final LiveKrnRedPacketFragment b;

    public void c(LiveKrnRedPacketFragment p0){
       this.b = p0;
       super();
    }
    public Integer I2(){
       return null;
    }
    public void L(){
    }
    public x ea(){
       return null;
    }
    public Lifecycle getLifecycle(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getLifecycle();
    }
    public void l0(boolean p0){
    }
    public void n0(){
    }
}
