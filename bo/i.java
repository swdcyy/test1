package bo.i;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class i implements Runnable	// class@00031a
{
    public final String b;

    public void i(String p0){
       this.b = p0;
    }
    public final void run(){
       Aegon.nativeUpdateNqeConfig(this.b);
    }
}
