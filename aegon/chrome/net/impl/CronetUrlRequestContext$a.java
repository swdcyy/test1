package aegon.chrome.net.impl.CronetUrlRequestContext$a;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import java.lang.Object;
import aegon.chrome.net.impl.CronetLibraryLoader;
import j0.g;
import aegon.chrome.net.impl.j;

public class CronetUrlRequestContext$a implements Runnable	// class@0000b7
{
    public final CronetUrlRequestContext b;

    public void CronetUrlRequestContext$a(CronetUrlRequestContext p0){
       this.b = p0;
       super();
    }
    public void run(){
       CronetLibraryLoader.b();
       j.a(new g(this));
    }
}
