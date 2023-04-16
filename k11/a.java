package k11.a;
import android.view.View;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController;
import java.lang.Object;

public abstract class a	// class@002c5c
{
    public final View a;
    public final HighFluencyLikeViewStateController b;
    public final long c;

    public void a(View p0,HighFluencyLikeViewStateController p1,long p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.c(p0);
    }
    public abstract void a();
    public abstract void b();
    public abstract void c(View p0);
    public abstract int d();
    public abstract void e(int p0);
}
