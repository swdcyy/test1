package l31.e;
import java.lang.Runnable;
import l31.f;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.common.core.component.topbar.topuser.i;

public final class e implements Runnable	// class@002e70
{
    public final f b;
    public final String c;

    public void e(f p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       tb.o9(tc);
       tb.n9(tc);
    }
}
