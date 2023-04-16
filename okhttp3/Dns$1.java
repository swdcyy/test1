package okhttp3.Dns$1;
import okhttp3.Dns;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.net.InetAddress;
import java.util.Arrays;
import java.net.UnknownHostException;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class Dns$1 implements Dns	// class@002071
{

    public void Dns$1(){
       super();
    }
    public List lookup(String p0){
       UnknownHostException unknownHostE;
       if (p0 != null) {
          return Arrays.asList(InetAddress.getAllByName(p0));
       }
       throw new UnknownHostException("hostname == null");
    }
}
