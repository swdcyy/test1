package aegon.chrome.net.d;
import java.lang.Object;
import java.net.URLStreamHandlerFactory;
import java.lang.String;
import aegon.chrome.net.q$b;
import java.util.concurrent.Executor;
import aegon.chrome.net.q$a;
import java.net.URL;
import java.net.URLConnection;

public abstract class d	// class@000094
{
    public static final String a = "d";

    public void d(){
       super();
    }
    public abstract URLStreamHandlerFactory a();
    public abstract byte[] b();
    public abstract String c();
    public abstract q$a d(String p0,q$b p1,Executor p2);
    public abstract URLConnection e(URL p0);
    public abstract void f();
    public abstract void g(String p0,boolean p1);
    public abstract void h();
}
