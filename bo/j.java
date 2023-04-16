package bo.j;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class j implements Runnable	// class@0002a6
{
    public final String b;
    public final int c;
    public final int d;

    public void j(String p0,int p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       Aegon.nativeSetKProxyConfig(this.b, this.c, this.d);
    }
}
