package m75.a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import n75.c;
import com.kwai.chat.kwailink.log.a;
import m75.h;

public final class a implements Runnable	// class@001e45
{
    public final int b;

    public void a(int p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       a.e("AliveMonitor", "syncRuntimeState, runtimeState="+c.a(tb));
       h.f = tb;
    }
}
