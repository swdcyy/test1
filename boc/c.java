package boc.c;
import z3b.t0;
import java.util.Map;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.c;

public class c implements t0	// class@00043d
{
    public final Map a;

    public void c(Map p0){
       this.a = p0;
       super();
    }
    public void a(){
       c.c(this.a);
    }
    public void onFailed(){
       c.c(this.a);
    }
    public void onSuccess(){
       c.a(7, true, this.a);
    }
}
