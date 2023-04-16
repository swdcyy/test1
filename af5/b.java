package af5.b;
import java.lang.Runnable;
import af5.a$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import af5.a;

public final class b implements Runnable	// class@000090
{
    public final a$b b;
    public final ClientEvent$ElementPackage c;
    public final ClientContent$ContentPackage d;

    public void b(a$b p0,ClientEvent$ElementPackage p1,ClientContent$ContentPackage p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.a.P8(this.c, this.d);
    }
}
