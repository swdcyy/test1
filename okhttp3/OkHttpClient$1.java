package okhttp3.OkHttpClient$1;
import okhttp3.internal.Internal;
import okhttp3.Headers$Builder;
import java.lang.String;
import okhttp3.ConnectionSpec;
import javax.net.ssl.SSLSocket;
import okhttp3.Response$Builder;
import okhttp3.ConnectionPool;
import okhttp3.internal.connection.RealConnection;
import okhttp3.Address;
import okhttp3.internal.connection.StreamAllocation;
import java.net.Socket;
import okhttp3.Route;
import java.lang.IllegalArgumentException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Call;
import okhttp3.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.OkHttpClient$Builder;
import okhttp3.internal.cache.InternalCache;
import java.io.IOException;

public class OkHttpClient$1 extends Internal	// class@002085
{

    public void OkHttpClient$1(){
       super();
    }
    public void addLenient(Headers$Builder p0,String p1){
       p0.addLenient(p1);
    }
    public void addLenient(Headers$Builder p0,String p1,String p2){
       p0.addLenient(p1, p2);
    }
    public void apply(ConnectionSpec p0,SSLSocket p1,boolean p2){
       p0.apply(p1, p2);
    }
    public int code(Response$Builder p0){
       return p0.code;
    }
    public boolean connectionBecameIdle(ConnectionPool p0,RealConnection p1){
       return p0.connectionBecameIdle(p1);
    }
    public Socket deduplicate(ConnectionPool p0,Address p1,StreamAllocation p2){
       return p0.deduplicate(p1, p2);
    }
    public boolean equalsNonHost(Address p0,Address p1){
       return p0.equalsNonHost(p1);
    }
    public RealConnection get(ConnectionPool p0,Address p1,StreamAllocation p2,Route p3){
       return p0.get(p1, p2, p3);
    }
    public boolean isInvalidHttpUrlHost(IllegalArgumentException p0){
       return (p0.getMessage()).startsWith("Invalid URL host");
    }
    public Call newWebSocketCall(OkHttpClient p0,Request p1){
       return RealCall.newRealCall(p0, p1, true);
    }
    public void put(ConnectionPool p0,RealConnection p1){
       p0.put(p1);
    }
    public RouteDatabase routeDatabase(ConnectionPool p0){
       return p0.routeDatabase;
    }
    public void setCache(OkHttpClient$Builder p0,InternalCache p1){
       p0.setInternalCache(p1);
    }
    public StreamAllocation streamAllocation(Call p0){
       return p0.streamAllocation();
    }
    public IOException timeoutExit(Call p0,IOException p1){
       return p0.timeoutExit(p1);
    }
}
