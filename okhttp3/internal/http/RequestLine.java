package okhttp3.internal.http.RequestLine;
import java.lang.Object;
import okhttp3.Request;
import java.net.Proxy$Type;
import java.lang.String;
import java.lang.StringBuilder;
import okhttp3.HttpUrl;

public final class RequestLine	// class@0020bb
{

    public void RequestLine(){
       super();
    }
    public static String get(Request p0,Proxy$Type p1){
       StringBuilder str = p0.method()+' ';
       str = (RequestLine.includeAuthorityInRequestLine(p0, p1))? str+p0.url(): str+RequestLine.requestPath(p0.url());
       return str+" HTTP/1.1";
    }
    public static boolean includeAuthorityInRequestLine(Request p0,Proxy$Type p1){
       boolean b = (!p0.isHttps() && p1 == Proxy$Type.HTTP)? true: false;
       return b;
    }
    public static String requestPath(HttpUrl p0){
       String str = p0.encodedPath();
       String str1 = p0.encodedQuery();
       if (str1 != null) {
          str = str+'?'+str1;
       }
       return str;
    }
}
