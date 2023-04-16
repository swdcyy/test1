package k11.d;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.a;
import java.lang.Object;
import k11.a;
import i11.h;

public final class d implements Runnable	// class@002c5f
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void run(){
       a a = this.b.a;
       if (a instanceof h) {
          a.dismiss();
       }
       return;
    }
}
