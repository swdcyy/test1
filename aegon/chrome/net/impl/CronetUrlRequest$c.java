package aegon.chrome.net.impl.CronetUrlRequest$c;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequest;
import aegon.chrome.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;
import java.lang.Object;

public class CronetUrlRequest$c implements Runnable	// class@0001c8
{
    public final VersionSafeCallbacks$UrlRequestStatusListener b;
    public final CronetUrlRequest c;

    public void CronetUrlRequest$c(CronetUrlRequest p0,VersionSafeCallbacks$UrlRequestStatusListener p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.b.a(-1);
    }
}
