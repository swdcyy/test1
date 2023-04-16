package d5c.x;
import java.lang.Runnable;
import d5c.g0;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Object;

public final class x implements Runnable	// class@002119
{
    public final g0 b;
    public final UserProfile c;

    public void x(g0 p0,UserProfile p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       x tb = this.b;
       x tc = this.c;
       tb.u9(tc);
       tb.j9(tc);
       tb.R = false;
    }
}
