package cj0.f;
import java.lang.Runnable;
import ik0.m;
import com.kuaishou.krn.title.ButtonParams;
import java.lang.Object;
import com.kuaishou.krn.bridges.page.KrnTopBarBridge;

public final class f implements Runnable	// class@0004ca
{
    public final m b;
    public final ButtonParams c;

    public void f(m p0,ButtonParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       KrnTopBarBridge.lambda$setTopBarButton$2(this.b, this.c);
    }
}
