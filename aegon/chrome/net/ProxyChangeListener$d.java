package aegon.chrome.net.ProxyChangeListener$d;
import java.lang.String;
import java.lang.Object;
import android.net.ProxyInfo;
import android.net.Uri;

public class ProxyChangeListener$d	// class@0001a2
{
    public final String a;
    public final int b;
    public final String c;
    public final String[] d;
    public static final ProxyChangeListener$d e;

    static {
       String[] stringArray = new String[0];
       ProxyChangeListener$d.e = new ProxyChangeListener$d("", 0, "", stringArray);
    }
    public void ProxyChangeListener$d(String p0,int p1,String p2,String[] p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static ProxyChangeListener$d a(ProxyInfo p0){
       ProxyChangeListener$d uod = null;
       if (p0 == null) {
          return uod;
       }
       Uri pacFileUrl = p0.getPacFileUrl();
       String host = p0.getHost();
       int port = p0.getPort();
       if (!Uri.EMPTY.equals(pacFileUrl)) {
          uod = pacFileUrl.toString();
       }
       return new ProxyChangeListener$d(host, port, uod, p0.getExclusionList());
    }
}
