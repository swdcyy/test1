package cj0.d;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.krn.bridges.page.KrnPageViewBridge;

public final class d implements Runnable	// class@0004c8
{
    public final String b;

    public void d(String p0){
       this.b = p0;
    }
    public final void run(){
       KrnPageViewBridge.lambda$setCurrentPage$2(this.b);
    }
}
