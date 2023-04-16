package k11.c;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.a;
import java.lang.Object;
import k11.a;
import i11.h;

public final class c implements Runnable	// class@002c5e
{
    public final a b;

    public void c(a p0){
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
