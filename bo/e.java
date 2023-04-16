package bo.e;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class e implements Runnable	// class@0002a3
{
    public final String[] b;

    public void e(String[] p0){
       this.b = p0;
    }
    public final void run(){
       Aegon.nativeSetKProxyPathBlacklist(this.b);
    }
}
