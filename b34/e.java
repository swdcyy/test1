package b34.e;
import java.lang.Runnable;
import b34.f;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo$LiveAnchorTool;

public final class e implements Runnable	// class@00030e
{
    public final f b;
    public final SlipSwitchButton c;
    public final boolean d;

    public void e(f p0,SlipSwitchButton p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       e tb = this.b;
       e td = this.d;
       Objects.requireNonNull(tb);
       this.c.setSwitch(td);
       tb.q.mSwitchOpen = td;
    }
}
