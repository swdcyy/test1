package fe2.h;
import java.lang.Runnable;
import com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView$a;
import java.lang.Object;
import com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView;

public final class h implements Runnable	// class@00293e
{
    public final LivePkPeerInfoView$a b;

    public void h(LivePkPeerInfoView$a p0){
       this.b = p0;
    }
    public final void run(){
       this.b.a.b();
    }
}
