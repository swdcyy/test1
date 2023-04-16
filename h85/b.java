package h85.b;
import java.lang.Runnable;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import com.kwai.chat.kwailink.utils.EventReporter;

public final class b implements Runnable	// class@001730
{
    public final String b;
    public final String c;
    public final float d;
    public final Map e;

    public void b(String p0,String p1,float p2,Map p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       EventReporter.lambda$reportEvent$1(this.b, this.c, this.d, this.e);
    }
}
