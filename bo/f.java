package bo.f;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class f implements Runnable	// class@0002a4
{
    public final String[] b;

    public void f(String[] p0){
       this.b = p0;
    }
    public final void run(){
       Aegon.nativeSetQuicFallbackToTcpBlacklist(this.b);
    }
}
