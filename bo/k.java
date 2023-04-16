package bo.k;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class k implements Runnable	// class@00031c
{
    public final String b;
    public final String c;

    public void k(String p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       Aegon.nativeUpdateConfig(this.b, this.c);
    }
}
