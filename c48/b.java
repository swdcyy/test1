package c48.b;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.mini.d;

public final class b implements Runnable	// class@0003b3
{
    public final String b;

    public void b(String p0){
       this.b = p0;
    }
    public final void run(){
       d.c("mini_ad_event", this.b);
    }
}
