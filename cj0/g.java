package cj0.g;
import java.lang.Runnable;
import ik0.m;
import com.kuaishou.krn.title.TopBarParams;
import java.lang.Object;
import com.kuaishou.krn.bridges.page.KrnTopBarBridge;

public final class g implements Runnable	// class@0004cb
{
    public final m b;
    public final TopBarParams c;

    public void g(m p0,TopBarParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       KrnTopBarBridge.lambda$setTopBarStyle$1(this.b, this.c);
    }
}
