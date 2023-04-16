package okhttp3.OkUrlFactory$1;
import java.net.URLStreamHandler;
import okhttp3.OkUrlFactory;
import java.lang.String;
import java.lang.Object;
import java.lang.AssertionError;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.net.Proxy;

public class OkUrlFactory$1 extends URLStreamHandler	// class@001f58
{
    public final OkUrlFactory this$0;
    public final String val$protocol;

    public void OkUrlFactory$1(OkUrlFactory p0,String p1){
       this.this$0 = p0;
       this.val$protocol = p1;
       super();
    }
    public int getDefaultPort(){
       if ((this.val$protocol).equals("http")) {
          return 80;
       }
       if ((this.val$protocol).equals("https")) {
          return 443;
       }
       throw new AssertionError();
    }
    public URLConnection openConnection(URL p0){
       return this.this$0.open(p0);
    }
    public URLConnection openConnection(URL p0,Proxy p1){
       return this.this$0.open(p0, p1);
    }
}
