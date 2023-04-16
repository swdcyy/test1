package okhttp3.internal.http.HttpMethod;
import java.lang.Object;
import java.lang.String;

public final class HttpMethod	// class@0020b8
{

    public void HttpMethod(){
       super();
    }
    public static boolean invalidatesCache(String p0){
       boolean b = (!p0.equals("POST") && (!p0.equals("PATCH") && (!p0.equals("PUT") && (p0.equals("DELETE") || p0.equals("MOVE")))))? true: false;
       return b;
    }
    public static boolean permitsRequestBody(String p0){
       boolean b = (!p0.equals("GET") && !p0.equals("HEAD"))? true: false;
       return b;
    }
    public static boolean redirectsToGet(String p0){
       return (p0.equals("PROPFIND") ^ 0x01);
    }
    public static boolean redirectsWithBody(String p0){
       return p0.equals("PROPFIND");
    }
    public static boolean requiresRequestBody(String p0){
       boolean b = (!p0.equals("POST") && (!p0.equals("PUT") && (!p0.equals("PATCH") && (p0.equals("PROPPATCH") || p0.equals("REPORT")))))? true: false;
       return b;
    }
}
