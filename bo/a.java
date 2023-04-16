package bo.a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class a implements Runnable	// class@000312
{
    public final String b;
    public final String[] c;
    public final String[] d;
    public final boolean e;

    public void a(String p0,String[] p1,String[] p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       Aegon.nativeSetPreconnectUrlsByIps(this.b, this.c, this.d, this.e, false);
    }
}
