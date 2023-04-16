package h71.r;
import java.lang.Runnable;
import com.kuaishou.live.bridge.commands.LiveJsCmdSwitchEffectRenderBannedBizBit;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class r implements Runnable	// class@002645
{
    public final LiveJsCmdSwitchEffectRenderBannedBizBit b;
    public final int c;

    public void r(LiveJsCmdSwitchEffectRenderBannedBizBit p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.b.n(this.c);
       return;
    }
}
