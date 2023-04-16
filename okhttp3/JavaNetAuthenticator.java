package okhttp3.JavaNetAuthenticator;
import okhttp3.Authenticator;
import java.lang.Object;
import okhttp3.Route;
import okhttp3.Response;
import okhttp3.Request;
import java.util.List;
import okhttp3.HttpUrl;
import java.net.Proxy;
import okhttp3.Challenge;
import java.lang.String;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import java.net.URL;
import java.net.Authenticator$RequestorType;
import java.net.PasswordAuthentication;
import java.net.Authenticator;
import java.nio.charset.Charset;
import okhttp3.Credentials;
import okhttp3.Request$Builder;
import java.net.Proxy$Type;

public final class JavaNetAuthenticator implements Authenticator	// class@001f4f
{

    public void JavaNetAuthenticator(){
       super();
    }
    public Request authenticate(Route p0,Response p1){
       PasswordAuthentication passwordAuth;
       String str;
       Request$Builder uBuilder;
       String str1;
       JavaNetAuthenticator javaNetAuthe = this;
       List list = p1.challenges();
       Request request = p1.request();
       HttpUrl httpUrl = request.url();
       int i = 0;
       int i1 = (p1.code() == 407)? 1: 0;
       Proxy proxy = p0.proxy();
       int i2 = list.size();
       while (true) {
          if (i >= i2) {
             return null;
          }
          Challenge uChallenge = list.get(i);
          if (("Basic").equalsIgnoreCase(uChallenge.scheme())) {
             if (i1) {
                InetSocketAddress inetSocketAd = proxy.address();
                passwordAuth = Authenticator.requestPasswordAuthentication(inetSocketAd.getHostName(), javaNetAuthe.getConnectToInetAddress(proxy, httpUrl), inetSocketAd.getPort(), httpUrl.scheme(), uChallenge.realm(), uChallenge.scheme(), httpUrl.url(), Authenticator$RequestorType.PROXY);
             }else {
                passwordAuth = Authenticator.requestPasswordAuthentication(httpUrl.host(), javaNetAuthe.getConnectToInetAddress(proxy, httpUrl), httpUrl.port(), httpUrl.scheme(), uChallenge.realm(), uChallenge.scheme(), httpUrl.url(), Authenticator$RequestorType.SERVER);
             }
             if (passwordAuth != null) {
                str = Credentials.basic(passwordAuth.getUserName(), new String(passwordAuth.getPassword()), uChallenge.charset());
                uBuilder = request.newBuilder();
                str1 = (i1)? "Proxy-Authorization": "Authorization";
                break ;
             }
          }
          i = i + 1;
       }
       return uBuilder.header(str1, str).build();
    }
    public final InetAddress getConnectToInetAddress(Proxy p0,HttpUrl p1){
       InetAddress address = (p0 != null && p0.type() != Proxy$Type.DIRECT)? p0.address().getAddress(): InetAddress.getByName(p1.host());
       return address;
    }
}
