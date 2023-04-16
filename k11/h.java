package k11.h;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.c;
import java.lang.Object;
import k11.a;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController;

public final class h implements Runnable	// class@002c63
{
    public final c b;
    public final int c;

    public void h(c p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.b.c(3, this.c);
    }
}
