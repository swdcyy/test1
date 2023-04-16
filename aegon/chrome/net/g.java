package aegon.chrome.net.g;
import aegon.chrome.net.d;
import java.lang.String;
import aegon.chrome.net.q$b;
import java.util.concurrent.Executor;
import aegon.chrome.net.q$a;
import aegon.chrome.net.h$a;
import aegon.chrome.net.b$b;
import aegon.chrome.net.f$a;
import java.net.URL;
import java.net.Proxy;
import java.net.URLConnection;

public abstract class g extends d	// class@000098
{

    public void g(){
       super();
    }
    public q$a d(String p0,q$b p1,Executor p2){
       return this.j(p0, p1, p2);
    }
    public abstract f$a i(String p0,b$b p1,Executor p2);
    public abstract h$a j(String p0,q$b p1,Executor p2);
    public URLConnection k(URL p0,Proxy p1){
       return p0.openConnection(p1);
    }
}
