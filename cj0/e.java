package cj0.e;
import java.lang.Runnable;
import ik0.m;
import com.kuaishou.krn.title.ButtonParams;
import java.lang.Object;
import com.kuaishou.krn.bridges.page.KrnTopBarBridge;

public final class e implements Runnable	// class@0004c9
{
    public final m b;
    public final ButtonParams c;

    public void e(m p0,ButtonParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       KrnTopBarBridge.lambda$setTitle$0(this.b, this.c);
    }
}
