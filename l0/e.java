package l0.e;
import java.net.URLStreamHandler;
import aegon.chrome.net.g;
import java.net.URL;
import java.net.URLConnection;
import aegon.chrome.net.d;
import java.net.Proxy;

public class e extends URLStreamHandler	// class@0024e5
{
    public final g a;

    public void e(g p0){
       super();
       this.a = p0;
    }
    public URLConnection openConnection(URL p0){
       return this.a.e(p0);
    }
    public URLConnection openConnection(URL p0,Proxy p1){
       return this.a.k(p0, p1);
    }
}
