package bo.l;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class l implements Runnable	// class@00031d
{
    public final String b;
    public final String c;

    public void l(String p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       Aegon.nativeAddExtraRequestHeader(this.b, this.c);
    }
}
