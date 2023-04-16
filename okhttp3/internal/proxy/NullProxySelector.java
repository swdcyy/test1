package okhttp3.internal.proxy.NullProxySelector;
import java.net.ProxySelector;
import java.net.URI;
import java.net.SocketAddress;
import java.io.IOException;
import java.util.List;
import java.net.Proxy;
import java.lang.Object;
import java.util.Collections;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class NullProxySelector extends ProxySelector	// class@001fd1
{

    public void NullProxySelector(){
       super();
    }
    public void connectFailed(URI p0,SocketAddress p1,IOException p2){
    }
    public List select(URI p0){
       if (p0 != null) {
          return Collections.singletonList(Proxy.NO_PROXY);
       }
       throw new IllegalArgumentException("uri must not be null");
    }
}
